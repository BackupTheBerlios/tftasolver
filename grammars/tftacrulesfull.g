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

tree grammar tftacrulesfull;

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

//TARGET AND OUTPUT
/* ############################################################################# */
expression
	:	tdnf	// no further changes needed, the output format
	|	tt	// further changes needed
	;

// PURE TFTA FORM (need not be transformed)
/* ############################################################################# */
// ATOMIC EVENT
ae 	:   	ID
	|	TRUE
	|	FALSE
	;

//CORE EVENT		
ce	:	ae
	|	^(SAND ce ae)
	;

//NEGATED ATOMIC EVENT	
nae	:	^(NOT ae) ;

//NEGATED CORE EVENT
nce	:	nae
	|	^(AND nce nae)
	;

//EVENT SEQUENCE
es	:	ce
	|	^(PAND es ce)
	;

//EVENT SEQUENCE WITH NEGATED ELEMENTS
nes	:	^(AND nce es)
	;
	
//TEMPORAL TERM IN TDNF
tdnf	:	es
	|	nes
	|	^(OR tdnf tdnf)
	|	^(XOR tdnf tdnf)
	;

// UNPURE FORMs (further transformation needed in order to produce new forms towards the tdnf form)	
/* ############################################################################# */	


//TEMPORAL TERM (the most general form)
tt 	:	atom
	|	orTerm
	|	xorTerm
	|	andTerm
	|	pandTerm
	|	sandTerm
	|	notNOTTerm
    	;
    	
//AN ATOMIC EVENT
atom	:	ae
	;
 
//ANY TERM WITH AN "AND" TREE
andTerm	:	^(AND (.) FALSE)
		 	-> FALSE
	|	^(AND FALSE (.))
			-> FALSE
	|	^(AND TRUE q=(.))
			-> $q
	|	^(AND q=(.) TRUE)
			-> $q
	|	^(AND ^(XOR x=tt y=tt) z=tt)
			-> ^(XOR ^(AND $x $z) ^(AND $y $z) ) 
	|	^(AND z=tt ^(XOR x=tt y=tt))
			-> ^(XOR ^(AND $x $z) ^(AND $y $z) ) 
	|	^(AND ^(OR x=tt y=tt) z=tt)
			-> ^(OR ^(AND $x $z) ^(AND $y $z) )  
	|	^(AND z=tt ^(OR x=tt y=tt))
			-> ^(OR ^(AND $x $z) ^(AND $y $z) )
	|	andTermWithNegated
	|	^(AND x=tt y=tt)
			-> ^(XOR ^(XOR ^(PAND $y $x) ^(PAND $x $y)) ^(SAND $x $y) )
	|	^(AND tt tt)
	;
	
//ANY TERM WITH AN "OR" TREE
orTerm	:	^(OR (.) TRUE)
		 	-> TRUE
	|	^(OR TRUE (.))
			-> TRUE
	|	^(OR FALSE q=tt)
			-> $q
	|	^(OR q=tt FALSE)
			-> $q
	|	^(OR a=tt ^(OR b=tt c=tt))
			-> ^(OR ^(OR $a $b) $c)
	|	^(OR tt tt)
	;
	
//ANY TERM WITH AN "XOR" TREE
xorTerm	:	^(XOR (.) TRUE)
		 	-> TRUE
	|	^(XOR TRUE (.))
			-> TRUE
	|	^(XOR FALSE q=tt)
			-> $q
	|	^(XOR q=tt FALSE)
			-> $q
	|	^(XOR a=tt ^(XOR b=tt c=tt))
			-> ^(XOR ^(XOR $a $b) $c)
	|	^(XOR tt tt)
	;
	
//ANY TERM WITH AN "PAND" TREE
pandTerm:	^(PAND (.) FALSE)
		 	-> FALSE
	|	^(PAND FALSE (.))
			-> FALSE
	|	^(PAND (.) TRUE)
		 	-> FALSE
	|	^(PAND TRUE x=tt)
			-> $x
	|	^(PAND ^(XOR x=tt y=tt) z=tt)
			-> ^(XOR ^(PAND $x $z) ^(PAND $y $z) )
	|	^(PAND z=tt ^(XOR x=tt y=tt))
			-> ^(XOR ^(PAND $z $x) ^(PAND $z $y ) )
	|	^(PAND ^(OR x=tt y=tt) z=tt)
			-> ^(OR ^(PAND $x $z) ^(PAND $y $z) )
	|	^(PAND z=tt ^(OR x=tt y=tt))
			-> ^(XOR ^(XOR ^(AND ^(NOT $x) ^(PAND $z $y)) 
			    	       ^(AND ^(NOT $y) ^(PAND $z $x)) )  
			    	 ^(PAND $z ^(SAND $x $y)) ) 
	|	^(PAND z=tt ^(PAND x=tt y=tt))
			-> ^(PAND ^(AND $x $z) $y)
	|	^(PAND x=tt ^(AND b=notTerm z=tt))
			-> ^(AND $b ^(PAND $x $z))
	|	^(PAND ^(AND ^(AND q1=negTerm q2=negTerm) y=tt) z=tt)
			-> ^(XOR ^(XOR ^(PAND ^(PAND $y ^(OR ^(NOT $q1) ^(NOT $q2)) ) 
					      $z) 
				       ^(AND ^(AND $q1 $q2) ^(PAND $y $z)) ) 
				 ^(PAND $y ^(SAND ^(OR ^(NOT $q1) ^(NOT $q2)) $z)) )
	|	^(PAND ^(AND n1=notTerm m1=tt) z=tt)
			-> ^(XOR ^(XOR ^(PAND ^(PAND $m1 ^(NOT $n1)) 
					      $z) 
				       ^(AND $n1 ^(PAND $m1 $z)) ) 
				 ^(PAND $m1 ^(SAND ^(NOT $n1) $z)) )
	|	^(PAND tt tt)
	;
	
