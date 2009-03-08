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
tree grammar tftacplausi;

options {      
 tokenVocab=tftac; 
 output=AST;
 backtrack=true;
 memoize=true;
}

@header {
import java.util.HashMap;
import java.util.ArrayList;
import org.antlr.stringtemplate.*;
import java.io.*;
import org.antlr.runtime.*;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();

StringTemplate query = new StringTemplate("\$b; separator=\";\"\$");

List valuelistPAND = new ArrayList();
List valuelistAND  = new ArrayList();

}

expression
	:   	ID	
	|	TRUE	
	|	FALSE	
	|	^(OR    {
				valuelistPAND.clear();	
				valuelistAND.clear();	
			}
			 expression+)
			
	|   	^(XOR   {
				valuelistPAND.clear();	
				valuelistAND.clear();	
			}
			 expression+)
	|	^(SAND  {
				valuelistPAND.clear();	
				valuelistAND.clear();	
			}
			 expression+)
	|  	^(AND   (a+=andexpression)*)
			{
				// add the "real" events to the list (not the ones characterizing the operators!)
				int listsize = valuelistAND.size();
				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
  				{
  					for ( int j = i+1; j < listsize; j++ )
  					{
	  					if ( valuelistAND.get(i).equals(valuelistAND.get(j)) )
	  					{	  						
	  						$a.clear();
	  						$a.add((Object)adaptor.create(FALSE, "FALSE"));
	  						listsize = 0;
	  					}
	  				}
				}
				valuelistAND.clear();	
			} 
			->	^(AND $a+)
//
//	
	|	^(PAND (c+=pandexpression)*)  
			{
				// add the "real" events to the list (not the ones characterizing the operators!)
				int listsize = valuelistPAND.size();
				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
  				{
  					for ( int j = i+1; j < listsize; j++ )
  					{
	  					if ( valuelistPAND.get(i).equals(valuelistPAND.get(j)) )
	  					{	  						
	  						$c.clear();
	  						$c.add((Object)adaptor.create(FALSE, "FALSE"));
	  						listsize = 0;
	  					}
	  				}
				}
				valuelistPAND.clear();			
			} 
			-> ^(PAND $c+)
   	;

pandexpression
	:	x=ID	{
				valuelistPAND.add($x.toString());
			}	
	|	TRUE	
	|	FALSE
	|	^(AND   pandexpression+)
	|	^(SAND  pandexpression+)
	;

andexpression
	:	x=ID	{
				valuelistAND.add($x.toString());
			}	
	|	TRUE	
	|	FALSE
	|	^(AND   andexpression+)
	|	^(SAND  andexpression+)
	|	^(PAND  andexpression+)
	|	^(NOT   andexpression)
	;
