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

tree grammar tftacrules;

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

tt 	:	andterm
	|	negandterm
	|	orterm
	|	pandterm
	|	sandterm
	|	xorterm
	|	ae
	|	^(NOT ^(NOT a1=tt) )
			-> $a1
    	;
  	
  	
//tdnf	:	(es|nes)
////	|	^(OR tdnf tdnf)
//	|	^(XOR tdnf tdnf)
//	;

//es	:	ce
//	|	^(PAND es ce);
	
//nes	:	^(AND nce es);

ce	:	ae 
	|	^(SAND ce ce)
	;
	
notterm	:	^(NOT ^(AND x=tt y=tt) )
			-> ^(OR ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(OR x=tt y=tt) )
			-> ^(AND ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(XOR x=tt y=tt) )
			-> ^(AND ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(PAND x=tt y=tt) )
			-> ^(XOR ^(AND ^(NOT $x) ^(NOT $y)) ^(AND ^(NOT $x) $y) )
			//-> ^(XOR ^(AND ^(NOT $x) ^(NOT $y)) ^(XOR ^(AND ^(NOT $x) $y) ^(XOR ^(AND ^(NOT $y) $x) ^(XOR ^(PAND $y $x) ^(XOR ^(SAND $x $y) )))))		
	|	^(NOT ^(SAND x=tt y=tt) )
			-> ^(XOR ^(AND ^(NOT $x) ^(NOT $y)) ^(XOR ^(AND ^(NOT $x) $y) ^(XOR ^(AND ^(NOT $y) $x) ^(XOR ^(PAND $y $x) ^(XOR ^(PAND $x $y) )))))		
	|	^(OR notterm notterm)
	|	^(XOR notterm notterm)
	|	^(AND notterm notterm)
	|	^(NOT tt)
	;

//nce	:	nae 
//	|	^(AND nce nce)
//	;

andterm	:	^(AND . FALSE)
		 	-> FALSE
	|	^(AND FALSE .)
			-> FALSE
	|	^(AND TRUE a=ae)
			-> $a
	|	^(AND a=ae TRUE)
			-> $a
	|	^(AND ^(XOR x=tt y=tt) z=tt)
			-> ^(XOR ^(AND $x $z) ^(AND $y $z) )  
	|	^(AND ^(OR x=tt y=tt) z=tt)
			-> ^(OR ^(AND $x $z) ^(AND $y $z) )  
	|	^(AND z=tt ^(OR x=tt y=tt))
			-> ^(OR ^(AND $x $z) ^(AND $y $z) ) 
	|	^(AND ^(AND n1=notterm m1=metaPandSandAE) z=tt)
			-> ^(XOR ^(AND $n1 ^(AND $m1 $z)) ^(XOR ^(PAND ^(PAND $m1 ^(NOT $n1)) $z) ^(PAND $m1 ^(SAND ^(NOT $n1) $z))))
	|	^(AND x=tt y=tt)
			-> ^(XOR ^(PAND $x $y) ^(XOR ^(PAND $y $x) ^(SAND $x $y) ) )
	|	^(AND tt tt)
	;
	
negandterm
	:	^(AND ^(OR x=notterm y=negatedterm) z1=pandterm)
			-> ^(OR ^(AND $x $z1) ^(AND $y $z1))
	|	^(AND ^(XOR x=notterm y=negatedterm) z1=pandterm)
			-> ^(XOR ^(AND $x $z1) ^(AND $y $z1))
	|	^(AND ^(OR x=notterm y=negatedterm) z2=sandterm)
			-> ^(OR ^(AND $x $z2) ^(AND $y $z2))
	|	^(AND ^(XOR x=notterm y=negatedterm) z2=sandterm)
			-> ^(XOR ^(AND $x $z2) ^(AND $y $z2))
	|	^(AND ^(OR x=notterm y=negatedterm) z3=ae)
			-> ^(OR ^(AND $x $z3) ^(AND $y $z3))
	|	^(AND ^(XOR x=notterm y=negatedterm) z3=ae)
			-> ^(XOR ^(AND $x $z3) ^(AND $y $z3))
	|	^(AND n1=notterm ^(OR t1=tt t2=tt))
			-> ^(OR ^(AND $n1  $t1) ^(AND $n1  $t2)) 
	|	^(AND n1=notterm ^(XOR t1=tt t2=tt))
			-> ^(XOR ^(AND $n1  $t1) ^(AND $n1  $t2))
	|	^(AND n1=notterm ^(AND n2=notterm m1=metaPandSandAE))
			-> ^(AND ^(AND $n1 $n2) $m1)
	|	^(AND notterm metaPandSandAE)
	;
	
