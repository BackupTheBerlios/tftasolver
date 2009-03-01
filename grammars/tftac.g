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
WS  	:   	(' '|'\t'|'\f')+ {skip();} ;

LBRACE  : 	('(') ;
RBRACE  : 	(')') ;








