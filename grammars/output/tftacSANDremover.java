// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g 2009-03-05 21:37:01

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacSANDremover extends TreeParser {
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


        public tftacSANDremover(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacSANDremover(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[26+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacSANDremover.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();


    public static class expr_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:44:1: expr : ( orterm | andterm | pandterm | core | atom );
    public final tftacSANDremover.expr_return expr() throws RecognitionException {
        tftacSANDremover.expr_return retval = new tftacSANDremover.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacSANDremover.orterm_return orterm1 = null;

        tftacSANDremover.andterm_return andterm2 = null;

        tftacSANDremover.pandterm_return pandterm3 = null;

        tftacSANDremover.core_return core4 = null;

        tftacSANDremover.atom_return atom5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:44:6: ( orterm | andterm | pandterm | core | atom )
            int alt1=5;
            switch ( input.LA(1) ) {
            case OR:
            case XOR:
                {
                alt1=1;
                }
                break;
            case AND:
                {
                alt1=2;
                }
                break;
            case PAND:
                {
                alt1=3;
                }
                break;
            case ID:
                {
                int LA1_4 = input.LA(2);

                if ( (synpred4_tftacSANDremover()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case SAND:
                {
                alt1=4;
                }
                break;
            case FALSE:
                {
                alt1=5;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:44:8: orterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_orterm_in_expr63);
                    orterm1=orterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, orterm1.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:45:4: andterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andterm_in_expr68);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:46:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_expr73);
                    pandterm3=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm3.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:47:4: core
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_core_in_expr78);
                    core4=core();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, core4.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:48:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_expr83);
                    atom5=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom5.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 1, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class atom_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:51:1: atom : ( ID | FALSE );
    public final tftacSANDremover.atom_return atom() throws RecognitionException {
        tftacSANDremover.atom_return retval = new tftacSANDremover.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set6=null;

        Object set6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:51:6: ( ID | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set6=(Object)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==FALSE ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set6_tree = (Object)adaptor.dupNode(set6);

                adaptor.addChild(root_0, set6_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 2, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class core_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "core"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:55:1: core : ( ID | ^( SAND . . ) -> FALSE );
    public final tftacSANDremover.core_return core() throws RecognitionException {
        tftacSANDremover.core_return retval = new tftacSANDremover.core_return();
        retval.start = input.LT(1);
        int core_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object ID7=null;
        Object SAND8=null;
        Object wildcard9=null;
        Object wildcard10=null;

        Object ID7_tree=null;
        Object SAND8_tree=null;
        Object wildcard9_tree=null;
        Object wildcard10_tree=null;
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:55:6: ( ID | ^( SAND . . ) -> FALSE )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:55:8: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID7=(Object)match(input,ID,FOLLOW_ID_in_core110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID7_tree = (Object)adaptor.dupNode(ID7);

                    adaptor.addChild(root_0, ID7_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:56:4: ^( SAND . . )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND8=(Object)match(input,SAND,FOLLOW_SAND_in_core116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND8);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    wildcard9=(Object)input.LT(1);
                    matchAny(input); if (state.failed) return retval;
                    wildcard10=(Object)input.LT(1);
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
                    // 57:4: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

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
            if ( state.backtracking>0 ) { memoize(input, 3, core_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "core"

    public static class andterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:60:1: andterm : ( ^( AND expr FALSE ) -> FALSE | ^( AND FALSE expr ) -> FALSE | ^( AND negterm expr ) | ^( AND ( andterm | core ) ( andterm | core ) ) );
    public final tftacSANDremover.andterm_return andterm() throws RecognitionException {
        tftacSANDremover.andterm_return retval = new tftacSANDremover.andterm_return();
        retval.start = input.LT(1);
        int andterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND11=null;
        Object FALSE13=null;
        Object AND14=null;
        Object FALSE15=null;
        Object AND17=null;
        Object AND20=null;
        tftacSANDremover.expr_return expr12 = null;

        tftacSANDremover.expr_return expr16 = null;

        tftacSANDremover.negterm_return negterm18 = null;

        tftacSANDremover.expr_return expr19 = null;

        tftacSANDremover.andterm_return andterm21 = null;

        tftacSANDremover.core_return core22 = null;

        tftacSANDremover.andterm_return andterm23 = null;

        tftacSANDremover.core_return core24 = null;


        Object AND11_tree=null;
        Object FALSE13_tree=null;
        Object AND14_tree=null;
        Object FALSE15_tree=null;
        Object AND17_tree=null;
        Object AND20_tree=null;
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:60:9: ( ^( AND expr FALSE ) -> FALSE | ^( AND FALSE expr ) -> FALSE | ^( AND negterm expr ) | ^( AND ( andterm | core ) ( andterm | core ) ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==AND) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred7_tftacSANDremover()) ) {
                    alt5=1;
                }
                else if ( (synpred8_tftacSANDremover()) ) {
                    alt5=2;
                }
                else if ( (synpred9_tftacSANDremover()) ) {
                    alt5=3;
                }
                else if ( (true) ) {
                    alt5=4;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:60:11: ^( AND expr FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND11=(Object)match(input,AND,FOLLOW_AND_in_andterm139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND11);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_andterm141);
                    expr12=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr12.getTree());
                    _last = (Object)input.LT(1);
                    FALSE13=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE13);


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
                    // 61:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:62:4: ^( AND FALSE expr )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND14=(Object)match(input,AND,FOLLOW_AND_in_andterm157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND14);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE15=(Object)match(input,FALSE,FOLLOW_FALSE_in_andterm159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE15);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_andterm161);
                    expr16=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr16.getTree());

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
                    // 63:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:64:4: ^( AND negterm expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND17=(Object)match(input,AND,FOLLOW_AND_in_andterm175); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND17_tree = (Object)adaptor.dupNode(AND17);

                    root_1 = (Object)adaptor.becomeRoot(AND17_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negterm_in_andterm177);
                    negterm18=negterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negterm18.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_andterm179);
                    expr19=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr19.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:4: ^( AND ( andterm | core ) ( andterm | core ) )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND20=(Object)match(input,AND,FOLLOW_AND_in_andterm186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND20_tree = (Object)adaptor.dupNode(AND20);

                    root_1 = (Object)adaptor.becomeRoot(AND20_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:10: ( andterm | core )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==AND) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>=SAND && LA3_0<=ID)) ) {
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
                            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:11: andterm
                            {
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_andterm_in_andterm189);
                            andterm21=andterm();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, andterm21.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;
                        case 2 :
                            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:19: core
                            {
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_core_in_andterm191);
                            core22=core();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, core22.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:25: ( andterm | core )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AND) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_0>=SAND && LA4_0<=ID)) ) {
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
                            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:26: andterm
                            {
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_andterm_in_andterm195);
                            andterm23=andterm();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, andterm23.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;
                        case 2 :
                            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:65:34: core
                            {
                            _last = (Object)input.LT(1);
                            pushFollow(FOLLOW_core_in_andterm197);
                            core24=core();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, core24.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

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
            if ( state.backtracking>0 ) { memoize(input, 4, andterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andterm"

    public static class negterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:68:1: negterm : ( ^( NOT ID ) | ^( AND negterm negterm ) );
    public final tftacSANDremover.negterm_return negterm() throws RecognitionException {
        tftacSANDremover.negterm_return retval = new tftacSANDremover.negterm_return();
        retval.start = input.LT(1);
        int negterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT25=null;
        Object ID26=null;
        Object AND27=null;
        tftacSANDremover.negterm_return negterm28 = null;

        tftacSANDremover.negterm_return negterm29 = null;


        Object NOT25_tree=null;
        Object ID26_tree=null;
        Object AND27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:69:2: ( ^( NOT ID ) | ^( AND negterm negterm ) )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:69:4: ^( NOT ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT25=(Object)match(input,NOT,FOLLOW_NOT_in_negterm212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT25_tree = (Object)adaptor.dupNode(NOT25);

                    root_1 = (Object)adaptor.becomeRoot(NOT25_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    ID26=(Object)match(input,ID,FOLLOW_ID_in_negterm214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID26_tree = (Object)adaptor.dupNode(ID26);

                    adaptor.addChild(root_1, ID26_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:70:4: ^( AND negterm negterm )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND27=(Object)match(input,AND,FOLLOW_AND_in_negterm221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND27_tree = (Object)adaptor.dupNode(AND27);

                    root_1 = (Object)adaptor.becomeRoot(AND27_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negterm_in_negterm223);
                    negterm28=negterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negterm28.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negterm_in_negterm225);
                    negterm29=negterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, negterm29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, negterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negterm"

    public static class orterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:73:1: orterm : ( ^( OR FALSE a= expr ) -> $a | ^( OR a= expr FALSE ) -> $a | ^( XOR FALSE a= expr ) -> $a | ^( XOR a= expr FALSE ) -> $a | ^( OR expr expr ) | ^( XOR expr expr ) );
    public final tftacSANDremover.orterm_return orterm() throws RecognitionException {
        tftacSANDremover.orterm_return retval = new tftacSANDremover.orterm_return();
        retval.start = input.LT(1);
        int orterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR30=null;
        Object FALSE31=null;
        Object OR32=null;
        Object FALSE33=null;
        Object XOR34=null;
        Object FALSE35=null;
        Object XOR36=null;
        Object FALSE37=null;
        Object OR38=null;
        Object XOR41=null;
        tftacSANDremover.expr_return a = null;

        tftacSANDremover.expr_return expr39 = null;

        tftacSANDremover.expr_return expr40 = null;

        tftacSANDremover.expr_return expr42 = null;

        tftacSANDremover.expr_return expr43 = null;


        Object OR30_tree=null;
        Object FALSE31_tree=null;
        Object OR32_tree=null;
        Object FALSE33_tree=null;
        Object XOR34_tree=null;
        Object FALSE35_tree=null;
        Object XOR36_tree=null;
        Object FALSE37_tree=null;
        Object OR38_tree=null;
        Object XOR41_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:73:8: ( ^( OR FALSE a= expr ) -> $a | ^( OR a= expr FALSE ) -> $a | ^( XOR FALSE a= expr ) -> $a | ^( XOR a= expr FALSE ) -> $a | ^( OR expr expr ) | ^( XOR expr expr ) )
            int alt7=6;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==OR) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred13_tftacSANDremover()) ) {
                    alt7=1;
                }
                else if ( (synpred14_tftacSANDremover()) ) {
                    alt7=2;
                }
                else if ( (synpred17_tftacSANDremover()) ) {
                    alt7=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==XOR) ) {
                int LA7_2 = input.LA(2);

                if ( (synpred15_tftacSANDremover()) ) {
                    alt7=3;
                }
                else if ( (synpred16_tftacSANDremover()) ) {
                    alt7=4;
                }
                else if ( (true) ) {
                    alt7=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:73:10: ^( OR FALSE a= expr )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR30=(Object)match(input,OR,FOLLOW_OR_in_orterm239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR30);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE31=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE31);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm245);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(a.getTree());

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
                    // 74:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:75:4: ^( OR a= expr FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR32=(Object)match(input,OR,FOLLOW_OR_in_orterm260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR32);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm264);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE33=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE33);


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
                    // 76:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:77:4: ^( XOR FALSE a= expr )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR34=(Object)match(input,XOR,FOLLOW_XOR_in_orterm281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR34);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE35=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE35);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm287);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(a.getTree());

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
                    // 78:4: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:79:4: ^( XOR a= expr FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR36=(Object)match(input,XOR,FOLLOW_XOR_in_orterm302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR36);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm306);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(a.getTree());
                    _last = (Object)input.LT(1);
                    FALSE37=(Object)match(input,FALSE,FOLLOW_FALSE_in_orterm308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE37);


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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:81:4: ^( OR expr expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR38=(Object)match(input,OR,FOLLOW_OR_in_orterm323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR38_tree = (Object)adaptor.dupNode(OR38);

                    root_1 = (Object)adaptor.becomeRoot(OR38_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm325);
                    expr39=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr39.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm327);
                    expr40=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr40.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:82:4: ^( XOR expr expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR41=(Object)match(input,XOR,FOLLOW_XOR_in_orterm334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR41_tree = (Object)adaptor.dupNode(XOR41);

                    root_1 = (Object)adaptor.becomeRoot(XOR41_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm336);
                    expr42=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr42.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_orterm338);
                    expr43=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr43.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, orterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orterm"

    public static class pandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:85:1: pandterm : ( ^( PAND expr FALSE ) -> FALSE | ^( PAND FALSE expr ) -> FALSE | ^( PAND expr expr ) );
    public final tftacSANDremover.pandterm_return pandterm() throws RecognitionException {
        tftacSANDremover.pandterm_return retval = new tftacSANDremover.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND44=null;
        Object FALSE46=null;
        Object PAND47=null;
        Object FALSE48=null;
        Object PAND50=null;
        tftacSANDremover.expr_return expr45 = null;

        tftacSANDremover.expr_return expr49 = null;

        tftacSANDremover.expr_return expr51 = null;

        tftacSANDremover.expr_return expr52 = null;


        Object PAND44_tree=null;
        Object FALSE46_tree=null;
        Object PAND47_tree=null;
        Object FALSE48_tree=null;
        Object PAND50_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:85:9: ( ^( PAND expr FALSE ) -> FALSE | ^( PAND FALSE expr ) -> FALSE | ^( PAND expr expr ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PAND) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred18_tftacSANDremover()) ) {
                    alt8=1;
                }
                else if ( (synpred19_tftacSANDremover()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:85:11: ^( PAND expr FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND44=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND44);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_pandterm353);
                    expr45=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());
                    _last = (Object)input.LT(1);
                    FALSE46=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE46);


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
                    // 86:5: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:87:4: ^( PAND FALSE expr )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND47=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND47);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE48=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandterm372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE48);

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_pandterm374);
                    expr49=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr49.getTree());

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
                    // 88:4: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:89:4: ^( PAND expr expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND50=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND50_tree = (Object)adaptor.dupNode(PAND50);

                    root_1 = (Object)adaptor.becomeRoot(PAND50_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_pandterm390);
                    expr51=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr51.getTree());
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expr_in_pandterm392);
                    expr52=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr52.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, pandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandterm"

    // $ANTLR start synpred4_tftacSANDremover
    public final void synpred4_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:47:4: ( core )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:47:4: core
        {
        pushFollow(FOLLOW_core_in_synpred4_tftacSANDremover78);
        core();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_tftacSANDremover

    // $ANTLR start synpred7_tftacSANDremover
    public final void synpred7_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:60:11: ( ^( AND expr FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:60:11: ^( AND expr FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred7_tftacSANDremover139); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred7_tftacSANDremover141);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred7_tftacSANDremover143); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_tftacSANDremover

    // $ANTLR start synpred8_tftacSANDremover
    public final void synpred8_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:62:4: ( ^( AND FALSE expr ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:62:4: ^( AND FALSE expr )
        {
        match(input,AND,FOLLOW_AND_in_synpred8_tftacSANDremover157); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred8_tftacSANDremover159); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred8_tftacSANDremover161);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_tftacSANDremover

    // $ANTLR start synpred9_tftacSANDremover
    public final void synpred9_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:64:4: ( ^( AND negterm expr ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:64:4: ^( AND negterm expr )
        {
        match(input,AND,FOLLOW_AND_in_synpred9_tftacSANDremover175); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_negterm_in_synpred9_tftacSANDremover177);
        negterm();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred9_tftacSANDremover179);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_tftacSANDremover

    // $ANTLR start synpred13_tftacSANDremover
    public final void synpred13_tftacSANDremover_fragment() throws RecognitionException {   
        tftacSANDremover.expr_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:73:10: ( ^( OR FALSE a= expr ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:73:10: ^( OR FALSE a= expr )
        {
        match(input,OR,FOLLOW_OR_in_synpred13_tftacSANDremover239); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred13_tftacSANDremover241); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred13_tftacSANDremover245);
        a=expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_tftacSANDremover

    // $ANTLR start synpred14_tftacSANDremover
    public final void synpred14_tftacSANDremover_fragment() throws RecognitionException {   
        tftacSANDremover.expr_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:75:4: ( ^( OR a= expr FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:75:4: ^( OR a= expr FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred14_tftacSANDremover260); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred14_tftacSANDremover264);
        a=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred14_tftacSANDremover266); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_tftacSANDremover

    // $ANTLR start synpred15_tftacSANDremover
    public final void synpred15_tftacSANDremover_fragment() throws RecognitionException {   
        tftacSANDremover.expr_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:77:4: ( ^( XOR FALSE a= expr ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:77:4: ^( XOR FALSE a= expr )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred15_tftacSANDremover281); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred15_tftacSANDremover283); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred15_tftacSANDremover287);
        a=expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_tftacSANDremover

    // $ANTLR start synpred16_tftacSANDremover
    public final void synpred16_tftacSANDremover_fragment() throws RecognitionException {   
        tftacSANDremover.expr_return a = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:79:4: ( ^( XOR a= expr FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:79:4: ^( XOR a= expr FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred16_tftacSANDremover302); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred16_tftacSANDremover306);
        a=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred16_tftacSANDremover308); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_tftacSANDremover

    // $ANTLR start synpred17_tftacSANDremover
    public final void synpred17_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:81:4: ( ^( OR expr expr ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:81:4: ^( OR expr expr )
        {
        match(input,OR,FOLLOW_OR_in_synpred17_tftacSANDremover323); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred17_tftacSANDremover325);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred17_tftacSANDremover327);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacSANDremover

    // $ANTLR start synpred18_tftacSANDremover
    public final void synpred18_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:85:11: ( ^( PAND expr FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:85:11: ^( PAND expr FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred18_tftacSANDremover351); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred18_tftacSANDremover353);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred18_tftacSANDremover355); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacSANDremover

    // $ANTLR start synpred19_tftacSANDremover
    public final void synpred19_tftacSANDremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:87:4: ( ^( PAND FALSE expr ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacSANDremover.g:87:4: ^( PAND FALSE expr )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred19_tftacSANDremover370); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred19_tftacSANDremover372); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred19_tftacSANDremover374);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_tftacSANDremover

    // Delegated rules

    public final boolean synpred18_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_tftacSANDremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_tftacSANDremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_orterm_in_expr63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andterm_in_expr68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_expr73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_core_in_expr78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_core110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAND_in_core116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_andterm139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_andterm141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_andterm143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_andterm159 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_andterm161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_andterm177 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_andterm179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andterm186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andterm_in_andterm189 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_core_in_andterm191 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_andterm_in_andterm195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_core_in_andterm197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_negterm212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_negterm214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negterm221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_negterm223 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_negterm_in_negterm225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orterm241 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_orterm245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_orterm264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orterm266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_orterm281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_orterm283 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_orterm287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_orterm302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_orterm306 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_orterm308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_orterm323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_orterm325 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_orterm327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_orterm334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_orterm336 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_orterm338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_pandterm353 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_pandterm355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_pandterm372 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_pandterm374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_pandterm388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_pandterm390 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_pandterm392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_core_in_synpred4_tftacSANDremover78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred7_tftacSANDremover139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred7_tftacSANDremover141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred7_tftacSANDremover143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred8_tftacSANDremover157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred8_tftacSANDremover159 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_synpred8_tftacSANDremover161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred9_tftacSANDremover175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_synpred9_tftacSANDremover177 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_synpred9_tftacSANDremover179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred13_tftacSANDremover239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred13_tftacSANDremover241 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_synpred13_tftacSANDremover245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred14_tftacSANDremover260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred14_tftacSANDremover264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred14_tftacSANDremover266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred15_tftacSANDremover281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred15_tftacSANDremover283 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_synpred15_tftacSANDremover287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred16_tftacSANDremover302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred16_tftacSANDremover306 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred16_tftacSANDremover308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred17_tftacSANDremover323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred17_tftacSANDremover325 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_synpred17_tftacSANDremover327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred18_tftacSANDremover351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred18_tftacSANDremover353 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FALSE_in_synpred18_tftacSANDremover355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred19_tftacSANDremover370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred19_tftacSANDremover372 = new BitSet(new long[]{0x00000000000043F0L});
    public static final BitSet FOLLOW_expr_in_synpred19_tftacSANDremover374 = new BitSet(new long[]{0x0000000000000008L});

}