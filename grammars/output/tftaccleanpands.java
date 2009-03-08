// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g 2009-03-08 12:00:29

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftaccleanpands extends TreeParser {
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


        public tftaccleanpands(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftaccleanpands(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[18+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftaccleanpands.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:44:1: expression : ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> FALSE | ^( PAND (a+= expression )* ) | ^( AND ( negterm )+ FALSE ) -> FALSE | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE | FALSE );
    public final tftaccleanpands.expression_return expression() throws RecognitionException {
        tftaccleanpands.expression_return retval = new tftaccleanpands.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR1=null;
        Object XOR2=null;
        Object PAND3=null;
        Object FALSE4=null;
        Object PAND5=null;
        Object AND6=null;
        Object FALSE8=null;
        Object AND9=null;
        Object SAND10=null;
        Object NOT11=null;
        Object ID12=null;
        Object TRUE13=null;
        Object FALSE14=null;
        List list_a=null;
        tftaccleanpands.expression_return c = null;

        tftaccleanpands.negterm_return negterm7 = null;

        RuleReturnScope a = null;
        Object OR1_tree=null;
        Object XOR2_tree=null;
        Object PAND3_tree=null;
        Object FALSE4_tree=null;
        Object PAND5_tree=null;
        Object AND6_tree=null;
        Object FALSE8_tree=null;
        Object AND9_tree=null;
        Object SAND10_tree=null;
        Object NOT11_tree=null;
        Object ID12_tree=null;
        Object TRUE13_tree=null;
        Object FALSE14_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleSubtreeStream stream_negterm=new RewriteRuleSubtreeStream(adaptor,"rule negterm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:45:2: ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> FALSE | ^( PAND (a+= expression )* ) | ^( AND ( negterm )+ FALSE ) -> FALSE | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE | FALSE )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:45:4: ^( OR (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR1=(Object)match(input,OR,FOLLOW_OR_in_expression64); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR1_tree = (Object)adaptor.dupNode(OR1);

                    root_1 = (Object)adaptor.becomeRoot(OR1_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:45:12: (a+= expression )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:45:13: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression72);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, a.getTree());
                        	    if (list_a==null) list_a=new ArrayList();
                        	    list_a.add(a.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop1;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:46:7: ^( XOR (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR2=(Object)match(input,XOR,FOLLOW_XOR_in_expression84); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR2_tree = (Object)adaptor.dupNode(XOR2);

                    root_1 = (Object)adaptor.becomeRoot(XOR2_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:46:15: (a+= expression )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:46:16: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression91);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, a.getTree());
                        	    if (list_a==null) list_a=new ArrayList();
                        	    list_a.add(a.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop2;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:47:4: ^( PAND FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND3=(Object)match(input,PAND,FOLLOW_PAND_in_expression100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND3);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE4=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE4);


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
                    // 47:20: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:7: ^( PAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND5=(Object)match(input,PAND,FOLLOW_PAND_in_expression118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND5_tree = (Object)adaptor.dupNode(PAND5);

                    root_1 = (Object)adaptor.becomeRoot(PAND5_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:15: (a+= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:16: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression124);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, a.getTree());
                        	    if (list_a==null) list_a=new ArrayList();
                        	    list_a.add(a.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop3;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:4: ^( AND ( negterm )+ FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND6=(Object)match(input,AND,FOLLOW_AND_in_expression133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND6);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:10: ( negterm )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==NOT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:0:0: negterm
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_negterm_in_expression135);
                    	    negterm7=negterm();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_negterm.add(negterm7.getTree());

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

                    _last = (Object)input.LT(1);
                    FALSE8=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE8);


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
                    // 49:26: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:6: ^( AND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND9=(Object)match(input,AND,FOLLOW_AND_in_expression151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND9_tree = (Object)adaptor.dupNode(AND9);

                    root_1 = (Object)adaptor.becomeRoot(AND9_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:14: (a+= expression )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:15: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression158);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, a.getTree());
                        	    if (list_a==null) list_a=new ArrayList();
                        	    list_a.add(a.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop5;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:51:4: ^( SAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND10=(Object)match(input,SAND,FOLLOW_SAND_in_expression167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND10_tree = (Object)adaptor.dupNode(SAND10);

                    root_1 = (Object)adaptor.becomeRoot(SAND10_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:51:12: (a+= expression )*
                        loop6:
                        do {
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( ((LA6_0>=OR && LA6_0<=ID)||(LA6_0>=NOT && LA6_0<=FALSE)) ) {
                                alt6=1;
                            }


                            switch (alt6) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:51:13: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression173);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, a.getTree());
                        	    if (list_a==null) list_a=new ArrayList();
                        	    list_a.add(a.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop6;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:7: ^( NOT c= expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT11=(Object)match(input,NOT,FOLLOW_NOT_in_expression185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT11_tree = (Object)adaptor.dupNode(NOT11);

                    root_1 = (Object)adaptor.becomeRoot(NOT11_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression190);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, c.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:53:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID12=(Object)match(input,ID,FOLLOW_ID_in_expression200); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID12_tree = (Object)adaptor.dupNode(ID12);

                    adaptor.addChild(root_0, ID12_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE13=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE13_tree = (Object)adaptor.dupNode(TRUE13);

                    adaptor.addChild(root_0, TRUE13_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:55:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE14=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE14_tree = (Object)adaptor.dupNode(FALSE14);

                    adaptor.addChild(root_0, FALSE14_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 1, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class negterm_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negterm"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:58:1: negterm : ^( NOT ID ) ;
    public final tftaccleanpands.negterm_return negterm() throws RecognitionException {
        tftaccleanpands.negterm_return retval = new tftaccleanpands.negterm_return();
        retval.start = input.LT(1);
        int negterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT15=null;
        Object ID16=null;

        Object NOT15_tree=null;
        Object ID16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:58:9: ( ^( NOT ID ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:58:11: ^( NOT ID )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            NOT15=(Object)match(input,NOT,FOLLOW_NOT_in_negterm231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NOT15_tree = (Object)adaptor.dupNode(NOT15);

            root_1 = (Object)adaptor.becomeRoot(NOT15_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            ID16=(Object)match(input,ID,FOLLOW_ID_in_negterm233); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID16_tree = (Object)adaptor.dupNode(ID16);

            adaptor.addChild(root_1, ID16_tree);
            }

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
            if ( state.backtracking>0 ) { memoize(input, 2, negterm_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negterm"

    // $ANTLR start synpred5_tftaccleanpands
    public final void synpred5_tftaccleanpands_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:47:4: ( ^( PAND FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:47:4: ^( PAND FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred5_tftaccleanpands100); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred5_tftaccleanpands104); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_tftaccleanpands

    // $ANTLR start synpred7_tftaccleanpands
    public final void synpred7_tftaccleanpands_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:7: ( ^( PAND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:7: ^( PAND (a+= expression )* )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred7_tftaccleanpands118); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:15: (a+= expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=OR && LA10_0<=ID)||(LA10_0>=NOT && LA10_0<=FALSE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:16: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred7_tftaccleanpands124);
            	    a=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred7_tftaccleanpands

    // $ANTLR start synpred9_tftaccleanpands
    public final void synpred9_tftaccleanpands_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:4: ( ^( AND ( negterm )+ FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:4: ^( AND ( negterm )+ FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred9_tftaccleanpands133); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:10: ( negterm )+
        int cnt11=0;
        loop11:
        do {
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NOT) ) {
                alt11=1;
            }


            switch (alt11) {
        	case 1 :
        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:0:0: negterm
        	    {
        	    pushFollow(FOLLOW_negterm_in_synpred9_tftaccleanpands135);
        	    negterm();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt11 >= 1 ) break loop11;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(11, input);
                    throw eee;
            }
            cnt11++;
        } while (true);

        match(input,FALSE,FOLLOW_FALSE_in_synpred9_tftaccleanpands138); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_tftaccleanpands

    // $ANTLR start synpred11_tftaccleanpands
    public final void synpred11_tftaccleanpands_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:6: ( ^( AND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:6: ^( AND (a+= expression )* )
        {
        match(input,AND,FOLLOW_AND_in_synpred11_tftaccleanpands151); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:14: (a+= expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=OR && LA12_0<=ID)||(LA12_0>=NOT && LA12_0<=FALSE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:15: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred11_tftaccleanpands158);
            	    a=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred11_tftaccleanpands

    // Delegated rules

    public final boolean synpred9_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_tftaccleanpands_fragment(); // can never throw exception
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
    static final String DFA7_eotS =
        "\30\uffff";
    static final String DFA7_eofS =
        "\30\uffff";
    static final String DFA7_minS =
        "\1\4\2\uffff\2\2\5\uffff\3\3\2\uffff\1\2\1\0\1\4\1\uffff\3\3\1\0"+
        "\1\uffff";
    static final String DFA7_maxS =
        "\1\16\2\uffff\2\2\5\uffff\3\16\2\uffff\1\2\1\0\1\16\1\uffff\1\3"+
        "\2\16\1\0\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\4\1\6"+
        "\3\uffff\1\3\4\uffff\1\5";
    static final String DFA7_specialS =
        "\20\uffff\1\0\5\uffff\1\1\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2\1\4\1\3\1\5\1\7\2\uffff\1\6\1\10\1\11",
            "",
            "",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "\7\15\2\uffff\2\15\1\14",
            "\7\16\2\uffff\1\17\2\16",
            "\1\20\6\15\2\uffff\3\15",
            "",
            "",
            "\1\21",
            "\1\uffff",
            "\5\16\1\23\2\uffff\3\16",
            "",
            "\1\24",
            "\7\16\2\uffff\1\17\1\16\1\25",
            "\1\26\6\16\2\uffff\3\16",
            "\1\uffff",
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
            return "44:1: expression : ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> FALSE | ^( PAND (a+= expression )* ) | ^( AND ( negterm )+ FALSE ) -> FALSE | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE | FALSE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_16 = input.LA(1);

                         
                        int index7_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_tftaccleanpands()) ) {s = 18;}

                        else if ( (synpred7_tftaccleanpands()) ) {s = 13;}

                         
                        input.seek(index7_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_22 = input.LA(1);

                         
                        int index7_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_tftaccleanpands()) ) {s = 23;}

                        else if ( (synpred11_tftaccleanpands()) ) {s = 14;}

                         
                        input.seek(index7_22);
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
 

    public static final BitSet FOLLOW_OR_in_expression64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression72 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_expression84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression91 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_expression100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_expression104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_expression118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression124 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_expression133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_expression135 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_FALSE_in_expression138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression158 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_expression167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression173 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_expression185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expression200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negterm231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_negterm233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred5_tftaccleanpands100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred5_tftaccleanpands104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred7_tftaccleanpands118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred7_tftaccleanpands124 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_synpred9_tftaccleanpands133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_synpred9_tftaccleanpands135 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_FALSE_in_synpred9_tftaccleanpands138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred11_tftaccleanpands151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred11_tftaccleanpands158 = new BitSet(new long[]{0x00000000000073F8L});

}