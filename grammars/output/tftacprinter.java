// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g 2009-03-06 21:50:20

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class tftacprinter extends TreeParser {
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


        public tftacprinter(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacprinter(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("tftacprinterTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return tftacprinter.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g"; }


    public static class infixform_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "infixform"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:33:1: infixform : ( ^( OR (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" OR \">)>> | ^( XOR (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" XOR \">)>> | ^( PAND (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" PAND \">)>> | ^( AND (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" AND \">)>> | ^( SAND (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" SAND \">)>> | ^( NOT a= infixform ) -> template(a=$a.st) \"NOT <a>\" | ID -> template(a=$ID.text) \"<a>\" | TRUE -> {%{\"TRUE\"}} | FALSE -> {%{\"FALSE\"}});
    public final tftacprinter.infixform_return infixform() throws RecognitionException {
        tftacprinter.infixform_return retval = new tftacprinter.infixform_return();
        retval.start = input.LT(1);

        CommonTree ID1=null;
        List list_targets=null;
        tftacprinter.infixform_return a = null;

        RuleReturnScope targets = null;
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:34:2: ( ^( OR (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" OR \">)>> | ^( XOR (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" XOR \">)>> | ^( PAND (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" PAND \">)>> | ^( AND (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" AND \">)>> | ^( SAND (targets+= infixform )* ) -> template(b=$targets) <<(<b; separator=\" SAND \">)>> | ^( NOT a= infixform ) -> template(a=$a.st) \"NOT <a>\" | ID -> template(a=$ID.text) \"<a>\" | TRUE -> {%{\"TRUE\"}} | FALSE -> {%{\"FALSE\"}})
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
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:34:7: ^( OR (targets+= infixform )* )
                    {
                    match(input,OR,FOLLOW_OR_in_infixform49); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:34:12: (targets+= infixform )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=OR && LA1_0<=ID)||(LA1_0>=NOT && LA1_0<=FALSE)) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:34:13: targets+= infixform
                        	    {
                        	    pushFollow(FOLLOW_infixform_in_infixform54);
                        	    targets=infixform();

                        	    state._fsp--;

                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop1;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 35:4: -> template(b=$targets) <<(<b; separator=\" OR \">)>>
                    {
                        retval.st = new StringTemplate(templateLib, "(<b; separator=\" OR \">)",
                      new STAttrMap().put("b", list_targets));
                    }


                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:36:7: ^( XOR (targets+= infixform )* )
                    {
                    match(input,XOR,FOLLOW_XOR_in_infixform83); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:36:13: (targets+= infixform )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=OR && LA2_0<=ID)||(LA2_0>=NOT && LA2_0<=FALSE)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:36:14: targets+= infixform
                        	    {
                        	    pushFollow(FOLLOW_infixform_in_infixform88);
                        	    targets=infixform();

                        	    state._fsp--;

                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop2;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 37:4: -> template(b=$targets) <<(<b; separator=\" XOR \">)>>
                    {
                        retval.st = new StringTemplate(templateLib, "(<b; separator=\" XOR \">)",
                      new STAttrMap().put("b", list_targets));
                    }


                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:38:4: ^( PAND (targets+= infixform )* )
                    {
                    match(input,PAND,FOLLOW_PAND_in_infixform114); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:38:11: (targets+= infixform )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=OR && LA3_0<=ID)||(LA3_0>=NOT && LA3_0<=FALSE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:38:12: targets+= infixform
                        	    {
                        	    pushFollow(FOLLOW_infixform_in_infixform119);
                        	    targets=infixform();

                        	    state._fsp--;

                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop3;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 39:4: -> template(b=$targets) <<(<b; separator=\" PAND \">)>>
                    {
                        retval.st = new StringTemplate(templateLib, "(<b; separator=\" PAND \">)",
                      new STAttrMap().put("b", list_targets));
                    }


                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:40:6: ^( AND (targets+= infixform )* )
                    {
                    match(input,AND,FOLLOW_AND_in_infixform147); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:40:13: (targets+= infixform )*
                        loop4:
                        do {
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=OR && LA4_0<=ID)||(LA4_0>=NOT && LA4_0<=FALSE)) ) {
                                alt4=1;
                            }


                            switch (alt4) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:40:14: targets+= infixform
                        	    {
                        	    pushFollow(FOLLOW_infixform_in_infixform153);
                        	    targets=infixform();

                        	    state._fsp--;

                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop4;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 41:4: -> template(b=$targets) <<(<b; separator=\" AND \">)>>
                    {
                        retval.st = new StringTemplate(templateLib, "(<b; separator=\" AND \">)",
                      new STAttrMap().put("b", list_targets));
                    }


                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:42:7: ^( SAND (targets+= infixform )* )
                    {
                    match(input,SAND,FOLLOW_SAND_in_infixform182); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:42:15: (targets+= infixform )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( ((LA5_0>=OR && LA5_0<=ID)||(LA5_0>=NOT && LA5_0<=FALSE)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:42:16: targets+= infixform
                        	    {
                        	    pushFollow(FOLLOW_infixform_in_infixform188);
                        	    targets=infixform();

                        	    state._fsp--;

                        	    if (list_targets==null) list_targets=new ArrayList();
                        	    list_targets.add(targets.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop5;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 43:4: -> template(b=$targets) <<(<b; separator=\" SAND \">)>>
                    {
                        retval.st = new StringTemplate(templateLib, "(<b; separator=\" SAND \">)",
                      new STAttrMap().put("b", list_targets));
                    }


                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:44:7: ^( NOT a= infixform )
                    {
                    match(input,NOT,FOLLOW_NOT_in_infixform217); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform222);
                    a=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 45:4: -> template(a=$a.st) \"NOT <a>\"
                    {
                        retval.st = new StringTemplate(templateLib, "NOT <a>",
                      new STAttrMap().put("a", (a!=null?a.st:null)));
                    }


                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:46:11: ID
                    {
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_infixform252); 


                    // TEMPLATE REWRITE
                    // 46:14: -> template(a=$ID.text) \"<a>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>",
                      new STAttrMap().put("a", (ID1!=null?ID1.getText():null)));
                    }


                    }
                    break;
                case 8 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:47:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_infixform268); 


                    // TEMPLATE REWRITE
                    // 47:9: -> {%{\"TRUE\"}}
                    {
                        retval.st = new StringTemplate(templateLib,"TRUE");
                    }


                    }
                    break;
                case 9 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:48:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_infixform277); 


                    // TEMPLATE REWRITE
                    // 48:10: -> {%{\"FALSE\"}}
                    {
                        retval.st = new StringTemplate(templateLib,"FALSE");
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "infixform"

    // Delegated rules


 

    public static final BitSet FOLLOW_OR_in_infixform49 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform54 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_XOR_in_infixform83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform88 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_PAND_in_infixform114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform119 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_AND_in_infixform147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform153 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_SAND_in_infixform182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform188 = new BitSet(new long[]{0x00000000000073F8L});
    public static final BitSet FOLLOW_NOT_in_infixform217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_infixform252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_infixform268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_infixform277 = new BitSet(new long[]{0x0000000000000002L});

}