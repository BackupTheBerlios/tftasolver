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
{ TTFTAObject }

{ this document is structured as follows:
  AAA - routines concerning core operations on TTFTAObject like Create or Clone
  BBB - routines handling vital properties of TTFTAObject like GetExpr or Count
  CCC - routines checking term type properties like IsBasicEvent
  DDD - routines setting term type properties like SetIsBAsicEvent
  EEE - routines covering operations on children like AddChild
  FFF - routines checking properties on children like GetChildrenBasicState
  ZZZ - routines for debugging needs
  }

{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA AAA
 routines concerning core operations on TTFTAObject
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  AAA
  Class-Constructor
------------------------------------------------------------------------------}
constructor TTFTAObject.Create;
begin

  inherited Create;
  self.Children := TTFTAList.Create;
  self.Children.OwnsObjects:=False;     { the EventLookupList owns objects
                                         (the objects.children - list does not! }
  self.Children.Owner := self;          { pointer to object, needed for updates of
                                     object initiate by one of the children }
  self.PointerToUpdateObject := NIL;
  self.NeedsToBeUpdated := false;
  self.SpeedSearchIsSet := false;
  self.IsNotCompletelyBuildYet := false;
  self.VExpr:='NIL';                    { dummy value in order to not get exceptions }

end;
{------------------------------------------------------------------------------
  AAA
  makes a clone of the TTFTAObjectœ
------------------------------------------------------------------------------}
function  TTFTAObject.Clone(list : TTFTAEventLookupList) : TTFTAObject;
begin
  if self.LogicLevel = -1 then
    Result := list.NewItem(self.EventType,               {   ET                    }
                           self.IsBasicEvent,            {   BE                    }
                           self.IsCoreEvent,             {   CE                    }
                           self.IsEventSequence,         {   ES                    }
                           self.IsExtendedSequence,      {   XS                    }
                           self.IsNegatedANDTerm,        {   NAT                   }
                           self.IsNegatedCoreEvent,      {   NCE                   }
                           self.IsBasicANDTerm,          {   BAT                   }
                           self.IsMCSSForm,              {   MCSSForm              }
                           self.IsDisjunctTerm,          {   Disjunct              }
                           self.IsNotCompletelyBuildYet, {   NotComplete           }
                           self.NeedsToBeUpdated,        {   NeedsToBeUpdated      }
                           self.PointerToUpdateObject,   {   PointerToUpdateObject }
                           self.TemporalExpr,            {   TemporalExpr          }
                           NIL                           )
  else
    Result := list.NewItem(self.EventType,               {   ET                    }
                           self.IsBasicEvent,            {   BE                    }
                           self.IsCoreEvent,             {   CE                    }
                           self.IsEventSequence,         {   ES                    }
                           self.IsExtendedSequence,      {   XS                    }
                           self.IsNegatedANDTerm,        {   NAT                   }
                           self.IsNegatedCoreEvent,      {   NCE                   }
                           self.IsBasicANDTerm,          {   BAT                   }
                           self.IsMCSSForm,              {   MCSSForm              }
                           self.IsDisjunctTerm,          {   Disjunct              }
                           self.IsNotCompletelyBuildYet, {   NotComplete           }
                           self.NeedsToBeUpdated,        {   NeedsToBeUpdated      }
                           self.PointerToUpdateObject,   {   PointerToUpdateObject }
                           self.TemporalExpr,            {   TemporalExpr          }
                           self.IsTrue                   );
  Result.Children.Assign(self.Children);
  Result.IsSorted        := self.IsSorted;
  Result.EventLookupList := self.EventLookupList;
end;
{------------------------------------------------------------------------------
  AAA
  Class-Destructor
------------------------------------------------------------------------------}
destructor TTFTAObject.Destroy;
begin
  // nothing specific yet...
  inherited Destroy;
end;
{------------------------------------------------------------------------------
  AAA
  Mask the TTFTAObject (= ignore while searching through eventlist)
------------------------------------------------------------------------------}
procedure TTFTAObject.Mask;
begin
  self.VIsMasked := true;
end;
{------------------------------------------------------------------------------
  AAA
  Redirects (updates) object to newItem and sets properties accordingly
------------------------------------------------------------------------------}
procedure TTFTAObject.RedirectMe(newItem : TTFTAObject);
begin
  self.PointerToUpdateObject:=newItem;
  self.EventType := tftaEventTypeBASIC;
  if assigned(self.Children) then self.Children.Clear;
  self.TemporalExpr := 'redirected to ' + PointerAddrStr(newItem);
  self.NeedsToBeUpdated:=true;
end;
{------------------------------------------------------------------------------
  AAA
  Unmask the TTFTAObject (= no longer ignore it while searching through eventlist)
------------------------------------------------------------------------------}
procedure TTFTAObject.Unmask;
begin
  self.VIsMasked := false;
end;

{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB BBB
 routines handling vital properties of TTFTAObject like GetExpr or Count
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  BBB
  true if operatortype = AND
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeAND : boolean;
begin
  Result := (self.EventType = tftaEventTypeAND);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = BASIC
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeBASIC : boolean;
begin
  Result := (self.EventType = tftaEventTypeBASIC);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = NOT
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeNOT : boolean;
begin
  Result := (self.EventType = tftaEventTypeNOT);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = PAND
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypePAND : boolean;
begin
  Result := (self.EventType = tftaEventTypePAND);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = OR
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeOR : boolean;
begin
  Result := (self.EventType = tftaEventTypeOR);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = OTHER
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeOTHER : boolean;
begin
  Result := (self.EventType = tftaEventTypeOTHER);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = SAND
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeSAND : boolean;
begin
  Result := (self.EventType = tftaEventTypeSAND);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = TOP
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeTOP : boolean;
begin
  Result := (self.EventType = tftaEventTypeTOP);
end;
{------------------------------------------------------------------------------
  BBB
  true if operatortype = XOR
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsTypeXOR : boolean;
begin
  Result := (self.EventType = tftaEventTypeXOR);
end;
{------------------------------------------------------------------------------
  BBB
  Number of children
------------------------------------------------------------------------------}
function TTFTAObject.Count : Integer;
begin
  if Assigned(self.Children) then
    Result := self.Children.Count
  else
    Result := 0;
end;
{------------------------------------------------------------------------------
  BBB
  Return operator type as string
------------------------------------------------------------------------------}
function TTFTAObject.EventTypeToString : string;
begin
  { if term is outdated, get type of redirection-term }
  if not self.NeedsToBeUpdated then
    Result := cEventTypeStringArray[ord(self.EventType)]  { get own }
  else
    Result := self.PointerToUpdateObject.EventTypeToString;  { get of redirection }
end;
{------------------------------------------------------------------------------
  BBB
  Reads VPointerToUpdateObject, but if the object that VPointerToUpdateObject
  points to itself has NeedsToBeUpdated set, then return
  VPointerToUpdateObject.GetPointerToUpdateObject
------------------------------------------------------------------------------}
function TTFTAObject.GetPointerToUpdateObject : TTFTAObject;
begin
  Result := self.VPointerToUpdateObject;
  if Assigned(Result) and (Result.NeedsToBeUpdated) then
  begin
    Result := Result.VPointerToUpdateObject;
    self.RedirectMe(Result.VPointerToUpdateObject);
  end;
end;
{------------------------------------------------------------------------------
  BBB
  Provides the logical expression represented by the term / object
  Scanns through all descendants, which is time consuming
  use with care and as seldom as possible
------------------------------------------------------------------------------}
function TTFTAObject.GetTempExpr : ansistring;
var i                : Integer;
    numberOfChildren : Integer;
    tempObject       : TTFTAObject;
    tempString       : ansistring;
    maskedByChild    : boolean = False;
begin
  { for all parts concerning the scanning and changing of TTFTAObject.IsSorted
    within this function see the algorithm documentation (look for "sorting") }

  { check masking state }
  if self.VIsMasked then
  begin
    Result := 'IaMaMaSk';
    exit;
  end;

  { first check for speed search set, if so, then take the string stored in VExpr (=PlainTemporalExpr) }
  if self.SpeedSearchIsSet then
  begin
    Result := self.PlainTemporalExpr;
    exit;
  end;

  { second check, whether event is still in the build-process }
  if self.IsNotCompletelyBuildYet then
  begin
    Result := ''; { if object is just in built-up then it has no TempExpr (because it is still changing) }
    exit;
  end;

  { third check, whether event is basic event or event is outdated }
  if self.NeedsToBeUpdated or self.IsBasicEvent then
  begin
    { Name of basic event is stored in VExpr at creation of basic event }
    Result := self.PlainTemporalExpr;
    exit;
  end;

  { forth check, whether event is NOT or TOP event (both with only one child) }
  if self.IsTypeNOT or self.IsTypeTOP then
  begin
    tempObject := self[0];
    if assigned(tempObject) then
      Result := self.EventTypeToString + '[' + tempObject.TemporalExpr + ']'
    else
      ShowMessage('Fatal Error (081227.1555) while processing event ' + PointerAddrStr(self) + ': NOT term without child ?');
  end else
  begin
    if not ( self.IsTypeAND or self.IsTypePAND or self.IsTypeSAND or self.IsTypeOR or self.IsTypeXOR ) then
      ShowMessage('Fatal Error (081227.1600) while processing event ' + PointerAddrStr(self) + ': No basic event, NOT, AND, OR, XOR, PAND, SAND?');
    { being here without error implies that self.Count > 1 }
    { now scan through the children }
    i := 0;
    numberOfChildren := self.Count;

    if numberOfChildren < 2 then
      ShowMessage('Fatal Error (081227.1608) while processing event ' + PointerAddrStr(self) + ': AND, OR, XOR, PAND, SAND without >1 children?');

    Result := '';
    repeat
      tempString := self[i].TemporalExpr;
      if AnsiCompareStr(tempString,'IaMaMaSk') <> 0 then
      begin
        Result := Result + ',' + tempString;
        inc(i);
      end else
      begin
        maskedByChild := True;
        Result := 'IaMaMaSk';
      end;
    until maskedByChild or (i = numberOfChildren);
    if not maskedByChild then
    begin
      Result[1] := '[';
      Result := self.EventTypeToString + Result + ']';
    end;
  end;

  { if eventlist is in speedsearch mode, but self is not then set the flag and
    store REsult for quicker future searches }
  if self.EventLookupList.SpeedSearchFlagOn and not maskedByChild then
  begin
    { this implies that self.SpeedSearchIsSet is still false, see first check above }
    self.SpeedSearchIsSet := true;
    self.TemporalExpr := Result;
  end;

end;
{------------------------------------------------------------------------------
  BBB
  True, if there are entries in Children, false otherwise
------------------------------------------------------------------------------}
function TTFTAObject.HasChildren : boolean;
begin
  Result := (self.Count > 0);
end;
{------------------------------------------------------------------------------
  BBB
  Set the TTFTAObject's logical value to either True (1) or False (0) or NIL (see below)
------------------------------------------------------------------------------}
procedure TTFTAObject.SetLogicalValue (Parameter : boolean);
begin
  if Parameter then
  begin
    self.VIsTrueFalse := 1;
    self.SetIsBasicEvent(true);
  end else
  begin
    self.VIsTrueFalse := 0;
    self.IsNegatedCoreEvent:=true;
  end;
  self.TemporalExpr:=BoolToString(Parameter);
end;
{------------------------------------------------------------------------------
  BBB
  Set the TTFTAObject's logical value NIL (-1)
------------------------------------------------------------------------------}
procedure TTFTAObject.SetLogicalValue (Parameter : pointer);
begin
  if not Assigned(Parameter) then
    self.VIsTrueFalse := -1;
end;
{------------------------------------------------------------------------------
  BBB
  Set the string describing the logical expression
------------------------------------------------------------------------------}
procedure TTFTAObject.SetTempExpr(theExpr : ansistring);
begin
  self.VExpr:=theExpr;
end;
{------------------------------------------------------------------------------
  BBB
  Set the operatortype
------------------------------------------------------------------------------}
procedure TTFTAObject.SetVType(Parameter : TTFTAOperatorType);
begin
  self.VType := Parameter;
  if self.IsTypeBASIC then self.SetIsBasicEvent(true);
end;

{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC CCC
 routines checking term type properties like IsBasicEvent
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  CCC
  True if operator type = BASIC and self has no children  (=BE)
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsBasicEvent : boolean;
begin
  Result := self.IsTypeBASIC {and (not self.HasChildren)};
end;
{------------------------------------------------------------------------------
  CCC
  True if commutative term
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsCommutative : boolean;
begin
  Result := ( not self.IsTypePAND ) and ( self.HasChildren );
end;
{------------------------------------------------------------------------------
  CCC
  True if EventSequence with Negated           (= NES)
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsEventSequenceWithNegated : boolean;
begin
  Result := (self.IsTypeAND)             and
            (self.Count = 2)             and
            (self[0].IsNegatedCoreEvent) and
            (self[1].IsEventSequence);
end;
{------------------------------------------------------------------------------
  CCC
  True if ExtendedSequence with Negated Events (= NXS)
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsExtendedSequenceWithNegated : boolean;
begin
  Result := (self.IsTypeAND)              and
            (self.Count = 2)              and
            (not self[1].IsEventSequence) and { if ES then it is not XS! }
            (self[0].IsNegatedCoreEvent)  and
            (self[1].IsExtendedSequence);
end;
{------------------------------------------------------------------------------
  CCC
  True if negated
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsNegated : boolean;
begin
  Result := self.IsNegatedAtomicEvent or
            self.IsNegatedANDTerm     or
            self.IsNegatedCoreEvent   or
            self.IsFalse;
end;
{------------------------------------------------------------------------------
  CCC
  True if negation of an basic event (aka atomic event)  (= NAE)
------------------------------------------------------------------------------}
function TTFTAObject.CheckIsNegatedAtomicEvent : boolean;
begin
  Result := self.IsTypeNOT and self[0].IsBasicEvent;
  { do not call TTFTAObject.IsNegated because of endless loop }
end;
{------------------------------------------------------------------------------
  CCC
  True if the FALSE element (set at creation via TTFTAObject.LogicLevel)
------------------------------------------------------------------------------}
function TTFTAObject.CheckLogicFalse : boolean;
begin
  Result := (self.LogicLevel = 0);
end;
{------------------------------------------------------------------------------
  CCC
  True if the TRUE element (set at creation via TTFTAObject.LogicLevel)
------------------------------------------------------------------------------}
function TTFTAObject.CheckLogicTrue : boolean;
begin
  Result := (self.LogicLevel = 1);
end;

{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD DDD
 routines setting term type properties like SetIsBAsicEvent
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  DDD
  check whether self is made of disjunct children and is either OR or XOR
  (sets self.IsDisjunctTerm)
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForDisjunctEvent;
begin
  { nothing right now }
end;
{------------------------------------------------------------------------------
  DDD
  Check whether self is a Basic AND Term  (=BAT)
  (sets self.IsBasicANDTerm )
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsBasicANDTerm;
var i                : Integer;
    numberOfChildren : Integer;
begin
  self.IsBasicANDTerm := False;
  if self.IsTypeAND then
  begin
    i := 0;
    numberOfChildren := self.Count;
    repeat
      self.IsBasicANDTerm := (not self[i].IsNegated) and self[i].IsBasicEvent;
      inc(i);
    until (not self.IsBasicANDTerm) or (i = numberOfChildren);
  end;
end;
{------------------------------------------------------------------------------
  DDD
  check whether self is a core event         (= CE)
  (sets self.IsCoreEvent, self.IsNegated)
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsCoreEvent;
var isCE             : boolean = false;
    i                : integer;
    numberOfChildren : integer;
begin
  { self is a core event iff either:
    it is a basic event or
    it is a SAND term with only non-negated basic events as children
    it is TRUE }
  If ( self.IsBasicEvent and (not self.IsFalse) ) then
  begin
    isCE := true;
  end else
  begin
    if ( self.IsTypeSAND ) then
    begin
      i := 0;
      numberOfChildren := self.Count;
      repeat
        isCE := ( self[i].IsBasicEvent and (not self[i].IsFalse) );
        inc(i);
      until (not isCE) or (i = numberOfChildren);
    end;
  end;
  self.IsCoreEvent := isCE;
end;
{------------------------------------------------------------------------------
  DDD
  check whether self is a EventSequence       (= ES)
  (sets self.IsEventSequence)
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsEventSequenceEvent;
var i                   : Integer;
    numberOfChildren    : Integer;
begin
  { self is a non-extended event sequence iff
    - self is a CE or
    - self is a PAND Term consisting exclusively of CEs or
    - self is a PAND Term with a ES as first child and CEs as other children. }
  self.IsEventSequence := false; { default }
  if ( self.IsCoreEvent ) then
  begin
    self.IsEventSequence := true;
  end else
  begin
    if ( self.IsTypePAND and self[0].IsEventSequence ) then { includes first child being CE, BE }
    begin
      i := 1;
      numberOfChildren := self.Count;
      repeat
        self.IsEventSequence := self[i].IsCoreEvent;
        inc(i);
      until (not self.IsEventSequence) or (i = numberOfChildren);
    end;
  end;
end;
{------------------------------------------------------------------------------
  DDD
  check whether self is an extended EventSequence  (= XS)
  (sets self.IsExtendedSequence)
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsExtendedSequenceEvent;
var i                      : Integer;
    numberOfChildren       : Integer;
begin
  self.IsExtendedSequence := false; { default }
  if ( not self.IsEventSequence ) then { if ES, then it must not be labeld as XS, too }
  begin
    if ( self.IsBasicANDTerm ) then
    begin
      self.IsExtendedSequence := true;
    end else
    begin
      if ( self.IsTypePAND and
           ( self[0].IsEventSequence or self[0].IsExtendedSequence )
         ) then { includes first child being BAT, CE, BE }
      begin
        i := 1;
        numberOfChildren := self.Count;
        repeat
          self.IsExtendedSequence := ( self[i].IsBasicANDTerm or self[i].IsCoreEvent );
          inc(i);
        until (not self.IsExtendedSequence) or (i = numberOfChildren);
      end;
    end;
  end;
end;
{------------------------------------------------------------------------------
  DDD
  Check whether self is a MCSS
  (sets IsMCSSForm )
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsMCSS;
var i : integer;
    numberOfChildren : integer;
begin
  //if self.IsBasicEvent       or
     //self.IsEventSequence    or
     //self.IsExtendedSequence then
  //begin
    //Result := True;
  //end else
  //begin
    //Result := self.IsTypeOR or self.IsTypeXOR;
    //i := 0;
    //numberOfChildren := self.Count;
    //repeat
      //Result := Result and ( self[i].IsEventSequence or self[i].IsExtendedSequence );
      //inc(i);
    //until (not Result) or (i = numberOfChildren);
  //end;
end;
{------------------------------------------------------------------------------
  DDD
  Check whether self is a negated AND Term (= NAT)
  (sets self.IsNegatedANDTerm )
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsNegatedANDTerm;
var i                : Integer;
    numberOfChildren : Integer;
begin
  self.IsNegatedANDTerm := False;
  if self.IsTypeAND then
  begin
    i := 0;
    numberOfChildren := self.Count;
    repeat
      self.IsNegatedANDTerm := self[i].IsNegatedAtomicEvent;
      inc(i);
    until (not self.IsNegatedANDTerm) or (i = numberOfChildren );
  end;
end;
{------------------------------------------------------------------------------
  DDD
  check whether self is a negated core event         (= NCE)
  (sets self.IsNegatedCoreEvent)
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckForIsNegatedCoreEvent;
begin
  { self is a negated core event iff either:
    - it is a negated atomic event (NAE) or
    - it is a negated AND term (NAT)
    - it is FALSE  }
  if ( self.IsFalse              or
       self.IsNegatedAtomicEvent or
       self.IsNegatedANDTerm        ) then
  begin
    self.IsNegatedCoreEvent := true;
  end;
end;
{------------------------------------------------------------------------------
  DDD
  Check what type of term self is and set flags accordingly
  This one is called after modification of terms and calls other DDD routines
------------------------------------------------------------------------------}
procedure TTFTAObject.CheckTermProperties;
begin
    self.CheckForIsCoreEvent;               { check CE  }
    self.CheckForIsNegatedCoreEvent;        { check NCE }
    self.CheckForIsBasicANDTerm;            { check BAT }
    self.CheckForIsNegatedANDTerm;          { check NAT }
    self.CheckForIsEventSequenceEvent;      { check ES  }
    self.CheckForIsExtendedSequenceEvent;   { check XS  }
    self.CheckForDisjunctEvent;
    { a direct check whether the term is negated or not is not necessary as this
      property is set directly while creating each negated object }
end;
{------------------------------------------------------------------------------
  DDD
  set IsBasicEvent and properties accordingly
------------------------------------------------------------------------------}
procedure TTFTAObject.SetIsBasicEvent (Parameter : boolean);
begin
  if Parameter and (not self.IsFalse) then
  begin
    self.IsCoreEvent:=true;
    self.IsEventSequence:=true;
    self.VType := tftaEventTypeBASIC;
  end;
end;

{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE EEE
 routines covering operations on children like AddChild
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  EEE
  Add an entry in Children
------------------------------------------------------------------------------}
function TTFTAObject.AddChild(Item : TTFTAObject) :Integer;
begin
  if Assigned(self.Children) then Result := self.Children.Add(Item);
end;
{------------------------------------------------------------------------------
  EEE
  Assign Children
------------------------------------------------------------------------------}
procedure TTFTAObject.AssignChildren(Obj: TTFTAList);
begin
  if Assigned(self.Children) then self.Children.Assign(Obj);
end;
{------------------------------------------------------------------------------
  EEE
  Delete a child
------------------------------------------------------------------------------}
procedure TTFTAObject.DeleteChild(Index: Integer);
begin
  if Assigned(self.Children) then self.Children.Delete(Index);
end;
{------------------------------------------------------------------------------
  EEE
  Extract a child
------------------------------------------------------------------------------}
function TTFTAObject.ExtractChild(Item: TTFTAObject):TTFTAObject;
begin
  if Assigned(self.Children) then
    Result := self.Children.Extract(Item)
  else
    Result := NIL;
end;
{------------------------------------------------------------------------------
  EEE
  Returns child nr. Index
------------------------------------------------------------------------------}
function TTFTAObject.GetChild(Index: Integer): TTFTAObject;
begin
  if Assigned(self.Children) then
    Result := self.Children[Index]
  else
    Result := NIL;
end;
{------------------------------------------------------------------------------
  EEE
  Insert a new child (Item) at pos Index
------------------------------------------------------------------------------}
procedure TTFTAObject.InsertChild(Index: Integer; Item: TTFTAObject);
begin
  if Assigned(self.Children) then self.Children.Insert(Index, Item);
end;
{------------------------------------------------------------------------------
  EEE
  Calls Children.Remove(Item)
------------------------------------------------------------------------------}
function TTFTAObject.RemoveChild(Item : TTFTAObject) : Integer;
begin
  if Assigned(self.Children) then
    Result := self.Children.Remove(Item)
  else
    Result :=0;
end;
{------------------------------------------------------------------------------
  EEE
  Set child nr. Index to Item
------------------------------------------------------------------------------}
procedure TTFTAObject.SetChild(Index: Integer; Item: TTFTAObject);
begin
  if Assigned(self.Children) then self.Children[Index] := Item;
end;


{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF FFF
 routines checking properties on children like GetChildrenBasicState
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  FFF
  True, if there are Children matching form depending on handleNegated:
    handleNegated=0 : negated atomic terms and or basic events and or TRUE / FALSE
    handleNegated=-1: basic events and or TRUE
    handleNegated=1 : negated atomic terms and or FALSE
------------------------------------------------------------------------------}
function  TTFTAObject.GetChildrenBasicState(handleNegated : integer = 0) : boolean;
var i                : Integer;
    numberOfChildren : Integer;
begin
  if (not self.HasChildren) then
  begin
    Result := False; { no children -> children cant be basic events }
    exit;
  end;
  Result := True; { Default }
  i := 0;
  numberOfChildren := self.count;
  if handleNegated = 0 then { allow negated but do not force them }
  begin
    repeat
      Result := Result and (self[i].IsBasicEvent);
      inc(i);
    until (not Result) or (i = numberOfChildren);
  end;
  if handleNegated = -1 then { do not allow negated }
  begin
    repeat
      Result := Result and (self[i].IsBasicEvent) and (not self[i].IsNegated);
      inc(i);
    until (not Result) or (i = numberOfChildren);
  end;
  if handleNegated = 1 then { force negated }
  begin
    repeat
      Result := Result and (self[i].IsBasicEvent) and (self[i].IsNegated);
      inc(i);
    until (not Result) or (i = numberOfChildren);
  end;
end;

{------------------------------------------------------------------------------
 ------------------------------------------------------------------------------
 ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ ZZZ
 routines for debugging needs
 ------------------------------------------------------------------------------
 -----------------------------------------------------------------------------}

{------------------------------------------------------------------------------
  ZZZ
  Debug PRint information on TTFTAObject to DEBUGMemo (if assigned)
------------------------------------------------------------------------------}
{$IfDef TESTMODE}
procedure TTFTAObject.DEBUGPrint(isUpdate : boolean; eventlist : TTFTAEventLookupList; thestring : ansistring = '');
begin
  if Assigned(self.DEBUGMemo) then
    if isUpdate then
    begin
      self.DEBUGMemo.Append(thestring + 'Update: ' + PointerAddrStr(self) + ' ::: ' + self.GetTempExprDEBUG );
    end else
    begin
      self.DEBUGMemo.Append(thestring + 'New   : ' + PointerAddrStr(self) + ' ::: ' + self.GetTempExprDEBUG ) ;
    end;
  eventlist.pointerToApplication.ProcessMessages;
end;
{$EndIf}
{------------------------------------------------------------------------------
  ZZZ
  Debug Version of GetTempExpr, which does not interfere with the term itself
------------------------------------------------------------------------------}
function TTFTAObject.GetTempExprDEBUG : ansistring;
var i                : Integer;
    numberOfChildren : Integer;
    tempObject       : TTFTAObject;
    tempString       : ansistring;
begin
  if self.VIsMasked then
  begin
    Result := 'IaMaMaSk';
    exit;
  end;
  if self.IsNotCompletelyBuildYet then
  begin
    Result := '';
    exit;
  end;
  if self.IsBasicEvent or self.NeedsToBeUpdated then
  begin
    Result := self.PlainTemporalExpr;
    exit;
  end;
  if self.IsTypeNOT or self.IsTypeTOP then
  begin
    tempObject := self[0];
    if assigned(tempObject) then
      Result := self.EventTypeToString + '[' + tempObject.TemporalExprDEBUG + ']'
  end else
  begin
    i := 0;
    numberOfChildren := self.Count;
    Result := '';
    { as DEBUG messages are generated also of terms which are just being transformed,
      it is necessary to check, whether a term has children at all! }
    if numberOfChildren > 0 then
    begin
      repeat
        Result := Result + ',' + self[i].TemporalExprDEBUG;
        inc(i);
      until i = numberOfChildren;
      Result[1] := '[';
    end else
    begin
      { no children... }
      Result := '[';
    end;
    Result := self.EventTypeToString + Result + ']';
  end;
end;
{------------------------------------------------------------------------------
  ZZZ
  DEBUG: Give a short status on necessity of updating the TTFTAObjectœ
------------------------------------------------------------------------------}
function TTFTAObject.WriteStatus(indent:integer = 0) : ansistring;
begin
  if self.NeedsToBeUpdated and Assigned(self.PointerToUpdateObject) then
    WriteStatus := PointerAddrStr(self.PointerToUpdateObject)
  else
    WriteStatus := 'NIL';
  {WriteStatus := DupeString(' ',indent) + 'Event '               + TemporalExpr + sLineBreak +
                 DupeString(' ',indent) + ' --- Address : '      + PointerAddrStr(self) + sLineBreak +
                 DupeString(' ',indent) + ' --- Type : '         + EventTypeToString + sLineBreak +
                 DupeString(' ',indent) + ' --- BasicEvent : '   + BoolToString(IsBasicEvent) + sLineBreak +
                 DupeString(' ',indent) + ' --- CoreEvent : '    + BoolToString(IsCoreEvent) + sLineBreak +
                 DupeString(' ',indent) + ' --- Negated : '      + BoolToString(IsNegated) + sLineBreak +
                 DupeString(' ',indent) + ' --- EventSequence : '+ BoolToString(IsEventSequence) + sLineBreak +
                 DupeString(' ',indent) + ' --- LogicalValue : '+ IntToStr(self.LogicLevel) + sLineBreak +
                 DupeString(' ',indent) + ' --- NeedsToBeUpdated : '+ BoolToString(NeedsToBeUpdated) + sLineBreak +
                 DupeString(' ',indent) + ' --- Points to Adress : ' + WriteStatus + sLineBreak +
                 DupeString(' ',indent) + ' --- No. children : ' + IntToStr(Count) + sLineBreak + ' ' ;      }
end;

//  [include file EOF]