//ANY TERM WITH AN "SAND" TREE
sandTerm:	^(SAND (.) FALSE)
		 	-> FALSE
	|	^(SAND FALSE (.))
			-> FALSE
	|	^(SAND TRUE TRUE)
			-> TRUE
	|	^(SAND (.) TRUE)
		 	-> FALSE
	|	^(SAND TRUE (.))
			-> FALSE
	|	^(SAND ^(XOR x=tt y=tt) z=tt)
			-> ^(XOR ^(SAND $x $z) ^(SAND $y $z) )
	|	^(SAND z=tt ^(XOR x=tt y=tt))
			-> ^(XOR ^(SAND $x $z) ^(SAND $y $z) )
	|	^(SAND z=tt ^(OR x=tt y=tt))
			-> ^(XOR ^(XOR ^( AND ^(NOT $x) ^(SAND $y $z)) 
				       ^( AND ^(NOT $y) ^(SAND $z $x)) ) 
				 ^(SAND $x ^(SAND $y $z)) ) 
	|	^(SAND ^(OR x=tt y=tt) z=tt)
			-> ^(XOR ^(XOR ^( AND ^(NOT $x) ^(SAND $y $z)) 
				       ^( AND ^(NOT $y) ^(SAND $x $z)) ) 
				 ^(SAND $x ^(SAND $y $z)) ) 
	|	^(SAND ^(PAND x=tt y=tt) z=tt)
			-> ^(PAND $x ^(SAND $y $z))
	|	^(SAND z=tt ^(PAND x=tt y=tt))
			-> ^(PAND $x ^(SAND $y $z))
	|	^(SAND x=tt ^(AND a=notTerm z=tt))
			-> ^(AND $a ^(SAND $x $z))
	|	^(SAND ^(AND a=notTerm z=tt) x=tt )
			-> ^(AND $a ^(SAND $x $z))
	|	^(SAND tt tt)
	;

// DOUBLE INVERTED TERMS	
notNOTTerm
	:	^(NOT ^(NOT a=tt) )
			-> $a
	|	pureNegTerm
	;

// CONJUNCTION OF NEGATED AND NON NEGATED	
andTermWithNegated
	:	^(AND ^(NOT ^(PAND x=tt y=tt) ) m1=tt )
			-> ^(XOR ^(XOR ^(XOR ^(XOR ^(AND ^(AND ^(NOT $x) ^(NOT $y) ) 
							 $m1 ) 
					           ^(AND ^(AND ^(NOT $x) $y ) 
					           	 $m1)  ) 
				             ^(AND ^(NOT $y) ^(AND $x $m1))  ) 
				       ^(AND ^(PAND $y $x) $m1)  ) 
				 ^(AND ^(SAND $x $y) $m1)  )	
	|	^(AND ^(AND n1=notTerm m1=tt) z=tt)
			-> ^(XOR ^(XOR ^(AND $n1 ^(AND $m1 $z)) ^(PAND ^(PAND $m1 ^(NOT $n1)) $z ) ) ^(PAND $m1 ^(SAND ^(NOT $n1) $z)) )
	|	^(AND ^(OR  n1=notTerm n2=notTerm) z=tt)
			-> ^(OR ^(AND $n1 $z) ^(AND $n2 $z) )
	|	^(AND ^(XOR  n1=notTerm n2=notTerm) z=tt)
			-> ^(XOR ^(AND $n1 $z) ^(AND $n2 $z) )	
	|	^(AND n1=notTerm ^(XOR y=tt z=tt))
			-> ^(XOR ^(AND $n1 $y) ^(AND $n1 $z) )
	|	^(AND n1=notTerm ^(AND n2=notTerm z=tt))
			-> ^(AND ^(AND $n1 $n2) $z )
	|	^(AND notTerm tt) 
	;
	
