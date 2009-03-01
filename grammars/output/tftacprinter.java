// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g 2009-03-01 21:55:44

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
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:33:1: infixform : ( ^( PAND a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> PAND <b>)\" | ^( AND a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> AND <b>)\" | ^( SAND a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> SAND <b>)\" | ^( OR a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> OR <b>)\" | ^( XOR a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> XOR <b>)\" | ^( NOT a= infixform ) -> template(a=$a.st) \"(NOT <a>)\" | ID -> template(a=$ID.text) \"<a>\" | TRUE -> {%{\"TRUE\"}} | FALSE -> {%{\"FALSE\"}});
    public final tftacprinter.infixform_return infixform() throws RecognitionException {
        tftacprinter.infixform_return retval = new tftacprinter.infixform_return();
        retval.start = input.LT(1);

        CommonTree ID1=null;
        tftacprinter.infixform_return a = null;

        tftacprinter.infixform_return b = null;


        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:34:2: ( ^( PAND a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> PAND <b>)\" | ^( AND a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> AND <b>)\" | ^( SAND a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> SAND <b>)\" | ^( OR a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> OR <b>)\" | ^( XOR a= infixform b= infixform ) -> template(a=$a.stb=$b.st) \"(<a> XOR <b>)\" | ^( NOT a= infixform ) -> template(a=$a.st) \"(NOT <a>)\" | ID -> template(a=$ID.text) \"<a>\" | TRUE -> {%{\"TRUE\"}} | FALSE -> {%{\"FALSE\"}})
            int alt1=9;
            switch ( input.LA(1) ) {
            case PAND:
                {
                alt1=1;
                }
                break;
            case AND:
                {
                alt1=2;
                }
                break;
            case SAND:
                {
                alt1=3;
                }
                break;
            case OR:
                {
                alt1=4;
                }
                break;
            case XOR:
                {
                alt1=5;
                }
                break;
            case NOT:
                {
                alt1=6;
                }
                break;
            case ID:
                {
                alt1=7;
                }
                break;
            case TRUE:
                {
                alt1=8;
                }
                break;
            case FALSE:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:34:7: ^( PAND a= infixform b= infixform )
                    {
                    match(input,PAND,FOLLOW_PAND_in_infixform49); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform53);
                    a=infixform();

                    state._fsp--;

                    pushFollow(FOLLOW_infixform_in_infixform57);
                    b=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 35:4: -> template(a=$a.stb=$b.st) \"(<a> PAND <b>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a> PAND <b>)",
                      new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:36:6: ^( AND a= infixform b= infixform )
                    {
                    match(input,AND,FOLLOW_AND_in_infixform87); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform92);
                    a=infixform();

                    state._fsp--;

                    pushFollow(FOLLOW_infixform_in_infixform96);
                    b=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 37:4: -> template(a=$a.stb=$b.st) \"(<a> AND <b>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a> AND <b>)",
                      new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:38:7: ^( SAND a= infixform b= infixform )
                    {
                    match(input,SAND,FOLLOW_SAND_in_infixform130); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform135);
                    a=infixform();

                    state._fsp--;

                    pushFollow(FOLLOW_infixform_in_infixform139);
                    b=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 39:4: -> template(a=$a.stb=$b.st) \"(<a> SAND <b>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a> SAND <b>)",
                      new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:40:7: ^( OR a= infixform b= infixform )
                    {
                    match(input,OR,FOLLOW_OR_in_infixform170); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform175);
                    a=infixform();

                    state._fsp--;

                    pushFollow(FOLLOW_infixform_in_infixform179);
                    b=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 41:4: -> template(a=$a.stb=$b.st) \"(<a> OR <b>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a> OR <b>)",
                      new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:42:7: ^( XOR a= infixform b= infixform )
                    {
                    match(input,XOR,FOLLOW_XOR_in_infixform210); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform215);
                    a=infixform();

                    state._fsp--;

                    pushFollow(FOLLOW_infixform_in_infixform219);
                    b=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 43:4: -> template(a=$a.stb=$b.st) \"(<a> XOR <b>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a> XOR <b>)",
                      new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:44:7: ^( NOT a= infixform )
                    {
                    match(input,NOT,FOLLOW_NOT_in_infixform250); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_infixform_in_infixform255);
                    a=infixform();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 45:4: -> template(a=$a.st) \"(NOT <a>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(NOT <a>)",
                      new STAttrMap().put("a", (a!=null?a.st:null)));
                    }


                    }
                    break;
                case 7 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacprinter.g:46:11: ID
                    {
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_infixform285); 


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
                    match(input,TRUE,FOLLOW_TRUE_in_infixform301); 


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
                    match(input,FALSE,FOLLOW_FALSE_in_infixform310); 


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


 

    public static final BitSet FOLLOW_PAND_in_infixform49 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform53 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_infixform_in_infixform57 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_infixform87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform92 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_infixform_in_infixform96 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAND_in_infixform130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform135 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_infixform_in_infixform139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_infixform170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform175 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_infixform_in_infixform179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_infixform210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform215 = new BitSet(new long[]{0x00000000000073F0L});
    public static final BitSet FOLLOW_infixform_in_infixform219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_infixform250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_infixform_in_infixform255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_infixform285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_infixform301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_infixform310 = new BitSet(new long[]{0x0000000000000002L});

}