// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g 2009-03-08 18:13:52

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacrulesfull extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OR", "XOR", "AND", "PAND", "SAND", "ID", "LBRACE", "RBRACE", "NOT", "TRUE", "FALSE", "INT", "WS"
    };
    public static final int WS=16;
    public static final int XOR=5;
    public static final int RBRACE=11;
    public static final int OR=4;
    public static final int LBRACE=10;
    public static final int PAND=7;
    public static final int INT=15;
    public static final int SAND=8;
    public static final int NOT=12;
    public static final int AND=6;
    public static final int ID=9;
    public static final int FALSE=14;
    public static final int EOF=-1;
    public static final int TRUE=13;

    // delegates
    // delegators


        public tftacrulesfull(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacrulesfull(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[86+1];
             
             
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"token a1",a1!=null?a1.tree:null);

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );
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
        Object PAND21=null;
        Object NOT22=null;
        Object SAND23=null;
        Object OR24=null;
        Object XOR27=null;
        Object AND30=null;
        Object NOT33=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.notterm_return notterm25 = null;

        tftacrulesfull.notterm_return notterm26 = null;

        tftacrulesfull.notterm_return notterm28 = null;

        tftacrulesfull.notterm_return notterm29 = null;

        tftacrulesfull.notterm_return notterm31 = null;

        tftacrulesfull.notterm_return notterm32 = null;

        tftacrulesfull.tt_return tt34 = null;


        Object NOT14_tree=null;
        Object AND15_tree=null;
        Object NOT16_tree=null;
        Object OR17_tree=null;
        Object NOT18_tree=null;
        Object XOR19_tree=null;
        Object NOT20_tree=null;
        Object PAND21_tree=null;
        Object NOT22_tree=null;
        Object SAND23_tree=null;
        Object OR24_tree=null;
        Object XOR27_tree=null;
        Object AND30_tree=null;
        Object NOT33_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:59:9: ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) )
            int alt3=9;
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
                    // elements: y, x, NOT, NOT
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

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
                    // elements: y, x, NOT, NOT
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:4: ^( NOT ^( PAND x= tt y= tt ) )
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
                    PAND21=(Object)match(input,PAND,FOLLOW_PAND_in_notterm291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND21);



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
                    // elements: x, y, NOT, x, NOT, x, PAND, y, y, x, x, NOT, NOT, y, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:4: -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:13: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:19: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:25: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:58: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:64: ^( NOT $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:79: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:85: ^( NOT $y)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:100: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:66:115: ^( SAND $x $y)
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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:67:4: ^( NOT ^( SAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT22=(Object)match(input,NOT,FOLLOW_NOT_in_notterm397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT22);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND23=(Object)match(input,SAND,FOLLOW_SAND_in_notterm400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND23);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm404);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm408);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, x, y, NOT, y, NOT, NOT, x, y, x, y, x, y, NOT
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:4: -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:13: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:19: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:25: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:58: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:64: ^( NOT $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:79: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:85: ^( NOT $y)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:100: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:68:115: ^( PAND $x $y)
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
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:69:4: ^( OR notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR24=(Object)match(input,OR,FOLLOW_OR_in_notterm507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR24_tree = (Object)adaptor.dupNode(OR24);

                    root_1 = (Object)adaptor.becomeRoot(OR24_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm509);
                    notterm25=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm25.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm511);
                    notterm26=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm26.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:70:4: ^( XOR notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR27=(Object)match(input,XOR,FOLLOW_XOR_in_notterm518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR27_tree = (Object)adaptor.dupNode(XOR27);

                    root_1 = (Object)adaptor.becomeRoot(XOR27_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm520);
                    notterm28=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm28.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm522);
                    notterm29=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm29.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:71:4: ^( AND notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND30=(Object)match(input,AND,FOLLOW_AND_in_notterm529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND30_tree = (Object)adaptor.dupNode(AND30);

                    root_1 = (Object)adaptor.becomeRoot(AND30_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm531);
                    notterm31=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm31.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm533);
                    notterm32=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm32.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:72:4: ^( NOT tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT33=(Object)match(input,NOT,FOLLOW_NOT_in_notterm540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT33_tree = (Object)adaptor.dupNode(NOT33);

                    root_1 = (Object)adaptor.becomeRoot(NOT33_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm542);
                    tt34=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt34.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) );
    public final tftacrulesfull.andterm_return andterm() throws RecognitionException {
        tftacrulesfull.andterm_return retval = new tftacrulesfull.andterm_return();
        retval.start = input.LT(1);
        int andterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND35=null;
        Object wildcard36=null;
        Object FALSE37=null;
        Object AND38=null;
        Object FALSE39=null;
        Object wildcard40=null;
        Object AND41=null;
        Object TRUE42=null;
        Object AND43=null;
        Object TRUE44=null;
        Object AND45=null;
        Object XOR46=null;
        Object AND47=null;
        Object OR48=null;
        Object AND49=null;
        Object OR50=null;
        Object AND51=null;
        Object AND52=null;
        Object AND53=null;
        Object AND54=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.tt_return tt55 = null;

        tftacrulesfull.tt_return tt56 = null;


        Object AND35_tree=null;
        Object wildcard36_tree=null;
        Object FALSE37_tree=null;
        Object AND38_tree=null;
        Object FALSE39_tree=null;
        Object wildcard40_tree=null;
        Object AND41_tree=null;
        Object TRUE42_tree=null;
        Object AND43_tree=null;
        Object TRUE44_tree=null;
        Object AND45_tree=null;
        Object XOR46_tree=null;
        Object AND47_tree=null;
        Object OR48_tree=null;
        Object AND49_tree=null;
        Object OR50_tree=null;
        Object AND51_tree=null;
        Object AND52_tree=null;
        Object AND53_tree=null;
        Object AND54_tree=null;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:9: ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) )
            int alt4=10;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:11: ^( AND . FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND35=(Object)match(input,AND,FOLLOW_AND_in_andterm555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND35);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    wildcard36=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE37=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE37);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:77:4: ^( AND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND38=(Object)match(input,AND,FOLLOW_AND_in_andterm574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND38);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE39=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE39);

                    wildcard40=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:79:4: ^( AND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND41=(Object)match(input,AND,FOLLOW_AND_in_andterm592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND41);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE42=(Object)match(input,TRUE,FOLLOW_TRUE_in_andterm594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE42);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_andterm598);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:81:4: ^( AND a= ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND43=(Object)match(input,AND,FOLLOW_AND_in_andterm613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND43);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_andterm617);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    TRUE44=(Object)match(input,TRUE,FOLLOW_TRUE_in_andterm619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE44);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a
                    // token labels: 
                    // rule labels: retval, a
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND45=(Object)match(input,AND,FOLLOW_AND_in_andterm634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND45);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR46=(Object)match(input,XOR,FOLLOW_XOR_in_andterm637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR46);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm641);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm645);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm650);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, y, XOR, z, z, x, AND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:84:26: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ^( AND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND47=(Object)match(input,AND,FOLLOW_AND_in_andterm689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND47);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR48=(Object)match(input,OR,FOLLOW_OR_in_andterm692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR48);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm696);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm700);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm705);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, OR, y, AND, z, AND, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

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
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:87:4: ^( AND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND49=(Object)match(input,AND,FOLLOW_AND_in_andterm744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND49);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm748);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR50=(Object)match(input,OR,FOLLOW_OR_in_andterm751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR50);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm755);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm759);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, z, AND, AND, y, OR
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:88:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:88:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:88:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND51=(Object)match(input,AND,FOLLOW_AND_in_andterm798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND51);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND52=(Object)match(input,AND,FOLLOW_AND_in_andterm801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND52);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_andterm805);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_andterm809);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm814);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: m1, z, n1, m1, AND, n1, z, z, m1, n1, AND
                    // token labels: 
                    // rule labels: n1, retval, m1, z
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"token n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"token m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:4: -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:7: ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:13: ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:19: ^( AND $n1 ^( AND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:29: ^( AND $m1 $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:44: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:51: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:62: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:90:99: ^( NOT $n1)
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
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:92:4: ^( AND x= tt y= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND53=(Object)match(input,AND,FOLLOW_AND_in_andterm898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND53);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm902);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm906);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, y, y, x, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:4: -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:7: ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:13: ^( XOR ^( PAND $y $x) ^( PAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:19: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:33: ^( PAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:93:48: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:94:4: ^( AND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND54=(Object)match(input,AND,FOLLOW_AND_in_andterm957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND54_tree = (Object)adaptor.dupNode(AND54);

                    root_1 = (Object)adaptor.becomeRoot(AND54_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm959);
                    tt55=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt55.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm961);
                    tt56=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt56.getTree());

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

    public static class pureand_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pureand"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:1: pureand : ( ^( AND ID ID ) | ^( AND pureand ID ) );
    public final tftacrulesfull.pureand_return pureand() throws RecognitionException {
        tftacrulesfull.pureand_return retval = new tftacrulesfull.pureand_return();
        retval.start = input.LT(1);
        int pureand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND57=null;
        Object ID58=null;
        Object ID59=null;
        Object AND60=null;
        Object ID62=null;
        tftacrulesfull.pureand_return pureand61 = null;


        Object AND57_tree=null;
        Object ID58_tree=null;
        Object ID59_tree=null;
        Object AND60_tree=null;
        Object ID62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:9: ( ^( AND ID ID ) | ^( AND pureand ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==AND) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:97:11: ^( AND ID ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND57=(Object)match(input,AND,FOLLOW_AND_in_pureand973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND57_tree = (Object)adaptor.dupNode(AND57);

                    root_1 = (Object)adaptor.becomeRoot(AND57_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    ID58=(Object)match(input,ID,FOLLOW_ID_in_pureand975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID58_tree = (Object)adaptor.dupNode(ID58);

                    adaptor.addChild(root_1, ID58_tree);
                    }
                    _last = (Object)input.LT(1);
                    ID59=(Object)match(input,ID,FOLLOW_ID_in_pureand977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID59_tree = (Object)adaptor.dupNode(ID59);

                    adaptor.addChild(root_1, ID59_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:98:4: ^( AND pureand ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND60=(Object)match(input,AND,FOLLOW_AND_in_pureand984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND60_tree = (Object)adaptor.dupNode(AND60);

                    root_1 = (Object)adaptor.becomeRoot(AND60_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pureand_in_pureand986);
                    pureand61=pureand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, pureand61.getTree());
                    _last = (Object)input.LT(1);
                    ID62=(Object)match(input,ID,FOLLOW_ID_in_pureand988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID62_tree = (Object)adaptor.dupNode(ID62);

                    adaptor.addChild(root_1, ID62_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 5, pureand_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pureand"

    public static class negandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:101:1: negandterm : ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) );
    public final tftacrulesfull.negandterm_return negandterm() throws RecognitionException {
        tftacrulesfull.negandterm_return retval = new tftacrulesfull.negandterm_return();
        retval.start = input.LT(1);
        int negandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND63=null;
        Object OR64=null;
        Object AND65=null;
        Object XOR66=null;
        Object AND67=null;
        Object OR68=null;
        Object AND69=null;
        Object XOR70=null;
        Object AND71=null;
        Object OR72=null;
        Object AND73=null;
        Object XOR74=null;
        Object AND75=null;
        Object OR76=null;
        Object AND77=null;
        Object XOR78=null;
        Object AND79=null;
        Object AND80=null;
        Object AND81=null;
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.pandterm_return z1 = null;

        tftacrulesfull.sandterm_return z2 = null;

        tftacrulesfull.ae_return z3 = null;

        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.tt_return t1 = null;

        tftacrulesfull.tt_return t2 = null;

        tftacrulesfull.notterm_return n2 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.notterm_return notterm82 = null;

        tftacrulesfull.metaPandSandAE_return metaPandSandAE83 = null;


        Object AND63_tree=null;
        Object OR64_tree=null;
        Object AND65_tree=null;
        Object XOR66_tree=null;
        Object AND67_tree=null;
        Object OR68_tree=null;
        Object AND69_tree=null;
        Object XOR70_tree=null;
        Object AND71_tree=null;
        Object OR72_tree=null;
        Object AND73_tree=null;
        Object XOR74_tree=null;
        Object AND75_tree=null;
        Object OR76_tree=null;
        Object AND77_tree=null;
        Object XOR78_tree=null;
        Object AND79_tree=null;
        Object AND80_tree=null;
        Object AND81_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:102:2: ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) )
            int alt6=10;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:102:4: ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND63=(Object)match(input,AND,FOLLOW_AND_in_negandterm1002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND63);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR64=(Object)match(input,OR,FOLLOW_OR_in_negandterm1005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR64);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1009);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1013);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1018);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z1, AND, y, z1, x, OR, AND
                    // token labels: 
                    // rule labels: retval, z1, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"token z1",z1!=null?z1.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:4: -> ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:7: ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:12: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:103:26: ^( AND $y $z1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:104:4: ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND65=(Object)match(input,AND,FOLLOW_AND_in_negandterm1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND65);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR66=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR66);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1061);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1065);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1070);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z1, z1, AND, AND, XOR, y, x
                    // token labels: 
                    // rule labels: retval, z1, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"token z1",z1!=null?z1.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:4: -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:105:7: ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:105:13: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:105:27: ^( AND $y $z1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:106:4: ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND67=(Object)match(input,AND,FOLLOW_AND_in_negandterm1106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND67);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR68=(Object)match(input,OR,FOLLOW_OR_in_negandterm1109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR68);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1113);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1117);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1122);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z2, AND, AND, y, OR, z2, x
                    // token labels: 
                    // rule labels: retval, z2, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"token z2",z2!=null?z2.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:4: -> ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:7: ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:12: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:107:26: ^( AND $y $z2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:108:4: ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND69=(Object)match(input,AND,FOLLOW_AND_in_negandterm1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND69);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR70=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR70);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1165);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1169);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1174);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, XOR, z2, z2, AND, y, AND
                    // token labels: 
                    // rule labels: retval, z2, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"token z2",z2!=null?z2.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:4: -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:7: ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:13: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:109:27: ^( AND $y $z2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:110:4: ^( AND ^( OR x= notterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND71=(Object)match(input,AND,FOLLOW_AND_in_negandterm1210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND71);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR72=(Object)match(input,OR,FOLLOW_OR_in_negandterm1213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR72);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1217);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1221);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1226);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z3, y, AND, z3, AND, x, OR
                    // token labels: 
                    // rule labels: retval, z3, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"token z3",z3!=null?z3.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:4: -> ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:7: ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:12: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:111:26: ^( AND $y $z3)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:112:4: ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND73=(Object)match(input,AND,FOLLOW_AND_in_negandterm1262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND73);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR74=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR74);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1269);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1273);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1278);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, z3, z3, y, x, AND, XOR
                    // token labels: 
                    // rule labels: retval, z3, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"token z3",z3!=null?z3.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:4: -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:7: ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:13: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:113:27: ^( AND $y $z3)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:114:4: ^( AND n1= notterm ^( OR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND75=(Object)match(input,AND,FOLLOW_AND_in_negandterm1314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND75);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1318);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR76=(Object)match(input,OR,FOLLOW_OR_in_negandterm1321); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR76);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1325);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1329);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: t1, t2, n1, AND, n1, AND, OR
                    // token labels: 
                    // rule labels: n1, t2, retval, t1
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"token n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"token t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"token t1",t1!=null?t1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:4: -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:7: ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:12: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:115:28: ^( AND $n1 $t2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:4: ^( AND n1= notterm ^( XOR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND77=(Object)match(input,AND,FOLLOW_AND_in_negandterm1369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND77);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1373);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR78=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR78);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1380);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1384);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: t1, AND, t2, n1, AND, XOR, n1
                    // token labels: 
                    // rule labels: n1, t2, retval, t1
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"token n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"token t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"token t1",t1!=null?t1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:4: -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:7: ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:13: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:117:29: ^( AND $n1 $t2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:4: ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND79=(Object)match(input,AND,FOLLOW_AND_in_negandterm1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND79);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1427);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND80=(Object)match(input,AND,FOLLOW_AND_in_negandterm1430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND80);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1434);
                    n2=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n2.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1438);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: n1, AND, AND, m1, n2
                    // token labels: 
                    // rule labels: n1, retval, n2, m1
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"token n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"token n2",n2!=null?n2.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"token m1",m1!=null?m1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:4: -> ^( AND ^( AND $n1 $n2) $m1)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:7: ^( AND ^( AND $n1 $n2) $m1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:119:13: ^( AND $n1 $n2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:120:4: ^( AND notterm metaPandSandAE )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND81=(Object)match(input,AND,FOLLOW_AND_in_negandterm1468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND81_tree = (Object)adaptor.dupNode(AND81);

                    root_1 = (Object)adaptor.becomeRoot(AND81_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1470);
                    notterm82=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm82.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1472);
                    metaPandSandAE83=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, metaPandSandAE83.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, negandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negandterm"

    public static class negatedterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negatedterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:123:1: negatedterm : ( negandterm | notterm );
    public final tftacrulesfull.negatedterm_return negatedterm() throws RecognitionException {
        tftacrulesfull.negatedterm_return retval = new tftacrulesfull.negatedterm_return();
        retval.start = input.LT(1);
        int negatedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrulesfull.negandterm_return negandterm84 = null;

        tftacrulesfull.notterm_return notterm85 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:2: ( negandterm | notterm )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AND) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred36_tftacrulesfull()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>=OR && LA7_0<=XOR)||LA7_0==NOT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:4: negandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negandterm_in_negatedterm1486);
                    negandterm84=negandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negandterm84.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:125:4: notterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negatedterm1491);
                    notterm85=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, notterm85.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, negatedterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negatedterm"

    public static class metaPandSandAE_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaPandSandAE"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:128:1: metaPandSandAE : ( pandterm | sandterm | andterm | ae );
    public final tftacrulesfull.metaPandSandAE_return metaPandSandAE() throws RecognitionException {
        tftacrulesfull.metaPandSandAE_return retval = new tftacrulesfull.metaPandSandAE_return();
        retval.start = input.LT(1);
        int metaPandSandAE_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrulesfull.pandterm_return pandterm86 = null;

        tftacrulesfull.sandterm_return sandterm87 = null;

        tftacrulesfull.andterm_return andterm88 = null;

        tftacrulesfull.ae_return ae89 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:129:2: ( pandterm | sandterm | andterm | ae )
            int alt8=4;
            switch ( input.LA(1) ) {
            case PAND:
                {
                alt8=1;
                }
                break;
            case SAND:
                {
                alt8=2;
                }
                break;
            case AND:
                {
                alt8=3;
                }
                break;
            case ID:
            case TRUE:
            case FALSE:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:129:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_metaPandSandAE1503);
                    pandterm86=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm86.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:130:4: sandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_metaPandSandAE1508);
                    sandterm87=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandterm87.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:131:4: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_metaPandSandAE1513);
                    andterm88=andterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andterm88.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:132:4: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_metaPandSandAE1518);
                    ae89=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae89.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, metaPandSandAE_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "metaPandSandAE"

    public static class orterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:1: orterm : ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) );
    public final tftacrulesfull.orterm_return orterm() throws RecognitionException {
        tftacrulesfull.orterm_return retval = new tftacrulesfull.orterm_return();
        retval.start = input.LT(1);
        int orterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR90=null;
        Object TRUE92=null;
        Object OR93=null;
        Object TRUE94=null;
        Object wildcard95=null;
        Object OR96=null;
        Object FALSE97=null;
        Object OR98=null;
        Object FALSE99=null;
        Object OR100=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.ae_return ae91 = null;

        tftacrulesfull.tt_return tt101 = null;

        tftacrulesfull.tt_return tt102 = null;


        Object OR90_tree=null;
        Object TRUE92_tree=null;
        Object OR93_tree=null;
        Object TRUE94_tree=null;
        Object wildcard95_tree=null;
        Object OR96_tree=null;
        Object FALSE97_tree=null;
        Object OR98_tree=null;
        Object FALSE99_tree=null;
        Object OR100_tree=null;
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:8: ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OR) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred40_tftacrulesfull()) ) {
                    alt9=1;
                }
                else if ( (synpred41_tftacrulesfull()) ) {
                    alt9=2;
                }
                else if ( (synpred42_tftacrulesfull()) ) {
                    alt9=3;
                }
                else if ( (synpred43_tftacrulesfull()) ) {
                    alt9=4;
                }
                else if ( (true) ) {
                    alt9=5;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:10: ^( OR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR90=(Object)match(input,OR,FOLLOW_OR_in_orterm1530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR90);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1532);
                    ae91=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae91.getTree());
                    _last = (Object)input.LT(1);
                    TRUE92=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE92);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:137:4: ^( OR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR93=(Object)match(input,OR,FOLLOW_OR_in_orterm1549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR93);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE94=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE94);

                    wildcard95=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:4: ^( OR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR96=(Object)match(input,OR,FOLLOW_OR_in_orterm1567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR96);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE97=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE97);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1573);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:141:4: ^( OR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR98=(Object)match(input,OR,FOLLOW_OR_in_orterm1588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR98);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1592);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE99=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE99);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a
                    // token labels: 
                    // rule labels: retval, a
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:143:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR100=(Object)match(input,OR,FOLLOW_OR_in_orterm1609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR100_tree = (Object)adaptor.dupNode(OR100);

                    root_1 = (Object)adaptor.becomeRoot(OR100_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1611);
                    tt101=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt101.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1613);
                    tt102=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt102.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, orterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orterm"

    public static class xorterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xorterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:1: xorterm : ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) );
    public final tftacrulesfull.xorterm_return xorterm() throws RecognitionException {
        tftacrulesfull.xorterm_return retval = new tftacrulesfull.xorterm_return();
        retval.start = input.LT(1);
        int xorterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR103=null;
        Object TRUE105=null;
        Object XOR106=null;
        Object TRUE107=null;
        Object wildcard108=null;
        Object XOR109=null;
        Object FALSE110=null;
        Object XOR111=null;
        Object FALSE112=null;
        Object XOR113=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.ae_return ae104 = null;

        tftacrulesfull.tt_return tt114 = null;

        tftacrulesfull.tt_return tt115 = null;


        Object XOR103_tree=null;
        Object TRUE105_tree=null;
        Object XOR106_tree=null;
        Object TRUE107_tree=null;
        Object wildcard108_tree=null;
        Object XOR109_tree=null;
        Object FALSE110_tree=null;
        Object XOR111_tree=null;
        Object FALSE112_tree=null;
        Object XOR113_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:9: ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==XOR) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred44_tftacrulesfull()) ) {
                    alt10=1;
                }
                else if ( (synpred45_tftacrulesfull()) ) {
                    alt10=2;
                }
                else if ( (synpred46_tftacrulesfull()) ) {
                    alt10=3;
                }
                else if ( (synpred47_tftacrulesfull()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:11: ^( XOR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR103=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR103);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1628);
                    ae104=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae104.getTree());
                    _last = (Object)input.LT(1);
                    TRUE105=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE105);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ^( XOR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR106=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR106);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE107=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE107);

                    wildcard108=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ^( XOR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR109=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR109);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE110=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE110);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1669);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( XOR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR111=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR111);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1688);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE112=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE112);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a
                    // token labels: 
                    // rule labels: retval, a
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:154:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR113=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR113_tree = (Object)adaptor.dupNode(XOR113);

                    root_1 = (Object)adaptor.becomeRoot(XOR113_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1707);
                    tt114=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt114.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1709);
                    tt115=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt115.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, xorterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "xorterm"

    public static class pandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:157:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );
    public final tftacrulesfull.pandterm_return pandterm() throws RecognitionException {
        tftacrulesfull.pandterm_return retval = new tftacrulesfull.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND116=null;
        Object FALSE118=null;
        Object PAND119=null;
        Object FALSE120=null;
        Object wildcard121=null;
        Object PAND122=null;
        Object TRUE124=null;
        Object PAND125=null;
        Object TRUE126=null;
        Object PAND127=null;
        Object XOR128=null;
        Object PAND129=null;
        Object XOR130=null;
        Object PAND131=null;
        Object OR132=null;
        Object PAND133=null;
        Object OR134=null;
        Object PAND135=null;
        Object PAND136=null;
        Object PAND137=null;
        Object AND138=null;
        Object PAND139=null;
        Object AND140=null;
        Object PAND141=null;
        tftacrulesfull.ae_return a = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notterm_return b = null;

        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.ae_return ae117 = null;

        tftacrulesfull.ae_return ae123 = null;

        tftacrulesfull.tt_return tt142 = null;

        tftacrulesfull.tt_return tt143 = null;


        Object PAND116_tree=null;
        Object FALSE118_tree=null;
        Object PAND119_tree=null;
        Object FALSE120_tree=null;
        Object wildcard121_tree=null;
        Object PAND122_tree=null;
        Object TRUE124_tree=null;
        Object PAND125_tree=null;
        Object TRUE126_tree=null;
        Object PAND127_tree=null;
        Object XOR128_tree=null;
        Object PAND129_tree=null;
        Object XOR130_tree=null;
        Object PAND131_tree=null;
        Object OR132_tree=null;
        Object PAND133_tree=null;
        Object OR134_tree=null;
        Object PAND135_tree=null;
        Object PAND136_tree=null;
        Object PAND137_tree=null;
        Object AND138_tree=null;
        Object PAND139_tree=null;
        Object AND140_tree=null;
        Object PAND141_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:157:9: ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) )
            int alt11=12;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:157:11: ^( PAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND116=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND116);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1723);
                    ae117=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae117.getTree());
                    _last = (Object)input.LT(1);
                    FALSE118=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE118);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:159:4: ^( PAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND119=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND119);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE120=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE120);

                    wildcard121=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:4: ^( PAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND122=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND122);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1760);
                    ae123=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae123.getTree());
                    _last = (Object)input.LT(1);
                    TRUE124=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE124);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:163:4: ^( PAND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND125=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND125);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE126=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE126);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1783);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:165:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND127=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND127);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR128=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm1801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR128);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1805);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1809);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1814);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, z, x, PAND, XOR, y, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:4: -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:7: ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:13: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:166:27: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND129=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1851); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND129);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1855);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR130=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm1858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR130);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1862);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1866);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, z, PAND, PAND, XOR, z, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:4: -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:7: ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:13: ^( PAND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:168:27: ^( PAND $z $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND131=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND131);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR132=(Object)match(input,OR,FOLLOW_OR_in_pandterm1908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR132);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1912);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1916);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1921);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, y, z, x, PAND, z, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:4: -> ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:7: ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:12: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:170:26: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND133=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND133);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1962);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR134=(Object)match(input,OR,FOLLOW_OR_in_pandterm1965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR134);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1969);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1973);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, x, x, y, y, x, z, PAND, z, y, z, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:13: ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:19: ^( AND ^( NOT $x) ^( PAND $z $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:25: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:35: ^( PAND $z $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:50: ^( AND ^( NOT $y) ^( PAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:56: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:66: ^( PAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:85: ^( PAND $z ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:172:95: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND135=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND135);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2061);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND136=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND136);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2068);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2072);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, y, z, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:4: -> ^( PAND ^( AND $x $z) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:7: ^( PAND ^( AND $x $z) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:174:14: ^( AND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND137=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND137);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2106);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND138=(Object)match(input,AND,FOLLOW_AND_in_pandterm2109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND138);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2113);
                    b=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2117);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, b, PAND, z, x
                    // token labels: 
                    // rule labels: retval, b, z, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"token b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:4: -> ^( AND $b ^( PAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:7: ^( AND $b ^( PAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:176:16: ^( PAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND139=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND139);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND140=(Object)match(input,AND,FOLLOW_AND_in_pandterm2150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND140);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2154);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_pandterm2158);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2163);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: m1, PAND, m1, n1, z, PAND, AND, PAND, n1, n1, z, PAND, m1, z
                    // token labels: 
                    // rule labels: n1, retval, m1, z
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"token n1",n1!=null?n1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"token m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:4: -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:7: ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:13: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:19: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:26: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:37: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:53: ^( AND $n1 ^( PAND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:63: ^( PAND $m1 $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:178:99: ^( NOT $n1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:179:4: ^( PAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND141=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND141_tree = (Object)adaptor.dupNode(PAND141);

                    root_1 = (Object)adaptor.becomeRoot(PAND141_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2245);
                    tt142=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt142.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2247);
                    tt143=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt143.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, pandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandterm"

    public static class sandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );
    public final tftacrulesfull.sandterm_return sandterm() throws RecognitionException {
        tftacrulesfull.sandterm_return retval = new tftacrulesfull.sandterm_return();
        retval.start = input.LT(1);
        int sandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND144=null;
        Object FALSE146=null;
        Object SAND147=null;
        Object FALSE148=null;
        Object wildcard149=null;
        Object SAND150=null;
        Object TRUE151=null;
        Object TRUE152=null;
        Object SAND153=null;
        Object TRUE155=null;
        Object SAND156=null;
        Object TRUE157=null;
        Object wildcard158=null;
        Object SAND159=null;
        Object XOR160=null;
        Object SAND161=null;
        Object XOR162=null;
        Object SAND163=null;
        Object OR164=null;
        Object SAND165=null;
        Object OR166=null;
        Object SAND167=null;
        Object PAND168=null;
        Object SAND169=null;
        Object PAND170=null;
        Object SAND171=null;
        Object AND172=null;
        Object SAND173=null;
        Object AND174=null;
        Object SAND175=null;
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.notterm_return a = null;

        tftacrulesfull.ae_return ae145 = null;

        tftacrulesfull.ae_return ae154 = null;

        tftacrulesfull.tt_return tt176 = null;

        tftacrulesfull.tt_return tt177 = null;


        Object SAND144_tree=null;
        Object FALSE146_tree=null;
        Object SAND147_tree=null;
        Object FALSE148_tree=null;
        Object wildcard149_tree=null;
        Object SAND150_tree=null;
        Object TRUE151_tree=null;
        Object TRUE152_tree=null;
        Object SAND153_tree=null;
        Object TRUE155_tree=null;
        Object SAND156_tree=null;
        Object TRUE157_tree=null;
        Object wildcard158_tree=null;
        Object SAND159_tree=null;
        Object XOR160_tree=null;
        Object SAND161_tree=null;
        Object XOR162_tree=null;
        Object SAND163_tree=null;
        Object OR164_tree=null;
        Object SAND165_tree=null;
        Object OR166_tree=null;
        Object SAND167_tree=null;
        Object PAND168_tree=null;
        Object SAND169_tree=null;
        Object PAND170_tree=null;
        Object SAND171_tree=null;
        Object AND172_tree=null;
        Object SAND173_tree=null;
        Object AND174_tree=null;
        Object SAND175_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:9: ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) )
            int alt12=14;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:11: ^( SAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND144=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND144);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2261);
                    ae145=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae145.getTree());
                    _last = (Object)input.LT(1);
                    FALSE146=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE146);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:4: ^( SAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND147=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND147);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE148=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE148);

                    wildcard149=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:4: ^( SAND TRUE TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND150=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND150);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE151=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE151);

                    _last = (Object)input.LT(1);
                    TRUE152=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE152);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:4: ^( SAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND153=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND153);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2316);
                    ae154=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae154.getTree());
                    _last = (Object)input.LT(1);
                    TRUE155=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE155);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ^( SAND TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND156=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND156);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE157=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE157);

                    wildcard158=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:4: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:192:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND159=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND159);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR160=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR160);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2358);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2362);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2367);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, SAND, XOR, SAND, x, z, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:193:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND161=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND161);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2408);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR162=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR162);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2415);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2419);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, XOR, z, SAND, SAND, x, z
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:195:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:195:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:195:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND163=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND163);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2461);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR164=(Object)match(input,OR,FOLLOW_OR_in_sandterm2464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR164);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2468);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2472);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, z, y, x, SAND, y, SAND, SAND, x, SAND, z, y
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:51: ^( AND ^( NOT $y) ^( SAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:58: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:68: ^( SAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:86: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:197:96: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:198:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND165=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND165);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR166=(Object)match(input,OR,FOLLOW_OR_in_sandterm2560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR166);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2564);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2568);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2573);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, SAND, x, SAND, x, z, SAND, y, z, z, y, SAND, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:4: -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:51: ^( AND ^( NOT $y) ^( SAND $x $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:58: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:68: ^( SAND $x $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:86: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:199:96: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND167=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND167);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND168=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND168);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2664);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2668);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2673);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, z, y, SAND, PAND
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:201:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND169=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND169);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2706);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND170=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND170);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2713);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2717);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, PAND, z, SAND, x
                    // token labels: 
                    // rule labels: retval, z, y, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:203:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND171=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND171);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2751);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND172=(Object)match(input,AND,FOLLOW_AND_in_sandterm2754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND172);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2758);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2762);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, x, SAND, AND, z
                    // token labels: 
                    // rule labels: retval, a, z, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:205:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND173=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND173);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND174=(Object)match(input,AND,FOLLOW_AND_in_sandterm2795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND174);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2799);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2803);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2808);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: a, z, SAND, x, AND
                    // token labels: 
                    // rule labels: retval, a, z, x
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:207:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:208:4: ^( SAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND175=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND175_tree = (Object)adaptor.dupNode(SAND175);

                    root_1 = (Object)adaptor.becomeRoot(SAND175_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2840);
                    tt176=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt176.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2842);
                    tt177=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt177.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 12, sandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sandterm"

    public static class ae_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:1: ae : ( ID | TRUE | FALSE );
    public final tftacrulesfull.ae_return ae() throws RecognitionException {
        tftacrulesfull.ae_return retval = new tftacrulesfull.ae_return();
        retval.start = input.LT(1);
        int ae_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set178=null;

        Object set178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:211:6: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set178=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set178_tree = (Object)adaptor.dupNode(set178);

                adaptor.addChild(root_0, set178_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 13, ae_StartIndex); }
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:4: ( ^( NOT ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:65:4: ^( NOT ^( PAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred12_tftacrulesfull288); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred12_tftacrulesfull291); if (state.failed) return ;

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

    // $ANTLR start synpred13_tftacrulesfull
    public final void synpred13_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:67:4: ( ^( NOT ^( SAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:67:4: ^( NOT ^( SAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred13_tftacrulesfull397); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred13_tftacrulesfull400); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred13_tftacrulesfull404);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred13_tftacrulesfull408);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_tftacrulesfull

    // $ANTLR start synpred17_tftacrulesfull
    public final void synpred17_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:11: ( ^( AND . FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:75:11: ^( AND . FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred17_tftacrulesfull555); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred17_tftacrulesfull559); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacrulesfull

    // $ANTLR start synpred18_tftacrulesfull
    public final void synpred18_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:77:4: ( ^( AND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:77:4: ^( AND FALSE . )
        {
        match(input,AND,FOLLOW_AND_in_synpred18_tftacrulesfull574); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred18_tftacrulesfull576); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacrulesfull

    // $ANTLR start synpred19_tftacrulesfull
    public final void synpred19_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:79:4: ( ^( AND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:79:4: ^( AND TRUE a= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred19_tftacrulesfull592); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred19_tftacrulesfull594); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred19_tftacrulesfull598);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_tftacrulesfull

    // $ANTLR start synpred20_tftacrulesfull
    public final void synpred20_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:81:4: ( ^( AND a= ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:81:4: ^( AND a= ae TRUE )
        {
        match(input,AND,FOLLOW_AND_in_synpred20_tftacrulesfull613); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred20_tftacrulesfull617);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred20_tftacrulesfull619); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_tftacrulesfull

    // $ANTLR start synpred21_tftacrulesfull
    public final void synpred21_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: ( ^( AND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:83:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred21_tftacrulesfull634); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred21_tftacrulesfull637); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull641);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull645);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrulesfull650);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_tftacrulesfull

    // $ANTLR start synpred22_tftacrulesfull
    public final void synpred22_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ( ^( AND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:85:4: ^( AND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred22_tftacrulesfull689); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred22_tftacrulesfull692); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull696);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull700);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrulesfull705);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:87:4: ( ^( AND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:87:4: ^( AND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred23_tftacrulesfull744); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull748);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred23_tftacrulesfull751); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull755);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrulesfull759);
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
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:4: ( ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:89:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrulesfull798); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrulesfull801); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred24_tftacrulesfull805);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred24_tftacrulesfull809);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred24_tftacrulesfull814);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:92:4: ( ^( AND x= tt y= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:92:4: ^( AND x= tt y= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred25_tftacrulesfull898); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrulesfull902);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrulesfull906);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_tftacrulesfull

    // $ANTLR start synpred27_tftacrulesfull
    public final void synpred27_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:102:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:102:4: ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred27_tftacrulesfull1002); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred27_tftacrulesfull1005); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred27_tftacrulesfull1009);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred27_tftacrulesfull1013);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred27_tftacrulesfull1018);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_tftacrulesfull

    // $ANTLR start synpred28_tftacrulesfull
    public final void synpred28_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:104:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:104:4: ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred28_tftacrulesfull1054); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred28_tftacrulesfull1057); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred28_tftacrulesfull1061);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred28_tftacrulesfull1065);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred28_tftacrulesfull1070);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_tftacrulesfull

    // $ANTLR start synpred29_tftacrulesfull
    public final void synpred29_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:106:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:106:4: ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred29_tftacrulesfull1106); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred29_tftacrulesfull1109); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred29_tftacrulesfull1113);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred29_tftacrulesfull1117);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred29_tftacrulesfull1122);
        z2=sandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_tftacrulesfull

    // $ANTLR start synpred30_tftacrulesfull
    public final void synpred30_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:108:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:108:4: ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred30_tftacrulesfull1158); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred30_tftacrulesfull1161); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred30_tftacrulesfull1165);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred30_tftacrulesfull1169);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred30_tftacrulesfull1174);
        z2=sandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_tftacrulesfull

    // $ANTLR start synpred31_tftacrulesfull
    public final void synpred31_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:110:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:110:4: ^( AND ^( OR x= notterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred31_tftacrulesfull1210); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred31_tftacrulesfull1213); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred31_tftacrulesfull1217);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred31_tftacrulesfull1221);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred31_tftacrulesfull1226);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacrulesfull

    // $ANTLR start synpred32_tftacrulesfull
    public final void synpred32_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return x = null;

        tftacrulesfull.negatedterm_return y = null;

        tftacrulesfull.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:112:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:112:4: ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred32_tftacrulesfull1262); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred32_tftacrulesfull1265); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred32_tftacrulesfull1269);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred32_tftacrulesfull1273);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred32_tftacrulesfull1278);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacrulesfull

    // $ANTLR start synpred33_tftacrulesfull
    public final void synpred33_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.tt_return t1 = null;

        tftacrulesfull.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:114:4: ( ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:114:4: ^( AND n1= notterm ^( OR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred33_tftacrulesfull1314); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred33_tftacrulesfull1318);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred33_tftacrulesfull1321); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred33_tftacrulesfull1325);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred33_tftacrulesfull1329);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacrulesfull

    // $ANTLR start synpred34_tftacrulesfull
    public final void synpred34_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.tt_return t1 = null;

        tftacrulesfull.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:4: ( ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:116:4: ^( AND n1= notterm ^( XOR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred34_tftacrulesfull1369); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred34_tftacrulesfull1373);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred34_tftacrulesfull1376); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrulesfull1380);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrulesfull1384);
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
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.notterm_return n2 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:4: ( ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:118:4: ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred35_tftacrulesfull1423); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred35_tftacrulesfull1427);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred35_tftacrulesfull1430); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred35_tftacrulesfull1434);
        n2=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred35_tftacrulesfull1438);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_tftacrulesfull

    // $ANTLR start synpred36_tftacrulesfull
    public final void synpred36_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:124:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred36_tftacrulesfull1486);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_tftacrulesfull

    // $ANTLR start synpred40_tftacrulesfull
    public final void synpred40_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:10: ( ^( OR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:135:10: ^( OR ae TRUE )
        {
        match(input,OR,FOLLOW_OR_in_synpred40_tftacrulesfull1530); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred40_tftacrulesfull1532);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred40_tftacrulesfull1534); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_tftacrulesfull

    // $ANTLR start synpred41_tftacrulesfull
    public final void synpred41_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:137:4: ( ^( OR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:137:4: ^( OR TRUE . )
        {
        match(input,OR,FOLLOW_OR_in_synpred41_tftacrulesfull1549); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred41_tftacrulesfull1551); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_tftacrulesfull

    // $ANTLR start synpred42_tftacrulesfull
    public final void synpred42_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:4: ( ^( OR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:139:4: ^( OR FALSE a= ae )
        {
        match(input,OR,FOLLOW_OR_in_synpred42_tftacrulesfull1567); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred42_tftacrulesfull1569); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred42_tftacrulesfull1573);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_tftacrulesfull

    // $ANTLR start synpred43_tftacrulesfull
    public final void synpred43_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:141:4: ( ^( OR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:141:4: ^( OR a= ae FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred43_tftacrulesfull1588); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred43_tftacrulesfull1592);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred43_tftacrulesfull1594); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_tftacrulesfull

    // $ANTLR start synpred44_tftacrulesfull
    public final void synpred44_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:11: ( ^( XOR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:146:11: ^( XOR ae TRUE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred44_tftacrulesfull1626); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred44_tftacrulesfull1628);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred44_tftacrulesfull1630); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_tftacrulesfull

    // $ANTLR start synpred45_tftacrulesfull
    public final void synpred45_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ( ^( XOR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:148:4: ^( XOR TRUE . )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred45_tftacrulesfull1645); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred45_tftacrulesfull1647); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_tftacrulesfull

    // $ANTLR start synpred46_tftacrulesfull
    public final void synpred46_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ( ^( XOR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:150:4: ^( XOR FALSE a= ae )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred46_tftacrulesfull1663); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred46_tftacrulesfull1665); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred46_tftacrulesfull1669);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_tftacrulesfull

    // $ANTLR start synpred47_tftacrulesfull
    public final void synpred47_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ( ^( XOR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:152:4: ^( XOR a= ae FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred47_tftacrulesfull1684); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred47_tftacrulesfull1688);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred47_tftacrulesfull1690); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_tftacrulesfull

    // $ANTLR start synpred48_tftacrulesfull
    public final void synpred48_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:157:11: ( ^( PAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:157:11: ^( PAND ae FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred48_tftacrulesfull1721); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred48_tftacrulesfull1723);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred48_tftacrulesfull1725); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacrulesfull

    // $ANTLR start synpred49_tftacrulesfull
    public final void synpred49_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:159:4: ( ^( PAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:159:4: ^( PAND FALSE . )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred49_tftacrulesfull1740); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred49_tftacrulesfull1742); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_tftacrulesfull

    // $ANTLR start synpred50_tftacrulesfull
    public final void synpred50_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:4: ( ^( PAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:161:4: ^( PAND ae TRUE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred50_tftacrulesfull1758); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred50_tftacrulesfull1760);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrulesfull1762); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_tftacrulesfull

    // $ANTLR start synpred51_tftacrulesfull
    public final void synpred51_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:163:4: ( ^( PAND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:163:4: ^( PAND TRUE a= ae )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred51_tftacrulesfull1777); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred51_tftacrulesfull1779); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred51_tftacrulesfull1783);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_tftacrulesfull

    // $ANTLR start synpred52_tftacrulesfull
    public final void synpred52_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:165:4: ( ^( PAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:165:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred52_tftacrulesfull1798); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred52_tftacrulesfull1801); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred52_tftacrulesfull1805);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred52_tftacrulesfull1809);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred52_tftacrulesfull1814);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_tftacrulesfull

    // $ANTLR start synpred53_tftacrulesfull
    public final void synpred53_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:4: ( ^( PAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:167:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred53_tftacrulesfull1851); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1855);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred53_tftacrulesfull1858); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1862);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrulesfull1866);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_tftacrulesfull

    // $ANTLR start synpred54_tftacrulesfull
    public final void synpred54_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:4: ( ^( PAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:169:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred54_tftacrulesfull1905); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred54_tftacrulesfull1908); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1912);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1916);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrulesfull1921);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_tftacrulesfull

    // $ANTLR start synpred55_tftacrulesfull
    public final void synpred55_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:4: ( ^( PAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:171:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred55_tftacrulesfull1958); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1962);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred55_tftacrulesfull1965); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1969);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrulesfull1973);
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
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:4: ( ^( PAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:173:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred56_tftacrulesfull2057); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2061);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred56_tftacrulesfull2064); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2068);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrulesfull2072);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_tftacrulesfull

    // $ANTLR start synpred57_tftacrulesfull
    public final void synpred57_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notterm_return b = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:4: ( ^( PAND x= tt ^( AND b= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:175:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrulesfull2102); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2106);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred57_tftacrulesfull2109); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred57_tftacrulesfull2113);
        b=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrulesfull2117);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_tftacrulesfull

    // $ANTLR start synpred58_tftacrulesfull
    public final void synpred58_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return n1 = null;

        tftacrulesfull.metaPandSandAE_return m1 = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:4: ( ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:177:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred58_tftacrulesfull2147); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred58_tftacrulesfull2150); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred58_tftacrulesfull2154);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred58_tftacrulesfull2158);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred58_tftacrulesfull2163);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_tftacrulesfull

    // $ANTLR start synpred59_tftacrulesfull
    public final void synpred59_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:11: ( ^( SAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:182:11: ^( SAND ae FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred59_tftacrulesfull2259); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred59_tftacrulesfull2261);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred59_tftacrulesfull2263); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacrulesfull

    // $ANTLR start synpred60_tftacrulesfull
    public final void synpred60_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:4: ( ^( SAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:184:4: ^( SAND FALSE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred60_tftacrulesfull2278); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred60_tftacrulesfull2280); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_tftacrulesfull

    // $ANTLR start synpred61_tftacrulesfull
    public final void synpred61_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:4: ( ^( SAND TRUE TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:186:4: ^( SAND TRUE TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred61_tftacrulesfull2296); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred61_tftacrulesfull2298); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred61_tftacrulesfull2300); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_tftacrulesfull

    // $ANTLR start synpred62_tftacrulesfull
    public final void synpred62_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:4: ( ^( SAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:188:4: ^( SAND ae TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred62_tftacrulesfull2314); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred62_tftacrulesfull2316);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred62_tftacrulesfull2318); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_tftacrulesfull

    // $ANTLR start synpred63_tftacrulesfull
    public final void synpred63_tftacrulesfull_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ( ^( SAND TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:190:4: ^( SAND TRUE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred63_tftacrulesfull2333); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred63_tftacrulesfull2335); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacrulesfull

    // $ANTLR start synpred64_tftacrulesfull
    public final void synpred64_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:192:4: ( ^( SAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:192:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred64_tftacrulesfull2351); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred64_tftacrulesfull2354); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2358);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2362);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrulesfull2367);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_tftacrulesfull

    // $ANTLR start synpred65_tftacrulesfull
    public final void synpred65_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:4: ( ^( SAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:194:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred65_tftacrulesfull2404); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2408);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred65_tftacrulesfull2411); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2415);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrulesfull2419);
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
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:4: ( ^( SAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:196:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred66_tftacrulesfull2457); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2461);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred66_tftacrulesfull2464); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2468);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrulesfull2472);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacrulesfull

    // $ANTLR start synpred67_tftacrulesfull
    public final void synpred67_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:198:4: ( ^( SAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:198:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred67_tftacrulesfull2557); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred67_tftacrulesfull2560); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrulesfull2564);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrulesfull2568);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrulesfull2573);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_tftacrulesfull

    // $ANTLR start synpred68_tftacrulesfull
    public final void synpred68_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:4: ( ^( SAND ^( PAND x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:200:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred68_tftacrulesfull2657); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred68_tftacrulesfull2660); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrulesfull2664);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrulesfull2668);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrulesfull2673);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_tftacrulesfull

    // $ANTLR start synpred69_tftacrulesfull
    public final void synpred69_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;

        tftacrulesfull.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:4: ( ^( SAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:202:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred69_tftacrulesfull2702); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrulesfull2706);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred69_tftacrulesfull2709); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrulesfull2713);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrulesfull2717);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_tftacrulesfull

    // $ANTLR start synpred70_tftacrulesfull
    public final void synpred70_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.tt_return x = null;

        tftacrulesfull.notterm_return a = null;

        tftacrulesfull.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:4: ( ^( SAND x= tt ^( AND a= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:204:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred70_tftacrulesfull2747); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrulesfull2751);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred70_tftacrulesfull2754); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred70_tftacrulesfull2758);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrulesfull2762);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacrulesfull

    // $ANTLR start synpred71_tftacrulesfull
    public final void synpred71_tftacrulesfull_fragment() throws RecognitionException {   
        tftacrulesfull.notterm_return a = null;

        tftacrulesfull.tt_return z = null;

        tftacrulesfull.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:4: ( ^( SAND ^( AND a= notterm z= tt ) x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrulesfull.g:206:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred71_tftacrulesfull2792); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred71_tftacrulesfull2795); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred71_tftacrulesfull2799);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred71_tftacrulesfull2803);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred71_tftacrulesfull2808);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_tftacrulesfull

    // Delegated rules

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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
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
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\4\1\0\11\uffff";
    static final String DFA3_maxS =
        "\1\14\1\0\11\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\6\1\7\1\10\1\1\1\2\1\3\1\4\1\5\1\11";
    static final String DFA3_specialS =
        "\1\uffff\1\0\11\uffff}>";
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
            return "59:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );";
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

                        else if ( (synpred13_tftacrulesfull()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
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
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\6\1\0\12\uffff";
    static final String DFA4_maxS =
        "\1\6\1\0\12\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA4_specialS =
        "\1\uffff\1\0\12\uffff}>";
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
            return "75:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) );";
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
                        if ( (synpred17_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred18_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred19_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred20_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred21_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred22_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred23_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred24_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred25_tftacrulesfull()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
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
    static final String DFA6_eotS =
        "\14\uffff";
    static final String DFA6_eofS =
        "\14\uffff";
    static final String DFA6_minS =
        "\1\6\1\0\12\uffff";
    static final String DFA6_maxS =
        "\1\6\1\0\12\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA6_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA6_transitionS = {
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
            return "101:1: negandterm : ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred28_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred29_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred30_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred31_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred32_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred33_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred34_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred35_tftacrulesfull()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index6_1);
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
    static final String DFA11_eotS =
        "\16\uffff";
    static final String DFA11_eofS =
        "\16\uffff";
    static final String DFA11_minS =
        "\1\7\1\0\14\uffff";
    static final String DFA11_maxS =
        "\1\7\1\0\14\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA11_specialS =
        "\1\uffff\1\0\14\uffff}>";
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
            return "157:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );";
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

                        else if ( (true) ) {s = 13;}

                         
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
    static final String DFA12_eotS =
        "\20\uffff";
    static final String DFA12_eofS =
        "\20\uffff";
    static final String DFA12_minS =
        "\1\10\1\0\16\uffff";
    static final String DFA12_maxS =
        "\1\10\1\0\16\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA12_specialS =
        "\1\uffff\1\0\16\uffff}>";
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
            return "182:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );";
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
                        if ( (synpred59_tftacrulesfull()) ) {s = 2;}

                        else if ( (synpred60_tftacrulesfull()) ) {s = 3;}

                        else if ( (synpred61_tftacrulesfull()) ) {s = 4;}

                        else if ( (synpred62_tftacrulesfull()) ) {s = 5;}

                        else if ( (synpred63_tftacrulesfull()) ) {s = 6;}

                        else if ( (synpred64_tftacrulesfull()) ) {s = 7;}

                        else if ( (synpred65_tftacrulesfull()) ) {s = 8;}

                        else if ( (synpred66_tftacrulesfull()) ) {s = 9;}

                        else if ( (synpred67_tftacrulesfull()) ) {s = 10;}

                        else if ( (synpred68_tftacrulesfull()) ) {s = 11;}

                        else if ( (synpred69_tftacrulesfull()) ) {s = 12;}

                        else if ( (synpred70_tftacrulesfull()) ) {s = 13;}

                        else if ( (synpred71_tftacrulesfull()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
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
    public static final BitSet FOLLOW_PAND_in_notterm291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm295 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_notterm400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm404 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_notterm507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm509 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_notterm518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm520 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_notterm529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm531 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm540 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm576 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_AND_in_andterm592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_andterm594 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_andterm598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_andterm617 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_andterm619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_andterm637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm641 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_andterm692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm696 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_andterm751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm755 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andterm801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_andterm805 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_andterm809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm902 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm959 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_pureand973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_pureand975 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_pureand977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_pureand984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureand_in_pureand986 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_pureand988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1009 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1061 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1113 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1165 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1217 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1269 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negandterm1321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1325 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negandterm1376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1380 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1427 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_negandterm1430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1434 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1470 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_negatedterm1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notterm_in_negatedterm1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_metaPandSandAE1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandterm_in_metaPandSandAE1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_metaPandSandAE1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_metaPandSandAE1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_orterm1530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1532 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_orterm1534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orterm1551 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_OR_in_orterm1567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orterm1569 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_orterm1573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1592 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orterm1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orterm1611 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orterm1613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1647 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_XOR_in_xorterm1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1665 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_xorterm1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorterm1707 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorterm1709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1742 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_PAND_in_pandterm1758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1760 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1779 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_pandterm1783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pandterm1801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1805 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm1814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_pandterm1858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1862 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pandterm1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1912 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm1921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_pandterm1965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1969 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2061 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_pandterm2064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2068 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_pandterm2109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2113 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandterm2150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2154 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_pandterm2158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm2163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2245 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2261 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2280 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2298 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2335 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_sandterm2354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2358 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_sandterm2411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2415 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_sandterm2464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2468 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_sandterm2560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2564 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_sandterm2660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2664 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2706 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_sandterm2709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2713 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2751 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_sandterm2754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2758 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_sandterm2795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2799 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2838 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2840 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2842 = new BitSet(new long[]{0x0000000000000008L});
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
    public static final BitSet FOLLOW_PAND_in_synpred12_tftacrulesfull291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrulesfull295 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrulesfull299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred13_tftacrulesfull397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred13_tftacrulesfull400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred13_tftacrulesfull404 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred13_tftacrulesfull408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred17_tftacrulesfull555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred17_tftacrulesfull559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred18_tftacrulesfull574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred18_tftacrulesfull576 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_AND_in_synpred19_tftacrulesfull592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred19_tftacrulesfull594 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred19_tftacrulesfull598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred20_tftacrulesfull613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred20_tftacrulesfull617 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred20_tftacrulesfull619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred21_tftacrulesfull634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred21_tftacrulesfull637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull641 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrulesfull650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred22_tftacrulesfull689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred22_tftacrulesfull692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull696 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrulesfull705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred23_tftacrulesfull744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrulesfull748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred23_tftacrulesfull751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrulesfull755 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrulesfull759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrulesfull798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrulesfull801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred24_tftacrulesfull805 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred24_tftacrulesfull809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred24_tftacrulesfull814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred25_tftacrulesfull898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrulesfull902 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrulesfull906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred27_tftacrulesfull1002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred27_tftacrulesfull1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred27_tftacrulesfull1009 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred27_tftacrulesfull1013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred27_tftacrulesfull1018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred28_tftacrulesfull1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred28_tftacrulesfull1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred28_tftacrulesfull1061 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred28_tftacrulesfull1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred28_tftacrulesfull1070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred29_tftacrulesfull1106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred29_tftacrulesfull1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred29_tftacrulesfull1113 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred29_tftacrulesfull1117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred29_tftacrulesfull1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred30_tftacrulesfull1158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred30_tftacrulesfull1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred30_tftacrulesfull1165 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred30_tftacrulesfull1169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred30_tftacrulesfull1174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred31_tftacrulesfull1210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred31_tftacrulesfull1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred31_tftacrulesfull1217 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred31_tftacrulesfull1221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred31_tftacrulesfull1226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred32_tftacrulesfull1262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred32_tftacrulesfull1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred32_tftacrulesfull1269 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred32_tftacrulesfull1273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred32_tftacrulesfull1278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred33_tftacrulesfull1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred33_tftacrulesfull1318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred33_tftacrulesfull1321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred33_tftacrulesfull1325 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred33_tftacrulesfull1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacrulesfull1369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred34_tftacrulesfull1373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred34_tftacrulesfull1376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrulesfull1380 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrulesfull1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred35_tftacrulesfull1423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred35_tftacrulesfull1427 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred35_tftacrulesfull1430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred35_tftacrulesfull1434 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred35_tftacrulesfull1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_synpred36_tftacrulesfull1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred40_tftacrulesfull1530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred40_tftacrulesfull1532 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred40_tftacrulesfull1534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred41_tftacrulesfull1549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred41_tftacrulesfull1551 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_OR_in_synpred42_tftacrulesfull1567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred42_tftacrulesfull1569 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred42_tftacrulesfull1573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred43_tftacrulesfull1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred43_tftacrulesfull1592 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred43_tftacrulesfull1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred44_tftacrulesfull1626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred44_tftacrulesfull1628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred44_tftacrulesfull1630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred45_tftacrulesfull1645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred45_tftacrulesfull1647 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_XOR_in_synpred46_tftacrulesfull1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred46_tftacrulesfull1665 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred46_tftacrulesfull1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred47_tftacrulesfull1684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred47_tftacrulesfull1688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred47_tftacrulesfull1690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred48_tftacrulesfull1721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred48_tftacrulesfull1723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred48_tftacrulesfull1725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred49_tftacrulesfull1740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred49_tftacrulesfull1742 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_PAND_in_synpred50_tftacrulesfull1758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred50_tftacrulesfull1760 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrulesfull1762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred51_tftacrulesfull1777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred51_tftacrulesfull1779 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred51_tftacrulesfull1783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred52_tftacrulesfull1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred52_tftacrulesfull1801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred52_tftacrulesfull1805 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred52_tftacrulesfull1809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred52_tftacrulesfull1814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred53_tftacrulesfull1851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred53_tftacrulesfull1858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1862 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrulesfull1866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred54_tftacrulesfull1905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred54_tftacrulesfull1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1912 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrulesfull1921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred55_tftacrulesfull1958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred55_tftacrulesfull1965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1969 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrulesfull1973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred56_tftacrulesfull2057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2061 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred56_tftacrulesfull2064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2068 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrulesfull2072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrulesfull2102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred57_tftacrulesfull2109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred57_tftacrulesfull2113 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrulesfull2117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred58_tftacrulesfull2147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred58_tftacrulesfull2150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred58_tftacrulesfull2154 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred58_tftacrulesfull2158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrulesfull2163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred59_tftacrulesfull2259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred59_tftacrulesfull2261 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred59_tftacrulesfull2263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred60_tftacrulesfull2278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred60_tftacrulesfull2280 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred61_tftacrulesfull2296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred61_tftacrulesfull2298 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred61_tftacrulesfull2300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred62_tftacrulesfull2314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred62_tftacrulesfull2316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred62_tftacrulesfull2318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred63_tftacrulesfull2333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred63_tftacrulesfull2335 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred64_tftacrulesfull2351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred64_tftacrulesfull2354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2358 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrulesfull2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred65_tftacrulesfull2404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred65_tftacrulesfull2411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2415 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrulesfull2419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred66_tftacrulesfull2457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred66_tftacrulesfull2464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2468 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrulesfull2472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred67_tftacrulesfull2557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred67_tftacrulesfull2560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrulesfull2564 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrulesfull2568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrulesfull2573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred68_tftacrulesfull2657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred68_tftacrulesfull2660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrulesfull2664 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrulesfull2668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrulesfull2673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred69_tftacrulesfull2702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrulesfull2706 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred69_tftacrulesfull2709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrulesfull2713 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrulesfull2717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred70_tftacrulesfull2747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrulesfull2751 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred70_tftacrulesfull2754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred70_tftacrulesfull2758 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrulesfull2762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred71_tftacrulesfull2792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred71_tftacrulesfull2795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred71_tftacrulesfull2799 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred71_tftacrulesfull2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred71_tftacrulesfull2808 = new BitSet(new long[]{0x0000000000000008L});

}