//ANY TERM WITH AN "NOT" TREE	
notTerm 
	:	^(NOT ^(AND x=negTerm y=negTerm) )
			-> ^(OR  ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(OR  x=negTerm y=negTerm) )
			-> ^(AND ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(XOR  x=negTerm y=negTerm) )
			-> ^(AND ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(SAND x=negTerm y=negTerm) )
			-> ^(XOR ^(XOR ^(XOR ^(XOR ^(AND ^(NOT $x) ^(NOT $y)) 
					     	   ^(AND ^(NOT $x) $y) ) 
				       	     ^(AND ^(NOT $y) $x) )
				       ^(PAND $y $x) ) 
				 ^(PAND $x $y) )
	|	^(NOT ^(NOT x=negTerm))
			-> $x
	|	^(NOT negTerm)
	|	negAndTerm
	|	negOrTerm
	|	negXorTerm
	|	negPandTerm
	|	negSandTerm		
	;

// ANY TERM WITHIN A NEGATION (needs to get new Operator in order to discriminate)
negTerm	
	:	/*^(AND x=negTerm y=negTerm)
			-> ^(AND $x $y)
	|	^(OR x=negTerm y=negTerm)
			-> ^(OR $x $y)
	|	^(XOR x=negTerm y=negTerm)
			-> ^(XOR $y)
	|	^(PAND x=negTerm y=negTerm)
			-> ^(PAND $x $y)
	|	^(SAND x=negTerm y=negTerm)
			-> ^(SAND $x $y)
	|	*/atom
	|	negAndTerm
	|	negOrTerm
	|	negXorTerm
	|	negPandTerm
	|	negSandTerm
	|	^(NOT ^(AND x=negTerm y=negTerm) )
			-> ^(OR  ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(OR  x=negTerm y=negTerm) )
			-> ^(AND ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(XOR  x=negTerm y=negTerm) )
			-> ^(AND ^(NOT $x) ^(NOT $y))
	|	^(NOT ^(NOT x=negTerm))
			-> $x
	|	^(NOT negTerm)
	;
		
	
// WITHIN A NEGATED TERM, A TERM WITH AN AND
negAndTerm
	:	^(AND ^(XOR x=negTerm y=negTerm) z=negTerm)
			-> ^(XOR ^(AND $x $z) ^(AND $y $z) )
	|	^(AND z=negTerm ^(XOR x=negTerm y=negTerm))
			-> ^(XOR ^(AND $x $z) ^(AND $y $z) )
	|	^(AND ^(OR x=negTerm y=negTerm) z=negTerm)
			-> ^(OR ^(AND $x $z) ^(AND $y $z) )
	|	^(AND z=negTerm ^(OR x=negTerm y=negTerm))
			-> ^(OR ^(AND $x $z) ^(AND $y $z) )
	|	^(AND z=negTerm ^(AND x=negTerm y=negTerm))
			-> ^(AND ^(AND $z $x) $y) 
	|	^(AND negTerm negTerm)
	;
	
negOrTerm
	:	^(OR z=negTerm ^(XOR x=negTerm y=negTerm))
			-> ^(OR ^(OR $z $x) $y) 
	|	^(OR z=negTerm ^(OR x=negTerm y=negTerm))
			-> ^(OR ^(OR $z $x) $y) 
	|	^(OR negTerm negTerm)
	;
	
negXorTerm
	:	^(XOR z=negTerm ^(XOR x=negTerm y=negTerm))
			-> ^(XOR ^(XOR $z $x) $y) 
	|	^(XOR z=negTerm ^(OR x=negTerm y=negTerm))
			-> ^(OR ^(OR $z $x) $y) 
	|	^(XOR negTerm negTerm)
	;
	
negPandTerm
	:	^(PAND negTerm negTerm)
	;

negSandTerm
	:	^(SAND negTerm negTerm)
	;	
	
pureNegTerm
	:	^(NOT ^(AND a=naeOrPureNegTerm b=naeOrPureNegTerm))
			-> ^(OR ^(NOT $a) ^(NOT $b))
	|	^(NOT ^(OR a=naeOrPureNegTerm b=naeOrPureNegTerm))
			-> ^(AND ^(NOT $a) ^(NOT $b))
	|	^(NOT ^(XOR a=naeOrPureNegTerm b=naeOrPureNegTerm))
			-> ^(AND ^(NOT $a) ^(NOT $b))
	|	^(NOT ^(PAND a=naeOrPureNegTerm b=naeOrPureNegTerm))
	|	^(NOT ^(SAND a=naeOrPureNegTerm b=naeOrPureNegTerm))
	;
	
naeOrPureNegTerm
	:	nae
	|	pureNegTerm
	|	^(AND  naeOrPureNegTerm naeOrPureNegTerm)
	|	^(OR   naeOrPureNegTerm naeOrPureNegTerm)
	|	^(XOR  naeOrPureNegTerm naeOrPureNegTerm)
	|	^(SAND naeOrPureNegTerm naeOrPureNegTerm)
	|	^(PAND naeOrPureNegTerm naeOrPureNegTerm)
	|	^(NOT ^(AND tt tt))
	|	^(NOT ^(OR tt tt))
	|	^(NOT ^(XOR tt tt))
	|	^(NOT ^(PAND tt tt))
	|	^(NOT ^(SAND tt tt))
	;
		
//[EOF]
