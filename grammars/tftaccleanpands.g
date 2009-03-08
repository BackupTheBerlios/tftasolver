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
tree grammar tftaccleanpands;

options {      
 tokenVocab=tftac; 
 output=AST;
 backtrack=true;
 memoize=true;
}

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();

}

expression
	:	^(OR    (a+=expression)*)
	|   	^(XOR   (a+=expression)*)
	|	^(PAND   FALSE) -> FALSE
	|   	^(PAND  (a+=expression)*)
	|	^(AND   negterm+ FALSE) -> FALSE
	|  	^(AND   (a+=expression)*)
	|	^(SAND  (a+=expression)*)
	|   	^(NOT   c=expression) 
	|   	ID	
	|	TRUE	
	|	FALSE	
   	;
   	
negterm	:	^(NOT ID)
	;


