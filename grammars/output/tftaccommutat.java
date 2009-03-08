// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g 2009-03-08 12:08:14

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftaccommutat extends TreeParser {
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


        public tftaccommutat(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftaccommutat(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[14+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftaccommutat.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:44:1: expression : ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND (a+= expression )* ) | ^( AND (a+= expression )* ) -> ^( AND ( $a)+ ) | ^( SAND (a+= expression )* ) -> ^( SAND ( $a)+ ) | ^( NOT c= expression ) | ID | TRUE | FALSE );
    public final tftaccommutat.expression_return expression() throws RecognitionException {
        tftaccommutat.expression_return retval = new tftaccommutat.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR1=null;
        Object XOR2=null;
        Object PAND3=null;
        Object AND4=null;
        Object SAND5=null;
        Object NOT6=null;
        Object ID7=null;
        Object TRUE8=null;
        Object FALSE9=null;
        List list_a=null;
        tftaccommutat.expression_return c = null;

        RuleReturnScope a = null;
        Object OR1_tree=null;
        Object XOR2_tree=null;
        Object PAND3_tree=null;
        Object AND4_tree=null;
        Object SAND5_tree=null;
        Object NOT6_tree=null;
        Object ID7_tree=null;
        Object TRUE8_tree=null;
        Object FALSE9_tree=null;
        RewriteRuleNodeStream stream_SAND=new RewriteRuleNodeStream(adaptor,"token SAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:45:2: ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( PAND (a+= expression )* ) | ^( AND (a+= expression )* ) -> ^( AND ( $a)+ ) | ^( SAND (a+= expression )* ) -> ^( SAND ( $a)+ ) | ^( NOT c= expression ) | ID | TRUE | FALSE )
            int alt6=9;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt6=1;
                }
                break;
            case XOR:
                {
                alt6=2;
                }
                break;
            case PAND:
                {
                alt6=3;
                }
                break;
            case AND:
                {
                alt6=4;
                }
                break;
            case SAND:
                {
                alt6=5;
                }
                break;
            case NOT:
                {
                alt6=6;
                }
                break;
            case ID:
                {
                alt6=7;
                }
                break;
            case TRUE:
                {
                alt6=8;
                }
                break;
            case FALSE:
                {
                alt6=9;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:45:4: ^( OR (a+= expression )* )
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:45:12: (a+= expression )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:45:13: a+= expression
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:46:7: ^( XOR (a+= expression )* )
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:46:15: (a+= expression )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:46:16: a+= expression
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:47:7: ^( PAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND3=(Object)match(input,PAND,FOLLOW_PAND_in_expression103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND3_tree = (Object)adaptor.dupNode(PAND3);

                    root_1 = (Object)adaptor.becomeRoot(PAND3_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:47:15: (a+= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:47:16: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression109);
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
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:48:6: ^( AND (a+= expression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND4=(Object)match(input,AND,FOLLOW_AND_in_expression120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND4);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:48:14: (a+= expression )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=OR && LA4_0<=ID)||(LA4_0>=NOT && LA4_0<=FALSE)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:48:15: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression127);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) stream_expression.add(a.getTree());
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

                      				int listsize = list_a.size();
                      				int lastpos;
                      				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
                        				{
                        					for ( int j = i+1; j < listsize; j++ )
                        					{
                      	  					if ( !( list_a.get(i).toString().equals("NOT") ) && ( list_a.get(i).toString().equals(list_a.get(j).toString()) ) )
                      	  					{
                      	  						list_a.remove(j);
                      	  						listsize = listsize -1;	
                      	  					}
                      	  				}
                      				}	
                      			
                    }


                    // AST REWRITE
                    // elements: AND, a
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: a
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
                    root_0 = (Object)adaptor.nil();
                    // 64:4: -> ^( AND ( $a)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:64:7: ^( AND ( $a)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        if ( !(stream_a.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_a.hasNext() ) {
                            adaptor.addChild(root_1, stream_a.nextTree());

                        }
                        stream_a.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:65:4: ^( SAND (a+= expression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND5=(Object)match(input,SAND,FOLLOW_SAND_in_expression157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SAND.add(SAND5);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:65:13: (a+= expression )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:65:14: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression164);
                        	    a=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) stream_expression.add(a.getTree());
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

                      				int listsize = list_a.size();
                      				int lastpos;
                      				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
                        				{
                        					for ( int j = i+1; j < listsize; j++ )
                        					{
                      	  					if ( !( list_a.get(i).toString().equals("NOT") ) && ( list_a.get(i).toString().equals(list_a.get(j).toString()) ) )
                      	  					{
                      	  						list_a.remove(j);
                      	  						listsize = listsize -1;	
                      	  					}
                      	  				}
                      				}		
                      			
                    }


                    // AST REWRITE
                    // elements: SAND, a
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: a
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
                    root_0 = (Object)adaptor.nil();
                    // 81:4: -> ^( SAND ( $a)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:81:7: ^( SAND ( $a)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAND.nextNode(), root_1);

                        if ( !(stream_a.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_a.hasNext() ) {
                            adaptor.addChild(root_1, stream_a.nextTree());

                        }
                        stream_a.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:82:7: ^( NOT c= expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT6=(Object)match(input,NOT,FOLLOW_NOT_in_expression195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT6_tree = (Object)adaptor.dupNode(NOT6);

                    root_1 = (Object)adaptor.becomeRoot(NOT6_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression200);
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
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:83:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID7=(Object)match(input,ID,FOLLOW_ID_in_expression210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID7_tree = (Object)adaptor.dupNode(ID7);

                    adaptor.addChild(root_0, ID7_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:84:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE8=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE8_tree = (Object)adaptor.dupNode(TRUE8);

                    adaptor.addChild(root_0, TRUE8_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftaccommutat.g:85:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE9=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE9_tree = (Object)adaptor.dupNode(FALSE9);

                    adaptor.addChild(root_0, FALSE9_tree);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_OR_in_expression64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression72 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_expression84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression91 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_expression103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression109 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_expression120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression127 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_expression157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression164 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_expression195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expression210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression222 = new BitSet(new long[]{0x0000000000000002L});

}