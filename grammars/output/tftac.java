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

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

        
public class tftac { 
    public static void main(String[] args) throws Exception {
        CharStream input = null;
	boolean statusSilent = false; // show or noshow of short description of tftac program
	boolean statusPure   = false; // show or noshow of intermediate transformation steps

        if ( args.length>0 ) {
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-s") || args[i].equals("--silent")) { statusSilent = true; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-p") || args[i].equals("--pure")) { statusPure = true; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-?") || args[i].equals("-h") || args[i].equals("--help")) { 
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("| TFTAC the (T)emporal(F)ault(T)ree(A)nalyis(C)ompiler is part of TFTASolver |");
				System.out.println("| Copyright (C) 2009 by Simon J. Schilling (sjschilling@gmx.net)             |");
  				System.out.println("| This file is part of TFTASolver <http://tftasolver.berlios.de>             |");
				System.out.println("|                                                                            |"); 
    				System.out.println("| TFTASolver is free software: you can redistribute it and/or modify         |");
    				System.out.println("| it under the terms of the GNU General Public License as published by       |");
    				System.out.println("| the Free Software Foundation, either version 3 of the License, or          |");
    				System.out.println("| (at your option) any later version.                                        |");
    				System.out.println("| TFTASolver is distributed in the hope that it will be useful,              |");
    				System.out.println("| but WITHOUT ANY WARRANTY; without even the implied warranty of             |");
    				System.out.println("| MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              |");
    				System.out.println("| GNU General Public License for more details.                               |");
    				System.out.println("| You should have received a copy of the GNU General Public License          |");
    				System.out.println("| along with TFTASolver.  If not, see <http://www.gnu.org/licenses/>.        |");
				System.out.println("|                                                                            |"); 
				System.out.println("| Command line options:                                                      |");
				System.out.println("| -h | --help | -?      show this help screen                                |");  
				System.out.println("| -p | --pure           do not show intermediate results of transformations  |");
				System.out.println("| -s | --silent         do not show copyright message at program start       |");  
				System.out.println("------------------------------------------------------------------------------");
				System.exit(0); 
			} 
		}
        }
        
	input = new ANTLRInputStream(System.in);

	// COPYRIGHT MESSAGE
	if (!statusSilent) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("| TFTAC the (T)emporal(F)ault(T)ree(A)nalyis(C)ompiler is part of TFTASolver |");
		System.out.println("| (C) 2009 sjschilling@gmx.net      ---       <http://tftasolver.berlios.de> |");
		System.out.println("| TFTASolver is free software, provided under the GNU General Public License |");
		System.out.println("------------------------------------------------------------------------------");
	}

        // BUILD AST
        tftacLexer lex = new tftacLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tftacParser parser = new tftacParser(tokens);
        tftacParser.expression_return r = parser.expression();
        if (!statusPure) {
		System.out.println("tree="+((Tree)r.tree).toStringTree());
	}
        
        String oldExpr = "";
	String newExpr = "";
	int loopNr = 0;

	// Simplify until no more changes possible
	CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)r.tree);
	nodes.setTokenStream(tokens);
	tftacrules theRules = new tftacrules(nodes);
	tftacrules.tt_return r2 = theRules.tt();
	newExpr = ((Tree)r2.tree).toStringTree();	

	do {	
		loopNr = loopNr + 1;		
		oldExpr = newExpr;
		if (!statusPure) {
			System.out.println(String.valueOf(loopNr)+": "+newExpr);
		}
		nodes = new CommonTreeNodeStream((Tree)r2.tree);
		nodes.setTokenStream(tokens);
		theRules = new tftacrules(nodes);
		r2 = theRules.tt();
		newExpr = ((Tree)r2.tree).toStringTree();	
	} while ( !( oldExpr.equals( newExpr ) ) );

	if (!statusPure) {
		System.out.println("VVG = "+oldExpr);
	}

	// CONVERT BACK TO INFIX-FORM
        nodes = new CommonTreeNodeStream((Tree)r2.tree);
        nodes.setTokenStream(tokens);
        tftacprinter printer = new tftacprinter(nodes);
        tftacprinter.infixform_return r4 = printer.infixform();
        System.out.println(r4.st.toString());


    }
}
