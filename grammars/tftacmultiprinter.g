/* ############################################################################

  Copyright by Simon J. Schilling (the Author)
  Email: sjschilling@gmx.net
  Year: 2009

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

  ############################################################################ */
tree grammar tftacmultiprinter;

options {      
 tokenVocab=tftac; 
 output=template;
 ASTLabelType=CommonTree;
}

infixform
	:   	^(OR (targets+=infixform)*)   
			-> template(b={$targets}) <<<b; separator="\n" > >>
	|   	^(XOR (targets+=infixform)*)   
			-> template(b={$targets}) <<<b; separator="\n" > >>
	|	^(PAND (targets+=infixform)*)   
			-> template(b={$targets}) <<(<b; separator=" PAND ">)>>
	|  	^(AND  (targets+=infixform)*)   
			-> template(b={$targets}) <<(<b; separator=" AND ">)>>
	|   	^(SAND  (targets+=infixform)*)   
			-> template(b={$targets}) <<(<b; separator=" SAND ">)>>
	|   	^(NOT  a=infixform)   
			-> template(a={$a.st}) "NOT <a>"
    	|   	ID	-> template(a={$ID.text}) "<a>"
	|	TRUE	-> {%{"TRUE"}}
	|	FALSE	-> {%{"FALSE"}}		
    	;
