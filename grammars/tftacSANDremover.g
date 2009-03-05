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

tree grammar tftacSANDremover;

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

expr	:	orterm
	|	andterm
	|	pandterm
	|	core
	|	atom
	;
	
atom	:	ID
	|	FALSE
	;
	
core	:	ID
	|	^(SAND . .)
			-> FALSE
	;

andterm	:	^(AND expr FALSE)
			-> FALSE
	|	^(AND FALSE expr)
			-> FALSE
	|	^(AND negterm expr)
	|	^(AND (andterm|core) (andterm|core))
	;
	
negterm
	:	^(NOT ID)
	|	^(AND negterm negterm)
	;
		
orterm	:	^(OR FALSE a=expr)
			-> $a
	|	^(OR a=expr FALSE)
			-> $a
	|	^(XOR FALSE a=expr)
			-> $a
	|	^(XOR a=expr FALSE)
			-> $a
	|	^(OR expr expr)
	|	^(XOR expr expr)	
	;
	
pandterm:	^(PAND expr FALSE)
		 	-> FALSE
	|	^(PAND FALSE expr)
			-> FALSE
	|	^(PAND expr expr)
	;
