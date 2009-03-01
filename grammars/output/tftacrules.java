// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g 2009-03-01 19:52:08

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
            this.state.ruleMemo = new HashMap[84+1];
             
             
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:23:1: tt : ( andterm | negandterm | orterm | pandterm | sandterm | xorterm | ae | ^( NOT ^( NOT a1= tt ) ) -> $a1);
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

        tftacrules.andterm_return andterm1 = null;

        tftacrules.negandterm_return negandterm2 = null;

        tftacrules.orterm_return orterm3 = null;

        tftacrules.pandterm_return pandterm4 = null;

        tftacrules.sandterm_return sandterm5 = null;

        tftacrules.xorterm_return xorterm6 = null;

        tftacrules.ae_return ae7 = null;


        Object NOT8_tree=null;
        Object NOT9_tree=null;
        RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_tt=new RewriteRuleSubtreeStream(adaptor,"rule tt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:23:5: ( andterm | negandterm | orterm | pandterm | sandterm | xorterm | ae | ^( NOT ^( NOT a1= tt ) ) -> $a1)
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:23:7: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_tt65);
                    andterm1=andterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andterm1.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:24:4: negandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negandterm_in_tt70);
                    negandterm2=negandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negandterm2.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:25:4: orterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_orterm_in_tt75);
                    orterm3=orterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, orterm3.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:26:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_tt80);
                    pandterm4=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm4.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:4: sandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_tt85);
                    sandterm5=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandterm5.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:28:4: xorterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_xorterm_in_tt90);
                    xorterm6=xorterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, xorterm6.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:29:4: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_tt95);
                    ae7=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae7.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:30:4: ^( NOT ^( NOT a1= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT8=(Object)match(input,NOT,FOLLOW_NOT_in_tt101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT8);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT9=(Object)match(input,NOT,FOLLOW_NOT_in_tt104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT9);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_tt108);
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
                    // 31:4: -> $a1
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:45:1: ce : ( ae | ^( SAND ce ce ) );
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:45:4: ( ae | ^( SAND ce ce ) )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:45:6: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_ce151);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:46:4: ^( SAND ce ce )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND11=(Object)match(input,SAND,FOLLOW_SAND_in_ce158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND11_tree = (Object)adaptor.dupNode(SAND11);

                    root_1 = (Object)adaptor.becomeRoot(SAND11_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_ce160);
                    ce12=ce();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ce12.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ce_in_ce162);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( XOR ^( AND ^( NOT $x) $y) ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) ) ) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:9: ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( XOR ^( AND ^( NOT $x) $y) ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) ) ) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:11: ^( NOT ^( AND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT14=(Object)match(input,NOT,FOLLOW_NOT_in_notterm175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT14);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND15=(Object)match(input,AND,FOLLOW_AND_in_notterm178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND15);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm182);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm186);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:4: -> ^( OR ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:50:7: ^( OR ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:50:12: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:50:22: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:51:4: ^( NOT ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT16=(Object)match(input,NOT,FOLLOW_NOT_in_notterm218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT16);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR17=(Object)match(input,OR,FOLLOW_OR_in_notterm221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR17);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm225);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm229);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:52:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:52:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:52:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:53:4: ^( NOT ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT18=(Object)match(input,NOT,FOLLOW_NOT_in_notterm261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT18);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR19=(Object)match(input,XOR,FOLLOW_XOR_in_notterm264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR19);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm268);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm272);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:4: -> ^( AND ^( NOT $x) ^( NOT $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:54:7: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:54:13: ^( NOT $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:54:23: ^( NOT $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:55:4: ^( NOT ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT20=(Object)match(input,NOT,FOLLOW_NOT_in_notterm304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT20);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND21=(Object)match(input,PAND,FOLLOW_PAND_in_notterm307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND21);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm311);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm315);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: NOT, y, x, NOT, y, NOT, x
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
                    // 56:4: -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:7: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:13: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:19: ^( NOT $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:29: ^( NOT $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:40: ^( AND ^( NOT $x) $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:56:46: ^( NOT $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:58:4: ^( NOT ^( SAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT22=(Object)match(input,NOT,FOLLOW_NOT_in_notterm370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT22);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND23=(Object)match(input,SAND,FOLLOW_SAND_in_notterm373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND23);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm377);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm381);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, y, y, y, y, x, NOT, NOT, x, NOT, NOT, x, x
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
                    // 59:4: -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( XOR ^( AND ^( NOT $x) $y) ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) ) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:7: ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( XOR ^( AND ^( NOT $x) $y) ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:13: ^( AND ^( NOT $x) ^( NOT $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:19: ^( NOT $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:29: ^( NOT $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:40: ^( XOR ^( AND ^( NOT $x) $y) ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:46: ^( AND ^( NOT $x) $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:52: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:66: ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:72: ^( AND ^( NOT $y) $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:78: ^( NOT $y)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_5);

                        adaptor.addChild(root_5, stream_y.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:92: ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:98: ^( PAND $y $x)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_5);

                        adaptor.addChild(root_5, stream_y.nextTree());
                        adaptor.addChild(root_5, stream_x.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:112: ^( XOR ^( PAND $x $y) )
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_5);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:59:118: ^( PAND $x $y)
                        {
                        Object root_6 = (Object)adaptor.nil();
                        root_6 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_6);

                        adaptor.addChild(root_6, stream_x.nextTree());
                        adaptor.addChild(root_6, stream_y.nextTree());

                        adaptor.addChild(root_5, root_6);
                        }

                        adaptor.addChild(root_4, root_5);
                        }

                        adaptor.addChild(root_3, root_4);
                        }

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
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:60:4: ^( OR notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR24=(Object)match(input,OR,FOLLOW_OR_in_notterm484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR24_tree = (Object)adaptor.dupNode(OR24);

                    root_1 = (Object)adaptor.becomeRoot(OR24_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm486);
                    notterm25=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm25.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm488);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:61:4: ^( XOR notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR27=(Object)match(input,XOR,FOLLOW_XOR_in_notterm495); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR27_tree = (Object)adaptor.dupNode(XOR27);

                    root_1 = (Object)adaptor.becomeRoot(XOR27_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm497);
                    notterm28=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm28.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm499);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:62:4: ^( AND notterm notterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND30=(Object)match(input,AND,FOLLOW_AND_in_notterm506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND30_tree = (Object)adaptor.dupNode(AND30);

                    root_1 = (Object)adaptor.becomeRoot(AND30_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm508);
                    notterm31=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm31.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_notterm510);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:63:4: ^( NOT tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT33=(Object)match(input,NOT,FOLLOW_NOT_in_notterm517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT33_tree = (Object)adaptor.dupNode(NOT33);

                    root_1 = (Object)adaptor.becomeRoot(NOT33_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_notterm519);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:70:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) ) | ^( AND tt tt ) );
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
        Object AND53=null;
        Object AND54=null;
        tftacrules.ae_return a = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;

        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.tt_return tt55 = null;

        tftacrules.tt_return tt56 = null;


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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:70:9: ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) ) | ^( AND tt tt ) )
            int alt4=10;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:70:11: ^( AND . FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND35=(Object)match(input,AND,FOLLOW_AND_in_andterm535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND35);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    wildcard36=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE37=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm539); if (state.failed) return retval; 
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
                    // 71:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:72:4: ^( AND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND38=(Object)match(input,AND,FOLLOW_AND_in_andterm554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND38);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE39=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm556); if (state.failed) return retval; 
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
                    // 73:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:74:4: ^( AND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND41=(Object)match(input,AND,FOLLOW_AND_in_andterm572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND41);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE42=(Object)match(input,TRUE,FOLLOW_TRUE_in_andterm574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE42);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_andterm578);
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
                    // 75:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:76:4: ^( AND a= ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND43=(Object)match(input,AND,FOLLOW_AND_in_andterm593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND43);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_andterm597);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    TRUE44=(Object)match(input,TRUE,FOLLOW_TRUE_in_andterm599); if (state.failed) return retval; 
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
                    // 77:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:78:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND45=(Object)match(input,AND,FOLLOW_AND_in_andterm614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND45);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR46=(Object)match(input,XOR,FOLLOW_XOR_in_andterm617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR46);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm621);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm625);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm630);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, y, AND, z, z, AND, x
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
                    // 79:4: -> ^( XOR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:79:7: ^( XOR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:79:13: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:79:26: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:80:4: ^( AND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND47=(Object)match(input,AND,FOLLOW_AND_in_andterm669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND47);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR48=(Object)match(input,OR,FOLLOW_OR_in_andterm672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR48);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm676);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm680);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm685);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, z, x, z, AND, y, AND
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
                    // 81:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:81:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:81:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:81:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:82:4: ^( AND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND49=(Object)match(input,AND,FOLLOW_AND_in_andterm724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND49);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm728);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR50=(Object)match(input,OR,FOLLOW_OR_in_andterm731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR50);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm735);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm739);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, x, y, z, AND, z, OR
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
                    // 83:4: -> ^( OR ^( AND $x $z) ^( AND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:83:7: ^( OR ^( AND $x $z) ^( AND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:83:12: ^( AND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:83:25: ^( AND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:84:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND51=(Object)match(input,AND,FOLLOW_AND_in_andterm778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND51);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND52=(Object)match(input,AND,FOLLOW_AND_in_andterm781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND52);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_andterm785);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_andterm789);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm794);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, m1, m1, n1, AND, m1, z, n1, AND, n1, z
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
                    // 85:4: -> ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:7: ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:13: ^( AND $n1 ^( AND $m1 $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:23: ^( AND $m1 $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_m1.nextTree());
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:38: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:44: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:51: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:62: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:78: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:89: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:85:96: ^( NOT $n1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_5);

                        adaptor.addChild(root_5, stream_n1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:86:4: ^( AND x= tt y= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND53=(Object)match(input,AND,FOLLOW_AND_in_andterm873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND53);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm877);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm881);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, y, x, x, x, y
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
                    // 87:4: -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:7: ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:13: ^( PAND $x $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:27: ^( XOR ^( PAND $y $x) ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:33: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:87:47: ^( SAND $x $y)
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
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:88:4: ^( AND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND54=(Object)match(input,AND,FOLLOW_AND_in_andterm933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND54_tree = (Object)adaptor.dupNode(AND54);

                    root_1 = (Object)adaptor.becomeRoot(AND54_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm935);
                    tt55=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt55.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_andterm937);
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

    public static class negandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:91:1: negandterm : ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) );
    public final tftacrules.negandterm_return negandterm() throws RecognitionException {
        tftacrules.negandterm_return retval = new tftacrules.negandterm_return();
        retval.start = input.LT(1);
        int negandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND57=null;
        Object OR58=null;
        Object AND59=null;
        Object XOR60=null;
        Object AND61=null;
        Object OR62=null;
        Object AND63=null;
        Object XOR64=null;
        Object AND65=null;
        Object OR66=null;
        Object AND67=null;
        Object XOR68=null;
        Object AND69=null;
        Object OR70=null;
        Object AND71=null;
        Object XOR72=null;
        Object AND73=null;
        Object AND74=null;
        Object AND75=null;
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

        tftacrules.notterm_return notterm76 = null;

        tftacrules.metaPandSandAE_return metaPandSandAE77 = null;


        Object AND57_tree=null;
        Object OR58_tree=null;
        Object AND59_tree=null;
        Object XOR60_tree=null;
        Object AND61_tree=null;
        Object OR62_tree=null;
        Object AND63_tree=null;
        Object XOR64_tree=null;
        Object AND65_tree=null;
        Object OR66_tree=null;
        Object AND67_tree=null;
        Object XOR68_tree=null;
        Object AND69_tree=null;
        Object OR70_tree=null;
        Object AND71_tree=null;
        Object XOR72_tree=null;
        Object AND73_tree=null;
        Object AND74_tree=null;
        Object AND75_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:2: ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:4: ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND57=(Object)match(input,AND,FOLLOW_AND_in_negandterm951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND57);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR58=(Object)match(input,OR,FOLLOW_OR_in_negandterm954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR58);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm958);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm962);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm967);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, AND, OR, z1, AND, x, z1
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
                    // 93:4: -> ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:7: ^( OR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:12: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:93:26: ^( AND $y $z1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:94:4: ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND59=(Object)match(input,AND,FOLLOW_AND_in_negandterm1003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND59);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR60=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR60);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1010);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1014);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_negandterm1019);
                    z1=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pandterm.add(z1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: x, AND, AND, y, XOR, z1, z1
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
                    // 95:4: -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:95:7: ^( XOR ^( AND $x $z1) ^( AND $y $z1) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:95:13: ^( AND $x $z1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:95:27: ^( AND $y $z1)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:96:4: ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND61=(Object)match(input,AND,FOLLOW_AND_in_negandterm1055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND61);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR62=(Object)match(input,OR,FOLLOW_OR_in_negandterm1058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR62);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1062);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1066);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1071);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, z2, x, OR, AND, y, z2
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
                    // 97:4: -> ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:97:7: ^( OR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:97:12: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:97:26: ^( AND $y $z2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:98:4: ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND63=(Object)match(input,AND,FOLLOW_AND_in_negandterm1107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND63);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR64=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR64);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1114);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1118);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_negandterm1123);
                    z2=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sandterm.add(z2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z2, XOR, AND, AND, y, z2, x
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
                    // 99:4: -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:99:7: ^( XOR ^( AND $x $z2) ^( AND $y $z2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:99:13: ^( AND $x $z2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:99:27: ^( AND $y $z2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:100:4: ^( AND ^( OR x= notterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND65=(Object)match(input,AND,FOLLOW_AND_in_negandterm1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND65);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR66=(Object)match(input,OR,FOLLOW_OR_in_negandterm1162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR66);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1166);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1170);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1175);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z3, AND, z3, AND, y, x, OR
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
                    // 101:4: -> ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:101:7: ^( OR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:101:12: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:101:26: ^( AND $y $z3)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:4: ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND67=(Object)match(input,AND,FOLLOW_AND_in_negandterm1211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND67);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR68=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR68);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1218);
                    x=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_negandterm1222);
                    y=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_negatedterm.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_negandterm1227);
                    z3=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(z3.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, XOR, y, z3, z3, AND, x
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
                    // 103:4: -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:103:7: ^( XOR ^( AND $x $z3) ^( AND $y $z3) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:103:13: ^( AND $x $z3)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:103:27: ^( AND $y $z3)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:104:4: ^( AND n1= notterm ^( OR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND69=(Object)match(input,AND,FOLLOW_AND_in_negandterm1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND69);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1267);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR70=(Object)match(input,OR,FOLLOW_OR_in_negandterm1270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR70);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1274);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1278);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: t2, n1, t1, n1, AND, OR, AND
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
                    // 105:4: -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:105:7: ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:105:12: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:105:28: ^( AND $n1 $t2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:106:4: ^( AND n1= notterm ^( XOR t1= tt t2= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND71=(Object)match(input,AND,FOLLOW_AND_in_negandterm1318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND71);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1322);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR72=(Object)match(input,XOR,FOLLOW_XOR_in_negandterm1325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR72);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1329);
                    t1=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_negandterm1333);
                    t2=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(t2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, n1, AND, n1, XOR, t1, t2
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
                    // 107:4: -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:107:7: ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:107:13: ^( AND $n1 $t1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        adaptor.addChild(root_2, stream_t1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:107:29: ^( AND $n1 $t2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:108:4: ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND73=(Object)match(input,AND,FOLLOW_AND_in_negandterm1372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND73);



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
                    AND74=(Object)match(input,AND,FOLLOW_AND_in_negandterm1379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND74);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1383);
                    n2=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n2.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1387);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: n1, AND, n2, AND, m1
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
                    // 109:4: -> ^( AND ^( AND $n1 $n2) $m1)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:109:7: ^( AND ^( AND $n1 $n2) $m1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:109:13: ^( AND $n1 $n2)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:110:4: ^( AND notterm metaPandSandAE )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND75=(Object)match(input,AND,FOLLOW_AND_in_negandterm1417); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND75_tree = (Object)adaptor.dupNode(AND75);

                    root_1 = (Object)adaptor.becomeRoot(AND75_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negandterm1419);
                    notterm76=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, notterm76.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_negandterm1421);
                    metaPandSandAE77=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, metaPandSandAE77.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, negandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negandterm"

    public static class negatedterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negatedterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:113:1: negatedterm : ( negandterm | notterm );
    public final tftacrules.negatedterm_return negatedterm() throws RecognitionException {
        tftacrules.negatedterm_return retval = new tftacrules.negatedterm_return();
        retval.start = input.LT(1);
        int negatedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrules.negandterm_return negandterm78 = null;

        tftacrules.notterm_return notterm79 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:2: ( negandterm | notterm )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AND) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred35_tftacrules()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=OR && LA6_0<=XOR)||LA6_0==NOT) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:4: negandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negandterm_in_negatedterm1435);
                    negandterm78=negandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negandterm78.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:115:4: notterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_negatedterm1440);
                    notterm79=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, notterm79.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, negatedterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negatedterm"

    public static class metaPandSandAE_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaPandSandAE"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:118:1: metaPandSandAE : ( pandterm | sandterm | andterm | ae );
    public final tftacrules.metaPandSandAE_return metaPandSandAE() throws RecognitionException {
        tftacrules.metaPandSandAE_return retval = new tftacrules.metaPandSandAE_return();
        retval.start = input.LT(1);
        int metaPandSandAE_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacrules.pandterm_return pandterm80 = null;

        tftacrules.sandterm_return sandterm81 = null;

        tftacrules.andterm_return andterm82 = null;

        tftacrules.ae_return ae83 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:119:2: ( pandterm | sandterm | andterm | ae )
            int alt7=4;
            switch ( input.LA(1) ) {
            case PAND:
                {
                alt7=1;
                }
                break;
            case SAND:
                {
                alt7=2;
                }
                break;
            case AND:
                {
                alt7=3;
                }
                break;
            case ID:
            case TRUE:
            case FALSE:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:119:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_metaPandSandAE1452);
                    pandterm80=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm80.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:120:4: sandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_sandterm_in_metaPandSandAE1457);
                    sandterm81=sandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, sandterm81.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:121:4: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_metaPandSandAE1462);
                    andterm82=andterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, andterm82.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:122:4: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_metaPandSandAE1467);
                    ae83=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ae83.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, metaPandSandAE_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "metaPandSandAE"

    public static class orterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:125:1: orterm : ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) );
    public final tftacrules.orterm_return orterm() throws RecognitionException {
        tftacrules.orterm_return retval = new tftacrules.orterm_return();
        retval.start = input.LT(1);
        int orterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR84=null;
        Object TRUE86=null;
        Object OR87=null;
        Object TRUE88=null;
        Object wildcard89=null;
        Object OR90=null;
        Object FALSE91=null;
        Object OR92=null;
        Object FALSE93=null;
        Object OR94=null;
        tftacrules.ae_return a = null;

        tftacrules.ae_return ae85 = null;

        tftacrules.tt_return tt95 = null;

        tftacrules.tt_return tt96 = null;


        Object OR84_tree=null;
        Object TRUE86_tree=null;
        Object OR87_tree=null;
        Object TRUE88_tree=null;
        Object wildcard89_tree=null;
        Object OR90_tree=null;
        Object FALSE91_tree=null;
        Object OR92_tree=null;
        Object FALSE93_tree=null;
        Object OR94_tree=null;
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:125:8: ( ^( OR ae TRUE ) -> TRUE | ^( OR TRUE . ) -> TRUE | ^( OR FALSE a= ae ) -> $a | ^( OR a= ae FALSE ) -> $a | ^( OR tt tt ) )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==OR) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred39_tftacrules()) ) {
                    alt8=1;
                }
                else if ( (synpred40_tftacrules()) ) {
                    alt8=2;
                }
                else if ( (synpred41_tftacrules()) ) {
                    alt8=3;
                }
                else if ( (synpred42_tftacrules()) ) {
                    alt8=4;
                }
                else if ( (true) ) {
                    alt8=5;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:125:10: ^( OR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR84=(Object)match(input,OR,FOLLOW_OR_in_orterm1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR84);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1481);
                    ae85=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae85.getTree());
                    _last = (Object)input.LT(1);
                    TRUE86=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE86);


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
                    // 126:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:127:4: ^( OR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR87=(Object)match(input,OR,FOLLOW_OR_in_orterm1498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR87);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE88=(Object)match(input,TRUE,FOLLOW_TRUE_in_orterm1500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE88);

                    wildcard89=(Object)input.LT(1);
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
                    // 128:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:129:4: ^( OR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR90=(Object)match(input,OR,FOLLOW_OR_in_orterm1516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR90);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE91=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE91);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1522);
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
                    // 130:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:131:4: ^( OR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR92=(Object)match(input,OR,FOLLOW_OR_in_orterm1537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR92);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_orterm1541);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE93=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm1543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE93);


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
                    // 132:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:133:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR94=(Object)match(input,OR,FOLLOW_OR_in_orterm1558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR94_tree = (Object)adaptor.dupNode(OR94);

                    root_1 = (Object)adaptor.becomeRoot(OR94_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1560);
                    tt95=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt95.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_orterm1562);
                    tt96=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt96.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, orterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orterm"

    public static class xorterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xorterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:136:1: xorterm : ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) );
    public final tftacrules.xorterm_return xorterm() throws RecognitionException {
        tftacrules.xorterm_return retval = new tftacrules.xorterm_return();
        retval.start = input.LT(1);
        int xorterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR97=null;
        Object TRUE99=null;
        Object XOR100=null;
        Object TRUE101=null;
        Object wildcard102=null;
        Object XOR103=null;
        Object FALSE104=null;
        Object XOR105=null;
        Object FALSE106=null;
        Object XOR107=null;
        tftacrules.ae_return a = null;

        tftacrules.ae_return ae98 = null;

        tftacrules.tt_return tt108 = null;

        tftacrules.tt_return tt109 = null;


        Object XOR97_tree=null;
        Object TRUE99_tree=null;
        Object XOR100_tree=null;
        Object TRUE101_tree=null;
        Object wildcard102_tree=null;
        Object XOR103_tree=null;
        Object FALSE104_tree=null;
        Object XOR105_tree=null;
        Object FALSE106_tree=null;
        Object XOR107_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_TRUE=new RewriteRuleNodeStream(adaptor,"token TRUE");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:136:9: ( ^( XOR ae TRUE ) -> TRUE | ^( XOR TRUE . ) -> TRUE | ^( XOR FALSE a= ae ) -> $a | ^( XOR a= ae FALSE ) -> $a | ^( XOR tt tt ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==XOR) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred43_tftacrules()) ) {
                    alt9=1;
                }
                else if ( (synpred44_tftacrules()) ) {
                    alt9=2;
                }
                else if ( (synpred45_tftacrules()) ) {
                    alt9=3;
                }
                else if ( (synpred46_tftacrules()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:136:11: ^( XOR ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR97=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR97);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1577);
                    ae98=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae98.getTree());
                    _last = (Object)input.LT(1);
                    TRUE99=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE99);


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
                    // 137:5: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:138:4: ^( XOR TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR100=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR100);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE101=(Object)match(input,TRUE,FOLLOW_TRUE_in_xorterm1596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE101);

                    wildcard102=(Object)input.LT(1);
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
                    // 139:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:140:4: ^( XOR FALSE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR103=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR103);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE104=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE104);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1618);
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
                    // 141:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:142:4: ^( XOR a= ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR105=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR105);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_xorterm1637);
                    a=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE106=(Object)match(input,FALSE,FOLLOW_FALSE_in_xorterm1639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE106);


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
                    // 143:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:144:4: ^( XOR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR107=(Object)match(input,XOR,FOLLOW_XOR_in_xorterm1654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR107_tree = (Object)adaptor.dupNode(XOR107);

                    root_1 = (Object)adaptor.becomeRoot(XOR107_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1656);
                    tt108=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt108.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_xorterm1658);
                    tt109=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt109.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, xorterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "xorterm"

    public static class pandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:147:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $y) ^( PAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( PAND $x ^( SAND $y $z) ) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( AND $n1 ^( PAND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) ) | ^( PAND tt tt ) );
    public final tftacrules.pandterm_return pandterm() throws RecognitionException {
        tftacrules.pandterm_return retval = new tftacrules.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND110=null;
        Object FALSE112=null;
        Object PAND113=null;
        Object FALSE114=null;
        Object wildcard115=null;
        Object PAND116=null;
        Object TRUE118=null;
        Object PAND119=null;
        Object TRUE120=null;
        Object PAND121=null;
        Object XOR122=null;
        Object PAND123=null;
        Object XOR124=null;
        Object PAND125=null;
        Object OR126=null;
        Object PAND127=null;
        Object OR128=null;
        Object PAND129=null;
        Object PAND130=null;
        Object PAND131=null;
        Object AND132=null;
        Object PAND133=null;
        Object AND134=null;
        Object PAND135=null;
        tftacrules.ae_return a = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;

        tftacrules.notterm_return b = null;

        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.ae_return ae111 = null;

        tftacrules.ae_return ae117 = null;

        tftacrules.tt_return tt136 = null;

        tftacrules.tt_return tt137 = null;


        Object PAND110_tree=null;
        Object FALSE112_tree=null;
        Object PAND113_tree=null;
        Object FALSE114_tree=null;
        Object wildcard115_tree=null;
        Object PAND116_tree=null;
        Object TRUE118_tree=null;
        Object PAND119_tree=null;
        Object TRUE120_tree=null;
        Object PAND121_tree=null;
        Object XOR122_tree=null;
        Object PAND123_tree=null;
        Object XOR124_tree=null;
        Object PAND125_tree=null;
        Object OR126_tree=null;
        Object PAND127_tree=null;
        Object OR128_tree=null;
        Object PAND129_tree=null;
        Object PAND130_tree=null;
        Object PAND131_tree=null;
        Object AND132_tree=null;
        Object PAND133_tree=null;
        Object AND134_tree=null;
        Object PAND135_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:147:9: ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $y) ^( PAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( PAND $x ^( SAND $y $z) ) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( AND $n1 ^( PAND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) ) | ^( PAND tt tt ) )
            int alt10=12;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:147:11: ^( PAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND110=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND110);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1672);
                    ae111=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae111.getTree());
                    _last = (Object)input.LT(1);
                    FALSE112=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE112);


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
                    // 148:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:149:4: ^( PAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND113=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND113);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE114=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm1691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE114);

                    wildcard115=(Object)input.LT(1);
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
                    // 150:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:151:4: ^( PAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND116=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND116);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1709);
                    ae117=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae117.getTree());
                    _last = (Object)input.LT(1);
                    TRUE118=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE118);


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
                    // 152:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:153:4: ^( PAND TRUE a= ae )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND119=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND119);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE120=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandterm1728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE120);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_pandterm1732);
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
                    // 154:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:155:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND121=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND121);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR122=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR122);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1754);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1758);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1763);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, PAND, z, x, XOR, y, z
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
                    // 156:4: -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:156:7: ^( XOR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:156:13: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:156:27: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND123=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND123);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1804);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR124=(Object)match(input,XOR,FOLLOW_XOR_in_pandterm1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR124);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1811);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1815);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, z, PAND, XOR, z, y, x
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
                    // 158:4: -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:158:7: ^( XOR ^( PAND $z $x) ^( PAND $z $y) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:158:13: ^( PAND $z $x)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_z.nextTree());
                        adaptor.addChild(root_2, stream_x.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:158:27: ^( PAND $z $y)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:159:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND125=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND125);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR126=(Object)match(input,OR,FOLLOW_OR_in_pandterm1857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR126);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1861);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1865);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1870);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, z, z, y, x, PAND, OR
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
                    // 160:4: -> ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:160:7: ^( OR ^( PAND $x $z) ^( PAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:160:12: ^( PAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:160:26: ^( PAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:161:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND127=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND127);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1911);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR128=(Object)match(input,OR,FOLLOW_OR_in_pandterm1914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR128);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1918);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm1922);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, x, z, y, z, x, z, PAND, y, y, x, PAND
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
                    // 162:4: -> ^( XOR ^( AND ^( NOT $y) ^( PAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( PAND $x ^( SAND $y $z) ) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:7: ^( XOR ^( AND ^( NOT $y) ^( PAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( PAND $x ^( SAND $y $z) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:13: ^( AND ^( NOT $y) ^( PAND $z $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:20: ^( NOT $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:30: ^( PAND $z $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_z.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:46: ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( PAND $x ^( SAND $y $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:52: ^( AND ^( NOT $x) ^( PAND $z $y) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:59: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:69: ^( PAND $z $y)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_z.nextTree());
                        adaptor.addChild(root_4, stream_y.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:84: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:162:94: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:163:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND129=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND129);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2010);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND130=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND130);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2017);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2021);
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
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_z=new RewriteRuleSubtreeStream(adaptor,"token z",z!=null?z.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:4: -> ^( PAND ^( AND $x $z) $y)
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:164:7: ^( PAND ^( AND $x $z) $y)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:164:14: ^( AND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:165:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND131=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND131);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2055);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND132=(Object)match(input,AND,FOLLOW_AND_in_pandterm2058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND132);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2062);
                    b=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(b.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2066);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, b, AND, x, PAND
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
                    // 166:4: -> ^( AND $b ^( PAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:166:7: ^( AND $b ^( PAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:166:16: ^( PAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:167:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND133=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND133);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND134=(Object)match(input,AND,FOLLOW_AND_in_pandterm2099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND134);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_pandterm2103);
                    n1=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(n1.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_metaPandSandAE_in_pandterm2107);
                    m1=metaPandSandAE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaPandSandAE.add(m1.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2112);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: m1, z, PAND, n1, m1, n1, PAND, z, z, PAND, PAND, m1, n1, AND
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
                    // 168:4: -> ^( XOR ^( AND $n1 ^( PAND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:7: ^( XOR ^( AND $n1 ^( PAND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:13: ^( AND $n1 ^( PAND $m1 $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_n1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:23: ^( PAND $m1 $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_m1.nextTree());
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:39: ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:45: ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:52: ^( PAND $m1 ^( NOT $n1) )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:63: ^( NOT $n1)
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:79: ^( PAND $m1 ^( SAND ^( NOT $n1) $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_m1.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:90: ^( SAND ^( NOT $n1) $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_4);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:168:97: ^( NOT $n1)
                        {
                        Object root_5 = (Object)adaptor.nil();
                        root_5 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_5);

                        adaptor.addChild(root_5, stream_n1.nextTree());

                        adaptor.addChild(root_4, root_5);
                        }
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:169:4: ^( PAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND135=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm2191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND135_tree = (Object)adaptor.dupNode(PAND135);

                    root_1 = (Object)adaptor.becomeRoot(PAND135_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2193);
                    tt136=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt136.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_pandterm2195);
                    tt137=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt137.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, pandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandterm"

    public static class sandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $y) ^( SAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND ^( NOT $y) ^( SAND $x $z) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );
    public final tftacrules.sandterm_return sandterm() throws RecognitionException {
        tftacrules.sandterm_return retval = new tftacrules.sandterm_return();
        retval.start = input.LT(1);
        int sandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND138=null;
        Object FALSE140=null;
        Object SAND141=null;
        Object FALSE142=null;
        Object wildcard143=null;
        Object SAND144=null;
        Object TRUE145=null;
        Object TRUE146=null;
        Object SAND147=null;
        Object TRUE149=null;
        Object SAND150=null;
        Object TRUE151=null;
        Object wildcard152=null;
        Object SAND153=null;
        Object XOR154=null;
        Object SAND155=null;
        Object XOR156=null;
        Object SAND157=null;
        Object OR158=null;
        Object SAND159=null;
        Object OR160=null;
        Object SAND161=null;
        Object PAND162=null;
        Object SAND163=null;
        Object PAND164=null;
        Object SAND165=null;
        Object AND166=null;
        Object SAND167=null;
        Object AND168=null;
        Object SAND169=null;
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;

        tftacrules.notterm_return a = null;

        tftacrules.ae_return ae139 = null;

        tftacrules.ae_return ae148 = null;

        tftacrules.tt_return tt170 = null;

        tftacrules.tt_return tt171 = null;


        Object SAND138_tree=null;
        Object FALSE140_tree=null;
        Object SAND141_tree=null;
        Object FALSE142_tree=null;
        Object wildcard143_tree=null;
        Object SAND144_tree=null;
        Object TRUE145_tree=null;
        Object TRUE146_tree=null;
        Object SAND147_tree=null;
        Object TRUE149_tree=null;
        Object SAND150_tree=null;
        Object TRUE151_tree=null;
        Object wildcard152_tree=null;
        Object SAND153_tree=null;
        Object XOR154_tree=null;
        Object SAND155_tree=null;
        Object XOR156_tree=null;
        Object SAND157_tree=null;
        Object OR158_tree=null;
        Object SAND159_tree=null;
        Object OR160_tree=null;
        Object SAND161_tree=null;
        Object PAND162_tree=null;
        Object SAND163_tree=null;
        Object PAND164_tree=null;
        Object SAND165_tree=null;
        Object AND166_tree=null;
        Object SAND167_tree=null;
        Object AND168_tree=null;
        Object SAND169_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:9: ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $y) ^( SAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND ^( NOT $y) ^( SAND $x $z) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) )
            int alt11=14;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:11: ^( SAND ae FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND138=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND138);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2209);
                    ae139=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae139.getTree());
                    _last = (Object)input.LT(1);
                    FALSE140=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE140);


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
                    // 173:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:174:4: ^( SAND FALSE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND141=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND141);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE142=(Object)match(input,FALSE,FOLLOW_FALSE_in_sandterm2228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE142);

                    wildcard143=(Object)input.LT(1);
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
                    // 175:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:176:4: ^( SAND TRUE TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND144=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND144);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE145=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE145);

                    _last = (Object)input.LT(1);
                    TRUE146=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE146);


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
                    // 177:4: -> TRUE
                    {
                        adaptor.addChild(root_0, stream_TRUE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:4: ^( SAND ae TRUE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND147=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND147);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_ae_in_sandterm2264);
                    ae148=ae();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ae.add(ae148.getTree());
                    _last = (Object)input.LT(1);
                    TRUE149=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE149);


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
                    // 179:5: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:180:4: ^( SAND TRUE . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND150=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND150);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    TRUE151=(Object)match(input,TRUE,FOLLOW_TRUE_in_sandterm2283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE151);

                    wildcard152=(Object)input.LT(1);
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
                    // 181:4: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND153=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND153);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR154=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR154);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2306);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2310);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2315);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, SAND, z, SAND, XOR, x, y
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
                    // 183:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:183:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:183:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:183:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:184:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND155=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND155);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2356);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR156=(Object)match(input,XOR,FOLLOW_XOR_in_sandterm2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR156);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2363);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2367);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, SAND, z, x, SAND, y, XOR
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
                    // 185:4: -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:185:7: ^( XOR ^( SAND $x $z) ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:185:13: ^( SAND $x $z)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_z.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:185:27: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:186:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND157=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND157);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2409);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR158=(Object)match(input,OR,FOLLOW_OR_in_sandterm2412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR158);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2416);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2420);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, x, x, z, SAND, y, SAND, SAND, SAND, z, y, x, z
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
                    // 187:4: -> ^( XOR ^( AND ^( NOT $y) ^( SAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:7: ^( XOR ^( AND ^( NOT $y) ^( SAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:13: ^( AND ^( NOT $y) ^( SAND $z $x) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:20: ^( NOT $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:30: ^( SAND $z $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_z.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:46: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:52: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:59: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:69: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:84: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:187:94: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:188:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND159=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND159);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR160=(Object)match(input,OR,FOLLOW_OR_in_sandterm2507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR160);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2511);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2515);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2520);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: z, z, x, x, x, y, SAND, SAND, y, SAND, SAND, z, y
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
                    // 189:4: -> ^( XOR ^( AND ^( NOT $y) ^( SAND $x $z) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:7: ^( XOR ^( AND ^( NOT $y) ^( SAND $x $z) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:13: ^( AND ^( NOT $y) ^( SAND $x $z) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:20: ^( NOT $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:30: ^( SAND $x $z)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_z.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:46: ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:52: ^( AND ^( NOT $x) ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_3);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:59: ^( NOT $x)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_4);

                        adaptor.addChild(root_4, stream_x.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:69: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:84: ^( SAND $x ^( SAND $y $z) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:189:94: ^( SAND $y $z)
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_4);

                        adaptor.addChild(root_4, stream_y.nextTree());
                        adaptor.addChild(root_4, stream_z.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:190:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND161=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND161);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND162=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND162);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2610);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2614);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2619);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, z, x, PAND, SAND
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
                    // 191:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:191:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:191:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:192:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND163=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND163);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2652);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND164=(Object)match(input,PAND,FOLLOW_PAND_in_sandterm2655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND164);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2659);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2663);
                    y=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: y, z, x, SAND, PAND
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
                    // 193:4: -> ^( PAND $x ^( SAND $y $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:193:7: ^( PAND $x ^( SAND $y $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:193:17: ^( SAND $y $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:194:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND165=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND165);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2697);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND166=(Object)match(input,AND,FOLLOW_AND_in_sandterm2700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND166);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2704);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2708);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, SAND, x, z, a
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
                    // 195:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:195:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:195:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:196:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND167=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND167);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND168=(Object)match(input,AND,FOLLOW_AND_in_sandterm2741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND168);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_notterm_in_sandterm2745);
                    a=notterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_notterm.add(a.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2749);
                    z=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(z.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2754);
                    x=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tt.add(x.getTree());

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
                    // 197:4: -> ^( AND $a ^( SAND $x $z) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:7: ^( AND $a ^( SAND $x $z) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:197:16: ^( SAND $x $z)
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:198:4: ^( SAND tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND169=(Object)match(input,SAND,FOLLOW_SAND_in_sandterm2784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND169_tree = (Object)adaptor.dupNode(SAND169);

                    root_1 = (Object)adaptor.becomeRoot(SAND169_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2786);
                    tt170=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt170.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_tt_in_sandterm2788);
                    tt171=tt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, tt171.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, sandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sandterm"

    public static class ae_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:201:1: ae : ( ID | TRUE | FALSE );
    public final tftacrules.ae_return ae() throws RecognitionException {
        tftacrules.ae_return retval = new tftacrules.ae_return();
        retval.start = input.LT(1);
        int ae_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set172=null;

        Object set172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:201:6: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set172=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set172_tree = (Object)adaptor.dupNode(set172);

                adaptor.addChild(root_0, set172_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 12, ae_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ae"

    // $ANTLR start synpred1_tftacrules
    public final void synpred1_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:23:7: ( andterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:23:7: andterm
        {
        pushFollow(FOLLOW_andterm_in_synpred1_tftacrules65);
        andterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_tftacrules

    // $ANTLR start synpred2_tftacrules
    public final void synpred2_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:24:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:24:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred2_tftacrules70);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_tftacrules

    // $ANTLR start synpred9_tftacrules
    public final void synpred9_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:11: ( ^( NOT ^( AND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:11: ^( NOT ^( AND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred9_tftacrules175); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred9_tftacrules178); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred9_tftacrules182);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred9_tftacrules186);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:51:4: ( ^( NOT ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:51:4: ^( NOT ^( OR x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred10_tftacrules218); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred10_tftacrules221); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred10_tftacrules225);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred10_tftacrules229);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:53:4: ( ^( NOT ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:53:4: ^( NOT ^( XOR x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred11_tftacrules261); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred11_tftacrules264); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred11_tftacrules268);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred11_tftacrules272);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:55:4: ( ^( NOT ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:55:4: ^( NOT ^( PAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred12_tftacrules304); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred12_tftacrules307); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred12_tftacrules311);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred12_tftacrules315);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:58:4: ( ^( NOT ^( SAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:58:4: ^( NOT ^( SAND x= tt y= tt ) )
        {
        match(input,NOT,FOLLOW_NOT_in_synpred13_tftacrules370); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred13_tftacrules373); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred13_tftacrules377);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred13_tftacrules381);
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
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:70:11: ( ^( AND . FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:70:11: ^( AND . FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred17_tftacrules535); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred17_tftacrules539); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacrules

    // $ANTLR start synpred18_tftacrules
    public final void synpred18_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:72:4: ( ^( AND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:72:4: ^( AND FALSE . )
        {
        match(input,AND,FOLLOW_AND_in_synpred18_tftacrules554); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred18_tftacrules556); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacrules

    // $ANTLR start synpred19_tftacrules
    public final void synpred19_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:74:4: ( ^( AND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:74:4: ^( AND TRUE a= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred19_tftacrules572); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred19_tftacrules574); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred19_tftacrules578);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:76:4: ( ^( AND a= ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:76:4: ^( AND a= ae TRUE )
        {
        match(input,AND,FOLLOW_AND_in_synpred20_tftacrules593); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred20_tftacrules597);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred20_tftacrules599); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_tftacrules

    // $ANTLR start synpred21_tftacrules
    public final void synpred21_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:78:4: ( ^( AND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:78:4: ^( AND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred21_tftacrules614); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred21_tftacrules617); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrules621);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrules625);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred21_tftacrules630);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:80:4: ( ^( AND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:80:4: ^( AND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred22_tftacrules669); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred22_tftacrules672); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrules676);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrules680);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred22_tftacrules685);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:82:4: ( ^( AND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:82:4: ^( AND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred23_tftacrules724); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrules728);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred23_tftacrules731); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrules735);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred23_tftacrules739);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:84:4: ( ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:84:4: ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrules778); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred24_tftacrules781); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred24_tftacrules785);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred24_tftacrules789);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred24_tftacrules794);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_tftacrules

    // $ANTLR start synpred25_tftacrules
    public final void synpred25_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:86:4: ( ^( AND x= tt y= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:86:4: ^( AND x= tt y= tt )
        {
        match(input,AND,FOLLOW_AND_in_synpred25_tftacrules873); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrules877);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred25_tftacrules881);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_tftacrules

    // $ANTLR start synpred26_tftacrules
    public final void synpred26_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:92:4: ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred26_tftacrules951); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred26_tftacrules954); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred26_tftacrules958);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred26_tftacrules962);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred26_tftacrules967);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_tftacrules

    // $ANTLR start synpred27_tftacrules
    public final void synpred27_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.pandterm_return z1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:94:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:94:4: ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred27_tftacrules1003); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred27_tftacrules1006); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred27_tftacrules1010);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred27_tftacrules1014);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_pandterm_in_synpred27_tftacrules1019);
        z1=pandterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_tftacrules

    // $ANTLR start synpred28_tftacrules
    public final void synpred28_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return x = null;

        tftacrules.negatedterm_return y = null;

        tftacrules.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:96:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:96:4: ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred28_tftacrules1055); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred28_tftacrules1058); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred28_tftacrules1062);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred28_tftacrules1066);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred28_tftacrules1071);
        z2=sandterm();

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

        tftacrules.sandterm_return z2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:98:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:98:4: ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm )
        {
        match(input,AND,FOLLOW_AND_in_synpred29_tftacrules1107); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred29_tftacrules1110); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred29_tftacrules1114);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred29_tftacrules1118);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_sandterm_in_synpred29_tftacrules1123);
        z2=sandterm();

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

        tftacrules.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:100:4: ( ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:100:4: ^( AND ^( OR x= notterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred30_tftacrules1159); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred30_tftacrules1162); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred30_tftacrules1166);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred30_tftacrules1170);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred30_tftacrules1175);
        z3=ae();

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

        tftacrules.ae_return z3 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:4: ( ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:102:4: ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae )
        {
        match(input,AND,FOLLOW_AND_in_synpred31_tftacrules1211); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred31_tftacrules1214); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred31_tftacrules1218);
        x=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_negatedterm_in_synpred31_tftacrules1222);
        y=negatedterm();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred31_tftacrules1227);
        z3=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacrules

    // $ANTLR start synpred32_tftacrules
    public final void synpred32_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.tt_return t1 = null;

        tftacrules.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:104:4: ( ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:104:4: ^( AND n1= notterm ^( OR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred32_tftacrules1263); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred32_tftacrules1267);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred32_tftacrules1270); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred32_tftacrules1274);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred32_tftacrules1278);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacrules

    // $ANTLR start synpred33_tftacrules
    public final void synpred33_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.tt_return t1 = null;

        tftacrules.tt_return t2 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:106:4: ( ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:106:4: ^( AND n1= notterm ^( XOR t1= tt t2= tt ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred33_tftacrules1318); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred33_tftacrules1322);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred33_tftacrules1325); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred33_tftacrules1329);
        t1=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred33_tftacrules1333);
        t2=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacrules

    // $ANTLR start synpred34_tftacrules
    public final void synpred34_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.notterm_return n2 = null;

        tftacrules.metaPandSandAE_return m1 = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:108:4: ( ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:108:4: ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred34_tftacrules1372); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred34_tftacrules1376);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred34_tftacrules1379); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred34_tftacrules1383);
        n2=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred34_tftacrules1387);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_tftacrules

    // $ANTLR start synpred35_tftacrules
    public final void synpred35_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:4: ( negandterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:114:4: negandterm
        {
        pushFollow(FOLLOW_negandterm_in_synpred35_tftacrules1435);
        negandterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_tftacrules

    // $ANTLR start synpred39_tftacrules
    public final void synpred39_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:125:10: ( ^( OR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:125:10: ^( OR ae TRUE )
        {
        match(input,OR,FOLLOW_OR_in_synpred39_tftacrules1479); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred39_tftacrules1481);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred39_tftacrules1483); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_tftacrules

    // $ANTLR start synpred40_tftacrules
    public final void synpred40_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:127:4: ( ^( OR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:127:4: ^( OR TRUE . )
        {
        match(input,OR,FOLLOW_OR_in_synpred40_tftacrules1498); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred40_tftacrules1500); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_tftacrules

    // $ANTLR start synpred41_tftacrules
    public final void synpred41_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:129:4: ( ^( OR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:129:4: ^( OR FALSE a= ae )
        {
        match(input,OR,FOLLOW_OR_in_synpred41_tftacrules1516); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred41_tftacrules1518); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred41_tftacrules1522);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_tftacrules

    // $ANTLR start synpred42_tftacrules
    public final void synpred42_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:131:4: ( ^( OR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:131:4: ^( OR a= ae FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred42_tftacrules1537); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred42_tftacrules1541);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred42_tftacrules1543); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_tftacrules

    // $ANTLR start synpred43_tftacrules
    public final void synpred43_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:136:11: ( ^( XOR ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:136:11: ^( XOR ae TRUE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred43_tftacrules1575); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred43_tftacrules1577);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred43_tftacrules1579); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_tftacrules

    // $ANTLR start synpred44_tftacrules
    public final void synpred44_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:138:4: ( ^( XOR TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:138:4: ^( XOR TRUE . )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred44_tftacrules1594); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred44_tftacrules1596); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_tftacrules

    // $ANTLR start synpred45_tftacrules
    public final void synpred45_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:140:4: ( ^( XOR FALSE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:140:4: ^( XOR FALSE a= ae )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred45_tftacrules1612); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred45_tftacrules1614); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred45_tftacrules1618);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_tftacrules

    // $ANTLR start synpred46_tftacrules
    public final void synpred46_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:142:4: ( ^( XOR a= ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:142:4: ^( XOR a= ae FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred46_tftacrules1633); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred46_tftacrules1637);
        a=ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred46_tftacrules1639); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_tftacrules

    // $ANTLR start synpred47_tftacrules
    public final void synpred47_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:147:11: ( ^( PAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:147:11: ^( PAND ae FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred47_tftacrules1670); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred47_tftacrules1672);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred47_tftacrules1674); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_tftacrules

    // $ANTLR start synpred48_tftacrules
    public final void synpred48_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:149:4: ( ^( PAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:149:4: ^( PAND FALSE . )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred48_tftacrules1689); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred48_tftacrules1691); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacrules

    // $ANTLR start synpred49_tftacrules
    public final void synpred49_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:151:4: ( ^( PAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:151:4: ^( PAND ae TRUE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred49_tftacrules1707); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred49_tftacrules1709);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred49_tftacrules1711); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_tftacrules

    // $ANTLR start synpred50_tftacrules
    public final void synpred50_tftacrules_fragment() throws RecognitionException {   
        tftacrules.ae_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:153:4: ( ^( PAND TRUE a= ae ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:153:4: ^( PAND TRUE a= ae )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred50_tftacrules1726); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred50_tftacrules1728); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred50_tftacrules1732);
        a=ae();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_tftacrules

    // $ANTLR start synpred51_tftacrules
    public final void synpred51_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:155:4: ( ^( PAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:155:4: ^( PAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred51_tftacrules1747); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred51_tftacrules1750); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred51_tftacrules1754);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred51_tftacrules1758);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred51_tftacrules1763);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_tftacrules

    // $ANTLR start synpred52_tftacrules
    public final void synpred52_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:4: ( ^( PAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:157:4: ^( PAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred52_tftacrules1800); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred52_tftacrules1804);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred52_tftacrules1807); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred52_tftacrules1811);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred52_tftacrules1815);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_tftacrules

    // $ANTLR start synpred53_tftacrules
    public final void synpred53_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:159:4: ( ^( PAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:159:4: ^( PAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred53_tftacrules1854); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred53_tftacrules1857); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrules1861);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrules1865);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred53_tftacrules1870);
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


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:161:4: ( ^( PAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:161:4: ^( PAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred54_tftacrules1907); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrules1911);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred54_tftacrules1914); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrules1918);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred54_tftacrules1922);
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
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:163:4: ( ^( PAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:163:4: ^( PAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred55_tftacrules2006); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrules2010);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred55_tftacrules2013); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrules2017);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred55_tftacrules2021);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_tftacrules

    // $ANTLR start synpred56_tftacrules
    public final void synpred56_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.notterm_return b = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:165:4: ( ^( PAND x= tt ^( AND b= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:165:4: ^( PAND x= tt ^( AND b= notterm z= tt ) )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred56_tftacrules2051); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrules2055);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred56_tftacrules2058); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred56_tftacrules2062);
        b=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred56_tftacrules2066);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_tftacrules

    // $ANTLR start synpred57_tftacrules
    public final void synpred57_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return n1 = null;

        tftacrules.metaPandSandAE_return m1 = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:167:4: ( ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:167:4: ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred57_tftacrules2096); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred57_tftacrules2099); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred57_tftacrules2103);
        n1=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaPandSandAE_in_synpred57_tftacrules2107);
        m1=metaPandSandAE();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred57_tftacrules2112);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_tftacrules

    // $ANTLR start synpred58_tftacrules
    public final void synpred58_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:11: ( ^( SAND ae FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:172:11: ^( SAND ae FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred58_tftacrules2207); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred58_tftacrules2209);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred58_tftacrules2211); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_tftacrules

    // $ANTLR start synpred59_tftacrules
    public final void synpred59_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:174:4: ( ^( SAND FALSE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:174:4: ^( SAND FALSE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred59_tftacrules2226); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred59_tftacrules2228); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacrules

    // $ANTLR start synpred60_tftacrules
    public final void synpred60_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:176:4: ( ^( SAND TRUE TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:176:4: ^( SAND TRUE TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred60_tftacrules2244); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred60_tftacrules2246); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred60_tftacrules2248); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_tftacrules

    // $ANTLR start synpred61_tftacrules
    public final void synpred61_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:4: ( ^( SAND ae TRUE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:178:4: ^( SAND ae TRUE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred61_tftacrules2262); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_ae_in_synpred61_tftacrules2264);
        ae();

        state._fsp--;
        if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred61_tftacrules2266); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_tftacrules

    // $ANTLR start synpred62_tftacrules
    public final void synpred62_tftacrules_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:180:4: ( ^( SAND TRUE . ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:180:4: ^( SAND TRUE . )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred62_tftacrules2281); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,TRUE,FOLLOW_TRUE_in_synpred62_tftacrules2283); if (state.failed) return ;
        matchAny(input); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_tftacrules

    // $ANTLR start synpred63_tftacrules
    public final void synpred63_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:4: ( ^( SAND ^( XOR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:182:4: ^( SAND ^( XOR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred63_tftacrules2299); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred63_tftacrules2302); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrules2306);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrules2310);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred63_tftacrules2315);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacrules

    // $ANTLR start synpred64_tftacrules
    public final void synpred64_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:184:4: ( ^( SAND z= tt ^( XOR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:184:4: ^( SAND z= tt ^( XOR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred64_tftacrules2352); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrules2356);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred64_tftacrules2359); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrules2363);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred64_tftacrules2367);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_tftacrules

    // $ANTLR start synpred65_tftacrules
    public final void synpred65_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:186:4: ( ^( SAND z= tt ^( OR x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:186:4: ^( SAND z= tt ^( OR x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred65_tftacrules2405); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrules2409);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred65_tftacrules2412); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrules2416);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred65_tftacrules2420);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_tftacrules

    // $ANTLR start synpred66_tftacrules
    public final void synpred66_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:188:4: ( ^( SAND ^( OR x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:188:4: ^( SAND ^( OR x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred66_tftacrules2504); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred66_tftacrules2507); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrules2511);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrules2515);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred66_tftacrules2520);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacrules

    // $ANTLR start synpred67_tftacrules
    public final void synpred67_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:190:4: ( ^( SAND ^( PAND x= tt y= tt ) z= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:190:4: ^( SAND ^( PAND x= tt y= tt ) z= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred67_tftacrules2603); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred67_tftacrules2606); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrules2610);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrules2614);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred67_tftacrules2619);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_tftacrules

    // $ANTLR start synpred68_tftacrules
    public final void synpred68_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;

        tftacrules.tt_return y = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:192:4: ( ^( SAND z= tt ^( PAND x= tt y= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:192:4: ^( SAND z= tt ^( PAND x= tt y= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred68_tftacrules2648); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrules2652);
        z=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred68_tftacrules2655); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrules2659);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred68_tftacrules2663);
        y=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_tftacrules

    // $ANTLR start synpred69_tftacrules
    public final void synpred69_tftacrules_fragment() throws RecognitionException {   
        tftacrules.tt_return x = null;

        tftacrules.notterm_return a = null;

        tftacrules.tt_return z = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:194:4: ( ^( SAND x= tt ^( AND a= notterm z= tt ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:194:4: ^( SAND x= tt ^( AND a= notterm z= tt ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred69_tftacrules2693); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrules2697);
        x=tt();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred69_tftacrules2700); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred69_tftacrules2704);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred69_tftacrules2708);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_tftacrules

    // $ANTLR start synpred70_tftacrules
    public final void synpred70_tftacrules_fragment() throws RecognitionException {   
        tftacrules.notterm_return a = null;

        tftacrules.tt_return z = null;

        tftacrules.tt_return x = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:196:4: ( ^( SAND ^( AND a= notterm z= tt ) x= tt ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:196:4: ^( SAND ^( AND a= notterm z= tt ) x= tt )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred70_tftacrules2738); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred70_tftacrules2741); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_notterm_in_synpred70_tftacrules2745);
        a=notterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrules2749);
        z=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        pushFollow(FOLLOW_tt_in_synpred70_tftacrules2754);
        x=tt();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacrules

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
    public final boolean synpred1_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_tftacrules_fragment(); // can never throw exception
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
    public final boolean synpred39_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_tftacrules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_tftacrules_fragment(); // can never throw exception
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
    public final boolean synpred40_tftacrules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_tftacrules_fragment(); // can never throw exception
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
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\4\1\0\10\uffff";
    static final String DFA1_maxS =
        "\1\16\1\0\10\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\2";
    static final String DFA1_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\5\1\1\1\3\1\4\1\6\2\uffff\1\7\2\6",
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
            return "23:1: tt : ( andterm | negandterm | orterm | pandterm | sandterm | xorterm | ae | ^( NOT ^( NOT a1= tt ) ) -> $a1);";
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
                        if ( (synpred1_tftacrules()) ) {s = 8;}

                        else if ( (synpred2_tftacrules()) ) {s = 9;}

                         
                        input.seek(index1_1);
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
            return "49:1: notterm : ( ^( NOT ^( AND x= tt y= tt ) ) -> ^( OR ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( OR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( XOR x= tt y= tt ) ) -> ^( AND ^( NOT $x) ^( NOT $y) ) | ^( NOT ^( PAND x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( AND ^( NOT $x) $y) ) | ^( NOT ^( SAND x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $x) ^( NOT $y) ) ^( XOR ^( AND ^( NOT $x) $y) ^( XOR ^( AND ^( NOT $y) $x) ^( XOR ^( PAND $y $x) ^( XOR ^( PAND $x $y) ) ) ) ) ) | ^( OR notterm notterm ) | ^( XOR notterm notterm ) | ^( AND notterm notterm ) | ^( NOT tt ) );";
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
            return "70:1: andterm : ( ^( AND . FALSE ) -> FALSE | ^( AND FALSE . ) -> FALSE | ^( AND TRUE a= ae ) -> $a | ^( AND a= ae TRUE ) -> $a | ^( AND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND z= tt ^( OR x= tt y= tt ) ) -> ^( OR ^( AND $x $z) ^( AND $y $z) ) | ^( AND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( AND $n1 ^( AND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) ) | ^( AND x= tt y= tt ) -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) ) | ^( AND tt tt ) );";
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
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\6\1\0\12\uffff";
    static final String DFA5_maxS =
        "\1\6\1\0\12\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA5_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA5_transitionS = {
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

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "91:1: negandterm : ( ^( AND ^( OR x= notterm y= negatedterm ) z1= pandterm ) -> ^( OR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z1= pandterm ) -> ^( XOR ^( AND $x $z1) ^( AND $y $z1) ) | ^( AND ^( OR x= notterm y= negatedterm ) z2= sandterm ) -> ^( OR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z2= sandterm ) -> ^( XOR ^( AND $x $z2) ^( AND $y $z2) ) | ^( AND ^( OR x= notterm y= negatedterm ) z3= ae ) -> ^( OR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND ^( XOR x= notterm y= negatedterm ) z3= ae ) -> ^( XOR ^( AND $x $z3) ^( AND $y $z3) ) | ^( AND n1= notterm ^( OR t1= tt t2= tt ) ) -> ^( OR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( XOR t1= tt t2= tt ) ) -> ^( XOR ^( AND $n1 $t1) ^( AND $n1 $t2) ) | ^( AND n1= notterm ^( AND n2= notterm m1= metaPandSandAE ) ) -> ^( AND ^( AND $n1 $n2) $m1) | ^( AND notterm metaPandSandAE ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_tftacrules()) ) {s = 2;}

                        else if ( (synpred27_tftacrules()) ) {s = 3;}

                        else if ( (synpred28_tftacrules()) ) {s = 4;}

                        else if ( (synpred29_tftacrules()) ) {s = 5;}

                        else if ( (synpred30_tftacrules()) ) {s = 6;}

                        else if ( (synpred31_tftacrules()) ) {s = 7;}

                        else if ( (synpred32_tftacrules()) ) {s = 8;}

                        else if ( (synpred33_tftacrules()) ) {s = 9;}

                        else if ( (synpred34_tftacrules()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
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
            return "147:1: pandterm : ( ^( PAND ae FALSE ) -> FALSE | ^( PAND FALSE . ) -> FALSE | ^( PAND ae TRUE ) -> FALSE | ^( PAND TRUE a= ae ) -> $a | ^( PAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( PAND $z $x) ^( PAND $z $y) ) | ^( PAND ^( OR x= tt y= tt ) z= tt ) -> ^( OR ^( PAND $x $z) ^( PAND $y $z) ) | ^( PAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $y) ^( PAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( PAND $z $y) ) ^( PAND $x ^( SAND $y $z) ) ) ) | ^( PAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND ^( AND $x $z) $y) | ^( PAND x= tt ^( AND b= notterm z= tt ) ) -> ^( AND $b ^( PAND $x $z) ) | ^( PAND ^( AND n1= notterm m1= metaPandSandAE ) z= tt ) -> ^( XOR ^( AND $n1 ^( PAND $m1 $z) ) ^( XOR ^( PAND ^( PAND $m1 ^( NOT $n1) ) $z) ^( PAND $m1 ^( SAND ^( NOT $n1) $z) ) ) ) | ^( PAND tt tt ) );";
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
                        if ( (synpred47_tftacrules()) ) {s = 2;}

                        else if ( (synpred48_tftacrules()) ) {s = 3;}

                        else if ( (synpred49_tftacrules()) ) {s = 4;}

                        else if ( (synpred50_tftacrules()) ) {s = 5;}

                        else if ( (synpred51_tftacrules()) ) {s = 6;}

                        else if ( (synpred52_tftacrules()) ) {s = 7;}

                        else if ( (synpred53_tftacrules()) ) {s = 8;}

                        else if ( (synpred54_tftacrules()) ) {s = 9;}

                        else if ( (synpred55_tftacrules()) ) {s = 10;}

                        else if ( (synpred56_tftacrules()) ) {s = 11;}

                        else if ( (synpred57_tftacrules()) ) {s = 12;}

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
            return "172:1: sandterm : ( ^( SAND ae FALSE ) -> FALSE | ^( SAND FALSE . ) -> FALSE | ^( SAND TRUE TRUE ) -> TRUE | ^( SAND ae TRUE ) -> FALSE | ^( SAND TRUE . ) -> FALSE | ^( SAND ^( XOR x= tt y= tt ) z= tt ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( XOR x= tt y= tt ) ) -> ^( XOR ^( SAND $x $z) ^( SAND $y $z) ) | ^( SAND z= tt ^( OR x= tt y= tt ) ) -> ^( XOR ^( AND ^( NOT $y) ^( SAND $z $x) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) ) | ^( SAND ^( OR x= tt y= tt ) z= tt ) -> ^( XOR ^( AND ^( NOT $y) ^( SAND $x $z) ) ^( XOR ^( AND ^( NOT $x) ^( SAND $y $z) ) ^( SAND $x ^( SAND $y $z) ) ) ) | ^( SAND ^( PAND x= tt y= tt ) z= tt ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND z= tt ^( PAND x= tt y= tt ) ) -> ^( PAND $x ^( SAND $y $z) ) | ^( SAND x= tt ^( AND a= notterm z= tt ) ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND ^( AND a= notterm z= tt ) x= tt ) -> ^( AND $a ^( SAND $x $z) ) | ^( SAND tt tt ) );";
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
                        if ( (synpred58_tftacrules()) ) {s = 2;}

                        else if ( (synpred59_tftacrules()) ) {s = 3;}

                        else if ( (synpred60_tftacrules()) ) {s = 4;}

                        else if ( (synpred61_tftacrules()) ) {s = 5;}

                        else if ( (synpred62_tftacrules()) ) {s = 6;}

                        else if ( (synpred63_tftacrules()) ) {s = 7;}

                        else if ( (synpred64_tftacrules()) ) {s = 8;}

                        else if ( (synpred65_tftacrules()) ) {s = 9;}

                        else if ( (synpred66_tftacrules()) ) {s = 10;}

                        else if ( (synpred67_tftacrules()) ) {s = 11;}

                        else if ( (synpred68_tftacrules()) ) {s = 12;}

                        else if ( (synpred69_tftacrules()) ) {s = 13;}

                        else if ( (synpred70_tftacrules()) ) {s = 14;}

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
 

    public static final BitSet FOLLOW_andterm_in_tt65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negandterm_in_tt70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orterm_in_tt75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_tt80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandterm_in_tt85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xorterm_in_tt90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_tt95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_tt101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_tt104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_tt108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_ce151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAND_in_ce158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ce_in_ce160 = new BitSet(new long[]{0x0000000000006300L});
    public static final BitSet FOLLOW_ce_in_ce162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_notterm178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm182 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_notterm221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm225 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_notterm264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm268 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_notterm307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm311 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_notterm373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm377 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_notterm381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_notterm484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm486 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_notterm495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm497 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_notterm506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_notterm508 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_notterm_in_notterm510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notterm517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_notterm519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm556 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_AND_in_andterm572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_andterm574 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_andterm578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_andterm597 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_andterm599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_andterm617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm621 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_andterm672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm676 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_andterm731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm735 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andterm781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_andterm785 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_andterm789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_andterm794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm877 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_andterm935 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_andterm937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm958 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1010 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_negandterm1019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1062 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1114 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_negandterm1123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_negandterm1162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1166 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_negandterm1214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1218 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_negandterm1222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_negandterm1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_negandterm1270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1274 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1322 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_negandterm1325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_negandterm1329 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_negandterm1333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_negandterm1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1383 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negandterm1417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_negandterm1419 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_negandterm1421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_negatedterm1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notterm_in_negatedterm1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_metaPandSandAE1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sandterm_in_metaPandSandAE1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_metaPandSandAE1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ae_in_metaPandSandAE1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_orterm1479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_orterm1483 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_orterm1500 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_OR_in_orterm1516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orterm1518 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_orterm1522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_orterm1541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orterm1543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm1558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_orterm1560 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_orterm1562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1577 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_xorterm1596 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_XOR_in_xorterm1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1614 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_xorterm1618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_xorterm1637 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_xorterm1639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xorterm1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_xorterm1656 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_xorterm1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1672 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandterm1691 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_PAND_in_pandterm1707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_pandterm1709 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_pandterm1728 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_pandterm1732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_pandterm1750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1754 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm1763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_pandterm1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1811 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_pandterm1857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1861 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm1870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm1907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_pandterm1914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm1918 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2010 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_pandterm2013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2017 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_pandterm2058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2062 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_pandterm2099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_pandterm2103 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_pandterm2107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_pandterm2112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm2191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_pandterm2193 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_pandterm2195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2209 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_sandterm2228 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_sandterm2264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_sandterm2283 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_sandterm2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_sandterm2302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2306 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_sandterm2359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2363 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_sandterm2412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2416 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_sandterm2507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2511 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_sandterm2606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2610 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2652 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_sandterm2655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2659 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_sandterm2700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2704 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_sandterm2741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_sandterm2745 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_sandterm2754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_sandterm2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_sandterm2786 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_sandterm2788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_ae0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_synpred1_tftacrules65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negandterm_in_synpred2_tftacrules70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_synpred9_tftacrules175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred9_tftacrules178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred9_tftacrules182 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred9_tftacrules186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred10_tftacrules218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred10_tftacrules221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred10_tftacrules225 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred10_tftacrules229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred11_tftacrules261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred11_tftacrules264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred11_tftacrules268 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred11_tftacrules272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred12_tftacrules304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred12_tftacrules307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrules311 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred12_tftacrules315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_synpred13_tftacrules370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred13_tftacrules373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred13_tftacrules377 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred13_tftacrules381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred17_tftacrules535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred17_tftacrules539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred18_tftacrules554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred18_tftacrules556 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_AND_in_synpred19_tftacrules572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred19_tftacrules574 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred19_tftacrules578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred20_tftacrules593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred20_tftacrules597 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred20_tftacrules599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred21_tftacrules614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred21_tftacrules617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrules621 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrules625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred21_tftacrules630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred22_tftacrules669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred22_tftacrules672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrules676 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrules680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred22_tftacrules685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred23_tftacrules724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrules728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred23_tftacrules731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrules735 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred23_tftacrules739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrules778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred24_tftacrules781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred24_tftacrules785 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred24_tftacrules789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred24_tftacrules794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred25_tftacrules873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrules877 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred25_tftacrules881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred26_tftacrules951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred26_tftacrules954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred26_tftacrules958 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred26_tftacrules962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred26_tftacrules967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred27_tftacrules1003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred27_tftacrules1006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred27_tftacrules1010 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred27_tftacrules1014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pandterm_in_synpred27_tftacrules1019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred28_tftacrules1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacrules1058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred28_tftacrules1062 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred28_tftacrules1066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred28_tftacrules1071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred29_tftacrules1107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred29_tftacrules1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred29_tftacrules1114 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred29_tftacrules1118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sandterm_in_synpred29_tftacrules1123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred30_tftacrules1159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred30_tftacrules1162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred30_tftacrules1166 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred30_tftacrules1170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred30_tftacrules1175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred31_tftacrules1211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred31_tftacrules1214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred31_tftacrules1218 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_negatedterm_in_synpred31_tftacrules1222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_synpred31_tftacrules1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred32_tftacrules1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred32_tftacrules1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred32_tftacrules1270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred32_tftacrules1274 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred32_tftacrules1278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred33_tftacrules1318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred33_tftacrules1322 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred33_tftacrules1325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred33_tftacrules1329 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred33_tftacrules1333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacrules1372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred34_tftacrules1376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacrules1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred34_tftacrules1383 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred34_tftacrules1387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_negandterm_in_synpred35_tftacrules1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred39_tftacrules1479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred39_tftacrules1481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred39_tftacrules1483 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred40_tftacrules1498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred40_tftacrules1500 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_OR_in_synpred41_tftacrules1516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred41_tftacrules1518 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred41_tftacrules1522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred42_tftacrules1537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred42_tftacrules1541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred42_tftacrules1543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred43_tftacrules1575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred43_tftacrules1577 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred43_tftacrules1579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred44_tftacrules1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred44_tftacrules1596 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_XOR_in_synpred45_tftacrules1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred45_tftacrules1614 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred45_tftacrules1618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred46_tftacrules1633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred46_tftacrules1637 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred46_tftacrules1639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred47_tftacrules1670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred47_tftacrules1672 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred47_tftacrules1674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred48_tftacrules1689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred48_tftacrules1691 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_PAND_in_synpred49_tftacrules1707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred49_tftacrules1709 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred49_tftacrules1711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred50_tftacrules1726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred50_tftacrules1728 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_ae_in_synpred50_tftacrules1732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred51_tftacrules1747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred51_tftacrules1750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred51_tftacrules1754 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred51_tftacrules1758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred51_tftacrules1763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred52_tftacrules1800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred52_tftacrules1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred52_tftacrules1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred52_tftacrules1811 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred52_tftacrules1815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred53_tftacrules1854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred53_tftacrules1857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrules1861 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrules1865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred53_tftacrules1870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred54_tftacrules1907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrules1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred54_tftacrules1914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrules1918 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred54_tftacrules1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred55_tftacrules2006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrules2010 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred55_tftacrules2013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrules2017 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred55_tftacrules2021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred56_tftacrules2051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrules2055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred56_tftacrules2058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred56_tftacrules2062 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred56_tftacrules2066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred57_tftacrules2096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred57_tftacrules2099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred57_tftacrules2103 = new BitSet(new long[]{0x00000000000063C0L});
    public static final BitSet FOLLOW_metaPandSandAE_in_synpred57_tftacrules2107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred57_tftacrules2112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred58_tftacrules2207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred58_tftacrules2209 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred58_tftacrules2211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred59_tftacrules2226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred59_tftacrules2228 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred60_tftacrules2244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred60_tftacrules2246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred60_tftacrules2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred61_tftacrules2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_synpred61_tftacrules2264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TRUE_in_synpred61_tftacrules2266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred62_tftacrules2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_synpred62_tftacrules2283 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_SAND_in_synpred63_tftacrules2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred63_tftacrules2302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrules2306 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrules2310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred63_tftacrules2315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred64_tftacrules2352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrules2356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_XOR_in_synpred64_tftacrules2359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrules2363 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred64_tftacrules2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred65_tftacrules2405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrules2409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_synpred65_tftacrules2412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrules2416 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred65_tftacrules2420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred66_tftacrules2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred66_tftacrules2507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrules2511 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrules2515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred66_tftacrules2520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred67_tftacrules2603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred67_tftacrules2606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrules2610 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrules2614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred67_tftacrules2619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred68_tftacrules2648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrules2652 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PAND_in_synpred68_tftacrules2655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrules2659 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred68_tftacrules2663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred69_tftacrules2693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrules2697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_synpred69_tftacrules2700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred69_tftacrules2704 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred69_tftacrules2708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred70_tftacrules2738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred70_tftacrules2741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_notterm_in_synpred70_tftacrules2745 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrules2749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_tt_in_synpred70_tftacrules2754 = new BitSet(new long[]{0x0000000000000008L});

}