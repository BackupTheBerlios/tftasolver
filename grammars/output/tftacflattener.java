// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g 2009-03-05 23:42:46

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
            this.state.ruleMemo = new HashMap[45+1];
             
             
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
                    // elements: tdnf, PAND
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:58:1: nestedterm : ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( tdnf )+ ^( AND ( tdnf )+ ) ( tdnf )* ) -> ^( AND ( tdnf )+ ) | ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( tdnf )+ ^( SAND ( tdnf )+ ) ( tdnf )* ) -> ^( SAND ( tdnf )+ ) | ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( tdnf )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( tdnf )+ ) | ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( tdnf )+ ( ^( XOR tdnf ) )+ ) -> ^( XOR ( tdnf )+ ) | ^( AND ( tdnf )+ ) | ^( SAND ( tdnf )+ ) | ^( OR ( tdnf )+ ) | ^( XOR ( tdnf )+ ) );
    public final tftacflattener.nestedterm_return nestedterm() throws RecognitionException {
        tftacflattener.nestedterm_return retval = new tftacflattener.nestedterm_return();
        retval.start = input.LT(1);
        int nestedterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object AND11=null;
        Object AND12=null;
        Object AND15=null;
        Object AND17=null;
        Object SAND20=null;
        Object SAND21=null;
        Object SAND24=null;
        Object SAND26=null;
        Object OR29=null;
        Object OR30=null;
        Object OR33=null;
        Object OR35=null;
        Object XOR37=null;
        Object XOR38=null;
        Object XOR41=null;
        Object XOR43=null;
        Object AND45=null;
        Object SAND47=null;
        Object OR49=null;
        Object XOR51=null;
        tftacflattener.tdnf_return tdnf13 = null;

        tftacflattener.tdnf_return tdnf14 = null;

        tftacflattener.tdnf_return tdnf16 = null;

        tftacflattener.tdnf_return tdnf18 = null;

        tftacflattener.tdnf_return tdnf19 = null;

        tftacflattener.tdnf_return tdnf22 = null;

        tftacflattener.tdnf_return tdnf23 = null;

        tftacflattener.tdnf_return tdnf25 = null;

        tftacflattener.tdnf_return tdnf27 = null;

        tftacflattener.tdnf_return tdnf28 = null;

        tftacflattener.tdnf_return tdnf31 = null;

        tftacflattener.tdnf_return tdnf32 = null;

        tftacflattener.tdnf_return tdnf34 = null;

        tftacflattener.tdnf_return tdnf36 = null;

        tftacflattener.tdnf_return tdnf39 = null;

        tftacflattener.tdnf_return tdnf40 = null;

        tftacflattener.tdnf_return tdnf42 = null;

        tftacflattener.tdnf_return tdnf44 = null;

        tftacflattener.tdnf_return tdnf46 = null;

        tftacflattener.tdnf_return tdnf48 = null;

        tftacflattener.tdnf_return tdnf50 = null;

        tftacflattener.tdnf_return tdnf52 = null;


        Object AND11_tree=null;
        Object AND12_tree=null;
        Object AND15_tree=null;
        Object AND17_tree=null;
        Object SAND20_tree=null;
        Object SAND21_tree=null;
        Object SAND24_tree=null;
        Object SAND26_tree=null;
        Object OR29_tree=null;
        Object OR30_tree=null;
        Object OR33_tree=null;
        Object OR35_tree=null;
        Object XOR37_tree=null;
        Object XOR38_tree=null;
        Object XOR41_tree=null;
        Object XOR43_tree=null;
        Object AND45_tree=null;
        Object SAND47_tree=null;
        Object OR49_tree=null;
        Object XOR51_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_tdnf=new RewriteRuleSubtreeStream(adaptor,"rule tdnf");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:2: ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( tdnf )+ ^( AND ( tdnf )+ ) ( tdnf )* ) -> ^( AND ( tdnf )+ ) | ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( tdnf )+ ^( SAND ( tdnf )+ ) ( tdnf )* ) -> ^( SAND ( tdnf )+ ) | ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( tdnf )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( tdnf )+ ) | ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( tdnf )+ ( ^( XOR tdnf ) )+ ) -> ^( XOR ( tdnf )+ ) | ^( AND ( tdnf )+ ) | ^( SAND ( tdnf )+ ) | ^( OR ( tdnf )+ ) | ^( XOR ( tdnf )+ ) )
            int alt28=12;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:4: ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND11=(Object)match(input,AND,FOLLOW_AND_in_nestedterm155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND11);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND12=(Object)match(input,AND,FOLLOW_AND_in_nestedterm158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND12);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:16: ( tdnf )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=OR && LA6_0<=ID)||(LA6_0>=TRUE && LA6_0<=FALSE)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm160);
                    	    tdnf13=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf13.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:23: ( tdnf )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=OR && LA7_0<=ID)||(LA7_0>=TRUE && LA7_0<=FALSE)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm164);
                    	    tdnf14=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf14.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: AND, tdnf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:4: -> ^( AND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:60:7: ^( AND ( tdnf )+ )
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:4: ^( AND ( tdnf )+ ^( AND ( tdnf )+ ) ( tdnf )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND15=(Object)match(input,AND,FOLLOW_AND_in_nestedterm184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND15);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:10: ( tdnf )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==AND) ) {
                            int LA8_1 = input.LA(2);

                            if ( (synpred12_tftacflattener()) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>=OR && LA8_0<=XOR)||(LA8_0>=PAND && LA8_0<=ID)||(LA8_0>=TRUE && LA8_0<=FALSE)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm186);
                    	    tdnf16=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf16.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND17=(Object)match(input,AND,FOLLOW_AND_in_nestedterm190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND17);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:22: ( tdnf )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=OR && LA9_0<=ID)||(LA9_0>=TRUE && LA9_0<=FALSE)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm192);
                    	    tdnf18=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf18.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:29: ( tdnf )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=OR && LA10_0<=ID)||(LA10_0>=TRUE && LA10_0<=FALSE)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm196);
                    	    tdnf19=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf19.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
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
                    // 62:4: -> ^( AND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:62:7: ^( AND ( tdnf )+ )
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
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:4: ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND20=(Object)match(input,SAND,FOLLOW_SAND_in_nestedterm216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND20);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND21=(Object)match(input,SAND,FOLLOW_SAND_in_nestedterm219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND21);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:18: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm221);
                    	    tdnf22=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf22.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:25: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm225);
                    	    tdnf23=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf23.getTree());

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
                    // elements: tdnf, SAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:4: -> ^( SAND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:64:7: ^( SAND ( tdnf )+ )
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
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:4: ^( SAND ( tdnf )+ ^( SAND ( tdnf )+ ) ( tdnf )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND24=(Object)match(input,SAND,FOLLOW_SAND_in_nestedterm245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND24);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:11: ( tdnf )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==SAND) ) {
                            int LA13_1 = input.LA(2);

                            if ( (synpred19_tftacflattener()) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0>=OR && LA13_0<=PAND)||LA13_0==ID||(LA13_0>=TRUE && LA13_0<=FALSE)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm247);
                    	    tdnf25=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf25.getTree());

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
                    SAND26=(Object)match(input,SAND,FOLLOW_SAND_in_nestedterm251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND26);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:24: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm253);
                    	    tdnf27=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf27.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:31: ( tdnf )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=OR && LA15_0<=ID)||(LA15_0>=TRUE && LA15_0<=FALSE)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm257);
                    	    tdnf28=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf28.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
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
                    // 66:4: -> ^( SAND ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:66:7: ^( SAND ( tdnf )+ )
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
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:4: ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR29=(Object)match(input,OR,FOLLOW_OR_in_nestedterm277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR29);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR30=(Object)match(input,OR,FOLLOW_OR_in_nestedterm280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR30);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:14: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm282);
                    	    tdnf31=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf31.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:21: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm286);
                    	    tdnf32=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf32.getTree());

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
                    // elements: tdnf, OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:4: -> ^( OR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:68:7: ^( OR ( tdnf )+ )
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
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:4: ^( OR ( tdnf )+ ^( OR ( tdnf )+ ) )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR33=(Object)match(input,OR,FOLLOW_OR_in_nestedterm306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR33);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:9: ( tdnf )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==OR) ) {
                            int LA18_1 = input.LA(2);

                            if ( (synpred26_tftacflattener()) ) {
                                alt18=1;
                            }


                        }
                        else if ( ((LA18_0>=XOR && LA18_0<=ID)||(LA18_0>=TRUE && LA18_0<=FALSE)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:10: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm309);
                    	    tdnf34=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf34.getTree());

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

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR35=(Object)match(input,OR,FOLLOW_OR_in_nestedterm314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR35);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:22: ( tdnf )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=OR && LA19_0<=ID)||(LA19_0>=TRUE && LA19_0<=FALSE)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm316);
                    	    tdnf36=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf36.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


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
                    // 70:4: -> ^( OR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:70:7: ^( OR ( tdnf )+ )
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
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:4: ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR37=(Object)match(input,XOR,FOLLOW_XOR_in_nestedterm337); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR37);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_2 = _last;
                    Object _first_2 = null;
                    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR38=(Object)match(input,XOR,FOLLOW_XOR_in_nestedterm340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR38);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:16: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm342);
                    	    tdnf39=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf39.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:23: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm346);
                    	    tdnf40=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf40.getTree());

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
                    // elements: tdnf, XOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:4: -> ^( XOR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:72:7: ^( XOR ( tdnf )+ )
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
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:4: ^( XOR ( tdnf )+ ( ^( XOR tdnf ) )+ )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR41=(Object)match(input,XOR,FOLLOW_XOR_in_nestedterm366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR41);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:10: ( tdnf )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==XOR) ) {
                            int LA22_1 = input.LA(2);

                            if ( (synpred32_tftacflattener()) ) {
                                alt22=1;
                            }


                        }
                        else if ( (LA22_0==OR||(LA22_0>=AND && LA22_0<=ID)||(LA22_0>=TRUE && LA22_0<=FALSE)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm369);
                    	    tdnf42=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf42.getTree());

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

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:18: ( ^( XOR tdnf ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==XOR) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:19: ^( XOR tdnf )
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    {
                    	    Object _save_last_2 = _last;
                    	    Object _first_2 = null;
                    	    Object root_2 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    	    XOR43=(Object)match(input,XOR,FOLLOW_XOR_in_nestedterm375); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_XOR.add(XOR43);



                    	    match(input, Token.DOWN, null); if (state.failed) return retval;
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm377);
                    	    tdnf44=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_tdnf.add(tdnf44.getTree());

                    	    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    	    }


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
                    // 74:4: -> ^( XOR ( tdnf )+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:74:7: ^( XOR ( tdnf )+ )
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
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:4: ^( AND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND45=(Object)match(input,AND,FOLLOW_AND_in_nestedterm399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND45_tree = (Object)adaptor.dupNode(AND45);

                    root_1 = (Object)adaptor.becomeRoot(AND45_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:10: ( tdnf )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=OR && LA24_0<=ID)||(LA24_0>=TRUE && LA24_0<=FALSE)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm401);
                    	    tdnf46=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf46.getTree());

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


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:4: ^( SAND ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND47=(Object)match(input,SAND,FOLLOW_SAND_in_nestedterm409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND47_tree = (Object)adaptor.dupNode(SAND47);

                    root_1 = (Object)adaptor.becomeRoot(SAND47_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:11: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm411);
                    	    tdnf48=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf48.getTree());

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


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:4: ^( OR ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR49=(Object)match(input,OR,FOLLOW_OR_in_nestedterm419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR49_tree = (Object)adaptor.dupNode(OR49);

                    root_1 = (Object)adaptor.becomeRoot(OR49_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:9: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm421);
                    	    tdnf50=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf50.getTree());

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


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:4: ^( XOR ( tdnf )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR51=(Object)match(input,XOR,FOLLOW_XOR_in_nestedterm429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR51_tree = (Object)adaptor.dupNode(XOR51);

                    root_1 = (Object)adaptor.becomeRoot(XOR51_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:78:10: ( tdnf )+
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
                    	    pushFollow(FOLLOW_tdnf_in_nestedterm431);
                    	    tdnf52=tdnf();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, tdnf52.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 4, nestedterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nestedterm"

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
        	    pushFollow(FOLLOW_tdnf_in_synpred7_tftacflattener115);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt29 >= 1 ) break loop29;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(29, input);
                    throw eee;
            }
            cnt29++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:53:32: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred7_tftacflattener119);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt30 >= 1 ) break loop30;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(30, input);
                    throw eee;
            }
            cnt30++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_tftacflattener

    // $ANTLR start synpred11_tftacflattener
    public final void synpred11_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:4: ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:4: ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,AND,FOLLOW_AND_in_synpred11_tftacflattener155); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred11_tftacflattener158); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:16: ( tdnf )+
        int cnt31=0;
        loop31:
        do {
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=OR && LA31_0<=ID)||(LA31_0>=TRUE && LA31_0<=FALSE)) ) {
                alt31=1;
            }


            switch (alt31) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred11_tftacflattener160);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt31 >= 1 ) break loop31;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(31, input);
                    throw eee;
            }
            cnt31++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:59:23: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred11_tftacflattener164);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt32 >= 1 ) break loop32;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(32, input);
                    throw eee;
            }
            cnt32++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_tftacflattener

    // $ANTLR start synpred12_tftacflattener
    public final void synpred12_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:10: ( tdnf )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:10: tdnf
        {
        pushFollow(FOLLOW_tdnf_in_synpred12_tftacflattener186);
        tdnf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_tftacflattener

    // $ANTLR start synpred15_tftacflattener
    public final void synpred15_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:4: ( ^( AND ( tdnf )+ ^( AND ( tdnf )+ ) ( tdnf )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:4: ^( AND ( tdnf )+ ^( AND ( tdnf )+ ) ( tdnf )* )
        {
        match(input,AND,FOLLOW_AND_in_synpred15_tftacflattener184); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:10: ( tdnf )+
        int cnt33=0;
        loop33:
        do {
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==AND) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred12_tftacflattener()) ) {
                    alt33=1;
                }


            }
            else if ( ((LA33_0>=OR && LA33_0<=XOR)||(LA33_0>=PAND && LA33_0<=ID)||(LA33_0>=TRUE && LA33_0<=FALSE)) ) {
                alt33=1;
            }


            switch (alt33) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred15_tftacflattener186);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt33 >= 1 ) break loop33;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(33, input);
                    throw eee;
            }
            cnt33++;
        } while (true);

        match(input,AND,FOLLOW_AND_in_synpred15_tftacflattener190); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:22: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred15_tftacflattener192);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt34 >= 1 ) break loop34;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(34, input);
                    throw eee;
            }
            cnt34++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:61:29: ( tdnf )*
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
        	    pushFollow(FOLLOW_tdnf_in_synpred15_tftacflattener196);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop35;
            }
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_tftacflattener

    // $ANTLR start synpred18_tftacflattener
    public final void synpred18_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:4: ( ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:4: ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred18_tftacflattener216); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SAND,FOLLOW_SAND_in_synpred18_tftacflattener219); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:18: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred18_tftacflattener221);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt36 >= 1 ) break loop36;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(36, input);
                    throw eee;
            }
            cnt36++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:63:25: ( tdnf )+
        int cnt37=0;
        loop37:
        do {
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=OR && LA37_0<=ID)||(LA37_0>=TRUE && LA37_0<=FALSE)) ) {
                alt37=1;
            }


            switch (alt37) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred18_tftacflattener225);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt37 >= 1 ) break loop37;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(37, input);
                    throw eee;
            }
            cnt37++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_tftacflattener

    // $ANTLR start synpred19_tftacflattener
    public final void synpred19_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:11: ( tdnf )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:11: tdnf
        {
        pushFollow(FOLLOW_tdnf_in_synpred19_tftacflattener247);
        tdnf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_tftacflattener

    // $ANTLR start synpred22_tftacflattener
    public final void synpred22_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:4: ( ^( SAND ( tdnf )+ ^( SAND ( tdnf )+ ) ( tdnf )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:4: ^( SAND ( tdnf )+ ^( SAND ( tdnf )+ ) ( tdnf )* )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred22_tftacflattener245); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:11: ( tdnf )+
        int cnt38=0;
        loop38:
        do {
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SAND) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred19_tftacflattener()) ) {
                    alt38=1;
                }


            }
            else if ( ((LA38_0>=OR && LA38_0<=PAND)||LA38_0==ID||(LA38_0>=TRUE && LA38_0<=FALSE)) ) {
                alt38=1;
            }


            switch (alt38) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred22_tftacflattener247);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt38 >= 1 ) break loop38;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(38, input);
                    throw eee;
            }
            cnt38++;
        } while (true);

        match(input,SAND,FOLLOW_SAND_in_synpred22_tftacflattener251); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:24: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred22_tftacflattener253);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt39 >= 1 ) break loop39;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(39, input);
                    throw eee;
            }
            cnt39++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:65:31: ( tdnf )*
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=OR && LA40_0<=ID)||(LA40_0>=TRUE && LA40_0<=FALSE)) ) {
                alt40=1;
            }


            switch (alt40) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred22_tftacflattener257);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop40;
            }
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_tftacflattener

    // $ANTLR start synpred25_tftacflattener
    public final void synpred25_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:4: ( ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:4: ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,OR,FOLLOW_OR_in_synpred25_tftacflattener277); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred25_tftacflattener280); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:14: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred25_tftacflattener282);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt41 >= 1 ) break loop41;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(41, input);
                    throw eee;
            }
            cnt41++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:67:21: ( tdnf )+
        int cnt42=0;
        loop42:
        do {
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=OR && LA42_0<=ID)||(LA42_0>=TRUE && LA42_0<=FALSE)) ) {
                alt42=1;
            }


            switch (alt42) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred25_tftacflattener286);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt42 >= 1 ) break loop42;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(42, input);
                    throw eee;
            }
            cnt42++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_tftacflattener

    // $ANTLR start synpred26_tftacflattener
    public final void synpred26_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:10: ( tdnf )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:10: tdnf
        {
        pushFollow(FOLLOW_tdnf_in_synpred26_tftacflattener309);
        tdnf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_tftacflattener

    // $ANTLR start synpred28_tftacflattener
    public final void synpred28_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:4: ( ^( OR ( tdnf )+ ^( OR ( tdnf )+ ) ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:4: ^( OR ( tdnf )+ ^( OR ( tdnf )+ ) )
        {
        match(input,OR,FOLLOW_OR_in_synpred28_tftacflattener306); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:9: ( tdnf )+
        int cnt43=0;
        loop43:
        do {
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==OR) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred26_tftacflattener()) ) {
                    alt43=1;
                }


            }
            else if ( ((LA43_0>=XOR && LA43_0<=ID)||(LA43_0>=TRUE && LA43_0<=FALSE)) ) {
                alt43=1;
            }


            switch (alt43) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:10: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred28_tftacflattener309);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt43 >= 1 ) break loop43;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(43, input);
                    throw eee;
            }
            cnt43++;
        } while (true);

        match(input,OR,FOLLOW_OR_in_synpred28_tftacflattener314); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:69:22: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred28_tftacflattener316);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt44 >= 1 ) break loop44;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(44, input);
                    throw eee;
            }
            cnt44++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_tftacflattener

    // $ANTLR start synpred31_tftacflattener
    public final void synpred31_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:4: ( ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:4: ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred31_tftacflattener337); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,XOR,FOLLOW_XOR_in_synpred31_tftacflattener340); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:16: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred31_tftacflattener342);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt45 >= 1 ) break loop45;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(45, input);
                    throw eee;
            }
            cnt45++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:71:23: ( tdnf )+
        int cnt46=0;
        loop46:
        do {
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=OR && LA46_0<=ID)||(LA46_0>=TRUE && LA46_0<=FALSE)) ) {
                alt46=1;
            }


            switch (alt46) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred31_tftacflattener346);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt46 >= 1 ) break loop46;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(46, input);
                    throw eee;
            }
            cnt46++;
        } while (true);


        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_tftacflattener

    // $ANTLR start synpred32_tftacflattener
    public final void synpred32_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: ( tdnf )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: tdnf
        {
        pushFollow(FOLLOW_tdnf_in_synpred32_tftacflattener369);
        tdnf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_tftacflattener

    // $ANTLR start synpred34_tftacflattener
    public final void synpred34_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:4: ( ^( XOR ( tdnf )+ ( ^( XOR tdnf ) )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:4: ^( XOR ( tdnf )+ ( ^( XOR tdnf ) )+ )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred34_tftacflattener366); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:10: ( tdnf )+
        int cnt47=0;
        loop47:
        do {
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==XOR) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred32_tftacflattener()) ) {
                    alt47=1;
                }


            }
            else if ( (LA47_0==OR||(LA47_0>=AND && LA47_0<=ID)||(LA47_0>=TRUE && LA47_0<=FALSE)) ) {
                alt47=1;
            }


            switch (alt47) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:11: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred34_tftacflattener369);
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

        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:18: ( ^( XOR tdnf ) )+
        int cnt48=0;
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==XOR) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:73:19: ^( XOR tdnf )
        	    {
        	    match(input,XOR,FOLLOW_XOR_in_synpred34_tftacflattener375); if (state.failed) return ;

        	    match(input, Token.DOWN, null); if (state.failed) return ;
        	    pushFollow(FOLLOW_tdnf_in_synpred34_tftacflattener377);
        	    tdnf();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    match(input, Token.UP, null); if (state.failed) return ;

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
    // $ANTLR end synpred34_tftacflattener

    // $ANTLR start synpred36_tftacflattener
    public final void synpred36_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:4: ( ^( AND ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:4: ^( AND ( tdnf )+ )
        {
        match(input,AND,FOLLOW_AND_in_synpred36_tftacflattener399); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:75:10: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred36_tftacflattener401);
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

        }
    }
    // $ANTLR end synpred36_tftacflattener

    // $ANTLR start synpred38_tftacflattener
    public final void synpred38_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:4: ( ^( SAND ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:4: ^( SAND ( tdnf )+ )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred38_tftacflattener409); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:76:11: ( tdnf )+
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
        	    pushFollow(FOLLOW_tdnf_in_synpred38_tftacflattener411);
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
    // $ANTLR end synpred38_tftacflattener

    // $ANTLR start synpred40_tftacflattener
    public final void synpred40_tftacflattener_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:4: ( ^( OR ( tdnf )+ ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:4: ^( OR ( tdnf )+ )
        {
        match(input,OR,FOLLOW_OR_in_synpred40_tftacflattener419); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:77:9: ( tdnf )+
        int cnt51=0;
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=OR && LA51_0<=ID)||(LA51_0>=TRUE && LA51_0<=FALSE)) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacflattener.g:0:0: tdnf
        	    {
        	    pushFollow(FOLLOW_tdnf_in_synpred40_tftacflattener421);
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

        }
    }
    // $ANTLR end synpred40_tftacflattener

    // Delegated rules

    public final boolean synpred15_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_tftacflattener_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_tftacflattener() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_tftacflattener_fragment(); // can never throw exception
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


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\21\uffff";
    static final String DFA28_eofS =
        "\21\uffff";
    static final String DFA28_minS =
        "\1\4\4\0\14\uffff";
    static final String DFA28_maxS =
        "\1\10\4\0\14\uffff";
    static final String DFA28_acceptS =
        "\5\uffff\1\1\1\2\1\11\1\3\1\4\1\12\1\5\1\6\1\13\1\7\1\10\1\14";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\14\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\3\1\4\1\1\1\uffff\1\2",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "58:1: nestedterm : ( ^( AND ^( AND ( tdnf )+ ) ( tdnf )+ ) -> ^( AND ( tdnf )+ ) | ^( AND ( tdnf )+ ^( AND ( tdnf )+ ) ( tdnf )* ) -> ^( AND ( tdnf )+ ) | ^( SAND ^( SAND ( tdnf )+ ) ( tdnf )+ ) -> ^( SAND ( tdnf )+ ) | ^( SAND ( tdnf )+ ^( SAND ( tdnf )+ ) ( tdnf )* ) -> ^( SAND ( tdnf )+ ) | ^( OR ^( OR ( tdnf )+ ) ( tdnf )+ ) -> ^( OR ( tdnf )+ ) | ^( OR ( tdnf )+ ^( OR ( tdnf )+ ) ) -> ^( OR ( tdnf )+ ) | ^( XOR ^( XOR ( tdnf )+ ) ( tdnf )+ ) -> ^( XOR ( tdnf )+ ) | ^( XOR ( tdnf )+ ( ^( XOR tdnf ) )+ ) -> ^( XOR ( tdnf )+ ) | ^( AND ( tdnf )+ ) | ^( SAND ( tdnf )+ ) | ^( OR ( tdnf )+ ) | ^( XOR ( tdnf )+ ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_tftacflattener()) ) {s = 5;}

                        else if ( (synpred15_tftacflattener()) ) {s = 6;}

                        else if ( (synpred36_tftacflattener()) ) {s = 7;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_tftacflattener()) ) {s = 8;}

                        else if ( (synpred22_tftacflattener()) ) {s = 9;}

                        else if ( (synpred38_tftacflattener()) ) {s = 10;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_tftacflattener()) ) {s = 11;}

                        else if ( (synpred28_tftacflattener()) ) {s = 12;}

                        else if ( (synpred40_tftacflattener()) ) {s = 13;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_tftacflattener()) ) {s = 14;}

                        else if ( (synpred34_tftacflattener()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
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
    public static final BitSet FOLLOW_AND_in_nestedterm155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_nestedterm158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm160 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm164 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestedterm184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm186 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_nestedterm190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm192 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm196 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestedterm216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_nestedterm219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm221 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm225 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestedterm245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm247 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestedterm251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm253 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm257 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestedterm277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_nestedterm280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm282 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm286 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestedterm306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm309 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestedterm314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm316 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestedterm337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_nestedterm340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm342 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm346 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestedterm366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm369 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestedterm375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_nestedterm399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm401 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_nestedterm409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm411 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_nestedterm419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm421 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_nestedterm429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_nestedterm431 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_PAND_in_synpred7_tftacflattener110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PAND_in_synpred7_tftacflattener113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred7_tftacflattener115 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred7_tftacflattener119 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred11_tftacflattener155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AND_in_synpred11_tftacflattener158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred11_tftacflattener160 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred11_tftacflattener164 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred12_tftacflattener186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred15_tftacflattener184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred15_tftacflattener186 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_synpred15_tftacflattener190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred15_tftacflattener192 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred15_tftacflattener196 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred18_tftacflattener216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SAND_in_synpred18_tftacflattener219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred18_tftacflattener221 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred18_tftacflattener225 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred19_tftacflattener247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAND_in_synpred22_tftacflattener245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred22_tftacflattener247 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred22_tftacflattener251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred22_tftacflattener253 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred22_tftacflattener257 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred25_tftacflattener277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_synpred25_tftacflattener280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred25_tftacflattener282 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred25_tftacflattener286 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred26_tftacflattener309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacflattener306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred28_tftacflattener309 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred28_tftacflattener314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred28_tftacflattener316 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred31_tftacflattener337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_XOR_in_synpred31_tftacflattener340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred31_tftacflattener342 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred31_tftacflattener346 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_tdnf_in_synpred32_tftacflattener369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_synpred34_tftacflattener366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred34_tftacflattener369 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_synpred34_tftacflattener375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred34_tftacflattener377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred36_tftacflattener399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred36_tftacflattener401 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_synpred38_tftacflattener409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred38_tftacflattener411 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_OR_in_synpred40_tftacflattener419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_synpred40_tftacflattener421 = new BitSet(new long[]{0x00000000000063F8L});

}