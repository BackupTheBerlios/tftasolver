// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g 2009-03-08 15:21:51

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacFALSEremover extends TreeParser {
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


        public tftacFALSEremover(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacFALSEremover(TreeNodeStream input, RecognizerSharedState state) {
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

    public String[] getTokenNames() { return tftacFALSEremover.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:44:1: expression : ( FALSE | ^( OR FALSE ) -> FALSE | ^( XOR FALSE ) -> FALSE | ^( OR (targets+= expression )* ) -> ^( OR ( $targets)+ ) | ^( XOR (targets+= expression )* ) -> ^( XOR ( $targets)+ ) | ^( PAND ( expression )+ ) | ^( AND ( expression )+ ) | ^( SAND ( expression )+ ) | ^( NOT ( expression )+ ) | ID | TRUE );
    public final tftacFALSEremover.expression_return expression() throws RecognitionException {
        tftacFALSEremover.expression_return retval = new tftacFALSEremover.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object FALSE1=null;
        Object OR2=null;
        Object FALSE3=null;
        Object XOR4=null;
        Object FALSE5=null;
        Object OR6=null;
        Object XOR7=null;
        Object PAND8=null;
        Object AND10=null;
        Object SAND12=null;
        Object NOT14=null;
        Object ID16=null;
        Object TRUE17=null;
        List list_targets=null;
        tftacFALSEremover.expression_return expression9 = null;

        tftacFALSEremover.expression_return expression11 = null;

        tftacFALSEremover.expression_return expression13 = null;

        tftacFALSEremover.expression_return expression15 = null;

        RuleReturnScope targets = null;
        Object FALSE1_tree=null;
        Object OR2_tree=null;
        Object FALSE3_tree=null;
        Object XOR4_tree=null;
        Object FALSE5_tree=null;
        Object OR6_tree=null;
        Object XOR7_tree=null;
        Object PAND8_tree=null;
        Object AND10_tree=null;
        Object SAND12_tree=null;
        Object NOT14_tree=null;
        Object ID16_tree=null;
        Object TRUE17_tree=null;
        RewriteRuleNodeStream stream_XOR=new RewriteRuleNodeStream(adaptor,"token XOR");
        RewriteRuleNodeStream stream_FALSE=new RewriteRuleNodeStream(adaptor,"token FALSE");
        RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:45:2: ( FALSE | ^( OR FALSE ) -> FALSE | ^( XOR FALSE ) -> FALSE | ^( OR (targets+= expression )* ) -> ^( OR ( $targets)+ ) | ^( XOR (targets+= expression )* ) -> ^( XOR ( $targets)+ ) | ^( PAND ( expression )+ ) | ^( AND ( expression )+ ) | ^( SAND ( expression )+ ) | ^( NOT ( expression )+ ) | ID | TRUE )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:45:4: FALSE
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:46:4: ^( OR FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR2=(Object)match(input,OR,FOLLOW_OR_in_expression69); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR2);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE3=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression71); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE3);


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
                    // 46:16: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:47:4: ^( XOR FALSE )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR4=(Object)match(input,XOR,FOLLOW_XOR_in_expression82); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR4);



                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    FALSE5=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression84); if (state.failed) return retval; 
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
                    // 47:17: -> FALSE
                    {
                        adaptor.addChild(root_0, stream_FALSE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:4: ^( OR (targets+= expression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR6=(Object)match(input,OR,FOLLOW_OR_in_expression95); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR6);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:12: (targets+= expression )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:13: targets+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression103);
                        	    targets=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) stream_expression.add(targets.getTree());
                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTree());


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

                      				int listsize = list_targets.size();
                      				
                      				for ( int i = 0; i<= listsize -1; i++ )
                      				{
                      					if ( list_targets.get(i).toString().equals("FALSE") )
                      					{
                      						list_targets.remove(i);
                      						listsize--;
                      					}
                      				}
                      				if ( list_targets.size()==0 )
                      				{
                      					list_targets.add((Object)adaptor.create(FALSE, "FALSE"));
                      				}
                      			
                    }


                    // AST REWRITE
                    // elements: OR, targets
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: targets
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_targets=new RewriteRuleSubtreeStream(adaptor,"token targets",list_targets);
                    root_0 = (Object)adaptor.nil();
                    // 65:4: -> ^( OR ( $targets)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:65:7: ^( OR ( $targets)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        if ( !(stream_targets.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_targets.hasNext() ) {
                            adaptor.addChild(root_1, stream_targets.nextTree());

                        }
                        stream_targets.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:7: ^( XOR (targets+= expression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR7=(Object)match(input,XOR,FOLLOW_XOR_in_expression137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_XOR.add(XOR7);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:15: (targets+= expression )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:16: targets+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression144);
                        	    targets=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) stream_expression.add(targets.getTree());
                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTree());


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

                      				int listsize = list_targets.size();
                      				
                      				for ( int i = 0; i<= listsize -1; i++ )
                      				{
                      					if ( list_targets.get(i).toString().equals("FALSE") )
                      					{
                      						list_targets.remove(i);
                      						listsize--;
                      					}
                      				}
                      				if ( list_targets.size()==0 )
                      				{
                      					list_targets.add((Object)adaptor.create(FALSE, "FALSE"));
                      				}
                      			
                    }


                    // AST REWRITE
                    // elements: targets, XOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: targets
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_targets=new RewriteRuleSubtreeStream(adaptor,"token targets",list_targets);
                    root_0 = (Object)adaptor.nil();
                    // 83:4: -> ^( XOR ( $targets)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:83:7: ^( XOR ( $targets)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_XOR.nextNode(), root_1);

                        if ( !(stream_targets.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_targets.hasNext() ) {
                            adaptor.addChild(root_1, stream_targets.nextTree());

                        }
                        stream_targets.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:84:7: ^( PAND ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND8=(Object)match(input,PAND,FOLLOW_PAND_in_expression176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND8_tree = (Object)adaptor.dupNode(PAND8);

                    root_1 = (Object)adaptor.becomeRoot(PAND8_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:84:15: ( expression )+
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
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression179);
                    	    expression9=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression9.getTree());

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


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:85:6: ^( AND ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND10=(Object)match(input,AND,FOLLOW_AND_in_expression189); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND10_tree = (Object)adaptor.dupNode(AND10);

                    root_1 = (Object)adaptor.becomeRoot(AND10_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:85:14: ( expression )+
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
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression193);
                    	    expression11=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression11.getTree());

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
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:86:4: ^( SAND ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND12=(Object)match(input,SAND,FOLLOW_SAND_in_expression201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND12_tree = (Object)adaptor.dupNode(SAND12);

                    root_1 = (Object)adaptor.becomeRoot(SAND12_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:86:12: ( expression )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression204);
                    	    expression13=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression13.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:87:7: ^( NOT ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT14=(Object)match(input,NOT,FOLLOW_NOT_in_expression215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT14_tree = (Object)adaptor.dupNode(NOT14);

                    root_1 = (Object)adaptor.becomeRoot(NOT14_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:87:15: ( expression )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=OR && LA6_0<=ID)||(LA6_0>=NOT && LA6_0<=FALSE)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression219);
                    	    expression15=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression15.getTree());

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


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:88:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID16=(Object)match(input,ID,FOLLOW_ID_in_expression230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID16_tree = (Object)adaptor.dupNode(ID16);

                    adaptor.addChild(root_0, ID16_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:89:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE17=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression236); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE17_tree = (Object)adaptor.dupNode(TRUE17);

                    adaptor.addChild(root_0, TRUE17_tree);
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

    // $ANTLR start synpred2_tftacFALSEremover
    public final void synpred2_tftacFALSEremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:46:4: ( ^( OR FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:46:4: ^( OR FALSE )
        {
        match(input,OR,FOLLOW_OR_in_synpred2_tftacFALSEremover69); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred2_tftacFALSEremover71); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_tftacFALSEremover

    // $ANTLR start synpred3_tftacFALSEremover
    public final void synpred3_tftacFALSEremover_fragment() throws RecognitionException {   
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:47:4: ( ^( XOR FALSE ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:47:4: ^( XOR FALSE )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred3_tftacFALSEremover82); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,FALSE,FOLLOW_FALSE_in_synpred3_tftacFALSEremover84); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_tftacFALSEremover

    // $ANTLR start synpred5_tftacFALSEremover
    public final void synpred5_tftacFALSEremover_fragment() throws RecognitionException {   
        List list_targets=null;
        RuleReturnScope targets = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:4: ( ^( OR (targets+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:4: ^( OR (targets+= expression )* )
        {
        match(input,OR,FOLLOW_OR_in_synpred5_tftacFALSEremover95); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:12: (targets+= expression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=OR && LA8_0<=ID)||(LA8_0>=NOT && LA8_0<=FALSE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:48:13: targets+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred5_tftacFALSEremover103);
            	    targets=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_targets==null) list_targets=new ArrayList();
            	    list_targets.add(targets);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
        }

        }
    }
    // $ANTLR end synpred5_tftacFALSEremover

    // $ANTLR start synpred7_tftacFALSEremover
    public final void synpred7_tftacFALSEremover_fragment() throws RecognitionException {   
        List list_targets=null;
        RuleReturnScope targets = null;
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:7: ( ^( XOR (targets+= expression )* ) )
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:7: ^( XOR (targets+= expression )* )
        {
        match(input,XOR,FOLLOW_XOR_in_synpred7_tftacFALSEremover137); if (state.failed) return ;

        if ( input.LA(1)==Token.DOWN ) {
            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:15: (targets+= expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=OR && LA9_0<=ID)||(LA9_0>=NOT && LA9_0<=FALSE)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacFALSEremover.g:66:16: targets+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_synpred7_tftacFALSEremover144);
            	    targets=expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if (list_targets==null) list_targets=new ArrayList();
            	    list_targets.add(targets);


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
    // $ANTLR end synpred7_tftacFALSEremover

    // Delegated rules

    public final boolean synpred5_tftacFALSEremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_tftacFALSEremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_tftacFALSEremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_tftacFALSEremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_tftacFALSEremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_tftacFALSEremover_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_tftacFALSEremover() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_tftacFALSEremover_fragment(); // can never throw exception
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
        "\24\uffff";
    static final String DFA7_eofS =
        "\24\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\2\2\6\uffff\3\3\1\uffff\1\3\1\uffff\2\0\2\uffff";
    static final String DFA7_maxS =
        "\1\16\1\uffff\2\2\6\uffff\3\16\1\uffff\1\16\1\uffff\2\0\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff\1\4\1\uffff"+
        "\1\5\2\uffff\1\2\1\3";
    static final String DFA7_specialS =
        "\20\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\3\1\5\1\4\1\6\1\10\2\uffff\1\7\1\11\1\1",
            "",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\7\15\2\uffff\2\15\1\14",
            "\7\17\2\uffff\2\17\1\16",
            "\1\20\6\15\2\uffff\3\15",
            "",
            "\1\21\6\17\2\uffff\3\17",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
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
            return "44:1: expression : ( FALSE | ^( OR FALSE ) -> FALSE | ^( XOR FALSE ) -> FALSE | ^( OR (targets+= expression )* ) -> ^( OR ( $targets)+ ) | ^( XOR (targets+= expression )* ) -> ^( XOR ( $targets)+ ) | ^( PAND ( expression )+ ) | ^( AND ( expression )+ ) | ^( SAND ( expression )+ ) | ^( NOT ( expression )+ ) | ID | TRUE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_17 = input.LA(1);

                         
                        int index7_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_tftacFALSEremover()) ) {s = 19;}

                        else if ( (synpred7_tftacFALSEremover()) ) {s = 15;}

                         
                        input.seek(index7_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_16 = input.LA(1);

                         
                        int index7_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_tftacFALSEremover()) ) {s = 18;}

                        else if ( (synpred5_tftacFALSEremover()) ) {s = 13;}

                         
                        input.seek(index7_16);
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
    public static final BitSet FOLLOW_FALSE_in_expression71 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expression82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_expression84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expression95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression103 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_expression137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression144 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_expression176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression179 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_expression189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression193 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_expression201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression204 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_expression215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression219 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_ID_in_expression230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred2_tftacFALSEremover69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred2_tftacFALSEremover71 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_synpred3_tftacFALSEremover82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_synpred3_tftacFALSEremover84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_synpred5_tftacFALSEremover95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred5_tftacFALSEremover103 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_synpred7_tftacFALSEremover137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred7_tftacFALSEremover144 = new BitSet(new long[]{0x00000000000073F8L});

}