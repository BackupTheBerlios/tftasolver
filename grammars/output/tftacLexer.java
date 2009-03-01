// $ANTLR 3.1.1 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g 2009-03-01 16:13:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tftacLexer extends Lexer {
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

    public tftacLexer() {;} 
    public tftacLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public tftacLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:29:5: ( 'AND' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:29:7: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "PAND"
    public final void mPAND() throws RecognitionException {
        try {
            int _type = PAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:30:6: ( 'PAND' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:30:8: 'PAND'
            {
            match("PAND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAND"

    // $ANTLR start "SAND"
    public final void mSAND() throws RecognitionException {
        try {
            int _type = SAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:31:6: ( 'SAND' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:31:8: 'SAND'
            {
            match("SAND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:32:4: ( 'OR' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:32:6: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:33:5: ( 'XOR' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:33:7: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:34:5: ( 'NOT' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:34:7: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:35:6: ( 'TRUE' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:35:8: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:36:7: ( 'FALSE' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:36:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:38:6: ( ( '0' .. '9' )+ )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:38:11: ( '0' .. '9' )+
            {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:38:11: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:38:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:39:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT )* )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:39:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:39:30: ( 'a' .. 'z' | 'A' .. 'Z' | INT )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:39:31: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:39:40: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:39:49: INT
            	    {
            	    mINT(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:40:6: ( ( ' ' | '\\t' | '\\f' )+ )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:40:11: ( ' ' | '\\t' | '\\f' )+
            {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:40:11: ( ' ' | '\\t' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0=='\f'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:9: ( ( '(' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:12: ( '(' )
            {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:12: ( '(' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:42:13: '('
            {
            match('('); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:43:9: ( ( ')' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:43:12: ( ')' )
            {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:43:12: ( ')' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:43:13: ')'
            {
            match(')'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    public void mTokens() throws RecognitionException {
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:8: ( AND | PAND | SAND | OR | XOR | NOT | TRUE | FALSE | INT | ID | WS | LBRACE | RBRACE )
        int alt4=13;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:10: AND
                {
                mAND(); 

                }
                break;
            case 2 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:14: PAND
                {
                mPAND(); 

                }
                break;
            case 3 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:19: SAND
                {
                mSAND(); 

                }
                break;
            case 4 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:24: OR
                {
                mOR(); 

                }
                break;
            case 5 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:27: XOR
                {
                mXOR(); 

                }
                break;
            case 6 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:31: NOT
                {
                mNOT(); 

                }
                break;
            case 7 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:35: TRUE
                {
                mTRUE(); 

                }
                break;
            case 8 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:40: FALSE
                {
                mFALSE(); 

                }
                break;
            case 9 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:46: INT
                {
                mINT(); 

                }
                break;
            case 10 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:50: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:53: WS
                {
                mWS(); 

                }
                break;
            case 12 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:56: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 13 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:63: RBRACE
                {
                mRBRACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\10\12\5\uffff\3\12\1\31\4\12\1\36\2\12\1\uffff\1\41\1\42"+
        "\2\12\1\uffff\1\45\1\46\2\uffff\1\47\1\12\3\uffff\1\51\1\uffff";
    static final String DFA4_eofS =
        "\52\uffff";
    static final String DFA4_minS =
        "\1\11\1\116\2\101\1\122\2\117\1\122\1\101\5\uffff\1\104\2\116\1"+
        "\60\1\122\1\124\1\125\1\114\1\60\2\104\1\uffff\2\60\1\105\1\123"+
        "\1\uffff\2\60\2\uffff\1\60\1\105\3\uffff\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\116\2\101\1\122\2\117\1\122\1\101\5\uffff\1\104\2\116\1"+
        "\172\1\122\1\124\1\125\1\114\1\172\2\104\1\uffff\2\172\1\105\1\123"+
        "\1\uffff\2\172\2\uffff\1\172\1\105\3\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\11\1\12\1\13\1\14\1\15\13\uffff\1\4\4\uffff\1\1\2\uffff"+
        "\1\5\1\6\2\uffff\1\2\1\3\1\7\1\uffff\1\10";
    static final String DFA4_specialS =
        "\52\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\13\2\uffff\1\13\23\uffff\1\13\7\uffff\1\14\1\15\6\uffff\12"+
            "\11\7\uffff\1\1\4\12\1\10\7\12\1\6\1\4\1\2\2\12\1\3\1\7\3\12"+
            "\1\5\2\12\6\uffff\32\12",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\37",
            "\1\40",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\43",
            "\1\44",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\50",
            "",
            "",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | PAND | SAND | OR | XOR | NOT | TRUE | FALSE | INT | ID | WS | LBRACE | RBRACE );";
        }
    }
 

}