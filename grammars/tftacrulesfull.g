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
	|	andTerm
	|	orTerm
	|	xorTerm
	|	pandTerm
	|	sandTerm
	|	notNotTerm
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
	|	^(AND x=tt y=tt)
			-> ^(XOR ^(XOR ^(PAND $y $x) ^(PAND $x $y)) ^(SAND $x $y) )
	|	^(AND tt tt)
	|	andTermWithNegated
	|	^(AND ^(AND n1=notTerm m1=tt) z=tt)
			-> ^(XOR ^(XOR ^(AND $n1 ^(AND $m1 $z)) ^(PAND ^(PAND $m1 ^(NOT $n1)) $z ) ) ^(PAND $m1 ^(SAND ^(NOT $n1) $z)) )
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
notNotTerm
	:	^(NOT ^(NOT a=(.)) )
			-> $a
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
	|	^(AND notTerm tt) 
	;
	
//ANY TERM WITH AN "NOT" TREE	
notTerm :	^(NOT x=negTerm)
			-> ^(NOTNOT $x)
	|	^(NOTNOT ^(NOTNOT x=negTerm))
			-> $x
	|	^(NOTNOT ^(NOTAND x=negTerm y=negTerm) )
			-> ^(NOTOR  ^(NOTNOT $x) ^(NOTNOT $y))
	|	^(NOTNOT ^(NOTOR  x=negTerm y=negTerm) )
			-> ^(NOTAND ^(NOTNOT $x) ^(NOTNOT $y))
	|	^(NOTNOT ^(NOTXOR  x=negTerm y=negTerm) )
			-> ^(NOTAND ^(NOTNOT $x) ^(NOTNOT $y))
	|	^(NOTNOT ^(NOTSAND x=negTerm y=negTerm) )
			-> ^(NOTXOR ^(NOTXOR ^(NOTXOR ^(NOTXOR ^(NOTAND ^(NOTNOT $x) ^(NOTNOT $y)) 
					     	   ^(NOTAND ^(NOTNOT $x) $y) ) 
				       	     ^(NOTAND ^(NOTNOT $y) $x) )
				       ^(NOTPAND $y $x) ) 
				 ^(NOTPAND $x $y) )
	|	^(NOTNOT negTerm)
	|	negAndTerm
	|	negOrTerm
	|	negXorTerm
	|	negPandTerm
	|	negSandTerm		
	;

// ANY TERM WITHIN A NEGATION (needs to get new Operator in order to discriminate)
negTerm	:	^(AND x=negTerm y=negTerm)
			-> ^(NOTAND $x $y)
	|	^(OR x=negTerm y=negTerm)
			-> ^(NOTOR $x $y)
	|	^(XOR x=negTerm y=negTerm)
			-> ^(NOTXOR $y)
	|	^(PAND x=negTerm y=negTerm)
			-> ^(NOTPAND $x $y)
	|	^(SAND x=negTerm y=negTerm)
			-> ^(NOTSAND $x $y)
	|	^(NOT x=negTerm)
			-> ^(NOTNOT $x)
	|	atom
	|	negAndTerm
	|	negOrTerm
	|	negXorTerm
	|	negPandTerm
	|	negSandTerm
	;
		
	
// WITHIN A NEGATED TERM, A TERM WITH AN AND
negAndTerm
	:	^(NOTAND ^(NOTXOR x=negTerm y=negTerm) z=negTerm)
			-> ^(NOTXOR ^(NOTAND $x $z) ^(NOTAND $y $z) )
	|	^(NOTAND z=negTerm ^(NOTXOR x=negTerm y=negTerm))
			-> ^(NOTXOR ^(NOTAND $x $z) ^(NOTAND $y $z) )
	|	^(NOTAND ^(NOTOR x=negTerm y=negTerm) z=negTerm)
			-> ^(NOTOR ^(NOTAND $x $z) ^(NOTAND $y $z) )
	|	^(NOTAND z=negTerm ^(NOTOR x=negTerm y=negTerm))
			-> ^(NOTOR ^(NOTAND $x $z) ^(NOTAND $y $z) )
	|	^(NOTAND z=negTerm ^(NOTAND x=negTerm y=negTerm))
			-> ^(NOTAND ^(NOTAND $z $x) $y) 
	|	^(NOTAND negTerm negTerm)
	;
	
negOrTerm
	:	^(NOTOR z=negTerm ^(NOTXOR x=negTerm y=negTerm))
			-> ^(NOTOR ^(NOTOR $z $x) $y) 
	|	^(NOTOR z=negTerm ^(NOTOR x=negTerm y=negTerm))
			-> ^(NOTOR ^(NOTOR $z $x) $y) 
	|	^(NOTOR negTerm negTerm)
	;
	
negXorTerm
	:	^(NOTXOR z=negTerm ^(NOTXOR x=negTerm y=negTerm))
			-> ^(NOTXOR ^(NOTXOR $z $x) $y) 
	|	^(NOTXOR z=negTerm ^(NOTOR x=negTerm y=negTerm))
			-> ^(NOTOR ^(NOTOR $z $x) $y) 
	|	^(NOTXOR negTerm negTerm)
	;
	
negPandTerm
	:	^(NOTPAND negTerm negTerm)
	;

negSandTerm
	:	^(NOTSAND negTerm negTerm)
	;	
		
		
//[EOF]
