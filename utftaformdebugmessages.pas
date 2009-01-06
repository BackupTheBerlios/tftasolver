unit utftaformdebugmessages;

{ ############################################################################

  Copyright by Simon J. Schilling (the Author)
  Email: sjschilling@gmx.net
  Year: 2008

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
  ComCtrls, ExtCtrls , Buttons;

type

  { TFormDebugMessage }

  TFormDebugMessage = class(TForm)
    MemoOutput: TMemo;
  private
    { private declarations }
  public
    { public declarations }
    procedure WriteMessage(Parameter : ansistring) ;
  end; 

var
  FormDebugMessage: TFormDebugMessage;

implementation

{------------------------------------------------------------------------------
  write a messageinto debug window
------------------------------------------------------------------------------}
procedure TFormDebugMessage.WriteMessage(Parameter : ansistring);
begin
  MemoOutput.Append(Parameter);
end;

initialization
  {$I utftaformdebugmessages.lrs}

end.

