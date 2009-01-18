unit utftaformabout;

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

interface

uses
  Classes, SysUtils, LResources, Forms, Controls, Graphics, Dialogs, StdCtrls,
  ComCtrls, ExtCtrls;

type

  { TFormAbout }

  TFormAbout = class(TForm)
    ButtonClose: TButton;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    Memo1: TMemo;
    PageControl1: TPageControl;
    TabSheet1: TTabSheet;
    TabSheet2: TTabSheet;
    procedure ButtonCloseClick(Sender: TObject);
    procedure Label1Click(Sender: TObject);

  private
    { private declarations }
  public
    { public declarations }
  end; 

var
  FormAbout: TFormAbout;

implementation

{ TFormAbout }


procedure TFormAbout.ButtonCloseClick(Sender: TObject);
begin
  Close;
end;

procedure TFormAbout.Label1Click(Sender: TObject);
begin

end;





initialization
  {$I utftaformabout.lrs}

end.

