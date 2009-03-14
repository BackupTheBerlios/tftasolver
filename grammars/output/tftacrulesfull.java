// $ANTLR 3.1.2 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g 2009-03-14 19:52:34

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacrulesfull extends TreeParser {
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
    public static final int LBRACE=10;
    public static final int J=35;
    public static final int K=36;
    public static final int U=24;
    public static final int PAND=7;
    public static final int T=23;
    public static final int W=40;
    public static final int V=39;
    public static final int INT=28;
    public static final int Q=38;
    public static final int P=18;
    public static final int S=19;
    public static final int NOT=12;
    public static final int R=21;
    public static final int ID=9;
    public static final int AND=6;
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


        public tftacrulesfull(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacrulesfull(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[125+1];
             
             
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
            alt1 = dfa1.predict(input);
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
            alt6 = dfa6.predict(input);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:1: andTerm : ( ^( AND ( . ) FALSE ) -> FALSE | ^( AND FALSE ( . ) ) -> FALSE | ^( AND TRUE q= ( . ) ) -> $q | ^( AND q= ( . ) TRUE ) -> $q | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) | andTermWithNegated );
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
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

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
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:9: ( ^( AND ( . ) FALSE ) -> FALSE | ^( AND FALSE ( . ) ) -> FALSE | ^( AND TRUE q= ( . ) ) -> $q | ^( AND q= ( . ) TRUE ) -> $q | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) | andTermWithNegated )
            int alt7=11;
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



                    if ( input.LA(1)==Token.DOWN ) {
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

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
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
                    // elements: XOR, y, AND, x, AND, z, z
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



                    if ( input.LA(1)==Token.DOWN ) {
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



                        if ( input.LA(1)==Token.DOWN ) {
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

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, z, z, AND, x, AND, y
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



                    if ( input.LA(1)==Token.DOWN ) {
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

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
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
                    // elements: AND, z, y, x, z, OR, AND
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



                    if ( input.LA(1)==Token.DOWN ) {
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



                        if ( input.LA(1)==Token.DOWN ) {
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

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, z, x, y, AND, AND, OR
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



                    if ( input.LA(1)==Token.DOWN ) {
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

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, y, y, x, x, y
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


                    if ( input.LA(1)==Token.DOWN ) {
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

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:1: orTerm : ( ^( OR ( . ) TRUE ) -> TRUE | ^( OR TRUE ( . ) ) -> TRUE | ^( OR FALSE q= tt ) -> $q | ^( OR q= tt FALSE ) -> $q | ^( OR a= tt ^( OR b= tt c= tt ) ) -> ^( OR ^( OR $a $b) $c) | ^( OR tt tt ) );
    public final tftacrulesfull.orTerm_return orTerm() throws RecognitionException {
        tftacrulesfull.orTerm_return retval = new tftacrulesfull.orTerm_return();
        retval.start = input.LT(1);
        int orTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR62=null;
        Object wildcard63=null;
        Object TRUE64=null;
        Object OR65=null;
        Object TRUE66=null;
        Object wildcard67=null;
        Object OR68=null;
        Object FALSE69=null;
        Object OR70=null;
        Object FALSE71=null;
        Object OR72=null;
        Object OR73=null;
        Object OR74=null;
        tftacrulesfull.tt_return q = null;

        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;

        tftacrulesfull.tt_return tt75 = null;

        tftacrulesfull.tt_return tt76 = null;


        Object OR62_tree=null;
        Object wildcard63_tree=null;
        Object TRUE64_tree=null;
        Object OR65_tree=null;
        Object TRUE66_tree=null;
        Object wildcard67_tree=null;
        Object OR68_tree=null;
        Object FALSE69_tree=null;
        Object OR70_tree=null;
        Object FALSE71_tree=null;
        Object OR72_tree=null;
        Object OR73_tree=null;
        Object OR74_tree=null;
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:8: ( ^( OR ( . ) TRUE ) -> TRUE | ^( OR TRUE ( . ) ) -> TRUE | ^( OR FALSE q= tt ) -> $q | ^( OR q= tt FALSE ) -> $q | ^( OR a= tt ^( OR b= tt c= tt ) ) -> ^( OR ^( OR $a $b) $c) | ^( OR tt tt ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==OR) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred26_tftacrulesfull()) ) {
                    alt8=1;
                }
                else if ( (synpred27_tftacrulesfull()) ) {
                    alt8=2;
                }
                else if ( (synpred28_tftacrulesfull()) ) {
                    alt8=3;
                }
                else if ( (synpred29_tftacrulesfull()) ) {
                    alt8=4;
                }
                else if ( (synpred30_tftacrulesfull()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:10: ^( OR ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR62=(Object)match(input,OR,FOLLOW_OR_in_orTerm704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR62);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:15: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:16: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard63=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard63_tree = (Object)adaptor.dupTree(wildcard63);
                    adaptor.addChild(root_1, wildcard63_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE64=(Object)match(input,TRUE,FOLLOW_TRUE_in_orTerm710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE64);


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
                    // 131:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: ^( OR TRUE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR65=(Object)match(input,OR,FOLLOW_OR_in_orTerm725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR65);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE66=(Object)match(input,TRUE,FOLLOW_TRUE_in_orTerm727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE66);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:14: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:15: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard67=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard67_tree = (Object)adaptor.dupTree(wildcard67);
                    adaptor.addChild(root_1, wildcard67_tree);
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
                    // 133:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ^( OR FALSE q= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR68=(Object)match(input,OR,FOLLOW_OR_in_orTerm745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR68);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE69=(Object)match(input,FALSE,FOLLOW_FALSE_in_orTerm747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE69);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orTerm751);
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
                    // 135:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ^( OR q= tt FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR70=(Object)match(input,OR,FOLLOW_OR_in_orTerm766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR70);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_orTerm770);
                        q=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(q.getTree());
                        _last = (Object)input.LT(1);
                        FALSE71=(Object)match(input,FALSE,FOLLOW_FALSE_in_orTerm772); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_FALSE.add(FALSE71);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ^( OR a= tt ^( OR b= tt c= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR72=(Object)match(input,OR,FOLLOW_OR_in_orTerm787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR72);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_orTerm791);
                        a=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(a.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        OR73=(Object)match(input,OR,FOLLOW_OR_in_orTerm794); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_OR.add(OR73);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_orTerm798);
                            b=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(b.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_orTerm802);
                            c=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(c.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, b, c, OR, OR
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
                    // 139:4: -> ^( OR ^( OR $a $b) $c)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:7: ^( OR ^( OR $a $b) $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:12: ^( OR $a $b)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:140:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR74=(Object)match(input,OR,FOLLOW_OR_in_orTerm832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR74_tree = (Object)adaptor.dupNode(OR74);

                    root_1 = (Object)adaptor.becomeRoot(OR74_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_orTerm834);
                        tt75=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt75.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_orTerm836);
                        tt76=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt76.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:1: xorTerm : ( ^( XOR ( . ) TRUE ) -> TRUE | ^( XOR TRUE ( . ) ) -> TRUE | ^( XOR FALSE q= tt ) -> $q | ^( XOR q= tt FALSE ) -> $q | ^( XOR a= tt ^( XOR b= tt c= tt ) ) -> ^( XOR ^( XOR $a $b) $c) | ^( XOR tt tt ) );
    public final tftacrulesfull.xorTerm_return xorTerm() throws RecognitionException {
        tftacrulesfull.xorTerm_return retval = new tftacrulesfull.xorTerm_return();
        retval.start = input.LT(1);
        int xorTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR77=null;
        Object wildcard78=null;
        Object TRUE79=null;
        Object XOR80=null;
        Object TRUE81=null;
        Object wildcard82=null;
        Object XOR83=null;
        Object FALSE84=null;
        Object XOR85=null;
        Object FALSE86=null;
        Object XOR87=null;
        Object XOR88=null;
        Object XOR89=null;
        tftacrulesfull.tt_return q = null;

        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;

        tftacrulesfull.tt_return tt90 = null;

        tftacrulesfull.tt_return tt91 = null;


        Object XOR77_tree=null;
        Object wildcard78_tree=null;
        Object TRUE79_tree=null;
        Object XOR80_tree=null;
        Object TRUE81_tree=null;
        Object wildcard82_tree=null;
        Object XOR83_tree=null;
        Object FALSE84_tree=null;
        Object XOR85_tree=null;
        Object FALSE86_tree=null;
        Object XOR87_tree=null;
        Object XOR88_tree=null;
        Object XOR89_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:9: ( ^( XOR ( . ) TRUE ) -> TRUE | ^( XOR TRUE ( . ) ) -> TRUE | ^( XOR FALSE q= tt ) -> $q | ^( XOR q= tt FALSE ) -> $q | ^( XOR a= tt ^( XOR b= tt c= tt ) ) -> ^( XOR ^( XOR $a $b) $c) | ^( XOR tt tt ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==XOR) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred31_tftacrulesfull()) ) {
                    alt9=1;
                }
                else if ( (synpred32_tftacrulesfull()) ) {
                    alt9=2;
                }
                else if ( (synpred33_tftacrulesfull()) ) {
                    alt9=3;
                }
                else if ( (synpred34_tftacrulesfull()) ) {
                    alt9=4;
                }
                else if ( (synpred35_tftacrulesfull()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:11: ^( XOR ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR77=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR77);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard78=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard78_tree = (Object)adaptor.dupTree(wildcard78);
                    adaptor.addChild(root_1, wildcard78_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE79=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorTerm856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE79);


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
                    // 145:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:4: ^( XOR TRUE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR80=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR80);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE81=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorTerm873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE81);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:15: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:16: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard82=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard82_tree = (Object)adaptor.dupTree(wildcard82);
                    adaptor.addChild(root_1, wildcard82_tree);
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
                    // 147:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ^( XOR FALSE q= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR83=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR83);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE84=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorTerm893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE84);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorTerm897);
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
                    // 149:4: -> $q
                    {
                        adaptor.addChild(root_0, stream_q.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ^( XOR q= tt FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR85=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR85);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_xorTerm916);
                        q=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(q.getTree());
                        _last = (Object)input.LT(1);
                        FALSE86=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorTerm918); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_FALSE.add(FALSE86);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( XOR a= tt ^( XOR b= tt c= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR87=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR87);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_xorTerm937);
                        a=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(a.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        XOR88=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm940); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_XOR.add(XOR88);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_xorTerm944);
                            b=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(b.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_xorTerm948);
                            c=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(c.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, XOR, XOR, b, c
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
                    // 153:4: -> ^( XOR ^( XOR $a $b) $c)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:153:7: ^( XOR ^( XOR $a $b) $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:153:13: ^( XOR $a $b)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR89=(Object)match(input,XOR,FOLLOW_XOR_in_xorTerm978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR89_tree = (Object)adaptor.dupNode(XOR89);

                    root_1 = (Object)adaptor.becomeRoot(XOR89_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_xorTerm980);
                        tt90=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt90.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_xorTerm982);
                        tt91=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt91.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:1: pandTerm : ( ^( PAND ( . ) FALSE ) -> FALSE | ^( PAND FALSE ( . ) ) -> FALSE | ^( PAND ( . ) TRUE ) -> FALSE | ^( PAND TRUE x= tt ) -> $x | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notTerm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND ^( AND q1= negTerm q2= negTerm ) y= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z) ^( AND ^( AND $q1 $q2) ^( PAND $y $z) ) ) ^( PAND $y ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z) ) ) | ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );
    public final tftacrulesfull.pandTerm_return pandTerm() throws RecognitionException {
        tftacrulesfull.pandTerm_return retval = new tftacrulesfull.pandTerm_return();
        retval.start = input.LT(1);
        int pandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND92=null;
        Object wildcard93=null;
        Object FALSE94=null;
        Object PAND95=null;
        Object FALSE96=null;
        Object wildcard97=null;
        Object PAND98=null;
        Object wildcard99=null;
        Object TRUE100=null;
        Object PAND101=null;
        Object TRUE102=null;
        Object PAND103=null;
        Object XOR104=null;
        Object PAND105=null;
        Object XOR106=null;
        Object PAND107=null;
        Object OR108=null;
        Object PAND109=null;
        Object OR110=null;
        Object PAND111=null;
        Object PAND112=null;
        Object PAND113=null;
        Object AND114=null;
        Object PAND115=null;
        Object AND116=null;
        Object AND117=null;
        Object PAND118=null;
        Object AND119=null;
        Object PAND120=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notTerm_return b = null;

        tftacrulesfull.negTerm_return q1 = null;

        tftacrulesfull.negTerm_return q2 = null;

        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.tt_return tt121 = null;

        tftacrulesfull.tt_return tt122 = null;


        Object PAND92_tree=null;
        Object wildcard93_tree=null;
        Object FALSE94_tree=null;
        Object PAND95_tree=null;
        Object FALSE96_tree=null;
        Object wildcard97_tree=null;
        Object PAND98_tree=null;
        Object wildcard99_tree=null;
        Object TRUE100_tree=null;
        Object PAND101_tree=null;
        Object TRUE102_tree=null;
        Object PAND103_tree=null;
        Object XOR104_tree=null;
        Object PAND105_tree=null;
        Object XOR106_tree=null;
        Object PAND107_tree=null;
        Object OR108_tree=null;
        Object PAND109_tree=null;
        Object OR110_tree=null;
        Object PAND111_tree=null;
        Object PAND112_tree=null;
        Object PAND113_tree=null;
        Object AND114_tree=null;
        Object PAND115_tree=null;
        Object AND116_tree=null;
        Object AND117_tree=null;
        Object PAND118_tree=null;
        Object AND119_tree=null;
        Object PAND120_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notTerm=new RewriteRuleSubtreeStream(adaptor,"rule notTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:9: ( ^( PAND ( . ) FALSE ) -> FALSE | ^( PAND FALSE ( . ) ) -> FALSE | ^( PAND ( . ) TRUE ) -> FALSE | ^( PAND TRUE x= tt ) -> $x | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notTerm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND ^( AND q1= negTerm q2= negTerm ) y= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z) ^( AND ^( AND $q1 $q2) ^( PAND $y $z) ) ) ^( PAND $y ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z) ) ) | ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) )
            int alt10=13;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:11: ^( PAND ( . ) FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND92=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND92);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:18: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:19: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard93=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard93_tree = (Object)adaptor.dupTree(wildcard93);
                    adaptor.addChild(root_1, wildcard93_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    FALSE94=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandTerm1001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE94);


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
                    // 159:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:4: ^( PAND FALSE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND95=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND95);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE96=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandTerm1018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE96);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard97=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard97_tree = (Object)adaptor.dupTree(wildcard97);
                    adaptor.addChild(root_1, wildcard97_tree);
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
                    // 161:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:4: ^( PAND ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND98=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND98);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:11: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:12: .
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

                    _last = (Object)input.LT(1);
                    TRUE100=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandTerm1042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE100);


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
                    // 163:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:4: ^( PAND TRUE x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND101=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND101);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE102=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandTerm1059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE102);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1063);
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
                    // 165:4: -> $x
                    {
                        adaptor.addChild(root_0, stream_x.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND103=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND103);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR104=(Object)match(input,XOR,FOLLOW_XOR_in_pandTerm1081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR104);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1085);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1089);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1094);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, PAND, z, XOR, x, PAND, y
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
                    // 167:4: -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:7: ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:13: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:27: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND105=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND105);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1135);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        XOR106=(Object)match(input,XOR,FOLLOW_XOR_in_pandTerm1138); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_XOR.add(XOR106);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_pandTerm1142);
                            x=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_pandTerm1146);
                            y=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, PAND, z, z, y, PAND, XOR
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
                    // 169:4: -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:7: ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:13: ^( PAND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:27: ^( PAND $z $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND107=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND107);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR108=(Object)match(input,OR,FOLLOW_OR_in_pandTerm1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR108);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1192);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1196);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1201);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, PAND, PAND, z, y, OR
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
                    // 171:4: -> ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:7: ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:12: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:26: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND109=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND109);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1242);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        OR110=(Object)match(input,OR,FOLLOW_OR_in_pandTerm1245); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_OR.add(OR110);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_pandTerm1249);
                            x=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_pandTerm1253);
                            y=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, y, y, x, z, z, z, y, PAND, x, PAND, PAND
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
                    // 173:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:13: ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:19: ^( AND ^( NOT $x) ^( PAND $z $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:25: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:35: ^( PAND $z $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:16: ^( AND ^( NOT $y) ^( PAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:22: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:32: ^( PAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:10: ^( PAND $z ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:20: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND111=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND111);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1367);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        PAND112=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1370); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_PAND.add(PAND112);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_pandTerm1374);
                            x=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_pandTerm1378);
                            y=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, PAND, y, x
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
                    // 177:4: -> ^( PAND ^( AND $x $z) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:7: ^( PAND ^( AND $x $z) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:14: ^( AND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ^( PAND x= tt ^( AND b= notTerm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND113=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND113);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1412);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        AND114=(Object)match(input,AND,FOLLOW_AND_in_pandTerm1415); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_AND.add(AND114);



                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_notTerm_in_pandTerm1419);
                        b=notTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_notTerm.add(b.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1423);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, PAND, b, x
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
                    // 179:4: -> ^( AND $b ^( PAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:179:7: ^( AND $b ^( PAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:179:16: ^( PAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ^( PAND ^( AND ^( AND q1= negTerm q2= negTerm ) y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND115=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND115);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND116=(Object)match(input,AND,FOLLOW_AND_in_pandTerm1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND116);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_3 = _last;
                    Object _first_3 = null;
                    Object root_3 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND117=(Object)match(input,AND,FOLLOW_AND_in_pandTerm1459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND117);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_pandTerm1463);
                    q1=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(q1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_pandTerm1467);
                    q2=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(q2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_2, root_3);_last = _save_last_3;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1472);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1477);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: q1, AND, z, q1, y, z, y, PAND, y, z, AND, PAND, q2, q2, q2, PAND, q1, PAND
                    // token labels: 
                    // rule labels: retval, q2, q1, z, y
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_q2=new RewriteRuleSubtreeStream(adaptor,"rule q2",q2!=null?q2.tree:null);
                    RewriteRuleSubtreeStream stream_q1=new RewriteRuleSubtreeStream(adaptor,"rule q1",q1!=null?q1.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:4: -> ^( XOR ^( XOR ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z) ^( AND ^( AND $q1 $q2) ^( PAND $y $z) ) ) ^( PAND $y ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:7: ^( XOR ^( XOR ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z) ^( AND ^( AND $q1 $q2) ^( PAND $y $z) ) ) ^( PAND $y ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:13: ^( XOR ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z) ^( AND ^( AND $q1 $q2) ^( PAND $y $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:19: ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:26: ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:36: ^( OR ^( NOT $q1) ^( NOT $q2) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:41: ^( NOT $q1)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_6);

                        adaptor.addChild(root_6, stream_q1.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:52: ^( NOT $q2)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_6);

                        adaptor.addChild(root_6, stream_q2.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:12: ^( AND ^( AND $q1 $q2) ^( PAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:18: ^( AND $q1 $q2)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_q1.nextTree());
                        adaptor.addChild(root_4, stream_q2.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:33: ^( PAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:6: ^( PAND $y ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:16: ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:23: ^( OR ^( NOT $q1) ^( NOT $q2) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:28: ^( NOT $q1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_5);

                        adaptor.addChild(root_5, stream_q1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:39: ^( NOT $q2)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_5);

                        adaptor.addChild(root_5, stream_q2.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:4: ^( PAND ^( AND n1= notTerm m1= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND118=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND118);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND119=(Object)match(input,AND,FOLLOW_AND_in_pandTerm1621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND119);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_pandTerm1625);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1629);
                    m1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandTerm1634);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, AND, m1, z, PAND, m1, z, z, PAND, m1, n1, PAND, n1, n1
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
                    // 186:4: -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:7: ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:13: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:19: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:26: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:37: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:12: ^( AND $n1 ^( PAND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:22: ^( PAND $m1 $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:189:6: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:189:17: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:189:24: ^( NOT $n1)
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
                case 13 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ^( PAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND120=(Object)match(input,PAND,FOLLOW_PAND_in_pandTerm1745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND120_tree = (Object)adaptor.dupNode(PAND120);

                    root_1 = (Object)adaptor.becomeRoot(PAND120_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1747);
                        tt121=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt121.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_pandTerm1749);
                        tt122=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt122.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:1: sandTerm : ( ^( SAND ( . ) FALSE ) -> FALSE | ^( SAND FALSE ( . ) ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ( . ) TRUE ) -> FALSE | ^( SAND TRUE ( . ) ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notTerm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notTerm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );
    public final tftacrulesfull.sandTerm_return sandTerm() throws RecognitionException {
        tftacrulesfull.sandTerm_return retval = new tftacrulesfull.sandTerm_return();
        retval.start = input.LT(1);
        int sandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND123=null;
        Object wildcard124=null;
        Object FALSE125=null;
        Object SAND126=null;
        Object FALSE127=null;
        Object wildcard128=null;
        Object SAND129=null;
        Object TRUE130=null;
        Object TRUE131=null;
        Object SAND132=null;
        Object wildcard133=null;
        Object TRUE134=null;
        Object SAND135=null;
        Object TRUE136=null;
        Object wildcard137=null;
        Object SAND138=null;
        Object XOR139=null;
        Object SAND140=null;
        Object XOR141=null;
        Object SAND142=null;
        Object OR143=null;
        Object SAND144=null;
        Object OR145=null;
        Object SAND146=null;
        Object PAND147=null;
        Object SAND148=null;
        Object PAND149=null;
        Object SAND150=null;
        Object AND151=null;
        Object SAND152=null;
        Object AND153=null;
        Object SAND154=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notTerm_return a = null;

        tftacrulesfull.tt_return tt155 = null;

        tftacrulesfull.tt_return tt156 = null;


        Object SAND123_tree=null;
        Object wildcard124_tree=null;
        Object FALSE125_tree=null;
        Object SAND126_tree=null;
        Object FALSE127_tree=null;
        Object wildcard128_tree=null;
        Object SAND129_tree=null;
        Object TRUE130_tree=null;
        Object TRUE131_tree=null;
        Object SAND132_tree=null;
        Object wildcard133_tree=null;
        Object TRUE134_tree=null;
        Object SAND135_tree=null;
        Object TRUE136_tree=null;
        Object wildcard137_tree=null;
        Object SAND138_tree=null;
        Object XOR139_tree=null;
        Object SAND140_tree=null;
        Object XOR141_tree=null;
        Object SAND142_tree=null;
        Object OR143_tree=null;
        Object SAND144_tree=null;
        Object OR145_tree=null;
        Object SAND146_tree=null;
        Object PAND147_tree=null;
        Object SAND148_tree=null;
        Object PAND149_tree=null;
        Object SAND150_tree=null;
        Object AND151_tree=null;
        Object SAND152_tree=null;
        Object AND153_tree=null;
        Object SAND154_tree=null;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:9: ( ^( SAND ( . ) FALSE ) -> FALSE | ^( SAND FALSE ( . ) ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ( . ) TRUE ) -> FALSE | ^( SAND TRUE ( . ) ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notTerm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notTerm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) )
            int alt11=14;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:11: ^( SAND ( . ) FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND123=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND123);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:18: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:19: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard124=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard124_tree = (Object)adaptor.dupTree(wildcard124);
                    adaptor.addChild(root_1, wildcard124_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    FALSE125=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandTerm1768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE125);


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
                    // 195:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:4: ^( SAND FALSE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND126=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND126);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE127=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandTerm1785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE127);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:17: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:18: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard128=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard128_tree = (Object)adaptor.dupTree(wildcard128);
                    adaptor.addChild(root_1, wildcard128_tree);
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
                    // 197:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:198:4: ^( SAND TRUE TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND129=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND129);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE130=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE130);

                    _last = (Object)input.LT(1);
                    TRUE131=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE131);


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
                    // 199:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:4: ^( SAND ( . ) TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND132=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND132);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:11: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:12: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard133=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard133_tree = (Object)adaptor.dupTree(wildcard133);
                    adaptor.addChild(root_1, wildcard133_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }

                    _last = (Object)input.LT(1);
                    TRUE134=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE134);


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
                    // 201:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:4: ^( SAND TRUE ( . ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND135=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND135);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE136=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandTerm1844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE136);

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:16: ( . )
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:17: .
                    {
                    _last = (Object)input.LT(1);
                    wildcard137=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard137_tree = (Object)adaptor.dupTree(wildcard137);
                    adaptor.addChild(root_1, wildcard137_tree);
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
                    // 203:4: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND138=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND138);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR139=(Object)match(input,XOR,FOLLOW_XOR_in_sandTerm1865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR139);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm1869);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm1873);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm1878);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, SAND, z, SAND, z, y, x
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
                    // 205:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND140=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND140);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm1919);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        XOR141=(Object)match(input,XOR,FOLLOW_XOR_in_sandTerm1922); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_XOR.add(XOR141);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_sandTerm1926);
                            x=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_sandTerm1930);
                            y=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, SAND, z, z, SAND, XOR, x
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
                    // 207:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND142=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm1968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND142);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm1972);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        OR143=(Object)match(input,OR,FOLLOW_OR_in_sandTerm1975); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_OR.add(OR143);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_sandTerm1979);
                            x=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_sandTerm1983);
                            y=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, x, y, z, x, z, SAND, x, z, SAND, SAND, y, y
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
                    // 209:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:12: ^( AND ^( NOT $y) ^( SAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:19: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:29: ^( SAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:6: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:16: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND144=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND144);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR145=(Object)match(input,OR,FOLLOW_OR_in_sandTerm2089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR145);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2093);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2097);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2102);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, z, z, SAND, x, y, SAND, SAND, x, z, x, y, y
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
                    // 213:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:12: ^( AND ^( NOT $y) ^( SAND $x $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:19: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:29: ^( SAND $x $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:6: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:16: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:216:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND146=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND146);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND147=(Object)match(input,PAND,FOLLOW_PAND_in_sandTerm2207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND147);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2211);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2215);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2220);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, z, SAND, PAND, x
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
                    // 217:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND148=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND148);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2253);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        PAND149=(Object)match(input,PAND,FOLLOW_PAND_in_sandTerm2256); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_PAND.add(PAND149);



                        if ( input.LA(1)==Token.DOWN ) {
                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_sandTerm2260);
                            x=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_tt_in_sandTerm2264);
                            y=tt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                            match(input, Token.UP, null); if (state.failed) return retval;
                        }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, SAND, z, x, PAND
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
                    // 219:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:220:4: ^( SAND x= tt ^( AND a= notTerm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND150=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND150);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2298);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        {
                        Object _save_last_2 = _last;
                        Object _first_2 = null;
                        Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                        AND151=(Object)match(input,AND,FOLLOW_AND_in_sandTerm2301); if (state.failed) return retval; 
                        if ( state.backtracking==0 ) stream_AND.add(AND151);



                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_notTerm_in_sandTerm2305);
                        a=notTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_notTerm.add(a.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2309);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, AND, x, a, z
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
                    // 221:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:221:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:221:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:222:4: ^( SAND ^( AND a= notTerm z= tt ) x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND152=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND152);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND153=(Object)match(input,AND,FOLLOW_AND_in_sandTerm2342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND153);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_sandTerm2346);
                    a=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2350);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandTerm2355);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, a, z, AND, x
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
                    // 223:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:223:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:223:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:224:4: ^( SAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND154=(Object)match(input,SAND,FOLLOW_SAND_in_sandTerm2385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND154_tree = (Object)adaptor.dupNode(SAND154);

                    root_1 = (Object)adaptor.becomeRoot(SAND154_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2387);
                        tt155=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt155.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_sandTerm2389);
                        tt156=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, tt156.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:228:1: notNOTTerm : ( ^( NOT ^( NOT a= tt ) ) -> $a | pureNegTerm );
    public final tftacrulesfull.notNOTTerm_return notNOTTerm() throws RecognitionException {
        tftacrulesfull.notNOTTerm_return retval = new tftacrulesfull.notNOTTerm_return();
        retval.start = input.LT(1);
        int notNOTTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT157=null;
        Object NOT158=null;
        tftacrulesfull.tt_return a = null;

        tftacrulesfull.pureNegTerm_return pureNegTerm159 = null;


        Object NOT157_tree=null;
        Object NOT158_tree=null;
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:229:2: ( ^( NOT ^( NOT a= tt ) ) -> $a | pureNegTerm )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
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
            else if ( (LA12_0==EOF||(LA12_0>=UP && LA12_0<=ID)||(LA12_0>=TRUE && LA12_0<=FALSE)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:229:4: ^( NOT ^( NOT a= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT157=(Object)match(input,NOT,FOLLOW_NOT_in_notNOTTerm2403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT157);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT158=(Object)match(input,NOT,FOLLOW_NOT_in_notNOTTerm2406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT158);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_notNOTTerm2410);
                        a=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(a.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
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
                    // 230:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:231:4: pureNegTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pureNegTerm_in_notNOTTerm2426);
                    pureNegTerm159=pureNegTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pureNegTerm159.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:235:1: andTermWithNegated : ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) ) | ^( AND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND ^( OR n1= notTerm n2= notTerm ) z= tt ) -> ^( OR ^( AND $n1 $z) ^( AND $n2 $z) ) | ^( AND ^( XOR n1= notTerm n2= notTerm ) z= tt ) -> ^( XOR ^( AND $n1 $z) ^( AND $n2 $z) ) | ^( AND n1= notTerm ^( XOR y= tt z= tt ) ) -> ^( XOR ^( AND $n1 $y) ^( AND $n1 $z) ) | ^( AND n1= notTerm ^( AND n2= notTerm z= tt ) ) -> ^( AND ^( AND $n1 $n2) $z) | ^( AND notTerm tt ) );
    public final tftacrulesfull.andTermWithNegated_return andTermWithNegated() throws RecognitionException {
        tftacrulesfull.andTermWithNegated_return retval = new tftacrulesfull.andTermWithNegated_return();
        retval.start = input.LT(1);
        int andTermWithNegated_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND160=null;
        Object NOT161=null;
        Object PAND162=null;
        Object AND163=null;
        Object AND164=null;
        Object AND165=null;
        Object OR166=null;
        Object AND167=null;
        Object XOR168=null;
        Object AND169=null;
        Object XOR170=null;
        Object AND171=null;
        Object AND172=null;
        Object AND173=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notTerm_return n2 = null;

        tftacrulesfull.notTerm_return notTerm174 = null;

        tftacrulesfull.tt_return tt175 = null;


        Object AND160_tree=null;
        Object NOT161_tree=null;
        Object PAND162_tree=null;
        Object AND163_tree=null;
        Object AND164_tree=null;
        Object AND165_tree=null;
        Object OR166_tree=null;
        Object AND167_tree=null;
        Object XOR168_tree=null;
        Object AND169_tree=null;
        Object XOR170_tree=null;
        Object AND171_tree=null;
        Object AND172_tree=null;
        Object AND173_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notTerm=new RewriteRuleSubtreeStream(adaptor,"rule notTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:236:2: ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) ) | ^( AND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND ^( OR n1= notTerm n2= notTerm ) z= tt ) -> ^( OR ^( AND $n1 $z) ^( AND $n2 $z) ) | ^( AND ^( XOR n1= notTerm n2= notTerm ) z= tt ) -> ^( XOR ^( AND $n1 $z) ^( AND $n2 $z) ) | ^( AND n1= notTerm ^( XOR y= tt z= tt ) ) -> ^( XOR ^( AND $n1 $y) ^( AND $n1 $z) ) | ^( AND n1= notTerm ^( AND n2= notTerm z= tt ) ) -> ^( AND ^( AND $n1 $n2) $z) | ^( AND notTerm tt ) )
            int alt13=7;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AND) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred62_tftacrulesfull()) ) {
                    alt13=1;
                }
                else if ( (synpred63_tftacrulesfull()) ) {
                    alt13=2;
                }
                else if ( (synpred64_tftacrulesfull()) ) {
                    alt13=3;
                }
                else if ( (synpred65_tftacrulesfull()) ) {
                    alt13=4;
                }
                else if ( (synpred66_tftacrulesfull()) ) {
                    alt13=5;
                }
                else if ( (synpred67_tftacrulesfull()) ) {
                    alt13=6;
                }
                else if ( (true) ) {
                    alt13=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:236:4: ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND160=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND160);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT161=(Object)match(input,NOT,FOLLOW_NOT_in_andTermWithNegated2442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT161);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_3 = _last;
                    Object _first_3 = null;
                    Object root_3 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND162=(Object)match(input,PAND,FOLLOW_PAND_in_andTermWithNegated2445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND162);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_andTermWithNegated2449);
                        x=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_andTermWithNegated2453);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_2, root_3);_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2460);
                    m1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: m1, y, AND, y, x, NOT, NOT, x, AND, NOT, NOT, AND, m1, AND, PAND, AND, x, x, y, x, m1, y, AND, y, m1, AND, AND, m1
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
                    // 237:4: -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) ) ^( AND ^( SAND $x $y) $m1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:13: ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( AND ^( PAND $y $x) $m1) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:19: ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:25: ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:31: ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:37: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_6);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:43: ^( NOT $x)
                        {
                        Object root_7 = (Object)adaptor.nil();
                        root_7 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_7);

                        adaptor.addChild(root_7, stream_x.nextTree());

                        adaptor.addChild(root_6, root_7);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:237:53: ^( NOT $y)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:239:17: ^( AND ^( AND ^( NOT $x) $y) $m1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:239:23: ^( AND ^( NOT $x) $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_6);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:239:29: ^( NOT $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:241:18: ^( AND ^( NOT $y) ^( AND $x $m1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:241:24: ^( NOT $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:241:34: ^( AND $x $m1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:242:12: ^( AND ^( PAND $y $x) $m1)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:242:18: ^( PAND $y $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:243:6: ^( AND ^( SAND $x $y) $m1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:243:12: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:4: ^( AND ^( AND n1= notTerm m1= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND163=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND163);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND164=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND164);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2690);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2694);
                    m1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2699);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, n1, AND, n1, m1, z, m1, z, m1, AND, n1
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
                    // 245:4: -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:7: ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:13: ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:19: ^( AND $n1 ^( AND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:29: ^( AND $m1 $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:44: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:51: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:62: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:245:99: ^( NOT $n1)
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
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:246:4: ^( AND ^( OR n1= notTerm n2= notTerm ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND165=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND165);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR166=(Object)match(input,OR,FOLLOW_OR_in_andTermWithNegated2784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR166);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2789);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2793);
                    n2=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2798);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, OR, n1, n2, z, AND, z
                    // token labels: 
                    // rule labels: n1, retval, n2, z
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:4: -> ^( OR ^( AND $n1 $z) ^( AND $n2 $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:247:7: ^( OR ^( AND $n1 $z) ^( AND $n2 $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:247:12: ^( AND $n1 $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:247:26: ^( AND $n2 $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n2.nextTree());
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:248:4: ^( AND ^( XOR n1= notTerm n2= notTerm ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND167=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND167);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR168=(Object)match(input,XOR,FOLLOW_XOR_in_andTermWithNegated2838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR168);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2843);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2847);
                    n2=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2852);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, n1, n2, AND, AND, XOR, z
                    // token labels: 
                    // rule labels: n1, retval, n2, z
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:4: -> ^( XOR ^( AND $n1 $z) ^( AND $n2 $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:249:7: ^( XOR ^( AND $n1 $z) ^( AND $n2 $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:249:13: ^( AND $n1 $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:249:27: ^( AND $n2 $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n2.nextTree());
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:250:4: ^( AND n1= notTerm ^( XOR y= tt z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND169=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND169);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2894);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR170=(Object)match(input,XOR,FOLLOW_XOR_in_andTermWithNegated2897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR170);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_andTermWithNegated2901);
                        y=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(y.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_tt_in_andTermWithNegated2905);
                        z=tt();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, AND, n1, AND, z, n1, XOR
                    // token labels: 
                    // rule labels: n1, retval, z, y
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:4: -> ^( XOR ^( AND $n1 $y) ^( AND $n1 $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:251:7: ^( XOR ^( AND $n1 $y) ^( AND $n1 $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:251:13: ^( AND $n1 $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:251:27: ^( AND $n1 $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:252:4: ^( AND n1= notTerm ^( AND n2= notTerm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND171=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND171);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2947);
                    n1=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND172=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND172);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2954);
                    n2=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notTerm.add(n2.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2958);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, n1, z, n2, AND
                    // token labels: 
                    // rule labels: n1, retval, n2, z
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"rule z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:4: -> ^( AND ^( AND $n1 $n2) $z)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:253:7: ^( AND ^( AND $n1 $n2) $z)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:253:13: ^( AND $n1 $n2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_n2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_z.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:254:4: ^( AND notTerm tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND173=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegated2989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND173_tree = (Object)adaptor.dupNode(AND173);

                    root_1 = (Object)adaptor.becomeRoot(AND173_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notTerm_in_andTermWithNegated2991);
                    notTerm174=notTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notTerm174.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegated2993);
                    tt175=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt175.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:258:1: notTerm : ( ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( NOT ^( NOT x= negTerm ) ) -> $x | ^( NOT negTerm ) | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm );
    public final tftacrulesfull.notTerm_return notTerm() throws RecognitionException {
        tftacrulesfull.notTerm_return retval = new tftacrulesfull.notTerm_return();
        retval.start = input.LT(1);
        int notTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT176=null;
        Object AND177=null;
        Object NOT178=null;
        Object OR179=null;
        Object NOT180=null;
        Object XOR181=null;
        Object NOT182=null;
        Object SAND183=null;
        Object NOT184=null;
        Object NOT185=null;
        Object NOT186=null;
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return negTerm187 = null;

        tftacrulesfull.negAndTerm_return negAndTerm188 = null;

        tftacrulesfull.negOrTerm_return negOrTerm189 = null;

        tftacrulesfull.negXorTerm_return negXorTerm190 = null;

        tftacrulesfull.negPandTerm_return negPandTerm191 = null;

        tftacrulesfull.negSandTerm_return negSandTerm192 = null;


        Object NOT176_tree=null;
        Object AND177_tree=null;
        Object NOT178_tree=null;
        Object OR179_tree=null;
        Object NOT180_tree=null;
        Object XOR181_tree=null;
        Object NOT182_tree=null;
        Object SAND183_tree=null;
        Object NOT184_tree=null;
        Object NOT185_tree=null;
        Object NOT186_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:259:2: ( ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( NOT ^( NOT x= negTerm ) ) -> $x | ^( NOT negTerm ) | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm )
            int alt14=11;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:259:4: ^( NOT ^( AND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT176=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT176);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND177=(Object)match(input,AND,FOLLOW_AND_in_notTerm3013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND177);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3017);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3021);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, x, y, NOT
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
                    // 260:4: -> ^( OR ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:260:7: ^( OR ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:260:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:260:23: ^( NOT $y)
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
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:261:4: ^( NOT ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT178=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT178);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR179=(Object)match(input,OR,FOLLOW_OR_in_notTerm3057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR179);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3062);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3066);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, NOT, NOT
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
                    // 262:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:262:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:262:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:262:23: ^( NOT $y)
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
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:263:4: ^( NOT ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT180=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT180);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR181=(Object)match(input,XOR,FOLLOW_XOR_in_notTerm3101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR181);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3106);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3110);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, NOT, NOT
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
                    // 264:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:264:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:264:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:264:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:265:4: ^( NOT ^( SAND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT182=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT182);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND183=(Object)match(input,SAND,FOLLOW_SAND_in_notTerm3145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND183);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3149);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3153);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, x, x, NOT, NOT, y, y, NOT, y, y, NOT, x, y, x
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
                    // 266:4: -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:13: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:19: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:25: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:266:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:267:15: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:267:21: ^( NOT $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:268:18: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:268:24: ^( NOT $y)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:269:12: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:270:6: ^( PAND $x $y)
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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:271:4: ^( NOT ^( NOT x= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT184=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT184);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT185=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT185);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3310);
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
                    // 272:4: -> $x
                    {
                        adaptor.addChild(root_0, stream_x.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:273:4: ^( NOT negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT186=(Object)match(input,NOT,FOLLOW_NOT_in_notTerm3326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT186_tree = (Object)adaptor.dupNode(NOT186);

                    root_1 = (Object)adaptor.becomeRoot(NOT186_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_notTerm3328);
                    negTerm187=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm187.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:274:4: negAndTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negAndTerm_in_notTerm3334);
                    negAndTerm188=negAndTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negAndTerm188.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:275:4: negOrTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negOrTerm_in_notTerm3339);
                    negOrTerm189=negOrTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negOrTerm189.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:276:4: negXorTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negXorTerm_in_notTerm3344);
                    negXorTerm190=negXorTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negXorTerm190.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:277:4: negPandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negPandTerm_in_notTerm3349);
                    negPandTerm191=negPandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negPandTerm191.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:278:4: negSandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negSandTerm_in_notTerm3354);
                    negSandTerm192=negSandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negSandTerm192.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:282:1: negTerm : ( atom | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm | ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT negTerm ) );
    public final tftacrulesfull.negTerm_return negTerm() throws RecognitionException {
        tftacrulesfull.negTerm_return retval = new tftacrulesfull.negTerm_return();
        retval.start = input.LT(1);
        int negTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT199=null;
        Object AND200=null;
        Object NOT201=null;
        Object OR202=null;
        Object NOT203=null;
        Object XOR204=null;
        Object NOT205=null;
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.atom_return atom193 = null;

        tftacrulesfull.negAndTerm_return negAndTerm194 = null;

        tftacrulesfull.negOrTerm_return negOrTerm195 = null;

        tftacrulesfull.negXorTerm_return negXorTerm196 = null;

        tftacrulesfull.negPandTerm_return negPandTerm197 = null;

        tftacrulesfull.negSandTerm_return negSandTerm198 = null;

        tftacrulesfull.negTerm_return negTerm206 = null;


        Object NOT199_tree=null;
        Object AND200_tree=null;
        Object NOT201_tree=null;
        Object OR202_tree=null;
        Object NOT203_tree=null;
        Object XOR204_tree=null;
        Object NOT205_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:283:2: ( atom | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm | ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT negTerm ) )
            int alt15=10;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:293:6: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_negTerm3370);
                    atom193=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom193.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:294:4: negAndTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negAndTerm_in_negTerm3375);
                    negAndTerm194=negAndTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negAndTerm194.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:295:4: negOrTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negOrTerm_in_negTerm3380);
                    negOrTerm195=negOrTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negOrTerm195.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:296:4: negXorTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negXorTerm_in_negTerm3385);
                    negXorTerm196=negXorTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negXorTerm196.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:297:4: negPandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negPandTerm_in_negTerm3390);
                    negPandTerm197=negPandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negPandTerm197.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:298:4: negSandTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negSandTerm_in_negTerm3395);
                    negSandTerm198=negSandTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negSandTerm198.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:299:4: ^( NOT ^( AND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT199=(Object)match(input,NOT,FOLLOW_NOT_in_negTerm3401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT199);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND200=(Object)match(input,AND,FOLLOW_AND_in_negTerm3404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND200);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3408);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3412);
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
                    // 300:4: -> ^( OR ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:300:7: ^( OR ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:300:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:300:23: ^( NOT $y)
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
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:301:4: ^( NOT ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT201=(Object)match(input,NOT,FOLLOW_NOT_in_negTerm3445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT201);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR202=(Object)match(input,OR,FOLLOW_OR_in_negTerm3448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR202);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3453);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3457);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, NOT, NOT, x
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
                    // 302:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:302:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:302:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:302:23: ^( NOT $y)
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
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:303:4: ^( NOT ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT203=(Object)match(input,NOT,FOLLOW_NOT_in_negTerm3489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT203);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR204=(Object)match(input,XOR,FOLLOW_XOR_in_negTerm3492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR204);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3497);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3501);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, y, NOT, x
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
                    // 304:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:304:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:304:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:304:23: ^( NOT $y)
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
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:305:4: ^( NOT negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT205=(Object)match(input,NOT,FOLLOW_NOT_in_negTerm3533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT205_tree = (Object)adaptor.dupNode(NOT205);

                    root_1 = (Object)adaptor.becomeRoot(NOT205_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negTerm3535);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:310:1: negAndTerm : ( ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) ) -> ^( AND ^( AND $z $x) $y) | ^( AND negTerm negTerm ) );
    public final tftacrulesfull.negAndTerm_return negAndTerm() throws RecognitionException {
        tftacrulesfull.negAndTerm_return retval = new tftacrulesfull.negAndTerm_return();
        retval.start = input.LT(1);
        int negAndTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND207=null;
        Object XOR208=null;
        Object AND209=null;
        Object XOR210=null;
        Object AND211=null;
        Object OR212=null;
        Object AND213=null;
        Object OR214=null;
        Object AND215=null;
        Object AND216=null;
        Object AND217=null;
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return negTerm218 = null;

        tftacrulesfull.negTerm_return negTerm219 = null;


        Object AND207_tree=null;
        Object XOR208_tree=null;
        Object AND209_tree=null;
        Object XOR210_tree=null;
        Object AND211_tree=null;
        Object OR212_tree=null;
        Object AND213_tree=null;
        Object OR214_tree=null;
        Object AND215_tree=null;
        Object AND216_tree=null;
        Object AND217_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:311:2: ( ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) ) -> ^( AND ^( AND $z $x) $y) | ^( AND negTerm negTerm ) )
            int alt16=6;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==AND) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred87_tftacrulesfull()) ) {
                    alt16=1;
                }
                else if ( (synpred88_tftacrulesfull()) ) {
                    alt16=2;
                }
                else if ( (synpred89_tftacrulesfull()) ) {
                    alt16=3;
                }
                else if ( (synpred90_tftacrulesfull()) ) {
                    alt16=4;
                }
                else if ( (synpred91_tftacrulesfull()) ) {
                    alt16=5;
                }
                else if ( (true) ) {
                    alt16=6;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:311:4: ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND207=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND207);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR208=(Object)match(input,XOR,FOLLOW_XOR_in_negAndTerm3556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR208);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3560);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3564);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3569);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, z, y, AND, x, AND, XOR
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
                    // 312:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:312:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:312:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:312:26: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:313:4: ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND209=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND209);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3610);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR210=(Object)match(input,XOR,FOLLOW_XOR_in_negAndTerm3613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR210);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3617);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3621);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, z, AND, AND, x, z, XOR
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
                    // 314:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:314:26: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:315:4: ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND211=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND211);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR212=(Object)match(input,OR,FOLLOW_OR_in_negAndTerm3662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR212);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3666);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3670);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3675);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, x, AND, OR, y, z
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
                    // 316:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:316:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:316:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:316:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:317:4: ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND213=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND213);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3716);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR214=(Object)match(input,OR,FOLLOW_OR_in_negAndTerm3719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR214);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3723);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3727);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, x, AND, z, y, z, AND
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
                    // 318:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:318:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:318:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:318:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:319:4: ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND215=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND215);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3769);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND216=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND216);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3776);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3780);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, AND, AND, y, z
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
                    // 320:4: -> ^( AND ^( AND $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:320:7: ^( AND ^( AND $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:320:13: ^( AND $z $x)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:321:4: ^( AND negTerm negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND217=(Object)match(input,AND,FOLLOW_AND_in_negAndTerm3811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND217_tree = (Object)adaptor.dupNode(AND217);

                    root_1 = (Object)adaptor.becomeRoot(AND217_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3813);
                    negTerm218=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm218.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negAndTerm3815);
                    negTerm219=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm219.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:324:1: negOrTerm : ( ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR negTerm negTerm ) );
    public final tftacrulesfull.negOrTerm_return negOrTerm() throws RecognitionException {
        tftacrulesfull.negOrTerm_return retval = new tftacrulesfull.negOrTerm_return();
        retval.start = input.LT(1);
        int negOrTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR220=null;
        Object XOR221=null;
        Object OR222=null;
        Object OR223=null;
        Object OR224=null;
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return negTerm225 = null;

        tftacrulesfull.negTerm_return negTerm226 = null;


        Object OR220_tree=null;
        Object XOR221_tree=null;
        Object OR222_tree=null;
        Object OR223_tree=null;
        Object OR224_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:325:2: ( ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( OR negTerm negTerm ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OR) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred92_tftacrulesfull()) ) {
                    alt17=1;
                }
                else if ( (synpred93_tftacrulesfull()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:325:4: ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR220=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR220);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3833);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR221=(Object)match(input,XOR,FOLLOW_XOR_in_negOrTerm3836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR221);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3840);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3844);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, OR, OR, z, y
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
                    // 326:4: -> ^( OR ^( OR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:326:7: ^( OR ^( OR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:326:12: ^( OR $z $x)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:327:4: ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR222=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR222);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3879);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR223=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR223);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3886);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3890);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, x, y, z, OR
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
                    // 328:4: -> ^( OR ^( OR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:328:7: ^( OR ^( OR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:328:12: ^( OR $z $x)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:329:4: ^( OR negTerm negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR224=(Object)match(input,OR,FOLLOW_OR_in_negOrTerm3921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR224_tree = (Object)adaptor.dupNode(OR224);

                    root_1 = (Object)adaptor.becomeRoot(OR224_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3923);
                    negTerm225=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm225.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negOrTerm3925);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:332:1: negXorTerm : ( ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR $z $x) $y) | ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( XOR negTerm negTerm ) );
    public final tftacrulesfull.negXorTerm_return negXorTerm() throws RecognitionException {
        tftacrulesfull.negXorTerm_return retval = new tftacrulesfull.negXorTerm_return();
        retval.start = input.LT(1);
        int negXorTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR227=null;
        Object XOR228=null;
        Object XOR229=null;
        Object OR230=null;
        Object XOR231=null;
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return negTerm232 = null;

        tftacrulesfull.negTerm_return negTerm233 = null;


        Object XOR227_tree=null;
        Object XOR228_tree=null;
        Object XOR229_tree=null;
        Object OR230_tree=null;
        Object XOR231_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_negTerm=new RewriteRuleSubtreeStream(adaptor,"rule negTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:333:2: ( ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR $z $x) $y) | ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) ) -> ^( OR ^( OR $z $x) $y) | ^( XOR negTerm negTerm ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==XOR) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred94_tftacrulesfull()) ) {
                    alt18=1;
                }
                else if ( (synpred95_tftacrulesfull()) ) {
                    alt18=2;
                }
                else if ( (true) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:333:4: ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR227=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR227);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3943);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR228=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR228);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3950);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3954);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, y, XOR, x, z
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
                    // 334:4: -> ^( XOR ^( XOR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:334:7: ^( XOR ^( XOR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:334:13: ^( XOR $z $x)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:335:4: ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR229=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm3985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR229);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3989);
                    z=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR230=(Object)match(input,OR,FOLLOW_OR_in_negXorTerm3992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR230);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm3996);
                    x=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm4000);
                    y=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negTerm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, y, x, z, OR
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
                    // 336:4: -> ^( OR ^( OR $z $x) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:336:7: ^( OR ^( OR $z $x) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:336:12: ^( OR $z $x)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:337:4: ^( XOR negTerm negTerm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR231=(Object)match(input,XOR,FOLLOW_XOR_in_negXorTerm4031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR231_tree = (Object)adaptor.dupNode(XOR231);

                    root_1 = (Object)adaptor.becomeRoot(XOR231_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm4033);
                    negTerm232=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm232.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negTerm_in_negXorTerm4035);
                    negTerm233=negTerm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negTerm233.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:340:1: negPandTerm : ^( PAND negTerm negTerm ) ;
    public final tftacrulesfull.negPandTerm_return negPandTerm() throws RecognitionException {
        tftacrulesfull.negPandTerm_return retval = new tftacrulesfull.negPandTerm_return();
        retval.start = input.LT(1);
        int negPandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND234=null;
        tftacrulesfull.negTerm_return negTerm235 = null;

        tftacrulesfull.negTerm_return negTerm236 = null;


        Object PAND234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:341:2: ( ^( PAND negTerm negTerm ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:341:4: ^( PAND negTerm negTerm )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            PAND234=(Object)match(input,PAND,FOLLOW_PAND_in_negPandTerm4049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAND234_tree = (Object)adaptor.dupNode(PAND234);

            root_1 = (Object)adaptor.becomeRoot(PAND234_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negPandTerm4051);
            negTerm235=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm235.getTree());
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negPandTerm4053);
            negTerm236=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm236.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:344:1: negSandTerm : ^( SAND negTerm negTerm ) ;
    public final tftacrulesfull.negSandTerm_return negSandTerm() throws RecognitionException {
        tftacrulesfull.negSandTerm_return retval = new tftacrulesfull.negSandTerm_return();
        retval.start = input.LT(1);
        int negSandTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND237=null;
        tftacrulesfull.negTerm_return negTerm238 = null;

        tftacrulesfull.negTerm_return negTerm239 = null;


        Object SAND237_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:345:2: ( ^( SAND negTerm negTerm ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:345:4: ^( SAND negTerm negTerm )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            SAND237=(Object)match(input,SAND,FOLLOW_SAND_in_negSandTerm4066); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SAND237_tree = (Object)adaptor.dupNode(SAND237);

            root_1 = (Object)adaptor.becomeRoot(SAND237_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negSandTerm4068);
            negTerm238=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm238.getTree());
            _last = (Object)input.LT(1);
            pushFollow(FOLLOW_negTerm_in_negSandTerm4070);
            negTerm239=negTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, negTerm239.getTree());

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

    public static class pureNegTerm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pureNegTerm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:348:1: pureNegTerm : ( | ^( NOT ^( AND a= pureNegTerm b= pureNegTerm ) ) -> ^( OR ^( NOT $a) ^( NOT $b) ) | ^( NOT ^( OR a= pureNegTerm b= pureNegTerm ) ) -> ^( AND ^( NOT $a) ^( NOT $b) ) | ^( NOT ^( XOR a= pureNegTerm b= pureNegTerm ) ) -> ^( AND ^( NOT $a) ^( NOT $b) ) | ^( NOT ^( PAND a= pureNegTerm b= pureNegTerm ) ) | ^( NOT ^( SAND a= pureNegTerm b= pureNegTerm ) ) );
    public final tftacrulesfull.pureNegTerm_return pureNegTerm() throws RecognitionException {
        tftacrulesfull.pureNegTerm_return retval = new tftacrulesfull.pureNegTerm_return();
        retval.start = input.LT(1);
        int pureNegTerm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT240=null;
        Object AND241=null;
        Object NOT242=null;
        Object OR243=null;
        Object NOT244=null;
        Object XOR245=null;
        Object NOT246=null;
        Object PAND247=null;
        Object NOT248=null;
        Object SAND249=null;
        tftacrulesfull.pureNegTerm_return a = null;

        tftacrulesfull.pureNegTerm_return b = null;


        Object NOT240_tree=null;
        Object AND241_tree=null;
        Object NOT242_tree=null;
        Object OR243_tree=null;
        Object NOT244_tree=null;
        Object XOR245_tree=null;
        Object NOT246_tree=null;
        Object PAND247_tree=null;
        Object NOT248_tree=null;
        Object SAND249_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_pureNegTerm=new RewriteRuleSubtreeStream(adaptor,"rule pureNegTerm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:349:2: ( | ^( NOT ^( AND a= pureNegTerm b= pureNegTerm ) ) -> ^( OR ^( NOT $a) ^( NOT $b) ) | ^( NOT ^( OR a= pureNegTerm b= pureNegTerm ) ) -> ^( AND ^( NOT $a) ^( NOT $b) ) | ^( NOT ^( XOR a= pureNegTerm b= pureNegTerm ) ) -> ^( AND ^( NOT $a) ^( NOT $b) ) | ^( NOT ^( PAND a= pureNegTerm b= pureNegTerm ) ) | ^( NOT ^( SAND a= pureNegTerm b= pureNegTerm ) ) )
            int alt19=6;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF||(LA19_0>=UP && LA19_0<=ID)||(LA19_0>=TRUE && LA19_0<=FALSE)) ) {
                alt19=1;
            }
            else if ( (LA19_0==NOT) ) {
                int LA19_2 = input.LA(2);

                if ( (synpred96_tftacrulesfull()) ) {
                    alt19=1;
                }
                else if ( (synpred97_tftacrulesfull()) ) {
                    alt19=2;
                }
                else if ( (synpred98_tftacrulesfull()) ) {
                    alt19=3;
                }
                else if ( (synpred99_tftacrulesfull()) ) {
                    alt19=4;
                }
                else if ( (synpred100_tftacrulesfull()) ) {
                    alt19=5;
                }
                else if ( (true) ) {
                    alt19=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:350:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:350:4: ^( NOT ^( AND a= pureNegTerm b= pureNegTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT240=(Object)match(input,NOT,FOLLOW_NOT_in_pureNegTerm4089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT240);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND241=(Object)match(input,AND,FOLLOW_AND_in_pureNegTerm4092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND241);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4096);
                        a=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_pureNegTerm.add(a.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4100);
                        b=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_pureNegTerm.add(b.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, NOT, a, b
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:4: -> ^( OR ^( NOT $a) ^( NOT $b) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:351:7: ^( OR ^( NOT $a) ^( NOT $b) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:351:12: ^( NOT $a)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:351:22: ^( NOT $b)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:352:4: ^( NOT ^( OR a= pureNegTerm b= pureNegTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT242=(Object)match(input,NOT,FOLLOW_NOT_in_pureNegTerm4131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT242);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR243=(Object)match(input,OR,FOLLOW_OR_in_pureNegTerm4134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR243);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4138);
                        a=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_pureNegTerm.add(a.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4142);
                        b=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_pureNegTerm.add(b.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, a, b, NOT
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:4: -> ^( AND ^( NOT $a) ^( NOT $b) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:353:7: ^( AND ^( NOT $a) ^( NOT $b) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:353:13: ^( NOT $a)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:353:23: ^( NOT $b)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:354:4: ^( NOT ^( XOR a= pureNegTerm b= pureNegTerm ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT244=(Object)match(input,NOT,FOLLOW_NOT_in_pureNegTerm4173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT244);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR245=(Object)match(input,XOR,FOLLOW_XOR_in_pureNegTerm4176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR245);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4180);
                        a=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_pureNegTerm.add(a.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4184);
                        b=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) stream_pureNegTerm.add(b.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, b, NOT, NOT
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:4: -> ^( AND ^( NOT $a) ^( NOT $b) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:355:7: ^( AND ^( NOT $a) ^( NOT $b) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:355:13: ^( NOT $a)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:355:23: ^( NOT $b)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:356:4: ^( NOT ^( PAND a= pureNegTerm b= pureNegTerm ) )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT246=(Object)match(input,NOT,FOLLOW_NOT_in_pureNegTerm4215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT246_tree = (Object)adaptor.dupNode(NOT246);

                    root_1 = (Object)adaptor.becomeRoot(NOT246_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND247=(Object)match(input,PAND,FOLLOW_PAND_in_pureNegTerm4218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND247_tree = (Object)adaptor.dupNode(PAND247);

                    root_2 = (Object)adaptor.becomeRoot(PAND247_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4222);
                        a=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, a.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4226);
                        b=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, b.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:357:4: ^( NOT ^( SAND a= pureNegTerm b= pureNegTerm ) )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT248=(Object)match(input,NOT,FOLLOW_NOT_in_pureNegTerm4234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT248_tree = (Object)adaptor.dupNode(NOT248);

                    root_1 = (Object)adaptor.becomeRoot(NOT248_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND249=(Object)match(input,SAND,FOLLOW_SAND_in_pureNegTerm4237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND249_tree = (Object)adaptor.dupNode(SAND249);

                    root_2 = (Object)adaptor.becomeRoot(SAND249_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4241);
                        a=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, a.getTree());
                        _last = (Object)input.LT(1);
                        pushFollow(FOLLOW_pureNegTerm_in_pureNegTerm4245);
                        b=pureNegTerm();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, b.getTree());

                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


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
            if ( state.backtracking>0 ) { memoize(input, 25, pureNegTerm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pureNegTerm"

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

    // $ANTLR start synpred10_tftacrulesfull
    public final void synpred10_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:7: ( atom )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:7: atom
        {
        pushFollow(FOLLOW_atom_in_synpred10_tftacrulesfull256);
        atom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_tftacrulesfull

    // $ANTLR start synpred11_tftacrulesfull
    public final void synpred11_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:94:4: ( andTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:94:4: andTerm
        {
        pushFollow(FOLLOW_andTerm_in_synpred11_tftacrulesfull261);
        andTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_tftacrulesfull

    // $ANTLR start synpred12_tftacrulesfull
    public final void synpred12_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:95:4: ( orTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:95:4: orTerm
        {
        pushFollow(FOLLOW_orTerm_in_synpred12_tftacrulesfull266);
        orTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_tftacrulesfull

    // $ANTLR start synpred13_tftacrulesfull
    public final void synpred13_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:96:4: ( xorTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:96:4: xorTerm
        {
        pushFollow(FOLLOW_xorTerm_in_synpred13_tftacrulesfull271);
        xorTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_tftacrulesfull

    // $ANTLR start synpred14_tftacrulesfull
    public final void synpred14_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:4: ( pandTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:4: pandTerm
        {
        pushFollow(FOLLOW_pandTerm_in_synpred14_tftacrulesfull276);
        pandTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_tftacrulesfull

    // $ANTLR start synpred15_tftacrulesfull
    public final void synpred15_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:98:4: ( sandTerm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:98:4: sandTerm
        {
        pushFollow(FOLLOW_sandTerm_in_synpred15_tftacrulesfull281);
        sandTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_tftacrulesfull

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

        if ( input.LA(1)==Token.DOWN ) {
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
        }
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

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull464);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,XOR,FOLLOW_XOR_in_synpred21_tftacrulesfull467); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
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
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

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

        if ( input.LA(1)==Token.DOWN ) {
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
        }
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

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull573);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,OR,FOLLOW_OR_in_synpred23_tftacrulesfull576); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
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
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

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

        if ( input.LA(1)==Token.DOWN ) {
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
    }
    // $ANTLR end synpred24_tftacrulesfull

    // $ANTLR start synpred25_tftacrulesfull
    public final void synpred25_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ( ^( AND tt tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ^( AND tt tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred25_tftacrulesfull681); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
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
    }
    // $ANTLR end synpred25_tftacrulesfull

    // $ANTLR start synpred26_tftacrulesfull
    public final void synpred26_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:10: ( ^( OR ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:10: ^( OR ( . ) TRUE )
        {
        match(input,OR,FOLLOW_OR_in_synpred26_tftacrulesfull704); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:15: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:16: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred26_tftacrulesfull710); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_tftacrulesfull

    // $ANTLR start synpred27_tftacrulesfull
    public final void synpred27_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: ( ^( OR TRUE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: ^( OR TRUE ( . ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred27_tftacrulesfull725); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred27_tftacrulesfull727); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:14: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:15: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_tftacrulesfull

    // $ANTLR start synpred28_tftacrulesfull
    public final void synpred28_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ( ^( OR FALSE q= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ^( OR FALSE q= tt )
        {
        match(input,OR,FOLLOW_OR_in_synpred28_tftacrulesfull745); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred28_tftacrulesfull747); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred28_tftacrulesfull751);
        q=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_tftacrulesfull

    // $ANTLR start synpred29_tftacrulesfull
    public final void synpred29_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ( ^( OR q= tt FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ^( OR q= tt FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred29_tftacrulesfull766); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred29_tftacrulesfull770);
            q=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,FALSE,FOLLOW_FALSE_in_synpred29_tftacrulesfull772); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred29_tftacrulesfull

    // $ANTLR start synpred30_tftacrulesfull
    public final void synpred30_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ( ^( OR a= tt ^( OR b= tt c= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ^( OR a= tt ^( OR b= tt c= tt ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred30_tftacrulesfull787); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred30_tftacrulesfull791);
            a=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,OR,FOLLOW_OR_in_synpred30_tftacrulesfull794); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred30_tftacrulesfull798);
                b=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred30_tftacrulesfull802);
                c=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred30_tftacrulesfull

    // $ANTLR start synpred31_tftacrulesfull
    public final void synpred31_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:11: ( ^( XOR ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:11: ^( XOR ( . ) TRUE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred31_tftacrulesfull850); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:18: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred31_tftacrulesfull856); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacrulesfull

    // $ANTLR start synpred32_tftacrulesfull
    public final void synpred32_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:4: ( ^( XOR TRUE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:4: ^( XOR TRUE ( . ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred32_tftacrulesfull871); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred32_tftacrulesfull873); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:15: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:16: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacrulesfull

    // $ANTLR start synpred33_tftacrulesfull
    public final void synpred33_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ( ^( XOR FALSE q= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ^( XOR FALSE q= tt )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred33_tftacrulesfull891); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred33_tftacrulesfull893); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred33_tftacrulesfull897);
        q=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacrulesfull

    // $ANTLR start synpred34_tftacrulesfull
    public final void synpred34_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return q = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ( ^( XOR q= tt FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ^( XOR q= tt FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred34_tftacrulesfull912); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred34_tftacrulesfull916);
            q=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,FALSE,FOLLOW_FALSE_in_synpred34_tftacrulesfull918); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred34_tftacrulesfull

    // $ANTLR start synpred35_tftacrulesfull
    public final void synpred35_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return a = null;

        tftacrulesfull.tt_return b = null;

        tftacrulesfull.tt_return c = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ( ^( XOR a= tt ^( XOR b= tt c= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( XOR a= tt ^( XOR b= tt c= tt ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred35_tftacrulesfull933); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred35_tftacrulesfull937);
            a=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,XOR,FOLLOW_XOR_in_synpred35_tftacrulesfull940); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred35_tftacrulesfull944);
                b=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred35_tftacrulesfull948);
                c=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred35_tftacrulesfull

    // $ANTLR start synpred36_tftacrulesfull
    public final void synpred36_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:11: ( ^( PAND ( . ) FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:11: ^( PAND ( . ) FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred36_tftacrulesfull995); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:18: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:19: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,FALSE,FOLLOW_FALSE_in_synpred36_tftacrulesfull1001); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_tftacrulesfull

    // $ANTLR start synpred37_tftacrulesfull
    public final void synpred37_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:4: ( ^( PAND FALSE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:4: ^( PAND FALSE ( . ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred37_tftacrulesfull1016); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred37_tftacrulesfull1018); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:160:18: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_tftacrulesfull

    // $ANTLR start synpred38_tftacrulesfull
    public final void synpred38_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:4: ( ^( PAND ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:4: ^( PAND ( . ) TRUE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred38_tftacrulesfull1036); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:11: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:162:12: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred38_tftacrulesfull1042); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_tftacrulesfull

    // $ANTLR start synpred39_tftacrulesfull
    public final void synpred39_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:4: ( ^( PAND TRUE x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:164:4: ^( PAND TRUE x= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred39_tftacrulesfull1057); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred39_tftacrulesfull1059); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred39_tftacrulesfull1063);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_tftacrulesfull

    // $ANTLR start synpred40_tftacrulesfull
    public final void synpred40_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:4: ( ^( PAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred40_tftacrulesfull1078); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred40_tftacrulesfull1081); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred40_tftacrulesfull1085);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred40_tftacrulesfull1089);
            y=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }
        pushFollow(FOLLOW_tt_in_synpred40_tftacrulesfull1094);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_tftacrulesfull

    // $ANTLR start synpred41_tftacrulesfull
    public final void synpred41_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:4: ( ^( PAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred41_tftacrulesfull1131); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1135);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,XOR,FOLLOW_XOR_in_synpred41_tftacrulesfull1138); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1142);
                x=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1146);
                y=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred41_tftacrulesfull

    // $ANTLR start synpred42_tftacrulesfull
    public final void synpred42_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:4: ( ^( PAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred42_tftacrulesfull1185); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred42_tftacrulesfull1188); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1192);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1196);
            y=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }
        pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1201);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_tftacrulesfull

    // $ANTLR start synpred43_tftacrulesfull
    public final void synpred43_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:4: ( ^( PAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred43_tftacrulesfull1238); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred43_tftacrulesfull1242);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,OR,FOLLOW_OR_in_synpred43_tftacrulesfull1245); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred43_tftacrulesfull1249);
                x=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred43_tftacrulesfull1253);
                y=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred43_tftacrulesfull

    // $ANTLR start synpred44_tftacrulesfull
    public final void synpred44_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:4: ( ^( PAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred44_tftacrulesfull1363); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1367);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAND,FOLLOW_PAND_in_synpred44_tftacrulesfull1370); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1374);
                x=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1378);
                y=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred44_tftacrulesfull

    // $ANTLR start synpred45_tftacrulesfull
    public final void synpred45_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notTerm_return b = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ( ^( PAND x= tt ^( AND b= notTerm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ^( PAND x= tt ^( AND b= notTerm z= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred45_tftacrulesfull1408); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred45_tftacrulesfull1412);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,AND,FOLLOW_AND_in_synpred45_tftacrulesfull1415); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_notTerm_in_synpred45_tftacrulesfull1419);
            b=notTerm();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred45_tftacrulesfull1423);
            z=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred45_tftacrulesfull

    // $ANTLR start synpred46_tftacrulesfull
    public final void synpred46_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return q1 = null;

        tftacrulesfull.negTerm_return q2 = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ( ^( PAND ^( AND ^( AND q1= negTerm q2= negTerm ) y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ^( PAND ^( AND ^( AND q1= negTerm q2= negTerm ) y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred46_tftacrulesfull1453); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred46_tftacrulesfull1456); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred46_tftacrulesfull1459); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred46_tftacrulesfull1463);
        q1=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred46_tftacrulesfull1467);
        q2=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred46_tftacrulesfull1472);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred46_tftacrulesfull1477);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_tftacrulesfull

    // $ANTLR start synpred47_tftacrulesfull
    public final void synpred47_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:4: ( ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:4: ^( PAND ^( AND n1= notTerm m1= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred47_tftacrulesfull1618); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred47_tftacrulesfull1621); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred47_tftacrulesfull1625);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred47_tftacrulesfull1629);
        m1=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred47_tftacrulesfull1634);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_tftacrulesfull

    // $ANTLR start synpred48_tftacrulesfull
    public final void synpred48_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:11: ( ^( SAND ( . ) FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:11: ^( SAND ( . ) FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred48_tftacrulesfull1762); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:18: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:19: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,FALSE,FOLLOW_FALSE_in_synpred48_tftacrulesfull1768); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacrulesfull

    // $ANTLR start synpred49_tftacrulesfull
    public final void synpred49_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:4: ( ^( SAND FALSE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:4: ^( SAND FALSE ( . ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred49_tftacrulesfull1783); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred49_tftacrulesfull1785); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:17: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:18: .
        {
        matchAny(input); if (state.failed) return ;

        }


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_tftacrulesfull

    // $ANTLR start synpred50_tftacrulesfull
    public final void synpred50_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:198:4: ( ^( SAND TRUE TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:198:4: ^( SAND TRUE TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred50_tftacrulesfull1803); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrulesfull1805); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrulesfull1807); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_tftacrulesfull

    // $ANTLR start synpred51_tftacrulesfull
    public final void synpred51_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:4: ( ^( SAND ( . ) TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:4: ^( SAND ( . ) TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred51_tftacrulesfull1821); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:11: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:12: .
        {
        matchAny(input); if (state.failed) return ;

        }

        match(input,TRUE,FOLLOW_TRUE_in_synpred51_tftacrulesfull1827); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_tftacrulesfull

    // $ANTLR start synpred52_tftacrulesfull
    public final void synpred52_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:4: ( ^( SAND TRUE ( . ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:4: ^( SAND TRUE ( . ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred52_tftacrulesfull1842); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred52_tftacrulesfull1844); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:16: ( . )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:17: .
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:4: ( ^( SAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred53_tftacrulesfull1862); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred53_tftacrulesfull1865); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1869);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1873);
            y=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1878);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:4: ( ^( SAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred54_tftacrulesfull1915); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1919);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,XOR,FOLLOW_XOR_in_synpred54_tftacrulesfull1922); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1926);
                x=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1930);
                y=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred54_tftacrulesfull

    // $ANTLR start synpred55_tftacrulesfull
    public final void synpred55_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:4: ( ^( SAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred55_tftacrulesfull1968); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1972);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,OR,FOLLOW_OR_in_synpred55_tftacrulesfull1975); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1979);
                x=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1983);
                y=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred55_tftacrulesfull

    // $ANTLR start synpred56_tftacrulesfull
    public final void synpred56_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:4: ( ^( SAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred56_tftacrulesfull2086); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred56_tftacrulesfull2089); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2093);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2097);
            y=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2102);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:216:4: ( ^( SAND ^( PAND x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:216:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred57_tftacrulesfull2204); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrulesfull2207); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2211);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2215);
            y=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }
        pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2220);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:4: ( ^( SAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred58_tftacrulesfull2249); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2253);
            z=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAND,FOLLOW_PAND_in_synpred58_tftacrulesfull2256); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2260);
                x=tt();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2264);
                y=tt();

                state._fsp--;
                if (state.failed) return ;

                match(input, Token.UP, null); if (state.failed) return ;
            }

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred58_tftacrulesfull

    // $ANTLR start synpred59_tftacrulesfull
    public final void synpred59_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notTerm_return a = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:220:4: ( ^( SAND x= tt ^( AND a= notTerm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:220:4: ^( SAND x= tt ^( AND a= notTerm z= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred59_tftacrulesfull2294); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred59_tftacrulesfull2298);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            match(input,AND,FOLLOW_AND_in_synpred59_tftacrulesfull2301); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_notTerm_in_synpred59_tftacrulesfull2305);
            a=notTerm();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred59_tftacrulesfull2309);
            z=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred59_tftacrulesfull

    // $ANTLR start synpred60_tftacrulesfull
    public final void synpred60_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return a = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:222:4: ( ^( SAND ^( AND a= notTerm z= tt ) x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:222:4: ^( SAND ^( AND a= notTerm z= tt ) x= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred60_tftacrulesfull2339); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred60_tftacrulesfull2342); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred60_tftacrulesfull2346);
        a=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred60_tftacrulesfull2350);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred60_tftacrulesfull2355);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_tftacrulesfull

    // $ANTLR start synpred61_tftacrulesfull
    public final void synpred61_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:229:4: ( ^( NOT ^( NOT a= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:229:4: ^( NOT ^( NOT a= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred61_tftacrulesfull2403); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,NOT,FOLLOW_NOT_in_synpred61_tftacrulesfull2406); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2410);
            a=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_tftacrulesfull

    // $ANTLR start synpred62_tftacrulesfull
    public final void synpred62_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return m1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:236:4: ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:236:4: ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred62_tftacrulesfull2439); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,NOT,FOLLOW_NOT_in_synpred62_tftacrulesfull2442); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred62_tftacrulesfull2445); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred62_tftacrulesfull2449);
            x=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred62_tftacrulesfull2453);
            y=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred62_tftacrulesfull2460);
        m1=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_tftacrulesfull

    // $ANTLR start synpred63_tftacrulesfull
    public final void synpred63_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:4: ( ^( AND ^( AND n1= notTerm m1= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:244:4: ^( AND ^( AND n1= notTerm m1= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred63_tftacrulesfull2683); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred63_tftacrulesfull2686); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred63_tftacrulesfull2690);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrulesfull2694);
        m1=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrulesfull2699);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacrulesfull

    // $ANTLR start synpred64_tftacrulesfull
    public final void synpred64_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.notTerm_return n2 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:246:4: ( ^( AND ^( OR n1= notTerm n2= notTerm ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:246:4: ^( AND ^( OR n1= notTerm n2= notTerm ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred64_tftacrulesfull2781); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred64_tftacrulesfull2784); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred64_tftacrulesfull2789);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred64_tftacrulesfull2793);
        n2=notTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2798);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_tftacrulesfull

    // $ANTLR start synpred65_tftacrulesfull
    public final void synpred65_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.notTerm_return n2 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:248:4: ( ^( AND ^( XOR n1= notTerm n2= notTerm ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:248:4: ^( AND ^( XOR n1= notTerm n2= notTerm ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred65_tftacrulesfull2835); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred65_tftacrulesfull2838); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred65_tftacrulesfull2843);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred65_tftacrulesfull2847);
        n2=notTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2852);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_tftacrulesfull

    // $ANTLR start synpred66_tftacrulesfull
    public final void synpred66_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:250:4: ( ^( AND n1= notTerm ^( XOR y= tt z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:250:4: ^( AND n1= notTerm ^( XOR y= tt z= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred66_tftacrulesfull2890); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred66_tftacrulesfull2894);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred66_tftacrulesfull2897); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2901);
            y=tt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2905);
            z=tt();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacrulesfull

    // $ANTLR start synpred67_tftacrulesfull
    public final void synpred67_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notTerm_return n1 = null;

        tftacrulesfull.notTerm_return n2 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:252:4: ( ^( AND n1= notTerm ^( AND n2= notTerm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:252:4: ^( AND n1= notTerm ^( AND n2= notTerm z= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred67_tftacrulesfull2943); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred67_tftacrulesfull2947);
        n1=notTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred67_tftacrulesfull2950); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notTerm_in_synpred67_tftacrulesfull2954);
        n2=notTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrulesfull2958);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_tftacrulesfull

    // $ANTLR start synpred68_tftacrulesfull
    public final void synpred68_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:259:4: ( ^( NOT ^( AND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:259:4: ^( NOT ^( AND x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred68_tftacrulesfull3010); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred68_tftacrulesfull3013); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred68_tftacrulesfull3017);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred68_tftacrulesfull3021);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_tftacrulesfull

    // $ANTLR start synpred69_tftacrulesfull
    public final void synpred69_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:261:4: ( ^( NOT ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:261:4: ^( NOT ^( OR x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred69_tftacrulesfull3054); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred69_tftacrulesfull3057); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred69_tftacrulesfull3062);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred69_tftacrulesfull3066);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_tftacrulesfull

    // $ANTLR start synpred70_tftacrulesfull
    public final void synpred70_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:263:4: ( ^( NOT ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:263:4: ^( NOT ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred70_tftacrulesfull3098); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred70_tftacrulesfull3101); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred70_tftacrulesfull3106);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred70_tftacrulesfull3110);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacrulesfull

    // $ANTLR start synpred71_tftacrulesfull
    public final void synpred71_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:265:4: ( ^( NOT ^( SAND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:265:4: ^( NOT ^( SAND x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred71_tftacrulesfull3142); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred71_tftacrulesfull3145); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred71_tftacrulesfull3149);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred71_tftacrulesfull3153);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_tftacrulesfull

    // $ANTLR start synpred72_tftacrulesfull
    public final void synpred72_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:271:4: ( ^( NOT ^( NOT x= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:271:4: ^( NOT ^( NOT x= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred72_tftacrulesfull3303); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,NOT,FOLLOW_NOT_in_synpred72_tftacrulesfull3306); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred72_tftacrulesfull3310);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_tftacrulesfull

    // $ANTLR start synpred73_tftacrulesfull
    public final void synpred73_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:273:4: ( ^( NOT negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:273:4: ^( NOT negTerm )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred73_tftacrulesfull3326); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred73_tftacrulesfull3328);
        negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_tftacrulesfull

    // $ANTLR start synpred84_tftacrulesfull
    public final void synpred84_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:299:4: ( ^( NOT ^( AND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:299:4: ^( NOT ^( AND x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred84_tftacrulesfull3401); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred84_tftacrulesfull3404); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred84_tftacrulesfull3408);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred84_tftacrulesfull3412);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_tftacrulesfull

    // $ANTLR start synpred85_tftacrulesfull
    public final void synpred85_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:301:4: ( ^( NOT ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:301:4: ^( NOT ^( OR x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred85_tftacrulesfull3445); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred85_tftacrulesfull3448); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred85_tftacrulesfull3453);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred85_tftacrulesfull3457);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:303:4: ( ^( NOT ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:303:4: ^( NOT ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred86_tftacrulesfull3489); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred86_tftacrulesfull3492); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred86_tftacrulesfull3497);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred86_tftacrulesfull3501);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_tftacrulesfull

    // $ANTLR start synpred87_tftacrulesfull
    public final void synpred87_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:311:4: ( ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:311:4: ^( AND ^( XOR x= negTerm y= negTerm ) z= negTerm )
        {
        match(input,AND,FOLLOW_AND_in_synpred87_tftacrulesfull3553); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred87_tftacrulesfull3556); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred87_tftacrulesfull3560);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred87_tftacrulesfull3564);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred87_tftacrulesfull3569);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_tftacrulesfull

    // $ANTLR start synpred88_tftacrulesfull
    public final void synpred88_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:313:4: ( ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:313:4: ^( AND z= negTerm ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred88_tftacrulesfull3606); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred88_tftacrulesfull3610);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred88_tftacrulesfull3613); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred88_tftacrulesfull3617);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred88_tftacrulesfull3621);
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
        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;

        tftacrulesfull.negTerm_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:315:4: ( ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:315:4: ^( AND ^( OR x= negTerm y= negTerm ) z= negTerm )
        {
        match(input,AND,FOLLOW_AND_in_synpred89_tftacrulesfull3659); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred89_tftacrulesfull3662); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred89_tftacrulesfull3666);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred89_tftacrulesfull3670);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred89_tftacrulesfull3675);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_tftacrulesfull

    // $ANTLR start synpred90_tftacrulesfull
    public final void synpred90_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:317:4: ( ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:317:4: ^( AND z= negTerm ^( OR x= negTerm y= negTerm ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred90_tftacrulesfull3712); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred90_tftacrulesfull3716);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred90_tftacrulesfull3719); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred90_tftacrulesfull3723);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred90_tftacrulesfull3727);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:319:4: ( ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:319:4: ^( AND z= negTerm ^( AND x= negTerm y= negTerm ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred91_tftacrulesfull3765); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred91_tftacrulesfull3769);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred91_tftacrulesfull3772); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred91_tftacrulesfull3776);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred91_tftacrulesfull3780);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:325:4: ( ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:325:4: ^( OR z= negTerm ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred92_tftacrulesfull3829); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred92_tftacrulesfull3833);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred92_tftacrulesfull3836); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred92_tftacrulesfull3840);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred92_tftacrulesfull3844);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_tftacrulesfull

    // $ANTLR start synpred93_tftacrulesfull
    public final void synpred93_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:327:4: ( ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:327:4: ^( OR z= negTerm ^( OR x= negTerm y= negTerm ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred93_tftacrulesfull3875); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred93_tftacrulesfull3879);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred93_tftacrulesfull3882); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred93_tftacrulesfull3886);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred93_tftacrulesfull3890);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_tftacrulesfull

    // $ANTLR start synpred94_tftacrulesfull
    public final void synpred94_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:333:4: ( ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:333:4: ^( XOR z= negTerm ^( XOR x= negTerm y= negTerm ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred94_tftacrulesfull3939); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred94_tftacrulesfull3943);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred94_tftacrulesfull3946); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred94_tftacrulesfull3950);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred94_tftacrulesfull3954);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_tftacrulesfull

    // $ANTLR start synpred95_tftacrulesfull
    public final void synpred95_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negTerm_return z = null;

        tftacrulesfull.negTerm_return x = null;

        tftacrulesfull.negTerm_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:335:4: ( ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:335:4: ^( XOR z= negTerm ^( OR x= negTerm y= negTerm ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred95_tftacrulesfull3985); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred95_tftacrulesfull3989);
        z=negTerm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred95_tftacrulesfull3992); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred95_tftacrulesfull3996);
        x=negTerm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negTerm_in_synpred95_tftacrulesfull4000);
        y=negTerm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_tftacrulesfull

    // $ANTLR start synpred96_tftacrulesfull
    public final void synpred96_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:350:2: ()
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:350:2: 
        {
        }
    }
    // $ANTLR end synpred96_tftacrulesfull

    // $ANTLR start synpred97_tftacrulesfull
    public final void synpred97_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.pureNegTerm_return a = null;

        tftacrulesfull.pureNegTerm_return b = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:350:4: ( ^( NOT ^( AND a= pureNegTerm b= pureNegTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:350:4: ^( NOT ^( AND a= pureNegTerm b= pureNegTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred97_tftacrulesfull4089); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred97_tftacrulesfull4092); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred97_tftacrulesfull4096);
            a=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred97_tftacrulesfull4100);
            b=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_tftacrulesfull

    // $ANTLR start synpred98_tftacrulesfull
    public final void synpred98_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.pureNegTerm_return a = null;

        tftacrulesfull.pureNegTerm_return b = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:352:4: ( ^( NOT ^( OR a= pureNegTerm b= pureNegTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:352:4: ^( NOT ^( OR a= pureNegTerm b= pureNegTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred98_tftacrulesfull4131); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred98_tftacrulesfull4134); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred98_tftacrulesfull4138);
            a=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred98_tftacrulesfull4142);
            b=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_tftacrulesfull

    // $ANTLR start synpred99_tftacrulesfull
    public final void synpred99_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.pureNegTerm_return a = null;

        tftacrulesfull.pureNegTerm_return b = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:354:4: ( ^( NOT ^( XOR a= pureNegTerm b= pureNegTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:354:4: ^( NOT ^( XOR a= pureNegTerm b= pureNegTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred99_tftacrulesfull4173); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred99_tftacrulesfull4176); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred99_tftacrulesfull4180);
            a=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred99_tftacrulesfull4184);
            b=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_tftacrulesfull

    // $ANTLR start synpred100_tftacrulesfull
    public final void synpred100_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.pureNegTerm_return a = null;

        tftacrulesfull.pureNegTerm_return b = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:356:4: ( ^( NOT ^( PAND a= pureNegTerm b= pureNegTerm ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:356:4: ^( NOT ^( PAND a= pureNegTerm b= pureNegTerm ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred100_tftacrulesfull4215); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred100_tftacrulesfull4218); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred100_tftacrulesfull4222);
            a=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_pureNegTerm_in_synpred100_tftacrulesfull4226);
            b=pureNegTerm();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
        }

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_tftacrulesfull

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
    public final boolean synpred14_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred13_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred15_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred12_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred98_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred99_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred69_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred94_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred72_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred70_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred97_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred96_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred11_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred100_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred93_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred71_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_tftacrulesfull_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\1\7\11\uffff";
    static final String DFA1_minS =
        "\1\4\6\0\3\uffff";
    static final String DFA1_maxS =
        "\1\16\6\0\3\uffff";
    static final String DFA1_acceptS =
        "\7\uffff\1\2\1\uffff\1\1";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\1\6\1\4\1\3\1\2\1\1\2\uffff\1\7\2\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "46:1: expression : ( tdnf | tt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\17\uffff";
    static final String DFA6_eofS =
        "\1\7\16\uffff";
    static final String DFA6_minS =
        "\1\3\6\0\1\uffff\1\0\6\uffff";
    static final String DFA6_maxS =
        "\1\16\6\0\1\uffff\1\0\6\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\7\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA6_specialS =
        "\1\uffff\1\5\1\4\1\6\1\3\1\2\1\1\1\uffff\1\0\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\7\1\3\1\4\1\2\1\5\1\6\1\10\2\uffff\1\7\1\10\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "93:1: tt : ( atom | andTerm | orTerm | xorTerm | pandTerm | sandTerm | notNOTTerm );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_tftacrulesfull()) ) {s = 14;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_tftacrulesfull()) ) {s = 13;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_tftacrulesfull()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_tftacrulesfull()) ) {s = 10;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_tftacrulesfull()) ) {s = 11;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\15\uffff";
    static final String DFA7_eofS =
        "\15\uffff";
    static final String DFA7_minS =
        "\1\6\1\0\13\uffff";
    static final String DFA7_maxS =
        "\1\6\1\0\13\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA7_specialS =
        "\1\uffff\1\0\13\uffff}>";
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
            return "107:1: andTerm : ( ^( AND ( . ) FALSE ) -> FALSE | ^( AND FALSE ( . ) ) -> FALSE | ^( AND TRUE q= ( . ) ) -> $q | ^( AND q= ( . ) TRUE ) -> $q | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) | andTermWithNegated );";
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

                        else if ( (true) ) {s = 12;}

                         
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
        "\17\uffff";
    static final String DFA10_eofS =
        "\17\uffff";
    static final String DFA10_minS =
        "\1\7\1\0\15\uffff";
    static final String DFA10_maxS =
        "\1\7\1\0\15\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA10_specialS =
        "\1\uffff\1\0\15\uffff}>";
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
            return "158:1: pandTerm : ( ^( PAND ( . ) FALSE ) -> FALSE | ^( PAND FALSE ( . ) ) -> FALSE | ^( PAND ( . ) TRUE ) -> FALSE | ^( PAND TRUE x= tt ) -> $x | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notTerm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND ^( AND q1= negTerm q2= negTerm ) y= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $y ^( OR ^( NOT $q1) ^( NOT $q2) ) ) $z) ^( AND ^( AND $q1 $q2) ^( PAND $y $z) ) ) ^( PAND $y ^( SAND ^( OR ^( NOT $q1) ^( NOT $q2) ) $z) ) ) | ^( PAND ^( AND n1= notTerm m1= tt ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );";
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
                        if ( (synpred36_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred37_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred38_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred39_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred40_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred41_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred42_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred43_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred44_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred45_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred46_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred47_tftacrulesfull()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
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
            return "194:1: sandTerm : ( ^( SAND ( . ) FALSE ) -> FALSE | ^( SAND FALSE ( . ) ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ( . ) TRUE ) -> FALSE | ^( SAND TRUE ( . ) ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notTerm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notTerm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );";
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
    static final String DFA14_eotS =
        "\15\uffff";
    static final String DFA14_eofS =
        "\15\uffff";
    static final String DFA14_minS =
        "\1\4\1\0\13\uffff";
    static final String DFA14_maxS =
        "\1\14\1\0\13\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\7\1\10\1\11\1\12\1\13\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA14_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA14_transitionS = {
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
            return "258:1: notTerm : ( ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= negTerm y= negTerm ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( NOT ^( NOT x= negTerm ) ) -> $x | ^( NOT negTerm ) | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm );";
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
                        if ( (synpred68_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred69_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred70_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred71_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred72_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred73_tftacrulesfull()) ) {s = 12;}

                         
                        input.seek(index14_1);
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
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\4\6\uffff\1\0\4\uffff";
    static final String DFA15_maxS =
        "\1\16\6\uffff\1\0\4\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\1\11\1\12";
    static final String DFA15_specialS =
        "\7\uffff\1\0\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\1\4\1\2\1\5\1\6\1\1\2\uffff\1\7\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "282:1: negTerm : ( atom | negAndTerm | negOrTerm | negXorTerm | negPandTerm | negSandTerm | ^( NOT ^( AND x= negTerm y= negTerm ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= negTerm y= negTerm ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT negTerm ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred85_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred86_tftacrulesfull()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
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
    public static final BitSet FOLLOW_FALSE_in_andTerm342 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_andTerm360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_andTerm362 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
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
    public static final BitSet FOLLOW_OR_in_orTerm704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orTerm710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orTerm727 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_OR_in_orTerm745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orTerm747 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orTerm751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm770 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orTerm772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_orTerm794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm798 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orTerm802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orTerm832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orTerm834 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orTerm836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorTerm856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorTerm873 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_XOR_in_xorTerm891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_xorTerm893 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorTerm897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm916 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_xorTerm918 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_xorTerm940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm944 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorTerm948 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorTerm978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorTerm980 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorTerm982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandTerm1001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandTerm1018 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandTerm1042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandTerm1059 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pandTerm1081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1085 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_pandTerm1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1142 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pandTerm1188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1192 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_pandTerm1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1249 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1367 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1374 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_pandTerm1415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_pandTerm1419 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandTerm1456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandTerm1459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_pandTerm1463 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_pandTerm1467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandTerm1621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_pandTerm1625 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandTerm1634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandTerm1745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandTerm1747 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandTerm1749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandTerm1768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandTerm1785 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1805 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandTerm1844 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_sandTerm1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1869 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm1873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm1878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_sandTerm1922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1926 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm1930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm1968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_sandTerm1975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm1979 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm1983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_sandTerm2089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2093 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm2102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_sandTerm2207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2211 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm2220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_sandTerm2256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2260 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_sandTerm2301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_sandTerm2305 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_sandTerm2342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_sandTerm2346 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandTerm2355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandTerm2385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandTerm2387 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandTerm2389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notNOTTerm2403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_notNOTTerm2406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notNOTTerm2410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pureNegTerm_in_notNOTTerm2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_andTermWithNegated2442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_andTermWithNegated2445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2449 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2690 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_andTermWithNegated2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2789 = new BitSet(new long[]{0x00000000000011F0L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_andTermWithNegated2838 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2843 = new BitSet(new long[]{0x00000000000011F0L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_andTermWithNegated2897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2901 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2947 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2954 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegated2989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_andTermWithNegated2991 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegated2993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm3010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_notTerm3013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3017 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm3054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_notTerm3057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3062 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm3098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_notTerm3101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3106 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm3142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_notTerm3145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3149 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm3303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_notTerm3306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notTerm3326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_notTerm3328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negAndTerm_in_notTerm3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negOrTerm_in_notTerm3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negXorTerm_in_notTerm3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negPandTerm_in_notTerm3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negSandTerm_in_notTerm3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_negTerm3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negAndTerm_in_negTerm3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negOrTerm_in_negTerm3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negXorTerm_in_negTerm3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negPandTerm_in_negTerm3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negSandTerm_in_negTerm3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negTerm3401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_negTerm3404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3408 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_negTerm3445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negTerm3448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3453 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_negTerm3489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negTerm3492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3497 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_negTerm3533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negTerm3535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negAndTerm3556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3560 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negAndTerm3613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3617 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negAndTerm3662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3666 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negAndTerm3719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3723 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3776 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negAndTerm3811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3813 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negAndTerm3815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negOrTerm3836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3840 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3886 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negOrTerm3921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3923 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negOrTerm3925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3950 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm3985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negXorTerm3992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm3996 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm4000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negXorTerm4031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm4033 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negXorTerm4035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_negPandTerm4049 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negPandTerm4051 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negPandTerm4053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_negSandTerm4066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_negSandTerm4068 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_negSandTerm4070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_pureNegTerm4089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pureNegTerm4092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4096 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_pureNegTerm4131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pureNegTerm4134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4138 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_pureNegTerm4173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pureNegTerm4176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4180 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_pureNegTerm4215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_pureNegTerm4218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4222 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_pureNegTerm4234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_pureNegTerm4237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4241 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_pureNegTerm4245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tdnf_in_synpred1_tftacrulesfull67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred10_tftacrulesfull256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andTerm_in_synpred11_tftacrulesfull261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orTerm_in_synpred12_tftacrulesfull266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xorTerm_in_synpred13_tftacrulesfull271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandTerm_in_synpred14_tftacrulesfull276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandTerm_in_synpred15_tftacrulesfull281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred16_tftacrulesfull319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred16_tftacrulesfull325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred17_tftacrulesfull340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred17_tftacrulesfull342 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_synpred18_tftacrulesfull360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred18_tftacrulesfull362 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
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
    public static final BitSet FOLLOW_OR_in_synpred26_tftacrulesfull704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred26_tftacrulesfull710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred27_tftacrulesfull725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred27_tftacrulesfull727 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacrulesfull745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred28_tftacrulesfull747 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred28_tftacrulesfull751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred29_tftacrulesfull766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred29_tftacrulesfull770 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred29_tftacrulesfull772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred30_tftacrulesfull787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred30_tftacrulesfull791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred30_tftacrulesfull794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred30_tftacrulesfull798 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred30_tftacrulesfull802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred31_tftacrulesfull850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred31_tftacrulesfull856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred32_tftacrulesfull871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred32_tftacrulesfull873 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_XOR_in_synpred33_tftacrulesfull891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred33_tftacrulesfull893 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred33_tftacrulesfull897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred34_tftacrulesfull912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrulesfull916 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred34_tftacrulesfull918 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred35_tftacrulesfull933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrulesfull937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred35_tftacrulesfull940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrulesfull944 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrulesfull948 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred36_tftacrulesfull995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred36_tftacrulesfull1001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred37_tftacrulesfull1016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred37_tftacrulesfull1018 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_PAND_in_synpred38_tftacrulesfull1036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred38_tftacrulesfull1042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred39_tftacrulesfull1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred39_tftacrulesfull1059 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred39_tftacrulesfull1063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred40_tftacrulesfull1078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred40_tftacrulesfull1081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred40_tftacrulesfull1085 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred40_tftacrulesfull1089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred40_tftacrulesfull1094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred41_tftacrulesfull1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred41_tftacrulesfull1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1142 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred42_tftacrulesfull1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred42_tftacrulesfull1188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1192 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred43_tftacrulesfull1238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred43_tftacrulesfull1242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred43_tftacrulesfull1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred43_tftacrulesfull1249 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred43_tftacrulesfull1253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred44_tftacrulesfull1363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1367 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred44_tftacrulesfull1370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1374 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred45_tftacrulesfull1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred45_tftacrulesfull1412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred45_tftacrulesfull1415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred45_tftacrulesfull1419 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred45_tftacrulesfull1423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred46_tftacrulesfull1453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred46_tftacrulesfull1456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred46_tftacrulesfull1459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred46_tftacrulesfull1463 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred46_tftacrulesfull1467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred46_tftacrulesfull1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred46_tftacrulesfull1477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred47_tftacrulesfull1618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred47_tftacrulesfull1621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred47_tftacrulesfull1625 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred47_tftacrulesfull1629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred47_tftacrulesfull1634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred48_tftacrulesfull1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred48_tftacrulesfull1768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred49_tftacrulesfull1783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred49_tftacrulesfull1785 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred50_tftacrulesfull1803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrulesfull1805 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrulesfull1807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred51_tftacrulesfull1821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred51_tftacrulesfull1827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred52_tftacrulesfull1842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred52_tftacrulesfull1844 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred53_tftacrulesfull1862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred53_tftacrulesfull1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1869 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred54_tftacrulesfull1915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred54_tftacrulesfull1922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1926 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred55_tftacrulesfull1968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred55_tftacrulesfull1975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1979 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred56_tftacrulesfull2086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred56_tftacrulesfull2089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2093 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred57_tftacrulesfull2204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrulesfull2207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2211 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred58_tftacrulesfull2249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred58_tftacrulesfull2256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2260 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred59_tftacrulesfull2294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred59_tftacrulesfull2298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred59_tftacrulesfull2301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred59_tftacrulesfull2305 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred59_tftacrulesfull2309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred60_tftacrulesfull2339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred60_tftacrulesfull2342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred60_tftacrulesfull2346 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred60_tftacrulesfull2350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred60_tftacrulesfull2355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred61_tftacrulesfull2403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_synpred61_tftacrulesfull2406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred62_tftacrulesfull2439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_synpred62_tftacrulesfull2442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred62_tftacrulesfull2445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred62_tftacrulesfull2449 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred62_tftacrulesfull2453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred62_tftacrulesfull2460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred63_tftacrulesfull2683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred63_tftacrulesfull2686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred63_tftacrulesfull2690 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrulesfull2694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrulesfull2699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred64_tftacrulesfull2781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred64_tftacrulesfull2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred64_tftacrulesfull2789 = new BitSet(new long[]{0x00000000000011F0L});
    public static final BitSet FOLLOW_notTerm_in_synpred64_tftacrulesfull2793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred65_tftacrulesfull2835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred65_tftacrulesfull2838 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred65_tftacrulesfull2843 = new BitSet(new long[]{0x00000000000011F0L});
    public static final BitSet FOLLOW_notTerm_in_synpred65_tftacrulesfull2847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred66_tftacrulesfull2890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred66_tftacrulesfull2894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred66_tftacrulesfull2897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2901 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred67_tftacrulesfull2943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred67_tftacrulesfull2947 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred67_tftacrulesfull2950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notTerm_in_synpred67_tftacrulesfull2954 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrulesfull2958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred68_tftacrulesfull3010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred68_tftacrulesfull3013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred68_tftacrulesfull3017 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred68_tftacrulesfull3021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred69_tftacrulesfull3054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred69_tftacrulesfull3057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred69_tftacrulesfull3062 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred69_tftacrulesfull3066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred70_tftacrulesfull3098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred70_tftacrulesfull3101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred70_tftacrulesfull3106 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred70_tftacrulesfull3110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred71_tftacrulesfull3142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred71_tftacrulesfull3145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred71_tftacrulesfull3149 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred71_tftacrulesfull3153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred72_tftacrulesfull3303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_synpred72_tftacrulesfull3306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred72_tftacrulesfull3310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred73_tftacrulesfull3326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred73_tftacrulesfull3328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred84_tftacrulesfull3401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred84_tftacrulesfull3404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred84_tftacrulesfull3408 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred84_tftacrulesfull3412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred85_tftacrulesfull3445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred85_tftacrulesfull3448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred85_tftacrulesfull3453 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred85_tftacrulesfull3457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred86_tftacrulesfull3489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred86_tftacrulesfull3492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred86_tftacrulesfull3497 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred86_tftacrulesfull3501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred87_tftacrulesfull3553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred87_tftacrulesfull3556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred87_tftacrulesfull3560 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred87_tftacrulesfull3564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_synpred87_tftacrulesfull3569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred88_tftacrulesfull3606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred88_tftacrulesfull3610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred88_tftacrulesfull3613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred88_tftacrulesfull3617 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred88_tftacrulesfull3621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred89_tftacrulesfull3659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred89_tftacrulesfull3662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred89_tftacrulesfull3666 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred89_tftacrulesfull3670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negTerm_in_synpred89_tftacrulesfull3675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred90_tftacrulesfull3712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred90_tftacrulesfull3716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred90_tftacrulesfull3719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred90_tftacrulesfull3723 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred90_tftacrulesfull3727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred91_tftacrulesfull3765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred91_tftacrulesfull3769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred91_tftacrulesfull3772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred91_tftacrulesfull3776 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred91_tftacrulesfull3780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred92_tftacrulesfull3829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred92_tftacrulesfull3833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred92_tftacrulesfull3836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred92_tftacrulesfull3840 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred92_tftacrulesfull3844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred93_tftacrulesfull3875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred93_tftacrulesfull3879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred93_tftacrulesfull3882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred93_tftacrulesfull3886 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred93_tftacrulesfull3890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred94_tftacrulesfull3939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred94_tftacrulesfull3943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred94_tftacrulesfull3946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred94_tftacrulesfull3950 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred94_tftacrulesfull3954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred95_tftacrulesfull3985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred95_tftacrulesfull3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred95_tftacrulesfull3992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negTerm_in_synpred95_tftacrulesfull3996 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_negTerm_in_synpred95_tftacrulesfull4000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred97_tftacrulesfull4089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred97_tftacrulesfull4092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred97_tftacrulesfull4096 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred97_tftacrulesfull4100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred98_tftacrulesfull4131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred98_tftacrulesfull4134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred98_tftacrulesfull4138 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred98_tftacrulesfull4142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred99_tftacrulesfull4173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred99_tftacrulesfull4176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred99_tftacrulesfull4180 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred99_tftacrulesfull4184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred100_tftacrulesfull4215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred100_tftacrulesfull4218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred100_tftacrulesfull4222 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_pureNegTerm_in_synpred100_tftacrulesfull4226 = new BitSet(new long[]{0x0000000000000008L});

}