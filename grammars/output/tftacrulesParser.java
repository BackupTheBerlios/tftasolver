// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g 2009-02-28 20:40:13

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class tftacrulesParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OR", "AND", "PAND", "SAND", "ID", "LBRACE", "RBRACE", "NOT", "XOR", "TRUE", "FALSE", "INT", "WS"
    };
    public static final int WS=16;
    public static final int XOR=12;
    public static final int RBRACE=10;
    public static final int OR=4;
    public static final int LBRACE=9;
    public static final int PAND=6;
    public static final int INT=15;
    public static final int SAND=7;
    public static final int NOT=11;
    public static final int AND=5;
    public static final int ID=8;
    public static final int FALSE=14;
    public static final int EOF=-1;
    public static final int TRUE=13;

    // delegates
    // delegators


        public tftacrulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public tftacrulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tftacrulesParser.tokenNames; }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();


    public static class tt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tt"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:21:1: tt : ( ^( AND x= ae y= ae ) -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) ) | ^( OR tt tt ) );
    public final tftacrulesParser.tt_return tt() throws RecognitionException {
        tftacrulesParser.tt_return retval = new tftacrulesParser.tt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND1=null;
        Token OR2=null;
        tftacrulesParser.ae_return x = null;

        tftacrulesParser.ae_return y = null;

        tftacrulesParser.tt_return tt3 = null;

        tftacrulesParser.tt_return tt4 = null;


        Object AND1_tree=null;
        Object OR2_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_ae=new RewriteRuleSubtreeStream(adaptor,"rule ae");
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:21:5: ( ^( AND x= ae y= ae ) -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) ) | ^( OR tt tt ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==AND) ) {
                alt1=1;
            }
            else if ( (LA1_0==OR) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:21:7: ^( AND x= ae y= ae )
                    {
                    AND1=(Token)match(input,AND,FOLLOW_AND_in_tt52);  
                    stream_AND.add(AND1);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_ae_in_tt56);
                    x=ae();

                    state._fsp--;

                    stream_ae.add(x.getTree());
                    pushFollow(FOLLOW_ae_in_tt60);
                    y=ae();

                    state._fsp--;

                    stream_ae.add(y.getTree());

                    match(input, Token.UP, null); 


                    // AST REWRITE
                    // elements: y, y, x, x, y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"token y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",x!=null?x.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 22:4: -> ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) )
                    {
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:22:7: ^( XOR ^( PAND $x $y) ^( XOR ^( PAND $y $x) ^( SAND $x $y) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:22:13: ^( PAND $x $y)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_2);

                        adaptor.addChild(root_2, stream_x.nextTree());
                        adaptor.addChild(root_2, stream_y.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:22:27: ^( XOR ^( PAND $y $x) ^( SAND $x $y) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_2);

                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:22:33: ^( PAND $y $x)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAND, "PAND"), root_3);

                        adaptor.addChild(root_3, stream_y.nextTree());
                        adaptor.addChild(root_3, stream_x.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }
                        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:22:47: ^( SAND $x $y)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAND, "SAND"), root_3);

                        adaptor.addChild(root_3, stream_x.nextTree());
                        adaptor.addChild(root_3, stream_y.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:23:4: ^( OR tt tt )
                    {
                    root_0 = (Object)adaptor.nil();

                    OR2=(Token)match(input,OR,FOLLOW_OR_in_tt114); 
                    OR2_tree = (Object)adaptor.create(OR2);
                    root_0 = (Object)adaptor.becomeRoot(OR2_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_tt_in_tt116);
                    tt3=tt();

                    state._fsp--;

                    adaptor.addChild(root_0, tt3.getTree());
                    pushFollow(FOLLOW_tt_in_tt118);
                    tt4=tt();

                    state._fsp--;

                    adaptor.addChild(root_0, tt4.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tt"

    public static class tdnf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tdnf"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:1: tdnf : ( ( es | nes ) | ^( OR tdnf tdnf ) );
    public final tftacrulesParser.tdnf_return tdnf() throws RecognitionException {
        tftacrulesParser.tdnf_return retval = new tftacrulesParser.tdnf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR7=null;
        tftacrulesParser.es_return es5 = null;

        tftacrulesParser.nes_return nes6 = null;

        tftacrulesParser.tdnf_return tdnf8 = null;

        tftacrulesParser.tdnf_return tdnf9 = null;


        Object OR7_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:6: ( ( es | nes ) | ^( OR tdnf tdnf ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=AND && LA3_0<=ID)||(LA3_0>=TRUE && LA3_0<=FALSE)) ) {
                alt3=1;
            }
            else if ( (LA3_0==OR) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:8: ( es | nes )
                    {
                    root_0 = (Object)adaptor.nil();

                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:8: ( es | nes )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=PAND && LA2_0<=ID)||(LA2_0>=TRUE && LA2_0<=FALSE)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==AND) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:9: es
                            {
                            pushFollow(FOLLOW_es_in_tdnf141);
                            es5=es();

                            state._fsp--;

                            adaptor.addChild(root_0, es5.getTree());

                            }
                            break;
                        case 2 :
                            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:27:12: nes
                            {
                            pushFollow(FOLLOW_nes_in_tdnf143);
                            nes6=nes();

                            state._fsp--;

                            adaptor.addChild(root_0, nes6.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:28:4: ^( OR tdnf tdnf )
                    {
                    root_0 = (Object)adaptor.nil();

                    OR7=(Token)match(input,OR,FOLLOW_OR_in_tdnf150); 
                    OR7_tree = (Object)adaptor.create(OR7);
                    root_0 = (Object)adaptor.becomeRoot(OR7_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_tdnf_in_tdnf152);
                    tdnf8=tdnf();

                    state._fsp--;

                    adaptor.addChild(root_0, tdnf8.getTree());
                    pushFollow(FOLLOW_tdnf_in_tdnf154);
                    tdnf9=tdnf();

                    state._fsp--;

                    adaptor.addChild(root_0, tdnf9.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tdnf"

    public static class es_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "es"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:31:1: es : ( ce | ^( PAND es ce ) );
    public final tftacrulesParser.es_return es() throws RecognitionException {
        tftacrulesParser.es_return retval = new tftacrulesParser.es_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PAND11=null;
        tftacrulesParser.ce_return ce10 = null;

        tftacrulesParser.es_return es12 = null;

        tftacrulesParser.ce_return ce13 = null;


        Object PAND11_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:31:4: ( ce | ^( PAND es ce ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=SAND && LA4_0<=ID)||(LA4_0>=TRUE && LA4_0<=FALSE)) ) {
                alt4=1;
            }
            else if ( (LA4_0==PAND) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:31:6: ce
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ce_in_es165);
                    ce10=ce();

                    state._fsp--;

                    adaptor.addChild(root_0, ce10.getTree());

                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:32:4: ^( PAND es ce )
                    {
                    root_0 = (Object)adaptor.nil();

                    PAND11=(Token)match(input,PAND,FOLLOW_PAND_in_es171); 
                    PAND11_tree = (Object)adaptor.create(PAND11);
                    root_0 = (Object)adaptor.becomeRoot(PAND11_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_es_in_es173);
                    es12=es();

                    state._fsp--;

                    adaptor.addChild(root_0, es12.getTree());
                    pushFollow(FOLLOW_ce_in_es175);
                    ce13=ce();

                    state._fsp--;

                    adaptor.addChild(root_0, ce13.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "es"

    public static class nes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nes"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:34:1: nes : ^( AND nce es ) ;
    public final tftacrulesParser.nes_return nes() throws RecognitionException {
        tftacrulesParser.nes_return retval = new tftacrulesParser.nes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND14=null;
        tftacrulesParser.nce_return nce15 = null;

        tftacrulesParser.es_return es16 = null;


        Object AND14_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:34:5: ( ^( AND nce es ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:34:7: ^( AND nce es )
            {
            root_0 = (Object)adaptor.nil();

            AND14=(Token)match(input,AND,FOLLOW_AND_in_nes186); 
            AND14_tree = (Object)adaptor.create(AND14);
            root_0 = (Object)adaptor.becomeRoot(AND14_tree, root_0);


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_nce_in_nes188);
            nce15=nce();

            state._fsp--;

            adaptor.addChild(root_0, nce15.getTree());
            pushFollow(FOLLOW_es_in_nes190);
            es16=es();

            state._fsp--;

            adaptor.addChild(root_0, es16.getTree());

            match(input, Token.UP, null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nes"

    public static class ce_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ce"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:36:1: ce : ( ae | ^( SAND ce ce ) );
    public final tftacrulesParser.ce_return ce() throws RecognitionException {
        tftacrulesParser.ce_return retval = new tftacrulesParser.ce_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAND18=null;
        tftacrulesParser.ae_return ae17 = null;

        tftacrulesParser.ce_return ce19 = null;

        tftacrulesParser.ce_return ce20 = null;


        Object SAND18_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:36:4: ( ae | ^( SAND ce ce ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=TRUE && LA5_0<=FALSE)) ) {
                alt5=1;
            }
            else if ( (LA5_0==SAND) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:36:6: ae
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ae_in_ce199);
                    ae17=ae();

                    state._fsp--;

                    adaptor.addChild(root_0, ae17.getTree());

                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:37:4: ^( SAND ce ce )
                    {
                    root_0 = (Object)adaptor.nil();

                    SAND18=(Token)match(input,SAND,FOLLOW_SAND_in_ce206); 
                    SAND18_tree = (Object)adaptor.create(SAND18);
                    root_0 = (Object)adaptor.becomeRoot(SAND18_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_ce_in_ce208);
                    ce19=ce();

                    state._fsp--;

                    adaptor.addChild(root_0, ce19.getTree());
                    pushFollow(FOLLOW_ce_in_ce210);
                    ce20=ce();

                    state._fsp--;

                    adaptor.addChild(root_0, ce20.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ce"

    public static class nce_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nce"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:40:1: nce : ( nae | ^( AND nce nce ) );
    public final tftacrulesParser.nce_return nce() throws RecognitionException {
        tftacrulesParser.nce_return retval = new tftacrulesParser.nce_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND22=null;
        tftacrulesParser.nae_return nae21 = null;

        tftacrulesParser.nce_return nce23 = null;

        tftacrulesParser.nce_return nce24 = null;


        Object AND22_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:40:5: ( nae | ^( AND nce nce ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NOT) ) {
                alt6=1;
            }
            else if ( (LA6_0==AND) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:40:7: nae
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nae_in_nce221);
                    nae21=nae();

                    state._fsp--;

                    adaptor.addChild(root_0, nae21.getTree());

                    }
                    break;
                case 2 :
                    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:41:4: ^( AND nce nce )
                    {
                    root_0 = (Object)adaptor.nil();

                    AND22=(Token)match(input,AND,FOLLOW_AND_in_nce228); 
                    AND22_tree = (Object)adaptor.create(AND22);
                    root_0 = (Object)adaptor.becomeRoot(AND22_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nce_in_nce230);
                    nce23=nce();

                    state._fsp--;

                    adaptor.addChild(root_0, nce23.getTree());
                    pushFollow(FOLLOW_nce_in_nce232);
                    nce24=nce();

                    state._fsp--;

                    adaptor.addChild(root_0, nce24.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nce"

    public static class ae_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:44:1: ae : ( ID | TRUE | FALSE );
    public final tftacrulesParser.ae_return ae() throws RecognitionException {
        tftacrulesParser.ae_return retval = new tftacrulesParser.ae_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:44:5: ( ID | TRUE | FALSE )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:
            {
            root_0 = (Object)adaptor.nil();

            set25=(Token)input.LT(1);
            if ( input.LA(1)==ID||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set25));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ae"

    public static class nae_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nae"
    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:1: nae : ^( NOT ae ) ;
    public final tftacrulesParser.nae_return nae() throws RecognitionException {
        tftacrulesParser.nae_return retval = new tftacrulesParser.nae_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT26=null;
        tftacrulesParser.ae_return ae27 = null;


        Object NOT26_tree=null;

        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:5: ( ^( NOT ae ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftacrules.g:49:7: ^( NOT ae )
            {
            root_0 = (Object)adaptor.nil();

            NOT26=(Token)match(input,NOT,FOLLOW_NOT_in_nae273); 
            NOT26_tree = (Object)adaptor.create(NOT26);
            root_0 = (Object)adaptor.becomeRoot(NOT26_tree, root_0);


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ae_in_nae275);
            ae27=ae();

            state._fsp--;

            adaptor.addChild(root_0, ae27.getTree());

            match(input, Token.UP, null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nae"

    // Delegated rules


 

    public static final BitSet FOLLOW_AND_in_tt52 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_tt56 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_ae_in_tt60 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_tt114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tt_in_tt116 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_tt_in_tt118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_es_in_tdnf141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nes_in_tdnf143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_tdnf150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tdnf_in_tdnf152 = new BitSet(new long[]{0x00000000000061F0L});
    public static final BitSet FOLLOW_tdnf_in_tdnf154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ce_in_es165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAND_in_es171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_es_in_es173 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ce_in_es175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_nes186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nce_in_nes188 = new BitSet(new long[]{0x00000000000061C0L});
    public static final BitSet FOLLOW_es_in_nes190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ae_in_ce199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAND_in_ce206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ce_in_ce208 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ce_in_ce210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nae_in_nce221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_nce228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nce_in_nce230 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_nce_in_nce232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_ae0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_nae273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ae_in_nae275 = new BitSet(new long[]{0x0000000000000008L});

}