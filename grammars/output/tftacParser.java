// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g 2009-03-01 16:13:26

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class tftacParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OR", "XOR", "AND", "PAND", "SAND", "ID", "LBRACE", "RBRACE", "NOT", "TRUE", "FALSE", "INT", "WS"
    };
    public static final int WS=16;
    public static final int XOR=5;
    public static final int RBRACE=11;
    public static final int LBRACE=10;
    public static final int OR=4;
    public static final int PAND=7;
    public static final int INT=15;
    public static final int NOT=12;
    public static final int SAND=8;
    public static final int ID=9;
    public static final int AND=6;
    public static final int FALSE=14;
    public static final int EOF=-1;
    public static final int TRUE=13;

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:1: expression : term ( ( OR | XOR ) term )* ;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:13: ( term ( ( OR | XOR ) term )* )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:15: term ( ( OR | XOR ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_expression41);
            term1=term();

            state._fsp--;

            adaptor.addChild(root_0, term1.getTree());
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:20: ( ( OR | XOR ) term )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=OR && LA2_0<=XOR)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:22: ( OR | XOR ) term
            	    {
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:22: ( OR | XOR )
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
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:23: OR
            	            {
            	            OR2=(Token)match(input,OR,FOLLOW_OR_in_expression46); 
            	            OR2_tree = (Object)adaptor.create(OR2);
            	            root_0 = (Object)adaptor.becomeRoot(OR2_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:17:29: XOR
            	            {
            	            XOR3=(Token)match(input,XOR,FOLLOW_XOR_in_expression51); 
            	            XOR3_tree = (Object)adaptor.create(XOR3);
            	            root_0 = (Object)adaptor.becomeRoot(XOR3_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_expression55);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:1: term : factor ( ( AND | PAND | SAND ) factor )* ;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:7: ( factor ( ( AND | PAND | SAND ) factor )* )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:9: factor ( ( AND | PAND | SAND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term70);
            factor5=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor5.getTree());
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:16: ( ( AND | PAND | SAND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=AND && LA4_0<=SAND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:17: ( AND | PAND | SAND ) factor
            	    {
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:17: ( AND | PAND | SAND )
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
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:18: AND
            	            {
            	            AND6=(Token)match(input,AND,FOLLOW_AND_in_term74); 
            	            AND6_tree = (Object)adaptor.create(AND6);
            	            root_0 = (Object)adaptor.becomeRoot(AND6_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:25: PAND
            	            {
            	            PAND7=(Token)match(input,PAND,FOLLOW_PAND_in_term79); 
            	            PAND7_tree = (Object)adaptor.create(PAND7);
            	            root_0 = (Object)adaptor.becomeRoot(PAND7_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:20:33: SAND
            	            {
            	            SAND8=(Token)match(input,SAND,FOLLOW_SAND_in_term84); 
            	            SAND8_tree = (Object)adaptor.create(SAND8);
            	            root_0 = (Object)adaptor.becomeRoot(SAND8_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term88);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:23:1: factor : ( ID | LBRACE expression RBRACE | NOT factor | TRUE | FALSE );
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:23:9: ( ID | LBRACE expression RBRACE | NOT factor | TRUE | FALSE )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:23:11: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID10=(Token)match(input,ID,FOLLOW_ID_in_factor104); 
                    ID10_tree = (Object)adaptor.create(ID10);
                    adaptor.addChild(root_0, ID10_tree);


                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:24:5: LBRACE expression RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    LBRACE11=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_factor110); 
                    pushFollow(FOLLOW_expression_in_factor113);
                    expression12=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression12.getTree());
                    RBRACE13=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_factor115); 

                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:25:5: NOT factor
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT14=(Token)match(input,NOT,FOLLOW_NOT_in_factor122); 
                    NOT14_tree = (Object)adaptor.create(NOT14);
                    root_0 = (Object)adaptor.becomeRoot(NOT14_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor125);
                    factor15=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor15.getTree());

                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:26:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE16=(Token)match(input,TRUE,FOLLOW_TRUE_in_factor131); 
                    TRUE16_tree = (Object)adaptor.create(TRUE16);
                    adaptor.addChild(root_0, TRUE16_tree);


                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:26:12: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE17=(Token)match(input,FALSE,FOLLOW_FALSE_in_factor135); 
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


 

    public static final BitSet FOLLOW_term_in_expression41 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_OR_in_expression46 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_XOR_in_expression51 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_term_in_expression55 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_factor_in_term70 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_AND_in_term74 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_PAND_in_term79 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_SAND_in_term84 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_factor_in_term88 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_ID_in_factor104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_factor110 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_expression_in_factor113 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_factor115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor122 = new BitSet(new long[]{0x0000000000007600L});
    public static final BitSet FOLLOW_factor_in_factor125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor135 = new BitSet(new long[]{0x0000000000000002L});

}