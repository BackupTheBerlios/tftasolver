// $ANTLR 3.1.2 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g 2009-03-14 12:47:31

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacrulesfull extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OR", "XOR", "AND", "PAND", "SAND", "ID", "LBRACE", "RBRACE", "NOT", "TRUE", "FALSE", "A", "N", "D", "P", "S", "O", "R", "X", "T", "U", "E", "F", "L", "NOTAND", "NOTPAND", "NOTSAND", "NOTOR", "NOTXOR", "NOTNOT", "INT", "WS", "B", "C", "G", "H", "I", "J", "K", "M", "Q", "V", "W", "Y", "Z"
    };
    public static final int LBRACE=10;
    public static final int PAND=7;
    public static final int NOTAND=28;
    public static final int NOT=12;
    public static final int AND=6;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int SAND=8;
    public static final int NOTOR=31;
    public static final int D=17;
    public static final int E=25;
    public static final int F=26;
    public static final int G=38;
    public static final int XOR=5;
    public static final int A=15;
    public static final int B=36;
    public static final int RBRACE=11;
    public static final int C=37;
    public static final int L=27;
    public static final int M=43;
    public static final int N=16;
    public static final int O=20;
    public static final int H=39;
    public static final int I=40;
    public static final int J=41;
    public static final int K=42;
    public static final int U=24;
    public static final int T=23;
    public static final int W=46;
    public static final int V=45;
    public static final int Q=44;
    public static final int NOTPAND=29;
    public static final int INT=34;
    public static final int P=18;
    public static final int S=19;
    public static final int R=21;
    public static final int NOTSAND=30;
    public static final int TRUE=13;
    public static final int Y=47;
    public static final int X=22;
    public static final int Z=48;
    public static final int WS=35;
    public static final int NOTNOT=33;
    public static final int OR=4;
    public static final int NOTXOR=32;
    public static final int FALSE=14;

    // delegates
    // delegators


        public tftacrulesfull(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacrulesfull(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[116+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacrulesfull.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();


    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:46:1: expression : ( tdnf | tt );
    public final tftacrulesfull.expression_return expression() throws RecognitionException {
        tftacrulesfull.expression_return retval = new tftacrulesfull.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrulesfull.tdnf_return tdnf1 = null;

        tftacrulesfull.tt_return tt2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:47:2: ( tdnf | tt )
            int alt1=2;
            switch ( input.LA(1) ) {
            case ID:
            case TRUE:
            case FALSE:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_tftacrulesfull()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case SAND:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_tftacrulesfull()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case PAND:
                {
                int LA1_3 = input.LA(2);

                if ( (synpred1_tftacrulesfull()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case AND:
                {
                int LA1_4 = input.LA(2);

                if ( (synpred1_tftacrulesfull()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case OR:
                {
                int LA1_5 = input.LA(2);

                if ( (synpred1_tftacrulesfull()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case XOR:
                {
                int LA1_6 = input.LA(2);

                if ( (synpred1_tftacrulesfull()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:47:4: tdnf
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tdnf_in_expression67);
                    tdnf1=tdnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, tdnf1.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:48:4: tt
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_expression73);
                    tt2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, tt2.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class ae_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:54:1: ae : ( ID | TRUE | FALSE );
    public final tftacrulesfull.ae_return ae() throws RecognitionException {
        tftacrulesfull.ae_return retval = new tftacrulesfull.ae_return();
        retval.start = input.LT(1);
        int ae_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set3=null;

        Object set3_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:54:5: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set3=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set3_tree = (Object)adaptor.dupNode(set3);

                adaptor.addChild(root_0, set3_tree);
                }
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ae_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ae"

    public static class ce_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ce"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:60:1: ce : ( ae | ^( SAND ce ae ) );
    public final tftacrulesfull.ce_return ce() throws RecognitionException {
        tftacrulesfull.ce_return retval = new tftacrulesfull.ce_return();
        retval.start = input.LT(1);
        int ce_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND5=null;
        tftacrulesfull.ae_return ae4 = null;

        tftacrulesfull.ce_return ce6 = null;

        tftacrulesfull.ae_return ae7 = null;


        Object SAND5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:60:4: ( ae | ^( SAND ce ae ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||(LA2_0>=TRUE && LA2_0<=FALSE)) ) {
                alt2=1;
            }
            else if ( (LA2_0==SAND) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:60:6: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_ce113);
                    ae4=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae4.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:61:4: ^( SAND ce ae )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND5=(Object)match(input,SAND,FOLLOW_SAND_in_ce119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND5_tree = (Object)adaptor.dupNode(SAND5);

                    root_1 = (Object)adaptor.becomeRoot(SAND5_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_ce121);
                    ce6=ce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ce6.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_ce123);
                    ae7=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ae7.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, ce_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ce"

    public static class nae_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:1: nae : ^( NOT ae ) ;
    public final tftacrulesfull.nae_return nae() throws RecognitionException {
        tftacrulesfull.nae_return retval = new tftacrulesfull.nae_return();
        retval.start = input.LT(1);
        int nae_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT8=null;
        tftacrulesfull.ae_return ae9 = null;


        Object NOT8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:5: ( ^( NOT ae ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:7: ^( NOT ae )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            NOT8=(Object)match(input,NOT,FOLLOW_NOT_in_nae136); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NOT8_tree = (Object)adaptor.dupNode(NOT8);

            root_1 = (Object)adaptor.becomeRoot(NOT8_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_ae_in_nae138);
            ae9=ae();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, ae9.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, nae_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nae"

    public static class nce_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nce"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:1: nce : ( nae | ^( AND nce nae ) );
    public final tftacrulesfull.nce_return nce() throws RecognitionException {
        tftacrulesfull.nce_return retval = new tftacrulesfull.nce_return();
        retval.start = input.LT(1);
        int nce_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND11=null;
        tftacrulesfull.nae_return nae10 = null;

        tftacrulesfull.nce_return nce12 = null;

        tftacrulesfull.nae_return nae13 = null;


        Object AND11_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:5: ( nae | ^( AND nce nae ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NOT) ) {
                alt3=1;
            }
            else if ( (LA3_0==AND) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:7: nae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nae_in_nce149);
                    nae10=nae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nae10.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:69:4: ^( AND nce nae )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND11=(Object)match(input,AND,FOLLOW_AND_in_nce155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND11_tree = (Object)adaptor.dupNode(AND11);

                    root_1 = (Object)adaptor.becomeRoot(AND11_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nce_in_nce157);
                    nce12=nce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, nce12.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nae_in_nce159);
                    nae13=nae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, nae13.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, nce_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nce"

    public static class es_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "es"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:1: es : ( ce | ^( PAND es ce ) );
    public final tftacrulesfull.es_return es() throws RecognitionException {
        tftacrulesfull.es_return retval = new tftacrulesfull.es_return();
        retval.start = input.LT(1);
        int es_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND15=null;
        tftacrulesfull.ce_return ce14 = null;

        tftacrulesfull.es_return es16 = null;

        tftacrulesfull.ce_return ce17 = null;


        Object PAND15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:4: ( ce | ^( PAND es ce ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=SAND && LA4_0<=ID)||(LA4_0>=TRUE && LA4_0<=FALSE)) ) {
                alt4=1;
            }
            else if ( (LA4_0==PAND) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:6: ce
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_es171);
                    ce14=ce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ce14.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:74:4: ^( PAND es ce )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND15=(Object)match(input,PAND,FOLLOW_PAND_in_es177); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND15_tree = (Object)adaptor.dupNode(PAND15);

                    root_1 = (Object)adaptor.becomeRoot(PAND15_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_es_in_es179);
                    es16=es();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, es16.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_es181);
                    ce17=ce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ce17.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, es_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "es"

    public static class nes_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nes"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:78:1: nes : ^( AND nce es ) ;
    public final tftacrulesfull.nes_return nes() throws RecognitionException {
        tftacrulesfull.nes_return retval = new tftacrulesfull.nes_return();
        retval.start = input.LT(1);
        int nes_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND18=null;
        tftacrulesfull.nce_return nce19 = null;

        tftacrulesfull.es_return es20 = null;


        Object AND18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:78:5: ( ^( AND nce es ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:78:7: ^( AND nce es )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            AND18=(Object)match(input,AND,FOLLOW_AND_in_nes194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AND18_tree = (Object)adaptor.dupNode(AND18);

            root_1 = (Object)adaptor.becomeRoot(AND18_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_nce_in_nes196);
            nce19=nce();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, nce19.getTree());
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_es_in_nes198);
            es20=es();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, es20.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, nes_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nes"

    public static class tdnf_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tdnf"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:82:1: tdnf : ( es | nes | ^( OR tdnf tdnf ) | ^( XOR tdnf tdnf ) );
    public final tftacrulesfull.tdnf_return tdnf() throws RecognitionException {
        tftacrulesfull.tdnf_return retval = new tftacrulesfull.tdnf_return();
        retval.start = input.LT(1);
        int tdnf_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR23=null;
        Object XOR26=null;
        tftacrulesfull.es_return es21 = null;

        tftacrulesfull.nes_return nes22 = null;

        tftacrulesfull.tdnf_return tdnf24 = null;

        tftacrulesfull.tdnf_return tdnf25 = null;

        tftacrulesfull.tdnf_return tdnf27 = null;

        tftacrulesfull.tdnf_return tdnf28 = null;


        Object OR23_tree=null;
        Object XOR26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:82:6: ( es | nes | ^( OR tdnf tdnf ) | ^( XOR tdnf tdnf ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case PAND:
            case SAND:
            case ID:
            case TRUE:
            case FALSE:
                {
                alt5=1;
                }
                break;
            case AND:
                {
                alt5=2;
                }
                break;
            case OR:
                {
                alt5=3;
                }
                break;
            case XOR:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:82:8: es
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_es_in_tdnf211);
                    es21=es();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, es21.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: nes
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nes_in_tdnf216);
                    nes22=nes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nes22.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:4: ^( OR tdnf tdnf )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR23=(Object)match(input,OR,FOLLOW_OR_in_tdnf222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR23_tree = (Object)adaptor.dupNode(OR23);

                    root_1 = (Object)adaptor.becomeRoot(OR23_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tdnf_in_tdnf224);
                    tdnf24=tdnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tdnf24.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tdnf_in_tdnf226);
                    tdnf25=tdnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tdnf25.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ^( XOR tdnf tdnf )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR26=(Object)match(input,XOR,FOLLOW_XOR_in_tdnf233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR26_tree = (Object)adaptor.dupNode(XOR26);

                    root_1 = (Object)adaptor.becomeRoot(XOR26_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tdnf_in_tdnf235);
                    tdnf27=tdnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tdnf27.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tdnf_in_tdnf237);
                    tdnf28=tdnf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tdnf28.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, tdnf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tdnf"

    public static class tt_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tt"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:1: tt : ( atom | andTerm | orTerm | xorTerm | pandTerm | sandTerm | notNOTTerm );
    public final tftacrulesfull.tt_return tt() throws RecognitionException {
        tftacrulesfull.tt_return retval = new tftacrulesfull.tt_return();
        retval.start = input.LT(1);
        int tt_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrulesfull.atom_return atom29 = null;

        tftacrulesfull.andTerm_return andTerm30 = null;

        tftacrulesfull.orTerm_return orTerm31 = null;

        tftacrulesfull.xorTerm_return xorTerm32 = null;

        tftacrulesfull.pandTerm_return pandTerm33 = null;

        tftacrulesfull.sandTerm_return sandTerm34 = null;

        tftacrulesfull.notNOTTerm_return notNOTTerm35 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:5: ( atom | andTerm | orTerm | xorTerm | pandTerm | sandTerm | notNOTTerm )
            int alt6=7;
            switch ( input.LA(1) ) {
            case ID:
            case TRUE:
            case FALSE:
                {
                alt6=1;
                }
                break;
            case AND:
                {
                alt6=2;
                }
                break;
            case OR:
                {
                alt6=3;
                }
                break;
            case XOR:
                {
                alt6=4;
                }
                break;
            case PAND:
                {
                alt6=5;
                }
                break;
            case SAND:
                {
                alt6=6;
                }
                break;
            case NOT:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:7: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_tt256);
                    atom29=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom29.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:94:4: andTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andTerm_in_tt261);
                    andTerm30=andTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andTerm30.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:95:4: orTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_orTerm_in_tt266);
                    orTerm31=orTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, orTerm31.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:96:4: xorTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_xorTerm_in_tt271);
                    xorTerm32=xorTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, xorTerm32.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:4: pandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandTerm_in_tt276);
                    pandTerm33=pandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandTerm33.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:98:4: sandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandTerm_in_tt281);
                    sandTerm34=sandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandTerm34.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:99:4: notNOTTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notNOTTerm_in_tt286);
                    notNOTTerm35=notNOTTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, notNOTTerm35.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, tt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tt"

    public static class atom_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:1: atom : ae ;
    public final tftacrulesfull.atom_return atom() throws RecognitionException {
        tftacrulesfull.atom_return retval = new tftacrulesfull.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrulesfull.ae_return ae36 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:6: ( ae )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:8: ae
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_ae_in_atom306);
            ae36=ae();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, ae36.getTree());

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class andTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:1: andTerm : ( ^( AND ( . ) FALSE ) -> FALSE | ^( AND FALSE ( . ) ) -> FALSE | ^( AND TRUE q= ( . ) ) -> $q | ^( AND q= ( . ) TRUE ) -> $q | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) | andTermWithNegated | ^( AND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) );
    public final tftacrulesfull.andTerm_return andTerm() throws RecognitionException {
        tftacrulesfull.andTerm_return retval = new tftacrulesfull.andTerm_return();
        retval.start = input.LT(1);
        int andTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object q=null;
        Object AND37=null;
        Object wildcard38=null;
        Object FALSE39=null;
        Object AND40=null;
        Object FALSE41=null;
        Object wildcard42=null;
        Object AND43=null;
        Object TRUE44=null;
        Object wildcard45=null;
        Object AND46=null;
        Object wildcard47=null;
        Object TRUE48=null;
        Object AND49=null;
        Object XOR50=null;
        Object AND51=null;
        Object XOR52=null;
        Object AND53=null;
        Object OR54=null;
        Object AND55=null;
        Object OR56=null;
        Object AND57=null;
        Object AND58=null;
        Object AND62=null;
        Object AND63=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.tt_return tt59 = null;

        tftacrulesfull.tt_return tt60 = null;

        tftacrulesfull.andTermWithNegated_return andTermWithNegated61 = null;


        Object q_tree=null;
        Object AND37_tree=null;
        Object wildcard38_tree=null;
        Object FALSE39_tree=null;
        Object AND40_tree=null;
        Object FALSE41_tree=null;
        Object wildcard42_tree=null;
        Object AND43_tree=null;
        Object TRUE44_tree=null;
        Object wildcard45_tree=null;
        Object AND46_tree=null;
        Object wildcard47_tree=null;
        Object TRUE48_tree=null;
        Object AND49_tree=null;
        Object XOR50_tree=null;
        Object AND51_tree=null;
        Object XOR52_tree=null;
        Object AND53_tree=null;
        Object OR54_tree=null;
        Object AND55_tree=null;
        Object OR56_tree=null;
        Object AND57_tree=null;
        Object AND58_tree=null;
        Object AND62_tree=null;
        Object AND63_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notTerm=new RewriteRuleSubtreeStream(adaptor,"rule notTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:9: ( ^( AND ( . ) FALSE ) -> FALSE | ^( AND FALSE ( . ) ) -> FALSE | ^( AND TRUE q= ( . ) ) -> $q | ^( AND q= ( . ) TRUE ) -> $q | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) | andTermWithNegated | ^( AND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) )
            int alt7=12;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:11: ^( AND ( . ) FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND37=(Object)match(input,AND,FOLLOW_AND_in_andTerm319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND37);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard38=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard38_tree = (Object)adaptor.dupTree(wildcard38);
                    adaptor.addChild(root_1, wildcard38_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    FALSE39=(Object)match(input,FALSE,FOLLOW_FALSE_in_andTerm325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE39);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:4: ^( AND FALSE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND40=(Object)match(input,AND,FOLLOW_AND_in_andTerm340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND40);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE41=(Object)match(input,FALSE,FOLLOW_FALSE_in_andTerm342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE41);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:16: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:17: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard42=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard42_tree = (Object)adaptor.dupTree(wildcard42);
                    adaptor.addChild(root_1, wildcard42_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:4: ^( AND TRUE q= ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND43=(Object)match(input,AND,FOLLOW_AND_in_andTerm360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND43);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE44=(Object)match(input,TRUE,FOLLOW_TRUE_in_andTerm362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE44);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard45=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard45_tree = (Object)adaptor.dupTree(wildcard45);
                    adaptor.addChild(root_1, wildcard45_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q
                    // token labels: q
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_q=new RewriteRuleNodeStream(adaptor,"token q",q);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:4: ^( AND q= ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND46=(Object)match(input,AND,FOLLOW_AND_in_andTerm383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND46);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:12: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:13: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard47=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard47_tree = (Object)adaptor.dupTree(wildcard47);
                    adaptor.addChild(root_1, wildcard47_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE48=(Object)match(input,TRUE,FOLLOW_TRUE_in_andTerm391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE48);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q
                    // token labels: q
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_q=new RewriteRuleNodeStream(adaptor,"token q",q);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND49=(Object)match(input,AND,FOLLOW_AND_in_andTerm406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND49);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR50=(Object)match(input,XOR,FOLLOW_XOR_in_andTerm409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR50);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm413);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm417);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm422);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, XOR, z, AND, y, z, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:26: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:4: ^( AND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND51=(Object)match(input,AND,FOLLOW_AND_in_andTerm460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND51);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm464);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR52=(Object)match(input,XOR,FOLLOW_XOR_in_andTerm467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR52);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm471);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm475);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, z, z, x, y, AND, AND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:26: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:4: ^( AND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND53=(Object)match(input,AND,FOLLOW_AND_in_andTerm514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND53);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR54=(Object)match(input,OR,FOLLOW_OR_in_andTerm517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR54);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm521);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm525);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm530);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, z, y, OR, z, AND, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:25: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:121:4: ^( AND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND55=(Object)match(input,AND,FOLLOW_AND_in_andTerm569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND55);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm573);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR56=(Object)match(input,OR,FOLLOW_OR_in_andTerm576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR56);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm580);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm584);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, y, z, AND, x, OR
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:122:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:122:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:122:25: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:4: ^( AND x= tt y= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND57=(Object)match(input,AND,FOLLOW_AND_in_andTerm622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND57);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm626);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm630);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, x, y, y, y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:4: -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:7: ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:13: ^( XOR ^( PAND $y $x) ^( PAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:19: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:33: ^( PAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:48: ^( SAND $x $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ^( AND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND58=(Object)match(input,AND,FOLLOW_AND_in_andTerm681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND58_tree = (Object)adaptor.dupNode(AND58);

                    root_1 = (Object)adaptor.becomeRoot(AND58_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm683);
                    tt59=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt59.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm685);
                    tt60=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt60.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:126:4: andTermWithNegated
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andTermWithNegated_in_andTerm691);
                    andTermWithNegated61=andTermWithNegated();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andTermWithNegated61.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:127:4: ^( AND ^( AND n1= notTerm m1= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND62=(Object)match(input,AND,FOLLOW_AND_in_andTerm697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND62);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND63=(Object)match(input,AND,FOLLOW_AND_in_andTerm700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND63);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTerm704);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm708);
                    m1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTerm713);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, n1, z, m1, m1, n1, AND, n1, z, m1, AND
                    // token labels: 
                    // rule labels: n1, retval, m1, z
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:4: -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:7: ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:13: ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:19: ^( AND $n1 ^( AND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:29: ^( AND $m1 $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:44: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:51: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:62: ^( NOT $n1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_5);

                        adaptor.addChild(root_5, stream_n1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:99: ^( NOT $n1)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_n1.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, andTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andTerm"

    public static class orTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:1: orTerm : ( ^( OR ( . ) TRUE ) -> TRUE | ^( OR TRUE ( . ) ) -> TRUE | ^( OR FALSE q= tt ) -> $q | ^( OR q= tt FALSE ) -> $q | ^( OR a= tt ^( OR b= tt c= tt ) ) -> ^( OR ^( OR $a $b) $c) | ^( OR tt tt ) );
    public final tftacrulesfull.orTerm_return orTerm() throws RecognitionException {
        tftacrulesfull.orTerm_return retval = new tftacrulesfull.orTerm_return();
        retval.start = input.LT(1);
        int orTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR64=null;
        Object wildcard65=null;
        Object TRUE66=null;
        Object OR67=null;
        Object TRUE68=null;
        Object wildcard69=null;
        Object OR70=null;
        Object FALSE71=null;
        Object OR72=null;
        Object FALSE73=null;
        Object OR74=null;
        Object OR75=null;
        Object OR76=null;
        tftacrulesfull.tt_return q = null;

        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;

        tftacrulesfull.tt_return tt77 = null;

        tftacrulesfull.tt_return tt78 = null;


        Object OR64_tree=null;
        Object wildcard65_tree=null;
        Object TRUE66_tree=null;
        Object OR67_tree=null;
        Object TRUE68_tree=null;
        Object wildcard69_tree=null;
        Object OR70_tree=null;
        Object FALSE71_tree=null;
        Object OR72_tree=null;
        Object FALSE73_tree=null;
        Object OR74_tree=null;
        Object OR75_tree=null;
        Object OR76_tree=null;
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:8: ( ^( OR ( . ) TRUE ) -> TRUE | ^( OR TRUE ( . ) ) -> TRUE | ^( OR FALSE q= tt ) -> $q | ^( OR q= tt FALSE ) -> $q | ^( OR a= tt ^( OR b= tt c= tt ) ) -> ^( OR ^( OR $a $b) $c) | ^( OR tt tt ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==OR) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred27_tftacrulesfull()) ) {
                    alt8=1;
                }
                else if ( (synpred28_tftacrulesfull()) ) {
                    alt8=2;
                }
                else if ( (synpred29_tftacrulesfull()) ) {
                    alt8=3;
                }
                else if ( (synpred30_tftacrulesfull()) ) {
                    alt8=4;
                }
                else if ( (synpred31_tftacrulesfull()) ) {
                    alt8=5;
                }
                else if ( (true) ) {
                    alt8=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:10: ^( OR ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR64=(Object)match(input,OR,FOLLOW_OR_in_orTerm802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR64);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:15: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:16: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard65=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard65_tree = (Object)adaptor.dupTree(wildcard65);
                    adaptor.addChild(root_1, wildcard65_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE66=(Object)match(input,TRUE,FOLLOW_TRUE_in_orTerm808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE66);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ^( OR TRUE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR67=(Object)match(input,OR,FOLLOW_OR_in_orTerm823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR67);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE68=(Object)match(input,TRUE,FOLLOW_TRUE_in_orTerm825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE68);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:14: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:15: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard69=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard69_tree = (Object)adaptor.dupTree(wildcard69);
                    adaptor.addChild(root_1, wildcard69_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ^( OR FALSE q= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR70=(Object)match(input,OR,FOLLOW_OR_in_orTerm843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR70);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE71=(Object)match(input,FALSE,FOLLOW_FALSE_in_orTerm845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE71);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm849);
                    q=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(q.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q
                    // token labels: 
                    // rule labels: retval, q
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ^( OR q= tt FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR72=(Object)match(input,OR,FOLLOW_OR_in_orTerm864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR72);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm868);
                    q=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(q.getTree());
                    _last = (Object)input.LT(1);
                    FALSE73=(Object)match(input,FALSE,FOLLOW_FALSE_in_orTerm870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE73);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q
                    // token labels: 
                    // rule labels: retval, q
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:140:4: ^( OR a= tt ^( OR b= tt c= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR74=(Object)match(input,OR,FOLLOW_OR_in_orTerm885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR74);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm889);
                    a=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(a.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR75=(Object)match(input,OR,FOLLOW_OR_in_orTerm892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR75);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm896);
                    b=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm900);
                    c=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(c.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, b, a, OR, c
                    // token labels: 
                    // rule labels: retval, b, c, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:4: -> ^( OR ^( OR $a $b) $c)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:141:7: ^( OR ^( OR $a $b) $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:141:12: ^( OR $a $b)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());
                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:142:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR76=(Object)match(input,OR,FOLLOW_OR_in_orTerm930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR76_tree = (Object)adaptor.dupNode(OR76);

                    root_1 = (Object)adaptor.becomeRoot(OR76_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm932);
                    tt77=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt77.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm934);
                    tt78=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt78.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, orTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orTerm"

    public static class xorTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xorTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:1: xorTerm : ( ^( XOR ( . ) TRUE ) -> TRUE | ^( XOR TRUE ( . ) ) -> TRUE | ^( XOR FALSE q= tt ) -> $q | ^( XOR q= tt FALSE ) -> $q | ^( XOR a= tt ^( XOR b= tt c= tt ) ) -> ^( XOR ^( XOR $a $b) $c) | ^( XOR tt tt ) );
    public final tftacrulesfull.xorTerm_return xorTerm() throws RecognitionException {
        tftacrulesfull.xorTerm_return retval = new tftacrulesfull.xorTerm_return();
        retval.start = input.LT(1);
        int xorTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR79=null;
        Object wildcard80=null;
        Object TRUE81=null;
        Object XOR82=null;
        Object TRUE83=null;
        Object wildcard84=null;
        Object XOR85=null;
        Object FALSE86=null;
        Object XOR87=null;
        Object FALSE88=null;
        Object XOR89=null;
        Object XOR90=null;
        Object XOR91=null;
        tftacrulesfull.tt_return q = null;

        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;

        tftacrulesfull.tt_return tt92 = null;

        tftacrulesfull.tt_return tt93 = null;


        Object XOR79_tree=null;
        Object wildcard80_tree=null;
        Object TRUE81_tree=null;
        Object XOR82_tree=null;
        Object TRUE83_tree=null;
        Object wildcard84_tree=null;
        Object XOR85_tree=null;
        Object FALSE86_tree=null;
        Object XOR87_tree=null;
        Object FALSE88_tree=null;
        Object XOR89_tree=null;
        Object XOR90_tree=null;
        Object XOR91_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:9: ( ^( XOR ( . ) TRUE ) -> TRUE | ^( XOR TRUE ( . ) ) -> TRUE | ^( XOR FALSE q= tt ) -> $q | ^( XOR q= tt FALSE ) -> $q | ^( XOR a= tt ^( XOR b= tt c= tt ) ) -> ^( XOR ^( XOR $a $b) $c) | ^( XOR tt tt ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==XOR) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred32_tftacrulesfull()) ) {
                    alt9=1;
                }
                else if ( (synpred33_tftacrulesfull()) ) {
                    alt9=2;
                }
                else if ( (synpred34_tftacrulesfull()) ) {
                    alt9=3;
                }
                else if ( (synpred35_tftacrulesfull()) ) {
                    alt9=4;
                }
                else if ( (synpred36_tftacrulesfull()) ) {
                    alt9=5;
                }
                else if ( (true) ) {
                    alt9=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:11: ^( XOR ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR79=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR79);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard80=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard80_tree = (Object)adaptor.dupTree(wildcard80);
                    adaptor.addChild(root_1, wildcard80_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE81=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorTerm954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE81);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ^( XOR TRUE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR82=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR82);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE83=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorTerm971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE83);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:15: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:16: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard84=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard84_tree = (Object)adaptor.dupTree(wildcard84);
                    adaptor.addChild(root_1, wildcard84_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ^( XOR FALSE q= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR85=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR85);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE86=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorTerm991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE86);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm995);
                    q=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(q.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q
                    // token labels: 
                    // rule labels: retval, q
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( XOR q= tt FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR87=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm1010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR87);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm1014);
                    q=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(q.getTree());
                    _last = (Object)input.LT(1);
                    FALSE88=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorTerm1016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE88);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q
                    // token labels: 
                    // rule labels: retval, q
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ^( XOR a= tt ^( XOR b= tt c= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR89=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm1031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR89);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm1035);
                    a=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(a.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR90=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm1038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR90);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm1042);
                    b=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm1046);
                    c=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(c.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: c, a, XOR, b, XOR
                    // token labels: 
                    // rule labels: retval, b, c, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:4: -> ^( XOR ^( XOR $a $b) $c)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:155:7: ^( XOR ^( XOR $a $b) $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:155:13: ^( XOR $a $b)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());
                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:156:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR91=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR91_tree = (Object)adaptor.dupNode(XOR91);

                    root_1 = (Object)adaptor.becomeRoot(XOR91_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm1078);
                    tt92=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt92.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm1080);
                    tt93=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt93.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, xorTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "xorTerm"

    public static class pandTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:1: pandTerm : ( ^( PAND ( . ) FALSE ) -> FALSE | ^( PAND FALSE ( . ) ) -> FALSE | ^( PAND ( . ) TRUE ) -> FALSE | ^( PAND TRUE x= tt ) -> $x | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notTerm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );
    public final tftacrulesfull.pandTerm_return pandTerm() throws RecognitionException {
        tftacrulesfull.pandTerm_return retval = new tftacrulesfull.pandTerm_return();
        retval.start = input.LT(1);
        int pandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND94=null;
        Object wildcard95=null;
        Object FALSE96=null;
        Object PAND97=null;
        Object FALSE98=null;
        Object wildcard99=null;
        Object PAND100=null;
        Object wildcard101=null;
        Object TRUE102=null;
        Object PAND103=null;
        Object TRUE104=null;
        Object PAND105=null;
        Object XOR106=null;
        Object PAND107=null;
        Object XOR108=null;
        Object PAND109=null;
        Object OR110=null;
        Object PAND111=null;
        Object OR112=null;
        Object PAND113=null;
        Object PAND114=null;
        Object PAND115=null;
        Object AND116=null;
        Object PAND117=null;
        Object AND118=null;
        Object PAND119=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notTerm_return b = null;

        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.tt_return tt120 = null;

        tftacrulesfull.tt_return tt121 = null;


        Object PAND94_tree=null;
        Object wildcard95_tree=null;
        Object FALSE96_tree=null;
        Object PAND97_tree=null;
        Object FALSE98_tree=null;
        Object wildcard99_tree=null;
        Object PAND100_tree=null;
        Object wildcard101_tree=null;
        Object TRUE102_tree=null;
        Object PAND103_tree=null;
        Object TRUE104_tree=null;
        Object PAND105_tree=null;
        Object XOR106_tree=null;
        Object PAND107_tree=null;
        Object XOR108_tree=null;
        Object PAND109_tree=null;
        Object OR110_tree=null;
        Object PAND111_tree=null;
        Object OR112_tree=null;
        Object PAND113_tree=null;
        Object PAND114_tree=null;
        Object PAND115_tree=null;
        Object AND116_tree=null;
        Object PAND117_tree=null;
        Object AND118_tree=null;
        Object PAND119_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notTerm=new RewriteRuleSubtreeStream(adaptor,"rule notTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:9: ( ^( PAND ( . ) FALSE ) -> FALSE | ^( PAND FALSE ( . ) ) -> FALSE | ^( PAND ( . ) TRUE ) -> FALSE | ^( PAND TRUE x= tt ) -> $x | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notTerm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) )
            int alt10=12;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:11: ^( PAND ( . ) FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND94=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND94);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:18: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:19: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard95=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard95_tree = (Object)adaptor.dupTree(wildcard95);
                    adaptor.addChild(root_1, wildcard95_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    FALSE96=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandTerm1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE96);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:4: ^( PAND FALSE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND97=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND97);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE98=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandTerm1116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE98);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard99=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard99_tree = (Object)adaptor.dupTree(wildcard99);
                    adaptor.addChild(root_1, wildcard99_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:4: ^( PAND ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND100=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND100);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:11: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:12: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard101=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard101_tree = (Object)adaptor.dupTree(wildcard101);
                    adaptor.addChild(root_1, wildcard101_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE102=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandTerm1140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE102);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:4: ^( PAND TRUE x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND103=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND103);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE104=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandTerm1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE104);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1161);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x
                    // token labels: 
                    // rule labels: retval, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:4: -> $x
                    {
                        adaptor.addChild(root_0, stream_x.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND105=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND105);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR106=(Object)match(input,XOR,FOLLOW_XOR_in_pandTerm1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR106);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1183);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1187);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1192);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, PAND, z, XOR, y, PAND, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:4: -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:7: ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:13: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:27: ^( PAND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND107=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND107);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1233);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR108=(Object)match(input,XOR,FOLLOW_XOR_in_pandTerm1236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR108);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1240);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1244);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, XOR, z, z, PAND, y, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:4: -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:7: ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:13: ^( PAND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:27: ^( PAND $z $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND109=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND109);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR110=(Object)match(input,OR,FOLLOW_OR_in_pandTerm1286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR110);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1290);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1294);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1299);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, y, PAND, z, OR, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:4: -> ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:7: ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:12: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:26: ^( PAND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND111=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND111);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1340);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR112=(Object)match(input,OR,FOLLOW_OR_in_pandTerm1343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR112);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1347);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1351);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, y, y, x, z, PAND, z, PAND, z, PAND, x, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:13: ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:19: ^( AND ^( NOT $x) ^( PAND $z $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:25: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:35: ^( PAND $z $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:16: ^( AND ^( NOT $y) ^( PAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:22: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:32: ^( PAND $z $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:10: ^( PAND $z ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:20: ^( SAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND113=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND113);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1465);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND114=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND114);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1472);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1476);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, y, x, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:4: -> ^( PAND ^( AND $x $z) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:179:7: ^( PAND ^( AND $x $z) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:179:14: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ^( PAND x= tt ^( AND b= notTerm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND115=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND115);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1510);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND116=(Object)match(input,AND,FOLLOW_AND_in_pandTerm1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND116);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_pandTerm1517);
                    b=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1521);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, z, b, x, PAND
                    // token labels: 
                    // rule labels: retval, b, z, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:4: -> ^( AND $b ^( PAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:7: ^( AND $b ^( PAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:16: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:4: ^( PAND ^( AND n1= notTerm m1= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND117=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND117);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND118=(Object)match(input,AND,FOLLOW_AND_in_pandTerm1554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND118);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_pandTerm1558);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1562);
                    m1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1567);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, AND, PAND, PAND, n1, PAND, m1, z, z, m1, n1, z, n1, m1
                    // token labels: 
                    // rule labels: n1, retval, m1, z
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:4: -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:7: ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:13: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:19: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:26: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:37: ^( NOT $n1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_5);

                        adaptor.addChild(root_5, stream_n1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:12: ^( AND $n1 ^( PAND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:22: ^( PAND $m1 $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:6: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:17: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:24: ^( NOT $n1)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_n1.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:4: ^( PAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND119=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND119_tree = (Object)adaptor.dupNode(PAND119);

                    root_1 = (Object)adaptor.becomeRoot(PAND119_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1680);
                    tt120=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt120.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1682);
                    tt121=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt121.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, pandTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandTerm"

    public static class sandTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sandTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:1: sandTerm : ( ^( SAND ( . ) FALSE ) -> FALSE | ^( SAND FALSE ( . ) ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ( . ) TRUE ) -> FALSE | ^( SAND TRUE ( . ) ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notTerm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notTerm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );
    public final tftacrulesfull.sandTerm_return sandTerm() throws RecognitionException {
        tftacrulesfull.sandTerm_return retval = new tftacrulesfull.sandTerm_return();
        retval.start = input.LT(1);
        int sandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND122=null;
        Object wildcard123=null;
        Object FALSE124=null;
        Object SAND125=null;
        Object FALSE126=null;
        Object wildcard127=null;
        Object SAND128=null;
        Object TRUE129=null;
        Object TRUE130=null;
        Object SAND131=null;
        Object wildcard132=null;
        Object TRUE133=null;
        Object SAND134=null;
        Object TRUE135=null;
        Object wildcard136=null;
        Object SAND137=null;
        Object XOR138=null;
        Object SAND139=null;
        Object XOR140=null;
        Object SAND141=null;
        Object OR142=null;
        Object SAND143=null;
        Object OR144=null;
        Object SAND145=null;
        Object PAND146=null;
        Object SAND147=null;
        Object PAND148=null;
        Object SAND149=null;
        Object AND150=null;
        Object SAND151=null;
        Object AND152=null;
        Object SAND153=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notTerm_return a = null;

        tftacrulesfull.tt_return tt154 = null;

        tftacrulesfull.tt_return tt155 = null;


        Object SAND122_tree=null;
        Object wildcard123_tree=null;
        Object FALSE124_tree=null;
        Object SAND125_tree=null;
        Object FALSE126_tree=null;
        Object wildcard127_tree=null;
        Object SAND128_tree=null;
        Object TRUE129_tree=null;
        Object TRUE130_tree=null;
        Object SAND131_tree=null;
        Object wildcard132_tree=null;
        Object TRUE133_tree=null;
        Object SAND134_tree=null;
        Object TRUE135_tree=null;
        Object wildcard136_tree=null;
        Object SAND137_tree=null;
        Object XOR138_tree=null;
        Object SAND139_tree=null;
        Object XOR140_tree=null;
        Object SAND141_tree=null;
        Object OR142_tree=null;
        Object SAND143_tree=null;
        Object OR144_tree=null;
        Object SAND145_tree=null;
        Object PAND146_tree=null;
        Object SAND147_tree=null;
        Object PAND148_tree=null;
        Object SAND149_tree=null;
        Object AND150_tree=null;
        Object SAND151_tree=null;
        Object AND152_tree=null;
        Object SAND153_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notTerm=new RewriteRuleSubtreeStream(adaptor,"rule notTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:9: ( ^( SAND ( . ) FALSE ) -> FALSE | ^( SAND FALSE ( . ) ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ( . ) TRUE ) -> FALSE | ^( SAND TRUE ( . ) ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notTerm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notTerm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) )
            int alt11=14;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:11: ^( SAND ( . ) FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND122=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND122);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:18: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:19: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard123=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard123_tree = (Object)adaptor.dupTree(wildcard123);
                    adaptor.addChild(root_1, wildcard123_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    FALSE124=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandTerm1701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE124);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:4: ^( SAND FALSE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND125=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND125);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE126=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandTerm1718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE126);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard127=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard127_tree = (Object)adaptor.dupTree(wildcard127);
                    adaptor.addChild(root_1, wildcard127_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:195:4: ^( SAND TRUE TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND128=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND128);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE129=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE129);

                    _last = (Object)input.LT(1);
                    TRUE130=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE130);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:4: ^( SAND ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND131=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND131);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:11: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:12: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard132=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard132_tree = (Object)adaptor.dupTree(wildcard132);
                    adaptor.addChild(root_1, wildcard132_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE133=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE133);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:4: ^( SAND TRUE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND134=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND134);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE135=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE135);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:16: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:17: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard136=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard136_tree = (Object)adaptor.dupTree(wildcard136);
                    adaptor.addChild(root_1, wildcard136_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:4: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND137=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND137);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR138=(Object)match(input,XOR,FOLLOW_XOR_in_sandTerm1798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR138);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1802);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1806);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1811);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, x, z, z, XOR, y, SAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:27: ^( SAND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND139=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND139);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1852);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR140=(Object)match(input,XOR,FOLLOW_XOR_in_sandTerm1855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR140);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1859);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1863);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, SAND, XOR, SAND, x, z, y
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:27: ^( SAND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND141=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND141);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1905);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR142=(Object)match(input,OR,FOLLOW_OR_in_sandTerm1908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR142);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1912);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1916);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, y, SAND, z, y, SAND, y, x, z, SAND, x, SAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:12: ^( AND ^( NOT $y) ^( SAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:19: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:29: ^( SAND $z $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:6: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:16: ^( SAND $y $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND143=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND143);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR144=(Object)match(input,OR,FOLLOW_OR_in_sandTerm2022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR144);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2026);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2030);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2035);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, y, SAND, y, x, x, z, SAND, SAND, SAND, y, x, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:12: ^( AND ^( NOT $y) ^( SAND $x $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:19: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:29: ^( SAND $x $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:6: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:16: ^( SAND $y $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND145=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND145);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND146=(Object)match(input,PAND,FOLLOW_PAND_in_sandTerm2140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND146);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2144);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2148);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2153);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, z, PAND, x, y
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:17: ^( SAND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND147=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND147);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2186);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND148=(Object)match(input,PAND,FOLLOW_PAND_in_sandTerm2189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND148);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2193);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2197);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, PAND, x, z, SAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:216:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:216:17: ^( SAND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:4: ^( SAND x= tt ^( AND a= notTerm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND149=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND149);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2231);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND150=(Object)match(input,AND,FOLLOW_AND_in_sandTerm2234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND150);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_sandTerm2238);
                    a=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2242);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, z, SAND, a, AND
                    // token labels: 
                    // rule labels: retval, a, z, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:16: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:4: ^( SAND ^( AND a= notTerm z= tt ) x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND151=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND151);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND152=(Object)match(input,AND,FOLLOW_AND_in_sandTerm2275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND152);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_sandTerm2279);
                    a=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2283);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2288);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, SAND, a, x
                    // token labels: 
                    // rule labels: retval, a, z, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:220:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:220:16: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:221:4: ^( SAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND153=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND153_tree = (Object)adaptor.dupNode(SAND153);

                    root_1 = (Object)adaptor.becomeRoot(SAND153_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2320);
                    tt154=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt154.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2322);
                    tt155=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt155.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, sandTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sandTerm"

    public static class notNOTTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notNOTTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:225:1: notNOTTerm : ^( NOT ^( NOT a= tt ) ) -> $a;
    public final tftacrulesfull.notNOTTerm_return notNOTTerm() throws RecognitionException {
        tftacrulesfull.notNOTTerm_return retval = new tftacrulesfull.notNOTTerm_return();
        retval.start = input.LT(1);
        int notNOTTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT156=null;
        Object NOT157=null;
        tftacrulesfull.tt_return a = null;


        Object NOT156_tree=null;
        Object NOT157_tree=null;
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:226:2: ( ^( NOT ^( NOT a= tt ) ) -> $a)
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:226:4: ^( NOT ^( NOT a= tt ) )
            {
            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            NOT156=(Object)match(input,NOT,FOLLOW_NOT_in_notNOTTerm2336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NOT.add(NOT156);



            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            {
            Object _save_last_2 = _last;
            Object _first_2 = null;
            Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            NOT157=(Object)match(input,NOT,FOLLOW_NOT_in_notNOTTerm2339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NOT.add(NOT157);



            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_tt_in_notNOTTerm2343);
            a=tt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tt.add(a.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }



            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:4: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextTree());

            }

            retval.tree = root_0;}
            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, notNOTTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "notNOTTerm"

    public static class andTermWithNegated_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andTermWithNegated"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:231:1: andTermWithNegated : ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) ) | ^( AND notTerm tt ) );
    public final tftacrulesfull.andTermWithNegated_return andTermWithNegated() throws RecognitionException {
        tftacrulesfull.andTermWithNegated_return retval = new tftacrulesfull.andTermWithNegated_return();
        retval.start = input.LT(1);
        int andTermWithNegated_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND158=null;
        Object NOT159=null;
        Object PAND160=null;
        Object AND161=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.notTerm_return notTerm162 = null;

        tftacrulesfull.tt_return tt163 = null;


        Object AND158_tree=null;
        Object NOT159_tree=null;
        Object PAND160_tree=null;
        Object AND161_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:232:2: ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) ) | ^( AND notTerm tt ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==AND) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred61_tftacrulesfull()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:232:4: ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND158=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND158);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT159=(Object)match(input,NOT,FOLLOW_NOT_in_andTermWithNegated2370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT159);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_3 = _last;
                    Object _first_3 = null;
                    Object root_3 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND160=(Object)match(input,PAND,FOLLOW_PAND_in_andTermWithNegated2373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND160);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2377);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2381);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_2, root_3);_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2388);
                    m1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, AND, y, m1, NOT, m1, AND, m1, m1, AND, y, NOT, x, y, x, AND, AND, y, AND, m1, AND, AND, PAND, NOT, x, x, y, x
                    // token labels: 
                    // rule labels: retval, m1, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:4: -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:13: ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:19: ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:25: ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:31: ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:37: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_6);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:43: ^( NOT $x)
                        {
                        Object root_7 = (Object)adaptor.nil();
                        root_7 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_7);

                        adaptor.addChild(root_7, stream_x.nextTree());

                        adaptor.addChild(root_6, root_7);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:233:53: ^( NOT $y)
                        {
                        Object root_7 = (Object)adaptor.nil();
                        root_7 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_7);

                        adaptor.addChild(root_7, stream_y.nextTree());

                        adaptor.addChild(root_6, root_7);
                        }

                        adaptor.addChild(root_5, root_6);
                        }
                        adaptor.addChild(root_5, stream_m1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:235:17: ^( AND ^( AND ^( NOT $x) $y) $m1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:235:23: ^( AND ^( NOT $x) $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_6);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:235:29: ^( NOT $x)
                        {
                        Object root_7 = (Object)adaptor.nil();
                        root_7 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_7);

                        adaptor.addChild(root_7, stream_x.nextTree());

                        adaptor.addChild(root_6, root_7);
                        }
                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        adaptor.addChild(root_5, stream_m1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:18: ^( AND ^( NOT $y) ^( AND $x $m1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:24: ^( NOT $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:34: ^( AND $x $m1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_x.nextTree());
                        adaptor.addChild(root_5, stream_m1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:238:12: ^( AND ^( PAND $y $x) $m1)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:238:18: ^( PAND $y $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_m1.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:239:6: ^( AND ^( SAND $x $y) $m1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:239:12: ^( SAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, stream_m1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:240:4: ^( AND notTerm tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND161=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND161_tree = (Object)adaptor.dupNode(AND161);

                    root_1 = (Object)adaptor.becomeRoot(AND161_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2613);
                    notTerm162=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notTerm162.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2615);
                    tt163=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt163.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, andTermWithNegated_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andTermWithNegated"

    public static class notTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:1: notTerm : ( ^( NOT x= negTerm ) -> ^( NOT $x) | ^( NOT ^( NOT x= negTerm ) ) -> $x | ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( NOT negTerm ) | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm );
    public final tftacrulesfull.notTerm_return notTerm() throws RecognitionException {
        tftacrulesfull.notTerm_return retval = new tftacrulesfull.notTerm_return();
        retval.start = input.LT(1);
        int notTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT164=null;
        Object NOT165=null;
        Object NOT166=null;
        Object NOT167=null;
        Object AND168=null;
        Object NOT169=null;
        Object OR170=null;
        Object NOT171=null;
        Object XOR172=null;
        Object NOT173=null;
        Object SAND174=null;
        Object NOT175=null;
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return negTerm176 = null;

        tftacrulesfull.negAndTerm_return negAndTerm177 = null;

        tftacrulesfull.negOrTerm_return negOrTerm178 = null;

        tftacrulesfull.negXorTerm_return negXorTerm179 = null;

        tftacrulesfull.negPandTerm_return negPandTerm180 = null;

        tftacrulesfull.negSandTerm_return negSandTerm181 = null;


        Object NOT164_tree=null;
        Object NOT165_tree=null;
        Object NOT166_tree=null;
        Object NOT167_tree=null;
        Object AND168_tree=null;
        Object NOT169_tree=null;
        Object OR170_tree=null;
        Object NOT171_tree=null;
        Object XOR172_tree=null;
        Object NOT173_tree=null;
        Object SAND174_tree=null;
        Object NOT175_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:9: ( ^( NOT x= negTerm ) -> ^( NOT $x) | ^( NOT ^( NOT x= negTerm ) ) -> $x | ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( NOT negTerm ) | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm )
            int alt13=12;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:11: ^( NOT x= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT164=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT164);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2634);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, NOT
                    // token labels: 
                    // rule labels: retval, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:4: -> ^( NOT $x)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:7: ^( NOT $x)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:246:4: ^( NOT ^( NOT x= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT165=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT165);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT166=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT166);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2660);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x
                    // token labels: 
                    // rule labels: retval, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:4: -> $x
                    {
                        adaptor.addChild(root_0, stream_x.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:248:4: ^( NOT ^( AND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT167=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT167);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND168=(Object)match(input,AND,FOLLOW_AND_in_notTerm2679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND168);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2683);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2687);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, NOT, x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:4: -> ^( OR ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:249:7: ^( OR ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:249:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:249:23: ^( NOT $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:250:4: ^( NOT ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT169=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT169);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR170=(Object)match(input,OR,FOLLOW_OR_in_notTerm2723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR170);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2728);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2732);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, y, x, NOT
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:251:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:251:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:251:23: ^( NOT $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:252:4: ^( NOT ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT171=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT171);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR172=(Object)match(input,XOR,FOLLOW_XOR_in_notTerm2767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR172);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2772);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2776);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, NOT, y, NOT
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:253:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:253:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:253:23: ^( NOT $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:254:4: ^( NOT ^( SAND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT173=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT173);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND174=(Object)match(input,SAND,FOLLOW_SAND_in_notTerm2811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND174);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2815);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2819);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, x, x, NOT, NOT, y, NOT, y, y, x, x, y, NOT, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:4: -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:13: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:19: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:25: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:255:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:256:15: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:256:21: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:257:18: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:257:24: ^( NOT $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:258:12: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:259:6: ^( PAND $x $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:260:4: ^( NOT negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT175=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm2969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT175_tree = (Object)adaptor.dupNode(NOT175);

                    root_1 = (Object)adaptor.becomeRoot(NOT175_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm2971);
                    negTerm176=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm176.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:261:4: negAndTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negAndTerm_in_notTerm2977);
                    negAndTerm177=negAndTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negAndTerm177.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:262:4: negOrTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negOrTerm_in_notTerm2982);
                    negOrTerm178=negOrTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negOrTerm178.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:263:4: negXorTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negXorTerm_in_notTerm2987);
                    negXorTerm179=negXorTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negXorTerm179.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:264:4: negPandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negPandTerm_in_notTerm2992);
                    negPandTerm180=negPandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negPandTerm180.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:265:4: negSandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negSandTerm_in_notTerm2997);
                    negSandTerm181=negSandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negSandTerm181.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, notTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "notTerm"

    public static class negTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:269:1: negTerm : ( ^( AND x= negTerm y= negTerm ) -> ^( AND $x $y) | ^( OR x= negTerm y= negTerm ) -> ^( OR $x $y) | ^( XOR x= negTerm y= negTerm ) -> ^( XOR $y) | ^( PAND x= negTerm y= negTerm ) -> ^( PAND $x $y) | ^( SAND x= negTerm y= negTerm ) -> ^( SAND $x $y) | ^( NOT x= negTerm ) -> ^( NOT $x) | atom | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm );
    public final tftacrulesfull.negTerm_return negTerm() throws RecognitionException {
        tftacrulesfull.negTerm_return retval = new tftacrulesfull.negTerm_return();
        retval.start = input.LT(1);
        int negTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND182=null;
        Object OR183=null;
        Object XOR184=null;
        Object PAND185=null;
        Object SAND186=null;
        Object NOT187=null;
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.atom_return atom188 = null;

        tftacrulesfull.negAndTerm_return negAndTerm189 = null;

        tftacrulesfull.negOrTerm_return negOrTerm190 = null;

        tftacrulesfull.negXorTerm_return negXorTerm191 = null;

        tftacrulesfull.negPandTerm_return negPandTerm192 = null;

        tftacrulesfull.negSandTerm_return negSandTerm193 = null;


        Object AND182_tree=null;
        Object OR183_tree=null;
        Object XOR184_tree=null;
        Object PAND185_tree=null;
        Object SAND186_tree=null;
        Object NOT187_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:269:9: ( ^( AND x= negTerm y= negTerm ) -> ^( AND $x $y) | ^( OR x= negTerm y= negTerm ) -> ^( OR $x $y) | ^( XOR x= negTerm y= negTerm ) -> ^( XOR $y) | ^( PAND x= negTerm y= negTerm ) -> ^( PAND $x $y) | ^( SAND x= negTerm y= negTerm ) -> ^( SAND $x $y) | ^( NOT x= negTerm ) -> ^( NOT $x) | atom | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm )
            int alt14=12;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:269:11: ^( AND x= negTerm y= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND182=(Object)match(input,AND,FOLLOW_AND_in_negTerm3011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND182);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3015);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3019);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, AND
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 270:4: -> ^( AND $x $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:270:7: ^( AND $x $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:271:4: ^( OR x= negTerm y= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR183=(Object)match(input,OR,FOLLOW_OR_in_negTerm3041); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR183);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3045);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3049);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, OR, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 272:4: -> ^( OR $x $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:272:7: ^( OR $x $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:273:4: ^( XOR x= negTerm y= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR184=(Object)match(input,XOR,FOLLOW_XOR_in_negTerm3071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR184);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3075);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3079);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, XOR
                    // token labels: 
                    // rule labels: retval, y
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 274:4: -> ^( XOR $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:274:7: ^( XOR $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:275:4: ^( PAND x= negTerm y= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND185=(Object)match(input,PAND,FOLLOW_PAND_in_negTerm3098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND185);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3102);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3106);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 276:4: -> ^( PAND $x $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:276:7: ^( PAND $x $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:277:4: ^( SAND x= negTerm y= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND186=(Object)match(input,SAND,FOLLOW_SAND_in_negTerm3128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND186);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3132);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3136);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, SAND
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:4: -> ^( SAND $x $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:278:7: ^( SAND $x $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:279:4: ^( NOT x= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT187=(Object)match(input,NOT,FOLLOW_NOT_in_negTerm3158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT187);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3162);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, NOT
                    // token labels: 
                    // rule labels: retval, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 280:4: -> ^( NOT $x)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:280:7: ^( NOT $x)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:281:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_negTerm3180);
                    atom188=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom188.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:282:4: negAndTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negAndTerm_in_negTerm3185);
                    negAndTerm189=negAndTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negAndTerm189.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:283:4: negOrTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negOrTerm_in_negTerm3190);
                    negOrTerm190=negOrTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negOrTerm190.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:284:4: negXorTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negXorTerm_in_negTerm3195);
                    negXorTerm191=negXorTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negXorTerm191.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:285:4: negPandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negPandTerm_in_negTerm3200);
                    negPandTerm192=negPandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negPandTerm192.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:286:4: negSandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negSandTerm_in_negTerm3205);
                    negSandTerm193=negSandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negSandTerm193.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, negTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negTerm"

    public static class negAndTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negAndTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:291:1: negAndTerm : ( ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) ) -> ^( AND ^( AND $z $x) $y) | ^( AND negTerm negTerm ) );
    public final tftacrulesfull.negAndTerm_return negAndTerm() throws RecognitionException {
        tftacrulesfull.negAndTerm_return retval = new tftacrulesfull.negAndTerm_return();
        retval.start = input.LT(1);
        int negAndTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND194=null;
        Object XOR195=null;
        Object AND196=null;
        Object XOR197=null;
        Object AND198=null;
        Object OR199=null;
        Object AND200=null;
        Object OR201=null;
        Object AND202=null;
        Object AND203=null;
        Object AND204=null;
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return negTerm205 = null;

        tftacrulesfull.negTerm_return negTerm206 = null;


        Object AND194_tree=null;
        Object XOR195_tree=null;
        Object AND196_tree=null;
        Object XOR197_tree=null;
        Object AND198_tree=null;
        Object OR199_tree=null;
        Object AND200_tree=null;
        Object OR201_tree=null;
        Object AND202_tree=null;
        Object AND203_tree=null;
        Object AND204_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:292:2: ( ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) ) -> ^( AND ^( AND $z $x) $y) | ^( AND negTerm negTerm ) )
            int alt15=6;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AND) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred84_tftacrulesfull()) ) {
                    alt15=1;
                }
                else if ( (synpred85_tftacrulesfull()) ) {
                    alt15=2;
                }
                else if ( (synpred86_tftacrulesfull()) ) {
                    alt15=3;
                }
                else if ( (synpred87_tftacrulesfull()) ) {
                    alt15=4;
                }
                else if ( (synpred88_tftacrulesfull()) ) {
                    alt15=5;
                }
                else if ( (true) ) {
                    alt15=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:292:4: ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND194=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND194);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR195=(Object)match(input,XOR,FOLLOW_XOR_in_negAndTerm3225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR195);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3229);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3233);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3238);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, z, x, z, y, AND, AND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 293:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:293:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:293:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:293:26: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:294:4: ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND196=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND196);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3279);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR197=(Object)match(input,XOR,FOLLOW_XOR_in_negAndTerm3282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR197);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3286);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3290);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, XOR, z, y, x, AND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 295:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:295:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:295:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:295:26: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:296:4: ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND198=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND198);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR199=(Object)match(input,OR,FOLLOW_OR_in_negAndTerm3331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR199);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3335);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3339);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3344);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, x, AND, OR, y, z, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:297:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:297:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:297:25: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:298:4: ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND200=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND200);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3385);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR201=(Object)match(input,OR,FOLLOW_OR_in_negAndTerm3388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR201);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3392);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3396);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, y, x, AND, z, z, OR
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 299:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:299:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:299:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:299:25: ^( AND $y $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:300:4: ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND202=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND202);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3438);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND203=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND203);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3445);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3449);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, y, x, AND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:4: -> ^( AND ^( AND $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:301:7: ^( AND ^( AND $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:301:13: ^( AND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:302:4: ^( AND negTerm negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND204=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND204_tree = (Object)adaptor.dupNode(AND204);

                    root_1 = (Object)adaptor.becomeRoot(AND204_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3482);
                    negTerm205=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm205.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3484);
                    negTerm206=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm206.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, negAndTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negAndTerm"

    public static class negOrTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negOrTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:305:1: negOrTerm : ( ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR negTerm negTerm ) );
    public final tftacrulesfull.negOrTerm_return negOrTerm() throws RecognitionException {
        tftacrulesfull.negOrTerm_return retval = new tftacrulesfull.negOrTerm_return();
        retval.start = input.LT(1);
        int negOrTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR207=null;
        Object XOR208=null;
        Object OR209=null;
        Object OR210=null;
        Object OR211=null;
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return negTerm212 = null;

        tftacrulesfull.negTerm_return negTerm213 = null;


        Object OR207_tree=null;
        Object XOR208_tree=null;
        Object OR209_tree=null;
        Object OR210_tree=null;
        Object OR211_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:306:2: ( ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR negTerm negTerm ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OR) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred89_tftacrulesfull()) ) {
                    alt16=1;
                }
                else if ( (synpred90_tftacrulesfull()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:306:4: ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR207=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR207);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3502);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR208=(Object)match(input,XOR,FOLLOW_XOR_in_negOrTerm3505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR208);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3509);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3513);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, y, OR, z, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 307:4: -> ^( OR ^( OR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:307:7: ^( OR ^( OR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:307:12: ^( OR $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:308:4: ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR209=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR209);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3548);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR210=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR210);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3555);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3559);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, OR, x, OR, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:4: -> ^( OR ^( OR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:309:7: ^( OR ^( OR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:309:12: ^( OR $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:310:4: ^( OR negTerm negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR211=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR211_tree = (Object)adaptor.dupNode(OR211);

                    root_1 = (Object)adaptor.becomeRoot(OR211_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3592);
                    negTerm212=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm212.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3594);
                    negTerm213=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm213.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, negOrTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negOrTerm"

    public static class negXorTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negXorTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:313:1: negXorTerm : ( ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR $z $x) $y) | ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( XOR negTerm negTerm ) );
    public final tftacrulesfull.negXorTerm_return negXorTerm() throws RecognitionException {
        tftacrulesfull.negXorTerm_return retval = new tftacrulesfull.negXorTerm_return();
        retval.start = input.LT(1);
        int negXorTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR214=null;
        Object XOR215=null;
        Object XOR216=null;
        Object OR217=null;
        Object XOR218=null;
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return negTerm219 = null;

        tftacrulesfull.negTerm_return negTerm220 = null;


        Object XOR214_tree=null;
        Object XOR215_tree=null;
        Object XOR216_tree=null;
        Object OR217_tree=null;
        Object XOR218_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:2: ( ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR $z $x) $y) | ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( XOR negTerm negTerm ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==XOR) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred91_tftacrulesfull()) ) {
                    alt17=1;
                }
                else if ( (synpred92_tftacrulesfull()) ) {
                    alt17=2;
                }
                else if ( (true) ) {
                    alt17=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:4: ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR214=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR214);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3612);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR215=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR215);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3619);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3623);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, x, XOR, z, y
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:4: -> ^( XOR ^( XOR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:315:7: ^( XOR ^( XOR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:315:13: ^( XOR $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:316:4: ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR216=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR216);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3658);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR217=(Object)match(input,OR,FOLLOW_OR_in_negXorTerm3661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR217);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3665);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3669);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, y, x, OR, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:4: -> ^( OR ^( OR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:317:7: ^( OR ^( OR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:317:12: ^( OR $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_y.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:318:4: ^( XOR negTerm negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR218=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR218_tree = (Object)adaptor.dupNode(XOR218);

                    root_1 = (Object)adaptor.becomeRoot(XOR218_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3702);
                    negTerm219=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm219.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3704);
                    negTerm220=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm220.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, negXorTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negXorTerm"

    public static class negPandTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negPandTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:321:1: negPandTerm : ^( PAND negTerm negTerm ) ;
    public final tftacrulesfull.negPandTerm_return negPandTerm() throws RecognitionException {
        tftacrulesfull.negPandTerm_return retval = new tftacrulesfull.negPandTerm_return();
        retval.start = input.LT(1);
        int negPandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND221=null;
        tftacrulesfull.negTerm_return negTerm222 = null;

        tftacrulesfull.negTerm_return negTerm223 = null;


        Object PAND221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:322:2: ( ^( PAND negTerm negTerm ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:322:4: ^( PAND negTerm negTerm )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            PAND221=(Object)match(input,PAND,FOLLOW_PAND_in_negPandTerm3718); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAND221_tree = (Object)adaptor.dupNode(PAND221);

            root_1 = (Object)adaptor.becomeRoot(PAND221_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negPandTerm3720);
            negTerm222=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm222.getTree());
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negPandTerm3722);
            negTerm223=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm223.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, negPandTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negPandTerm"

    public static class negSandTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negSandTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:325:1: negSandTerm : ^( SAND negTerm negTerm ) ;
    public final tftacrulesfull.negSandTerm_return negSandTerm() throws RecognitionException {
        tftacrulesfull.negSandTerm_return retval = new tftacrulesfull.negSandTerm_return();
        retval.start = input.LT(1);
        int negSandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND224=null;
        tftacrulesfull.negTerm_return negTerm225 = null;

        tftacrulesfull.negTerm_return negTerm226 = null;


        Object SAND224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:326:2: ( ^( SAND negTerm negTerm ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:326:4: ^( SAND negTerm negTerm )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            SAND224=(Object)match(input,SAND,FOLLOW_SAND_in_negSandTerm3735); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SAND224_tree = (Object)adaptor.dupNode(SAND224);

            root_1 = (Object)adaptor.becomeRoot(SAND224_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negSandTerm3737);
            negTerm225=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm225.getTree());
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negSandTerm3739);
            negTerm226=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm226.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, negSandTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negSandTerm"

    // $ANTLR start synpred1_tftacrulesfull
    public final void synpred1_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:47:4: ( tdnf )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:47:4: tdnf
        {
        pushFollow(FOLLOW_tdnf_in_synpred1_tftacrulesfull67);
        tdnf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_tftacrulesfull

    // $ANTLR start synpred16_tftacrulesfull
    public final void synpred16_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:11: ( ^( AND ( . ) FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:11: ^( AND ( . ) FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred16_tftacrulesfull319); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:18: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,FALSE,FOLLOW_FALSE_in_synpred16_tftacrulesfull325); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_tftacrulesfull

    // $ANTLR start synpred17_tftacrulesfull
    public final void synpred17_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:4: ( ^( AND FALSE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:4: ^( AND FALSE ( . ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred17_tftacrulesfull340); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred17_tftacrulesfull342); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:16: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:17: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacrulesfull

    // $ANTLR start synpred18_tftacrulesfull
    public final void synpred18_tftacrulesfull_fragment() throws RecognitionException {   
        Object q=null;

        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:4: ( ^( AND TRUE q= ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:4: ^( AND TRUE q= ( . ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred18_tftacrulesfull360); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred18_tftacrulesfull362); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:18: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacrulesfull

    // $ANTLR start synpred19_tftacrulesfull
    public final void synpred19_tftacrulesfull_fragment() throws RecognitionException {   
        Object q=null;

        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:4: ( ^( AND q= ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:4: ^( AND q= ( . ) TRUE )
        {
        match(input,AND,FOLLOW_AND_in_synpred19_tftacrulesfull383); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:12: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:13: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred19_tftacrulesfull391); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_tftacrulesfull

    // $ANTLR start synpred20_tftacrulesfull
    public final void synpred20_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:4: ( ^( AND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred20_tftacrulesfull406); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred20_tftacrulesfull409); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred20_tftacrulesfull413);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred20_tftacrulesfull417);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred20_tftacrulesfull422);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_tftacrulesfull

    // $ANTLR start synpred21_tftacrulesfull
    public final void synpred21_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:4: ( ^( AND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:4: ^( AND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred21_tftacrulesfull460); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull464);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred21_tftacrulesfull467); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull471);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull475);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_tftacrulesfull

    // $ANTLR start synpred22_tftacrulesfull
    public final void synpred22_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:4: ( ^( AND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:4: ^( AND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred22_tftacrulesfull514); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred22_tftacrulesfull517); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull521);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull525);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull530);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_tftacrulesfull

    // $ANTLR start synpred23_tftacrulesfull
    public final void synpred23_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:121:4: ( ^( AND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:121:4: ^( AND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred23_tftacrulesfull569); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull573);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred23_tftacrulesfull576); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull580);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull584);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_tftacrulesfull

    // $ANTLR start synpred24_tftacrulesfull
    public final void synpred24_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:4: ( ^( AND x= tt y= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:4: ^( AND x= tt y= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrulesfull622); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred24_tftacrulesfull626);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred24_tftacrulesfull630);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_tftacrulesfull

    // $ANTLR start synpred25_tftacrulesfull
    public final void synpred25_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ( ^( AND tt tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ^( AND tt tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred25_tftacrulesfull681); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrulesfull683);
        tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrulesfull685);
        tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_tftacrulesfull

    // $ANTLR start synpred26_tftacrulesfull
    public final void synpred26_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:126:4: ( andTermWithNegated )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:126:4: andTermWithNegated
        {
        pushFollow(FOLLOW_andTermWithNegated_in_synpred26_tftacrulesfull691);
        andTermWithNegated();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_tftacrulesfull

    // $ANTLR start synpred27_tftacrulesfull
    public final void synpred27_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:10: ( ^( OR ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:10: ^( OR ( . ) TRUE )
        {
        match(input,OR,FOLLOW_OR_in_synpred27_tftacrulesfull802); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:15: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:16: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred27_tftacrulesfull808); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_tftacrulesfull

    // $ANTLR start synpred28_tftacrulesfull
    public final void synpred28_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ( ^( OR TRUE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ^( OR TRUE ( . ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred28_tftacrulesfull823); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred28_tftacrulesfull825); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:14: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:15: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_tftacrulesfull

    // $ANTLR start synpred29_tftacrulesfull
    public final void synpred29_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ( ^( OR FALSE q= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ^( OR FALSE q= tt )
        {
        match(input,OR,FOLLOW_OR_in_synpred29_tftacrulesfull843); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred29_tftacrulesfull845); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred29_tftacrulesfull849);
        q=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_tftacrulesfull

    // $ANTLR start synpred30_tftacrulesfull
    public final void synpred30_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ( ^( OR q= tt FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ^( OR q= tt FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred30_tftacrulesfull864); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred30_tftacrulesfull868);
        q=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred30_tftacrulesfull870); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_tftacrulesfull

    // $ANTLR start synpred31_tftacrulesfull
    public final void synpred31_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:140:4: ( ^( OR a= tt ^( OR b= tt c= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:140:4: ^( OR a= tt ^( OR b= tt c= tt ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred31_tftacrulesfull885); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred31_tftacrulesfull889);
        a=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred31_tftacrulesfull892); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred31_tftacrulesfull896);
        b=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred31_tftacrulesfull900);
        c=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacrulesfull

    // $ANTLR start synpred32_tftacrulesfull
    public final void synpred32_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:11: ( ^( XOR ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:11: ^( XOR ( . ) TRUE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred32_tftacrulesfull948); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:18: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred32_tftacrulesfull954); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacrulesfull

    // $ANTLR start synpred33_tftacrulesfull
    public final void synpred33_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ( ^( XOR TRUE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ^( XOR TRUE ( . ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred33_tftacrulesfull969); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred33_tftacrulesfull971); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:15: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:16: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacrulesfull

    // $ANTLR start synpred34_tftacrulesfull
    public final void synpred34_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ( ^( XOR FALSE q= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ^( XOR FALSE q= tt )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred34_tftacrulesfull989); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred34_tftacrulesfull991); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrulesfull995);
        q=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_tftacrulesfull

    // $ANTLR start synpred35_tftacrulesfull
    public final void synpred35_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ( ^( XOR q= tt FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( XOR q= tt FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred35_tftacrulesfull1010); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred35_tftacrulesfull1014);
        q=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred35_tftacrulesfull1016); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_tftacrulesfull

    // $ANTLR start synpred36_tftacrulesfull
    public final void synpred36_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ( ^( XOR a= tt ^( XOR b= tt c= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ^( XOR a= tt ^( XOR b= tt c= tt ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred36_tftacrulesfull1031); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred36_tftacrulesfull1035);
        a=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred36_tftacrulesfull1038); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred36_tftacrulesfull1042);
        b=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred36_tftacrulesfull1046);
        c=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_tftacrulesfull

    // $ANTLR start synpred37_tftacrulesfull
    public final void synpred37_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:11: ( ^( PAND ( . ) FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:11: ^( PAND ( . ) FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred37_tftacrulesfull1093); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:18: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:19: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,FALSE,FOLLOW_FALSE_in_synpred37_tftacrulesfull1099); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_tftacrulesfull

    // $ANTLR start synpred38_tftacrulesfull
    public final void synpred38_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:4: ( ^( PAND FALSE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:4: ^( PAND FALSE ( . ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred38_tftacrulesfull1114); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred38_tftacrulesfull1116); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:18: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_tftacrulesfull

    // $ANTLR start synpred39_tftacrulesfull
    public final void synpred39_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:4: ( ^( PAND ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:4: ^( PAND ( . ) TRUE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred39_tftacrulesfull1134); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:11: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:12: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred39_tftacrulesfull1140); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_tftacrulesfull

    // $ANTLR start synpred40_tftacrulesfull
    public final void synpred40_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:4: ( ^( PAND TRUE x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:4: ^( PAND TRUE x= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred40_tftacrulesfull1155); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred40_tftacrulesfull1157); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred40_tftacrulesfull1161);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_tftacrulesfull

    // $ANTLR start synpred41_tftacrulesfull
    public final void synpred41_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:4: ( ^( PAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred41_tftacrulesfull1176); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred41_tftacrulesfull1179); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1183);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1187);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1192);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_tftacrulesfull

    // $ANTLR start synpred42_tftacrulesfull
    public final void synpred42_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:4: ( ^( PAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred42_tftacrulesfull1229); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1233);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred42_tftacrulesfull1236); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1240);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1244);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_tftacrulesfull

    // $ANTLR start synpred43_tftacrulesfull
    public final void synpred43_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:4: ( ^( PAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred43_tftacrulesfull1283); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred43_tftacrulesfull1286); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred43_tftacrulesfull1290);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred43_tftacrulesfull1294);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred43_tftacrulesfull1299);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_tftacrulesfull

    // $ANTLR start synpred44_tftacrulesfull
    public final void synpred44_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:4: ( ^( PAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred44_tftacrulesfull1336); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1340);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred44_tftacrulesfull1343); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1347);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1351);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_tftacrulesfull

    // $ANTLR start synpred45_tftacrulesfull
    public final void synpred45_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ( ^( PAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred45_tftacrulesfull1461); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred45_tftacrulesfull1465);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred45_tftacrulesfull1468); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred45_tftacrulesfull1472);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred45_tftacrulesfull1476);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_tftacrulesfull

    // $ANTLR start synpred46_tftacrulesfull
    public final void synpred46_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notTerm_return b = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ( ^( PAND x= tt ^( AND b= notTerm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ^( PAND x= tt ^( AND b= notTerm z= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred46_tftacrulesfull1506); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred46_tftacrulesfull1510);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred46_tftacrulesfull1513); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred46_tftacrulesfull1517);
        b=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred46_tftacrulesfull1521);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_tftacrulesfull

    // $ANTLR start synpred47_tftacrulesfull
    public final void synpred47_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:4: ( ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:4: ^( PAND ^( AND n1= notTerm m1= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred47_tftacrulesfull1551); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred47_tftacrulesfull1554); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred47_tftacrulesfull1558);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred47_tftacrulesfull1562);
        m1=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred47_tftacrulesfull1567);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_tftacrulesfull

    // $ANTLR start synpred48_tftacrulesfull
    public final void synpred48_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:11: ( ^( SAND ( . ) FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:11: ^( SAND ( . ) FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred48_tftacrulesfull1695); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:18: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:19: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,FALSE,FOLLOW_FALSE_in_synpred48_tftacrulesfull1701); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacrulesfull

    // $ANTLR start synpred49_tftacrulesfull
    public final void synpred49_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:4: ( ^( SAND FALSE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:4: ^( SAND FALSE ( . ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred49_tftacrulesfull1716); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred49_tftacrulesfull1718); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:18: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_tftacrulesfull

    // $ANTLR start synpred50_tftacrulesfull
    public final void synpred50_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:195:4: ( ^( SAND TRUE TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:195:4: ^( SAND TRUE TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred50_tftacrulesfull1736); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrulesfull1738); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrulesfull1740); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_tftacrulesfull

    // $ANTLR start synpred51_tftacrulesfull
    public final void synpred51_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:4: ( ^( SAND ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:4: ^( SAND ( . ) TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred51_tftacrulesfull1754); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:11: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:12: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred51_tftacrulesfull1760); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_tftacrulesfull

    // $ANTLR start synpred52_tftacrulesfull
    public final void synpred52_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:4: ( ^( SAND TRUE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:4: ^( SAND TRUE ( . ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred52_tftacrulesfull1775); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred52_tftacrulesfull1777); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:16: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:17: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_tftacrulesfull

    // $ANTLR start synpred53_tftacrulesfull
    public final void synpred53_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:4: ( ^( SAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred53_tftacrulesfull1795); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred53_tftacrulesfull1798); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1802);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1806);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1811);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_tftacrulesfull

    // $ANTLR start synpred54_tftacrulesfull
    public final void synpred54_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:4: ( ^( SAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred54_tftacrulesfull1848); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1852);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred54_tftacrulesfull1855); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1859);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1863);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_tftacrulesfull

    // $ANTLR start synpred55_tftacrulesfull
    public final void synpred55_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:4: ( ^( SAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred55_tftacrulesfull1901); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1905);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred55_tftacrulesfull1908); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1912);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1916);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_tftacrulesfull

    // $ANTLR start synpred56_tftacrulesfull
    public final void synpred56_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:4: ( ^( SAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred56_tftacrulesfull2019); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred56_tftacrulesfull2022); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2026);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2030);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2035);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_tftacrulesfull

    // $ANTLR start synpred57_tftacrulesfull
    public final void synpred57_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:4: ( ^( SAND ^( PAND x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred57_tftacrulesfull2137); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrulesfull2140); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2144);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2148);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2153);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_tftacrulesfull

    // $ANTLR start synpred58_tftacrulesfull
    public final void synpred58_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:4: ( ^( SAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred58_tftacrulesfull2182); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2186);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred58_tftacrulesfull2189); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2193);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2197);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_tftacrulesfull

    // $ANTLR start synpred59_tftacrulesfull
    public final void synpred59_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notTerm_return a = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:4: ( ^( SAND x= tt ^( AND a= notTerm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:4: ^( SAND x= tt ^( AND a= notTerm z= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred59_tftacrulesfull2227); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred59_tftacrulesfull2231);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred59_tftacrulesfull2234); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred59_tftacrulesfull2238);
        a=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred59_tftacrulesfull2242);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacrulesfull

    // $ANTLR start synpred60_tftacrulesfull
    public final void synpred60_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return a = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:4: ( ^( SAND ^( AND a= notTerm z= tt ) x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:4: ^( SAND ^( AND a= notTerm z= tt ) x= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred60_tftacrulesfull2272); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred60_tftacrulesfull2275); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred60_tftacrulesfull2279);
        a=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred60_tftacrulesfull2283);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred60_tftacrulesfull2288);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_tftacrulesfull

    // $ANTLR start synpred61_tftacrulesfull
    public final void synpred61_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return m1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:232:4: ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:232:4: ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred61_tftacrulesfull2367); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,NOT,FOLLOW_NOT_in_synpred61_tftacrulesfull2370); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred61_tftacrulesfull2373); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2377);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2381);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2388);
        m1=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_tftacrulesfull

    // $ANTLR start synpred62_tftacrulesfull
    public final void synpred62_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:11: ( ^( NOT x= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:11: ^( NOT x= negTerm )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred62_tftacrulesfull2630); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred62_tftacrulesfull2634);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_tftacrulesfull

    // $ANTLR start synpred63_tftacrulesfull
    public final void synpred63_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:246:4: ( ^( NOT ^( NOT x= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:246:4: ^( NOT ^( NOT x= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred63_tftacrulesfull2653); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,NOT,FOLLOW_NOT_in_synpred63_tftacrulesfull2656); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred63_tftacrulesfull2660);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacrulesfull

    // $ANTLR start synpred64_tftacrulesfull
    public final void synpred64_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:248:4: ( ^( NOT ^( AND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:248:4: ^( NOT ^( AND x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred64_tftacrulesfull2676); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred64_tftacrulesfull2679); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred64_tftacrulesfull2683);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred64_tftacrulesfull2687);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_tftacrulesfull

    // $ANTLR start synpred65_tftacrulesfull
    public final void synpred65_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:250:4: ( ^( NOT ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:250:4: ^( NOT ^( OR x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred65_tftacrulesfull2720); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred65_tftacrulesfull2723); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred65_tftacrulesfull2728);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred65_tftacrulesfull2732);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_tftacrulesfull

    // $ANTLR start synpred66_tftacrulesfull
    public final void synpred66_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:252:4: ( ^( NOT ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:252:4: ^( NOT ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred66_tftacrulesfull2764); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred66_tftacrulesfull2767); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred66_tftacrulesfull2772);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred66_tftacrulesfull2776);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacrulesfull

    // $ANTLR start synpred67_tftacrulesfull
    public final void synpred67_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:254:4: ( ^( NOT ^( SAND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:254:4: ^( NOT ^( SAND x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred67_tftacrulesfull2808); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred67_tftacrulesfull2811); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred67_tftacrulesfull2815);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred67_tftacrulesfull2819);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_tftacrulesfull

    // $ANTLR start synpred68_tftacrulesfull
    public final void synpred68_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:260:4: ( ^( NOT negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:260:4: ^( NOT negTerm )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred68_tftacrulesfull2969); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred68_tftacrulesfull2971);
        negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_tftacrulesfull

    // $ANTLR start synpred73_tftacrulesfull
    public final void synpred73_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:269:11: ( ^( AND x= negTerm y= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:269:11: ^( AND x= negTerm y= negTerm )
        {
        match(input,AND,FOLLOW_AND_in_synpred73_tftacrulesfull3011); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred73_tftacrulesfull3015);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred73_tftacrulesfull3019);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_tftacrulesfull

    // $ANTLR start synpred74_tftacrulesfull
    public final void synpred74_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:271:4: ( ^( OR x= negTerm y= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:271:4: ^( OR x= negTerm y= negTerm )
        {
        match(input,OR,FOLLOW_OR_in_synpred74_tftacrulesfull3041); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred74_tftacrulesfull3045);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred74_tftacrulesfull3049);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_tftacrulesfull

    // $ANTLR start synpred75_tftacrulesfull
    public final void synpred75_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:273:4: ( ^( XOR x= negTerm y= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:273:4: ^( XOR x= negTerm y= negTerm )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred75_tftacrulesfull3071); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred75_tftacrulesfull3075);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred75_tftacrulesfull3079);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_tftacrulesfull

    // $ANTLR start synpred76_tftacrulesfull
    public final void synpred76_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:275:4: ( ^( PAND x= negTerm y= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:275:4: ^( PAND x= negTerm y= negTerm )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred76_tftacrulesfull3098); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred76_tftacrulesfull3102);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred76_tftacrulesfull3106);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_tftacrulesfull

    // $ANTLR start synpred77_tftacrulesfull
    public final void synpred77_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:277:4: ( ^( SAND x= negTerm y= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:277:4: ^( SAND x= negTerm y= negTerm )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred77_tftacrulesfull3128); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred77_tftacrulesfull3132);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred77_tftacrulesfull3136);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_tftacrulesfull

    // $ANTLR start synpred80_tftacrulesfull
    public final void synpred80_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:282:4: ( negAndTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:282:4: negAndTerm
        {
        pushFollow(FOLLOW_negAndTerm_in_synpred80_tftacrulesfull3185);
        negAndTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_tftacrulesfull

    // $ANTLR start synpred81_tftacrulesfull
    public final void synpred81_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:283:4: ( negOrTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:283:4: negOrTerm
        {
        pushFollow(FOLLOW_negOrTerm_in_synpred81_tftacrulesfull3190);
        negOrTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_tftacrulesfull

    // $ANTLR start synpred82_tftacrulesfull
    public final void synpred82_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:284:4: ( negXorTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:284:4: negXorTerm
        {
        pushFollow(FOLLOW_negXorTerm_in_synpred82_tftacrulesfull3195);
        negXorTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_tftacrulesfull

    // $ANTLR start synpred83_tftacrulesfull
    public final void synpred83_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:285:4: ( negPandTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:285:4: negPandTerm
        {
        pushFollow(FOLLOW_negPandTerm_in_synpred83_tftacrulesfull3200);
        negPandTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_tftacrulesfull

    // $ANTLR start synpred84_tftacrulesfull
    public final void synpred84_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:292:4: ( ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:292:4: ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm )
        {
        match(input,AND,FOLLOW_AND_in_synpred84_tftacrulesfull3222); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred84_tftacrulesfull3225); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred84_tftacrulesfull3229);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred84_tftacrulesfull3233);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred84_tftacrulesfull3238);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_tftacrulesfull

    // $ANTLR start synpred85_tftacrulesfull
    public final void synpred85_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:294:4: ( ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:294:4: ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred85_tftacrulesfull3275); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred85_tftacrulesfull3279);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred85_tftacrulesfull3282); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred85_tftacrulesfull3286);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred85_tftacrulesfull3290);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_tftacrulesfull

    // $ANTLR start synpred86_tftacrulesfull
    public final void synpred86_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:296:4: ( ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:296:4: ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm )
        {
        match(input,AND,FOLLOW_AND_in_synpred86_tftacrulesfull3328); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred86_tftacrulesfull3331); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred86_tftacrulesfull3335);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred86_tftacrulesfull3339);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred86_tftacrulesfull3344);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_tftacrulesfull

    // $ANTLR start synpred87_tftacrulesfull
    public final void synpred87_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:298:4: ( ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:298:4: ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred87_tftacrulesfull3381); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred87_tftacrulesfull3385);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred87_tftacrulesfull3388); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred87_tftacrulesfull3392);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred87_tftacrulesfull3396);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_tftacrulesfull

    // $ANTLR start synpred88_tftacrulesfull
    public final void synpred88_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:300:4: ( ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:300:4: ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred88_tftacrulesfull3434); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred88_tftacrulesfull3438);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred88_tftacrulesfull3441); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred88_tftacrulesfull3445);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred88_tftacrulesfull3449);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_tftacrulesfull

    // $ANTLR start synpred89_tftacrulesfull
    public final void synpred89_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:306:4: ( ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:306:4: ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred89_tftacrulesfull3498); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred89_tftacrulesfull3502);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred89_tftacrulesfull3505); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred89_tftacrulesfull3509);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred89_tftacrulesfull3513);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_tftacrulesfull

    // $ANTLR start synpred90_tftacrulesfull
    public final void synpred90_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:308:4: ( ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:308:4: ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred90_tftacrulesfull3544); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred90_tftacrulesfull3548);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred90_tftacrulesfull3551); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred90_tftacrulesfull3555);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred90_tftacrulesfull3559);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_tftacrulesfull

    // $ANTLR start synpred91_tftacrulesfull
    public final void synpred91_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:4: ( ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:4: ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred91_tftacrulesfull3608); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred91_tftacrulesfull3612);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred91_tftacrulesfull3615); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred91_tftacrulesfull3619);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred91_tftacrulesfull3623);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_tftacrulesfull

    // $ANTLR start synpred92_tftacrulesfull
    public final void synpred92_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:316:4: ( ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:316:4: ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred92_tftacrulesfull3654); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred92_tftacrulesfull3658);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred92_tftacrulesfull3661); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred92_tftacrulesfull3665);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred92_tftacrulesfull3669);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_tftacrulesfull

    // Delegated rules

    public final boolean synpred38_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA7_eotS =
        "\16\uffff";
    static final String DFA7_eofS =
        "\16\uffff";
    static final String DFA7_minS =
        "\1\6\1\0\14\uffff";
    static final String DFA7_maxS =
        "\1\6\1\0\14\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA7_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "107:1: andTerm : ( ^( AND ( . ) FALSE ) -> FALSE | ^( AND FALSE ( . ) ) -> FALSE | ^( AND TRUE q= ( . ) ) -> $q | ^( AND q= ( . ) TRUE ) -> $q | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) | andTermWithNegated | ^( AND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred17_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred18_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred19_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred20_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred21_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred22_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred23_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred24_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred25_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred26_tftacrulesfull()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\16\uffff";
    static final String DFA10_eofS =
        "\16\uffff";
    static final String DFA10_minS =
        "\1\7\1\0\14\uffff";
    static final String DFA10_maxS =
        "\1\7\1\0\14\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA10_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "160:1: pandTerm : ( ^( PAND ( . ) FALSE ) -> FALSE | ^( PAND FALSE ( . ) ) -> FALSE | ^( PAND ( . ) TRUE ) -> FALSE | ^( PAND TRUE x= tt ) -> $x | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notTerm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred38_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred39_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred40_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred41_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred42_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred43_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred44_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred45_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred46_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred47_tftacrulesfull()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\20\uffff";
    static final String DFA11_eofS =
        "\20\uffff";
    static final String DFA11_minS =
        "\1\10\1\0\16\uffff";
    static final String DFA11_maxS =
        "\1\10\1\0\16\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA11_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "191:1: sandTerm : ( ^( SAND ( . ) FALSE ) -> FALSE | ^( SAND FALSE ( . ) ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ( . ) TRUE ) -> FALSE | ^( SAND TRUE ( . ) ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notTerm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notTerm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred49_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred50_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred51_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred52_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred53_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred54_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred55_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred56_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred57_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred58_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred59_tftacrulesfull()) ) {s = 13;}

                        else if ( (synpred60_tftacrulesfull()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\16\uffff";
    static final String DFA13_eofS =
        "\16\uffff";
    static final String DFA13_minS =
        "\1\4\1\0\14\uffff";
    static final String DFA13_maxS =
        "\1\14\1\0\14\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\10\1\11\1\12\1\13\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA13_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\3\1\4\1\2\1\5\1\6\3\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "244:1: notTerm : ( ^( NOT x= negTerm ) -> ^( NOT $x) | ^( NOT ^( NOT x= negTerm ) ) -> $x | ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( NOT negTerm ) | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred63_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred64_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred65_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred66_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred67_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred68_tftacrulesfull()) ) {s = 13;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\22\uffff";
    static final String DFA14_eofS =
        "\22\uffff";
    static final String DFA14_minS =
        "\1\4\5\0\14\uffff";
    static final String DFA14_maxS =
        "\1\16\5\0\14\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\6\1\7\1\1\1\10\1\2\1\11\1\3\1\12\1\4\1\13\1\5\1\14";
    static final String DFA14_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\3\1\1\1\4\1\5\1\7\2\uffff\1\6\2\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "269:1: negTerm : ( ^( AND x= negTerm y= negTerm ) -> ^( AND $x $y) | ^( OR x= negTerm y= negTerm ) -> ^( OR $x $y) | ^( XOR x= negTerm y= negTerm ) -> ^( XOR $y) | ^( PAND x= negTerm y= negTerm ) -> ^( PAND $x $y) | ^( SAND x= negTerm y= negTerm ) -> ^( SAND $x $y) | ^( NOT x= negTerm ) -> ^( NOT $x) | atom | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred80_tftacrulesfull()) ) {s = 9;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred81_tftacrulesfull()) ) {s = 11;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred82_tftacrulesfull()) ) {s = 13;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_tftacrulesfull()) ) {s = 14;}

                        else if ( (synpred83_tftacrulesfull()) ) {s = 15;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_tftacrulesfull()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_tdnf_in_expression67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tt_in_expression73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ae0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_ce113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAND_in_ce119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ce_in_ce121 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_ce123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_nae136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_nae138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nae_in_nce149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_nce155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nce_in_nce157 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_nae_in_nce159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ce_in_es171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_es177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_es_in_es179 = new BitSet(new long[]{0x0000000000006300L});
    public static final BitSet FOLLOW_ce_in_es181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_nes194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nce_in_nes196 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_es_in_nes198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_es_in_tdnf211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nes_in_tdnf216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_tdnf222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_tdnf224 = new BitSet(new long[]{0x00000000000063F0L});
    public static final BitSet FOLLOW_tdnf_in_tdnf226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_tdnf233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_tdnf235 = new BitSet(new long[]{0x00000000000063F0L});
    public static final BitSet FOLLOW_tdnf_in_tdnf237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_tt256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andTerm_in_tt261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orTerm_in_tt266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xorTerm_in_tt271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandTerm_in_tt276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandTerm_in_tt281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notNOTTerm_in_tt286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_atom306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andTerm319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andTerm325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andTerm342 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_andTerm360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_andTerm362 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_andTerm383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_andTerm391 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_andTerm409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm413 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTerm422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_andTerm467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm471 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_andTerm517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm521 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTerm530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_andTerm576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm580 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm626 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTerm681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTerm683 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andTermWithNegated_in_andTerm691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andTerm697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andTerm700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTerm704 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTerm708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTerm713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orTerm808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orTerm825 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_OR_in_orTerm843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orTerm845 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orTerm849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm868 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orTerm870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_orTerm892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm896 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orTerm900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm932 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orTerm934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm948 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorTerm954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorTerm971 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_XOR_in_xorTerm989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_xorTerm991 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorTerm995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm1014 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_xorTerm1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm1031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_xorTerm1038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm1042 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorTerm1046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm1078 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorTerm1080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandTerm1099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandTerm1116 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandTerm1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandTerm1157 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pandTerm1179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1183 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_pandTerm1236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1240 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pandTerm1286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1290 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_pandTerm1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1347 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1465 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1472 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1510 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_pandTerm1513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_pandTerm1517 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandTerm1554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_pandTerm1558 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1680 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandTerm1701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandTerm1718 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1777 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_sandTerm1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1802 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm1806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm1811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_sandTerm1855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1859 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm1863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_sandTerm1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1912 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_sandTerm2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2026 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2030 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm2035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_sandTerm2140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2144 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm2153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2186 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_sandTerm2189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2193 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_sandTerm2234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_sandTerm2238 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_sandTerm2275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_sandTerm2279 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm2288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2320 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notNOTTerm2336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_notNOTTerm2339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notNOTTerm2343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_andTermWithNegated2370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_andTermWithNegated2373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2377 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2613 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_notTerm2656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_notTerm2679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2683 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2687 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_notTerm2723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2728 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_notTerm2767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2772 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_notTerm2811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2815 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm2969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm2971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negAndTerm_in_notTerm2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negOrTerm_in_notTerm2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negXorTerm_in_notTerm2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negPandTerm_in_notTerm2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negSandTerm_in_notTerm2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_negTerm3011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3015 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negTerm3041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3045 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negTerm3071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3075 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_negTerm3098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3102 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_negTerm3128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3132 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_negTerm3158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_negTerm3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negAndTerm_in_negTerm3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negOrTerm_in_negTerm3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negXorTerm_in_negTerm3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negPandTerm_in_negTerm3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negSandTerm_in_negTerm3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negAndTerm3225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3229 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negAndTerm3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3286 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negAndTerm3331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3335 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negAndTerm3388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3392 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3438 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3445 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3482 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negOrTerm3505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3509 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3555 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3592 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3619 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negXorTerm3661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3665 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3702 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_negPandTerm3718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negPandTerm3720 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negPandTerm3722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_negSandTerm3735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negSandTerm3737 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negSandTerm3739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tdnf_in_synpred1_tftacrulesfull67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred16_tftacrulesfull319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred16_tftacrulesfull325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred17_tftacrulesfull340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred17_tftacrulesfull342 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_synpred18_tftacrulesfull360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred18_tftacrulesfull362 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_synpred19_tftacrulesfull383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred19_tftacrulesfull391 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred20_tftacrulesfull406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred20_tftacrulesfull409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred20_tftacrulesfull413 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred20_tftacrulesfull417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred20_tftacrulesfull422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred21_tftacrulesfull460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred21_tftacrulesfull467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull471 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred22_tftacrulesfull514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred22_tftacrulesfull517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull521 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred23_tftacrulesfull569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrulesfull573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred23_tftacrulesfull576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrulesfull580 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrulesfull584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrulesfull622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred24_tftacrulesfull626 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred24_tftacrulesfull630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred25_tftacrulesfull681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrulesfull683 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrulesfull685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andTermWithNegated_in_synpred26_tftacrulesfull691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred27_tftacrulesfull802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred27_tftacrulesfull808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacrulesfull823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred28_tftacrulesfull825 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_OR_in_synpred29_tftacrulesfull843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred29_tftacrulesfull845 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred29_tftacrulesfull849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred30_tftacrulesfull864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred30_tftacrulesfull868 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred30_tftacrulesfull870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred31_tftacrulesfull885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred31_tftacrulesfull889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred31_tftacrulesfull892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred31_tftacrulesfull896 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred31_tftacrulesfull900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred32_tftacrulesfull948 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred32_tftacrulesfull954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred33_tftacrulesfull969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred33_tftacrulesfull971 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_XOR_in_synpred34_tftacrulesfull989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred34_tftacrulesfull991 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrulesfull995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred35_tftacrulesfull1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrulesfull1014 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred35_tftacrulesfull1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred36_tftacrulesfull1031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred36_tftacrulesfull1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred36_tftacrulesfull1038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred36_tftacrulesfull1042 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred36_tftacrulesfull1046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred37_tftacrulesfull1093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred37_tftacrulesfull1099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred38_tftacrulesfull1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred38_tftacrulesfull1116 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_PAND_in_synpred39_tftacrulesfull1134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred39_tftacrulesfull1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred40_tftacrulesfull1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred40_tftacrulesfull1157 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred40_tftacrulesfull1161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred41_tftacrulesfull1176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred41_tftacrulesfull1179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1183 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred42_tftacrulesfull1229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred42_tftacrulesfull1236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1240 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred43_tftacrulesfull1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred43_tftacrulesfull1286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred43_tftacrulesfull1290 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred43_tftacrulesfull1294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred43_tftacrulesfull1299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred44_tftacrulesfull1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred44_tftacrulesfull1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1347 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred45_tftacrulesfull1461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred45_tftacrulesfull1465 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred45_tftacrulesfull1468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred45_tftacrulesfull1472 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred45_tftacrulesfull1476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred46_tftacrulesfull1506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred46_tftacrulesfull1510 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred46_tftacrulesfull1513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred46_tftacrulesfull1517 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred46_tftacrulesfull1521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred47_tftacrulesfull1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred47_tftacrulesfull1554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred47_tftacrulesfull1558 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred47_tftacrulesfull1562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred47_tftacrulesfull1567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred48_tftacrulesfull1695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred48_tftacrulesfull1701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred49_tftacrulesfull1716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred49_tftacrulesfull1718 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred50_tftacrulesfull1736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrulesfull1738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrulesfull1740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred51_tftacrulesfull1754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred51_tftacrulesfull1760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred52_tftacrulesfull1775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred52_tftacrulesfull1777 = new BitSet(new long[]{0x0001FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred53_tftacrulesfull1795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred53_tftacrulesfull1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1802 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred54_tftacrulesfull1848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred54_tftacrulesfull1855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1859 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred55_tftacrulesfull1901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred55_tftacrulesfull1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1912 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred56_tftacrulesfull2019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred56_tftacrulesfull2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2026 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2030 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred57_tftacrulesfull2137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrulesfull2140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2144 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred58_tftacrulesfull2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2186 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred58_tftacrulesfull2189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2193 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred59_tftacrulesfull2227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred59_tftacrulesfull2231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred59_tftacrulesfull2234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred59_tftacrulesfull2238 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred59_tftacrulesfull2242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred60_tftacrulesfull2272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred60_tftacrulesfull2275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred60_tftacrulesfull2279 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred60_tftacrulesfull2283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred60_tftacrulesfull2288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred61_tftacrulesfull2367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_synpred61_tftacrulesfull2370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred61_tftacrulesfull2373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2377 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred62_tftacrulesfull2630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred62_tftacrulesfull2634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred63_tftacrulesfull2653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_synpred63_tftacrulesfull2656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred63_tftacrulesfull2660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred64_tftacrulesfull2676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred64_tftacrulesfull2679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred64_tftacrulesfull2683 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred64_tftacrulesfull2687 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred65_tftacrulesfull2720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred65_tftacrulesfull2723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred65_tftacrulesfull2728 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred65_tftacrulesfull2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred66_tftacrulesfull2764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred66_tftacrulesfull2767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred66_tftacrulesfull2772 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred66_tftacrulesfull2776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred67_tftacrulesfull2808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred67_tftacrulesfull2811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred67_tftacrulesfull2815 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred67_tftacrulesfull2819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred68_tftacrulesfull2969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred68_tftacrulesfull2971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred73_tftacrulesfull3011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred73_tftacrulesfull3015 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred73_tftacrulesfull3019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred74_tftacrulesfull3041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred74_tftacrulesfull3045 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred74_tftacrulesfull3049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred75_tftacrulesfull3071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred75_tftacrulesfull3075 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred75_tftacrulesfull3079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred76_tftacrulesfull3098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred76_tftacrulesfull3102 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred76_tftacrulesfull3106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred77_tftacrulesfull3128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred77_tftacrulesfull3132 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred77_tftacrulesfull3136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negAndTerm_in_synpred80_tftacrulesfull3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negOrTerm_in_synpred81_tftacrulesfull3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negXorTerm_in_synpred82_tftacrulesfull3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negPandTerm_in_synpred83_tftacrulesfull3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred84_tftacrulesfull3222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred84_tftacrulesfull3225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred84_tftacrulesfull3229 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred84_tftacrulesfull3233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_synpred84_tftacrulesfull3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred85_tftacrulesfull3275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred85_tftacrulesfull3279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred85_tftacrulesfull3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred85_tftacrulesfull3286 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred85_tftacrulesfull3290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred86_tftacrulesfull3328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred86_tftacrulesfull3331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred86_tftacrulesfull3335 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred86_tftacrulesfull3339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_synpred86_tftacrulesfull3344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred87_tftacrulesfull3381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred87_tftacrulesfull3385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred87_tftacrulesfull3388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred87_tftacrulesfull3392 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred87_tftacrulesfull3396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred88_tftacrulesfull3434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred88_tftacrulesfull3438 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred88_tftacrulesfull3441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred88_tftacrulesfull3445 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred88_tftacrulesfull3449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred89_tftacrulesfull3498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred89_tftacrulesfull3502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred89_tftacrulesfull3505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred89_tftacrulesfull3509 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred89_tftacrulesfull3513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred90_tftacrulesfull3544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred90_tftacrulesfull3548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred90_tftacrulesfull3551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred90_tftacrulesfull3555 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred90_tftacrulesfull3559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred91_tftacrulesfull3608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred91_tftacrulesfull3612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred91_tftacrulesfull3615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred91_tftacrulesfull3619 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred91_tftacrulesfull3623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred92_tftacrulesfull3654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred92_tftacrulesfull3658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred92_tftacrulesfull3661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred92_tftacrulesfull3665 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred92_tftacrulesfull3669 = new BitSet(new long[]{0x0000000000000008L});

}