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
tree grammar tftacflattener;

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

tdnf	:   	nestedterm
	|	atom
	|	pandterm
	;
	
atom 	:	ID	
	| 	TRUE
	|	FALSE
	;
	
pandterm:	^(PAND ^(PAND tdnf+) tdnf+)
			->	^(PAND tdnf+)
	|	^(PAND tdnf+)
	;

nestedterm
	:	nestand | nestor | nestxor | nestsand ;
	
otherthanand
	:	nestor | nestxor | nestsand | atom | pandterm ;
	
otherthanor
	:	nestand | nestxor | nestsand | atom | pandterm ;
	
otherthanxor
	:	nestand | nestor | nestsand | atom | pandterm ;
	
otherthansand
	:	nestand | nestor | nestxor | atom | pandterm ;
	
nestand	:	^(AND ^(AND tdnf+) tdnf+)
			->	^(AND tdnf+)
	|	^(AND otherthanand+ ^(AND tdnf+))
			->	^(AND otherthanand+ tdnf+)
	|	^(AND otherthanand+ ^(AND tdnf+) tdnf+)
			->	^(AND otherthanand+ tdnf+)
	|	^(AND tdnf+)	
	;

nestsand:	^(SAND ^(SAND tdnf+) tdnf+)
			->	^(SAND tdnf+)
	|	^(SAND otherthansand+ ^(SAND tdnf+))
			->	^(SAND otherthansand+ tdnf+)
	|	^(SAND otherthansand+ ^(SAND tdnf+) tdnf+)
			->	^(SAND otherthansand+ tdnf+)
	|	^(SAND tdnf+)
	;
	
nestor	:	^(OR ^(OR tdnf+) tdnf+)
			->	^(OR tdnf+)
	|	^(OR otherthanor+ ^(OR tdnf+))
			->	^(OR otherthanor+ tdnf+)
	|	^(OR otherthanor+ ^(OR tdnf+) tdnf+)
			->	^(OR otherthanor+ tdnf+)
	|	^(OR tdnf+)
	;			
			
nestxor	:	^(XOR ^(XOR tdnf+) tdnf+)
			->	^(XOR tdnf+)
	|	^(XOR otherthanxor+ ^(XOR tdnf+))
			->	^(XOR otherthanxor+ tdnf+)
	|	^(XOR otherthanxor+ ^(XOR tdnf+) tdnf+)
			->	^(XOR otherthanxor+ tdnf+)
	|	^(XOR tdnf+)
	;			



