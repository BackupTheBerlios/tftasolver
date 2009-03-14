// $ANTLR 3.1.2 /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g 2009-03-13 18:16:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tftacLexer extends Lexer {
    public static final int LBRACE=10;
    public static final int PAND=7;
    public static final int NOTAND=28;
    public static final int NOT=12;
    public static final int AND=6;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int SAND=8;
    public static final int NOTOR=31;
    public static final int D=17;
    public static final int E=25;
    public static final int F=26;
    public static final int G=38;
    public static final int XOR=5;
    public static final int A=15;
    public static final int B=36;
    public static final int RBRACE=11;
    public static final int C=37;
    public static final int L=27;
    public static final int M=43;
    public static final int N=16;
    public static final int O=20;
    public static final int H=39;
    public static final int I=40;
    public static final int J=41;
    public static final int K=42;
    public static final int U=24;
    public static final int T=23;
    public static final int W=46;
    public static final int V=45;
    public static final int Q=44;
    public static final int NOTPAND=29;
    public static final int INT=34;
    public static final int P=18;
    public static final int S=19;
    public static final int R=21;
    public static final int NOTSAND=30;
    public static final int TRUE=13;
    public static final int Y=47;
    public static final int X=22;
    public static final int Z=48;
    public static final int WS=35;
    public static final int NOTNOT=33;
    public static final int OR=4;
    public static final int NOTXOR=32;
    public static final int FALSE=14;

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:55:5: ( A N D )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:55:7: A N D
            {
            mA(); 
            mN(); 
            mD(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:56:6: ( P A N D )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:56:8: P A N D
            {
            mP(); 
            mA(); 
            mN(); 
            mD(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:57:6: ( S A N D )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:57:8: S A N D
            {
            mS(); 
            mA(); 
            mN(); 
            mD(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:58:4: ( O R )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:58:6: O R
            {
            mO(); 
            mR(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:59:5: ( X O R )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:59:7: X O R
            {
            mX(); 
            mO(); 
            mR(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:60:5: ( N O T )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:60:7: N O T
            {
            mN(); 
            mO(); 
            mT(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:61:6: ( T R U E )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:61:8: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:62:7: ( F A L S E )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:62:9: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NOTAND"
    public final void mNOTAND() throws RecognitionException {
        try {
            int _type = NOTAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:64:8: ( N A N D )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:64:10: N A N D
            {
            mN(); 
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTAND"

    // $ANTLR start "NOTPAND"
    public final void mNOTPAND() throws RecognitionException {
        try {
            int _type = NOTPAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:65:9: ( N P A N D )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:65:11: N P A N D
            {
            mN(); 
            mP(); 
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTPAND"

    // $ANTLR start "NOTSAND"
    public final void mNOTSAND() throws RecognitionException {
        try {
            int _type = NOTSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:66:9: ( N S A N D )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:66:11: N S A N D
            {
            mN(); 
            mS(); 
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTSAND"

    // $ANTLR start "NOTOR"
    public final void mNOTOR() throws RecognitionException {
        try {
            int _type = NOTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:67:7: ( N O R )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:67:9: N O R
            {
            mN(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTOR"

    // $ANTLR start "NOTXOR"
    public final void mNOTXOR() throws RecognitionException {
        try {
            int _type = NOTXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:68:8: ( N X O R )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:68:10: N X O R
            {
            mN(); 
            mX(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTXOR"

    // $ANTLR start "NOTNOT"
    public final void mNOTNOT() throws RecognitionException {
        try {
            int _type = NOTNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:69:8: ( N N O T )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:69:10: N N O T
            {
            mN(); 
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTNOT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:71:6: ( ( '0' .. '9' )+ )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:71:11: ( '0' .. '9' )+
            {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:71:11: ( '0' .. '9' )+
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
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:71:12: '0' .. '9'
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:72:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT )* )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:72:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:72:30: ( 'a' .. 'z' | 'A' .. 'Z' | INT )*
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
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:72:31: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:72:40: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:72:49: INT
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:73:6: ( ( ' ' | '\\t' | '\\n' | '\\f' )+ )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:73:11: ( ' ' | '\\t' | '\\n' | '\\f' )+
            {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:73:11: ( ' ' | '\\t' | '\\n' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\f'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\f'||input.LA(1)==' ' ) {
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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:75:9: ( '(' | '[' | '{' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:
            {
            if ( input.LA(1)=='('||input.LA(1)=='['||input.LA(1)=='{' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:80:9: ( ')' | ']' | '}' )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:
            {
            if ( input.LA(1)==')'||input.LA(1)==']'||input.LA(1)=='}' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:85:11: ( ( 'a' | 'A' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:85:12: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:86:11: ( ( 'b' | 'B' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:86:12: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:87:11: ( ( 'c' | 'C' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:87:12: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:88:11: ( ( 'd' | 'D' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:88:12: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:89:11: ( ( 'e' | 'E' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:89:12: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:90:11: ( ( 'f' | 'F' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:90:12: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:91:11: ( ( 'g' | 'G' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:91:12: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:92:11: ( ( 'h' | 'H' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:92:12: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:93:11: ( ( 'i' | 'I' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:93:12: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:94:11: ( ( 'j' | 'J' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:94:12: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:95:11: ( ( 'k' | 'K' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:95:12: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:96:11: ( ( 'l' | 'L' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:96:12: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:97:11: ( ( 'm' | 'M' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:97:12: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:98:11: ( ( 'n' | 'N' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:98:12: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:99:11: ( ( 'o' | 'O' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:99:12: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:100:11: ( ( 'p' | 'P' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:100:12: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:101:11: ( ( 'q' | 'Q' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:101:12: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:102:11: ( ( 'r' | 'R' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:102:12: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:103:11: ( ( 's' | 'S' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:103:12: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:104:11: ( ( 't' | 'T' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:104:12: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:105:11: ( ( 'u' | 'U' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:105:12: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:106:11: ( ( 'v' | 'V' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:106:12: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:107:11: ( ( 'w' | 'W' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:107:12: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:108:11: ( ( 'x' | 'X' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:108:12: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:109:11: ( ( 'y' | 'Y' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:109:12: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:110:11: ( ( 'z' | 'Z' ) )
            // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:110:12: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:8: ( AND | PAND | SAND | OR | XOR | NOT | TRUE | FALSE | NOTAND | NOTPAND | NOTSAND | NOTOR | NOTXOR | NOTNOT | INT | ID | WS | LBRACE | RBRACE )
        int alt4=19;
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
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:46: NOTAND
                {
                mNOTAND(); 

                }
                break;
            case 10 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:53: NOTPAND
                {
                mNOTPAND(); 

                }
                break;
            case 11 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:61: NOTSAND
                {
                mNOTSAND(); 

                }
                break;
            case 12 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:69: NOTOR
                {
                mNOTOR(); 

                }
                break;
            case 13 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:75: NOTXOR
                {
                mNOTXOR(); 

                }
                break;
            case 14 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:82: NOTNOT
                {
                mNOTNOT(); 

                }
                break;
            case 15 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:89: INT
                {
                mINT(); 

                }
                break;
            case 16 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:93: ID
                {
                mID(); 

                }
                break;
            case 17 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:96: WS
                {
                mWS(); 

                }
                break;
            case 18 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:99: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 19 :
                // /home/simon/99_publikationen/15_FPC/01_TFTA_Solver/tftasolver/grammars/tftac.g:1:106: RBRACE
                {
                mRBRACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\10\12\5\uffff\6\12\2\56\22\12\2\103\4\12\1\uffff\2\110"+
        "\2\12\2\113\2\114\14\12\1\uffff\2\131\2\132\1\uffff\2\12\2\uffff"+
        "\2\12\2\137\2\140\2\141\2\142\2\12\2\uffff\2\145\2\146\4\uffff\2"+
        "\147\3\uffff";
    static final String DFA4_eofS =
        "\150\uffff";
    static final String DFA4_minS =
        "\1\11\1\116\2\101\1\122\1\117\1\101\1\122\1\101\5\uffff\2\104\4"+
        "\116\2\60\2\122\1\101\1\122\1\101\1\117\1\116\1\101\1\122\1\101"+
        "\1\117\1\116\2\117\2\125\2\114\2\60\4\104\1\uffff\2\60\2\116\4\60"+
        "\2\116\2\124\2\104\2\122\2\105\2\123\1\uffff\4\60\1\uffff\2\104"+
        "\2\uffff\2\104\10\60\2\105\2\uffff\4\60\4\uffff\2\60\3\uffff";
    static final String DFA4_maxS =
        "\1\175\1\156\2\141\1\162\1\157\1\170\1\162\1\141\5\uffff\2\144\4"+
        "\156\2\172\2\162\1\141\1\164\1\141\1\157\1\156\1\141\1\164\1\141"+
        "\1\157\1\156\2\157\2\165\2\154\2\172\4\144\1\uffff\2\172\2\156\4"+
        "\172\2\156\2\164\2\144\2\162\2\145\2\163\1\uffff\4\172\1\uffff\2"+
        "\144\2\uffff\2\144\10\172\2\145\2\uffff\4\172\4\uffff\2\172\3\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\17\1\20\1\21\1\22\1\23\40\uffff\1\4\24\uffff\1\1\4\uffff"+
        "\1\5\2\uffff\1\6\1\14\14\uffff\1\2\1\3\4\uffff\1\16\1\11\1\15\1"+
        "\7\2\uffff\1\13\1\12\1\10";
    static final String DFA4_specialS =
        "\150\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\13\1\uffff\1\13\23\uffff\1\13\7\uffff\1\14\1\15\6\uffff\12"+
            "\11\7\uffff\1\1\4\12\1\10\7\12\1\6\1\4\1\2\2\12\1\3\1\7\3\12"+
            "\1\5\2\12\1\14\1\uffff\1\15\3\uffff\1\1\4\12\1\10\7\12\1\6\1"+
            "\4\1\2\2\12\1\3\1\7\3\12\1\5\2\12\1\14\1\uffff\1\15",
            "\1\17\37\uffff\1\16",
            "\1\21\37\uffff\1\20",
            "\1\23\37\uffff\1\22",
            "\1\25\37\uffff\1\24",
            "\1\27\37\uffff\1\26",
            "\1\41\14\uffff\1\40\1\36\1\37\2\uffff\1\35\4\uffff\1\43\10"+
            "\uffff\1\34\14\uffff\1\33\1\31\1\32\2\uffff\1\30\4\uffff\1\42",
            "\1\45\37\uffff\1\44",
            "\1\47\37\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "\1\51\37\uffff\1\50",
            "\1\51\37\uffff\1\50",
            "\1\53\37\uffff\1\52",
            "\1\53\37\uffff\1\52",
            "\1\55\37\uffff\1\54",
            "\1\55\37\uffff\1\54",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\60\37\uffff\1\57",
            "\1\60\37\uffff\1\57",
            "\1\62\37\uffff\1\61",
            "\1\66\1\uffff\1\64\35\uffff\1\65\1\uffff\1\63",
            "\1\70\37\uffff\1\67",
            "\1\72\37\uffff\1\71",
            "\1\74\37\uffff\1\73",
            "\1\62\37\uffff\1\61",
            "\1\66\1\uffff\1\64\35\uffff\1\65\1\uffff\1\63",
            "\1\70\37\uffff\1\67",
            "\1\72\37\uffff\1\71",
            "\1\74\37\uffff\1\73",
            "\1\76\37\uffff\1\75",
            "\1\76\37\uffff\1\75",
            "\1\100\37\uffff\1\77",
            "\1\100\37\uffff\1\77",
            "\1\102\37\uffff\1\101",
            "\1\102\37\uffff\1\101",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\105\37\uffff\1\104",
            "\1\105\37\uffff\1\104",
            "\1\107\37\uffff\1\106",
            "\1\107\37\uffff\1\106",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\112\37\uffff\1\111",
            "\1\112\37\uffff\1\111",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\116\37\uffff\1\115",
            "\1\116\37\uffff\1\115",
            "\1\120\37\uffff\1\117",
            "\1\120\37\uffff\1\117",
            "\1\122\37\uffff\1\121",
            "\1\122\37\uffff\1\121",
            "\1\124\37\uffff\1\123",
            "\1\124\37\uffff\1\123",
            "\1\126\37\uffff\1\125",
            "\1\126\37\uffff\1\125",
            "\1\130\37\uffff\1\127",
            "\1\130\37\uffff\1\127",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\1\134\37\uffff\1\133",
            "\1\134\37\uffff\1\133",
            "",
            "",
            "\1\136\37\uffff\1\135",
            "\1\136\37\uffff\1\135",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\144\37\uffff\1\143",
            "\1\144\37\uffff\1\143",
            "",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "",
            "",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "",
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
            return "1:1: Tokens : ( AND | PAND | SAND | OR | XOR | NOT | TRUE | FALSE | NOTAND | NOTPAND | NOTSAND | NOTOR | NOTXOR | NOTNOT | INT | ID | WS | LBRACE | RBRACE );";
        }
    }
 

}