{ this is an include file to utftaobject.pas }

{ ############################################################################

  Copyright by Simon J. Schilling (the Author)
  Email: sjschilling@gmx.net
  Year: 2008 / 2009

  Free Software. Enjoy.

  This file is part of TFTASolver.

    TFTASolver is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TFTASolver is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TFTASolver.  If not, see <http://www.gnu.org/licenses/>.

  ############################################################################ }


{ ############################################################################ }
{ TTFTAEventLookupList }
{$IfDef TESTMODE}
  constructor TTFTAEventLookupList.Create(pointerToDebugMemo : TMemo);
{$Else}
  constructor TTFTAEventLookupList.Create;
{$EndIf}
begin
  inherited Create;
  {$IfDef TESTMODE}self.DEBUGMemo  := pointerToDebugMemo; {$EndIf}
  self.OwnsObjects:= true; { the EventLookupList owns objects (the objects.children - list does not! }

  { create the FALSE event }
  self.theFALSEprivate := self.NewItem(tftaEventTypeBASIC,     {   ET                    }
                                       true ,    {   BE                    }
                                       false,    {   CE                    }
                                       false,    {   ES                    }
                                       false,    {   XS                    }
                                       false,    {   NAT                   }
                                       true ,    {   NCE                   }
                                       false,    {   BAT                   }
                                       false,    {   MCSSForm              }
                                       false,    {   Disjunct              }
                                       false,    {   NotComplete           }
                                       false,    {   NeedsToBeUpdated      }
                                       NIL,      {   PointerToUpdateObject }
                                       BoolToString(false),    {   TemporalExpr          }
                                       false     {   LogicalValue          }    );
  { create the TRUE event }
  self.theTRUEprivate := self.NewItem( tftaEventTypeBASIC,     {   ET                    }
                                       true ,    {   BE                    }
                                       true ,    {   CE                    }
                                       true ,    {   ES                    }
                                       false,    {   XS                    }
                                       false,    {   NAT                   }
                                       false,    {   NCE                   }
                                       false,    {   BAT                   }
                                       false,    {   MCSSForm              }
                                       false,    {   Disjunct              }
                                       false,    {   NotComplete           }
                                       false,    {   NeedsToBeUpdated      }
                                       NIL,      {   PointerToUpdateObject }
                                       BoolToString(true),    {   TemporalExpr          }
                                       true     {   LogicalValue          }    );
  self.SpeedSearchFlagOn := false;
  ShowMessage(' TRUE:  ' + BoolToString(self.TheTRUEElement.IsTrue) +
              ' FALSE: ' + BoolToString(self.TheFALSEElement.IsFalse) );
end;
{------------------------------------------------------------------------------
  Class-Destructor
------------------------------------------------------------------------------}
destructor TTFTAEventLookupList.Destroy;
begin
  // nothing specific yet ...
  inherited Destroy;
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
function TTFTAEventLookupList.Add(Item: TTFTAObject): Integer;
begin
  Result := inherited Add(Item);
  Item.PosInEventList := Result;
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.Delete(Index : Integer);
var numberOfItems : Integer;
    i             : Integer;
begin
  if self.OwnsObjects then
    self[Index].Free;
  self.List.Delete(Index);
  { now decrement all TTFTAObject.PosInEventList of the objects after the deleted }
  i := Index;
  numberOfItems := self.Count;
  if i < numberOfItems then { there are no further objects after the last }
  begin
    repeat
      dec(self[i].PosInEventList);
      inc(i);
    until i = numberOfItems;
  end;
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
function TTFTAEventLookupList.FindIdenticalExisting(Item: TTFTAObject) : TTFTAObject;
var tempString : ansistring;
    SpeedSearchWasAlreadySet : boolean;
begin

  tempString := Item.TemporalExpr;

  //{$IfDef TESTMODE}Item.DEBUGPrint(true,self,'Entered FindIdenticalExisting');{$ENDIF}

  { temporarily mask the Item from the eventlist, in order to not find itself }
  Item.Mask;
  { set speedsearch and check whether it was already set }
  SpeedSearchWasAlreadySet := self.SpeedSearchFlagOn;
  self.SpeedSearchFlagOn := true;
  { now look whether there is another object with the same TemporalExpr }
  Result := self.FindIdenticalExisting(tempString);
  {$IfDef TESTMODE}if assigned(Result) then Item.DEBUGPrint(true,self,'(FindIdenticalExisting) equals ' + PointerAddrStr(Result));{$ENDIF}
  { unmask the Item at old position }
  Item.Unmask;

  { if speedsearch was not set before, reset it, else hold it }
  self.SpeedSearchFlagOn := SpeedSearchWasAlreadySet;
end;

{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
function  TTFTAEventLookupList.FindIdenticalExisting(Text : ansistring) : TTFTAObject;
var i : Integer;
    numberOfItems : Integer;
    SpeedSearchWasAlreadySet : boolean;
begin
  i := 0;
  numberOfItems := self.Count;

  { set speedsearch and check whether it was already set }
  SpeedSearchWasAlreadySet := self.SpeedSearchFlagOn;
  self.SpeedSearchFlagOn := true;

  { for each child do compare and return first match, if any }
  repeat
    if (AnsiCompareStr(Text,self[i].TemporalExpr) <> 0) then
      Result := nil
    else
      Result := self[i];
    inc(i);
  until Assigned(Result) or (i = numberOfItems);

  { if speedsearch was not set before, reset it, else hold it }
  self.SpeedSearchFlagOn := SpeedSearchWasAlreadySet;
end;

{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.FreeTerm(theTerm : TTFTAObject);
begin
  {$IfDef TESTMODE}theTerm.DEBUGPrint(true,self,'FreeTerm');{$ENDIF}
  self.Delete(theTerm.PosInEventList);
end;

{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
function TTFTAEventLookupList.GetItem(Index: Integer): TTFTAObject;
begin
  Result := TTFTAObject(inherited Items[Index]);
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.Insert(Index: Integer; Item: TTFTAObject);
begin
  inherited Insert(Index, Item);
end;

{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
function TTFTAEventLookupList.NewItem: TTFTAObject;
begin
  Result:=
    self.NewItem(tftaEventTypeOTHER,     {   ET                    }
                 false,                  {   BE                    }
                 false,                  {   CE                    }
                 false,                  {   ES                    }
                 false,                  {   XS                    }
                 false,                  {   NAT                   }
                 false,                  {   NCE                   }
                 false,                  {   BAT                   }
                 false,                  {   MCSSForm              }
                 false,                  {   Disjunct              }
                 false,                  {   NotComplete           }
                 false,                  {   NeedsToBeUpdated      }
                 NIL,                    {   PointerToUpdateObject }
                 'DUMMY',                {   TemporalExpr          }
                 NIL                     {   LogicalValue          }    );
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
{ public: version with options and true/false as logical value }
function TTFTAEventLookupList.NewItem (ET                        : TTFTAOperatorType;
                                       BE                        : boolean;
                                       CE                        : boolean;
                                       ES                        : boolean;
                                       XS                        : boolean;
                                       NAT                       : boolean;
                                       NCE                       : boolean;
                                       BAT                       : boolean;
                                       MCSSForm                  : boolean;
                                       Disjunct                  : boolean;
                                       NotComplete               : boolean;
                                       NeedsToBeUpdated          : boolean;
                                       PointerToUpdateObject     : TTFTAObject;
                                       TemporalExpr              : ansistring;
                                       LogicalValue              : boolean
                                      ) : TTFTAObject;
begin
  Result:= self.NewItemPrivate(ET                        ,
                               BE                        ,
                               CE                        ,
                               ES                        ,
                               XS                        ,
                               NAT                       ,
                               NCE                       ,
                               BAT                       ,
                               MCSSForm                  ,
                               Disjunct                  ,
                               NotComplete               ,
                               NeedsToBeUpdated          ,
                               PointerToUpdateObject     ,
                               TemporalExpr              );
  Result.SetLogicalValue(LogicalValue);
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
{ public version with options and NIL as logical value }
function TTFTAEventLookupList.NewItem (ET                        : TTFTAOperatorType;
                                       BE                        : boolean;
                                       CE                        : boolean;
                                       ES                        : boolean;
                                       XS                        : boolean;
                                       NAT                       : boolean;
                                       NCE                       : boolean;
                                       BAT                       : boolean;
                                       MCSSForm                  : boolean;
                                       Disjunct                  : boolean;
                                       NotComplete               : boolean;
                                       NeedsToBeUpdated          : boolean;
                                       PointerToUpdateObject     : TTFTAObject;
                                       TemporalExpr              : ansistring;
                                       LogicalValue              : pointer
                                      ) : TTFTAObject;
begin
  Result:= self.NewItemPrivate(ET                        ,
                               BE                        ,
                               CE                        ,
                               ES                        ,
                               XS                        ,
                               NAT                       ,
                               NCE                       ,
                               BAT                       ,
                               MCSSForm                  ,
                               Disjunct                  ,
                               NotComplete               ,
                               NeedsToBeUpdated          ,
                               PointerToUpdateObject     ,
                               TemporalExpr              );
  Result.SetLogicalValue(NIL);
end;
{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
{ private (generic) version}
function TTFTAEventLookupList.NewItemPrivate(ET                        : TTFTAOperatorType;
                                             BE                        : boolean;
                                             CE                        : boolean;
                                             ES                        : boolean;
                                             XS                        : boolean;
                                             NAT                       : boolean;
                                             NCE                       : boolean;
                                             BAT                       : boolean;
                                             MCSSForm                  : boolean;
                                             Disjunct                  : boolean;
                                             NotComplete               : boolean;
                                             NeedsToBeUpdated          : boolean;
                                             PointerToUpdateObject     : TTFTAObject;
                                             TemporalExpr: ansistring) : TTFTAObject;
var posInList: Integer = 0;
begin
  posInList := self.Add(TTFTAObject.Create);
  Result := self[posInList];
  Result.EventLookupList := self;
  Result.EventType                  :=  ET                        ;
  Result.IsCoreEvent                :=  CE                        ;
  Result.IsEventSequence            :=  ES                        ;
  Result.IsExtendedSequence         :=  XS                        ;
  Result.IsNegatedANDTerm           :=  NAT                       ;
  Result.IsNegatedCoreEvent         :=  NCE                       ;
  REsult.IsBasicANDTerm             :=  BAT                       ;
  Result.IsMCSSForm                 :=  MCSSForm                  ;
  Result.IsDisjunctTerm             :=  Disjunct                  ;
  Result.IsNotCompletelyBuildYet    :=  NotComplete               ;
  Result.IsSorted                   :=  False                     ;
  Result.NeedsToBeUpdated           :=  NeedsToBeUpdated          ;
  Result.PointerToUpdateObject      :=  PointerToUpdateObject     ;
  Result.PosInEventList             :=  posInList                 ;
  Result.TemporalExpr               :=  TemporalExpr              ;
  Result.SetIsBasicEvent(BE)                                      ;
  {$IfDef TESTMODE}Result.DEBUGMemo :=  self.DEBUGMemo            ;     {$EndIf}
end;

{------------------------------------------------------------------------------
  replace a term in eventlist:
  free the oldterm and replace it by newterm
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.Replace(var oldTerm : TTFTAObject; newTerm : TTFTAObject);
begin
  self.FreeTerm(oldTerm);
  oldTerm := newTerm;
end;

{------------------------------------------------------------------------------
  replace a term in eventlist with an identical alreay existing (if there is one)
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.ReplaceWithIdentical(var oldTerm : TTFTAObject);
var existingTerm : TTFTAObject;
begin
  existingTerm := self.FindIdenticalExisting(oldTerm);
  if Assigned(existingTerm) then
  begin
    self.Replace(oldTerm,existingTerm);
    {$IfDef TESTMODE}oldTerm.DEBUGPrint(true,self,'(ReplaceWithIdentical) ' + PointerAddrStr(oldTerm) + ' -> ' + PointerAddrStr(existingTerm));{$ENDIF}
  end;
end;

{------------------------------------------------------------------------------
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.SetItem(Index: Integer; Item: TTFTAObject);
begin
  inherited Items[Index] := Item;
end;

{------------------------------------------------------------------------------
  if set to false: run through all listed objects and unset their TTFTAObject.SpeedSearchIsSet
------------------------------------------------------------------------------}
procedure TTFTAEventLookupList.SetSpeedSearchFlagOn(SetTo : boolean);
var i : Integer = 0;
    numberOfItems : Integer;
begin
  self.VSpeedSearchFlagOn := SetTo;

  if SetTo = false then
  begin
    numberOfItems := self.Count;
    repeat
      self[i].SpeedSearchIsSet := False;
      inc(i);
    until i = numberOfItems;
  end;
end;

// [include file EOF]
