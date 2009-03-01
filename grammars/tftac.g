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

grammar tftac;

options {      
 output=AST;
}

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}


expression 	:	term ( (OR^ | XOR^) term)*
		;
	
term		:	factor ((AND^ | PAND^ | SAND^) factor)*
		;
		
factor		:	ID
		|	LBRACE! expression RBRACE!
		|	NOT^ factor
		|	TRUE | FALSE
		;

AND	:	'AND' ;
PAND	:	'PAND' ;
SAND	:	'SAND' ;
OR	:	'OR' ;
XOR	:	'XOR' ;
NOT	:	'NOT' ;
TRUE	:	'TRUE' ;
FALSE	:	'FALSE';

INT 	:   	('0'..'9')+ ;
ID  	:   	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|INT)* ;
WS  	:   	(' '|'\t'|'\n'|'\f')+ {skip();} ;

LBRACE  : 	('(') ;
RBRACE  : 	(')') ;








