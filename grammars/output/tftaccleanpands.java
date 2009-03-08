// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g 2009-03-08 22:10:06

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
            this.state.ruleMemo = new HashMap[20+1];
             
             
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:44:1: expression : ( FALSE | ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> FALSE | ^( PAND (a+= expression )* ) | ^( AND ( negterm )+ FALSE ) -> FALSE | ^( AND FALSE ) -> FALSE | ^( AND (a+= expression )* ) | ^( SAND FALSE ) -> FALSE | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE );
    public final tftaccleanpands.expression_return expression() throws RecognitionException {
        tftaccleanpands.expression_return retval = new tftaccleanpands.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object FALSE1=null;
        Object OR2=null;
        Object XOR3=null;
        Object PAND4=null;
        Object FALSE5=null;
        Object PAND6=null;
        Object AND7=null;
        Object FALSE9=null;
        Object AND10=null;
        Object FALSE11=null;
        Object AND12=null;
        Object SAND13=null;
        Object FALSE14=null;
        Object SAND15=null;
        Object NOT16=null;
        Object ID17=null;
        Object TRUE18=null;
        List list_a=null;
        tftaccleanpands.expression_return c = null;

        tftaccleanpands.negterm_return negterm8 = null;

        RuleReturnScope a = null;
        Object FALSE1_tree=null;
        Object OR2_tree=null;
        Object XOR3_tree=null;
        Object PAND4_tree=null;
        Object FALSE5_tree=null;
        Object PAND6_tree=null;
        Object AND7_tree=null;
        Object FALSE9_tree=null;
        Object AND10_tree=null;
        Object FALSE11_tree=null;
        Object AND12_tree=null;
        Object SAND13_tree=null;
        Object FALSE14_tree=null;
        Object SAND15_tree=null;
        Object NOT16_tree=null;
        Object ID17_tree=null;
        Object TRUE18_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleSubtreeStream stream_negterm=new RewriteRuleSubtreeStream(adaptor,"rule negterm");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:45:2: ( FALSE | ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> FALSE | ^( PAND (a+= expression )* ) | ^( AND ( negterm )+ FALSE ) -> FALSE | ^( AND FALSE ) -> FALSE | ^( AND (a+= expression )* ) | ^( SAND FALSE ) -> FALSE | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE )
            int alt7=13;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:45:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE1=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression63); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE1_tree = (Object)adaptor.dupNode(FALSE1);

                    adaptor.addChild(root_0, FALSE1_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:46:4: ^( OR (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR2=(Object)match(input,OR,FOLLOW_OR_in_expression69); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR2_tree = (Object)adaptor.dupNode(OR2);

                    root_1 = (Object)adaptor.becomeRoot(OR2_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:46:12: (a+= expression )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:46:13: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression77);
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
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:47:7: ^( XOR (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR3=(Object)match(input,XOR,FOLLOW_XOR_in_expression89); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR3_tree = (Object)adaptor.dupNode(XOR3);

                    root_1 = (Object)adaptor.becomeRoot(XOR3_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:47:15: (a+= expression )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:47:16: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression96);
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
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:4: ^( PAND FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND4=(Object)match(input,PAND,FOLLOW_PAND_in_expression105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND4);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE5=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE5);


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
                    // 48:20: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:7: ^( PAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND6=(Object)match(input,PAND,FOLLOW_PAND_in_expression123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND6_tree = (Object)adaptor.dupNode(PAND6);

                    root_1 = (Object)adaptor.becomeRoot(PAND6_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:15: (a+= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:16: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression129);
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
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:4: ^( AND ( negterm )+ FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND7=(Object)match(input,AND,FOLLOW_AND_in_expression138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND7);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:12: ( negterm )+
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
                    	    pushFollow(FOLLOW_negterm_in_expression142);
                    	    negterm8=negterm();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_negterm.add(negterm8.getTree());

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
                    FALSE9=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE9);


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
                    // 50:28: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:51:4: ^( AND FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND10=(Object)match(input,AND,FOLLOW_AND_in_expression156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND10);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE11=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE11);


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
                    // 51:19: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:6: ^( AND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND12=(Object)match(input,AND,FOLLOW_AND_in_expression173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND12_tree = (Object)adaptor.dupNode(AND12);

                    root_1 = (Object)adaptor.becomeRoot(AND12_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:14: (a+= expression )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:15: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression180);
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
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:53:4: ^( SAND FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND13=(Object)match(input,SAND,FOLLOW_SAND_in_expression189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND13);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE14=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE14);


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
                    // 53:20: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:4: ^( SAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND15=(Object)match(input,SAND,FOLLOW_SAND_in_expression204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND15_tree = (Object)adaptor.dupNode(SAND15);

                    root_1 = (Object)adaptor.becomeRoot(SAND15_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:12: (a+= expression )*
                        loop6:
                        do {
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( ((LA6_0>=OR && LA6_0<=ID)||(LA6_0>=NOT && LA6_0<=FALSE)) ) {
                                alt6=1;
                            }


                            switch (alt6) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:13: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression210);
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
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:55:7: ^( NOT c= expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT16=(Object)match(input,NOT,FOLLOW_NOT_in_expression222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT16_tree = (Object)adaptor.dupNode(NOT16);

                    root_1 = (Object)adaptor.becomeRoot(NOT16_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression228);
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
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:56:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID17=(Object)match(input,ID,FOLLOW_ID_in_expression238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID17_tree = (Object)adaptor.dupNode(ID17);

                    adaptor.addChild(root_0, ID17_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:57:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE18=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE18_tree = (Object)adaptor.dupNode(TRUE18);

                    adaptor.addChild(root_0, TRUE18_tree);
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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:60:1: negterm : ^( NOT ID ) ;
    public final tftaccleanpands.negterm_return negterm() throws RecognitionException {
        tftaccleanpands.negterm_return retval = new tftaccleanpands.negterm_return();
        retval.start = input.LT(1);
        int negterm_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object NOT19=null;
        Object ID20=null;

        Object NOT19_tree=null;
        Object ID20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:60:9: ( ^( NOT ID ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:60:11: ^( NOT ID )
            {
            root_0 = (Object)adaptor.nil();

            _last = (Object)input.LT(1);
            {
            Object _save_last_1 = _last;
            Object _first_1 = null;
            Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
            NOT19=(Object)match(input,NOT,FOLLOW_NOT_in_negterm266); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NOT19_tree = (Object)adaptor.dupNode(NOT19);

            root_1 = (Object)adaptor.becomeRoot(NOT19_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (Object)input.LT(1);
            ID20=(Object)match(input,ID,FOLLOW_ID_in_negterm268); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID20_tree = (Object)adaptor.dupNode(ID20);

            adaptor.addChild(root_1, ID20_tree);
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

    // $ANTLR start synpred6_tftaccleanpands
    public final void synpred6_tftaccleanpands_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:4: ( ^( PAND FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:48:4: ^( PAND FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred6_tftaccleanpands105); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred6_tftaccleanpands109); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_tftaccleanpands

    // $ANTLR start synpred8_tftaccleanpands
    public final void synpred8_tftaccleanpands_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:7: ( ^( PAND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:7: ^( PAND (a+= expression )* )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred8_tftaccleanpands123); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:15: (a+= expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=OR && LA10_0<=ID)||(LA10_0>=NOT && LA10_0<=FALSE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:49:16: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred8_tftaccleanpands129);
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
    // $ANTLR end synpred8_tftaccleanpands

    // $ANTLR start synpred10_tftaccleanpands
    public final void synpred10_tftaccleanpands_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:4: ( ^( AND ( negterm )+ FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:4: ^( AND ( negterm )+ FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred10_tftaccleanpands138); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:50:12: ( negterm )+
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
        	    pushFollow(FOLLOW_negterm_in_synpred10_tftaccleanpands142);
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

        match(input,FALSE,FOLLOW_FALSE_in_synpred10_tftaccleanpands145); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_tftaccleanpands

    // $ANTLR start synpred11_tftaccleanpands
    public final void synpred11_tftaccleanpands_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:51:4: ( ^( AND FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:51:4: ^( AND FALSE )
        {
        match(input,AND,FOLLOW_AND_in_synpred11_tftaccleanpands156); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred11_tftaccleanpands160); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_tftaccleanpands

    // $ANTLR start synpred13_tftaccleanpands
    public final void synpred13_tftaccleanpands_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:6: ( ^( AND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:6: ^( AND (a+= expression )* )
        {
        match(input,AND,FOLLOW_AND_in_synpred13_tftaccleanpands173); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:14: (a+= expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=OR && LA12_0<=ID)||(LA12_0>=NOT && LA12_0<=FALSE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:52:15: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred13_tftaccleanpands180);
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
    // $ANTLR end synpred13_tftaccleanpands

    // $ANTLR start synpred14_tftaccleanpands
    public final void synpred14_tftaccleanpands_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:53:4: ( ^( SAND FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:53:4: ^( SAND FALSE )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred14_tftaccleanpands189); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred14_tftaccleanpands193); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_tftaccleanpands

    // $ANTLR start synpred16_tftaccleanpands
    public final void synpred16_tftaccleanpands_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:4: ( ^( SAND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:4: ^( SAND (a+= expression )* )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred16_tftaccleanpands204); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:12: (a+= expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=OR && LA13_0<=ID)||(LA13_0>=NOT && LA13_0<=FALSE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccleanpands.g:54:13: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred16_tftaccleanpands210);
            	    a=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred16_tftaccleanpands

    // Delegated rules

    public final boolean synpred14_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_tftaccleanpands_fragment(); // can never throw exception
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
    public final boolean synpred13_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_tftaccleanpands_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_tftaccleanpands() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_tftaccleanpands_fragment(); // can never throw exception
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
        "\40\uffff";
    static final String DFA7_eofS =
        "\40\uffff";
    static final String DFA7_minS =
        "\1\4\3\uffff\3\2\3\uffff\4\3\1\uffff\1\3\1\2\1\uffff\1\3\1\uffff"+
        "\2\0\1\4\1\0\2\uffff\1\3\1\uffff\2\3\1\0\1\uffff";
    static final String DFA7_maxS =
        "\1\16\3\uffff\3\2\3\uffff\4\16\1\uffff\1\16\1\2\1\uffff\1\16\1\uffff"+
        "\2\0\1\16\1\0\2\uffff\1\3\1\uffff\2\16\1\0\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\13\1\14\1\15\4\uffff\1\5\2\uffff"+
        "\1\10\1\uffff\1\12\4\uffff\1\4\1\7\1\uffff\1\11\3\uffff\1\6";
    static final String DFA7_specialS =
        "\24\uffff\1\1\1\3\1\uffff\1\0\6\uffff\1\2\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\3\1\5\1\4\1\6\1\10\2\uffff\1\7\1\11\1\1",
            "",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "",
            "",
            "\7\16\2\uffff\2\16\1\15",
            "\7\21\2\uffff\1\20\1\21\1\17",
            "\7\23\2\uffff\2\23\1\22",
            "\1\24\6\16\2\uffff\3\16",
            "",
            "\1\25\6\21\2\uffff\3\21",
            "\1\26",
            "",
            "\1\27\6\23\2\uffff\3\23",
            "",
            "\1\uffff",
            "\1\uffff",
            "\5\21\1\32\2\uffff\3\21",
            "\1\uffff",
            "",
            "",
            "\1\34",
            "",
            "\7\21\2\uffff\1\20\1\21\1\35",
            "\1\36\6\21\2\uffff\3\21",
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
            return "44:1: expression : ( FALSE | ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> FALSE | ^( PAND (a+= expression )* ) | ^( AND ( negterm )+ FALSE ) -> FALSE | ^( AND FALSE ) -> FALSE | ^( AND (a+= expression )* ) | ^( SAND FALSE ) -> FALSE | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_23 = input.LA(1);

                         
                        int index7_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_tftaccleanpands()) ) {s = 27;}

                        else if ( (synpred16_tftaccleanpands()) ) {s = 19;}

                         
                        input.seek(index7_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_20 = input.LA(1);

                         
                        int index7_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_tftaccleanpands()) ) {s = 24;}

                        else if ( (synpred8_tftaccleanpands()) ) {s = 14;}

                         
                        input.seek(index7_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_30 = input.LA(1);

                         
                        int index7_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_tftaccleanpands()) ) {s = 31;}

                        else if ( (synpred13_tftaccleanpands()) ) {s = 17;}

                         
                        input.seek(index7_30);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_21 = input.LA(1);

                         
                        int index7_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_tftaccleanpands()) ) {s = 25;}

                        else if ( (synpred13_tftaccleanpands()) ) {s = 17;}

                         
                        input.seek(index7_21);
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
 

    public static final BitSet FOLLOW_FALSE_in_expression63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expression69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression77 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_expression89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression96 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_expression105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_expression109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_expression123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression129 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_expression138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_expression142 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_FALSE_in_expression145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_expression160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression180 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_expression189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_expression193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_expression204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression210 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_expression222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expression238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negterm266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_negterm268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred6_tftaccleanpands105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred6_tftaccleanpands109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred8_tftaccleanpands123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred8_tftaccleanpands129 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_synpred10_tftaccleanpands138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negterm_in_synpred10_tftaccleanpands142 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_FALSE_in_synpred10_tftaccleanpands145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred11_tftaccleanpands156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred11_tftaccleanpands160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred13_tftaccleanpands173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred13_tftaccleanpands180 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred14_tftaccleanpands189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred14_tftaccleanpands193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred16_tftaccleanpands204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred16_tftaccleanpands210 = new BitSet(new long[]{0x00000000000073F8L});

}