negatedterm 
	:	negandterm
	|	notterm
	;
	
metaPandSandAE
	:	pandterm
	|	sandterm
	|	andterm
	|	ae
	;
	
orterm	:	^(OR ae TRUE)
		 	-> TRUE
	|	^(OR TRUE .)
			-> TRUE
	|	^(OR FALSE a=ae)
			-> $a
	|	^(OR a=ae FALSE)
			-> $a
	|	^(OR tt tt)
	;
	
xorterm	:	^(XOR ae TRUE)
		 	-> TRUE
	|	^(XOR TRUE .)
			-> TRUE
	|	^(XOR FALSE a=ae)
			-> $a
	|	^(XOR a=ae FALSE)
			-> $a
	|	^(XOR tt tt)
	;
	
pandterm:	^(PAND ae FALSE)
		 	-> FALSE
	|	^(PAND FALSE .)
			-> FALSE
	|	^(PAND ae TRUE)
		 	-> FALSE
	|	^(PAND TRUE a=ae)
			-> $a
	|	^(PAND ^(XOR x=tt y=tt) z=tt)
			-> ^(XOR ^(PAND $x $z) ^(PAND $y $z) )
	|	^(PAND z=tt ^(XOR x=tt y=tt))
			-> ^(XOR ^(PAND $z $x) ^(PAND $z $y ) )
	|	^(PAND ^(OR x=tt y=tt) z=tt)
			-> ^(OR ^(PAND $x $z) ^(PAND $y $z) )
	|	^(PAND z=tt ^(OR x=tt y=tt))
			-> ^(XOR ^( AND ^(NOT $y) ^(PAND $z $x) ) ^(XOR ^( AND ^(NOT $x) ^(PAND $z $y)) ^(PAND $x ^(SAND $y $z))) )
	|	^(PAND z=tt ^(PAND x=tt y=tt))
			-> ^(PAND ^(AND $x $z) $y)
	|	^(PAND x=tt ^(AND b=notterm z=tt))
			-> ^(AND $b ^(PAND $x $z))
	|	^(PAND ^(AND n1=notterm m1=metaPandSandAE) z=tt)
			-> ^(XOR ^(AND $n1 ^(PAND $m1 $z)) ^(XOR ^(PAND ^(PAND $m1 ^(NOT $n1)) $z) ^(PAND $m1 ^(SAND ^(NOT $n1) $z))))
	|	^(PAND tt tt)
	;
	
sandterm:	^(SAND ae FALSE)
		 	-> FALSE
	|	^(SAND FALSE .)
			-> FALSE
	|	^(SAND TRUE TRUE)
			-> TRUE
	|	^(SAND ae TRUE)
		 	-> FALSE
	|	^(SAND TRUE .)
			-> FALSE
	|	^(SAND ^(XOR x=tt y=tt) z=tt)
			-> ^(XOR ^(SAND $x $z) ^(SAND $y $z) )
	|	^(SAND z=tt ^(XOR x=tt y=tt))
			-> ^(XOR ^(SAND $x $z) ^(SAND $y $z) )
	|	^(SAND z=tt ^(OR x=tt y=tt))
			-> ^(XOR ^( AND ^(NOT $y) ^(SAND $z $x) ) ^(XOR ^( AND ^(NOT $x) ^(SAND $y $z)) ^(SAND $x ^(SAND $y $z))) )
	|	^(SAND ^(OR x=tt y=tt) z=tt)
			-> ^(XOR ^( AND ^(NOT $y) ^(SAND $x $z) ) ^(XOR ^( AND ^(NOT $x) ^(SAND $y $z)) ^(SAND $x ^(SAND $y $z))) )
	|	^(SAND ^(PAND x=tt y=tt) z=tt)
			-> ^(PAND $x ^(SAND $y $z))
	|	^(SAND z=tt ^(PAND x=tt y=tt))
			-> ^(PAND $x ^(SAND $y $z))
	|	^(SAND x=tt ^(AND a=notterm z=tt))
			-> ^(AND $a ^(SAND $x $z))
	|	^(SAND ^(AND a=notterm z=tt) x=tt )
			-> ^(AND $a ^(SAND $x $z))
	|	^(SAND tt tt)
	;
	
ae 		:   	ID
		|	TRUE
		|	FALSE
		;
	
//nae	:	^(NOT ae)
//	;



