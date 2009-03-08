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
	// for the following, the defaults are shown.
	boolean statusSilent = false; // (not) show the short description of tftac program
	boolean statusPure   = false; // (not) show the intermediate transformation steps
	boolean statusSAND   = false; // (not) remove SANDs from result
	boolean statusFlat   = false; // (not) flatten the results (= untangle nested terms)
	boolean statusEXPAND = true; // (not) expand all ANDs
	boolean	statusMultiLine = true; // output is multilined by default

        if ( args.length>0 ) {
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-s") || args[i].equals("--silent")) { statusSilent = true; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-w") || args[i].equals("--withSAND")) { statusSAND = true; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("--noflat")) { statusFlat = true; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-p") || args[i].equals("--pure")) { statusPure = true; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 	// ATTENTION: changed default from "not expanded to expanded due to errors in tftacrules... (tbd)
 			if (args[i].equals("-e") || args[i].equals("--expand")) { statusEXPAND = false; } 
		}
		for ( int i = 0; i < args.length; i++ ) 
		{ 
 			if (args[i].equals("-m") || args[i].equals("--nomultiline")) { statusMultiLine = false; } 
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
		System.out.println("(1) TREEFORM OF INPUT\n"+((Tree)r.tree).toStringTree());
		System.out.println("");
	}
        
        String oldExpr = "";
	String newExpr = "";
	int loopNr = 0;

	CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)r.tree);

	// Simplify until no more changes possible
	// if option "-e" is set, then use tftacrulesfull (i.e. expand all ANDs totally)
	// otherwise use tftacrules (default, i.e. do not expand ANDs with only basic events)
	// the default *really* reduces the time needed for simplification!
	if (statusEXPAND == false) {
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
		nodes = new CommonTreeNodeStream((Tree)r2.tree);
	}
	if (statusEXPAND == true) {
		nodes.setTokenStream(tokens);
		tftacrulesfull theRules = new tftacrulesfull(nodes);
		tftacrulesfull.tt_return r2 = theRules.tt();
		newExpr = ((Tree)r2.tree).toStringTree();	

		do {	
			loopNr = loopNr + 1;		
			oldExpr = newExpr;
			if (!statusPure) {
				System.out.println(String.valueOf(loopNr)+": "+newExpr);
			}
			nodes = new CommonTreeNodeStream((Tree)r2.tree);
			nodes.setTokenStream(tokens);
			theRules = new tftacrulesfull(nodes);
			r2 = theRules.tt();
			newExpr = ((Tree)r2.tree).toStringTree();	
		} while ( !( oldExpr.equals( newExpr ) ) );
		nodes = new CommonTreeNodeStream((Tree)r2.tree);
	}
	if (!statusPure) {
		System.out.println("(2) SIMPLIFIED FORM\n"+oldExpr);
		System.out.println("");
	}
	
	// Remove all SANDs until no more changes recognized
	if (statusSAND == false) {
		oldExpr = "";
		newExpr = "";
		loopNr = 0;	
		nodes.setTokenStream(tokens);
		tftacSANDremover removeSAND = new tftacSANDremover(nodes);
		tftacSANDremover.expr_return r3 = removeSAND.expr();
		newExpr = ((Tree)r3.tree).toStringTree();	

		do {	
			loopNr = loopNr + 1;		
			oldExpr = newExpr;
			if (!statusPure) {
				System.out.println(String.valueOf(loopNr)+": "+newExpr);
			}
			nodes = new CommonTreeNodeStream((Tree)r3.tree);
			nodes.setTokenStream(tokens);
			removeSAND = new tftacSANDremover(nodes);
			r3 = removeSAND.expr();
			newExpr = ((Tree)r3.tree).toStringTree();	
		} while ( !( oldExpr.equals( newExpr ) ) );

		if (!statusPure) {
			System.out.println("(3) WITHOUT SANDS\n"+oldExpr);
			System.out.println("");
		}
		nodes = new CommonTreeNodeStream((Tree)r3.tree);
	} 

	// FLATTEN NESTED STRUCTURES UNTIL NO MORE CHANGES RECOGNIZED
	if (statusFlat == false) {
		oldExpr = "";
		newExpr = "";
		loopNr = 0;	
		nodes.setTokenStream(tokens);
		tftacflattener flatform = new tftacflattener(nodes);
		tftacflattener.tdnf_return r4 = flatform.tdnf();
		newExpr = ((Tree)r4.tree).toStringTree();	

		do {	
			loopNr = loopNr + 1;		
			oldExpr = newExpr;
			if (!statusPure) {
				System.out.println(String.valueOf(loopNr)+": "+newExpr);
			}
			nodes = new CommonTreeNodeStream((Tree)r4.tree);
			nodes.setTokenStream(tokens);
			flatform = new tftacflattener(nodes);
			r4 = flatform.tdnf();
			newExpr = ((Tree)r4.tree).toStringTree();	
		} while ( !( oldExpr.equals( newExpr ) ) );

		if (!statusPure) {
			System.out.println("(4) FLATTENED OUT FORM\n"+oldExpr);
			System.out.println("");
		}
		nodes = new CommonTreeNodeStream((Tree)r4.tree);
	} 
	
	nodes.setTokenStream(tokens);

	// remove "doubles" in AND and SAND terms
	tftaccommutat commutatform = new tftaccommutat(nodes);
	tftaccommutat.expression_return commutatresult = commutatform.expression();
	nodes = new CommonTreeNodeStream((Tree)commutatresult.tree);
	nodes.setTokenStream(tokens);
	tftacremovesingles singlelessform = new tftacremovesingles(nodes);
	tftacremovesingles.expression_return singlelessresult = singlelessform.expression();
	nodes = new CommonTreeNodeStream((Tree)singlelessresult.tree);
	
	newExpr = ((Tree)singlelessresult.tree).toStringTree();
	if (!statusPure) {
		System.out.println("(5) NO DOUBLES FORM AND/SAND\n"+newExpr);
		System.out.println("");
	}	

	nodes.setTokenStream(tokens);

	// CHECK WHETHER EVENTS OCCUR AFTER THEMSELVES --> FALSE
	tftacplausi plausiform = new tftacplausi(nodes);
	tftacplausi.expression_return plausiresult = plausiform.expression();
	newExpr = ((Tree)plausiresult.tree).toStringTree();

	nodes = new CommonTreeNodeStream((Tree)plausiresult.tree);
	nodes.setTokenStream(tokens);

	tftaccleanpands cleanpandform = new tftaccleanpands(nodes);
	tftaccleanpands.expression_return cleanpandresult = cleanpandform.expression();
	nodes = new CommonTreeNodeStream((Tree)cleanpandresult.tree);
	
	newExpr = ((Tree)cleanpandresult.tree).toStringTree();
	if (!statusPure) {
		System.out.println("(6) NO FALSE PANDs\n"+newExpr);
		System.out.println("");
	}

	nodes.setTokenStream(tokens);
	
	// CONVERT BACK TO INFIX-FORM
	// if "-m" option is not set (default) , then output is multiline with breaks at every OR or XOR
	// otherwise output is single line with explicit OR / XOR operators and braces set accordingly
	if (statusMultiLine == true) {
		tftacmultiprinter printer = new tftacmultiprinter(nodes);
		tftacmultiprinter.infixform_return r5 = printer.infixform();
		System.out.println(r5.st.toString());
	}
	if (statusMultiLine == false) {
		tftacprinter printer = new tftacprinter(nodes);
		tftacprinter.infixform_return r5 = printer.infixform();
		System.out.println(r5.st.toString());
	}
	
	
    }
}
