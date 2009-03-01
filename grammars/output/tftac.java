
import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

        
public class tftac { 
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) {
            input = new ANTLRFileStream(args[0]);
        }
        else {
            input = new ANTLRInputStream(System.in);
        }

        // BUILD AST
        tftacLexer lex = new tftacLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tftacParser parser = new tftacParser(tokens);
        tftacParser.expression_return r = parser.expression();
        System.out.println("tree="+((Tree)r.tree).toStringTree());
        
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
		System.out.println(String.valueOf(loopNr)+": "+newExpr);
		nodes = new CommonTreeNodeStream((Tree)r2.tree);
		nodes.setTokenStream(tokens);
		theRules = new tftacrules(nodes);
		r2 = theRules.tt();
		newExpr = ((Tree)r2.tree).toStringTree();	
	} while ( !( oldExpr.equals( newExpr ) ) );

	System.out.println("VVG = "+oldExpr);

	// CONVERT BACK TO INFIX-FORM
        nodes = new CommonTreeNodeStream((Tree)r2.tree);
        nodes.setTokenStream(tokens);
        tftacprinter printer = new tftacprinter(nodes);
        tftacprinter.infixform_return r4 = printer.infixform();
        System.out.println(r4.st.toString());


    }
}
