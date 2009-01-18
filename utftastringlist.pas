unit utftastringlist;

{ ############################################################################

  Copyright by Simon J. Schilling (the Author)
  Email: sjschilling@gmx.net
  Year: 2008 / 2009

  Free Software. Enjoy.

  This file is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This file is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this file.  If not, see <http://www.gnu.org/licenses/>.

  ############################################################################ }

{$mode objfpc}{$H+}
// switch TESTMODE on or of globally by editing testmode.conf (found in main path
// of TFTASolver.tftasolver
{$INCLUDE testmode.conf}

interface

uses
  Forms, Dialogs, Classes, SysUtils, StrUtils, contnrs;

type

  TTFTAStringListObject = class(TObject)
  private
    VText : ansistring;
    VData : pointer;
    VIndex: integer;
  public
    property Data           : pointer    read VData  write VData;
    property FormerPosition : integer    read VIndex write VIndex;
    property Text           : ansistring read VText  write VText;
  end;

  TTFTAStringList = class(TFPObjectList)
  private
    function GetCSText : ansistring;
    function GetText   : ansistring;
    function PrivateGetText(withCS:boolean) : ansistring;

  protected
    function  GetItem(Index: Integer): TTFTAStringListObject;
    procedure SetItem(Index: Integer;  Item: TTFTAStringListObject);

  public
    constructor Create;
    destructor  Destroy;
    function    Add(AText: ansistring): Integer;
    function    Sort : boolean;
    property    CSText : ansistring read GetCSText;
    property    Text   : ansistring read GetText;
    property    Items[Index: Integer]: TTFTAStringListObject read GetItem write SetItem; default;
  end;

implementation

{ the follwoing is defined by OpenPascal for the TFPObjectList.Sort
  type TListSortCompare = function(Item1: Pointer;Item2: Pointer):Integer;
  now we need a function like this which actually compares two objects of
  type TTFTAObject for TTFTAList.Sort (by comparing their TemporalExpr, of course) }
function CompareTwoTTFTAStringListObjects(Item1: Pointer; Item2: Pointer) : Integer;
var firstString : ansistring;
    secondString: ansistring;
    firstIsNEG  : boolean;
    secondIsNEG : boolean;
begin
  { one special case:
    it is required by the temporal logic of TFTA that in AND-terms negated events
    are the first operand(s) of the term. therefore strict alphabetical sorting
    must be overrode for this case. This is done here.
    As it can not be separated which higher level term calls a given instance of
    this function, all sorting is done in such a way as to put negated events to
    the front }
  if Assigned(Item1) then
  begin
    if Assigned(Item2) then { Item1 <> NIL, Item2 <> NIL --> compare TemporalExpr's }
    begin
      firstString := TTFTAStringListObject(Item1).Text;
      secondString:= TTFTAStringListObject(Item2).Text;
      //
      firstIsNEG  := AnsiStartsStr('NOT[',firstString)  or (firstString  = 'FALSE' ) ;
      secondIsNEG := AnsiStartsStr('NOT[',secondString) or (secondString = 'FALSE' ) ;
      if (firstIsNEG = secondIsNEG) then { either both are negated or none is --> compare alphabetically }
      begin
        Result := AnsiCompareStr(TTFTAStringListObject(Item1).Text,TTFTAStringListObject(Item2).Text);
      end else
      begin
        if firstIsNEG then { Item 1 comes first because it is negated }
          Result := -1
        else               { Item 2 comes first because it is negated }
          Result := 1;
      end;
    end else { Item1 <> NIL, Item2 = NIL --> return 1 (Item1 after Item2) }
      Result := 1;
  end else
  begin
    if Assigned(Item2) then { Item1 = NIL, Item2 <> NIL --> return -1 (Item2 after Item1) }
      Result := -1
    else                    { Item1 = NIL, Item2 = NIL --> return 0 (Item1 same as Item2) }
      Result := 0;
  end;
end;


{ ############################################################################ }
{ TTFTAEventLookupList }
constructor TTFTAStringList.Create;
begin
  inherited Create;
end;

function TTFTAStringList.Add(AText: ansistring): Integer;
var newItem : TTFTAStringListObject;
begin
  newItem := TTFTAStringListObject.Create;
  newItem.Text := AText;
  newItem.FormerPosition := self.Count;
  Result := inherited Add(newItem);
end;

{------------------------------------------------------------------------------
  Class-Destructor
------------------------------------------------------------------------------}
destructor TTFTAStringList.Destroy;
begin
  // nothing specific yet ...
  inherited Destroy;
end;

function TTFTAStringList.GetItem(Index: Integer): TTFTAStringListObject;
begin
  Result := TTFTAStringListObject(inherited Items[Index]);
end;

function TTFTAStringList.GetCSText : ansistring;
begin
  Result := PrivateGetText(true);
end;

function TTFTAStringList.GetText : ansistring;
begin
  Result := PrivateGetText(false);
end;

function TTFTAStringList.PrivateGetText(withCS:boolean) : ansistring;
var numberItems : Integer;
    i : Integer = 0;
    c : ansistring;
begin

  Result := ''; { default }
  numberItems := self.Count;
  if withCS then
    c := ','
  else
    c := '';

  repeat
    Result := Result + self[i].Text + c;
    inc(i);
  until (i = numberItems - 1 );
  if numberItems > 1 then
    Result := Result + self[i].Text;

end;

procedure TTFTAStringList.SetItem(Index: Integer; Item: TTFTAStringListObject);
begin
  //Item.FormerPosition:=Index;
  inherited Items[Index] := Item;
end;

function TTFTAStringList.Sort : boolean;
var numberItems : Integer;
    i : Integer = 0;
    anyChange : boolean = False;
begin
  { it is necessary to differentiate between FPC compiler mode
    and "other" compiler mode (Delphi TurboPAscal etc.), as FPC has a
    different syntax for using function types...
    see: http://www.daniweb.com/forums/post740838-10.html }
  {$ifdef FPC}
    inherited Sort(@CompareTwoTTFTAStringListObjects);
  {$else}
    inherited Sort(CompareTwoTTFTAStringListObjects);
  {$endif}

  Result := True; { default }
  numberItems := self.Count;
  repeat
    anyChange := anyChange or ( self[i].FormerPosition <> i );
    inc(i);
  until anyChange or (i = numberItems);

  Result := anyChange;
end;


end.

