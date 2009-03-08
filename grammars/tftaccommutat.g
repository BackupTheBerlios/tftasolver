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
tree grammar tftaccommutat;

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
	:	^(OR    (a+=expression)*)
	|   	^(XOR   (a+=expression)*)
	|   	^(PAND  (a+=expression)*)
	|  	^(AND   (a+=expression)*)
			{
				int listsize = $a.size();
				int lastpos;
				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
  				{
  					for ( int j = i+1; j < listsize; j++ )
  					{
	  					if ( !( $a.get(i).toString().equals("NOT") ) && ( $a.get(i).toString().equals($a.get(j).toString()) ) )
	  					{
	  						$a.remove(j);
	  						listsize = listsize -1;	
	  					}
	  				}
				}	
			} 
			-> ^(AND $a+)  
	|	^(SAND   (a+=expression)*)
			{
				int listsize = $a.size();
				int lastpos;
				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
  				{
  					for ( int j = i+1; j < listsize; j++ )
  					{
	  					if ( !( $a.get(i).toString().equals("NOT") ) && ( $a.get(i).toString().equals($a.get(j).toString()) ) )
	  					{
	  						$a.remove(j);
	  						listsize = listsize -1;	
	  					}
	  				}
				}		
			} 
			-> ^(SAND $a+)
	|   	^(NOT  c=expression) 
	|   	ID	
	|	TRUE	
	|	FALSE	
   	;


