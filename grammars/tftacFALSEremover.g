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
tree grammar tftacFALSEremover;

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
	:	FALSE
	|	^(OR	FALSE)	->	FALSE
	|	^(XOR	FALSE)	->	FALSE
	|	^(OR    (targets+=expression)* )
			{
				int listsize = $targets.size();
				
				for ( int i = 0; i<= listsize -1; i++ )
				{
					if ( $targets.get(i).toString().equals("FALSE") )
					{
						$targets.remove(i);
						listsize--;
					}
				}
				if ( $targets.size()==0 )
				{
					$targets.add((Object)adaptor.create(FALSE, "FALSE"));
				}
			}   
			->	^(OR $targets+)
	|   	^(XOR   (targets+=expression)* )
			{
				int listsize = $targets.size();
				
				for ( int i = 0; i<= listsize -1; i++ )
				{
					if ( $targets.get(i).toString().equals("FALSE") )
					{
						$targets.remove(i);
						listsize--;
					}
				}
				if ( $targets.size()==0 )
				{
					$targets.add((Object)adaptor.create(FALSE, "FALSE"));
				}
			} 
			->	^(XOR $targets+)
	|   	^(PAND  expression+)
	|  	^(AND   expression+)
	|	^(SAND  expression+)
	|   	^(NOT   expression+) 
	|   	ID	
	|	TRUE		
   	;	 

