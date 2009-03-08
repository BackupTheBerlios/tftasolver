// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g 2009-03-08 11:46:32

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacremovesingles extends TreeParser {
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


        public tftacremovesingles(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacremovesingles(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[17+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacremovesingles.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:44:1: expression : ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> | ^( PAND (a+= expression )* ) | ^( AND c= expression ) -> $c | ^( SAND c= expression ) -> $c | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE | FALSE );
    public final tftacremovesingles.expression_return expression() throws RecognitionException {
        tftacremovesingles.expression_return retval = new tftacremovesingles.expression_return();
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
        Object SAND7=null;
        Object AND8=null;
        Object SAND9=null;
        Object NOT10=null;
        Object ID11=null;
        Object TRUE12=null;
        Object FALSE13=null;
        List list_a=null;
        tftacremovesingles.expression_return c = null;

        RuleReturnScope a = null;
        Object OR1_tree=null;
        Object XOR2_tree=null;
        Object PAND3_tree=null;
        Object FALSE4_tree=null;
        Object PAND5_tree=null;
        Object AND6_tree=null;
        Object SAND7_tree=null;
        Object AND8_tree=null;
        Object SAND9_tree=null;
        Object NOT10_tree=null;
        Object ID11_tree=null;
        Object TRUE12_tree=null;
        Object FALSE13_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:45:2: ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> | ^( PAND (a+= expression )* ) | ^( AND c= expression ) -> $c | ^( SAND c= expression ) -> $c | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE | FALSE )
            int alt6=12;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:45:4: ^( OR (a+= expression )* )
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:45:12: (a+= expression )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:45:13: a+= expression
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:46:7: ^( XOR (a+= expression )* )
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:46:15: (a+= expression )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:46:16: a+= expression
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:47:4: ^( PAND FALSE )
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
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:20: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:7: ^( PAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND5=(Object)match(input,PAND,FOLLOW_PAND_in_expression116); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND5_tree = (Object)adaptor.dupNode(PAND5);

                    root_1 = (Object)adaptor.becomeRoot(PAND5_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:15: (a+= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:16: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression122);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:49:6: ^( AND c= expression )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND6=(Object)match(input,AND,FOLLOW_AND_in_expression133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND6);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression139);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(c.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: c
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"token c",c!=null?c.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:28: -> $c
                    {
                        adaptor.addChild(root_0, stream_c.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:50:4: ^( SAND c= expression )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND7=(Object)match(input,SAND,FOLLOW_SAND_in_expression151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND7);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression156);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(c.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: c
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"token c",c!=null?c.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:26: -> $c
                    {
                        adaptor.addChild(root_0, stream_c.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:6: ^( AND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND8=(Object)match(input,AND,FOLLOW_AND_in_expression170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND8_tree = (Object)adaptor.dupNode(AND8);

                    root_1 = (Object)adaptor.becomeRoot(AND8_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:14: (a+= expression )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=OR && LA4_0<=ID)||(LA4_0>=NOT && LA4_0<=FALSE)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:15: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression177);
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
                        	    break loop4;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:4: ^( SAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND9=(Object)match(input,SAND,FOLLOW_SAND_in_expression186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND9_tree = (Object)adaptor.dupNode(SAND9);

                    root_1 = (Object)adaptor.becomeRoot(SAND9_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:12: (a+= expression )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:13: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression192);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:53:7: ^( NOT c= expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT10=(Object)match(input,NOT,FOLLOW_NOT_in_expression204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT10_tree = (Object)adaptor.dupNode(NOT10);

                    root_1 = (Object)adaptor.becomeRoot(NOT10_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression209);
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
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:54:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID11=(Object)match(input,ID,FOLLOW_ID_in_expression219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID11_tree = (Object)adaptor.dupNode(ID11);

                    adaptor.addChild(root_0, ID11_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:55:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE12=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE12_tree = (Object)adaptor.dupNode(TRUE12);

                    adaptor.addChild(root_0, TRUE12_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:56:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE13=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE13_tree = (Object)adaptor.dupNode(FALSE13);

                    adaptor.addChild(root_0, FALSE13_tree);
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

    // $ANTLR start synpred5_tftacremovesingles
    public final void synpred5_tftacremovesingles_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:47:4: ( ^( PAND FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:47:4: ^( PAND FALSE )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred5_tftacremovesingles100); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred5_tftacremovesingles104); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_tftacremovesingles

    // $ANTLR start synpred7_tftacremovesingles
    public final void synpred7_tftacremovesingles_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:7: ( ^( PAND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:7: ^( PAND (a+= expression )* )
        {
        match(input,PAND,FOLLOW_PAND_in_synpred7_tftacremovesingles116); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:15: (a+= expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=OR && LA9_0<=ID)||(LA9_0>=NOT && LA9_0<=FALSE)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:48:16: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred7_tftacremovesingles122);
            	    a=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred7_tftacremovesingles

    // $ANTLR start synpred8_tftacremovesingles
    public final void synpred8_tftacremovesingles_fragment() throws RecognitionException {   
        tftacremovesingles.expression_return c = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:49:6: ( ^( AND c= expression ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:49:6: ^( AND c= expression )
        {
        match(input,AND,FOLLOW_AND_in_synpred8_tftacremovesingles133); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred8_tftacremovesingles139);
        c=expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_tftacremovesingles

    // $ANTLR start synpred9_tftacremovesingles
    public final void synpred9_tftacremovesingles_fragment() throws RecognitionException {   
        tftacremovesingles.expression_return c = null;


        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:50:4: ( ^( SAND c= expression ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:50:4: ^( SAND c= expression )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred9_tftacremovesingles151); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred9_tftacremovesingles156);
        c=expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_tftacremovesingles

    // $ANTLR start synpred11_tftacremovesingles
    public final void synpred11_tftacremovesingles_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:6: ( ^( AND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:6: ^( AND (a+= expression )* )
        {
        match(input,AND,FOLLOW_AND_in_synpred11_tftacremovesingles170); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:14: (a+= expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=OR && LA10_0<=ID)||(LA10_0>=NOT && LA10_0<=FALSE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:51:15: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred11_tftacremovesingles177);
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
    // $ANTLR end synpred11_tftacremovesingles

    // $ANTLR start synpred13_tftacremovesingles
    public final void synpred13_tftacremovesingles_fragment() throws RecognitionException {   
        List list_a=null;
        RuleReturnScope a = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:4: ( ^( SAND (a+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:4: ^( SAND (a+= expression )* )
        {
        match(input,SAND,FOLLOW_SAND_in_synpred13_tftacremovesingles186); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:12: (a+= expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=OR && LA11_0<=ID)||(LA11_0>=NOT && LA11_0<=FALSE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacremovesingles.g:52:13: a+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred13_tftacremovesingles192);
            	    a=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred13_tftacremovesingles

    // Delegated rules

    public final boolean synpred5_tftacremovesingles() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_tftacremovesingles_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_tftacremovesingles() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_tftacremovesingles_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_tftacremovesingles() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_tftacremovesingles_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_tftacremovesingles() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_tftacremovesingles_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_tftacremovesingles() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_tftacremovesingles_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_tftacremovesingles() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_tftacremovesingles_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\20\uffff";
    static final String DFA6_eofS =
        "\20\uffff";
    static final String DFA6_minS =
        "\1\4\2\uffff\3\0\12\uffff";
    static final String DFA6_maxS =
        "\1\16\2\uffff\3\0\12\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\11\1\12\1\13\1\14\1\3\1\4\1\5\1\7\1\6"+
        "\1\10";
    static final String DFA6_specialS =
        "\3\uffff\1\0\1\1\1\2\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\2\1\4\1\3\1\5\1\7\2\uffff\1\6\1\10\1\11",
            "",
            "",
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
            return "44:1: expression : ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND FALSE ) -> | ^( PAND (a+= expression )* ) | ^( AND c= expression ) -> $c | ^( SAND c= expression ) -> $c | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT c= expression ) | ID | TRUE | FALSE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_tftacremovesingles()) ) {s = 10;}

                        else if ( (synpred7_tftacremovesingles()) ) {s = 11;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_tftacremovesingles()) ) {s = 12;}

                        else if ( (synpred11_tftacremovesingles()) ) {s = 13;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_tftacremovesingles()) ) {s = 14;}

                        else if ( (synpred13_tftacremovesingles()) ) {s = 15;}

                         
                        input.seek(index6_5);
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
 

    public static final BitSet FOLLOW_OR_in_expression64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression72 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_expression84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression91 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_expression100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_expression104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_expression116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression122 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_expression133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_expression151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression177 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_expression186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression192 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_expression204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expression219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_synpred5_tftacremovesingles100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred5_tftacremovesingles104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAND_in_synpred7_tftacremovesingles116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred7_tftacremovesingles122 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_synpred8_tftacremovesingles133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred8_tftacremovesingles139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_synpred9_tftacremovesingles151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred9_tftacremovesingles156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_synpred11_tftacremovesingles170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred11_tftacremovesingles177 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_synpred13_tftacremovesingles186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred13_tftacremovesingles192 = new BitSet(new long[]{0x00000000000073F8L});

}