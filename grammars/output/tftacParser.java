// $ANTLR 3.1.2 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g 2009-03-10 20:58:58

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class tftacParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OR", "XOR", "AND", "PAND", "SAND", "ID", "LBRACE", "RBRACE", "NOT", "TRUE", "FALSE", "A", "N", "D", "P", "S", "O", "R", "X", "T", "U", "E", "F", "L", "INT", "WS", "B", "C", "G", "H", "I", "J", "K", "M", "Q", "V", "W", "Y", "Z"
    };
    public static final int D=17;
    public static final int E=25;
    public static final int F=26;
    public static final int G=32;
    public static final int XOR=5;
    public static final int A=15;
    public static final int B=30;
    public static final int RBRACE=11;
    public static final int C=31;
    public static final int L=27;
    public static final int M=37;
    public static final int N=16;
    public static final int O=20;
    public static final int H=33;
    public static final int I=34;
    public static final int J=35;
    public static final int LBRACE=10;
    public static final int K=36;
    public static final int U=24;
    public static final int T=23;
    public static final int PAND=7;
    public static final int W=40;
    public static final int V=39;
    public static final int Q=38;
    public static final int INT=28;
    public static final int P=18;
    public static final int NOT=12;
    public static final int S=19;
    public static final int R=21;
    public static final int AND=6;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int TRUE=13;
    public static final int Y=41;
    public static final int X=22;
    public static final int Z=42;
    public static final int WS=29;
    public static final int OR=4;
    public static final int SAND=8;
    public static final int FALSE=14;

    // delegates
    // delegators


        public tftacParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacParser.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:1: expression : term ( ( OR | XOR ) term )* ;
    public final tftacParser.expression_return expression() throws RecognitionException {
        tftacParser.expression_return retval = new tftacParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR2=null;
        Token XOR3=null;
        tftacParser.term_return term1 = null;

        tftacParser.term_return term4 = null;


        Object OR2_tree=null;
        Object XOR3_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:13: ( term ( ( OR | XOR ) term )* )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:15: term ( ( OR | XOR ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_expression44);
            term1=term();

            state._fsp--;

            adaptor.addChild(root_0, term1.getTree());
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:20: ( ( OR | XOR ) term )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=OR && LA2_0<=XOR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:22: ( OR | XOR ) term
            	    {
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:22: ( OR | XOR )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==OR) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==XOR) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:23: OR
            	            {
            	            OR2=(Token)match(input,OR,FOLLOW_OR_in_expression49); 
            	            OR2_tree = (Object)adaptor.create(OR2);
            	            root_0 = (Object)adaptor.becomeRoot(OR2_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:29: XOR
            	            {
            	            XOR3=(Token)match(input,XOR,FOLLOW_XOR_in_expression54); 
            	            XOR3_tree = (Object)adaptor.create(XOR3);
            	            root_0 = (Object)adaptor.becomeRoot(XOR3_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_expression58);
            	    term4=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:1: term : factor ( ( AND | PAND | SAND ) factor )* ;
    public final tftacParser.term_return term() throws RecognitionException {
        tftacParser.term_return retval = new tftacParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND6=null;
        Token PAND7=null;
        Token SAND8=null;
        tftacParser.factor_return factor5 = null;

        tftacParser.factor_return factor9 = null;


        Object AND6_tree=null;
        Object PAND7_tree=null;
        Object SAND8_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:7: ( factor ( ( AND | PAND | SAND ) factor )* )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:9: factor ( ( AND | PAND | SAND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term73);
            factor5=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor5.getTree());
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:16: ( ( AND | PAND | SAND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=AND && LA4_0<=SAND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:17: ( AND | PAND | SAND ) factor
            	    {
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:17: ( AND | PAND | SAND )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case AND:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case PAND:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case SAND:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:18: AND
            	            {
            	            AND6=(Token)match(input,AND,FOLLOW_AND_in_term77); 
            	            AND6_tree = (Object)adaptor.create(AND6);
            	            root_0 = (Object)adaptor.becomeRoot(AND6_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:25: PAND
            	            {
            	            PAND7=(Token)match(input,PAND,FOLLOW_PAND_in_term82); 
            	            PAND7_tree = (Object)adaptor.create(PAND7);
            	            root_0 = (Object)adaptor.becomeRoot(PAND7_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:45:33: SAND
            	            {
            	            SAND8=(Token)match(input,SAND,FOLLOW_SAND_in_term87); 
            	            SAND8_tree = (Object)adaptor.create(SAND8);
            	            root_0 = (Object)adaptor.becomeRoot(SAND8_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term91);
            	    factor9=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:48:1: factor : ( ID | LBRACE expression RBRACE | NOT factor | TRUE | FALSE );
    public final tftacParser.factor_return factor() throws RecognitionException {
        tftacParser.factor_return retval = new tftacParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID10=null;
        Token LBRACE11=null;
        Token RBRACE13=null;
        Token NOT14=null;
        Token TRUE16=null;
        Token FALSE17=null;
        tftacParser.expression_return expression12 = null;

        tftacParser.factor_return factor15 = null;


        Object ID10_tree=null;
        Object LBRACE11_tree=null;
        Object RBRACE13_tree=null;
        Object NOT14_tree=null;
        Object TRUE16_tree=null;
        Object FALSE17_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:48:9: ( ID | LBRACE expression RBRACE | NOT factor | TRUE | FALSE )
            int alt5=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case LBRACE:
                {
                alt5=2;
                }
                break;
            case NOT:
                {
                alt5=3;
                }
                break;
            case TRUE:
                {
                alt5=4;
                }
                break;
            case FALSE:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:48:11: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID10=(Token)match(input,ID,FOLLOW_ID_in_factor107); 
                    ID10_tree = (Object)adaptor.create(ID10);
                    adaptor.addChild(root_0, ID10_tree);


                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:49:5: LBRACE expression RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    LBRACE11=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_factor113); 
                    pushFollow(FOLLOW_expression_in_factor116);
                    expression12=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression12.getTree());
                    RBRACE13=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_factor118); 

                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:50:5: NOT factor
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT14=(Token)match(input,NOT,FOLLOW_NOT_in_factor125); 
                    NOT14_tree = (Object)adaptor.create(NOT14);
                    root_0 = (Object)adaptor.becomeRoot(NOT14_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor128);
                    factor15=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor15.getTree());

                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:51:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE16=(Token)match(input,TRUE,FOLLOW_TRUE_in_factor134); 
                    TRUE16_tree = (Object)adaptor.create(TRUE16);
                    adaptor.addChild(root_0, TRUE16_tree);


                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:52:6: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE17=(Token)match(input,FALSE,FOLLOW_FALSE_in_factor142); 
                    FALSE17_tree = (Object)adaptor.create(FALSE17);
                    adaptor.addChild(root_0, FALSE17_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_term_in_expression44 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_OR_in_expression49 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_XOR_in_expression54 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_term_in_expression58 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_factor_in_term73 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_AND_in_term77 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_PAND_in_term82 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_SAND_in_term87 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_factor_in_term91 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_ID_in_factor107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_factor113 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_expression_in_factor116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_factor118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor125 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_factor_in_factor128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor142 = new BitSet(new long[]{0x0000000000000002L});

}