// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g 2009-03-08 22:08:10

import java.util.HashMap;
import java.util.ArrayList;
import org.antlr.stringtemplate.*;
import java.io.*;
import org.antlr.runtime.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class tftacplausi extends TreeParser {
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


        public tftacplausi(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacplausi(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[30+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacplausi.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();

    StringTemplate query = new StringTemplate("$b; separator=\";\"$");

    List valuelistPAND = new ArrayList();
    List valuelistAND  = new ArrayList();



    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:53:1: expression : ( ID | TRUE | FALSE | ^( OR ( expression )+ ) | ^( XOR ( expression )+ ) | ^( SAND ( expression )+ ) | ^( AND (a+= andexpression )* ) -> ^( AND ( $a)+ ) | ^( PAND (c+= pandexpression )* ) -> ^( PAND ( $c)+ ) );
    public final tftacplausi.expression_return expression() throws RecognitionException {
        tftacplausi.expression_return retval = new tftacplausi.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object ID1=null;
        Object TRUE2=null;
        Object FALSE3=null;
        Object OR4=null;
        Object XOR6=null;
        Object SAND8=null;
        Object AND10=null;
        Object PAND11=null;
        List list_a=null;
        List list_c=null;
        tftacplausi.expression_return expression5 = null;

        tftacplausi.expression_return expression7 = null;

        tftacplausi.expression_return expression9 = null;

        RuleReturnScope a = null;
        RuleReturnScope c = null;
        Object ID1_tree=null;
        Object TRUE2_tree=null;
        Object FALSE3_tree=null;
        Object OR4_tree=null;
        Object XOR6_tree=null;
        Object SAND8_tree=null;
        Object AND10_tree=null;
        Object PAND11_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_andexpression=new RewriteRuleSubtreeStream(adaptor,"rule andexpression");
        RewriteRuleSubtreeStream stream_pandexpression=new RewriteRuleSubtreeStream(adaptor,"rule pandexpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:54:2: ( ID | TRUE | FALSE | ^( OR ( expression )+ ) | ^( XOR ( expression )+ ) | ^( SAND ( expression )+ ) | ^( AND (a+= andexpression )* ) -> ^( AND ( $a)+ ) | ^( PAND (c+= pandexpression )* ) -> ^( PAND ( $c)+ ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case TRUE:
                {
                alt6=2;
                }
                break;
            case FALSE:
                {
                alt6=3;
                }
                break;
            case OR:
                {
                alt6=4;
                }
                break;
            case XOR:
                {
                alt6=5;
                }
                break;
            case SAND:
                {
                alt6=6;
                }
                break;
            case AND:
                {
                alt6=7;
                }
                break;
            case PAND:
                {
                alt6=8;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:54:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID1=(Object)match(input,ID,FOLLOW_ID_in_expression66); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID1_tree = (Object)adaptor.dupNode(ID1);

                    adaptor.addChild(root_0, ID1_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:55:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE2=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression72); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE2_tree = (Object)adaptor.dupNode(TRUE2);

                    adaptor.addChild(root_0, TRUE2_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:56:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE3=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression78); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE3_tree = (Object)adaptor.dupNode(FALSE3);

                    adaptor.addChild(root_0, FALSE3_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:57:4: ^( OR ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    OR4=(Object)match(input,OR,FOLLOW_OR_in_expression85); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR4_tree = (Object)adaptor.dupNode(OR4);

                    root_1 = (Object)adaptor.becomeRoot(OR4_tree, root_1);
                    }

                    if ( state.backtracking==0 ) {

                      				valuelistPAND.clear();	
                      				valuelistAND.clear();	
                      			
                    }

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:61:5: ( expression )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=TRUE && LA1_0<=FALSE)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression96);
                    	    expression5=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression5.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:63:7: ^( XOR ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    XOR6=(Object)match(input,XOR,FOLLOW_XOR_in_expression111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR6_tree = (Object)adaptor.dupNode(XOR6);

                    root_1 = (Object)adaptor.becomeRoot(XOR6_tree, root_1);
                    }

                    if ( state.backtracking==0 ) {

                      				valuelistPAND.clear();	
                      				valuelistAND.clear();	
                      			
                    }

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:67:5: ( expression )+
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
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression121);
                    	    expression7=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression7.getTree());

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


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:68:4: ^( SAND ( expression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND8=(Object)match(input,SAND,FOLLOW_SAND_in_expression129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND8_tree = (Object)adaptor.dupNode(SAND8);

                    root_1 = (Object)adaptor.becomeRoot(SAND8_tree, root_1);
                    }

                    if ( state.backtracking==0 ) {

                      				valuelistPAND.clear();	
                      				valuelistAND.clear();	
                      			
                    }

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:72:5: ( expression )+
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
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: expression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expression138);
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:73:6: ^( AND (a+= andexpression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND10=(Object)match(input,AND,FOLLOW_AND_in_expression148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND10);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:73:14: (a+= andexpression )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=AND && LA4_0<=ID)||(LA4_0>=NOT && LA4_0<=FALSE)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:73:15: a+= andexpression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_andexpression_in_expression155);
                        	    a=andexpression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) stream_andexpression.add(a.getTree());
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

                      				// add the "real" events to the list (not the ones characterizing the operators!)
                      				int listsize = valuelistAND.size();
                      				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
                        				{
                        					for ( int j = i+1; j < listsize; j++ )
                        					{
                      	  					if ( valuelistAND.get(i).equals(valuelistAND.get(j)) )
                      	  					{	  						
                      	  						list_a.clear();
                      	  						list_a.add((Object)adaptor.create(FALSE, "FALSE"));
                      	  						listsize = 0;
                      	  					}
                      	  				}
                      				}
                      				valuelistAND.clear();	
                      			
                    }


                    // AST REWRITE
                    // elements: a, AND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: a
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
                    root_0 = (Object)adaptor.nil();
                    // 91:4: -> ^( AND ( $a)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:91:7: ^( AND ( $a)+ )
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
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:94:4: ^( PAND (c+= pandexpression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND11=(Object)match(input,PAND,FOLLOW_PAND_in_expression185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND11);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:94:11: (c+= pandexpression )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==AND||(LA5_0>=SAND && LA5_0<=ID)||(LA5_0>=TRUE && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:94:12: c+= pandexpression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_pandexpression_in_expression190);
                        	    c=pandexpression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) stream_pandexpression.add(c.getTree());
                        	    if (list_c==null) list_c=new ArrayList();
                        	    list_c.add(c.getTree());


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

                      				// add the "real" events to the list (not the ones characterizing the operators!)
                      				int listsize = valuelistPAND.size();
                      				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
                        				{
                        					for ( int j = i+1; j < listsize; j++ )
                        					{
                      	  					if ( valuelistPAND.get(i).equals(valuelistPAND.get(j)) )
                      	  					{	  						
                      	  						list_c.clear();
                      	  						list_c.add((Object)adaptor.create(FALSE, "FALSE"));
                      	  						listsize = 0;
                      	  					}
                      	  				}
                      				}
                      				valuelistPAND.clear();			
                      			
                    }


                    // AST REWRITE
                    // elements: PAND, c
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: c
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"token c",list_c);
                    root_0 = (Object)adaptor.nil();
                    // 112:4: -> ^( PAND ( $c)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:112:7: ^( PAND ( $c)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

                        if ( !(stream_c.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_c.hasNext() ) {
                            adaptor.addChild(root_1, stream_c.nextTree());

                        }
                        stream_c.reset();

                        adaptor.addChild(root_0, root_1);
                        }

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
            if ( state.backtracking>0 ) { memoize(input, 1, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class pandexpression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pandexpression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:115:1: pandexpression : (x= ID | TRUE | FALSE | ^( AND ( pandexpression )+ ) | ^( SAND ( pandexpression )+ ) );
    public final tftacplausi.pandexpression_return pandexpression() throws RecognitionException {
        tftacplausi.pandexpression_return retval = new tftacplausi.pandexpression_return();
        retval.start = input.LT(1);
        int pandexpression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object x=null;
        Object TRUE12=null;
        Object FALSE13=null;
        Object AND14=null;
        Object SAND16=null;
        tftacplausi.pandexpression_return pandexpression15 = null;

        tftacplausi.pandexpression_return pandexpression17 = null;


        Object x_tree=null;
        Object TRUE12_tree=null;
        Object FALSE13_tree=null;
        Object AND14_tree=null;
        Object SAND16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:116:2: (x= ID | TRUE | FALSE | ^( AND ( pandexpression )+ ) | ^( SAND ( pandexpression )+ ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case TRUE:
                {
                alt9=2;
                }
                break;
            case FALSE:
                {
                alt9=3;
                }
                break;
            case AND:
                {
                alt9=4;
                }
                break;
            case SAND:
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:116:4: x= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    x=(Object)match(input,ID,FOLLOW_ID_in_pandexpression230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    x_tree = (Object)adaptor.dupNode(x);

                    adaptor.addChild(root_0, x_tree);
                    }
                    if ( state.backtracking==0 ) {

                      				valuelistPAND.add(x.toString());
                      			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:119:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE12=(Object)match(input,TRUE,FOLLOW_TRUE_in_pandexpression238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE12_tree = (Object)adaptor.dupNode(TRUE12);

                    adaptor.addChild(root_0, TRUE12_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:120:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE13=(Object)match(input,FALSE,FOLLOW_FALSE_in_pandexpression244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE13_tree = (Object)adaptor.dupNode(FALSE13);

                    adaptor.addChild(root_0, FALSE13_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:121:4: ^( AND ( pandexpression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND14=(Object)match(input,AND,FOLLOW_AND_in_pandexpression250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND14_tree = (Object)adaptor.dupNode(AND14);

                    root_1 = (Object)adaptor.becomeRoot(AND14_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:121:12: ( pandexpression )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==AND||(LA7_0>=SAND && LA7_0<=ID)||(LA7_0>=TRUE && LA7_0<=FALSE)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: pandexpression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_pandexpression_in_pandexpression254);
                    	    pandexpression15=pandexpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, pandexpression15.getTree());

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


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:122:4: ^( SAND ( pandexpression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND16=(Object)match(input,SAND,FOLLOW_SAND_in_pandexpression262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND16_tree = (Object)adaptor.dupNode(SAND16);

                    root_1 = (Object)adaptor.becomeRoot(SAND16_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:122:12: ( pandexpression )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==AND||(LA8_0>=SAND && LA8_0<=ID)||(LA8_0>=TRUE && LA8_0<=FALSE)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: pandexpression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_pandexpression_in_pandexpression265);
                    	    pandexpression17=pandexpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, pandexpression17.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 2, pandexpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pandexpression"

    public static class andexpression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andexpression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:125:1: andexpression : (x= ID | TRUE | FALSE | ^( AND ( andexpression )+ ) | ^( SAND ( andexpression )+ ) | ^( PAND ( andexpression )+ ) | ^( NOT andexpression ) );
    public final tftacplausi.andexpression_return andexpression() throws RecognitionException {
        tftacplausi.andexpression_return retval = new tftacplausi.andexpression_return();
        retval.start = input.LT(1);
        int andexpression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object x=null;
        Object TRUE18=null;
        Object FALSE19=null;
        Object AND20=null;
        Object SAND22=null;
        Object PAND24=null;
        Object NOT26=null;
        tftacplausi.andexpression_return andexpression21 = null;

        tftacplausi.andexpression_return andexpression23 = null;

        tftacplausi.andexpression_return andexpression25 = null;

        tftacplausi.andexpression_return andexpression27 = null;


        Object x_tree=null;
        Object TRUE18_tree=null;
        Object FALSE19_tree=null;
        Object AND20_tree=null;
        Object SAND22_tree=null;
        Object PAND24_tree=null;
        Object NOT26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:126:2: (x= ID | TRUE | FALSE | ^( AND ( andexpression )+ ) | ^( SAND ( andexpression )+ ) | ^( PAND ( andexpression )+ ) | ^( NOT andexpression ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt13=1;
                }
                break;
            case TRUE:
                {
                alt13=2;
                }
                break;
            case FALSE:
                {
                alt13=3;
                }
                break;
            case AND:
                {
                alt13=4;
                }
                break;
            case SAND:
                {
                alt13=5;
                }
                break;
            case PAND:
                {
                alt13=6;
                }
                break;
            case NOT:
                {
                alt13=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:126:4: x= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    x=(Object)match(input,ID,FOLLOW_ID_in_andexpression280); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    x_tree = (Object)adaptor.dupNode(x);

                    adaptor.addChild(root_0, x_tree);
                    }
                    if ( state.backtracking==0 ) {

                      				valuelistAND.add(x.toString());
                      			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:129:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE18=(Object)match(input,TRUE,FOLLOW_TRUE_in_andexpression288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE18_tree = (Object)adaptor.dupNode(TRUE18);

                    adaptor.addChild(root_0, TRUE18_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:130:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE19=(Object)match(input,FALSE,FOLLOW_FALSE_in_andexpression294); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE19_tree = (Object)adaptor.dupNode(FALSE19);

                    adaptor.addChild(root_0, FALSE19_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:131:4: ^( AND ( andexpression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND20=(Object)match(input,AND,FOLLOW_AND_in_andexpression300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND20_tree = (Object)adaptor.dupNode(AND20);

                    root_1 = (Object)adaptor.becomeRoot(AND20_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:131:12: ( andexpression )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=AND && LA10_0<=ID)||(LA10_0>=NOT && LA10_0<=FALSE)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: andexpression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_andexpression_in_andexpression304);
                    	    andexpression21=andexpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, andexpression21.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:132:4: ^( SAND ( andexpression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND22=(Object)match(input,SAND,FOLLOW_SAND_in_andexpression312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND22_tree = (Object)adaptor.dupNode(SAND22);

                    root_1 = (Object)adaptor.becomeRoot(SAND22_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:132:12: ( andexpression )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=AND && LA11_0<=ID)||(LA11_0>=NOT && LA11_0<=FALSE)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: andexpression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_andexpression_in_andexpression315);
                    	    andexpression23=andexpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, andexpression23.getTree());

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


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:133:4: ^( PAND ( andexpression )+ )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND24=(Object)match(input,PAND,FOLLOW_PAND_in_andexpression323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PAND24_tree = (Object)adaptor.dupNode(PAND24);

                    root_1 = (Object)adaptor.becomeRoot(PAND24_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:133:12: ( andexpression )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=AND && LA12_0<=ID)||(LA12_0>=NOT && LA12_0<=FALSE)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:0:0: andexpression
                    	    {
                    	    _last = (Object)input.LT(1);
                    	    pushFollow(FOLLOW_andexpression_in_andexpression326);
                    	    andexpression25=andexpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, andexpression25.getTree());

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


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:134:4: ^( NOT andexpression )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT26=(Object)match(input,NOT,FOLLOW_NOT_in_andexpression334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT26_tree = (Object)adaptor.dupNode(NOT26);

                    root_1 = (Object)adaptor.becomeRoot(NOT26_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (Object)input.LT(1);
                    pushFollow(FOLLOW_andexpression_in_andexpression338);
                    andexpression27=andexpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, andexpression27.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 3, andexpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andexpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_expression66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expression85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression96 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_XOR_in_expression111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression121 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_SAND_in_expression129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression138 = new BitSet(new long[]{0x00000000000063F8L});
    public static final BitSet FOLLOW_AND_in_expression148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andexpression_in_expression155 = new BitSet(new long[]{0x00000000000073C8L});
    public static final BitSet FOLLOW_PAND_in_expression185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pandexpression_in_expression190 = new BitSet(new long[]{0x0000000000006348L});
    public static final BitSet FOLLOW_ID_in_pandexpression230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_pandexpression238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_pandexpression244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_pandexpression250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pandexpression_in_pandexpression254 = new BitSet(new long[]{0x0000000000006348L});
    public static final BitSet FOLLOW_SAND_in_pandexpression262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pandexpression_in_pandexpression265 = new BitSet(new long[]{0x0000000000006348L});
    public static final BitSet FOLLOW_ID_in_andexpression280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_andexpression288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_andexpression294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andexpression300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andexpression_in_andexpression304 = new BitSet(new long[]{0x00000000000073C8L});
    public static final BitSet FOLLOW_SAND_in_andexpression312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andexpression_in_andexpression315 = new BitSet(new long[]{0x00000000000073C8L});
    public static final BitSet FOLLOW_PAND_in_andexpression323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andexpression_in_andexpression326 = new BitSet(new long[]{0x00000000000073C8L});
    public static final BitSet FOLLOW_NOT_in_andexpression334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andexpression_in_andexpression338 = new BitSet(new long[]{0x0000000000000008L});

}