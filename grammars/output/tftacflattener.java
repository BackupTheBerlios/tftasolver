// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g 2009-03-08 11:53:26

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
            this.state.ruleMemo = new HashMap[90+1];
             
             
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:1: tdnf : ( nestedterm | atom | pandterm | negatedterm );
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

        tftacflattener.negatedterm_return negatedterm4 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:6: ( nestedterm | atom | pandterm | negatedterm )
            int alt1=4;
            switch ( input.LA(1) ) {
            case AND:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_tftacflattener()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case OR:
            case XOR:
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
            case NOT:
                {
                alt1=4;
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
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:46:4: negatedterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_tdnf80);
                    negatedterm4=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negatedterm4.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:49:1: atom : ( ID | TRUE | FALSE );
    public final tftacflattener.atom_return atom() throws RecognitionException {
        tftacflattener.atom_return retval = new tftacflattener.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object set5=null;

        Object set5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:49:7: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            set5=(Object)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set5_tree = (Object)adaptor.dupNode(set5);

                adaptor.addChild(root_0, set5_tree);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:1: pandterm : ( ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ ) -> ^( PAND ( tdnf )+ ) | ^( PAND ( tdnf )+ ) );
    public final tftacflattener.pandterm_return pandterm() throws RecognitionException {
        tftacflattener.pandterm_return retval = new tftacflattener.pandterm_return();
        retval.start = input.LT(1);
        int pandterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object PAND6=null;
        Object PAND7=null;
        Object PAND10=null;
        tftacflattener.tdnf_return tdnf8 = null;

        tftacflattener.tdnf_return tdnf9 = null;

        tftacflattener.tdnf_return tdnf11 = null;


        Object PAND6_tree=null;
        Object PAND7_tree=null;
        Object PAND10_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:9: ( ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ ) -> ^( PAND ( tdnf )+ ) | ^( PAND ( tdnf )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PAND) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred8_tftacflattener()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:11: ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND6=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND6);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND7=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND7);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:25: ( tdnf )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_pandterm120);
                    	    tdnf8=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf8.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:32: ( tdnf )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_pandterm124);
                    	    tdnf9=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf9.getTree());

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
                    // elements: tdnf, PAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:4: -> ^( PAND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:55:7: ^( PAND ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:56:4: ^( PAND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND10=(Object)match(input,PAND,FOLLOW_PAND_in_pandterm144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND10_tree = (Object)adaptor.dupNode(PAND10);

                    root_1 = (Object)adaptor.becomeRoot(PAND10_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:56:11: ( tdnf )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=OR && LA4_0<=ID)||(LA4_0>=NOT && LA4_0<=FALSE)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_pandterm146);
                    	    tdnf11=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf11.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:1: nestedterm : ( nestand | nestor | nestxor | nestsand );
    public final tftacflattener.nestedterm_return nestedterm() throws RecognitionException {
        tftacflattener.nestedterm_return retval = new tftacflattener.nestedterm_return();
        retval.start = input.LT(1);
        int nestedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand12 = null;

        tftacflattener.nestor_return nestor13 = null;

        tftacflattener.nestxor_return nestxor14 = null;

        tftacflattener.nestsand_return nestsand15 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:60:2: ( nestand | nestor | nestxor | nestsand )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:60:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_nestedterm160);
                    nestand12=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand12.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:60:14: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_nestedterm164);
                    nestor13=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor13.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:60:23: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_nestedterm168);
                    nestxor14=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor14.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:60:33: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_nestedterm172);
                    nestsand15=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand15.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:1: otherthanand : ( nestor | nestxor | nestsand | atom | pandterm );
    public final tftacflattener.otherthanand_return otherthanand() throws RecognitionException {
        tftacflattener.otherthanand_return retval = new tftacflattener.otherthanand_return();
        retval.start = input.LT(1);
        int otherthanand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestor_return nestor16 = null;

        tftacflattener.nestxor_return nestxor17 = null;

        tftacflattener.nestsand_return nestsand18 = null;

        tftacflattener.atom_return atom19 = null;

        tftacflattener.pandterm_return pandterm20 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:2: ( nestor | nestxor | nestsand | atom | pandterm )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:4: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_otherthanand183);
                    nestor16=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor16.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:13: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_otherthanand187);
                    nestxor17=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor17.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:23: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_otherthanand191);
                    nestsand18=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand18.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:34: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthanand195);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom19.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:41: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthanand199);
                    pandterm20=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm20.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:1: otherthanor : ( nestand | nestxor | nestsand | atom | pandterm | negatedterm );
    public final tftacflattener.otherthanor_return otherthanor() throws RecognitionException {
        tftacflattener.otherthanor_return retval = new tftacflattener.otherthanor_return();
        retval.start = input.LT(1);
        int otherthanor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand21 = null;

        tftacflattener.nestxor_return nestxor22 = null;

        tftacflattener.nestsand_return nestsand23 = null;

        tftacflattener.atom_return atom24 = null;

        tftacflattener.pandterm_return pandterm25 = null;

        tftacflattener.negatedterm_return negatedterm26 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:2: ( nestand | nestxor | nestsand | atom | pandterm | negatedterm )
            int alt8=6;
            switch ( input.LA(1) ) {
            case AND:
                {
                int LA8_1 = input.LA(2);

                if ( (synpred17_tftacflattener()) ) {
                    alt8=1;
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
            case NOT:
                {
                alt8=6;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_otherthanor210);
                    nestand21=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand21.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:14: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_otherthanor214);
                    nestxor22=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor22.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:24: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_otherthanor218);
                    nestsand23=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand23.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:35: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthanor222);
                    atom24=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom24.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:42: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthanor226);
                    pandterm25=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm25.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:53: negatedterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_otherthanor230);
                    negatedterm26=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negatedterm26.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:1: otherthanxor : ( nestand | nestor | nestsand | atom | pandterm | negatedterm );
    public final tftacflattener.otherthanxor_return otherthanxor() throws RecognitionException {
        tftacflattener.otherthanxor_return retval = new tftacflattener.otherthanxor_return();
        retval.start = input.LT(1);
        int otherthanxor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand27 = null;

        tftacflattener.nestor_return nestor28 = null;

        tftacflattener.nestsand_return nestsand29 = null;

        tftacflattener.atom_return atom30 = null;

        tftacflattener.pandterm_return pandterm31 = null;

        tftacflattener.negatedterm_return negatedterm32 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:2: ( nestand | nestor | nestsand | atom | pandterm | negatedterm )
            int alt9=6;
            switch ( input.LA(1) ) {
            case AND:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred22_tftacflattener()) ) {
                    alt9=1;
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
            case NOT:
                {
                alt9=6;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_otherthanxor240);
                    nestand27=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand27.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:14: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_otherthanxor244);
                    nestor28=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor28.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:23: nestsand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestsand_in_otherthanxor248);
                    nestsand29=nestsand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestsand29.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:34: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthanxor252);
                    atom30=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom30.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:41: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthanxor256);
                    pandterm31=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm31.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:52: negatedterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_otherthanxor260);
                    negatedterm32=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negatedterm32.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:1: otherthansand : ( nestand | nestor | nestxor | atom | pandterm | negatedterm );
    public final tftacflattener.otherthansand_return otherthansand() throws RecognitionException {
        tftacflattener.otherthansand_return retval = new tftacflattener.otherthansand_return();
        retval.start = input.LT(1);
        int otherthansand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        tftacflattener.nestand_return nestand33 = null;

        tftacflattener.nestor_return nestor34 = null;

        tftacflattener.nestxor_return nestxor35 = null;

        tftacflattener.atom_return atom36 = null;

        tftacflattener.pandterm_return pandterm37 = null;

        tftacflattener.negatedterm_return negatedterm38 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:2: ( nestand | nestor | nestxor | atom | pandterm | negatedterm )
            int alt10=6;
            switch ( input.LA(1) ) {
            case AND:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred27_tftacflattener()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
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
            case NOT:
                {
                alt10=6;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:4: nestand
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestand_in_otherthansand270);
                    nestand33=nestand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestand33.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:14: nestor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestor_in_otherthansand274);
                    nestor34=nestor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestor34.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:23: nestxor
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_nestxor_in_otherthansand278);
                    nestxor35=nestxor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nestxor35.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:33: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_atom_in_otherthansand282);
                    atom36=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom36.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:40: pandterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_pandterm_in_otherthansand286);
                    pandterm37=pandterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, pandterm37.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:51: negatedterm
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_negatedterm_in_otherthansand290);
                    negatedterm38=negatedterm();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, negatedterm38.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:1: nestand : ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( tdnf )+ ) );
    public final tftacflattener.nestand_return nestand() throws RecognitionException {
        tftacflattener.nestand_return retval = new tftacflattener.nestand_return();
        retval.start = input.LT(1);
        int nestand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND39=null;
        Object AND40=null;
        Object AND43=null;
        Object AND45=null;
        Object AND47=null;
        Object AND49=null;
        Object AND52=null;
        tftacflattener.tdnf_return tdnf41 = null;

        tftacflattener.tdnf_return tdnf42 = null;

        tftacflattener.otherthanand_return otherthanand44 = null;

        tftacflattener.tdnf_return tdnf46 = null;

        tftacflattener.otherthanand_return otherthanand48 = null;

        tftacflattener.tdnf_return tdnf50 = null;

        tftacflattener.tdnf_return tdnf51 = null;

        tftacflattener.tdnf_return tdnf53 = null;


        Object AND39_tree=null;
        Object AND40_tree=null;
        Object AND43_tree=null;
        Object AND45_tree=null;
        Object AND47_tree=null;
        Object AND49_tree=null;
        Object AND52_tree=null;
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_otherthanand=new RewriteRuleSubtreeStream(adaptor,"rule otherthanand");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:9: ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( otherthanand )+ ( tdnf )+ ) | ^( AND ( tdnf )+ ) )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AND) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred34_tftacflattener()) ) {
                    alt19=1;
                }
                else if ( (synpred37_tftacflattener()) ) {
                    alt19=2;
                }
                else if ( (synpred41_tftacflattener()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:11: ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND39=(Object)match(input,AND,FOLLOW_AND_in_nestand300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND39);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND40=(Object)match(input,AND,FOLLOW_AND_in_nestand303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND40);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:23: ( tdnf )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=OR && LA11_0<=ID)||(LA11_0>=NOT && LA11_0<=FALSE)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand305);
                    	    tdnf41=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf41.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:30: ( tdnf )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=OR && LA12_0<=ID)||(LA12_0>=NOT && LA12_0<=FALSE)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand309);
                    	    tdnf42=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf42.getTree());

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
                    // 75:4: -> ^( AND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:7: ^( AND ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND43=(Object)match(input,AND,FOLLOW_AND_in_nestand329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND43);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:10: ( otherthanand )+
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
                    	    pushFollow(FOLLOW_otherthanand_in_nestand331);
                    	    otherthanand44=otherthanand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanand.add(otherthanand44.getTree());

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
                    AND45=(Object)match(input,AND,FOLLOW_AND_in_nestand335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND45);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:30: ( tdnf )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=OR && LA14_0<=ID)||(LA14_0>=NOT && LA14_0<=FALSE)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand337);
                    	    tdnf46=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf46.getTree());

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
                    // elements: tdnf, AND, otherthanand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:4: -> ^( AND ( otherthanand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:7: ^( AND ( otherthanand )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND47=(Object)match(input,AND,FOLLOW_AND_in_nestand361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND47);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:10: ( otherthanand )+
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
                    	    pushFollow(FOLLOW_otherthanand_in_nestand363);
                    	    otherthanand48=otherthanand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanand.add(otherthanand48.getTree());

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
                    AND49=(Object)match(input,AND,FOLLOW_AND_in_nestand367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND49);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:30: ( tdnf )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=OR && LA16_0<=ID)||(LA16_0>=NOT && LA16_0<=FALSE)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand369);
                    	    tdnf50=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf50.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:37: ( tdnf )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=OR && LA17_0<=ID)||(LA17_0>=NOT && LA17_0<=FALSE)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand373);
                    	    tdnf51=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf51.getTree());

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
                    // elements: AND, tdnf, otherthanand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:4: -> ^( AND ( otherthanand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:79:7: ^( AND ( otherthanand )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:80:4: ^( AND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND52=(Object)match(input,AND,FOLLOW_AND_in_nestand396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND52_tree = (Object)adaptor.dupNode(AND52);

                    root_1 = (Object)adaptor.becomeRoot(AND52_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:80:10: ( tdnf )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=OR && LA18_0<=ID)||(LA18_0>=NOT && LA18_0<=FALSE)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestand398);
                    	    tdnf53=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf53.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:1: nestsand : ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( tdnf )+ ) );
    public final tftacflattener.nestsand_return nestsand() throws RecognitionException {
        tftacflattener.nestsand_return retval = new tftacflattener.nestsand_return();
        retval.start = input.LT(1);
        int nestsand_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object SAND54=null;
        Object SAND55=null;
        Object SAND58=null;
        Object SAND60=null;
        Object SAND62=null;
        Object SAND64=null;
        Object SAND67=null;
        tftacflattener.tdnf_return tdnf56 = null;

        tftacflattener.tdnf_return tdnf57 = null;

        tftacflattener.otherthansand_return otherthansand59 = null;

        tftacflattener.tdnf_return tdnf61 = null;

        tftacflattener.otherthansand_return otherthansand63 = null;

        tftacflattener.tdnf_return tdnf65 = null;

        tftacflattener.tdnf_return tdnf66 = null;

        tftacflattener.tdnf_return tdnf68 = null;


        Object SAND54_tree=null;
        Object SAND55_tree=null;
        Object SAND58_tree=null;
        Object SAND60_tree=null;
        Object SAND62_tree=null;
        Object SAND64_tree=null;
        Object SAND67_tree=null;
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleSubtreeStream stream_otherthansand=new RewriteRuleSubtreeStream(adaptor,"rule otherthansand");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:9: ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( otherthansand )+ ( tdnf )+ ) | ^( SAND ( tdnf )+ ) )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SAND) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred45_tftacflattener()) ) {
                    alt28=1;
                }
                else if ( (synpred48_tftacflattener()) ) {
                    alt28=2;
                }
                else if ( (synpred52_tftacflattener()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:11: ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND54=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND54);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND55=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND55);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:25: ( tdnf )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=OR && LA20_0<=ID)||(LA20_0>=NOT && LA20_0<=FALSE)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand416);
                    	    tdnf56=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf56.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:32: ( tdnf )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=OR && LA21_0<=ID)||(LA21_0>=NOT && LA21_0<=FALSE)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand420);
                    	    tdnf57=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf57.getTree());

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
                    // 84:4: -> ^( SAND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:84:7: ^( SAND ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND58=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND58);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:11: ( otherthansand )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=OR && LA22_0<=PAND)||LA22_0==ID||(LA22_0>=NOT && LA22_0<=FALSE)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthansand_in_nestsand442);
                    	    otherthansand59=otherthansand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthansand.add(otherthansand59.getTree());

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
                    SAND60=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND60);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:33: ( tdnf )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=OR && LA23_0<=ID)||(LA23_0>=NOT && LA23_0<=FALSE)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand448);
                    	    tdnf61=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf61.getTree());

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
                    // elements: tdnf, otherthansand, SAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:4: -> ^( SAND ( otherthansand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:86:7: ^( SAND ( otherthansand )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND62=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND62);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:11: ( otherthansand )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=OR && LA24_0<=PAND)||LA24_0==ID||(LA24_0>=NOT && LA24_0<=FALSE)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthansand_in_nestsand474);
                    	    otherthansand63=otherthansand();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthansand.add(otherthansand63.getTree());

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
                    SAND64=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND64);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:33: ( tdnf )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=OR && LA25_0<=ID)||(LA25_0>=NOT && LA25_0<=FALSE)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand480);
                    	    tdnf65=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf65.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:40: ( tdnf )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=OR && LA26_0<=ID)||(LA26_0>=NOT && LA26_0<=FALSE)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand484);
                    	    tdnf66=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf66.getTree());

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
                    // elements: tdnf, otherthansand, SAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:4: -> ^( SAND ( otherthansand )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:88:7: ^( SAND ( otherthansand )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:89:4: ^( SAND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND67=(Object)match(input,SAND,FOLLOW_SAND_in_nestsand507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND67_tree = (Object)adaptor.dupNode(SAND67);

                    root_1 = (Object)adaptor.becomeRoot(SAND67_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:89:11: ( tdnf )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=OR && LA27_0<=ID)||(LA27_0>=NOT && LA27_0<=FALSE)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestsand509);
                    	    tdnf68=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf68.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:1: nestor : ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( tdnf )+ ) );
    public final tftacflattener.nestor_return nestor() throws RecognitionException {
        tftacflattener.nestor_return retval = new tftacflattener.nestor_return();
        retval.start = input.LT(1);
        int nestor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR69=null;
        Object OR70=null;
        Object OR73=null;
        Object OR75=null;
        Object OR77=null;
        Object OR79=null;
        Object OR82=null;
        tftacflattener.tdnf_return tdnf71 = null;

        tftacflattener.tdnf_return tdnf72 = null;

        tftacflattener.otherthanor_return otherthanor74 = null;

        tftacflattener.tdnf_return tdnf76 = null;

        tftacflattener.otherthanor_return otherthanor78 = null;

        tftacflattener.tdnf_return tdnf80 = null;

        tftacflattener.tdnf_return tdnf81 = null;

        tftacflattener.tdnf_return tdnf83 = null;


        Object OR69_tree=null;
        Object OR70_tree=null;
        Object OR73_tree=null;
        Object OR75_tree=null;
        Object OR77_tree=null;
        Object OR79_tree=null;
        Object OR82_tree=null;
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_otherthanor=new RewriteRuleSubtreeStream(adaptor,"rule otherthanor");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:8: ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( otherthanor )+ ( tdnf )+ ) | ^( OR ( tdnf )+ ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==OR) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred56_tftacflattener()) ) {
                    alt37=1;
                }
                else if ( (synpred59_tftacflattener()) ) {
                    alt37=2;
                }
                else if ( (synpred63_tftacflattener()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:10: ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR69=(Object)match(input,OR,FOLLOW_OR_in_nestor523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR69);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR70=(Object)match(input,OR,FOLLOW_OR_in_nestor526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR70);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:20: ( tdnf )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=OR && LA29_0<=ID)||(LA29_0>=NOT && LA29_0<=FALSE)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor528);
                    	    tdnf71=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf71.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:27: ( tdnf )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=OR && LA30_0<=ID)||(LA30_0>=NOT && LA30_0<=FALSE)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor532);
                    	    tdnf72=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf72.getTree());

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
                    // 93:4: -> ^( OR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:93:7: ^( OR ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR73=(Object)match(input,OR,FOLLOW_OR_in_nestor552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR73);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:9: ( otherthanor )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=XOR && LA31_0<=ID)||(LA31_0>=NOT && LA31_0<=FALSE)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanor_in_nestor554);
                    	    otherthanor74=otherthanor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanor.add(otherthanor74.getTree());

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
                    OR75=(Object)match(input,OR,FOLLOW_OR_in_nestor558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR75);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:27: ( tdnf )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=OR && LA32_0<=ID)||(LA32_0>=NOT && LA32_0<=FALSE)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor560);
                    	    tdnf76=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf76.getTree());

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
                    // elements: otherthanor, OR, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:4: -> ^( OR ( otherthanor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:95:7: ^( OR ( otherthanor )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR77=(Object)match(input,OR,FOLLOW_OR_in_nestor584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR77);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:9: ( otherthanor )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=XOR && LA33_0<=ID)||(LA33_0>=NOT && LA33_0<=FALSE)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanor_in_nestor586);
                    	    otherthanor78=otherthanor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanor.add(otherthanor78.getTree());

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
                    OR79=(Object)match(input,OR,FOLLOW_OR_in_nestor590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR79);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:27: ( tdnf )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=OR && LA34_0<=ID)||(LA34_0>=NOT && LA34_0<=FALSE)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor592);
                    	    tdnf80=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf80.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:34: ( tdnf )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=OR && LA35_0<=ID)||(LA35_0>=NOT && LA35_0<=FALSE)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor596);
                    	    tdnf81=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf81.getTree());

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
                    // elements: otherthanor, tdnf, OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:4: -> ^( OR ( otherthanor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:97:7: ^( OR ( otherthanor )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:98:4: ^( OR ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR82=(Object)match(input,OR,FOLLOW_OR_in_nestor619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR82_tree = (Object)adaptor.dupNode(OR82);

                    root_1 = (Object)adaptor.becomeRoot(OR82_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:98:9: ( tdnf )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=OR && LA36_0<=ID)||(LA36_0>=NOT && LA36_0<=FALSE)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestor621);
                    	    tdnf83=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf83.getTree());

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:1: nestxor : ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( tdnf )+ ) );
    public final tftacflattener.nestxor_return nestxor() throws RecognitionException {
        tftacflattener.nestxor_return retval = new tftacflattener.nestxor_return();
        retval.start = input.LT(1);
        int nestxor_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object XOR84=null;
        Object XOR85=null;
        Object XOR88=null;
        Object XOR90=null;
        Object XOR92=null;
        Object XOR94=null;
        Object XOR97=null;
        tftacflattener.tdnf_return tdnf86 = null;

        tftacflattener.tdnf_return tdnf87 = null;

        tftacflattener.otherthanxor_return otherthanxor89 = null;

        tftacflattener.tdnf_return tdnf91 = null;

        tftacflattener.otherthanxor_return otherthanxor93 = null;

        tftacflattener.tdnf_return tdnf95 = null;

        tftacflattener.tdnf_return tdnf96 = null;

        tftacflattener.tdnf_return tdnf98 = null;


        Object XOR84_tree=null;
        Object XOR85_tree=null;
        Object XOR88_tree=null;
        Object XOR90_tree=null;
        Object XOR92_tree=null;
        Object XOR94_tree=null;
        Object XOR97_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleSubtreeStream stream_otherthanxor=new RewriteRuleSubtreeStream(adaptor,"rule otherthanxor");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:9: ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( otherthanxor )+ ( tdnf )+ ) | ^( XOR ( tdnf )+ ) )
            int alt46=4;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==XOR) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred67_tftacflattener()) ) {
                    alt46=1;
                }
                else if ( (synpred70_tftacflattener()) ) {
                    alt46=2;
                }
                else if ( (synpred74_tftacflattener()) ) {
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:11: ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR84=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR84);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR85=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR85);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:23: ( tdnf )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=OR && LA38_0<=ID)||(LA38_0>=NOT && LA38_0<=FALSE)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor645);
                    	    tdnf86=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf86.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:30: ( tdnf )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=OR && LA39_0<=ID)||(LA39_0>=NOT && LA39_0<=FALSE)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor649);
                    	    tdnf87=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf87.getTree());

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
                    // elements: tdnf, XOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:4: -> ^( XOR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:102:7: ^( XOR ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR88=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR88);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:10: ( otherthanxor )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==OR||(LA40_0>=AND && LA40_0<=ID)||(LA40_0>=NOT && LA40_0<=FALSE)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanxor_in_nestxor671);
                    	    otherthanxor89=otherthanxor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanxor.add(otherthanxor89.getTree());

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
                    XOR90=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR90);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:30: ( tdnf )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=OR && LA41_0<=ID)||(LA41_0>=NOT && LA41_0<=FALSE)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor677);
                    	    tdnf91=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf91.getTree());

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
                    // elements: XOR, otherthanxor, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:4: -> ^( XOR ( otherthanxor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:104:7: ^( XOR ( otherthanxor )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR92=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR92);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:10: ( otherthanxor )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==OR||(LA42_0>=AND && LA42_0<=ID)||(LA42_0>=NOT && LA42_0<=FALSE)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_otherthanxor_in_nestxor703);
                    	    otherthanxor93=otherthanxor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_otherthanxor.add(otherthanxor93.getTree());

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
                    XOR94=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR94);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:30: ( tdnf )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=OR && LA43_0<=ID)||(LA43_0>=NOT && LA43_0<=FALSE)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor709);
                    	    tdnf95=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf95.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:37: ( tdnf )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=OR && LA44_0<=ID)||(LA44_0>=NOT && LA44_0<=FALSE)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor713);
                    	    tdnf96=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf96.getTree());

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
                    // elements: tdnf, XOR, otherthanxor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:4: -> ^( XOR ( otherthanxor )+ ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:106:7: ^( XOR ( otherthanxor )+ ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:107:4: ^( XOR ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR97=(Object)match(input,XOR,FOLLOW_XOR_in_nestxor736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR97_tree = (Object)adaptor.dupNode(XOR97);

                    root_1 = (Object)adaptor.becomeRoot(XOR97_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:107:10: ( tdnf )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=OR && LA45_0<=ID)||(LA45_0>=NOT && LA45_0<=FALSE)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestxor738);
                    	    tdnf98=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf98.getTree());

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

    public static class negatedterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negatedterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:110:1: negatedterm : ( ^( NOT ID ) | ^( AND ( negatedterm )+ ) );
    public final tftacflattener.negatedterm_return negatedterm() throws RecognitionException {
        tftacflattener.negatedterm_return retval = new tftacflattener.negatedterm_return();
        retval.start = input.LT(1);
        int negatedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT99=null;
        Object ID100=null;
        Object AND101=null;
        tftacflattener.negatedterm_return negatedterm102 = null;


        Object NOT99_tree=null;
        Object ID100_tree=null;
        Object AND101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:111:2: ( ^( NOT ID ) | ^( AND ( negatedterm )+ ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==NOT) ) {
                alt48=1;
            }
            else if ( (LA48_0==AND) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:111:4: ^( NOT ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT99=(Object)match(input,NOT,FOLLOW_NOT_in_negatedterm754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT99_tree = (Object)adaptor.dupNode(NOT99);

                    root_1 = (Object)adaptor.becomeRoot(NOT99_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    ID100=(Object)match(input,ID,FOLLOW_ID_in_negatedterm756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID100_tree = (Object)adaptor.dupNode(ID100);

                    adaptor.addChild(root_1, ID100_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:112:4: ^( AND ( negatedterm )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND101=(Object)match(input,AND,FOLLOW_AND_in_negatedterm763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND101_tree = (Object)adaptor.dupNode(AND101);

                    root_1 = (Object)adaptor.becomeRoot(AND101_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:112:10: ( negatedterm )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==AND||LA47_0==NOT) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: negatedterm
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_negatedterm_in_negatedterm765);
                    	    negatedterm102=negatedterm();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, negatedterm102.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
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
            if ( state.backtracking>0 ) { memoize(input, 13, negatedterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negatedterm"

    // $ANTLR start synpred1_tftacflattener
    public final void synpred1_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:11: ( nestedterm )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:43:11: nestedterm
        {
        pushFollow(FOLLOW_nestedterm_in_synpred1_tftacflattener65);
        nestedterm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_tftacflattener

    // $ANTLR start synpred8_tftacflattener
    public final void synpred8_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:11: ( ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:11: ^( PAND ^( PAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred8_tftacflattener115); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,PAND,FOLLOW_PAND_in_synpred8_tftacflattener118); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:25: ( tdnf )+
        int cnt49=0;
        loop49:
        do {
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=OR && LA49_0<=ID)||(LA49_0>=NOT && LA49_0<=FALSE)) ) {
                alt49=1;
            }


            switch (alt49) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred8_tftacflattener120);
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
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:54:32: ( tdnf )+
        int cnt50=0;
        loop50:
        do {
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=OR && LA50_0<=ID)||(LA50_0>=NOT && LA50_0<=FALSE)) ) {
                alt50=1;
            }


            switch (alt50) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred8_tftacflattener124);
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
    // $ANTLR end synpred8_tftacflattener

    // $ANTLR start synpred17_tftacflattener
    public final void synpred17_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:4: ( nestand )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:4: nestand
        {
        pushFollow(FOLLOW_nestand_in_synpred17_tftacflattener210);
        nestand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_tftacflattener

    // $ANTLR start synpred22_tftacflattener
    public final void synpred22_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:4: ( nestand )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:4: nestand
        {
        pushFollow(FOLLOW_nestand_in_synpred22_tftacflattener240);
        nestand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_tftacflattener

    // $ANTLR start synpred27_tftacflattener
    public final void synpred27_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:4: ( nestand )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:4: nestand
        {
        pushFollow(FOLLOW_nestand_in_synpred27_tftacflattener270);
        nestand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_tftacflattener

    // $ANTLR start synpred34_tftacflattener
    public final void synpred34_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:11: ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:11: ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,AND,FOLLOW_AND_in_synpred34_tftacflattener300); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred34_tftacflattener303); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:23: ( tdnf )+
        int cnt51=0;
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=OR && LA51_0<=ID)||(LA51_0>=NOT && LA51_0<=FALSE)) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred34_tftacflattener305);
        	    tdnf();

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


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:30: ( tdnf )+
        int cnt52=0;
        loop52:
        do {
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=OR && LA52_0<=ID)||(LA52_0>=NOT && LA52_0<=FALSE)) ) {
                alt52=1;
            }


            switch (alt52) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred34_tftacflattener309);
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

        }
    }
    // $ANTLR end synpred34_tftacflattener

    // $ANTLR start synpred37_tftacflattener
    public final void synpred37_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:4: ( ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) )
        {
        match(input,AND,FOLLOW_AND_in_synpred37_tftacflattener329); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:10: ( otherthanand )+
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
        	    pushFollow(FOLLOW_otherthanand_in_synpred37_tftacflattener331);
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

        match(input,AND,FOLLOW_AND_in_synpred37_tftacflattener335); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:30: ( tdnf )+
        int cnt54=0;
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=OR && LA54_0<=ID)||(LA54_0>=NOT && LA54_0<=FALSE)) ) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred37_tftacflattener337);
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

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_tftacflattener

    // $ANTLR start synpred41_tftacflattener
    public final void synpred41_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:4: ( ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:4: ^( AND ( otherthanand )+ ^( AND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,AND,FOLLOW_AND_in_synpred41_tftacflattener361); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:10: ( otherthanand )+
        int cnt55=0;
        loop55:
        do {
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=OR && LA55_0<=XOR)||(LA55_0>=PAND && LA55_0<=ID)||(LA55_0>=TRUE && LA55_0<=FALSE)) ) {
                alt55=1;
            }


            switch (alt55) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanand
        	    {
        	    pushFollow(FOLLOW_otherthanand_in_synpred41_tftacflattener363);
        	    otherthanand();

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

        match(input,AND,FOLLOW_AND_in_synpred41_tftacflattener367); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:30: ( tdnf )+
        int cnt56=0;
        loop56:
        do {
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=OR && LA56_0<=ID)||(LA56_0>=NOT && LA56_0<=FALSE)) ) {
                alt56=1;
            }


            switch (alt56) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred41_tftacflattener369);
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
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:37: ( tdnf )+
        int cnt57=0;
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=OR && LA57_0<=ID)||(LA57_0>=NOT && LA57_0<=FALSE)) ) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred41_tftacflattener373);
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

    // $ANTLR start synpred45_tftacflattener
    public final void synpred45_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:11: ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:11: ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred45_tftacflattener411); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred45_tftacflattener414); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:25: ( tdnf )+
        int cnt58=0;
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=OR && LA58_0<=ID)||(LA58_0>=NOT && LA58_0<=FALSE)) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred45_tftacflattener416);
        	    tdnf();

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


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:83:32: ( tdnf )+
        int cnt59=0;
        loop59:
        do {
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=OR && LA59_0<=ID)||(LA59_0>=NOT && LA59_0<=FALSE)) ) {
                alt59=1;
            }


            switch (alt59) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred45_tftacflattener420);
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

        }
    }
    // $ANTLR end synpred45_tftacflattener

    // $ANTLR start synpred48_tftacflattener
    public final void synpred48_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:4: ( ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred48_tftacflattener440); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:11: ( otherthansand )+
        int cnt60=0;
        loop60:
        do {
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=OR && LA60_0<=PAND)||LA60_0==ID||(LA60_0>=NOT && LA60_0<=FALSE)) ) {
                alt60=1;
            }


            switch (alt60) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
        	    {
        	    pushFollow(FOLLOW_otherthansand_in_synpred48_tftacflattener442);
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

        match(input,SAND,FOLLOW_SAND_in_synpred48_tftacflattener446); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:85:33: ( tdnf )+
        int cnt61=0;
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=OR && LA61_0<=ID)||(LA61_0>=NOT && LA61_0<=FALSE)) ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred48_tftacflattener448);
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

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_tftacflattener

    // $ANTLR start synpred52_tftacflattener
    public final void synpred52_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:4: ( ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:4: ^( SAND ( otherthansand )+ ^( SAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred52_tftacflattener472); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:11: ( otherthansand )+
        int cnt62=0;
        loop62:
        do {
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=OR && LA62_0<=PAND)||LA62_0==ID||(LA62_0>=NOT && LA62_0<=FALSE)) ) {
                alt62=1;
            }


            switch (alt62) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthansand
        	    {
        	    pushFollow(FOLLOW_otherthansand_in_synpred52_tftacflattener474);
        	    otherthansand();

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

        match(input,SAND,FOLLOW_SAND_in_synpred52_tftacflattener478); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:33: ( tdnf )+
        int cnt63=0;
        loop63:
        do {
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=OR && LA63_0<=ID)||(LA63_0>=NOT && LA63_0<=FALSE)) ) {
                alt63=1;
            }


            switch (alt63) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred52_tftacflattener480);
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
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:87:40: ( tdnf )+
        int cnt64=0;
        loop64:
        do {
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=OR && LA64_0<=ID)||(LA64_0>=NOT && LA64_0<=FALSE)) ) {
                alt64=1;
            }


            switch (alt64) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred52_tftacflattener484);
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

    // $ANTLR start synpred56_tftacflattener
    public final void synpred56_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:10: ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:10: ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,OR,FOLLOW_OR_in_synpred56_tftacflattener523); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred56_tftacflattener526); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:20: ( tdnf )+
        int cnt65=0;
        loop65:
        do {
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=OR && LA65_0<=ID)||(LA65_0>=NOT && LA65_0<=FALSE)) ) {
                alt65=1;
            }


            switch (alt65) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred56_tftacflattener528);
        	    tdnf();

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


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:92:27: ( tdnf )+
        int cnt66=0;
        loop66:
        do {
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=OR && LA66_0<=ID)||(LA66_0>=NOT && LA66_0<=FALSE)) ) {
                alt66=1;
            }


            switch (alt66) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred56_tftacflattener532);
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

        }
    }
    // $ANTLR end synpred56_tftacflattener

    // $ANTLR start synpred59_tftacflattener
    public final void synpred59_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:4: ( ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred59_tftacflattener552); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:9: ( otherthanor )+
        int cnt67=0;
        loop67:
        do {
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=XOR && LA67_0<=ID)||(LA67_0>=NOT && LA67_0<=FALSE)) ) {
                alt67=1;
            }


            switch (alt67) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
        	    {
        	    pushFollow(FOLLOW_otherthanor_in_synpred59_tftacflattener554);
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

        match(input,OR,FOLLOW_OR_in_synpred59_tftacflattener558); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:94:27: ( tdnf )+
        int cnt68=0;
        loop68:
        do {
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=OR && LA68_0<=ID)||(LA68_0>=NOT && LA68_0<=FALSE)) ) {
                alt68=1;
            }


            switch (alt68) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred59_tftacflattener560);
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

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_tftacflattener

    // $ANTLR start synpred63_tftacflattener
    public final void synpred63_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:4: ( ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:4: ^( OR ( otherthanor )+ ^( OR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,OR,FOLLOW_OR_in_synpred63_tftacflattener584); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:9: ( otherthanor )+
        int cnt69=0;
        loop69:
        do {
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=XOR && LA69_0<=ID)||(LA69_0>=NOT && LA69_0<=FALSE)) ) {
                alt69=1;
            }


            switch (alt69) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanor
        	    {
        	    pushFollow(FOLLOW_otherthanor_in_synpred63_tftacflattener586);
        	    otherthanor();

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

        match(input,OR,FOLLOW_OR_in_synpred63_tftacflattener590); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:27: ( tdnf )+
        int cnt70=0;
        loop70:
        do {
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=OR && LA70_0<=ID)||(LA70_0>=NOT && LA70_0<=FALSE)) ) {
                alt70=1;
            }


            switch (alt70) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred63_tftacflattener592);
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
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:96:34: ( tdnf )+
        int cnt71=0;
        loop71:
        do {
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=OR && LA71_0<=ID)||(LA71_0>=NOT && LA71_0<=FALSE)) ) {
                alt71=1;
            }


            switch (alt71) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred63_tftacflattener596);
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

    // $ANTLR start synpred67_tftacflattener
    public final void synpred67_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:11: ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:11: ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred67_tftacflattener640); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred67_tftacflattener643); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:23: ( tdnf )+
        int cnt72=0;
        loop72:
        do {
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=OR && LA72_0<=ID)||(LA72_0>=NOT && LA72_0<=FALSE)) ) {
                alt72=1;
            }


            switch (alt72) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred67_tftacflattener645);
        	    tdnf();

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


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:101:30: ( tdnf )+
        int cnt73=0;
        loop73:
        do {
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=OR && LA73_0<=ID)||(LA73_0>=NOT && LA73_0<=FALSE)) ) {
                alt73=1;
            }


            switch (alt73) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred67_tftacflattener649);
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

        }
    }
    // $ANTLR end synpred67_tftacflattener

    // $ANTLR start synpred70_tftacflattener
    public final void synpred70_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:4: ( ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred70_tftacflattener669); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:10: ( otherthanxor )+
        int cnt74=0;
        loop74:
        do {
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==OR||(LA74_0>=AND && LA74_0<=ID)||(LA74_0>=NOT && LA74_0<=FALSE)) ) {
                alt74=1;
            }


            switch (alt74) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
        	    {
        	    pushFollow(FOLLOW_otherthanxor_in_synpred70_tftacflattener671);
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

        match(input,XOR,FOLLOW_XOR_in_synpred70_tftacflattener675); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:103:30: ( tdnf )+
        int cnt75=0;
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=OR && LA75_0<=ID)||(LA75_0>=NOT && LA75_0<=FALSE)) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred70_tftacflattener677);
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

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_tftacflattener

    // $ANTLR start synpred74_tftacflattener
    public final void synpred74_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:4: ( ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:4: ^( XOR ( otherthanxor )+ ^( XOR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred74_tftacflattener701); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:10: ( otherthanxor )+
        int cnt76=0;
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==OR||(LA76_0>=AND && LA76_0<=ID)||(LA76_0>=NOT && LA76_0<=FALSE)) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: otherthanxor
        	    {
        	    pushFollow(FOLLOW_otherthanxor_in_synpred74_tftacflattener703);
        	    otherthanxor();

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

        match(input,XOR,FOLLOW_XOR_in_synpred74_tftacflattener707); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:30: ( tdnf )+
        int cnt77=0;
        loop77:
        do {
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=OR && LA77_0<=ID)||(LA77_0>=NOT && LA77_0<=FALSE)) ) {
                alt77=1;
            }


            switch (alt77) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred74_tftacflattener709);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt77 >= 1 ) break loop77;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(77, input);
                    throw eee;
            }
            cnt77++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:105:37: ( tdnf )+
        int cnt78=0;
        loop78:
        do {
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=OR && LA78_0<=ID)||(LA78_0>=NOT && LA78_0<=FALSE)) ) {
                alt78=1;
            }


            switch (alt78) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred74_tftacflattener713);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt78 >= 1 ) break loop78;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(78, input);
                    throw eee;
            }
            cnt78++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_tftacflattener

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
    public final boolean synpred67_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_tftacflattener_fragment(); // can never throw exception
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
    public final boolean synpred8_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_tftacflattener_fragment(); // can never throw exception
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
    public final boolean synpred27_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_tftacflattener_fragment(); // can never throw exception
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
    public final boolean synpred56_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_tftacflattener_fragment(); // can never throw exception
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
    public final boolean synpred34_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_tftacflattener_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_negatedterm_in_tdnf80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_pandterm115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_pandterm118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_pandterm120 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_pandterm124 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_pandterm144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_pandterm146 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_nestand_in_nestedterm160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_nestedterm164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_nestedterm168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_nestedterm172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_otherthanand183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_otherthanand187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_otherthanand191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthanand195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthanand199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_otherthanor210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_otherthanor214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_otherthanor218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthanor222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthanor226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negatedterm_in_otherthanor230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_otherthanxor240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_otherthanxor244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestsand_in_otherthanxor248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthanxor252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthanxor256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negatedterm_in_otherthanxor260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_otherthansand270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestor_in_otherthansand274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestxor_in_otherthansand278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_otherthansand282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pandterm_in_otherthansand286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negatedterm_in_otherthansand290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_nestand300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_nestand303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand305 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestand309 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_nestand329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_nestand331 = new BitSet(new long[]{0x00000000000063F0L});
    public static final BitSet FOLLOW_AND_in_nestand335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand337 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_nestand361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_nestand363 = new BitSet(new long[]{0x00000000000063F0L});
    public static final BitSet FOLLOW_AND_in_nestand367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand369 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestand373 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_nestand396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestand398 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_nestsand414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand416 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestsand420 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_nestsand442 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand448 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_nestsand474 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand480 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestsand484 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_nestsand507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestsand509 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_nestor523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_nestor526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor528 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestor532 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_nestor552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_nestor554 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_nestor558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor560 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_nestor584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_nestor586 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_nestor590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor592 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestor596 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_nestor619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestor621 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_nestxor643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor645 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestxor649 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_nestxor671 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor677 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_nestxor703 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor709 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_nestxor713 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_nestxor736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestxor738 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_negatedterm754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_negatedterm756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_negatedterm763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negatedterm_in_negatedterm765 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_nestedterm_in_synpred1_tftacflattener65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_synpred8_tftacflattener115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred8_tftacflattener118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred8_tftacflattener120 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred8_tftacflattener124 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_nestand_in_synpred17_tftacflattener210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_synpred22_tftacflattener240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nestand_in_synpred27_tftacflattener270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacflattener300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred34_tftacflattener303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred34_tftacflattener305 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred34_tftacflattener309 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_synpred37_tftacflattener329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_synpred37_tftacflattener331 = new BitSet(new long[]{0x00000000000063F0L});
    public static final BitSet FOLLOW_AND_in_synpred37_tftacflattener335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred37_tftacflattener337 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_synpred41_tftacflattener361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanand_in_synpred41_tftacflattener363 = new BitSet(new long[]{0x00000000000063F0L});
    public static final BitSet FOLLOW_AND_in_synpred41_tftacflattener367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred41_tftacflattener369 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred41_tftacflattener373 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred45_tftacflattener411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred45_tftacflattener414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred45_tftacflattener416 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred45_tftacflattener420 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred48_tftacflattener440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_synpred48_tftacflattener442 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred48_tftacflattener446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred48_tftacflattener448 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred52_tftacflattener472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthansand_in_synpred52_tftacflattener474 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred52_tftacflattener478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred52_tftacflattener480 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred52_tftacflattener484 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_synpred56_tftacflattener523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred56_tftacflattener526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred56_tftacflattener528 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred56_tftacflattener532 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_synpred59_tftacflattener552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_synpred59_tftacflattener554 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_synpred59_tftacflattener558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred59_tftacflattener560 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_synpred63_tftacflattener584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanor_in_synpred63_tftacflattener586 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_OR_in_synpred63_tftacflattener590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred63_tftacflattener592 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred63_tftacflattener596 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_synpred67_tftacflattener640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred67_tftacflattener643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred67_tftacflattener645 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred67_tftacflattener649 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_synpred70_tftacflattener669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_synpred70_tftacflattener671 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_synpred70_tftacflattener675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred70_tftacflattener677 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_synpred74_tftacflattener701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_otherthanxor_in_synpred74_tftacflattener703 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_synpred74_tftacflattener707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred74_tftacflattener709 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred74_tftacflattener713 = new BitSet(new long[]{0x00000000000073F8L});

}