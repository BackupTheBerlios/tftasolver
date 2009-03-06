// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g 2009-03-06 17:27:31

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacflattener extends TreeParser {
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


        public tftacflattener(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacflattener(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[83+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacflattener.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();


    public static class tdnf_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tdnf"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:1: tdnf : ( nestedterm | atom | pandterm );
    public final tftacflattener.tdnf_return tdnf() throws RecognitionException {
        tftacflattener.tdnf_return retval = new tftacflattener.tdnf_return();
        retval.start = input.LT(1);
        int tdnf_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestedterm_return nestedterm1 = null;

        tftacflattener.atom_return atom2 = null;

        tftacflattener.pandterm_return pandterm3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:6: ( nestedterm | atom | pandterm )
            int alt1=3;
            switch ( input.LA(1) ) {
            case OR:
            case XOR:
            case AND:
            case SAND:
                {
                alt1=1;
                }
                break;
            case ID:
            case TRUE:
            case FALSE:
                {
                alt1=2;
                }
                break;
            case PAND:
                {
                alt1=3;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:11: nestedterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestedterm_in_tdnf65);
                    nestedterm1=nestedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestedterm1.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:44:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_tdnf70);
                    atom2=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom2.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:45:4: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_tdnf75);
                    pandterm3=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm3.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 1, tdnf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tdnf"

    public static class atom_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:48:1: atom : ( ID | TRUE | FALSE );
    public final tftacflattener.atom_return atom() throws RecognitionException {
        tftacflattener.atom_return retval = new tftacflattener.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set4=null;

        Object set4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:48:7: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set4=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set4_tree = (Object)adaptor.dupNode(set4);

                adaptor.addChild(root_0, set4_tree);
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

    public static class pandterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:1: pandterm : ( ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ ) -> ^( PAND ( tdnf )+ ) | ^( PAND ( tdnf )+ ) );
    public final tftacflattener.pandterm_return pandterm() throws RecognitionException {
        tftacflattener.pandterm_return retval = new tftacflattener.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND5=null;
        Object PAND6=null;
        Object PAND9=null;
        tftacflattener.tdnf_return tdnf7 = null;

        tftacflattener.tdnf_return tdnf8 = null;

        tftacflattener.tdnf_return tdnf10 = null;


        Object PAND5_tree=null;
        Object PAND6_tree=null;
        Object PAND9_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:9: ( ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ ) -> ^( PAND ( tdnf )+ ) | ^( PAND ( tdnf )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PAND) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred7_tftacflattener()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:11: ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND5=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND5);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND6=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND6);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:25: ( tdnf )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=TRUE && LA2_0<=FALSE)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_pandterm115);
                    	    tdnf7=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf7.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:32: ( tdnf )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=TRUE && LA3_0<=FALSE)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_pandterm119);
                    	    tdnf8=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf8.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: PAND, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:4: -> ^( PAND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:7: ^( PAND ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:55:4: ^( PAND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND9=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND9_tree = (Object)adaptor.dupNode(PAND9);

                    root_1 = (Object)adaptor.becomeRoot(PAND9_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:55:11: ( tdnf )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=OR && LA4_0<=ID)||(LA4_0>=TRUE && LA4_0<=FALSE)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_pandterm141);
                    	    tdnf10=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf10.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 3, pandterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandterm"

    public static class nestedterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nestedterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:58:1: nestedterm : ( nestand | nestor | nestxor | nestsand );
    public final tftacflattener.nestedterm_return nestedterm() throws RecognitionException {
        tftacflattener.nestedterm_return retval = new tftacflattener.nestedterm_return();
        retval.start = input.LT(1);
        int nestedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand11 = null;

        tftacflattener.nestor_return nestor12 = null;

        tftacflattener.nestxor_return nestxor13 = null;

        tftacflattener.nestsand_return nestsand14 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:2: ( nestand | nestor | nestxor | nestsand )
            int alt6=4;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt6=1;
                }
                break;
            case OR:
                {
                alt6=2;
                }
                break;
            case XOR:
                {
                alt6=3;
                }
                break;
            case SAND:
                {
                alt6=4;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_nestedterm154);
                    nestand11=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand11.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:14: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_nestedterm158);
                    nestor12=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor12.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:23: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_nestedterm162);
                    nestxor13=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor13.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:33: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_nestedterm166);
                    nestsand14=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand14.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 4, nestedterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nestedterm"

    public static class otherthanand_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "otherthanand"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:1: otherthanand : ( nestor | nestxor | nestsand | atom | pandterm );
    public final tftacflattener.otherthanand_return otherthanand() throws RecognitionException {
        tftacflattener.otherthanand_return retval = new tftacflattener.otherthanand_return();
        retval.start = input.LT(1);
        int otherthanand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestor_return nestor15 = null;

        tftacflattener.nestxor_return nestxor16 = null;

        tftacflattener.nestsand_return nestsand17 = null;

        tftacflattener.atom_return atom18 = null;

        tftacflattener.pandterm_return pandterm19 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:2: ( nestor | nestxor | nestsand | atom | pandterm )
            int alt7=5;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt7=1;
                }
                break;
            case XOR:
                {
                alt7=2;
                }
                break;
            case SAND:
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
            case PAND:
                {
                alt7=5;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:4: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_otherthanand177);
                    nestor15=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor15.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:13: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_otherthanand181);
                    nestxor16=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor16.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:23: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_otherthanand185);
                    nestsand17=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand17.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:34: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthanand189);
                    atom18=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom18.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:41: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthanand193);
                    pandterm19=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm19.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, otherthanand_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "otherthanand"

    public static class otherthanor_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "otherthanor"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:64:1: otherthanor : ( nestand | nestxor | nestsand | atom | pandterm );
    public final tftacflattener.otherthanor_return otherthanor() throws RecognitionException {
        tftacflattener.otherthanor_return retval = new tftacflattener.otherthanor_return();
        retval.start = input.LT(1);
        int otherthanor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand20 = null;

        tftacflattener.nestxor_return nestxor21 = null;

        tftacflattener.nestsand_return nestsand22 = null;

        tftacflattener.atom_return atom23 = null;

        tftacflattener.pandterm_return pandterm24 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:2: ( nestand | nestxor | nestsand | atom | pandterm )
            int alt8=5;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt8=1;
                }
                break;
            case XOR:
                {
                alt8=2;
                }
                break;
            case SAND:
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
            case PAND:
                {
                alt8=5;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_otherthanor204);
                    nestand20=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand20.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:14: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_otherthanor208);
                    nestxor21=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor21.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:24: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_otherthanor212);
                    nestsand22=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand22.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:35: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthanor216);
                    atom23=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom23.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:42: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthanor220);
                    pandterm24=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm24.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, otherthanor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "otherthanor"

    public static class otherthanxor_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "otherthanxor"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:1: otherthanxor : ( nestand | nestor | nestsand | atom | pandterm );
    public final tftacflattener.otherthanxor_return otherthanxor() throws RecognitionException {
        tftacflattener.otherthanxor_return retval = new tftacflattener.otherthanxor_return();
        retval.start = input.LT(1);
        int otherthanxor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand25 = null;

        tftacflattener.nestor_return nestor26 = null;

        tftacflattener.nestsand_return nestsand27 = null;

        tftacflattener.atom_return atom28 = null;

        tftacflattener.pandterm_return pandterm29 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:2: ( nestand | nestor | nestsand | atom | pandterm )
            int alt9=5;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt9=1;
                }
                break;
            case OR:
                {
                alt9=2;
                }
                break;
            case SAND:
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
            case PAND:
                {
                alt9=5;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_otherthanxor231);
                    nestand25=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand25.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:14: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_otherthanxor235);
                    nestor26=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor26.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:23: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_otherthanxor239);
                    nestsand27=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand27.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:34: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthanxor243);
                    atom28=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom28.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:41: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthanxor247);
                    pandterm29=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, otherthanxor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "otherthanxor"

    public static class otherthansand_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "otherthansand"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:70:1: otherthansand : ( nestand | nestor | nestxor | atom | pandterm );
    public final tftacflattener.otherthansand_return otherthansand() throws RecognitionException {
        tftacflattener.otherthansand_return retval = new tftacflattener.otherthansand_return();
        retval.start = input.LT(1);
        int otherthansand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand30 = null;

        tftacflattener.nestor_return nestor31 = null;

        tftacflattener.nestxor_return nestxor32 = null;

        tftacflattener.atom_return atom33 = null;

        tftacflattener.pandterm_return pandterm34 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:2: ( nestand | nestor | nestxor | atom | pandterm )
            int alt10=5;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt10=1;
                }
                break;
            case OR:
                {
                alt10=2;
                }
                break;
            case XOR:
                {
                alt10=3;
                }
                break;
            case ID:
            case TRUE:
            case FALSE:
                {
                alt10=4;
                }
                break;
            case PAND:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_otherthansand258);
                    nestand30=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand30.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:14: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_otherthansand262);
                    nestor31=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor31.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:23: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_otherthansand266);
                    nestxor32=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor32.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:33: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthansand270);
                    atom33=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom33.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:40: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthansand274);
                    pandterm34=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm34.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, otherthansand_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "otherthansand"

    public static class nestand_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nestand"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:1: nestand : ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( tdnf )+ ) );
    public final tftacflattener.nestand_return nestand() throws RecognitionException {
        tftacflattener.nestand_return retval = new tftacflattener.nestand_return();
        retval.start = input.LT(1);
        int nestand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND35=null;
        Object AND36=null;
        Object AND39=null;
        Object AND41=null;
        Object AND43=null;
        Object AND45=null;
        Object AND48=null;
        tftacflattener.tdnf_return tdnf37 = null;

        tftacflattener.tdnf_return tdnf38 = null;

        tftacflattener.otherthanand_return otherthanand40 = null;

        tftacflattener.tdnf_return tdnf42 = null;

        tftacflattener.otherthanand_return otherthanand44 = null;

        tftacflattener.tdnf_return tdnf46 = null;

        tftacflattener.tdnf_return tdnf47 = null;

        tftacflattener.tdnf_return tdnf49 = null;


        Object AND35_tree=null;
        Object AND36_tree=null;
        Object AND39_tree=null;
        Object AND41_tree=null;
        Object AND43_tree=null;
        Object AND45_tree=null;
        Object AND48_tree=null;
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_otherthanand=new RewriteRuleSubtreeStream(adaptor,"rule otherthanand");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:9: ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( tdnf )+ ) )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AND) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred30_tftacflattener()) ) {
                    alt19=1;
                }
                else if ( (synpred33_tftacflattener()) ) {
                    alt19=2;
                }
                else if ( (synpred37_tftacflattener()) ) {
                    alt19=3;
                }
                else if ( (true) ) {
                    alt19=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND35=(Object)match(input,AND,FOLLOW_AND_in_nestand285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND35);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND36=(Object)match(input,AND,FOLLOW_AND_in_nestand288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND36);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:23: ( tdnf )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=OR && LA11_0<=ID)||(LA11_0>=TRUE && LA11_0<=FALSE)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand290);
                    	    tdnf37=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf37.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:30: ( tdnf )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=OR && LA12_0<=ID)||(LA12_0>=TRUE && LA12_0<=FALSE)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand294);
                    	    tdnf38=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf38.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: tdnf, AND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:4: -> ^( AND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:7: ^( AND ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND39=(Object)match(input,AND,FOLLOW_AND_in_nestand314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND39);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:10: ( otherthanand )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=OR && LA13_0<=XOR)||(LA13_0>=PAND && LA13_0<=ID)||(LA13_0>=TRUE && LA13_0<=FALSE)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanand
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanand_in_nestand316);
                    	    otherthanand40=otherthanand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanand.add(otherthanand40.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND41=(Object)match(input,AND,FOLLOW_AND_in_nestand320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND41);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:30: ( tdnf )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=OR && LA14_0<=ID)||(LA14_0>=TRUE && LA14_0<=FALSE)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand322);
                    	    tdnf42=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf42.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: otherthanand, AND, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:4: -> ^( AND ( otherthanand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:7: ^( AND ( otherthanand )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        if ( !(stream_otherthanand.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthanand.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthanand.nextTree());

                        }
                        stream_otherthanand.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND43=(Object)match(input,AND,FOLLOW_AND_in_nestand346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND43);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:10: ( otherthanand )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=OR && LA15_0<=XOR)||(LA15_0>=PAND && LA15_0<=ID)||(LA15_0>=TRUE && LA15_0<=FALSE)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanand
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanand_in_nestand348);
                    	    otherthanand44=otherthanand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanand.add(otherthanand44.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND45=(Object)match(input,AND,FOLLOW_AND_in_nestand352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND45);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:30: ( tdnf )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=OR && LA16_0<=ID)||(LA16_0>=TRUE && LA16_0<=FALSE)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand354);
                    	    tdnf46=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf46.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:37: ( tdnf )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=OR && LA17_0<=ID)||(LA17_0>=TRUE && LA17_0<=FALSE)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand358);
                    	    tdnf47=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf47.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: tdnf, AND, otherthanand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:4: -> ^( AND ( otherthanand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:7: ^( AND ( otherthanand )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        if ( !(stream_otherthanand.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthanand.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthanand.nextTree());

                        }
                        stream_otherthanand.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:79:4: ^( AND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND48=(Object)match(input,AND,FOLLOW_AND_in_nestand381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND48_tree = (Object)adaptor.dupNode(AND48);

                    root_1 = (Object)adaptor.becomeRoot(AND48_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:79:10: ( tdnf )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=OR && LA18_0<=ID)||(LA18_0>=TRUE && LA18_0<=FALSE)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand383);
                    	    tdnf49=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf49.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 9, nestand_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nestand"

    public static class nestsand_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nestsand"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:1: nestsand : ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( tdnf )+ ) );
    public final tftacflattener.nestsand_return nestsand() throws RecognitionException {
        tftacflattener.nestsand_return retval = new tftacflattener.nestsand_return();
        retval.start = input.LT(1);
        int nestsand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND50=null;
        Object SAND51=null;
        Object SAND54=null;
        Object SAND56=null;
        Object SAND58=null;
        Object SAND60=null;
        Object SAND63=null;
        tftacflattener.tdnf_return tdnf52 = null;

        tftacflattener.tdnf_return tdnf53 = null;

        tftacflattener.otherthansand_return otherthansand55 = null;

        tftacflattener.tdnf_return tdnf57 = null;

        tftacflattener.otherthansand_return otherthansand59 = null;

        tftacflattener.tdnf_return tdnf61 = null;

        tftacflattener.tdnf_return tdnf62 = null;

        tftacflattener.tdnf_return tdnf64 = null;


        Object SAND50_tree=null;
        Object SAND51_tree=null;
        Object SAND54_tree=null;
        Object SAND56_tree=null;
        Object SAND58_tree=null;
        Object SAND60_tree=null;
        Object SAND63_tree=null;
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleSubtreeStream stream_otherthansand=new RewriteRuleSubtreeStream(adaptor,"rule otherthansand");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:9: ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( tdnf )+ ) )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SAND) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred41_tftacflattener()) ) {
                    alt28=1;
                }
                else if ( (synpred44_tftacflattener()) ) {
                    alt28=2;
                }
                else if ( (synpred48_tftacflattener()) ) {
                    alt28=3;
                }
                else if ( (true) ) {
                    alt28=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:11: ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND50=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND50);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND51=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND51);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:25: ( tdnf )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=OR && LA20_0<=ID)||(LA20_0>=TRUE && LA20_0<=FALSE)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand401);
                    	    tdnf52=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf52.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:32: ( tdnf )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=OR && LA21_0<=ID)||(LA21_0>=TRUE && LA21_0<=FALSE)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand405);
                    	    tdnf53=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf53.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: tdnf, SAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:4: -> ^( SAND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:7: ^( SAND ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_1);

                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND54=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND54);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:11: ( otherthansand )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=OR && LA22_0<=PAND)||LA22_0==ID||(LA22_0>=TRUE && LA22_0<=FALSE)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthansand_in_nestsand427);
                    	    otherthansand55=otherthansand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthansand.add(otherthansand55.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND56=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND56);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:33: ( tdnf )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=OR && LA23_0<=ID)||(LA23_0>=TRUE && LA23_0<=FALSE)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand433);
                    	    tdnf57=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf57.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: otherthansand, SAND, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:4: -> ^( SAND ( otherthansand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:7: ^( SAND ( otherthansand )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_1);

                        if ( !(stream_otherthansand.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthansand.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthansand.nextTree());

                        }
                        stream_otherthansand.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND58=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND58);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:11: ( otherthansand )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=OR && LA24_0<=PAND)||LA24_0==ID||(LA24_0>=TRUE && LA24_0<=FALSE)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthansand_in_nestsand459);
                    	    otherthansand59=otherthansand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthansand.add(otherthansand59.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND60=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND60);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:33: ( tdnf )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=OR && LA25_0<=ID)||(LA25_0>=TRUE && LA25_0<=FALSE)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand465);
                    	    tdnf61=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf61.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:40: ( tdnf )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=OR && LA26_0<=ID)||(LA26_0>=TRUE && LA26_0<=FALSE)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand469);
                    	    tdnf62=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf62.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SAND, tdnf, otherthansand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:4: -> ^( SAND ( otherthansand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:7: ^( SAND ( otherthansand )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_1);

                        if ( !(stream_otherthansand.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthansand.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthansand.nextTree());

                        }
                        stream_otherthansand.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:88:4: ^( SAND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND63=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND63_tree = (Object)adaptor.dupNode(SAND63);

                    root_1 = (Object)adaptor.becomeRoot(SAND63_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:88:11: ( tdnf )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=OR && LA27_0<=ID)||(LA27_0>=TRUE && LA27_0<=FALSE)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand494);
                    	    tdnf64=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf64.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 10, nestsand_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nestsand"

    public static class nestor_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nestor"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:1: nestor : ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( tdnf )+ ) );
    public final tftacflattener.nestor_return nestor() throws RecognitionException {
        tftacflattener.nestor_return retval = new tftacflattener.nestor_return();
        retval.start = input.LT(1);
        int nestor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR65=null;
        Object OR66=null;
        Object OR69=null;
        Object OR71=null;
        Object OR73=null;
        Object OR75=null;
        Object OR78=null;
        tftacflattener.tdnf_return tdnf67 = null;

        tftacflattener.tdnf_return tdnf68 = null;

        tftacflattener.otherthanor_return otherthanor70 = null;

        tftacflattener.tdnf_return tdnf72 = null;

        tftacflattener.otherthanor_return otherthanor74 = null;

        tftacflattener.tdnf_return tdnf76 = null;

        tftacflattener.tdnf_return tdnf77 = null;

        tftacflattener.tdnf_return tdnf79 = null;


        Object OR65_tree=null;
        Object OR66_tree=null;
        Object OR69_tree=null;
        Object OR71_tree=null;
        Object OR73_tree=null;
        Object OR75_tree=null;
        Object OR78_tree=null;
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_otherthanor=new RewriteRuleSubtreeStream(adaptor,"rule otherthanor");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:8: ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( tdnf )+ ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==OR) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred52_tftacflattener()) ) {
                    alt37=1;
                }
                else if ( (synpred55_tftacflattener()) ) {
                    alt37=2;
                }
                else if ( (synpred59_tftacflattener()) ) {
                    alt37=3;
                }
                else if ( (true) ) {
                    alt37=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:10: ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR65=(Object)match(input,OR,FOLLOW_OR_in_nestor508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR65);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR66=(Object)match(input,OR,FOLLOW_OR_in_nestor511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR66);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:20: ( tdnf )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=OR && LA29_0<=ID)||(LA29_0>=TRUE && LA29_0<=FALSE)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor513);
                    	    tdnf67=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf67.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:27: ( tdnf )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=OR && LA30_0<=ID)||(LA30_0>=TRUE && LA30_0<=FALSE)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor517);
                    	    tdnf68=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf68.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:4: -> ^( OR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:7: ^( OR ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR69=(Object)match(input,OR,FOLLOW_OR_in_nestor537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR69);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:9: ( otherthanor )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=XOR && LA31_0<=ID)||(LA31_0>=TRUE && LA31_0<=FALSE)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanor_in_nestor539);
                    	    otherthanor70=otherthanor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanor.add(otherthanor70.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR71=(Object)match(input,OR,FOLLOW_OR_in_nestor543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR71);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:27: ( tdnf )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=OR && LA32_0<=ID)||(LA32_0>=TRUE && LA32_0<=FALSE)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor545);
                    	    tdnf72=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf72.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: OR, otherthanor, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:4: -> ^( OR ( otherthanor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:7: ^( OR ( otherthanor )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        if ( !(stream_otherthanor.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthanor.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthanor.nextTree());

                        }
                        stream_otherthanor.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR73=(Object)match(input,OR,FOLLOW_OR_in_nestor569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR73);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:9: ( otherthanor )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=XOR && LA33_0<=ID)||(LA33_0>=TRUE && LA33_0<=FALSE)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanor_in_nestor571);
                    	    otherthanor74=otherthanor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanor.add(otherthanor74.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR75=(Object)match(input,OR,FOLLOW_OR_in_nestor575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR75);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:27: ( tdnf )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=OR && LA34_0<=ID)||(LA34_0>=TRUE && LA34_0<=FALSE)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor577);
                    	    tdnf76=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf76.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:34: ( tdnf )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=OR && LA35_0<=ID)||(LA35_0>=TRUE && LA35_0<=FALSE)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor581);
                    	    tdnf77=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf77.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: tdnf, otherthanor, OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:4: -> ^( OR ( otherthanor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:7: ^( OR ( otherthanor )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        if ( !(stream_otherthanor.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthanor.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthanor.nextTree());

                        }
                        stream_otherthanor.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:97:4: ^( OR ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR78=(Object)match(input,OR,FOLLOW_OR_in_nestor604); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR78_tree = (Object)adaptor.dupNode(OR78);

                    root_1 = (Object)adaptor.becomeRoot(OR78_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:97:9: ( tdnf )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=OR && LA36_0<=ID)||(LA36_0>=TRUE && LA36_0<=FALSE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor606);
                    	    tdnf79=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf79.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 11, nestor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nestor"

    public static class nestxor_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nestxor"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:1: nestxor : ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( tdnf )+ ) );
    public final tftacflattener.nestxor_return nestxor() throws RecognitionException {
        tftacflattener.nestxor_return retval = new tftacflattener.nestxor_return();
        retval.start = input.LT(1);
        int nestxor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR80=null;
        Object XOR81=null;
        Object XOR84=null;
        Object XOR86=null;
        Object XOR88=null;
        Object XOR90=null;
        Object XOR93=null;
        tftacflattener.tdnf_return tdnf82 = null;

        tftacflattener.tdnf_return tdnf83 = null;

        tftacflattener.otherthanxor_return otherthanxor85 = null;

        tftacflattener.tdnf_return tdnf87 = null;

        tftacflattener.otherthanxor_return otherthanxor89 = null;

        tftacflattener.tdnf_return tdnf91 = null;

        tftacflattener.tdnf_return tdnf92 = null;

        tftacflattener.tdnf_return tdnf94 = null;


        Object XOR80_tree=null;
        Object XOR81_tree=null;
        Object XOR84_tree=null;
        Object XOR86_tree=null;
        Object XOR88_tree=null;
        Object XOR90_tree=null;
        Object XOR93_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleSubtreeStream stream_otherthanxor=new RewriteRuleSubtreeStream(adaptor,"rule otherthanxor");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:9: ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( tdnf )+ ) )
            int alt46=4;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==XOR) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred63_tftacflattener()) ) {
                    alt46=1;
                }
                else if ( (synpred66_tftacflattener()) ) {
                    alt46=2;
                }
                else if ( (synpred70_tftacflattener()) ) {
                    alt46=3;
                }
                else if ( (true) ) {
                    alt46=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:11: ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR80=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR80);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR81=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR81);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:23: ( tdnf )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=OR && LA38_0<=ID)||(LA38_0>=TRUE && LA38_0<=FALSE)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor630);
                    	    tdnf82=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf82.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:30: ( tdnf )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=OR && LA39_0<=ID)||(LA39_0>=TRUE && LA39_0<=FALSE)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor634);
                    	    tdnf83=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf83.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:4: -> ^( XOR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:7: ^( XOR ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR84=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR84);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:10: ( otherthanxor )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==OR||(LA40_0>=AND && LA40_0<=ID)||(LA40_0>=TRUE && LA40_0<=FALSE)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanxor_in_nestxor656);
                    	    otherthanxor85=otherthanxor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanxor.add(otherthanxor85.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR86=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR86);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:30: ( tdnf )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=OR && LA41_0<=ID)||(LA41_0>=TRUE && LA41_0<=FALSE)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor662);
                    	    tdnf87=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf87.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: otherthanxor, XOR, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:4: -> ^( XOR ( otherthanxor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:7: ^( XOR ( otherthanxor )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        if ( !(stream_otherthanxor.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthanxor.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthanxor.nextTree());

                        }
                        stream_otherthanxor.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR88=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR88);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:10: ( otherthanxor )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==OR||(LA42_0>=AND && LA42_0<=ID)||(LA42_0>=TRUE && LA42_0<=FALSE)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanxor_in_nestxor688);
                    	    otherthanxor89=otherthanxor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanxor.add(otherthanxor89.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR90=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR90);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:30: ( tdnf )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=OR && LA43_0<=ID)||(LA43_0>=TRUE && LA43_0<=FALSE)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor694);
                    	    tdnf91=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf91.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:37: ( tdnf )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=OR && LA44_0<=ID)||(LA44_0>=TRUE && LA44_0<=FALSE)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor698);
                    	    tdnf92=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf92.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: XOR, otherthanxor, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:4: -> ^( XOR ( otherthanxor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:7: ^( XOR ( otherthanxor )+ ( tdnf )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        if ( !(stream_otherthanxor.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_otherthanxor.hasNext() ) {
                            adaptor.addChild(root_1, stream_otherthanxor.nextTree());

                        }
                        stream_otherthanxor.reset();
                        if ( !(stream_tdnf.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_tdnf.hasNext() ) {
                            adaptor.addChild(root_1, stream_tdnf.nextTree());

                        }
                        stream_tdnf.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:106:4: ^( XOR ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR93=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor721); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR93_tree = (Object)adaptor.dupNode(XOR93);

                    root_1 = (Object)adaptor.becomeRoot(XOR93_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:106:10: ( tdnf )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=OR && LA45_0<=ID)||(LA45_0>=TRUE && LA45_0<=FALSE)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor723);
                    	    tdnf94=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf94.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 12, nestxor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nestxor"

    // $ANTLR start synpred7_tftacflattener
    public final void synpred7_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:11: ( ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:11: ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred7_tftacflattener110); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred7_tftacflattener113); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:25: ( tdnf )+
        int cnt47=0;
        loop47:
        do {
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=OR && LA47_0<=ID)||(LA47_0>=TRUE && LA47_0<=FALSE)) ) {
                alt47=1;
            }


            switch (alt47) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred7_tftacflattener115);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt47 >= 1 ) break loop47;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(47, input);
                    throw eee;
            }
            cnt47++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:32: ( tdnf )+
        int cnt48=0;
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=OR && LA48_0<=ID)||(LA48_0>=TRUE && LA48_0<=FALSE)) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred7_tftacflattener119);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt48 >= 1 ) break loop48;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(48, input);
                    throw eee;
            }
            cnt48++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_tftacflattener

    // $ANTLR start synpred30_tftacflattener
    public final void synpred30_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,AND,FOLLOW_AND_in_synpred30_tftacflattener285); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred30_tftacflattener288); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:23: ( tdnf )+
        int cnt49=0;
        loop49:
        do {
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=OR && LA49_0<=ID)||(LA49_0>=TRUE && LA49_0<=FALSE)) ) {
                alt49=1;
            }


            switch (alt49) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred30_tftacflattener290);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt49 >= 1 ) break loop49;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(49, input);
                    throw eee;
            }
            cnt49++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:30: ( tdnf )+
        int cnt50=0;
        loop50:
        do {
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=OR && LA50_0<=ID)||(LA50_0>=TRUE && LA50_0<=FALSE)) ) {
                alt50=1;
            }


            switch (alt50) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred30_tftacflattener294);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt50 >= 1 ) break loop50;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(50, input);
                    throw eee;
            }
            cnt50++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_tftacflattener

    // $ANTLR start synpred33_tftacflattener
    public final void synpred33_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:4: ( ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred33_tftacflattener314); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:10: ( otherthanand )+
        int cnt51=0;
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=OR && LA51_0<=XOR)||(LA51_0>=PAND && LA51_0<=ID)||(LA51_0>=TRUE && LA51_0<=FALSE)) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanand
        	    {
        	    pushFollow(FOLLOW_otherthanand_in_synpred33_tftacflattener316);
        	    otherthanand();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt51 >= 1 ) break loop51;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(51, input);
                    throw eee;
            }
            cnt51++;
        } while (true);

        match(input,AND,FOLLOW_AND_in_synpred33_tftacflattener320); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:30: ( tdnf )+
        int cnt52=0;
        loop52:
        do {
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=OR && LA52_0<=ID)||(LA52_0>=TRUE && LA52_0<=FALSE)) ) {
                alt52=1;
            }


            switch (alt52) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred33_tftacflattener322);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt52 >= 1 ) break loop52;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(52, input);
                    throw eee;
            }
            cnt52++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_tftacflattener

    // $ANTLR start synpred37_tftacflattener
    public final void synpred37_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:4: ( ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,AND,FOLLOW_AND_in_synpred37_tftacflattener346); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:10: ( otherthanand )+
        int cnt53=0;
        loop53:
        do {
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=OR && LA53_0<=XOR)||(LA53_0>=PAND && LA53_0<=ID)||(LA53_0>=TRUE && LA53_0<=FALSE)) ) {
                alt53=1;
            }


            switch (alt53) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanand
        	    {
        	    pushFollow(FOLLOW_otherthanand_in_synpred37_tftacflattener348);
        	    otherthanand();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt53 >= 1 ) break loop53;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(53, input);
                    throw eee;
            }
            cnt53++;
        } while (true);

        match(input,AND,FOLLOW_AND_in_synpred37_tftacflattener352); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:30: ( tdnf )+
        int cnt54=0;
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=OR && LA54_0<=ID)||(LA54_0>=TRUE && LA54_0<=FALSE)) ) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred37_tftacflattener354);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt54 >= 1 ) break loop54;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(54, input);
                    throw eee;
            }
            cnt54++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:37: ( tdnf )+
        int cnt55=0;
        loop55:
        do {
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=OR && LA55_0<=ID)||(LA55_0>=TRUE && LA55_0<=FALSE)) ) {
                alt55=1;
            }


            switch (alt55) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred37_tftacflattener358);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt55 >= 1 ) break loop55;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(55, input);
                    throw eee;
            }
            cnt55++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_tftacflattener

    // $ANTLR start synpred41_tftacflattener
    public final void synpred41_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:11: ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:11: ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred41_tftacflattener396); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred41_tftacflattener399); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:25: ( tdnf )+
        int cnt56=0;
        loop56:
        do {
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=OR && LA56_0<=ID)||(LA56_0>=TRUE && LA56_0<=FALSE)) ) {
                alt56=1;
            }


            switch (alt56) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred41_tftacflattener401);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt56 >= 1 ) break loop56;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(56, input);
                    throw eee;
            }
            cnt56++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:82:32: ( tdnf )+
        int cnt57=0;
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=OR && LA57_0<=ID)||(LA57_0>=TRUE && LA57_0<=FALSE)) ) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred41_tftacflattener405);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt57 >= 1 ) break loop57;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(57, input);
                    throw eee;
            }
            cnt57++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_tftacflattener

    // $ANTLR start synpred44_tftacflattener
    public final void synpred44_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:4: ( ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred44_tftacflattener425); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:11: ( otherthansand )+
        int cnt58=0;
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=OR && LA58_0<=PAND)||LA58_0==ID||(LA58_0>=TRUE && LA58_0<=FALSE)) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
        	    {
        	    pushFollow(FOLLOW_otherthansand_in_synpred44_tftacflattener427);
        	    otherthansand();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt58 >= 1 ) break loop58;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(58, input);
                    throw eee;
            }
            cnt58++;
        } while (true);

        match(input,SAND,FOLLOW_SAND_in_synpred44_tftacflattener431); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:33: ( tdnf )+
        int cnt59=0;
        loop59:
        do {
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=OR && LA59_0<=ID)||(LA59_0>=TRUE && LA59_0<=FALSE)) ) {
                alt59=1;
            }


            switch (alt59) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred44_tftacflattener433);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt59 >= 1 ) break loop59;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(59, input);
                    throw eee;
            }
            cnt59++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_tftacflattener

    // $ANTLR start synpred48_tftacflattener
    public final void synpred48_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:4: ( ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred48_tftacflattener457); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:11: ( otherthansand )+
        int cnt60=0;
        loop60:
        do {
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=OR && LA60_0<=PAND)||LA60_0==ID||(LA60_0>=TRUE && LA60_0<=FALSE)) ) {
                alt60=1;
            }


            switch (alt60) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
        	    {
        	    pushFollow(FOLLOW_otherthansand_in_synpred48_tftacflattener459);
        	    otherthansand();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt60 >= 1 ) break loop60;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(60, input);
                    throw eee;
            }
            cnt60++;
        } while (true);

        match(input,SAND,FOLLOW_SAND_in_synpred48_tftacflattener463); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:33: ( tdnf )+
        int cnt61=0;
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=OR && LA61_0<=ID)||(LA61_0>=TRUE && LA61_0<=FALSE)) ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred48_tftacflattener465);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt61 >= 1 ) break loop61;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(61, input);
                    throw eee;
            }
            cnt61++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:40: ( tdnf )+
        int cnt62=0;
        loop62:
        do {
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=OR && LA62_0<=ID)||(LA62_0>=TRUE && LA62_0<=FALSE)) ) {
                alt62=1;
            }


            switch (alt62) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred48_tftacflattener469);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt62 >= 1 ) break loop62;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(62, input);
                    throw eee;
            }
            cnt62++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacflattener

    // $ANTLR start synpred52_tftacflattener
    public final void synpred52_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:10: ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:10: ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,OR,FOLLOW_OR_in_synpred52_tftacflattener508); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred52_tftacflattener511); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:20: ( tdnf )+
        int cnt63=0;
        loop63:
        do {
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=OR && LA63_0<=ID)||(LA63_0>=TRUE && LA63_0<=FALSE)) ) {
                alt63=1;
            }


            switch (alt63) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred52_tftacflattener513);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt63 >= 1 ) break loop63;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(63, input);
                    throw eee;
            }
            cnt63++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:91:27: ( tdnf )+
        int cnt64=0;
        loop64:
        do {
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=OR && LA64_0<=ID)||(LA64_0>=TRUE && LA64_0<=FALSE)) ) {
                alt64=1;
            }


            switch (alt64) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred52_tftacflattener517);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt64 >= 1 ) break loop64;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(64, input);
                    throw eee;
            }
            cnt64++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_tftacflattener

    // $ANTLR start synpred55_tftacflattener
    public final void synpred55_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:4: ( ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred55_tftacflattener537); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:9: ( otherthanor )+
        int cnt65=0;
        loop65:
        do {
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=XOR && LA65_0<=ID)||(LA65_0>=TRUE && LA65_0<=FALSE)) ) {
                alt65=1;
            }


            switch (alt65) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
        	    {
        	    pushFollow(FOLLOW_otherthanor_in_synpred55_tftacflattener539);
        	    otherthanor();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt65 >= 1 ) break loop65;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(65, input);
                    throw eee;
            }
            cnt65++;
        } while (true);

        match(input,OR,FOLLOW_OR_in_synpred55_tftacflattener543); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:27: ( tdnf )+
        int cnt66=0;
        loop66:
        do {
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=OR && LA66_0<=ID)||(LA66_0>=TRUE && LA66_0<=FALSE)) ) {
                alt66=1;
            }


            switch (alt66) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred55_tftacflattener545);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt66 >= 1 ) break loop66;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(66, input);
                    throw eee;
            }
            cnt66++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_tftacflattener

    // $ANTLR start synpred59_tftacflattener
    public final void synpred59_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:4: ( ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,OR,FOLLOW_OR_in_synpred59_tftacflattener569); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:9: ( otherthanor )+
        int cnt67=0;
        loop67:
        do {
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=XOR && LA67_0<=ID)||(LA67_0>=TRUE && LA67_0<=FALSE)) ) {
                alt67=1;
            }


            switch (alt67) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
        	    {
        	    pushFollow(FOLLOW_otherthanor_in_synpred59_tftacflattener571);
        	    otherthanor();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt67 >= 1 ) break loop67;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(67, input);
                    throw eee;
            }
            cnt67++;
        } while (true);

        match(input,OR,FOLLOW_OR_in_synpred59_tftacflattener575); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:27: ( tdnf )+
        int cnt68=0;
        loop68:
        do {
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=OR && LA68_0<=ID)||(LA68_0>=TRUE && LA68_0<=FALSE)) ) {
                alt68=1;
            }


            switch (alt68) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred59_tftacflattener577);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt68 >= 1 ) break loop68;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(68, input);
                    throw eee;
            }
            cnt68++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:34: ( tdnf )+
        int cnt69=0;
        loop69:
        do {
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=OR && LA69_0<=ID)||(LA69_0>=TRUE && LA69_0<=FALSE)) ) {
                alt69=1;
            }


            switch (alt69) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred59_tftacflattener581);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt69 >= 1 ) break loop69;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(69, input);
                    throw eee;
            }
            cnt69++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacflattener

    // $ANTLR start synpred63_tftacflattener
    public final void synpred63_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:11: ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:11: ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred63_tftacflattener625); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred63_tftacflattener628); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:23: ( tdnf )+
        int cnt70=0;
        loop70:
        do {
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=OR && LA70_0<=ID)||(LA70_0>=TRUE && LA70_0<=FALSE)) ) {
                alt70=1;
            }


            switch (alt70) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred63_tftacflattener630);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt70 >= 1 ) break loop70;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(70, input);
                    throw eee;
            }
            cnt70++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:100:30: ( tdnf )+
        int cnt71=0;
        loop71:
        do {
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=OR && LA71_0<=ID)||(LA71_0>=TRUE && LA71_0<=FALSE)) ) {
                alt71=1;
            }


            switch (alt71) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred63_tftacflattener634);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt71 >= 1 ) break loop71;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(71, input);
                    throw eee;
            }
            cnt71++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_tftacflattener

    // $ANTLR start synpred66_tftacflattener
    public final void synpred66_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:4: ( ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred66_tftacflattener654); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:10: ( otherthanxor )+
        int cnt72=0;
        loop72:
        do {
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==OR||(LA72_0>=AND && LA72_0<=ID)||(LA72_0>=TRUE && LA72_0<=FALSE)) ) {
                alt72=1;
            }


            switch (alt72) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
        	    {
        	    pushFollow(FOLLOW_otherthanxor_in_synpred66_tftacflattener656);
        	    otherthanxor();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt72 >= 1 ) break loop72;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(72, input);
                    throw eee;
            }
            cnt72++;
        } while (true);

        match(input,XOR,FOLLOW_XOR_in_synpred66_tftacflattener660); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:30: ( tdnf )+
        int cnt73=0;
        loop73:
        do {
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=OR && LA73_0<=ID)||(LA73_0>=TRUE && LA73_0<=FALSE)) ) {
                alt73=1;
            }


            switch (alt73) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred66_tftacflattener662);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt73 >= 1 ) break loop73;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(73, input);
                    throw eee;
            }
            cnt73++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_tftacflattener

    // $ANTLR start synpred70_tftacflattener
    public final void synpred70_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:4: ( ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred70_tftacflattener686); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:10: ( otherthanxor )+
        int cnt74=0;
        loop74:
        do {
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==OR||(LA74_0>=AND && LA74_0<=ID)||(LA74_0>=TRUE && LA74_0<=FALSE)) ) {
                alt74=1;
            }


            switch (alt74) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
        	    {
        	    pushFollow(FOLLOW_otherthanxor_in_synpred70_tftacflattener688);
        	    otherthanxor();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt74 >= 1 ) break loop74;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(74, input);
                    throw eee;
            }
            cnt74++;
        } while (true);

        match(input,XOR,FOLLOW_XOR_in_synpred70_tftacflattener692); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:30: ( tdnf )+
        int cnt75=0;
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=OR && LA75_0<=ID)||(LA75_0>=TRUE && LA75_0<=FALSE)) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred70_tftacflattener694);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt75 >= 1 ) break loop75;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(75, input);
                    throw eee;
            }
            cnt75++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:37: ( tdnf )+
        int cnt76=0;
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=OR && LA76_0<=ID)||(LA76_0>=TRUE && LA76_0<=FALSE)) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred70_tftacflattener698);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt76 >= 1 ) break loop76;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(76, input);
                    throw eee;
            }
            cnt76++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacflattener

    // Delegated rules

    public final boolean synpred37_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_nestedterm_in_tdnf65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_tdnf70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_tdnf75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_pandterm110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_pandterm113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_pandterm115 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_pandterm119 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_PAND_in_pandterm139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_pandterm141 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_nestand_in_nestedterm154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_nestedterm158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_nestedterm162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_nestedterm166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_otherthanand177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_otherthanand181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_otherthanand185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthanand189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthanand193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_otherthanor204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_otherthanor208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_otherthanor212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthanor216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthanor220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_otherthanxor231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_otherthanxor235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_otherthanxor239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthanxor243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthanxor247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_otherthansand258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_otherthansand262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_otherthansand266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthansand270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthansand274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_nestand285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_nestand288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand290 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestand294 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestand314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_nestand316 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestand320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand322 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestand346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_nestand348 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestand352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand354 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestand358 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestand381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand383 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_nestsand399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand401 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestsand405 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_nestsand427 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand433 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_nestsand459 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand465 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestsand469 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand494 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestor508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_nestor511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor513 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestor517 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestor537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_nestor539 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestor543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor545 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestor569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_nestor571 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestor575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor577 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestor581 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestor604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor606 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_nestxor628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor630 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestxor634 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_nestxor656 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor662 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_nestxor688 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor694 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestxor698 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor723 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_PAND_in_synpred7_tftacflattener110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred7_tftacflattener113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred7_tftacflattener115 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred7_tftacflattener119 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred30_tftacflattener285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred30_tftacflattener288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred30_tftacflattener290 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred30_tftacflattener294 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred33_tftacflattener314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_synpred33_tftacflattener316 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred33_tftacflattener320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred33_tftacflattener322 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred37_tftacflattener346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_synpred37_tftacflattener348 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred37_tftacflattener352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred37_tftacflattener354 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred37_tftacflattener358 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred41_tftacflattener396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred41_tftacflattener399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred41_tftacflattener401 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred41_tftacflattener405 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred44_tftacflattener425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_synpred44_tftacflattener427 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred44_tftacflattener431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred44_tftacflattener433 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred48_tftacflattener457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_synpred48_tftacflattener459 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred48_tftacflattener463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred48_tftacflattener465 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred48_tftacflattener469 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred52_tftacflattener508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred52_tftacflattener511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred52_tftacflattener513 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred52_tftacflattener517 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred55_tftacflattener537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_synpred55_tftacflattener539 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred55_tftacflattener543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred55_tftacflattener545 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred59_tftacflattener569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_synpred59_tftacflattener571 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred59_tftacflattener575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred59_tftacflattener577 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred59_tftacflattener581 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred63_tftacflattener625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred63_tftacflattener628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred63_tftacflattener630 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred63_tftacflattener634 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred66_tftacflattener654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_synpred66_tftacflattener656 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred66_tftacflattener660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred66_tftacflattener662 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred70_tftacflattener686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_synpred70_tftacflattener688 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred70_tftacflattener692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred70_tftacflattener694 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred70_tftacflattener698 = new BitSet(new long[]{0x00000000000063F8L});

}