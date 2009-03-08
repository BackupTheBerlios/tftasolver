// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g 2009-03-08 15:27:01

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacrules extends TreeParser {
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


        public tftacrules(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacrules(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[87+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacrules.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();


    public static class tt_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tt"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:44:1: tt : ( ae | andterm | negandterm | orterm | pandterm | sandterm | xorterm | ^( NOT ^( NOT a1= tt ) ) -> $a1);
    public final tftacrules.tt_return tt() throws RecognitionException {
        tftacrules.tt_return retval = new tftacrules.tt_return();
        retval.start = input.LT(1);
        int tt_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT8=null;
        Object NOT9=null;
        tftacrules.tt_return a1 = null;

        tftacrules.ae_return ae1 = null;

        tftacrules.andterm_return andterm2 = null;

        tftacrules.negandterm_return negandterm3 = null;

        tftacrules.orterm_return orterm4 = null;

        tftacrules.pandterm_return pandterm5 = null;

        tftacrules.sandterm_return sandterm6 = null;

        tftacrules.xorterm_return xorterm7 = null;


        Object NOT8_tree=null;
        Object NOT9_tree=null;
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:44:5: ( ae | andterm | negandterm | orterm | pandterm | sandterm | xorterm | ^( NOT ^( NOT a1= tt ) ) -> $a1)
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:44:7: ae
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:45:4: andterm
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:46:4: negandterm
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:47:4: orterm
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:48:4: pandterm
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:4: sandterm
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:50:4: xorterm
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:51:4: ^( NOT ^( NOT a1= tt ) )
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:55:1: ce : ( ae | ^( SAND ce ce ) );
    public final tftacrules.ce_return ce() throws RecognitionException {
        tftacrules.ce_return retval = new tftacrules.ce_return();
        retval.start = input.LT(1);
        int ce_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND11=null;
        tftacrules.ae_return ae10 = null;

        tftacrules.ce_return ce12 = null;

        tftacrules.ce_return ce13 = null;


        Object SAND11_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:55:4: ( ae | ^( SAND ce ce ) )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:55:6: ae
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:4: ^( SAND ce ce )
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );
    public final tftacrules.notterm_return notterm() throws RecognitionException {
        tftacrules.notterm_return retval = new tftacrules.notterm_return();
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
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.notterm_return notterm25 = null;

        tftacrules.notterm_return notterm26 = null;

        tftacrules.notterm_return notterm28 = null;

        tftacrules.notterm_return notterm29 = null;

        tftacrules.notterm_return notterm31 = null;

        tftacrules.notterm_return notterm32 = null;

        tftacrules.tt_return tt34 = null;


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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:9: ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:11: ^( NOT ^( AND x= tt y= tt ) )
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
                    // elements: x, y, NOT, NOT
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:60:7: ^( OR ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:60:12: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:60:22: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:61:4: ^( NOT ^( OR x= tt y= tt ) )
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
                    // elements: NOT, NOT, x, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:62:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:62:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:62:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:63:4: ^( NOT ^( XOR x= tt y= tt ) )
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
                    // elements: NOT, NOT, x, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:64:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:64:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:64:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:65:4: ^( NOT ^( PAND x= tt y= tt ) )
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
                    // elements: y, x, y, NOT, x, PAND, NOT, NOT, x, y, x, NOT, y, x, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( SAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:13: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:19: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:25: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:58: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:64: ^( NOT $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:79: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:85: ^( NOT $y)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:100: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:66:115: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:67:4: ^( NOT ^( SAND x= tt y= tt ) )
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
                    // elements: NOT, y, x, y, x, NOT, x, NOT, y, y, y, x, NOT, x
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:7: ^( XOR ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) ) ^( PAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:13: ^( XOR ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) ) ^( PAND $y $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:19: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) ^( AND ^( NOT $y) $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:25: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:31: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:37: ^( NOT $x)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:47: ^( NOT $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_6);

                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:58: ^( AND ^( NOT $x) $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:64: ^( NOT $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:79: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:85: ^( NOT $y)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:100: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:68:115: ^( PAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:69:4: ^( OR notterm notterm )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:70:4: ^( XOR notterm notterm )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:71:4: ^( AND notterm notterm )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:72:4: ^( NOT tt )
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:75:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | pureand | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) );
    public final tftacrules.andterm_return andterm() throws RecognitionException {
        tftacrules.andterm_return retval = new tftacrules.andterm_return();
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
        Object AND54=null;
        Object AND55=null;
        tftacrules.ae_return a = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;

        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.pureand_return pureand53 = null;

        tftacrules.tt_return tt56 = null;

        tftacrules.tt_return tt57 = null;


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
        Object AND54_tree=null;
        Object AND55_tree=null;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:75:9: ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | pureand | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:75:11: ^( AND . FALSE )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:77:4: ^( AND FALSE . )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:79:4: ^( AND TRUE a= ae )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:81:4: ^( AND a= ae TRUE )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:83:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
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
                    // elements: XOR, z, y, x, AND, AND, z
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:84:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:84:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:84:26: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:4: ^( AND ^( OR x= tt y= tt ) z= tt )
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
                    // elements: y, z, x, z, OR, AND, AND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:86:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:86:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:86:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:4: ^( AND z= tt ^( OR x= tt y= tt ) )
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
                    // elements: z, AND, x, y, z, AND, OR
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:88:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:88:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:88:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:89:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
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
                    // elements: m1, z, m1, n1, z, z, m1, n1, AND, AND, n1
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:7: ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:13: ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:19: ^( AND $n1 ^( AND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:29: ^( AND $m1 $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:44: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:51: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:62: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:90:99: ^( NOT $n1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:91:4: pureand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pureand_in_andterm895);
                    pureand53=pureand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pureand53.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:4: ^( AND x= tt y= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND54=(Object)match(input,AND,FOLLOW_AND_in_andterm901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND54);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm905);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm909);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, y, x, x, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:7: ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:13: ^( XOR ^( PAND $y $x) ^( PAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:19: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:33: ^( PAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:48: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:94:4: ^( AND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND55=(Object)match(input,AND,FOLLOW_AND_in_andterm960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND55_tree = (Object)adaptor.dupNode(AND55);

                    root_1 = (Object)adaptor.becomeRoot(AND55_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm962);
                    tt56=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt56.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm964);
                    tt57=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt57.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:97:1: pureand : ( ^( AND ID ID ) | ^( AND pureand ID ) );
    public final tftacrules.pureand_return pureand() throws RecognitionException {
        tftacrules.pureand_return retval = new tftacrules.pureand_return();
        retval.start = input.LT(1);
        int pureand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND58=null;
        Object ID59=null;
        Object ID60=null;
        Object AND61=null;
        Object ID63=null;
        tftacrules.pureand_return pureand62 = null;


        Object AND58_tree=null;
        Object ID59_tree=null;
        Object ID60_tree=null;
        Object AND61_tree=null;
        Object ID63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:97:9: ( ^( AND ID ID ) | ^( AND pureand ID ) )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:97:11: ^( AND ID ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND58=(Object)match(input,AND,FOLLOW_AND_in_pureand976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND58_tree = (Object)adaptor.dupNode(AND58);

                    root_1 = (Object)adaptor.becomeRoot(AND58_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    ID59=(Object)match(input,ID,FOLLOW_ID_in_pureand978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID59_tree = (Object)adaptor.dupNode(ID59);

                    adaptor.addChild(root_1, ID59_tree);
                    }
                    _last = (Object)input.LT(1);
                    ID60=(Object)match(input,ID,FOLLOW_ID_in_pureand980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID60_tree = (Object)adaptor.dupNode(ID60);

                    adaptor.addChild(root_1, ID60_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:98:4: ^( AND pureand ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND61=(Object)match(input,AND,FOLLOW_AND_in_pureand987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND61_tree = (Object)adaptor.dupNode(AND61);

                    root_1 = (Object)adaptor.becomeRoot(AND61_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pureand_in_pureand989);
                    pureand62=pureand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, pureand62.getTree());
                    _last = (Object)input.LT(1);
                    ID63=(Object)match(input,ID,FOLLOW_ID_in_pureand991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID63_tree = (Object)adaptor.dupNode(ID63);

                    adaptor.addChild(root_1, ID63_tree);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:101:1: negandterm : ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) );
    public final tftacrules.negandterm_return negandterm() throws RecognitionException {
        tftacrules.negandterm_return retval = new tftacrules.negandterm_return();
        retval.start = input.LT(1);
        int negandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND64=null;
        Object OR65=null;
        Object AND66=null;
        Object XOR67=null;
        Object AND68=null;
        Object OR69=null;
        Object AND70=null;
        Object XOR71=null;
        Object AND72=null;
        Object OR73=null;
        Object AND74=null;
        Object XOR75=null;
        Object AND76=null;
        Object OR77=null;
        Object AND78=null;
        Object XOR79=null;
        Object AND80=null;
        Object AND81=null;
        Object AND82=null;
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.pandterm_return z1 = null;

        tftacrules.sandterm_return z2 = null;

        tftacrules.ae_return z3 = null;

        tftacrules.notterm_return n1 = null;

        tftacrules.tt_return t1 = null;

        tftacrules.tt_return t2 = null;

        tftacrules.notterm_return n2 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.notterm_return notterm83 = null;

        tftacrules.metaPandSandAE_return metaPandSandAE84 = null;


        Object AND64_tree=null;
        Object OR65_tree=null;
        Object AND66_tree=null;
        Object XOR67_tree=null;
        Object AND68_tree=null;
        Object OR69_tree=null;
        Object AND70_tree=null;
        Object XOR71_tree=null;
        Object AND72_tree=null;
        Object OR73_tree=null;
        Object AND74_tree=null;
        Object XOR75_tree=null;
        Object AND76_tree=null;
        Object OR77_tree=null;
        Object AND78_tree=null;
        Object XOR79_tree=null;
        Object AND80_tree=null;
        Object AND81_tree=null;
        Object AND82_tree=null;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:2: ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) )
            int alt6=10;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:4: ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND64=(Object)match(input,AND,FOLLOW_AND_in_negandterm1005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND64);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR65=(Object)match(input,OR,FOLLOW_OR_in_negandterm1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR65);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1012);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1016);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1021);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z1, AND, x, y, z1, OR, AND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:103:7: ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:103:12: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:103:26: ^( AND $y $z1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:104:4: ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND66=(Object)match(input,AND,FOLLOW_AND_in_negandterm1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND66);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR67=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR67);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1064);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1068);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1073);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, y, AND, x, XOR, z1, z1
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:105:7: ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:105:13: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:105:27: ^( AND $y $z1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:106:4: ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND68=(Object)match(input,AND,FOLLOW_AND_in_negandterm1109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND68);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR69=(Object)match(input,OR,FOLLOW_OR_in_negandterm1112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR69);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1116);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1120);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1125);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, z2, AND, y, AND, z2, OR
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:107:7: ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:107:12: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:107:26: ^( AND $y $z2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:108:4: ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND70=(Object)match(input,AND,FOLLOW_AND_in_negandterm1161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND70);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR71=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR71);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1168);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1172);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1177);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, y, z2, XOR, AND, z2, x
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:109:7: ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:109:13: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:109:27: ^( AND $y $z2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:110:4: ^( AND ^( OR x= notterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND72=(Object)match(input,AND,FOLLOW_AND_in_negandterm1213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND72);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR73=(Object)match(input,OR,FOLLOW_OR_in_negandterm1216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR73);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1220);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1224);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1229);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z3, x, y, AND, z3, AND, OR
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:111:7: ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:111:12: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:111:26: ^( AND $y $z3)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:112:4: ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND74=(Object)match(input,AND,FOLLOW_AND_in_negandterm1265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND74);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR75=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR75);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1272);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1276);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1281);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, z3, z3, x, AND, y, AND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:113:7: ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:113:13: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:113:27: ^( AND $y $z3)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:4: ^( AND n1= notterm ^( OR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND76=(Object)match(input,AND,FOLLOW_AND_in_negandterm1317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND76);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1321);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR77=(Object)match(input,OR,FOLLOW_OR_in_negandterm1324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR77);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1328);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1332);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, n1, t2, OR, n1, t1, AND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:115:7: ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:115:12: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:115:28: ^( AND $n1 $t2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:116:4: ^( AND n1= notterm ^( XOR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND78=(Object)match(input,AND,FOLLOW_AND_in_negandterm1372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND78);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1376);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR79=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR79);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1383);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1387);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, AND, n1, t1, t2, AND, n1
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:117:7: ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:117:13: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:117:29: ^( AND $n1 $t2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:118:4: ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND80=(Object)match(input,AND,FOLLOW_AND_in_negandterm1426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND80);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1430);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND81=(Object)match(input,AND,FOLLOW_AND_in_negandterm1433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND81);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1437);
                    n2=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n2.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1441);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, n1, AND, n2, m1
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:119:7: ^( AND ^( AND $n1 $n2) $m1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:119:13: ^( AND $n1 $n2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:120:4: ^( AND notterm metaPandSandAE )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND82=(Object)match(input,AND,FOLLOW_AND_in_negandterm1471); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND82_tree = (Object)adaptor.dupNode(AND82);

                    root_1 = (Object)adaptor.becomeRoot(AND82_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1473);
                    notterm83=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm83.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1475);
                    metaPandSandAE84=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, metaPandSandAE84.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:123:1: negatedterm : ( negandterm | notterm );
    public final tftacrules.negatedterm_return negatedterm() throws RecognitionException {
        tftacrules.negatedterm_return retval = new tftacrules.negatedterm_return();
        retval.start = input.LT(1);
        int negatedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrules.negandterm_return negandterm85 = null;

        tftacrules.notterm_return notterm86 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:124:2: ( negandterm | notterm )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AND) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred37_tftacrules()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:124:4: negandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negandterm_in_negatedterm1489);
                    negandterm85=negandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negandterm85.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:125:4: notterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negatedterm1494);
                    notterm86=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, notterm86.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:128:1: metaPandSandAE : ( pandterm | sandterm | andterm | ae );
    public final tftacrules.metaPandSandAE_return metaPandSandAE() throws RecognitionException {
        tftacrules.metaPandSandAE_return retval = new tftacrules.metaPandSandAE_return();
        retval.start = input.LT(1);
        int metaPandSandAE_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrules.pandterm_return pandterm87 = null;

        tftacrules.sandterm_return sandterm88 = null;

        tftacrules.andterm_return andterm89 = null;

        tftacrules.ae_return ae90 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:129:2: ( pandterm | sandterm | andterm | ae )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:129:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_metaPandSandAE1506);
                    pandterm87=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm87.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:130:4: sandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_metaPandSandAE1511);
                    sandterm88=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandterm88.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:131:4: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_metaPandSandAE1516);
                    andterm89=andterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andterm89.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:132:4: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_metaPandSandAE1521);
                    ae90=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae90.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:135:1: orterm : ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) );
    public final tftacrules.orterm_return orterm() throws RecognitionException {
        tftacrules.orterm_return retval = new tftacrules.orterm_return();
        retval.start = input.LT(1);
        int orterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR91=null;
        Object TRUE93=null;
        Object OR94=null;
        Object TRUE95=null;
        Object wildcard96=null;
        Object OR97=null;
        Object FALSE98=null;
        Object OR99=null;
        Object FALSE100=null;
        Object OR101=null;
        tftacrules.ae_return a = null;

        tftacrules.ae_return ae92 = null;

        tftacrules.tt_return tt102 = null;

        tftacrules.tt_return tt103 = null;


        Object OR91_tree=null;
        Object TRUE93_tree=null;
        Object OR94_tree=null;
        Object TRUE95_tree=null;
        Object wildcard96_tree=null;
        Object OR97_tree=null;
        Object FALSE98_tree=null;
        Object OR99_tree=null;
        Object FALSE100_tree=null;
        Object OR101_tree=null;
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:135:8: ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OR) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred41_tftacrules()) ) {
                    alt9=1;
                }
                else if ( (synpred42_tftacrules()) ) {
                    alt9=2;
                }
                else if ( (synpred43_tftacrules()) ) {
                    alt9=3;
                }
                else if ( (synpred44_tftacrules()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:135:10: ^( OR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR91=(Object)match(input,OR,FOLLOW_OR_in_orterm1533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR91);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1535);
                    ae92=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae92.getTree());
                    _last = (Object)input.LT(1);
                    TRUE93=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE93);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:137:4: ^( OR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR94=(Object)match(input,OR,FOLLOW_OR_in_orterm1552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR94);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE95=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE95);

                    wildcard96=(Object)input.LT(1);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:139:4: ^( OR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR97=(Object)match(input,OR,FOLLOW_OR_in_orterm1570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR97);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE98=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE98);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1576);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:141:4: ^( OR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR99=(Object)match(input,OR,FOLLOW_OR_in_orterm1591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR99);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1595);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE100=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE100);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:143:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR101=(Object)match(input,OR,FOLLOW_OR_in_orterm1612); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR101_tree = (Object)adaptor.dupNode(OR101);

                    root_1 = (Object)adaptor.becomeRoot(OR101_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1614);
                    tt102=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt102.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1616);
                    tt103=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt103.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:146:1: xorterm : ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) );
    public final tftacrules.xorterm_return xorterm() throws RecognitionException {
        tftacrules.xorterm_return retval = new tftacrules.xorterm_return();
        retval.start = input.LT(1);
        int xorterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR104=null;
        Object TRUE106=null;
        Object XOR107=null;
        Object TRUE108=null;
        Object wildcard109=null;
        Object XOR110=null;
        Object FALSE111=null;
        Object XOR112=null;
        Object FALSE113=null;
        Object XOR114=null;
        tftacrules.ae_return a = null;

        tftacrules.ae_return ae105 = null;

        tftacrules.tt_return tt115 = null;

        tftacrules.tt_return tt116 = null;


        Object XOR104_tree=null;
        Object TRUE106_tree=null;
        Object XOR107_tree=null;
        Object TRUE108_tree=null;
        Object wildcard109_tree=null;
        Object XOR110_tree=null;
        Object FALSE111_tree=null;
        Object XOR112_tree=null;
        Object FALSE113_tree=null;
        Object XOR114_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:146:9: ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==XOR) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred45_tftacrules()) ) {
                    alt10=1;
                }
                else if ( (synpred46_tftacrules()) ) {
                    alt10=2;
                }
                else if ( (synpred47_tftacrules()) ) {
                    alt10=3;
                }
                else if ( (synpred48_tftacrules()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:146:11: ^( XOR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR104=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR104);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1631);
                    ae105=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae105.getTree());
                    _last = (Object)input.LT(1);
                    TRUE106=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE106);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:148:4: ^( XOR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR107=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR107);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE108=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE108);

                    wildcard109=(Object)input.LT(1);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:150:4: ^( XOR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR110=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR110);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE111=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE111);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1672);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:152:4: ^( XOR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR112=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR112);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1691);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE113=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE113);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:154:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR114=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR114_tree = (Object)adaptor.dupNode(XOR114);

                    root_1 = (Object)adaptor.becomeRoot(XOR114_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1710);
                    tt115=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt115.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1712);
                    tt116=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt116.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) );
    public final tftacrules.pandterm_return pandterm() throws RecognitionException {
        tftacrules.pandterm_return retval = new tftacrules.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND117=null;
        Object FALSE119=null;
        Object PAND120=null;
        Object FALSE121=null;
        Object wildcard122=null;
        Object PAND123=null;
        Object TRUE125=null;
        Object PAND126=null;
        Object TRUE127=null;
        Object PAND128=null;
        Object XOR129=null;
        Object PAND130=null;
        Object XOR131=null;
        Object PAND132=null;
        Object OR133=null;
        Object PAND134=null;
        Object OR135=null;
        Object PAND136=null;
        Object PAND137=null;
        Object PAND138=null;
        Object AND139=null;
        Object PAND140=null;
        Object AND141=null;
        Object PAND142=null;
        tftacrules.ae_return a = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;

        tftacrules.notterm_return b = null;

        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.ae_return ae118 = null;

        tftacrules.ae_return ae124 = null;

        tftacrules.tt_return tt143 = null;

        tftacrules.tt_return tt144 = null;


        Object PAND117_tree=null;
        Object FALSE119_tree=null;
        Object PAND120_tree=null;
        Object FALSE121_tree=null;
        Object wildcard122_tree=null;
        Object PAND123_tree=null;
        Object TRUE125_tree=null;
        Object PAND126_tree=null;
        Object TRUE127_tree=null;
        Object PAND128_tree=null;
        Object XOR129_tree=null;
        Object PAND130_tree=null;
        Object XOR131_tree=null;
        Object PAND132_tree=null;
        Object OR133_tree=null;
        Object PAND134_tree=null;
        Object OR135_tree=null;
        Object PAND136_tree=null;
        Object PAND137_tree=null;
        Object PAND138_tree=null;
        Object AND139_tree=null;
        Object PAND140_tree=null;
        Object AND141_tree=null;
        Object PAND142_tree=null;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:9: ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | ^( PAND tt tt ) )
            int alt11=12;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:11: ^( PAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND117=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND117);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1726);
                    ae118=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae118.getTree());
                    _last = (Object)input.LT(1);
                    FALSE119=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE119);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:159:4: ^( PAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND120=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND120);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE121=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE121);

                    wildcard122=(Object)input.LT(1);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:161:4: ^( PAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND123=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND123);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1763);
                    ae124=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae124.getTree());
                    _last = (Object)input.LT(1);
                    TRUE125=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE125);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:163:4: ^( PAND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND126=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND126);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE127=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE127);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1786);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:165:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND128=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND128);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR129=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm1804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR129);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1808);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1812);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1817);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, PAND, z, x, z, XOR, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:166:7: ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:166:13: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:166:27: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:167:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND130=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND130);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1858);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR131=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm1861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR131);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1865);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1869);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, z, XOR, PAND, x, z, PAND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:7: ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:13: ^( PAND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:27: ^( PAND $z $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:169:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND132=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND132);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR133=(Object)match(input,OR,FOLLOW_OR_in_pandterm1911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR133);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1915);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1919);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1924);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, OR, x, z, PAND, PAND, z
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:170:7: ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:170:12: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:170:26: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:171:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND134=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND134);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1965);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR135=(Object)match(input,OR,FOLLOW_OR_in_pandterm1968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR135);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1972);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1976);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, y, PAND, x, x, z, PAND, x, z, z, y, PAND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) ) ^( PAND $z ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:13: ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( AND ^( NOT $y) ^( PAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:19: ^( AND ^( NOT $x) ^( PAND $z $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:25: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:35: ^( PAND $z $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:50: ^( AND ^( NOT $y) ^( PAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:56: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:66: ^( PAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:85: ^( PAND $z ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:95: ^( SAND $x $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:173:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND136=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND136);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2064);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND137=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND137);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2071);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2075);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, PAND, x, z
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:174:7: ^( PAND ^( AND $x $z) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:174:14: ^( AND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:175:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND138=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND138);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2109);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND139=(Object)match(input,AND,FOLLOW_AND_in_pandterm2112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND139);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2116);
                    b=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2120);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: b, PAND, z, x, AND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:176:7: ^( AND $b ^( PAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:176:16: ^( PAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:177:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND140=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND140);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND141=(Object)match(input,AND,FOLLOW_AND_in_pandterm2153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND141);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2157);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_pandterm2161);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2166);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, m1, z, n1, z, PAND, n1, z, n1, m1, m1, PAND, PAND, PAND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:7: ^( XOR ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:13: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( AND $n1 ^( PAND $m1 $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:19: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:26: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:37: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:53: ^( AND $n1 ^( PAND $m1 $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:63: ^( PAND $m1 $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:81: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:92: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:99: ^( NOT $n1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:179:4: ^( PAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND142=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2246); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND142_tree = (Object)adaptor.dupNode(PAND142);

                    root_1 = (Object)adaptor.becomeRoot(PAND142_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2248);
                    tt143=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt143.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2250);
                    tt144=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt144.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );
    public final tftacrules.sandterm_return sandterm() throws RecognitionException {
        tftacrules.sandterm_return retval = new tftacrules.sandterm_return();
        retval.start = input.LT(1);
        int sandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND145=null;
        Object FALSE147=null;
        Object SAND148=null;
        Object FALSE149=null;
        Object wildcard150=null;
        Object SAND151=null;
        Object TRUE152=null;
        Object TRUE153=null;
        Object SAND154=null;
        Object TRUE156=null;
        Object SAND157=null;
        Object TRUE158=null;
        Object wildcard159=null;
        Object SAND160=null;
        Object XOR161=null;
        Object SAND162=null;
        Object XOR163=null;
        Object SAND164=null;
        Object OR165=null;
        Object SAND166=null;
        Object OR167=null;
        Object SAND168=null;
        Object PAND169=null;
        Object SAND170=null;
        Object PAND171=null;
        Object SAND172=null;
        Object AND173=null;
        Object SAND174=null;
        Object AND175=null;
        Object SAND176=null;
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;

        tftacrules.notterm_return a = null;

        tftacrules.ae_return ae146 = null;

        tftacrules.ae_return ae155 = null;

        tftacrules.tt_return tt177 = null;

        tftacrules.tt_return tt178 = null;


        Object SAND145_tree=null;
        Object FALSE147_tree=null;
        Object SAND148_tree=null;
        Object FALSE149_tree=null;
        Object wildcard150_tree=null;
        Object SAND151_tree=null;
        Object TRUE152_tree=null;
        Object TRUE153_tree=null;
        Object SAND154_tree=null;
        Object TRUE156_tree=null;
        Object SAND157_tree=null;
        Object TRUE158_tree=null;
        Object wildcard159_tree=null;
        Object SAND160_tree=null;
        Object XOR161_tree=null;
        Object SAND162_tree=null;
        Object XOR163_tree=null;
        Object SAND164_tree=null;
        Object OR165_tree=null;
        Object SAND166_tree=null;
        Object OR167_tree=null;
        Object SAND168_tree=null;
        Object PAND169_tree=null;
        Object SAND170_tree=null;
        Object PAND171_tree=null;
        Object SAND172_tree=null;
        Object AND173_tree=null;
        Object SAND174_tree=null;
        Object AND175_tree=null;
        Object SAND176_tree=null;
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:9: ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) )
            int alt12=14;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:11: ^( SAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND145=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND145);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2264);
                    ae146=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae146.getTree());
                    _last = (Object)input.LT(1);
                    FALSE147=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE147);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:184:4: ^( SAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND148=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND148);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE149=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE149);

                    wildcard150=(Object)input.LT(1);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:186:4: ^( SAND TRUE TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND151=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND151);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE152=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE152);

                    _last = (Object)input.LT(1);
                    TRUE153=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE153);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:188:4: ^( SAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND154=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND154);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2319);
                    ae155=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae155.getTree());
                    _last = (Object)input.LT(1);
                    TRUE156=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2321); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE156);


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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:190:4: ^( SAND TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND157=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND157);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE158=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE158);

                    wildcard159=(Object)input.LT(1);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:192:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND160=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND160);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR161=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR161);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2361);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2365);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2370);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, XOR, z, x, SAND, z, SAND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:193:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:193:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:193:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:194:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND162=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND162);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2411);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR163=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR163);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2418);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2422);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, y, XOR, z, x, SAND, SAND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:195:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:195:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:195:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:196:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND164=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND164);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2464);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR165=(Object)match(input,OR,FOLLOW_OR_in_sandterm2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR165);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2471);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2475);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, x, x, z, SAND, y, y, SAND, y, z, SAND, SAND, z
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $z $x) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:51: ^( AND ^( NOT $y) ^( SAND $z $x) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:58: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:68: ^( SAND $z $x)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:86: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:96: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:198:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND166=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND166);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR167=(Object)match(input,OR,FOLLOW_OR_in_sandterm2563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR167);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2567);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2571);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2576);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, SAND, z, SAND, z, z, y, x, x, x, SAND, SAND, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:7: ^( XOR ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:13: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( AND ^( NOT $y) ^( SAND $x $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:19: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:26: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:36: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:51: ^( AND ^( NOT $y) ^( SAND $x $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:58: ^( NOT $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:68: ^( SAND $x $z)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:86: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:199:96: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:200:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND168=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND168);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND169=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND169);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2667);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2671);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2676);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, x, SAND, PAND, y
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:201:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:201:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:202:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND170=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND170);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2709);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND171=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND171);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2716);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2720);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, y, z, PAND, x
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:203:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:203:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:204:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND172=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND172);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2754);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND173=(Object)match(input,AND,FOLLOW_AND_in_sandterm2757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND173);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2761);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2765);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, SAND, a, AND, x
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:205:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:205:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:206:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND174=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND174);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND175=(Object)match(input,AND,FOLLOW_AND_in_sandterm2798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND175);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2802);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2806);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2811);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, z, x, a, SAND
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:207:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:207:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:208:4: ^( SAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND176=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND176_tree = (Object)adaptor.dupNode(SAND176);

                    root_1 = (Object)adaptor.becomeRoot(SAND176_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2843);
                    tt177=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt177.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2845);
                    tt178=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt178.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:211:1: ae : ( ID | TRUE | FALSE );
    public final tftacrules.ae_return ae() throws RecognitionException {
        tftacrules.ae_return retval = new tftacrules.ae_return();
        retval.start = input.LT(1);
        int ae_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set179=null;

        Object set179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:211:6: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set179=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set179_tree = (Object)adaptor.dupNode(set179);

                adaptor.addChild(root_0, set179_tree);
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

    // $ANTLR start synpred2_tftacrules
    public final void synpred2_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:45:4: ( andterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:45:4: andterm
        {
        pushFollow(FOLLOW_andterm_in_synpred2_tftacrules69);
        andterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_tftacrules

    // $ANTLR start synpred3_tftacrules
    public final void synpred3_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:46:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:46:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred3_tftacrules74);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_tftacrules

    // $ANTLR start synpred9_tftacrules
    public final void synpred9_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:11: ( ^( NOT ^( AND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:11: ^( NOT ^( AND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred9_tftacrules159); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred9_tftacrules162); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred9_tftacrules166);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred9_tftacrules170);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_tftacrules

    // $ANTLR start synpred10_tftacrules
    public final void synpred10_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:61:4: ( ^( NOT ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:61:4: ^( NOT ^( OR x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred10_tftacrules202); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred10_tftacrules205); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred10_tftacrules209);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred10_tftacrules213);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_tftacrules

    // $ANTLR start synpred11_tftacrules
    public final void synpred11_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:63:4: ( ^( NOT ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:63:4: ^( NOT ^( XOR x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred11_tftacrules245); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred11_tftacrules248); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred11_tftacrules252);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred11_tftacrules256);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_tftacrules

    // $ANTLR start synpred12_tftacrules
    public final void synpred12_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:65:4: ( ^( NOT ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:65:4: ^( NOT ^( PAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred12_tftacrules288); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred12_tftacrules291); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred12_tftacrules295);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred12_tftacrules299);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_tftacrules

    // $ANTLR start synpred13_tftacrules
    public final void synpred13_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:67:4: ( ^( NOT ^( SAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:67:4: ^( NOT ^( SAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred13_tftacrules397); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred13_tftacrules400); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred13_tftacrules404);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred13_tftacrules408);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_tftacrules

    // $ANTLR start synpred17_tftacrules
    public final void synpred17_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:75:11: ( ^( AND . FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:75:11: ^( AND . FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred17_tftacrules555); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred17_tftacrules559); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacrules

    // $ANTLR start synpred18_tftacrules
    public final void synpred18_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:77:4: ( ^( AND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:77:4: ^( AND FALSE . )
        {
        match(input,AND,FOLLOW_AND_in_synpred18_tftacrules574); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred18_tftacrules576); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacrules

    // $ANTLR start synpred19_tftacrules
    public final void synpred19_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:79:4: ( ^( AND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:79:4: ^( AND TRUE a= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred19_tftacrules592); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred19_tftacrules594); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred19_tftacrules598);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_tftacrules

    // $ANTLR start synpred20_tftacrules
    public final void synpred20_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:81:4: ( ^( AND a= ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:81:4: ^( AND a= ae TRUE )
        {
        match(input,AND,FOLLOW_AND_in_synpred20_tftacrules613); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred20_tftacrules617);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred20_tftacrules619); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_tftacrules

    // $ANTLR start synpred21_tftacrules
    public final void synpred21_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:83:4: ( ^( AND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:83:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred21_tftacrules634); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred21_tftacrules637); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrules641);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrules645);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrules650);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_tftacrules

    // $ANTLR start synpred22_tftacrules
    public final void synpred22_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:4: ( ^( AND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:4: ^( AND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred22_tftacrules689); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred22_tftacrules692); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrules696);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrules700);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrules705);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_tftacrules

    // $ANTLR start synpred23_tftacrules
    public final void synpred23_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:4: ( ^( AND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:4: ^( AND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred23_tftacrules744); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrules748);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred23_tftacrules751); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrules755);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrules759);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_tftacrules

    // $ANTLR start synpred24_tftacrules
    public final void synpred24_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:89:4: ( ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:89:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrules798); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrules801); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred24_tftacrules805);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred24_tftacrules809);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred24_tftacrules814);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_tftacrules

    // $ANTLR start synpred25_tftacrules
    public final void synpred25_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:91:4: ( pureand )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:91:4: pureand
        {
        pushFollow(FOLLOW_pureand_in_synpred25_tftacrules895);
        pureand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_tftacrules

    // $ANTLR start synpred26_tftacrules
    public final void synpred26_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:4: ( ^( AND x= tt y= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:4: ^( AND x= tt y= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred26_tftacrules901); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred26_tftacrules905);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred26_tftacrules909);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_tftacrules

    // $ANTLR start synpred28_tftacrules
    public final void synpred28_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:4: ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred28_tftacrules1005); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred28_tftacrules1008); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred28_tftacrules1012);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred28_tftacrules1016);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred28_tftacrules1021);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_tftacrules

    // $ANTLR start synpred29_tftacrules
    public final void synpred29_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:104:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:104:4: ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred29_tftacrules1057); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred29_tftacrules1060); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred29_tftacrules1064);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred29_tftacrules1068);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred29_tftacrules1073);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_tftacrules

    // $ANTLR start synpred30_tftacrules
    public final void synpred30_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:106:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:106:4: ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred30_tftacrules1109); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred30_tftacrules1112); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred30_tftacrules1116);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred30_tftacrules1120);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred30_tftacrules1125);
        z2=sandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_tftacrules

    // $ANTLR start synpred31_tftacrules
    public final void synpred31_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:108:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:108:4: ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred31_tftacrules1161); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred31_tftacrules1164); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred31_tftacrules1168);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred31_tftacrules1172);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred31_tftacrules1177);
        z2=sandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacrules

    // $ANTLR start synpred32_tftacrules
    public final void synpred32_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:110:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:110:4: ^( AND ^( OR x= notterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred32_tftacrules1213); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred32_tftacrules1216); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred32_tftacrules1220);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred32_tftacrules1224);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred32_tftacrules1229);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacrules

    // $ANTLR start synpred33_tftacrules
    public final void synpred33_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:112:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:112:4: ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred33_tftacrules1265); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred33_tftacrules1268); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred33_tftacrules1272);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred33_tftacrules1276);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred33_tftacrules1281);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacrules

    // $ANTLR start synpred34_tftacrules
    public final void synpred34_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.tt_return t1 = null;

        tftacrules.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:4: ( ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:4: ^( AND n1= notterm ^( OR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred34_tftacrules1317); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred34_tftacrules1321);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred34_tftacrules1324); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrules1328);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred34_tftacrules1332);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_tftacrules

    // $ANTLR start synpred35_tftacrules
    public final void synpred35_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.tt_return t1 = null;

        tftacrules.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:116:4: ( ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:116:4: ^( AND n1= notterm ^( XOR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred35_tftacrules1372); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred35_tftacrules1376);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred35_tftacrules1379); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred35_tftacrules1383);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred35_tftacrules1387);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_tftacrules

    // $ANTLR start synpred36_tftacrules
    public final void synpred36_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.notterm_return n2 = null;

        tftacrules.metaPandSandAE_return m1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:118:4: ( ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:118:4: ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred36_tftacrules1426); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred36_tftacrules1430);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred36_tftacrules1433); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred36_tftacrules1437);
        n2=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred36_tftacrules1441);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_tftacrules

    // $ANTLR start synpred37_tftacrules
    public final void synpred37_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:124:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:124:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred37_tftacrules1489);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_tftacrules

    // $ANTLR start synpred41_tftacrules
    public final void synpred41_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:135:10: ( ^( OR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:135:10: ^( OR ae TRUE )
        {
        match(input,OR,FOLLOW_OR_in_synpred41_tftacrules1533); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred41_tftacrules1535);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred41_tftacrules1537); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_tftacrules

    // $ANTLR start synpred42_tftacrules
    public final void synpred42_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:137:4: ( ^( OR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:137:4: ^( OR TRUE . )
        {
        match(input,OR,FOLLOW_OR_in_synpred42_tftacrules1552); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred42_tftacrules1554); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_tftacrules

    // $ANTLR start synpred43_tftacrules
    public final void synpred43_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:139:4: ( ^( OR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:139:4: ^( OR FALSE a= ae )
        {
        match(input,OR,FOLLOW_OR_in_synpred43_tftacrules1570); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred43_tftacrules1572); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred43_tftacrules1576);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_tftacrules

    // $ANTLR start synpred44_tftacrules
    public final void synpred44_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:141:4: ( ^( OR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:141:4: ^( OR a= ae FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred44_tftacrules1591); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred44_tftacrules1595);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred44_tftacrules1597); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_tftacrules

    // $ANTLR start synpred45_tftacrules
    public final void synpred45_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:146:11: ( ^( XOR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:146:11: ^( XOR ae TRUE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred45_tftacrules1629); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred45_tftacrules1631);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred45_tftacrules1633); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_tftacrules

    // $ANTLR start synpred46_tftacrules
    public final void synpred46_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:148:4: ( ^( XOR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:148:4: ^( XOR TRUE . )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred46_tftacrules1648); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred46_tftacrules1650); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_tftacrules

    // $ANTLR start synpred47_tftacrules
    public final void synpred47_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:150:4: ( ^( XOR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:150:4: ^( XOR FALSE a= ae )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred47_tftacrules1666); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred47_tftacrules1668); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred47_tftacrules1672);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_tftacrules

    // $ANTLR start synpred48_tftacrules
    public final void synpred48_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:152:4: ( ^( XOR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:152:4: ^( XOR a= ae FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred48_tftacrules1687); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred48_tftacrules1691);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred48_tftacrules1693); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacrules

    // $ANTLR start synpred49_tftacrules
    public final void synpred49_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:11: ( ^( PAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:11: ^( PAND ae FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred49_tftacrules1724); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred49_tftacrules1726);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred49_tftacrules1728); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_tftacrules

    // $ANTLR start synpred50_tftacrules
    public final void synpred50_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:159:4: ( ^( PAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:159:4: ^( PAND FALSE . )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred50_tftacrules1743); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred50_tftacrules1745); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_tftacrules

    // $ANTLR start synpred51_tftacrules
    public final void synpred51_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:161:4: ( ^( PAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:161:4: ^( PAND ae TRUE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred51_tftacrules1761); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred51_tftacrules1763);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred51_tftacrules1765); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_tftacrules

    // $ANTLR start synpred52_tftacrules
    public final void synpred52_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:163:4: ( ^( PAND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:163:4: ^( PAND TRUE a= ae )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred52_tftacrules1780); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred52_tftacrules1782); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred52_tftacrules1786);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_tftacrules

    // $ANTLR start synpred53_tftacrules
    public final void synpred53_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:165:4: ( ^( PAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:165:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred53_tftacrules1801); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred53_tftacrules1804); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrules1808);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrules1812);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrules1817);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_tftacrules

    // $ANTLR start synpred54_tftacrules
    public final void synpred54_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:167:4: ( ^( PAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:167:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred54_tftacrules1854); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrules1858);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred54_tftacrules1861); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrules1865);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrules1869);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_tftacrules

    // $ANTLR start synpred55_tftacrules
    public final void synpred55_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:169:4: ( ^( PAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:169:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred55_tftacrules1908); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred55_tftacrules1911); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrules1915);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrules1919);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrules1924);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_tftacrules

    // $ANTLR start synpred56_tftacrules
    public final void synpred56_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:171:4: ( ^( PAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:171:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred56_tftacrules1961); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrules1965);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred56_tftacrules1968); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrules1972);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrules1976);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_tftacrules

    // $ANTLR start synpred57_tftacrules
    public final void synpred57_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:173:4: ( ^( PAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:173:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrules2060); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrules2064);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrules2067); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrules2071);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrules2075);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_tftacrules

    // $ANTLR start synpred58_tftacrules
    public final void synpred58_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.notterm_return b = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:175:4: ( ^( PAND x= tt ^( AND b= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:175:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred58_tftacrules2105); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred58_tftacrules2109);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred58_tftacrules2112); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred58_tftacrules2116);
        b=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred58_tftacrules2120);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_tftacrules

    // $ANTLR start synpred59_tftacrules
    public final void synpred59_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:177:4: ( ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:177:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred59_tftacrules2150); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred59_tftacrules2153); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred59_tftacrules2157);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred59_tftacrules2161);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred59_tftacrules2166);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacrules

    // $ANTLR start synpred60_tftacrules
    public final void synpred60_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:11: ( ^( SAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:11: ^( SAND ae FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred60_tftacrules2262); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred60_tftacrules2264);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred60_tftacrules2266); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_tftacrules

    // $ANTLR start synpred61_tftacrules
    public final void synpred61_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:184:4: ( ^( SAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:184:4: ^( SAND FALSE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred61_tftacrules2281); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred61_tftacrules2283); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_tftacrules

    // $ANTLR start synpred62_tftacrules
    public final void synpred62_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:186:4: ( ^( SAND TRUE TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:186:4: ^( SAND TRUE TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred62_tftacrules2299); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred62_tftacrules2301); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred62_tftacrules2303); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_tftacrules

    // $ANTLR start synpred63_tftacrules
    public final void synpred63_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:188:4: ( ^( SAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:188:4: ^( SAND ae TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred63_tftacrules2317); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred63_tftacrules2319);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred63_tftacrules2321); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacrules

    // $ANTLR start synpred64_tftacrules
    public final void synpred64_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:190:4: ( ^( SAND TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:190:4: ^( SAND TRUE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred64_tftacrules2336); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred64_tftacrules2338); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_tftacrules

    // $ANTLR start synpred65_tftacrules
    public final void synpred65_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:192:4: ( ^( SAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:192:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred65_tftacrules2354); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred65_tftacrules2357); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrules2361);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrules2365);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrules2370);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_tftacrules

    // $ANTLR start synpred66_tftacrules
    public final void synpred66_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:194:4: ( ^( SAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:194:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred66_tftacrules2407); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrules2411);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred66_tftacrules2414); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrules2418);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrules2422);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacrules

    // $ANTLR start synpred67_tftacrules
    public final void synpred67_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:196:4: ( ^( SAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:196:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred67_tftacrules2460); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrules2464);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred67_tftacrules2467); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrules2471);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrules2475);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_tftacrules

    // $ANTLR start synpred68_tftacrules
    public final void synpred68_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:198:4: ( ^( SAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:198:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred68_tftacrules2560); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred68_tftacrules2563); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrules2567);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrules2571);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrules2576);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_tftacrules

    // $ANTLR start synpred69_tftacrules
    public final void synpred69_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:200:4: ( ^( SAND ^( PAND x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:200:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred69_tftacrules2660); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred69_tftacrules2663); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrules2667);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrules2671);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrules2676);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_tftacrules

    // $ANTLR start synpred70_tftacrules
    public final void synpred70_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:202:4: ( ^( SAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:202:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred70_tftacrules2705); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrules2709);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred70_tftacrules2712); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrules2716);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrules2720);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacrules

    // $ANTLR start synpred71_tftacrules
    public final void synpred71_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.notterm_return a = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:204:4: ( ^( SAND x= tt ^( AND a= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:204:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred71_tftacrules2750); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred71_tftacrules2754);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred71_tftacrules2757); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred71_tftacrules2761);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred71_tftacrules2765);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_tftacrules

    // $ANTLR start synpred72_tftacrules
    public final void synpred72_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return a = null;

        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:206:4: ( ^( SAND ^( AND a= notterm z= tt ) x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:206:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred72_tftacrules2795); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred72_tftacrules2798); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred72_tftacrules2802);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred72_tftacrules2806);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred72_tftacrules2811);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_tftacrules

    // Delegated rules

    public final boolean synpred23_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_tftacrules_fragment(); // can never throw exception
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
                        if ( (synpred2_tftacrules()) ) {s = 8;}

                        else if ( (synpred3_tftacrules()) ) {s = 9;}

                         
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
                        if ( (synpred9_tftacrules()) ) {s = 5;}

                        else if ( (synpred10_tftacrules()) ) {s = 6;}

                        else if ( (synpred11_tftacrules()) ) {s = 7;}

                        else if ( (synpred12_tftacrules()) ) {s = 8;}

                        else if ( (synpred13_tftacrules()) ) {s = 9;}

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
            return "75:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) | pureand | ^( AND x= tt y= tt ) -> ^( XOR ^( XOR ^( PAND $y $x) ^( PAND $x $y) ) ^( SAND $x $y) ) | ^( AND tt tt ) );";
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
                        if ( (synpred17_tftacrules()) ) {s = 2;}

                        else if ( (synpred18_tftacrules()) ) {s = 3;}

                        else if ( (synpred19_tftacrules()) ) {s = 4;}

                        else if ( (synpred20_tftacrules()) ) {s = 5;}

                        else if ( (synpred21_tftacrules()) ) {s = 6;}

                        else if ( (synpred22_tftacrules()) ) {s = 7;}

                        else if ( (synpred23_tftacrules()) ) {s = 8;}

                        else if ( (synpred24_tftacrules()) ) {s = 9;}

                        else if ( (synpred25_tftacrules()) ) {s = 10;}

                        else if ( (synpred26_tftacrules()) ) {s = 11;}

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
                        if ( (synpred28_tftacrules()) ) {s = 2;}

                        else if ( (synpred29_tftacrules()) ) {s = 3;}

                        else if ( (synpred30_tftacrules()) ) {s = 4;}

                        else if ( (synpred31_tftacrules()) ) {s = 5;}

                        else if ( (synpred32_tftacrules()) ) {s = 6;}

                        else if ( (synpred33_tftacrules()) ) {s = 7;}

                        else if ( (synpred34_tftacrules()) ) {s = 8;}

                        else if ( (synpred35_tftacrules()) ) {s = 9;}

                        else if ( (synpred36_tftacrules()) ) {s = 10;}

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
                        if ( (synpred49_tftacrules()) ) {s = 2;}

                        else if ( (synpred50_tftacrules()) ) {s = 3;}

                        else if ( (synpred51_tftacrules()) ) {s = 4;}

                        else if ( (synpred52_tftacrules()) ) {s = 5;}

                        else if ( (synpred53_tftacrules()) ) {s = 6;}

                        else if ( (synpred54_tftacrules()) ) {s = 7;}

                        else if ( (synpred55_tftacrules()) ) {s = 8;}

                        else if ( (synpred56_tftacrules()) ) {s = 9;}

                        else if ( (synpred57_tftacrules()) ) {s = 10;}

                        else if ( (synpred58_tftacrules()) ) {s = 11;}

                        else if ( (synpred59_tftacrules()) ) {s = 12;}

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
                        if ( (synpred60_tftacrules()) ) {s = 2;}

                        else if ( (synpred61_tftacrules()) ) {s = 3;}

                        else if ( (synpred62_tftacrules()) ) {s = 4;}

                        else if ( (synpred63_tftacrules()) ) {s = 5;}

                        else if ( (synpred64_tftacrules()) ) {s = 6;}

                        else if ( (synpred65_tftacrules()) ) {s = 7;}

                        else if ( (synpred66_tftacrules()) ) {s = 8;}

                        else if ( (synpred67_tftacrules()) ) {s = 9;}

                        else if ( (synpred68_tftacrules()) ) {s = 10;}

                        else if ( (synpred69_tftacrules()) ) {s = 11;}

                        else if ( (synpred70_tftacrules()) ) {s = 12;}

                        else if ( (synpred71_tftacrules()) ) {s = 13;}

                        else if ( (synpred72_tftacrules()) ) {s = 14;}

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
    public static final BitSet FOLLOW_pureand_in_andterm895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andterm901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm905 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm962 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm964 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_pureand976 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_pureand978 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_pureand980 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_pureand987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pureand_in_pureand989 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_pureand991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1008 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1012 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1064 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1116 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1168 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1220 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1272 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negandterm1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1328 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negandterm1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1383 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1430 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_negandterm1433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1437 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1473 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_negatedterm1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notterm_in_negatedterm1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_metaPandSandAE1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandterm_in_metaPandSandAE1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_metaPandSandAE1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_metaPandSandAE1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_orterm1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_orterm1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orterm1554 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_OR_in_orterm1570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orterm1572 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_orterm1576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1595 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orterm1597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orterm1614 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orterm1616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1631 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1650 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_XOR_in_xorterm1666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1668 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_xorterm1672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1691 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorterm1710 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorterm1712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1726 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1745 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_PAND_in_pandterm1761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1763 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1782 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_pandterm1786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pandterm1804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1808 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm1817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_pandterm1861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1865 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pandterm1911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1915 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm1924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_pandterm1968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1972 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2064 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_pandterm2067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2071 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_pandterm2112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2116 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandterm2153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2157 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_pandterm2161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm2166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2248 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2283 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2301 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2319 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2338 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_sandterm2357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2361 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_sandterm2414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2418 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_sandterm2467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2471 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_sandterm2563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2567 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_sandterm2663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2667 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2709 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_sandterm2712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2716 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2754 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_sandterm2757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2761 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_sandterm2798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2802 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2843 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_ae0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_synpred2_tftacrules69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negandterm_in_synpred3_tftacrules74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_synpred9_tftacrules159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred9_tftacrules162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred9_tftacrules166 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred9_tftacrules170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred10_tftacrules202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred10_tftacrules205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred10_tftacrules209 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred10_tftacrules213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred11_tftacrules245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred11_tftacrules248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred11_tftacrules252 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred11_tftacrules256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred12_tftacrules288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred12_tftacrules291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrules295 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrules299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred13_tftacrules397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred13_tftacrules400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred13_tftacrules404 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred13_tftacrules408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred17_tftacrules555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred17_tftacrules559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred18_tftacrules574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred18_tftacrules576 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_AND_in_synpred19_tftacrules592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred19_tftacrules594 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred19_tftacrules598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred20_tftacrules613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred20_tftacrules617 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred20_tftacrules619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred21_tftacrules634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred21_tftacrules637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrules641 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrules645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrules650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred22_tftacrules689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred22_tftacrules692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrules696 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrules700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrules705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred23_tftacrules744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrules748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred23_tftacrules751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrules755 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrules759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrules798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrules801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred24_tftacrules805 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred24_tftacrules809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred24_tftacrules814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pureand_in_synpred25_tftacrules895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred26_tftacrules901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred26_tftacrules905 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred26_tftacrules909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred28_tftacrules1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacrules1008 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred28_tftacrules1012 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred28_tftacrules1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred28_tftacrules1021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred29_tftacrules1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred29_tftacrules1060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred29_tftacrules1064 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred29_tftacrules1068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred29_tftacrules1073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred30_tftacrules1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred30_tftacrules1112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred30_tftacrules1116 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred30_tftacrules1120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred30_tftacrules1125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred31_tftacrules1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred31_tftacrules1164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred31_tftacrules1168 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred31_tftacrules1172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred31_tftacrules1177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred32_tftacrules1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred32_tftacrules1216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred32_tftacrules1220 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred32_tftacrules1224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred32_tftacrules1229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred33_tftacrules1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred33_tftacrules1268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred33_tftacrules1272 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred33_tftacrules1276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred33_tftacrules1281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacrules1317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred34_tftacrules1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred34_tftacrules1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrules1328 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred34_tftacrules1332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred35_tftacrules1372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred35_tftacrules1376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred35_tftacrules1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrules1383 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred35_tftacrules1387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred36_tftacrules1426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred36_tftacrules1430 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred36_tftacrules1433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred36_tftacrules1437 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred36_tftacrules1441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_synpred37_tftacrules1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred41_tftacrules1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred41_tftacrules1535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred41_tftacrules1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred42_tftacrules1552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred42_tftacrules1554 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_OR_in_synpred43_tftacrules1570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred43_tftacrules1572 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred43_tftacrules1576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred44_tftacrules1591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred44_tftacrules1595 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred44_tftacrules1597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred45_tftacrules1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred45_tftacrules1631 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred45_tftacrules1633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred46_tftacrules1648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred46_tftacrules1650 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_XOR_in_synpred47_tftacrules1666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred47_tftacrules1668 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred47_tftacrules1672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred48_tftacrules1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred48_tftacrules1691 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred48_tftacrules1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred49_tftacrules1724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred49_tftacrules1726 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred49_tftacrules1728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred50_tftacrules1743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred50_tftacrules1745 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_PAND_in_synpred51_tftacrules1761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred51_tftacrules1763 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred51_tftacrules1765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred52_tftacrules1780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred52_tftacrules1782 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred52_tftacrules1786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred53_tftacrules1801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred53_tftacrules1804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrules1808 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrules1812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrules1817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred54_tftacrules1854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrules1858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred54_tftacrules1861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrules1865 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrules1869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred55_tftacrules1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred55_tftacrules1911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrules1915 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrules1919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrules1924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred56_tftacrules1961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrules1965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred56_tftacrules1968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrules1972 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrules1976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrules2060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrules2064 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrules2067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrules2071 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrules2075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred58_tftacrules2105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrules2109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred58_tftacrules2112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred58_tftacrules2116 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred58_tftacrules2120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred59_tftacrules2150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred59_tftacrules2153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred59_tftacrules2157 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred59_tftacrules2161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred59_tftacrules2166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred60_tftacrules2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred60_tftacrules2264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred60_tftacrules2266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred61_tftacrules2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred61_tftacrules2283 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred62_tftacrules2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred62_tftacrules2301 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred62_tftacrules2303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred63_tftacrules2317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred63_tftacrules2319 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred63_tftacrules2321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred64_tftacrules2336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred64_tftacrules2338 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred65_tftacrules2354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred65_tftacrules2357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrules2361 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrules2365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrules2370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred66_tftacrules2407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrules2411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred66_tftacrules2414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrules2418 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrules2422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred67_tftacrules2460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrules2464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred67_tftacrules2467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrules2471 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrules2475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred68_tftacrules2560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred68_tftacrules2563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrules2567 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrules2571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrules2576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred69_tftacrules2660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred69_tftacrules2663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrules2667 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrules2671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrules2676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred70_tftacrules2705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrules2709 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred70_tftacrules2712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrules2716 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrules2720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred71_tftacrules2750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred71_tftacrules2754 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred71_tftacrules2757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred71_tftacrules2761 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred71_tftacrules2765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred72_tftacrules2795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred72_tftacrules2798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred72_tftacrules2802 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred72_tftacrules2806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred72_tftacrules2811 = new BitSet(new long[]{0x0000000000000008L});

}