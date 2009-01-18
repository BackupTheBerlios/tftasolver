unit utftaformtftasolver;

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

{$mode objfpc}{$H+}
// switch TESTMODE on or of globally by editing testmode.conf (found in main path
// of TFTASolver.tftasolver
{$INCLUDE testmode.conf}

interface

{ ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  #############################################################################}
uses
  { System Units }
  Classes, SysUtils, LResources, Forms, Controls, Graphics, Dialogs, StdCtrls,
  ComCtrls, ExtCtrls , Buttons, strutils,
  { eigene Units }
  utftaexpression, utftaformabout,
  {$IFDEF TESTMODE}utftaformdebugmessages, sjspointertools, {$ENDIF}
  utftaobject, Menus, LazHelpHTML, IpHtml, Grids;

{ ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  #############################################################################}
type

  { TFTAMainWindow, das was man als Nutzer vom PRogramm primaer sieht. }
  { ######################################################################## }

  { TTFTAMainWindow }

  TTFTAMainWindow = class(TForm)
    Button1: TButton;
    ButtonMCCSCopy: TButton;
    ButtonMCCSCopysl: TButton;
    ImageListMenuOverall: TImageList;
    ImageListMenuOverallInactive: TImageList;
    MainMenuOverall: TMainMenu;
    MemoInputString: TMemo;
    MemoOutputString: TMemo;
    {$IFDEF TESTMODE} MemoDEBUG: TMemo; {$ENDIF}
    MenuItemShowTrees: TMenuItem;
    MenuItemView: TMenuItem;
    MenuItemProgHomepage: TMenuItem;
    MenuItemHelpUsage: TMenuItem;
    MenuItemAddDoc: TMenuItem;
    MenuItemAbout: TMenuItem;
    MenuItem5: TMenuItem;
    MenuItemSaveOutAs: TMenuItem;
    MenuItem2: TMenuItem;
    MenuItemSimplify: TMenuItem;
    MenuItemHelp: TMenuItem;
    MenuItemScan: TMenuItem;
    MenuItemFile: TMenuItem;
    MenuItemClear: TMenuItem;
    MenuItemOpen: TMenuItem;
    MenuItemExit: TMenuItem;
    MenuItemSaveInAs: TMenuItem;
    PageControl1: TPageControl;
    ProgressBar1: TProgressBar;
    RadioGroupMCSSFormat: TRadioGroup;
    RadioGroupMCSSFormatsl: TRadioGroup;
    StaticText1: TStaticText;
    StaticText2: TStaticText;
    StatusBarHauptfenster: TStatusBar;
    StringGridMCSS: TStringGrid;
    StringGridMCSSsl: TStringGrid;
    TabSheetOutMCSSsl: TTabSheet;
    TabSheetOutString: TTabSheet;
    TabSheetOutTree: TTabSheet;
    TabSheetOutMCSS: TTabSheet;
    ToolBarOverall: TToolBar;
    ToolButtonSaveOutAs: TToolButton;
    ToolButton3: TToolButton;
    ToolButton2: TToolButton;
    ToolButton4: TToolButton;
    ToolButton5: TToolButton;
    ToolButton6: TToolButton;
    ToolButtonShowTrees: TToolButton;
    ToolButtonSimplify: TToolButton;
    ToolButtonImportTerm: TToolButton;
    ToolButtonExit: TToolButton;
    ToolButtonSaveAs: TToolButton;
    ToolButtonOpen: TToolButton;
    ToolButtonClear: TToolButton;
    ToolButtonHelp: TToolButton;
    TreeViewInputStructure: TTreeView;
    TreeViewOutputStructure: TTreeView;
    procedure Button1Click(Sender: TObject);
    procedure MenuItemAboutClick(Sender: TObject);
    procedure MenuItemClearClick(Sender: TObject);
    procedure MenuItemExitClick(Sender: TObject);
    procedure MenuItemHelpClick(Sender: TObject);
    procedure MenuItemOpenClick(Sender: TObject);
    procedure MenuItemSaveInAsClick(Sender: TObject);
    procedure MenuItemSaveOutAsClick(Sender: TObject);
    procedure MenuItemScanClick(Sender: TObject);
    procedure MenuItemShowTreesClick(Sender: TObject);
    procedure MenuItemSimplifyClick(Sender: TObject);

  private
      {$IFDEF TESTMODE}
      vDEBUGWindow : TFormDebugMessage;
      vDEBUGLevel : integer;
      procedure SetDEBUGLevel(Parameter : integer);
    {$ENDIF}
  public
    TemporalExpression : TTFTAExpression;
    pointerToApplication : TApplication;
    {$IFDEF TESTMODE}
      property  DEBUGLevel : integer read vDEBUGLevel write SetDEBUGLevel;
      procedure WriteDEBUGMessage(Parameter: ansistring);
    {$ENDIF}
  end; 

{ ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  #############################################################################}
var
  TFTAMainWindow: TTFTAMainWindow;

{ ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  ##############################################################################
  #############################################################################}
implementation


{ TTFTAMainWindow }

{$IFDEF TESTMODE}
{------------------------------------------------------------------------------
  Schreibe Property vDEBUGLevel
------------------------------------------------------------------------------}
procedure TTFTAMainWindow.SetDEBUGLevel(Parameter : integer);
begin
  vDEBUGLevel := Parameter;
  if DEBUGLevel>0 then
  begin
    if not Assigned(vDEBUGWindow) then
    begin
      vDEBUGWindow:= TFormDebugMessage.Create(Application);
      vDEBUGWindow.Show;
    end;
    WriteDEBUGMessage('We have DebugLevel '+IntToStr(DEBUGLevel));
    MemoDEBUG := vDEBUGWindow.MemoOutput;
  end else
  begin
    MemoDEBUG := NIL;
  end;
end;
{$ENDIF}

{$IFDEF TESTMODE}
{------------------------------------------------------------------------------
  Schreibt eine Meldung ins DebugFenster
------------------------------------------------------------------------------}
procedure TTFTAMainWindow.WriteDEBUGMessage(Parameter : ansistring);
begin
  if Assigned(vDEBUGWindow) then vDEBUGWindow.WriteMessage(Parameter);
end;
{$ENDIF}





procedure TTFTAMainWindow.MenuItemClearClick(Sender: TObject);
begin
  //TemporalExpression.Clear;
  TreeViewInputStructure.Items.Clear ;
  TreeViewOutputStructure.Items.Clear;
  MemoOutputString.Clear;

  self.MenuItemSimplify.Enabled:=false;
  self.ToolButtonSimplify.Enabled:=false;

end;

procedure TTFTAMainWindow.MenuItemAboutClick(Sender: TObject);
var
  FormAbout:TFormAbout;
begin
  FormAbout := TFormAbout.Create(Self);
  try
    FormAbout.ShowModal;
  finally
    FormAbout.Release;
  end;
end;

procedure TTFTAMainWindow.Button1Click(Sender: TObject);

  procedure ScanDown(theObject : TTFTAObject);
  var i : integer;
      numberOfChildren : integer;
  begin
    if theObject.HasChildren then
    begin
      i := 0;
      numberOfChildren := theObject.Count;
      repeat
        ScanDown(theObject[i]);
        inc(i);
      until ( i = numberOfChildren );
    end;
    theObject.CheckTermProperties;
  end;

begin
  MenuItemScanClick(Sender);
  ScanDown(self.TemporalExpression.TemporalTerm);
  ShowMessage('BE     : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsBasicEvent) + sLineBreak +
              'NAE    : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsNegatedAtomicEvent) + sLineBreak +
              'BAT    : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsBasicANDTerm) + sLineBreak +
              'NAT    : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsNegatedANDTerm) + sLineBreak +
              'CE     : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsCoreEvent) + sLineBreak +
              'NCE    : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsNegatedCoreEvent) + sLineBreak +
              'ES     : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsEventSequence) + sLineBreak +
              'NES    : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsEventSequenceWithNegated) + sLineBreak +
              'XS     : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsExtendedSequence) + sLineBreak +
              'NXS    : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsExtendedSequenceWithNegated) + sLineBreak +
              'negated: ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsNegated) + sLineBreak +
              'TRUE   : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsTrue) + sLineBreak +
              'FALSE  : ' + BoolToStr(self.TemporalExpression.TemporalTerm[0].IsFalse) + sLineBreak
             );
end;

procedure TTFTAMainWindow.MenuItemExitClick(Sender: TObject);
begin
  close;
end;

procedure TTFTAMainWindow.MenuItemHelpClick(Sender: TObject);
begin

end;

procedure TTFTAMainWindow.MenuItemOpenClick(Sender: TObject);
begin
  StatusBarHauptfenster.Panels.Items[1].Text:='NOTE: NOT YET IMPLEMENTED8 ' + MenuItemOpen.Caption;
end;

procedure TTFTAMainWindow.MenuItemSaveInAsClick(Sender: TObject);
begin
  StatusBarHauptfenster.Panels.Items[1].Text:='ACHTUNG: NOCH KEINE FUNKTION HINTER ' + MenuItemSaveInAs.Caption;
end;


procedure TTFTAMainWindow.MenuItemSaveOutAsClick(Sender: TObject);
var i : Integer;
    numberOfItems : Integer;
    tempString : ansistring;
    tempTerm : TTFTAObject;
begin
  {$IFDEF TESTMODE}
    i := 0;
    numberOfItems := self.TemporalExpression.EventList.Count;

    WriteDEBUGMessage('EventListe mit ' + IntToStr(numberOfItems) + ' Eintraegen...');
    repeat
      tempTerm := self.TemporalExpression.EventList.Items[i];
      tempString := PointerAddrStr(tempTerm);
      if tempTerm.NeedsToBeUpdated then
        tempString := tempString + '(redirected to ' + PointerAddrStr(tempTerm.PointerToUpdateObject) + ')';
      tempString := tempString + ' === ' + tempTerm.PlainTemporalExpr;
      WriteDEBUGMessage(tempString);
      inc(i);
    until i = numberOfItems;
  {$ENDIF}
end;






procedure TTFTAMainWindow.MenuItemScanClick(Sender: TObject);
var s : ansistring;
begin

  { within the InputString all Blanks / Whitespaces and Newlines need to be
    deleted; furthermore the user may use "[", "(" and the corresponding
    colsing brackets, internally they are converted to "[" and "]";
    all input is casted to uppercase }
  s := Trim(MemoInputString.Lines.Text);
  s := AnsiReplaceText(s,' ','');
  s := AnsiReplaceText(s,sLineBreak,'');
  s := AnsiReplaceText(s,'(','[');
  s := AnsiReplaceText(s,')',']');
  s := upCase(s);

  { write the "cleaned" string back to the input field }
  MemoInputString.Lines.Text := s;

  { create an initial TemporalExpression }
  if assigned(TemporalExpression) then
    //TemporalExpression.Reset
  else
    TemporalExpression := TTFTAExpression.Create;
  {$IFDEF TESTMODE}TemporalExpression.SetDEBUGMemo(MemoDEBUG); {$ENDIF}

  { clear possible old data }
  MenuItemClearClick(Sender);

  { give input string to TemporalExpression }
  TemporalExpression.InputString := s  ;
  TemporalExpression.pointerToApplication := pointerToApplication;

  { start building the TermporalTerm and the corresponding TreeView from the
    input string }
  TemporalExpression.ParseInput(TreeViewInputStructure.Items);

  self.MenuItemSimplify.Enabled:=true;
  self.ToolButtonSimplify.Enabled:=true;

end;

procedure TTFTAMainWindow.MenuItemShowTreesClick(Sender: TObject);
begin
  TreeViewInputStructure.Visible := TreeViewInputStructure.Visible xor True;
  //TreeViewOutputStructure.Visible := TreeViewInputStructure.Visible;
  ToolButtonShowTrees.Down:= TreeViewInputStructure.Visible;
  MenuItemShowTrees.Checked:=TreeViewInputStructure.Visible;
end;


procedure TTFTAMainWindow.MenuItemSimplifyClick(Sender: TObject);
begin

  self.MenuItemSimplify.Enabled:=false;
  self.ToolButtonSimplify.Enabled:=false;

  TemporalExpression.Simplify;

  { TemporalExpression.TemporalTerm = the TOP event, thus we start with its
    first - and only - child }
  MemoOutputString.Text := TemporalExpression.OutputString;

  { now build OutputTree from TemporalTerm.GetFirstChild }
  TreeViewOutputStructure.Items.Clear;
  TemporalExpression.BuildTreeNodes(TreeViewOutputStructure.Items);

  TemporalExpression.MakeOutputMCSSList(StringGridMCSS);
  TemporalExpression.MakeOutputMCSSList(StringGridMCSSsl,false);

  { print the eventlist }
  {$IFDEF TESTMODE}MenuItemSaveOutAsClick(Sender); {$ENDIF}

end;


initialization
  {$I utftaformtftasolver.lrs}

end.

