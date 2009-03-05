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
	:	^(AND ^(AND tdnf+) tdnf+)
			->	^(AND tdnf+)
	|	^(AND tdnf+ ^(AND tdnf+) tdnf*)
			->	^(AND tdnf+)
	|	^(SAND ^(SAND tdnf+) tdnf+)
			->	^(SAND tdnf+)
	|	^(SAND tdnf+ ^(SAND tdnf+) tdnf*)
			->	^(SAND tdnf+)
	|	^(OR ^(OR tdnf+) tdnf+)
			->	^(OR tdnf+)
	|	^(OR (tdnf)+ ^(OR tdnf+))
			->	^(OR tdnf+)
	|	^(XOR ^(XOR tdnf+) tdnf+)
			->	^(XOR tdnf+)
	|	^(XOR (tdnf)+ (^(XOR tdnf))+)
			->	^(XOR tdnf+)
	|	^(AND tdnf+)
	|	^(SAND tdnf+)
	|	^(OR tdnf+)
	|	^(XOR tdnf+)		
	;



