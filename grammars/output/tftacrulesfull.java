// $ANTLR 3.1.2 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g 2009-03-10 21:40:28

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
            this.state.ruleMemo = new HashMap[96+1];
             
             
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


    public static class tt_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tt"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:44:1: tt : ( ae | andterm | negandterm | orterm | pandterm | sandterm | xorterm | ^( NOT ^( NOT a1= tt ) ) -> $a1);
    public final tftacrulesfull.tt_return tt() throws RecognitionException {
        tftacrulesfull.tt_return retval = new tftacrulesfull.tt_return();
        retval.start = input.LT(1);
        int tt_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT8=null;
        Object NOT9=null;
        tftacrulesfull.tt_return a1 = null;

        tftacrulesfull.ae_return ae1 = null;

        tftacrulesfull.andterm_return andterm2 = null;

        tftacrulesfull.negandterm_return negandterm3 = null;

        tftacrulesfull.orterm_return orterm4 = null;

        tftacrulesfull.pandterm_return pandterm5 = null;

        tftacrulesfull.sandterm_return sandterm6 = null;

        tftacrulesfull.xorterm_return xorterm7 = null;


        Object NOT8_tree=null;
        Object NOT9_tree=null;
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:44:5: ( ae | andterm | negandterm | orterm | pandterm | sandterm | xorterm | ^( NOT ^( NOT a1= tt ) ) -> $a1)
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:44:7: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_tt64);
                    ae1=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae1.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:45:4: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_tt69);
                    andterm2=andterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andterm2.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:46:4: negandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negandterm_in_tt74);
                    negandterm3=negandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negandterm3.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:47:4: orterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_orterm_in_tt79);
                    orterm4=orterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, orterm4.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:48:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_tt84);
                    pandterm5=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm5.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:49:4: sandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_tt89);
                    sandterm6=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandterm6.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:50:4: xorterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_xorterm_in_tt94);
                    xorterm7=xorterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, xorterm7.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:51:4: ^( NOT ^( NOT a1= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT8=(Object)match(input,NOT,FOLLOW_NOT_in_tt100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT8);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT9=(Object)match(input,NOT,FOLLOW_NOT_in_tt103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT9);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_tt107);
                    a1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(a1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a1
                    // token labels: 
                    // rule labels: retval, a1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:4: -> $a1
                    {
                        adaptor.addChild(root_0, stream_a1.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 1, tt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tt"

    public static class ce_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ce"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:55:1: ce : ( ae | ^( SAND ce ce ) );
    public final tftacrulesfull.ce_return ce() throws RecognitionException {
        tftacrulesfull.ce_return retval = new tftacrulesfull.ce_return();
        retval.start = input.LT(1);
        int ce_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND11=null;
        tftacrulesfull.ae_return ae10 = null;

        tftacrulesfull.ce_return ce12 = null;

        tftacrulesfull.ce_return ce13 = null;


        Object SAND11_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:55:4: ( ae | ^( SAND ce ce ) )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:55:6: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_ce135);
                    ae10=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae10.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:56:4: ^( SAND ce ce )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND11=(Object)match(input,SAND,FOLLOW_SAND_in_ce142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND11_tree = (Object)adaptor.dupNode(SAND11);

                    root_1 = (Object)adaptor.becomeRoot(SAND11_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_ce144);
                    ce12=ce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ce12.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_ce146);
                    ce13=ce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ce13.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 2, ce_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ce"

    public static class notterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );
    public final tftacrulesfull.notterm_return notterm() throws RecognitionException {
        tftacrulesfull.notterm_return retval = new tftacrulesfull.notterm_return();
        retval.start = input.LT(1);
        int notterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT14=null;
        Object AND15=null;
        Object NOT16=null;
        Object OR17=null;
        Object NOT18=null;
        Object XOR19=null;
        Object NOT20=null;
        Object SAND21=null;
        Object OR22=null;
        Object XOR25=null;
        Object AND28=null;
        Object NOT31=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.notterm_return notterm23 = null;

        tftacrulesfull.notterm_return notterm24 = null;

        tftacrulesfull.notterm_return notterm26 = null;

        tftacrulesfull.notterm_return notterm27 = null;

        tftacrulesfull.notterm_return notterm29 = null;

        tftacrulesfull.notterm_return notterm30 = null;

        tftacrulesfull.tt_return tt32 = null;


        Object NOT14_tree=null;
        Object AND15_tree=null;
        Object NOT16_tree=null;
        Object OR17_tree=null;
        Object NOT18_tree=null;
        Object XOR19_tree=null;
        Object NOT20_tree=null;
        Object SAND21_tree=null;
        Object OR22_tree=null;
        Object XOR25_tree=null;
        Object AND28_tree=null;
        Object NOT31_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:9: ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:11: ^( NOT ^( AND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT14=(Object)match(input,NOT,FOLLOW_NOT_in_notterm159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT14);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND15=(Object)match(input,AND,FOLLOW_AND_in_notterm162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND15);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm166);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm170);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, NOT, y, x
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
                    // 60:4: -> ^( OR ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:60:7: ^( OR ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:60:12: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:60:22: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:61:4: ^( NOT ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT16=(Object)match(input,NOT,FOLLOW_NOT_in_notterm202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT16);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR17=(Object)match(input,OR,FOLLOW_OR_in_notterm205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR17);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm209);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm213);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, NOT, NOT, y
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
                    // 62:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:62:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:62:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:62:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:63:4: ^( NOT ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT18=(Object)match(input,NOT,FOLLOW_NOT_in_notterm245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT18);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR19=(Object)match(input,XOR,FOLLOW_XOR_in_notterm248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR19);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm252);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm256);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

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
                    // 64:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:64:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:64:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:64:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:4: ^( NOT ^( SAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT20=(Object)match(input,NOT,FOLLOW_NOT_in_notterm288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT20);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND21=(Object)match(input,SAND,FOLLOW_SAND_in_notterm291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND21);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm295);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm299);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, y, x, y, NOT, x, x, y, NOT, NOT, NOT, x, y, x
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
                    // 66:5: -> ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:8: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:14: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:20: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:26: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:32: ^( NOT $x)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_x.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:42: ^( NOT $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:53: ^( AND ^( NOT $x) $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:59: ^( NOT $x)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_x.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:74: ^( AND ^( NOT $y) $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:80: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:95: ^( XOR ^( PAND $y $x) ^( PAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:101: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:115: ^( PAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:67:4: ^( OR notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR22=(Object)match(input,OR,FOLLOW_OR_in_notterm400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR22_tree = (Object)adaptor.dupNode(OR22);

                    root_1 = (Object)adaptor.becomeRoot(OR22_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm402);
                    notterm23=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm23.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm404);
                    notterm24=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm24.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:4: ^( XOR notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR25=(Object)match(input,XOR,FOLLOW_XOR_in_notterm411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR25_tree = (Object)adaptor.dupNode(XOR25);

                    root_1 = (Object)adaptor.becomeRoot(XOR25_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm413);
                    notterm26=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm26.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm415);
                    notterm27=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm27.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:69:4: ^( AND notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND28=(Object)match(input,AND,FOLLOW_AND_in_notterm422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND28_tree = (Object)adaptor.dupNode(AND28);

                    root_1 = (Object)adaptor.becomeRoot(AND28_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm424);
                    notterm29=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm29.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm426);
                    notterm30=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm30.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:70:4: ^( NOT tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT31=(Object)match(input,NOT,FOLLOW_NOT_in_notterm433); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT31_tree = (Object)adaptor.dupNode(NOT31);

                    root_1 = (Object)adaptor.becomeRoot(NOT31_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm435);
                    tt32=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt32.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 3, notterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "notterm"

    public static class andterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | andTermWithNegatedPands | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) );
    public final tftacrulesfull.andterm_return andterm() throws RecognitionException {
        tftacrulesfull.andterm_return retval = new tftacrulesfull.andterm_return();
        retval.start = input.LT(1);
        int andterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND33=null;
        Object wildcard34=null;
        Object FALSE35=null;
        Object AND36=null;
        Object FALSE37=null;
        Object wildcard38=null;
        Object AND39=null;
        Object TRUE40=null;
        Object AND41=null;
        Object TRUE42=null;
        Object AND43=null;
        Object XOR44=null;
        Object AND45=null;
        Object OR46=null;
        Object AND47=null;
        Object OR48=null;
        Object AND50=null;
        Object AND51=null;
        Object AND52=null;
        Object AND53=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.andTermWithNegatedPands_return andTermWithNegatedPands49 = null;

        tftacrulesfull.tt_return tt54 = null;

        tftacrulesfull.tt_return tt55 = null;


        Object AND33_tree=null;
        Object wildcard34_tree=null;
        Object FALSE35_tree=null;
        Object AND36_tree=null;
        Object FALSE37_tree=null;
        Object wildcard38_tree=null;
        Object AND39_tree=null;
        Object TRUE40_tree=null;
        Object AND41_tree=null;
        Object TRUE42_tree=null;
        Object AND43_tree=null;
        Object XOR44_tree=null;
        Object AND45_tree=null;
        Object OR46_tree=null;
        Object AND47_tree=null;
        Object OR48_tree=null;
        Object AND50_tree=null;
        Object AND51_tree=null;
        Object AND52_tree=null;
        Object AND53_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notterm=new RewriteRuleSubtreeStream(adaptor,"rule notterm");
        RewriteRuleSubtreeStream stream_metaPandSandAE=new RewriteRuleSubtreeStream(adaptor,"rule metaPandSandAE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:9: ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | andTermWithNegatedPands | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:11: ^( AND . FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND33=(Object)match(input,AND,FOLLOW_AND_in_andterm448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND33);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    wildcard34=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard34_tree = (Object)adaptor.dupTree(wildcard34);
                    adaptor.addChild(root_1, wildcard34_tree);
                    }
                    _last = (Object)input.LT(1);
                    FALSE35=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE35);


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
                    // 74:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:4: ^( AND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND36=(Object)match(input,AND,FOLLOW_AND_in_andterm467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND36);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE37=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE37);

                    _last = (Object)input.LT(1);
                    wildcard38=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard38_tree = (Object)adaptor.dupTree(wildcard38);
                    adaptor.addChild(root_1, wildcard38_tree);
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
                    // 76:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:77:4: ^( AND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND39=(Object)match(input,AND,FOLLOW_AND_in_andterm485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND39);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE40=(Object)match(input,TRUE,FOLLOW_TRUE_in_andterm487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE40);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_andterm491);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());

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
                    // 78:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:79:4: ^( AND a= ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND41=(Object)match(input,AND,FOLLOW_AND_in_andterm506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND41);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_andterm510);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    TRUE42=(Object)match(input,TRUE,FOLLOW_TRUE_in_andterm512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE42);


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
                    // 80:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:81:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND43=(Object)match(input,AND,FOLLOW_AND_in_andterm527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND43);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR44=(Object)match(input,XOR,FOLLOW_XOR_in_andterm530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR44);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm534);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm538);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm543);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, AND, z, y, XOR, AND
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
                    // 82:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:82:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:82:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:82:26: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: ^( AND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND45=(Object)match(input,AND,FOLLOW_AND_in_andterm582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND45);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR46=(Object)match(input,OR,FOLLOW_OR_in_andterm585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR46);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm589);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm593);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm598);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, y, z, AND, AND, x, z
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
                    // 84:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ^( AND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND47=(Object)match(input,AND,FOLLOW_AND_in_andterm637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND47);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm641);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR48=(Object)match(input,OR,FOLLOW_OR_in_andterm644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR48);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm648);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm652);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, z, z, y, AND, x, AND
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
                    // 86:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:86:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:86:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:86:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:87:4: andTermWithNegatedPands
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andTermWithNegatedPands_in_andterm689);
                    andTermWithNegatedPands49=andTermWithNegatedPands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andTermWithNegatedPands49.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:88:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND50=(Object)match(input,AND,FOLLOW_AND_in_andterm696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND50);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND51=(Object)match(input,AND,FOLLOW_AND_in_andterm699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND51);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_andterm703);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_andterm707);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm712);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, n1, n1, m1, z, n1, AND, m1, m1, z
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
                    // 89:4: -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:7: ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:13: ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:19: ^( AND $n1 ^( AND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:29: ^( AND $m1 $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:44: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:51: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:62: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:99: ^( NOT $n1)
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
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:4: ^( AND x= tt y= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND52=(Object)match(input,AND,FOLLOW_AND_in_andterm794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND52);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm798);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm802);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, x, x, y, y
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
                    // 91:4: -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:91:7: ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:91:13: ^( XOR ^( PAND $y $x) ^( PAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:91:19: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:91:33: ^( PAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:91:48: ^( SAND $x $y)
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
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:92:4: ^( AND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND53=(Object)match(input,AND,FOLLOW_AND_in_andterm853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND53_tree = (Object)adaptor.dupNode(AND53);

                    root_1 = (Object)adaptor.becomeRoot(AND53_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm855);
                    tt54=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt54.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm857);
                    tt55=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt55.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 4, andterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andterm"

    public static class andTermWithNegatedPands_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andTermWithNegatedPands"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:95:1: andTermWithNegatedPands : ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= metaPandSandAE ) -> ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( XOR ^( AND ^( PAND $y $x) $m1) ^( AND ^( SAND $x $y) $m1) ) ) | ^( AND ^( AND a= termWithNegatedPands b= notterm ) c= tt ) -> ^( AND ^( AND $a $c) ^( AND $b $c) ) );
    public final tftacrulesfull.andTermWithNegatedPands_return andTermWithNegatedPands() throws RecognitionException {
        tftacrulesfull.andTermWithNegatedPands_return retval = new tftacrulesfull.andTermWithNegatedPands_return();
        retval.start = input.LT(1);
        int andTermWithNegatedPands_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND56=null;
        Object NOT57=null;
        Object PAND58=null;
        Object AND59=null;
        Object AND60=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.termWithNegatedPands_return a = null;

        tftacrulesfull.notterm_return b = null;

        tftacrulesfull.tt_return c = null;


        Object AND56_tree=null;
        Object NOT57_tree=null;
        Object PAND58_tree=null;
        Object AND59_tree=null;
        Object AND60_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_termWithNegatedPands=new RewriteRuleSubtreeStream(adaptor,"rule termWithNegatedPands");
        RewriteRuleSubtreeStream stream_notterm=new RewriteRuleSubtreeStream(adaptor,"rule notterm");
        RewriteRuleSubtreeStream stream_metaPandSandAE=new RewriteRuleSubtreeStream(adaptor,"rule metaPandSandAE");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:96:2: ( ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= metaPandSandAE ) -> ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( XOR ^( AND ^( PAND $y $x) $m1) ^( AND ^( SAND $x $y) $m1) ) ) | ^( AND ^( AND a= termWithNegatedPands b= notterm ) c= tt ) -> ^( AND ^( AND $a $c) ^( AND $b $c) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==AND) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==NOT) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==AND) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:96:4: ^( AND ^( NOT ^( PAND x= tt y= tt ) ) m1= metaPandSandAE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND56=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegatedPands871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND56);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT57=(Object)match(input,NOT,FOLLOW_NOT_in_andTermWithNegatedPands874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT57);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_3 = _last;
                    Object _first_3 = null;
                    Object root_3 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND58=(Object)match(input,PAND,FOLLOW_PAND_in_andTermWithNegatedPands877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND58);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegatedPands881);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegatedPands885);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_2, root_3);_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_andTermWithNegatedPands892);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, m1, y, PAND, x, m1, AND, NOT, AND, AND, AND, NOT, AND, AND, y, AND, NOT, x, x, y, m1, m1, AND, y, NOT, x, m1, x
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
                    // 97:4: -> ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( XOR ^( AND ^( PAND $y $x) $m1) ^( AND ^( SAND $x $y) $m1) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:7: ^( XOR ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) ) ^( XOR ^( AND ^( PAND $y $x) $m1) ^( AND ^( SAND $x $y) $m1) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:13: ^( XOR ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) ) ^( AND ^( NOT $y) ^( AND $x $m1) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:19: ^( XOR ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1) ^( AND ^( AND ^( NOT $x) $y) $m1) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:25: ^( AND ^( AND ^( NOT $x) ^( NOT $y) ) $m1)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_m1.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:63: ^( AND ^( AND ^( NOT $x) $y) $m1)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:69: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:75: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_m1.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:95: ^( AND ^( NOT $y) ^( AND $x $m1) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:101: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:111: ^( AND $x $m1)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());
                        adaptor.addChild(root_4, stream_m1.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:128: ^( XOR ^( AND ^( PAND $y $x) $m1) ^( AND ^( SAND $x $y) $m1) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:134: ^( AND ^( PAND $y $x) $m1)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:140: ^( PAND $y $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:159: ^( AND ^( SAND $x $y) $m1)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:165: ^( SAND $x $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_m1.nextTree());

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
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:98:4: ^( AND ^( AND a= termWithNegatedPands b= notterm ) c= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND59=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegatedPands1026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND59);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND60=(Object)match(input,AND,FOLLOW_AND_in_andTermWithNegatedPands1029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND60);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_termWithNegatedPands_in_andTermWithNegatedPands1033);
                    a=termWithNegatedPands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithNegatedPands.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_andTermWithNegatedPands1037);
                    b=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(b.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andTermWithNegatedPands1042);
                    c=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(c.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       System.out.println("Hallo"); 
                    }


                    // AST REWRITE
                    // elements: AND, AND, c, c, a, AND, b
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
                    // 100:4: -> ^( AND ^( AND $a $c) ^( AND $b $c) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:100:7: ^( AND ^( AND $a $c) ^( AND $b $c) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:100:13: ^( AND $a $c)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());
                        adaptor.addChild(root_2, stream_c.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:100:26: ^( AND $b $c)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_b.nextTree());
                        adaptor.addChild(root_2, stream_c.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, andTermWithNegatedPands_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andTermWithNegatedPands"

    public static class termWithNegatedPands_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termWithNegatedPands"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:1: termWithNegatedPands : ( ^( NOT ^( PAND tt tt ) ) | ^( AND termWithNegatedPands ^( NOT ^( PAND tt tt ) ) ) );
    public final tftacrulesfull.termWithNegatedPands_return termWithNegatedPands() throws RecognitionException {
        tftacrulesfull.termWithNegatedPands_return retval = new tftacrulesfull.termWithNegatedPands_return();
        retval.start = input.LT(1);
        int termWithNegatedPands_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT61=null;
        Object PAND62=null;
        Object AND65=null;
        Object NOT67=null;
        Object PAND68=null;
        tftacrulesfull.tt_return tt63 = null;

        tftacrulesfull.tt_return tt64 = null;

        tftacrulesfull.termWithNegatedPands_return termWithNegatedPands66 = null;

        tftacrulesfull.tt_return tt69 = null;

        tftacrulesfull.tt_return tt70 = null;


        Object NOT61_tree=null;
        Object PAND62_tree=null;
        Object AND65_tree=null;
        Object NOT67_tree=null;
        Object PAND68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:104:2: ( ^( NOT ^( PAND tt tt ) ) | ^( AND termWithNegatedPands ^( NOT ^( PAND tt tt ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NOT) ) {
                alt6=1;
            }
            else if ( (LA6_0==AND) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:104:4: ^( NOT ^( PAND tt tt ) )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT61=(Object)match(input,NOT,FOLLOW_NOT_in_termWithNegatedPands1093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT61_tree = (Object)adaptor.dupNode(NOT61);

                    root_1 = (Object)adaptor.becomeRoot(NOT61_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND62=(Object)match(input,PAND,FOLLOW_PAND_in_termWithNegatedPands1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND62_tree = (Object)adaptor.dupNode(PAND62);

                    root_2 = (Object)adaptor.becomeRoot(PAND62_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_termWithNegatedPands1098);
                    tt63=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_2, tt63.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_termWithNegatedPands1100);
                    tt64=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_2, tt64.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:105:4: ^( AND termWithNegatedPands ^( NOT ^( PAND tt tt ) ) )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND65=(Object)match(input,AND,FOLLOW_AND_in_termWithNegatedPands1109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND65_tree = (Object)adaptor.dupNode(AND65);

                    root_1 = (Object)adaptor.becomeRoot(AND65_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_termWithNegatedPands_in_termWithNegatedPands1111);
                    termWithNegatedPands66=termWithNegatedPands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, termWithNegatedPands66.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT67=(Object)match(input,NOT,FOLLOW_NOT_in_termWithNegatedPands1114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT67_tree = (Object)adaptor.dupNode(NOT67);

                    root_2 = (Object)adaptor.becomeRoot(NOT67_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_3 = _last;
                    Object _first_3 = null;
                    Object root_3 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND68=(Object)match(input,PAND,FOLLOW_PAND_in_termWithNegatedPands1117); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND68_tree = (Object)adaptor.dupNode(PAND68);

                    root_3 = (Object)adaptor.becomeRoot(PAND68_tree, root_3);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_termWithNegatedPands1119);
                    tt69=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_3, tt69.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_termWithNegatedPands1121);
                    tt70=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_3, tt70.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_2, root_3);_last = _save_last_3;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
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
            if ( state.backtracking>0 ) { memoize(input, 6, termWithNegatedPands_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termWithNegatedPands"

    public static class negandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:108:1: negandterm : ( ^( AND ^( OR x= negatedterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= negatedterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= negatedterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= negatedterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= negatedterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= negatedterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND negatedterm metaPandSandAE ) );
    public final tftacrulesfull.negandterm_return negandterm() throws RecognitionException {
        tftacrulesfull.negandterm_return retval = new tftacrulesfull.negandterm_return();
        retval.start = input.LT(1);
        int negandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND71=null;
        Object OR72=null;
        Object AND73=null;
        Object XOR74=null;
        Object AND75=null;
        Object OR76=null;
        Object AND77=null;
        Object XOR78=null;
        Object AND79=null;
        Object OR80=null;
        Object AND81=null;
        Object XOR82=null;
        Object AND83=null;
        Object OR84=null;
        Object AND85=null;
        Object XOR86=null;
        Object AND87=null;
        Object AND88=null;
        Object AND89=null;
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.pandterm_return z1 = null;

        tftacrulesfull.sandterm_return z2 = null;

        tftacrulesfull.ae_return z3 = null;

        tftacrulesfull.negatedterm_return n1 = null;

        tftacrulesfull.tt_return t1 = null;

        tftacrulesfull.tt_return t2 = null;

        tftacrulesfull.notterm_return n2 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.negatedterm_return negatedterm90 = null;

        tftacrulesfull.metaPandSandAE_return metaPandSandAE91 = null;


        Object AND71_tree=null;
        Object OR72_tree=null;
        Object AND73_tree=null;
        Object XOR74_tree=null;
        Object AND75_tree=null;
        Object OR76_tree=null;
        Object AND77_tree=null;
        Object XOR78_tree=null;
        Object AND79_tree=null;
        Object OR80_tree=null;
        Object AND81_tree=null;
        Object XOR82_tree=null;
        Object AND83_tree=null;
        Object OR84_tree=null;
        Object AND85_tree=null;
        Object XOR86_tree=null;
        Object AND87_tree=null;
        Object AND88_tree=null;
        Object AND89_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_pandterm=new RewriteRuleSubtreeStream(adaptor,"rule pandterm");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_negatedterm=new RewriteRuleSubtreeStream(adaptor,"rule negatedterm");
        RewriteRuleSubtreeStream stream_sandterm=new RewriteRuleSubtreeStream(adaptor,"rule sandterm");
        RewriteRuleSubtreeStream stream_notterm=new RewriteRuleSubtreeStream(adaptor,"rule notterm");
        RewriteRuleSubtreeStream stream_metaPandSandAE=new RewriteRuleSubtreeStream(adaptor,"rule metaPandSandAE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:2: ( ^( AND ^( OR x= negatedterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= negatedterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= negatedterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= negatedterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= negatedterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= negatedterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND negatedterm metaPandSandAE ) )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:4: ^( AND ^( OR x= negatedterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND71=(Object)match(input,AND,FOLLOW_AND_in_negandterm1137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND71);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR72=(Object)match(input,OR,FOLLOW_OR_in_negandterm1140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR72);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1144);
                    x=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1148);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1153);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, AND, AND, z1, z1, OR
                    // token labels: 
                    // rule labels: retval, z1, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"rule z1",z1!=null?z1.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:4: -> ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:110:7: ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:110:12: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:110:26: ^( AND $y $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:4: ^( AND ^( XOR x= negatedterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND73=(Object)match(input,AND,FOLLOW_AND_in_negandterm1189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND73);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR74=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR74);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1196);
                    x=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1200);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1205);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, AND, y, XOR, z1, z1, x
                    // token labels: 
                    // rule labels: retval, z1, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"rule z1",z1!=null?z1.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:4: -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:112:7: ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:112:13: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:112:27: ^( AND $y $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:4: ^( AND ^( OR x= negatedterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND75=(Object)match(input,AND,FOLLOW_AND_in_negandterm1241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND75);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR76=(Object)match(input,OR,FOLLOW_OR_in_negandterm1244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR76);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1248);
                    x=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1252);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1257);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z2, z2, AND, AND, OR, y, x
                    // token labels: 
                    // rule labels: retval, z2, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"rule z2",z2!=null?z2.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:4: -> ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:114:7: ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:114:12: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:114:26: ^( AND $y $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:4: ^( AND ^( XOR x= negatedterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND77=(Object)match(input,AND,FOLLOW_AND_in_negandterm1293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND77);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR78=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR78);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1300);
                    x=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1304);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1309);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, y, XOR, z2, x, AND, z2
                    // token labels: 
                    // rule labels: retval, z2, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"rule z2",z2!=null?z2.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:4: -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:7: ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:13: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:27: ^( AND $y $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:4: ^( AND ^( OR x= negatedterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND79=(Object)match(input,AND,FOLLOW_AND_in_negandterm1345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND79);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR80=(Object)match(input,OR,FOLLOW_OR_in_negandterm1348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR80);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1352);
                    x=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1356);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1361);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, z3, OR, AND, x, z3, y
                    // token labels: 
                    // rule labels: retval, z3, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"rule z3",z3!=null?z3.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:4: -> ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:7: ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:12: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:26: ^( AND $y $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:4: ^( AND ^( XOR x= negatedterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND81=(Object)match(input,AND,FOLLOW_AND_in_negandterm1397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND81);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR82=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR82);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1404);
                    x=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1408);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1413);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, XOR, z3, AND, y, x, z3
                    // token labels: 
                    // rule labels: retval, z3, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"rule z3",z3!=null?z3.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:4: -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:7: ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:13: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:27: ^( AND $y $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_y.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:121:4: ^( AND n1= negatedterm ^( OR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND83=(Object)match(input,AND,FOLLOW_AND_in_negandterm1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND83);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1453);
                    n1=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR84=(Object)match(input,OR,FOLLOW_OR_in_negandterm1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR84);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1460);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1464);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, t1, OR, AND, n1, n1, t2
                    // token labels: 
                    // rule labels: n1, t2, retval, t1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:4: -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:122:7: ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:122:12: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:122:28: ^( AND $n1 $t2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:4: ^( AND n1= negatedterm ^( XOR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND85=(Object)match(input,AND,FOLLOW_AND_in_negandterm1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND85);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1508);
                    n1=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR86=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR86);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1515);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1519);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, AND, t1, t2, n1, n1, XOR
                    // token labels: 
                    // rule labels: n1, t2, retval, t1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:4: -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:7: ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:13: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:29: ^( AND $n1 $t2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ^( AND n1= negatedterm ^( AND n2= notterm m1= metaPandSandAE ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND87=(Object)match(input,AND,FOLLOW_AND_in_negandterm1558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND87);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1562);
                    n1=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND88=(Object)match(input,AND,FOLLOW_AND_in_negandterm1565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND88);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1569);
                    n2=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n2.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1573);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: n2, AND, AND, m1, n1
                    // token labels: 
                    // rule labels: n1, retval, n2, m1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:4: -> ^( AND ^( AND $n1 $n2) $m1)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:126:7: ^( AND ^( AND $n1 $n2) $m1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:126:13: ^( AND $n1 $n2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_n2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_m1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:127:4: ^( AND negatedterm metaPandSandAE )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND89=(Object)match(input,AND,FOLLOW_AND_in_negandterm1603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND89_tree = (Object)adaptor.dupNode(AND89);

                    root_1 = (Object)adaptor.becomeRoot(AND89_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1605);
                    negatedterm90=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm90.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1607);
                    metaPandSandAE91=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, metaPandSandAE91.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, negandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negandterm"

    public static class negatedterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negatedterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:1: negatedterm : ( negandterm | notterm | ^( XOR negatedterm negatedterm ) | ^( XOR negatedterm tt ) | ^( XOR tt negatedterm ) | ^( XOR tt tt ) | ^( OR negatedterm negatedterm ) | ^( OR negatedterm tt ) | ^( OR tt negatedterm ) | ^( OR tt tt ) );
    public final tftacrulesfull.negatedterm_return negatedterm() throws RecognitionException {
        tftacrulesfull.negatedterm_return retval = new tftacrulesfull.negatedterm_return();
        retval.start = input.LT(1);
        int negatedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR94=null;
        Object XOR97=null;
        Object XOR100=null;
        Object XOR103=null;
        Object OR106=null;
        Object OR109=null;
        Object OR112=null;
        Object OR115=null;
        tftacrulesfull.negandterm_return negandterm92 = null;

        tftacrulesfull.notterm_return notterm93 = null;

        tftacrulesfull.negatedterm_return negatedterm95 = null;

        tftacrulesfull.negatedterm_return negatedterm96 = null;

        tftacrulesfull.negatedterm_return negatedterm98 = null;

        tftacrulesfull.tt_return tt99 = null;

        tftacrulesfull.tt_return tt101 = null;

        tftacrulesfull.negatedterm_return negatedterm102 = null;

        tftacrulesfull.tt_return tt104 = null;

        tftacrulesfull.tt_return tt105 = null;

        tftacrulesfull.negatedterm_return negatedterm107 = null;

        tftacrulesfull.negatedterm_return negatedterm108 = null;

        tftacrulesfull.negatedterm_return negatedterm110 = null;

        tftacrulesfull.tt_return tt111 = null;

        tftacrulesfull.tt_return tt113 = null;

        tftacrulesfull.negatedterm_return negatedterm114 = null;

        tftacrulesfull.tt_return tt116 = null;

        tftacrulesfull.tt_return tt117 = null;


        Object XOR94_tree=null;
        Object XOR97_tree=null;
        Object XOR100_tree=null;
        Object XOR103_tree=null;
        Object OR106_tree=null;
        Object OR109_tree=null;
        Object OR112_tree=null;
        Object OR115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:131:2: ( negandterm | notterm | ^( XOR negatedterm negatedterm ) | ^( XOR negatedterm tt ) | ^( XOR tt negatedterm ) | ^( XOR tt tt ) | ^( OR negatedterm negatedterm ) | ^( OR negatedterm tt ) | ^( OR tt negatedterm ) | ^( OR tt tt ) )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:131:4: negandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negandterm_in_negatedterm1621);
                    negandterm92=negandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negandterm92.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: notterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negatedterm1626);
                    notterm93=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, notterm93.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:133:4: ^( XOR negatedterm negatedterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR94=(Object)match(input,XOR,FOLLOW_XOR_in_negatedterm1632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR94_tree = (Object)adaptor.dupNode(XOR94);

                    root_1 = (Object)adaptor.becomeRoot(XOR94_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1634);
                    negatedterm95=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm95.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1636);
                    negatedterm96=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm96.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ^( XOR negatedterm tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR97=(Object)match(input,XOR,FOLLOW_XOR_in_negatedterm1643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR97_tree = (Object)adaptor.dupNode(XOR97);

                    root_1 = (Object)adaptor.becomeRoot(XOR97_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1645);
                    negatedterm98=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm98.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1647);
                    tt99=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt99.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:4: ^( XOR tt negatedterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR100=(Object)match(input,XOR,FOLLOW_XOR_in_negatedterm1654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR100_tree = (Object)adaptor.dupNode(XOR100);

                    root_1 = (Object)adaptor.becomeRoot(XOR100_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1656);
                    tt101=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt101.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1658);
                    negatedterm102=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm102.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR103=(Object)match(input,XOR,FOLLOW_XOR_in_negatedterm1665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR103_tree = (Object)adaptor.dupNode(XOR103);

                    root_1 = (Object)adaptor.becomeRoot(XOR103_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1667);
                    tt104=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt104.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1669);
                    tt105=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt105.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:137:4: ^( OR negatedterm negatedterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR106=(Object)match(input,OR,FOLLOW_OR_in_negatedterm1676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR106_tree = (Object)adaptor.dupNode(OR106);

                    root_1 = (Object)adaptor.becomeRoot(OR106_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1678);
                    negatedterm107=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm107.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1680);
                    negatedterm108=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm108.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ^( OR negatedterm tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR109=(Object)match(input,OR,FOLLOW_OR_in_negatedterm1687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR109_tree = (Object)adaptor.dupNode(OR109);

                    root_1 = (Object)adaptor.becomeRoot(OR109_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1689);
                    negatedterm110=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm110.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1691);
                    tt111=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt111.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:4: ^( OR tt negatedterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR112=(Object)match(input,OR,FOLLOW_OR_in_negatedterm1698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR112_tree = (Object)adaptor.dupNode(OR112);

                    root_1 = (Object)adaptor.becomeRoot(OR112_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1700);
                    tt113=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt113.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negatedterm1702);
                    negatedterm114=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negatedterm114.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:140:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR115=(Object)match(input,OR,FOLLOW_OR_in_negatedterm1709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR115_tree = (Object)adaptor.dupNode(OR115);

                    root_1 = (Object)adaptor.becomeRoot(OR115_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1711);
                    tt116=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt116.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negatedterm1713);
                    tt117=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt117.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, negatedterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negatedterm"

    public static class metaPandSandAE_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaPandSandAE"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:143:1: metaPandSandAE : ( pandterm | sandterm | andterm | ae );
    public final tftacrulesfull.metaPandSandAE_return metaPandSandAE() throws RecognitionException {
        tftacrulesfull.metaPandSandAE_return retval = new tftacrulesfull.metaPandSandAE_return();
        retval.start = input.LT(1);
        int metaPandSandAE_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrulesfull.pandterm_return pandterm118 = null;

        tftacrulesfull.sandterm_return sandterm119 = null;

        tftacrulesfull.andterm_return andterm120 = null;

        tftacrulesfull.ae_return ae121 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:2: ( pandterm | sandterm | andterm | ae )
            int alt9=4;
            switch ( input.LA(1) ) {
            case PAND:
                {
                alt9=1;
                }
                break;
            case SAND:
                {
                alt9=2;
                }
                break;
            case AND:
                {
                alt9=3;
                }
                break;
            case ID:
            case TRUE:
            case FALSE:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:144:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_metaPandSandAE1727);
                    pandterm118=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm118.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:145:4: sandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_metaPandSandAE1732);
                    sandterm119=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandterm119.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:4: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_metaPandSandAE1737);
                    andterm120=andterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andterm120.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:147:4: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_metaPandSandAE1742);
                    ae121=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae121.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, metaPandSandAE_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "metaPandSandAE"

    public static class orterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:1: orterm : ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) );
    public final tftacrulesfull.orterm_return orterm() throws RecognitionException {
        tftacrulesfull.orterm_return retval = new tftacrulesfull.orterm_return();
        retval.start = input.LT(1);
        int orterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR122=null;
        Object TRUE124=null;
        Object OR125=null;
        Object TRUE126=null;
        Object wildcard127=null;
        Object OR128=null;
        Object FALSE129=null;
        Object OR130=null;
        Object FALSE131=null;
        Object OR132=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.ae_return ae123 = null;

        tftacrulesfull.tt_return tt133 = null;

        tftacrulesfull.tt_return tt134 = null;


        Object OR122_tree=null;
        Object TRUE124_tree=null;
        Object OR125_tree=null;
        Object TRUE126_tree=null;
        Object wildcard127_tree=null;
        Object OR128_tree=null;
        Object FALSE129_tree=null;
        Object OR130_tree=null;
        Object FALSE131_tree=null;
        Object OR132_tree=null;
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:8: ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==OR) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred49_tftacrulesfull()) ) {
                    alt10=1;
                }
                else if ( (synpred50_tftacrulesfull()) ) {
                    alt10=2;
                }
                else if ( (synpred51_tftacrulesfull()) ) {
                    alt10=3;
                }
                else if ( (synpred52_tftacrulesfull()) ) {
                    alt10=4;
                }
                else if ( (true) ) {
                    alt10=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:10: ^( OR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR122=(Object)match(input,OR,FOLLOW_OR_in_orterm1754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR122);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1756);
                    ae123=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae123.getTree());
                    _last = (Object)input.LT(1);
                    TRUE124=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE124);


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
                    // 151:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( OR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR125=(Object)match(input,OR,FOLLOW_OR_in_orterm1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR125);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE126=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE126);

                    _last = (Object)input.LT(1);
                    wildcard127=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard127_tree = (Object)adaptor.dupTree(wildcard127);
                    adaptor.addChild(root_1, wildcard127_tree);
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
                    // 153:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ^( OR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR128=(Object)match(input,OR,FOLLOW_OR_in_orterm1791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR128);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE129=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE129);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1797);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());

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
                    // 155:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:156:4: ^( OR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR130=(Object)match(input,OR,FOLLOW_OR_in_orterm1812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR130);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1816);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE131=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE131);


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
                    // 157:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:158:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR132=(Object)match(input,OR,FOLLOW_OR_in_orterm1833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR132_tree = (Object)adaptor.dupNode(OR132);

                    root_1 = (Object)adaptor.becomeRoot(OR132_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1835);
                    tt133=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt133.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1837);
                    tt134=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt134.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, orterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orterm"

    public static class xorterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xorterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:1: xorterm : ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) );
    public final tftacrulesfull.xorterm_return xorterm() throws RecognitionException {
        tftacrulesfull.xorterm_return retval = new tftacrulesfull.xorterm_return();
        retval.start = input.LT(1);
        int xorterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR135=null;
        Object TRUE137=null;
        Object XOR138=null;
        Object TRUE139=null;
        Object wildcard140=null;
        Object XOR141=null;
        Object FALSE142=null;
        Object XOR143=null;
        Object FALSE144=null;
        Object XOR145=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.ae_return ae136 = null;

        tftacrulesfull.tt_return tt146 = null;

        tftacrulesfull.tt_return tt147 = null;


        Object XOR135_tree=null;
        Object TRUE137_tree=null;
        Object XOR138_tree=null;
        Object TRUE139_tree=null;
        Object wildcard140_tree=null;
        Object XOR141_tree=null;
        Object FALSE142_tree=null;
        Object XOR143_tree=null;
        Object FALSE144_tree=null;
        Object XOR145_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:9: ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==XOR) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred53_tftacrulesfull()) ) {
                    alt11=1;
                }
                else if ( (synpred54_tftacrulesfull()) ) {
                    alt11=2;
                }
                else if ( (synpred55_tftacrulesfull()) ) {
                    alt11=3;
                }
                else if ( (synpred56_tftacrulesfull()) ) {
                    alt11=4;
                }
                else if ( (true) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:11: ^( XOR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR135=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR135);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1852);
                    ae136=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae136.getTree());
                    _last = (Object)input.LT(1);
                    TRUE137=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE137);


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
                    // 162:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:163:4: ^( XOR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR138=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR138);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE139=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE139);

                    _last = (Object)input.LT(1);
                    wildcard140=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard140_tree = (Object)adaptor.dupTree(wildcard140);
                    adaptor.addChild(root_1, wildcard140_tree);
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
                    // 164:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:165:4: ^( XOR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR141=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR141);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE142=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE142);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1893);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());

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
                    // 166:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:4: ^( XOR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR143=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR143);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1912);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE144=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE144);


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
                    // 168:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR145=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR145_tree = (Object)adaptor.dupNode(XOR145);

                    root_1 = (Object)adaptor.becomeRoot(XOR145_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1931);
                    tt146=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt146.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1933);
                    tt147=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt147.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, xorterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "xorterm"

    public static class pandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );
    public final tftacrulesfull.pandterm_return pandterm() throws RecognitionException {
        tftacrulesfull.pandterm_return retval = new tftacrulesfull.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND148=null;
        Object FALSE150=null;
        Object PAND151=null;
        Object FALSE152=null;
        Object wildcard153=null;
        Object PAND154=null;
        Object TRUE156=null;
        Object PAND157=null;
        Object TRUE158=null;
        Object PAND159=null;
        Object XOR160=null;
        Object PAND161=null;
        Object XOR162=null;
        Object PAND163=null;
        Object OR164=null;
        Object PAND165=null;
        Object OR166=null;
        Object PAND167=null;
        Object PAND168=null;
        Object PAND169=null;
        Object AND170=null;
        Object PAND171=null;
        Object AND172=null;
        Object PAND173=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notterm_return b = null;

        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.ae_return ae149 = null;

        tftacrulesfull.ae_return ae155 = null;

        tftacrulesfull.tt_return tt174 = null;

        tftacrulesfull.tt_return tt175 = null;


        Object PAND148_tree=null;
        Object FALSE150_tree=null;
        Object PAND151_tree=null;
        Object FALSE152_tree=null;
        Object wildcard153_tree=null;
        Object PAND154_tree=null;
        Object TRUE156_tree=null;
        Object PAND157_tree=null;
        Object TRUE158_tree=null;
        Object PAND159_tree=null;
        Object XOR160_tree=null;
        Object PAND161_tree=null;
        Object XOR162_tree=null;
        Object PAND163_tree=null;
        Object OR164_tree=null;
        Object PAND165_tree=null;
        Object OR166_tree=null;
        Object PAND167_tree=null;
        Object PAND168_tree=null;
        Object PAND169_tree=null;
        Object AND170_tree=null;
        Object PAND171_tree=null;
        Object AND172_tree=null;
        Object PAND173_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notterm=new RewriteRuleSubtreeStream(adaptor,"rule notterm");
        RewriteRuleSubtreeStream stream_metaPandSandAE=new RewriteRuleSubtreeStream(adaptor,"rule metaPandSandAE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:9: ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) )
            int alt12=12;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:11: ^( PAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND148=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND148);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1947);
                    ae149=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae149.getTree());
                    _last = (Object)input.LT(1);
                    FALSE150=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE150);


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
                    // 173:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:4: ^( PAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND151=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND151);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE152=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE152);

                    _last = (Object)input.LT(1);
                    wildcard153=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard153_tree = (Object)adaptor.dupTree(wildcard153);
                    adaptor.addChild(root_1, wildcard153_tree);
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
                    // 175:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:4: ^( PAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND154=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND154);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1984);
                    ae155=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae155.getTree());
                    _last = (Object)input.LT(1);
                    TRUE156=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE156);


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
                    // 177:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ^( PAND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND157=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND157);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE158=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm2003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE158);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm2007);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());

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
                    // 179:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND159=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND159);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR160=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm2025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR160);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2029);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2033);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2038);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, PAND, z, y, XOR, x, PAND
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
                    // 181:4: -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:7: ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:13: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:181:27: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND161=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND161);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2079);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR162=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm2082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR162);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2086);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2090);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, y, PAND, XOR, z, z, PAND
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
                    // 183:4: -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:7: ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:13: ^( PAND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:183:27: ^( PAND $z $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND163=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND163);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR164=(Object)match(input,OR,FOLLOW_OR_in_pandterm2132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR164);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2136);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2140);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2145);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, z, y, PAND, z, x, OR
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
                    // 185:4: -> ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:7: ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:12: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:185:26: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND165=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND165);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2186);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR166=(Object)match(input,OR,FOLLOW_OR_in_pandterm2189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR166);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2193);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2197);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, z, y, y, PAND, PAND, x, PAND, y, x, z
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
                    // 187:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:13: ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:19: ^( AND ^( NOT $x) ^( PAND $z $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:25: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:35: ^( PAND $z $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:50: ^( AND ^( NOT $y) ^( PAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:56: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:66: ^( PAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:85: ^( PAND $z ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:187:95: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND167=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND167);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2285);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND168=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND168);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2292);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2296);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, PAND, y, z
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
                    // 189:4: -> ^( PAND ^( AND $x $z) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:189:7: ^( PAND ^( AND $x $z) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:189:14: ^( AND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND169=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND169);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2330);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND170=(Object)match(input,AND,FOLLOW_AND_in_pandterm2333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND170);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2337);
                    b=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2341);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, b, PAND, x
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
                    // 191:4: -> ^( AND $b ^( PAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:7: ^( AND $b ^( PAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:191:16: ^( PAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:192:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND171=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND171);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND172=(Object)match(input,AND,FOLLOW_AND_in_pandterm2374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND172);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2378);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_pandterm2382);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2387);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: m1, z, m1, n1, PAND, n1, PAND, m1, AND, PAND, PAND, z, z, n1
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
                    // 193:4: -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:7: ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:13: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:19: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:26: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:37: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:53: ^( AND $n1 ^( PAND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:63: ^( PAND $m1 $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:99: ^( NOT $n1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:4: ^( PAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND173=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND173_tree = (Object)adaptor.dupNode(PAND173);

                    root_1 = (Object)adaptor.becomeRoot(PAND173_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2469);
                    tt174=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt174.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2471);
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
            if ( state.backtracking>0 ) { memoize(input, 12, pandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandterm"

    public static class sandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );
    public final tftacrulesfull.sandterm_return sandterm() throws RecognitionException {
        tftacrulesfull.sandterm_return retval = new tftacrulesfull.sandterm_return();
        retval.start = input.LT(1);
        int sandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND176=null;
        Object FALSE178=null;
        Object SAND179=null;
        Object FALSE180=null;
        Object wildcard181=null;
        Object SAND182=null;
        Object TRUE183=null;
        Object TRUE184=null;
        Object SAND185=null;
        Object TRUE187=null;
        Object SAND188=null;
        Object TRUE189=null;
        Object wildcard190=null;
        Object SAND191=null;
        Object XOR192=null;
        Object SAND193=null;
        Object XOR194=null;
        Object SAND195=null;
        Object OR196=null;
        Object SAND197=null;
        Object OR198=null;
        Object SAND199=null;
        Object PAND200=null;
        Object SAND201=null;
        Object PAND202=null;
        Object SAND203=null;
        Object AND204=null;
        Object SAND205=null;
        Object AND206=null;
        Object SAND207=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notterm_return a = null;

        tftacrulesfull.ae_return ae177 = null;

        tftacrulesfull.ae_return ae186 = null;

        tftacrulesfull.tt_return tt208 = null;

        tftacrulesfull.tt_return tt209 = null;


        Object SAND176_tree=null;
        Object FALSE178_tree=null;
        Object SAND179_tree=null;
        Object FALSE180_tree=null;
        Object wildcard181_tree=null;
        Object SAND182_tree=null;
        Object TRUE183_tree=null;
        Object TRUE184_tree=null;
        Object SAND185_tree=null;
        Object TRUE187_tree=null;
        Object SAND188_tree=null;
        Object TRUE189_tree=null;
        Object wildcard190_tree=null;
        Object SAND191_tree=null;
        Object XOR192_tree=null;
        Object SAND193_tree=null;
        Object XOR194_tree=null;
        Object SAND195_tree=null;
        Object OR196_tree=null;
        Object SAND197_tree=null;
        Object OR198_tree=null;
        Object SAND199_tree=null;
        Object PAND200_tree=null;
        Object SAND201_tree=null;
        Object PAND202_tree=null;
        Object SAND203_tree=null;
        Object AND204_tree=null;
        Object SAND205_tree=null;
        Object AND206_tree=null;
        Object SAND207_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        RewriteRuleSubtreeStream stream_notterm=new RewriteRuleSubtreeStream(adaptor,"rule notterm");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:9: ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) )
            int alt13=14;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:11: ^( SAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND176=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND176);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2485);
                    ae177=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae177.getTree());
                    _last = (Object)input.LT(1);
                    FALSE178=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE178);


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
                    // 198:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:4: ^( SAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND179=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND179);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE180=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE180);

                    _last = (Object)input.LT(1);
                    wildcard181=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard181_tree = (Object)adaptor.dupTree(wildcard181);
                    adaptor.addChild(root_1, wildcard181_tree);
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
                    // 200:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:4: ^( SAND TRUE TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND182=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND182);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE183=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE183);

                    _last = (Object)input.LT(1);
                    TRUE184=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE184);


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
                    // 202:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:4: ^( SAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND185=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND185);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2540);
                    ae186=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae186.getTree());
                    _last = (Object)input.LT(1);
                    TRUE187=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE187);


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
                    // 204:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:4: ^( SAND TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND188=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND188);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE189=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE189);

                    _last = (Object)input.LT(1);
                    wildcard190=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    wildcard190_tree = (Object)adaptor.dupTree(wildcard190);
                    adaptor.addChild(root_1, wildcard190_tree);
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
                    // 206:4: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND191=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND191);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR192=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR192);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2582);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2586);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2591);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, SAND, y, x, SAND, z, XOR
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
                    // 208:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND193=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND193);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2632);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR194=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR194);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2639);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2643);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, SAND, XOR, x, SAND, z, y
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
                    // 210:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:210:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND195=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND195);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2685);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR196=(Object)match(input,OR,FOLLOW_OR_in_sandterm2688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR196);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2692);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2696);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, z, x, SAND, y, z, y, SAND, z, SAND, x, y, SAND
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
                    // 212:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:51: ^( AND ^( NOT $y) ^( SAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:58: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:68: ^( SAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:86: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:212:96: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND197=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND197);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR198=(Object)match(input,OR,FOLLOW_OR_in_sandterm2784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR198);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2788);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2792);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2797);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, z, x, z, y, SAND, SAND, z, y, SAND, x, y, x
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
                    // 214:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:51: ^( AND ^( NOT $y) ^( SAND $x $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:58: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:68: ^( SAND $x $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:86: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:214:96: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND199=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND199);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND200=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND200);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2888);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2892);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2897);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, PAND, z, x, SAND
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
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND201=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND201);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2930);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND202=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND202);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2937);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2941);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, SAND, PAND, x, z
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
                    // 218:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:218:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND203=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND203);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2975);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND204=(Object)match(input,AND,FOLLOW_AND_in_sandterm2978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND204);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2982);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2986);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, z, x, a, AND
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
                case 13 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:221:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND205=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm3016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND205);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND206=(Object)match(input,AND,FOLLOW_AND_in_sandterm3019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND206);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm3023);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm3027);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm3032);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, AND, a, x, SAND
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
                    // 222:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:222:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:222:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:223:4: ^( SAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND207=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm3062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND207_tree = (Object)adaptor.dupNode(SAND207);

                    root_1 = (Object)adaptor.becomeRoot(SAND207_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm3064);
                    tt208=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt208.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm3066);
                    tt209=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt209.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 13, sandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sandterm"

    public static class ae_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:226:1: ae : ( ID | TRUE | FALSE );
    public final tftacrulesfull.ae_return ae() throws RecognitionException {
        tftacrulesfull.ae_return retval = new tftacrulesfull.ae_return();
        retval.start = input.LT(1);
        int ae_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set210=null;

        Object set210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:226:6: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set210=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set210_tree = (Object)adaptor.dupNode(set210);

                adaptor.addChild(root_0, set210_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 14, ae_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ae"

    // $ANTLR start synpred2_tftacrulesfull
    public final void synpred2_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:45:4: ( andterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:45:4: andterm
        {
        pushFollow(FOLLOW_andterm_in_synpred2_tftacrulesfull69);
        andterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_tftacrulesfull

    // $ANTLR start synpred3_tftacrulesfull
    public final void synpred3_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:46:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:46:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred3_tftacrulesfull74);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_tftacrulesfull

    // $ANTLR start synpred9_tftacrulesfull
    public final void synpred9_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:11: ( ^( NOT ^( AND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:11: ^( NOT ^( AND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred9_tftacrulesfull159); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred9_tftacrulesfull162); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred9_tftacrulesfull166);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred9_tftacrulesfull170);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_tftacrulesfull

    // $ANTLR start synpred10_tftacrulesfull
    public final void synpred10_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:61:4: ( ^( NOT ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:61:4: ^( NOT ^( OR x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred10_tftacrulesfull202); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred10_tftacrulesfull205); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred10_tftacrulesfull209);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred10_tftacrulesfull213);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_tftacrulesfull

    // $ANTLR start synpred11_tftacrulesfull
    public final void synpred11_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:63:4: ( ^( NOT ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:63:4: ^( NOT ^( XOR x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred11_tftacrulesfull245); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred11_tftacrulesfull248); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred11_tftacrulesfull252);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred11_tftacrulesfull256);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_tftacrulesfull

    // $ANTLR start synpred12_tftacrulesfull
    public final void synpred12_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:4: ( ^( NOT ^( SAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:4: ^( NOT ^( SAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred12_tftacrulesfull288); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred12_tftacrulesfull291); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred12_tftacrulesfull295);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred12_tftacrulesfull299);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_tftacrulesfull

    // $ANTLR start synpred16_tftacrulesfull
    public final void synpred16_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:11: ( ^( AND . FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:73:11: ^( AND . FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred16_tftacrulesfull448); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred16_tftacrulesfull452); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_tftacrulesfull

    // $ANTLR start synpred17_tftacrulesfull
    public final void synpred17_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:4: ( ^( AND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:4: ^( AND FALSE . )
        {
        match(input,AND,FOLLOW_AND_in_synpred17_tftacrulesfull467); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred17_tftacrulesfull469); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacrulesfull

    // $ANTLR start synpred18_tftacrulesfull
    public final void synpred18_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:77:4: ( ^( AND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:77:4: ^( AND TRUE a= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred18_tftacrulesfull485); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred18_tftacrulesfull487); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred18_tftacrulesfull491);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacrulesfull

    // $ANTLR start synpred19_tftacrulesfull
    public final void synpred19_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:79:4: ( ^( AND a= ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:79:4: ^( AND a= ae TRUE )
        {
        match(input,AND,FOLLOW_AND_in_synpred19_tftacrulesfull506); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred19_tftacrulesfull510);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred19_tftacrulesfull512); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_tftacrulesfull

    // $ANTLR start synpred20_tftacrulesfull
    public final void synpred20_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:81:4: ( ^( AND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:81:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred20_tftacrulesfull527); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred20_tftacrulesfull530); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred20_tftacrulesfull534);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred20_tftacrulesfull538);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred20_tftacrulesfull543);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_tftacrulesfull

    // $ANTLR start synpred21_tftacrulesfull
    public final void synpred21_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: ( ^( AND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: ^( AND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred21_tftacrulesfull582); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred21_tftacrulesfull585); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull589);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull593);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull598);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_tftacrulesfull

    // $ANTLR start synpred22_tftacrulesfull
    public final void synpred22_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ( ^( AND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ^( AND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred22_tftacrulesfull637); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull641);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred22_tftacrulesfull644); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull648);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull652);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_tftacrulesfull

    // $ANTLR start synpred23_tftacrulesfull
    public final void synpred23_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:87:4: ( andTermWithNegatedPands )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:87:4: andTermWithNegatedPands
        {
        pushFollow(FOLLOW_andTermWithNegatedPands_in_synpred23_tftacrulesfull689);
        andTermWithNegatedPands();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_tftacrulesfull

    // $ANTLR start synpred24_tftacrulesfull
    public final void synpred24_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:88:4: ( ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:88:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrulesfull696); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrulesfull699); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred24_tftacrulesfull703);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred24_tftacrulesfull707);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred24_tftacrulesfull712);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_tftacrulesfull

    // $ANTLR start synpred25_tftacrulesfull
    public final void synpred25_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:4: ( ^( AND x= tt y= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:4: ^( AND x= tt y= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred25_tftacrulesfull794); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrulesfull798);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrulesfull802);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_tftacrulesfull

    // $ANTLR start synpred28_tftacrulesfull
    public final void synpred28_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:4: ( ^( AND ^( OR x= negatedterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:4: ^( AND ^( OR x= negatedterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred28_tftacrulesfull1137); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred28_tftacrulesfull1140); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred28_tftacrulesfull1144);
        x=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred28_tftacrulesfull1148);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred28_tftacrulesfull1153);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_tftacrulesfull

    // $ANTLR start synpred29_tftacrulesfull
    public final void synpred29_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:4: ( ^( AND ^( XOR x= negatedterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:4: ^( AND ^( XOR x= negatedterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred29_tftacrulesfull1189); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred29_tftacrulesfull1192); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred29_tftacrulesfull1196);
        x=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred29_tftacrulesfull1200);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred29_tftacrulesfull1205);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_tftacrulesfull

    // $ANTLR start synpred30_tftacrulesfull
    public final void synpred30_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:4: ( ^( AND ^( OR x= negatedterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:4: ^( AND ^( OR x= negatedterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred30_tftacrulesfull1241); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred30_tftacrulesfull1244); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred30_tftacrulesfull1248);
        x=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred30_tftacrulesfull1252);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred30_tftacrulesfull1257);
        z2=sandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_tftacrulesfull

    // $ANTLR start synpred31_tftacrulesfull
    public final void synpred31_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:4: ( ^( AND ^( XOR x= negatedterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:4: ^( AND ^( XOR x= negatedterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred31_tftacrulesfull1293); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred31_tftacrulesfull1296); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred31_tftacrulesfull1300);
        x=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred31_tftacrulesfull1304);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred31_tftacrulesfull1309);
        z2=sandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacrulesfull

    // $ANTLR start synpred32_tftacrulesfull
    public final void synpred32_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:4: ( ^( AND ^( OR x= negatedterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:4: ^( AND ^( OR x= negatedterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred32_tftacrulesfull1345); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred32_tftacrulesfull1348); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred32_tftacrulesfull1352);
        x=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred32_tftacrulesfull1356);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred32_tftacrulesfull1361);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacrulesfull

    // $ANTLR start synpred33_tftacrulesfull
    public final void synpred33_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:4: ( ^( AND ^( XOR x= negatedterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:4: ^( AND ^( XOR x= negatedterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred33_tftacrulesfull1397); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred33_tftacrulesfull1400); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred33_tftacrulesfull1404);
        x=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred33_tftacrulesfull1408);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred33_tftacrulesfull1413);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacrulesfull

    // $ANTLR start synpred34_tftacrulesfull
    public final void synpred34_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return n1 = null;

        tftacrulesfull.tt_return t1 = null;

        tftacrulesfull.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:121:4: ( ^( AND n1= negatedterm ^( OR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:121:4: ^( AND n1= negatedterm ^( OR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred34_tftacrulesfull1449); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred34_tftacrulesfull1453);
        n1=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred34_tftacrulesfull1456); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrulesfull1460);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrulesfull1464);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_tftacrulesfull

    // $ANTLR start synpred35_tftacrulesfull
    public final void synpred35_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return n1 = null;

        tftacrulesfull.tt_return t1 = null;

        tftacrulesfull.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:4: ( ^( AND n1= negatedterm ^( XOR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:4: ^( AND n1= negatedterm ^( XOR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred35_tftacrulesfull1504); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred35_tftacrulesfull1508);
        n1=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred35_tftacrulesfull1511); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred35_tftacrulesfull1515);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred35_tftacrulesfull1519);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_tftacrulesfull

    // $ANTLR start synpred36_tftacrulesfull
    public final void synpred36_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.negatedterm_return n1 = null;

        tftacrulesfull.notterm_return n2 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ( ^( AND n1= negatedterm ^( AND n2= notterm m1= metaPandSandAE ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: ^( AND n1= negatedterm ^( AND n2= notterm m1= metaPandSandAE ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred36_tftacrulesfull1558); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred36_tftacrulesfull1562);
        n1=negatedterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred36_tftacrulesfull1565); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred36_tftacrulesfull1569);
        n2=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred36_tftacrulesfull1573);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_tftacrulesfull

    // $ANTLR start synpred37_tftacrulesfull
    public final void synpred37_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:131:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:131:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred37_tftacrulesfull1621);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_tftacrulesfull

    // $ANTLR start synpred38_tftacrulesfull
    public final void synpred38_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: ( notterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: notterm
        {
        pushFollow(FOLLOW_notterm_in_synpred38_tftacrulesfull1626);
        notterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_tftacrulesfull

    // $ANTLR start synpred39_tftacrulesfull
    public final void synpred39_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:133:4: ( ^( XOR negatedterm negatedterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:133:4: ^( XOR negatedterm negatedterm )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred39_tftacrulesfull1632); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred39_tftacrulesfull1634);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred39_tftacrulesfull1636);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_tftacrulesfull

    // $ANTLR start synpred40_tftacrulesfull
    public final void synpred40_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ( ^( XOR negatedterm tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:134:4: ^( XOR negatedterm tt )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred40_tftacrulesfull1643); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred40_tftacrulesfull1645);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred40_tftacrulesfull1647);
        tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_tftacrulesfull

    // $ANTLR start synpred41_tftacrulesfull
    public final void synpred41_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:4: ( ^( XOR tt negatedterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:4: ^( XOR tt negatedterm )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred41_tftacrulesfull1654); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred41_tftacrulesfull1656);
        tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred41_tftacrulesfull1658);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_tftacrulesfull

    // $ANTLR start synpred42_tftacrulesfull
    public final void synpred42_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ( ^( XOR tt tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:136:4: ^( XOR tt tt )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred42_tftacrulesfull1665); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1667);
        tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred42_tftacrulesfull1669);
        tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_tftacrulesfull

    // $ANTLR start synpred43_tftacrulesfull
    public final void synpred43_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:137:4: ( ^( OR negatedterm negatedterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:137:4: ^( OR negatedterm negatedterm )
        {
        match(input,OR,FOLLOW_OR_in_synpred43_tftacrulesfull1676); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred43_tftacrulesfull1678);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred43_tftacrulesfull1680);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_tftacrulesfull

    // $ANTLR start synpred44_tftacrulesfull
    public final void synpred44_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ( ^( OR negatedterm tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:138:4: ^( OR negatedterm tt )
        {
        match(input,OR,FOLLOW_OR_in_synpred44_tftacrulesfull1687); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred44_tftacrulesfull1689);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred44_tftacrulesfull1691);
        tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_tftacrulesfull

    // $ANTLR start synpred45_tftacrulesfull
    public final void synpred45_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:4: ( ^( OR tt negatedterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:4: ^( OR tt negatedterm )
        {
        match(input,OR,FOLLOW_OR_in_synpred45_tftacrulesfull1698); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred45_tftacrulesfull1700);
        tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred45_tftacrulesfull1702);
        negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_tftacrulesfull

    // $ANTLR start synpred49_tftacrulesfull
    public final void synpred49_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:10: ( ^( OR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:10: ^( OR ae TRUE )
        {
        match(input,OR,FOLLOW_OR_in_synpred49_tftacrulesfull1754); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred49_tftacrulesfull1756);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred49_tftacrulesfull1758); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_tftacrulesfull

    // $ANTLR start synpred50_tftacrulesfull
    public final void synpred50_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ( ^( OR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( OR TRUE . )
        {
        match(input,OR,FOLLOW_OR_in_synpred50_tftacrulesfull1773); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrulesfull1775); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_tftacrulesfull

    // $ANTLR start synpred51_tftacrulesfull
    public final void synpred51_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ( ^( OR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ^( OR FALSE a= ae )
        {
        match(input,OR,FOLLOW_OR_in_synpred51_tftacrulesfull1791); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred51_tftacrulesfull1793); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred51_tftacrulesfull1797);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_tftacrulesfull

    // $ANTLR start synpred52_tftacrulesfull
    public final void synpred52_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:156:4: ( ^( OR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:156:4: ^( OR a= ae FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred52_tftacrulesfull1812); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred52_tftacrulesfull1816);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred52_tftacrulesfull1818); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_tftacrulesfull

    // $ANTLR start synpred53_tftacrulesfull
    public final void synpred53_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:11: ( ^( XOR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:11: ^( XOR ae TRUE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred53_tftacrulesfull1850); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred53_tftacrulesfull1852);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred53_tftacrulesfull1854); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_tftacrulesfull

    // $ANTLR start synpred54_tftacrulesfull
    public final void synpred54_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:163:4: ( ^( XOR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:163:4: ^( XOR TRUE . )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred54_tftacrulesfull1869); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred54_tftacrulesfull1871); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_tftacrulesfull

    // $ANTLR start synpred55_tftacrulesfull
    public final void synpred55_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:165:4: ( ^( XOR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:165:4: ^( XOR FALSE a= ae )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred55_tftacrulesfull1887); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred55_tftacrulesfull1889); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred55_tftacrulesfull1893);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_tftacrulesfull

    // $ANTLR start synpred56_tftacrulesfull
    public final void synpred56_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:4: ( ^( XOR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:4: ^( XOR a= ae FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred56_tftacrulesfull1908); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred56_tftacrulesfull1912);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred56_tftacrulesfull1914); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_tftacrulesfull

    // $ANTLR start synpred57_tftacrulesfull
    public final void synpred57_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:11: ( ^( PAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:11: ^( PAND ae FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrulesfull1945); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred57_tftacrulesfull1947);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred57_tftacrulesfull1949); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_tftacrulesfull

    // $ANTLR start synpred58_tftacrulesfull
    public final void synpred58_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:4: ( ^( PAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:4: ^( PAND FALSE . )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred58_tftacrulesfull1964); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred58_tftacrulesfull1966); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_tftacrulesfull

    // $ANTLR start synpred59_tftacrulesfull
    public final void synpred59_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:4: ( ^( PAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:4: ^( PAND ae TRUE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred59_tftacrulesfull1982); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred59_tftacrulesfull1984);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred59_tftacrulesfull1986); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacrulesfull

    // $ANTLR start synpred60_tftacrulesfull
    public final void synpred60_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ( ^( PAND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:4: ^( PAND TRUE a= ae )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred60_tftacrulesfull2001); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred60_tftacrulesfull2003); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred60_tftacrulesfull2007);
        a=ae();

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

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ( ^( PAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:180:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred61_tftacrulesfull2022); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred61_tftacrulesfull2025); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2029);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2033);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred61_tftacrulesfull2038);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_tftacrulesfull

    // $ANTLR start synpred62_tftacrulesfull
    public final void synpred62_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:4: ( ^( PAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred62_tftacrulesfull2075); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred62_tftacrulesfull2079);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred62_tftacrulesfull2082); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred62_tftacrulesfull2086);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred62_tftacrulesfull2090);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_tftacrulesfull

    // $ANTLR start synpred63_tftacrulesfull
    public final void synpred63_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:4: ( ^( PAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred63_tftacrulesfull2129); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred63_tftacrulesfull2132); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrulesfull2136);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrulesfull2140);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrulesfull2145);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacrulesfull

    // $ANTLR start synpred64_tftacrulesfull
    public final void synpred64_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:4: ( ^( PAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred64_tftacrulesfull2182); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2186);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred64_tftacrulesfull2189); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2193);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2197);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_tftacrulesfull

    // $ANTLR start synpred65_tftacrulesfull
    public final void synpred65_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:4: ( ^( PAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred65_tftacrulesfull2281); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2285);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred65_tftacrulesfull2288); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2292);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2296);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_tftacrulesfull

    // $ANTLR start synpred66_tftacrulesfull
    public final void synpred66_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notterm_return b = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ( ^( PAND x= tt ^( AND b= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred66_tftacrulesfull2326); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2330);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred66_tftacrulesfull2333); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred66_tftacrulesfull2337);
        b=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2341);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacrulesfull

    // $ANTLR start synpred67_tftacrulesfull
    public final void synpred67_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:192:4: ( ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:192:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred67_tftacrulesfull2371); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred67_tftacrulesfull2374); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred67_tftacrulesfull2378);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred67_tftacrulesfull2382);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrulesfull2387);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_tftacrulesfull

    // $ANTLR start synpred68_tftacrulesfull
    public final void synpred68_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:11: ( ^( SAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:11: ^( SAND ae FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred68_tftacrulesfull2483); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred68_tftacrulesfull2485);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred68_tftacrulesfull2487); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_tftacrulesfull

    // $ANTLR start synpred69_tftacrulesfull
    public final void synpred69_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:4: ( ^( SAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:4: ^( SAND FALSE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred69_tftacrulesfull2502); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred69_tftacrulesfull2504); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_tftacrulesfull

    // $ANTLR start synpred70_tftacrulesfull
    public final void synpred70_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:4: ( ^( SAND TRUE TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:4: ^( SAND TRUE TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred70_tftacrulesfull2520); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred70_tftacrulesfull2522); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred70_tftacrulesfull2524); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacrulesfull

    // $ANTLR start synpred71_tftacrulesfull
    public final void synpred71_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:4: ( ^( SAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:4: ^( SAND ae TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred71_tftacrulesfull2538); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred71_tftacrulesfull2540);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred71_tftacrulesfull2542); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_tftacrulesfull

    // $ANTLR start synpred72_tftacrulesfull
    public final void synpred72_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:4: ( ^( SAND TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:4: ^( SAND TRUE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred72_tftacrulesfull2557); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred72_tftacrulesfull2559); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_tftacrulesfull

    // $ANTLR start synpred73_tftacrulesfull
    public final void synpred73_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:4: ( ^( SAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred73_tftacrulesfull2575); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred73_tftacrulesfull2578); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred73_tftacrulesfull2582);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred73_tftacrulesfull2586);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred73_tftacrulesfull2591);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_tftacrulesfull

    // $ANTLR start synpred74_tftacrulesfull
    public final void synpred74_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:4: ( ^( SAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:209:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred74_tftacrulesfull2628); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred74_tftacrulesfull2632);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred74_tftacrulesfull2635); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred74_tftacrulesfull2639);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred74_tftacrulesfull2643);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_tftacrulesfull

    // $ANTLR start synpred75_tftacrulesfull
    public final void synpred75_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:4: ( ^( SAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred75_tftacrulesfull2681); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred75_tftacrulesfull2685);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred75_tftacrulesfull2688); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred75_tftacrulesfull2692);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred75_tftacrulesfull2696);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_tftacrulesfull

    // $ANTLR start synpred76_tftacrulesfull
    public final void synpred76_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:4: ( ^( SAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:213:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred76_tftacrulesfull2781); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred76_tftacrulesfull2784); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred76_tftacrulesfull2788);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred76_tftacrulesfull2792);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred76_tftacrulesfull2797);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_tftacrulesfull

    // $ANTLR start synpred77_tftacrulesfull
    public final void synpred77_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:4: ( ^( SAND ^( PAND x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:215:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred77_tftacrulesfull2881); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred77_tftacrulesfull2884); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred77_tftacrulesfull2888);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred77_tftacrulesfull2892);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred77_tftacrulesfull2897);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_tftacrulesfull

    // $ANTLR start synpred78_tftacrulesfull
    public final void synpred78_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:4: ( ^( SAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:217:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred78_tftacrulesfull2926); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred78_tftacrulesfull2930);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred78_tftacrulesfull2933); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred78_tftacrulesfull2937);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred78_tftacrulesfull2941);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_tftacrulesfull

    // $ANTLR start synpred79_tftacrulesfull
    public final void synpred79_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notterm_return a = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:4: ( ^( SAND x= tt ^( AND a= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:219:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred79_tftacrulesfull2971); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred79_tftacrulesfull2975);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred79_tftacrulesfull2978); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred79_tftacrulesfull2982);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred79_tftacrulesfull2986);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_tftacrulesfull

    // $ANTLR start synpred80_tftacrulesfull
    public final void synpred80_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return a = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:221:4: ( ^( SAND ^( AND a= notterm z= tt ) x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:221:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred80_tftacrulesfull3016); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred80_tftacrulesfull3019); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred80_tftacrulesfull3023);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred80_tftacrulesfull3027);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred80_tftacrulesfull3032);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_tftacrulesfull

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
    public final boolean synpred79_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_tftacrulesfull_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred9_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred78_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_tftacrulesfull_fragment(); // can never throw exception
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
    public final boolean synpred2_tftacrulesfull() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_tftacrulesfull_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\0\7\uffff";
    static final String DFA1_maxS =
        "\1\16\1\uffff\1\0\7\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\2\1\3";
    static final String DFA1_specialS =
        "\2\uffff\1\0\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\6\1\2\1\4\1\5\1\1\2\uffff\1\7\2\1",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
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
            return "44:1: tt : ( ae | andterm | negandterm | orterm | pandterm | sandterm | xorterm | ^( NOT ^( NOT a1= tt ) ) -> $a1);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred3_tftacrulesfull()) ) {s = 9;}

                         
                        input.seek(index1_2);
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
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\4\1\0\10\uffff";
    static final String DFA3_maxS =
        "\1\14\1\0\10\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\5\1\6\1\7\1\1\1\2\1\3\1\4\1\10";
    static final String DFA3_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\3\1\4\5\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "59:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred10_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred11_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred12_tftacrulesfull()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\6\1\0\13\uffff";
    static final String DFA4_maxS =
        "\1\6\1\0\13\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA4_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "73:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | andTermWithNegatedPands | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
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

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\6\1\0\12\uffff";
    static final String DFA7_maxS =
        "\1\6\1\0\12\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA7_specialS =
        "\1\uffff\1\0\12\uffff}>";
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
            return "108:1: negandterm : ( ^( AND ^( OR x= negatedterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= negatedterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= negatedterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= negatedterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= negatedterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= negatedterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= negatedterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND negatedterm metaPandSandAE ) );";
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
                        if ( (synpred28_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred29_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred30_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred31_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred32_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred33_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred34_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred35_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred36_tftacrulesfull()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
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
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\4\1\0\1\uffff\2\0\11\uffff";
    static final String DFA8_maxS =
        "\1\14\1\0\1\uffff\2\0\11\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\1\7\1\10\1\11\1\12\1\3\1\4\1\5\1\6";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\uffff\1\1\1\2\11\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\4\1\1\5\uffff\1\2",
            "\1\uffff",
            "",
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
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "130:1: negatedterm : ( negandterm | notterm | ^( XOR negatedterm negatedterm ) | ^( XOR negatedterm tt ) | ^( XOR tt negatedterm ) | ^( XOR tt tt ) | ^( OR negatedterm negatedterm ) | ^( OR negatedterm tt ) | ^( OR tt negatedterm ) | ^( OR tt tt ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred38_tftacrulesfull()) ) {s = 2;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred43_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred44_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred45_tftacrulesfull()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred39_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred40_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred41_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred42_tftacrulesfull()) ) {s = 13;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\7\1\0\14\uffff";
    static final String DFA12_maxS =
        "\1\7\1\0\14\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA12_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA12_transitionS = {
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "172:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred58_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred59_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred60_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred61_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred62_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred63_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred64_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred65_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred66_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred67_tftacrulesfull()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\20\uffff";
    static final String DFA13_eofS =
        "\20\uffff";
    static final String DFA13_minS =
        "\1\10\1\0\16\uffff";
    static final String DFA13_maxS =
        "\1\10\1\0\16\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA13_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA13_transitionS = {
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
            return "197:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );";
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
                        if ( (synpred68_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred69_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred70_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred71_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred72_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred73_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred74_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred75_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred76_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred77_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred78_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred79_tftacrulesfull()) ) {s = 13;}

                        else if ( (synpred80_tftacrulesfull()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
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
 

    public static final BitSet FOLLOW_ae_in_tt64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_tt69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negandterm_in_tt74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orterm_in_tt79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_tt84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandterm_in_tt89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xorterm_in_tt94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_tt100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_tt103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_tt107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_ce135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAND_in_ce142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ce_in_ce144 = new BitSet(new long[]{0x0000000000006300L});
    public static final BitSet FOLLOW_ce_in_ce146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_notterm162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm166 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_notterm205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm209 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_notterm248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm252 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_notterm291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm295 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_notterm400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm402 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_notterm411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm413 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_notterm422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm424 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm469 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_andterm485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_andterm487 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_andterm491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_andterm510 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_andterm512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_andterm530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm534 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_andterm585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm589 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_andterm644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm648 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andTermWithNegatedPands_in_andterm689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andterm696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andterm699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_andterm703 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_andterm707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm798 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm855 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegatedPands871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_andTermWithNegatedPands874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_andTermWithNegatedPands877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegatedPands881 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegatedPands885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_metaPandSandAE_in_andTermWithNegatedPands892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegatedPands1026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andTermWithNegatedPands1029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_termWithNegatedPands_in_andTermWithNegatedPands1033 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_andTermWithNegatedPands1037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andTermWithNegatedPands1042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_termWithNegatedPands1093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_termWithNegatedPands1096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_termWithNegatedPands1098 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_termWithNegatedPands1100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_termWithNegatedPands1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_termWithNegatedPands_in_termWithNegatedPands1111 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NOT_in_termWithNegatedPands1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_termWithNegatedPands1117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_termWithNegatedPands1119 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_termWithNegatedPands1121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1144 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1196 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1248 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1300 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1352 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1404 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negandterm1456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1460 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negandterm1511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1515 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1562 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_negandterm1565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1569 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1605 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_negatedterm1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notterm_in_negatedterm1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_negatedterm1632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1634 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negatedterm1643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1645 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negatedterm1647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negatedterm1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negatedterm1656 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_negatedterm1665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negatedterm1667 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negatedterm1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negatedterm1676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1678 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negatedterm1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1689 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negatedterm1691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negatedterm1698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negatedterm1700 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm1702 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_negatedterm1709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negatedterm1711 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negatedterm1713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_metaPandSandAE1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandterm_in_metaPandSandAE1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_metaPandSandAE1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_metaPandSandAE1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_orterm1754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_orterm1758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orterm1775 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_OR_in_orterm1791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orterm1793 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_orterm1797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1816 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orterm1818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orterm1835 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orterm1837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1852 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1871 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_XOR_in_xorterm1887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1889 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_xorterm1893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1912 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorterm1931 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorterm1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1947 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1966 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_PAND_in_pandterm1982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandterm2003 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_pandterm2007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pandterm2025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2029 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm2038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_pandterm2082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2086 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pandterm2132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2136 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm2145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_pandterm2189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2193 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2285 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_pandterm2288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2292 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2330 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_pandterm2333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2337 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandterm2374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2378 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_pandterm2382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm2387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2469 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2485 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2504 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2559 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_sandterm2578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2582 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_sandterm2635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2639 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_sandterm2688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2692 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_sandterm2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2788 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_sandterm2884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2888 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2930 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_sandterm2933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2937 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_sandterm2978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2982 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm3016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_sandterm3019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm3023 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm3027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm3032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm3062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm3064 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm3066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_ae0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_synpred2_tftacrulesfull69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negandterm_in_synpred3_tftacrulesfull74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_synpred9_tftacrulesfull159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred9_tftacrulesfull162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred9_tftacrulesfull166 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred9_tftacrulesfull170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred10_tftacrulesfull202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred10_tftacrulesfull205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred10_tftacrulesfull209 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred10_tftacrulesfull213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred11_tftacrulesfull245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred11_tftacrulesfull248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred11_tftacrulesfull252 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred11_tftacrulesfull256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred12_tftacrulesfull288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred12_tftacrulesfull291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrulesfull295 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrulesfull299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred16_tftacrulesfull448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred16_tftacrulesfull452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred17_tftacrulesfull467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred17_tftacrulesfull469 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_AND_in_synpred18_tftacrulesfull485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred18_tftacrulesfull487 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred18_tftacrulesfull491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred19_tftacrulesfull506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred19_tftacrulesfull510 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred19_tftacrulesfull512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred20_tftacrulesfull527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred20_tftacrulesfull530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred20_tftacrulesfull534 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred20_tftacrulesfull538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred20_tftacrulesfull543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred21_tftacrulesfull582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred21_tftacrulesfull585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull589 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred22_tftacrulesfull637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred22_tftacrulesfull644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull648 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andTermWithNegatedPands_in_synpred23_tftacrulesfull689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrulesfull696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrulesfull699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred24_tftacrulesfull703 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred24_tftacrulesfull707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred24_tftacrulesfull712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred25_tftacrulesfull794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrulesfull798 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrulesfull802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred28_tftacrulesfull1137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacrulesfull1140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred28_tftacrulesfull1144 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred28_tftacrulesfull1148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred28_tftacrulesfull1153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred29_tftacrulesfull1189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred29_tftacrulesfull1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred29_tftacrulesfull1196 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred29_tftacrulesfull1200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred29_tftacrulesfull1205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred30_tftacrulesfull1241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred30_tftacrulesfull1244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred30_tftacrulesfull1248 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred30_tftacrulesfull1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred30_tftacrulesfull1257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred31_tftacrulesfull1293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred31_tftacrulesfull1296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred31_tftacrulesfull1300 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred31_tftacrulesfull1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred31_tftacrulesfull1309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred32_tftacrulesfull1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred32_tftacrulesfull1348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred32_tftacrulesfull1352 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred32_tftacrulesfull1356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred32_tftacrulesfull1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred33_tftacrulesfull1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred33_tftacrulesfull1400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred33_tftacrulesfull1404 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred33_tftacrulesfull1408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred33_tftacrulesfull1413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacrulesfull1449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred34_tftacrulesfull1453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred34_tftacrulesfull1456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrulesfull1460 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrulesfull1464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred35_tftacrulesfull1504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred35_tftacrulesfull1508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred35_tftacrulesfull1511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrulesfull1515 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrulesfull1519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred36_tftacrulesfull1558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred36_tftacrulesfull1562 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred36_tftacrulesfull1565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred36_tftacrulesfull1569 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred36_tftacrulesfull1573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_synpred37_tftacrulesfull1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notterm_in_synpred38_tftacrulesfull1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_synpred39_tftacrulesfull1632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred39_tftacrulesfull1634 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred39_tftacrulesfull1636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred40_tftacrulesfull1643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred40_tftacrulesfull1645 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred40_tftacrulesfull1647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred41_tftacrulesfull1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred41_tftacrulesfull1656 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred41_tftacrulesfull1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred42_tftacrulesfull1665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1667 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred42_tftacrulesfull1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred43_tftacrulesfull1676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred43_tftacrulesfull1678 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred43_tftacrulesfull1680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred44_tftacrulesfull1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_synpred44_tftacrulesfull1689 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred44_tftacrulesfull1691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred45_tftacrulesfull1698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred45_tftacrulesfull1700 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred45_tftacrulesfull1702 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred49_tftacrulesfull1754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred49_tftacrulesfull1756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred49_tftacrulesfull1758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred50_tftacrulesfull1773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrulesfull1775 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_OR_in_synpred51_tftacrulesfull1791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred51_tftacrulesfull1793 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred51_tftacrulesfull1797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred52_tftacrulesfull1812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred52_tftacrulesfull1816 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred52_tftacrulesfull1818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred53_tftacrulesfull1850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred53_tftacrulesfull1852 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred53_tftacrulesfull1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred54_tftacrulesfull1869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred54_tftacrulesfull1871 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_XOR_in_synpred55_tftacrulesfull1887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred55_tftacrulesfull1889 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred55_tftacrulesfull1893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred56_tftacrulesfull1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred56_tftacrulesfull1912 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred56_tftacrulesfull1914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrulesfull1945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred57_tftacrulesfull1947 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred57_tftacrulesfull1949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred58_tftacrulesfull1964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred58_tftacrulesfull1966 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_PAND_in_synpred59_tftacrulesfull1982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred59_tftacrulesfull1984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred59_tftacrulesfull1986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred60_tftacrulesfull2001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred60_tftacrulesfull2003 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred60_tftacrulesfull2007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred61_tftacrulesfull2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred61_tftacrulesfull2025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2029 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred61_tftacrulesfull2038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred62_tftacrulesfull2075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred62_tftacrulesfull2079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred62_tftacrulesfull2082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred62_tftacrulesfull2086 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred62_tftacrulesfull2090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred63_tftacrulesfull2129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred63_tftacrulesfull2132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrulesfull2136 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrulesfull2140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrulesfull2145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred64_tftacrulesfull2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred64_tftacrulesfull2189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2193 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred65_tftacrulesfull2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2285 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred65_tftacrulesfull2288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2292 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred66_tftacrulesfull2326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2330 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred66_tftacrulesfull2333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred66_tftacrulesfull2337 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred67_tftacrulesfull2371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred67_tftacrulesfull2374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred67_tftacrulesfull2378 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred67_tftacrulesfull2382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrulesfull2387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred68_tftacrulesfull2483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred68_tftacrulesfull2485 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred68_tftacrulesfull2487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred69_tftacrulesfull2502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred69_tftacrulesfull2504 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred70_tftacrulesfull2520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred70_tftacrulesfull2522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred70_tftacrulesfull2524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred71_tftacrulesfull2538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred71_tftacrulesfull2540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred71_tftacrulesfull2542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred72_tftacrulesfull2557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred72_tftacrulesfull2559 = new BitSet(new long[]{0x000007FFFFFFFFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred73_tftacrulesfull2575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred73_tftacrulesfull2578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred73_tftacrulesfull2582 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred73_tftacrulesfull2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred73_tftacrulesfull2591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred74_tftacrulesfull2628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred74_tftacrulesfull2632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred74_tftacrulesfull2635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred74_tftacrulesfull2639 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred74_tftacrulesfull2643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred75_tftacrulesfull2681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred75_tftacrulesfull2685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred75_tftacrulesfull2688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred75_tftacrulesfull2692 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred75_tftacrulesfull2696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred76_tftacrulesfull2781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred76_tftacrulesfull2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred76_tftacrulesfull2788 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred76_tftacrulesfull2792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred76_tftacrulesfull2797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred77_tftacrulesfull2881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred77_tftacrulesfull2884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred77_tftacrulesfull2888 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred77_tftacrulesfull2892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred77_tftacrulesfull2897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred78_tftacrulesfull2926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred78_tftacrulesfull2930 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred78_tftacrulesfull2933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred78_tftacrulesfull2937 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred78_tftacrulesfull2941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred79_tftacrulesfull2971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred79_tftacrulesfull2975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred79_tftacrulesfull2978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred79_tftacrulesfull2982 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred79_tftacrulesfull2986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred80_tftacrulesfull3016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred80_tftacrulesfull3019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred80_tftacrulesfull3023 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred80_tftacrulesfull3027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred80_tftacrulesfull3032 = new BitSet(new long[]{0x0000000000000008L});

}