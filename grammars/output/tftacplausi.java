// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g 2009-03-08 15:35:49

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
            this.state.ruleMemo = new HashMap[15+1];
             
             
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

    List valuelist = new ArrayList();



    public static class expression_return extends TreeRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:52:1: expression : ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT (a+= expression )* ) | ID | TRUE | FALSE | ^( PAND (a+= expression )* ) -> ^( PAND ( $a)+ ) );
    public final tftacplausi.expression_return expression() throws RecognitionException {
        tftacplausi.expression_return retval = new tftacplausi.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Object _first_0 = null;
        Object _last = null;

        Object OR1=null;
        Object XOR2=null;
        Object AND3=null;
        Object SAND4=null;
        Object NOT5=null;
        Object ID6=null;
        Object TRUE7=null;
        Object FALSE8=null;
        Object PAND9=null;
        List list_a=null;
        RuleReturnScope a = null;
        Object OR1_tree=null;
        Object XOR2_tree=null;
        Object AND3_tree=null;
        Object SAND4_tree=null;
        Object NOT5_tree=null;
        Object ID6_tree=null;
        Object TRUE7_tree=null;
        Object FALSE8_tree=null;
        Object PAND9_tree=null;
        RewriteRuleNodeStream stream_PAND=new RewriteRuleNodeStream(adaptor,"token PAND");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:53:2: ( ^( OR (a+= expression )* ) | ^( XOR (a+= expression )* ) | ^( AND (a+= expression )* ) | ^( SAND (a+= expression )* ) | ^( NOT (a+= expression )* ) | ID | TRUE | FALSE | ^( PAND (a+= expression )* ) -> ^( PAND ( $a)+ ) )
            int alt7=9;
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
            case AND:
                {
                alt7=3;
                }
                break;
            case SAND:
                {
                alt7=4;
                }
                break;
            case NOT:
                {
                alt7=5;
                }
                break;
            case ID:
                {
                alt7=6;
                }
                break;
            case TRUE:
                {
                alt7=7;
                }
                break;
            case FALSE:
                {
                alt7=8;
                }
                break;
            case PAND:
                {
                alt7=9;
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:53:4: ^( OR (a+= expression )* )
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:53:12: (a+= expression )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:53:13: a+= expression
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:54:7: ^( XOR (a+= expression )* )
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
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:54:15: (a+= expression )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:54:16: a+= expression
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
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:55:6: ^( AND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    AND3=(Object)match(input,AND,FOLLOW_AND_in_expression102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND3_tree = (Object)adaptor.dupNode(AND3);

                    root_1 = (Object)adaptor.becomeRoot(AND3_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:55:14: (a+= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:55:15: a+= expression
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

                      				int listsize = list_a.size();
                      				for ( int i = 0; i<= listsize -1; i++ )
                      				{
                      					valuelist.add(list_a.get(i).toString());
                      				}	
                      			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:63:4: ^( SAND (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    SAND4=(Object)match(input,SAND,FOLLOW_SAND_in_expression124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAND4_tree = (Object)adaptor.dupNode(SAND4);

                    root_1 = (Object)adaptor.becomeRoot(SAND4_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:63:13: (a+= expression )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=OR && LA4_0<=ID)||(LA4_0>=NOT && LA4_0<=FALSE)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:63:14: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression131);
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

                      				int listsize = list_a.size();
                      				for ( int i = 0; i<= listsize -1; i++ )
                      				{
                      					valuelist.add(list_a.get(i).toString());
                      				}	
                      			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:71:7: ^( NOT (a+= expression )* )
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    NOT5=(Object)match(input,NOT,FOLLOW_NOT_in_expression149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT5_tree = (Object)adaptor.dupNode(NOT5);

                    root_1 = (Object)adaptor.becomeRoot(NOT5_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:71:14: (a+= expression )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:71:15: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression155);
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

                      				int listsize = list_a.size();
                      				for ( int i = 0; i<= listsize -1; i++ )
                      				{
                      					valuelist.add(list_a.get(i).toString());
                      				}	
                      			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:79:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    ID6=(Object)match(input,ID,FOLLOW_ID_in_expression173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID6_tree = (Object)adaptor.dupNode(ID6);

                    adaptor.addChild(root_0, ID6_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:80:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    TRUE7=(Object)match(input,TRUE,FOLLOW_TRUE_in_expression179); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE7_tree = (Object)adaptor.dupNode(TRUE7);

                    adaptor.addChild(root_0, TRUE7_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:81:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    _last = (Object)input.LT(1);
                    FALSE8=(Object)match(input,FALSE,FOLLOW_FALSE_in_expression185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE8_tree = (Object)adaptor.dupNode(FALSE8);

                    adaptor.addChild(root_0, FALSE8_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:82:4: ^( PAND (a+= expression )* )
                    {
                    _last = (Object)input.LT(1);
                    {
                    Object _save_last_1 = _last;
                    Object _first_1 = null;
                    Object root_1 = (Object)adaptor.nil();_last = (Object)input.LT(1);
                    PAND9=(Object)match(input,PAND,FOLLOW_PAND_in_expression192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAND.add(PAND9);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:82:11: (a+= expression )*
                        loop6:
                        do {
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( ((LA6_0>=OR && LA6_0<=ID)||(LA6_0>=NOT && LA6_0<=FALSE)) ) {
                                alt6=1;
                            }


                            switch (alt6) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:82:12: a+= expression
                        	    {
                        	    _last = (Object)input.LT(1);
                        	    _last = (Object)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_expression197);
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
                        	    break loop6;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {

                      				// add the "real" events to the list (not the ones characterizing the operators!)
                      				int listsize = list_a.size();
                      				
                      				for ( int i = 0; i<= listsize -1; i++ )
                      				{
                      					if ( !( list_a.get(i).toString().equals("SAND") || list_a.get(i).toString().equals("AND") ) )
                      					{
                      						valuelist.add(list_a.get(i).toString());
                      					}
                      				}
                      				// now check for duplicates
                      				listsize = valuelist.size();
                      				for ( int i = 0; i < listsize-1; i++ )            // last element of list need not be checked 
                        				{
                        					for ( int j = i+1; j < listsize; j++ )
                        					{
                      	  					if ( valuelist.get(i).equals(valuelist.get(j)) )
                      	  					{	  						
                      	  						list_a.clear();
                      	  						list_a.add((Object)adaptor.create(FALSE, "FALSE"));
                      	  						listsize = 0;
                      	  					}
                      	  				}
                      				}
                      				valuelist.clear();			
                      			
                    }


                    // AST REWRITE
                    // elements: PAND, a
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: a
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
                    root_0 = (Object)adaptor.nil();
                    // 110:4: -> ^( PAND ( $a)+ )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacplausi.g:110:7: ^( PAND ( $a)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PAND.nextNode(), root_1);

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
    public static final BitSet FOLLOW_AND_in_expression102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression109 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_expression124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression131 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_expression149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression155 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_ID_in_expression173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_expression192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression197 = new BitSet(new long[]{0x00000000000073F8L});

}