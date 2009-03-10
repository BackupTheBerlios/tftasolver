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
		|	TRUE 
		| 	FALSE
		;

AND	:	A N D ;
PAND	:	P A N D ;
SAND	:	S A N D ;
OR	:	O R ;
XOR	:	X O R ;
NOT	:	N O T ;
TRUE	:	T R U E ;
FALSE	:	F A L S E;

INT 	:   	('0'..'9')+ ;
ID  	:   	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|INT)* ;
WS  	:   	(' '|'\t'|'\n'|'\f')+ {skip();} ;

LBRACE  : 	'('
	|	'['
	|	'{' 
	;
	
RBRACE  : 	')' 
	|	']'
	|	'}'
	;
	
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');









