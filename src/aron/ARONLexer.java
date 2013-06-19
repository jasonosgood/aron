// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g 2013-06-19 11:51:24
 
package aron;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ARONLexer extends Lexer {
    public static final int Bool=6;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int Exponent=13;
    public static final int Digit=12;
    public static final int EOF=-1;
    public static final int Escape=14;
    public static final int Identifier=4;
    public static final int Float=8;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int Comment=15;
    public static final int Timestamp=10;
    public static final int String=9;
    public static final int Whitespace=16;
    public static final int Label=5;
    public static final int Reference=11;
    public static final int Integer=7;

    // delegates
    // delegators

    public ARONLexer() {;} 
    public ARONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ARONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:11:7: ( '# ARON 0.1\\n' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:11:9: '# ARON 0.1\\n'
            {
            match("# ARON 0.1\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:12:7: ( '.' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:13:7: ( 'import' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:14:7: ( '(' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:15:7: ( ')' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:16:7: ( '[' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:17:7: ( ']' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:18:7: ( '{' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:19:7: ( '}' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:98:3: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:98:5: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:99:5: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:104:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:104:5: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:104:15: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:104:26: ( Digit )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:104:28: Digit
            	    {
            	    mDigit(); 

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


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:109:3: ( '0' .. '9' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:109:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:113:3: ( ( '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:113:5: ( '-' )? ( Digit )+
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:113:5: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:113:6: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:113:12: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:113:14: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Float"
    public final void mFloat() throws RecognitionException {
        try {
            int _type = Float;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:3: ( ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:5: ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:5: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:6: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:12: ( Digit )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:14: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:27: ( Digit )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:29: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:38: ( Exponent )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:117:38: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:118:5: '.' ( Digit )+ ( Exponent )?
                    {
                    match('.'); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:118:9: ( Digit )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:118:11: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:118:20: ( Exponent )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:118:20: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:119:5: ( Digit )+ Exponent
                    {
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:119:5: ( Digit )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:119:7: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    mExponent(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int i;

             final StringBuilder buf = new StringBuilder(); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:124:1: ( '\"' ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:125:5: '\"' ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:126:5: ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:127:5: Escape[buf]
            	    {
            	    mEscape(buf); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:128:7: i=~ ( '\\\\' | '\"' )
            	    {
            	    i= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     buf.appendCodePoint(i); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 
             setText(buf.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Escape"
    public final void mEscape(StringBuilder buf) throws RecognitionException {
        try {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:133:36: ( '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' ) )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:134:5: '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' )
            {
            match('\\'); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:135:5: ( 't' | 'n' | 'r' | '\"' | '\\\\' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt15=1;
                }
                break;
            case 'n':
                {
                alt15=2;
                }
                break;
            case 'r':
                {
                alt15=3;
                }
                break;
            case '\"':
                {
                alt15=4;
                }
                break;
            case '\\':
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:136:5: 't'
                    {
                    match('t'); 
                     buf.append('\t'); 

                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:7: 'n'
                    {
                    match('n'); 
                     buf.append('\n'); 

                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:138:7: 'r'
                    {
                    match('r'); 
                     buf.append('\r'); 

                    }
                    break;
                case 4 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:139:7: '\"'
                    {
                    match('\"'); 
                     buf.append('\"'); 

                    }
                    break;
                case 5 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:140:7: '\\\\'
                    {
                    match('\\'); 
                     buf.append('\\'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "Escape"

    // $ANTLR start "Timestamp"
    public final void mTimestamp() throws RecognitionException {
        try {
            int _type = Timestamp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:145:3: ( Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit 'T' Digit Digit ':' Digit Digit ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:145:5: Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit 'T' Digit Digit ':' Digit Digit ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )?
            {
            mDigit(); 
            mDigit(); 
            mDigit(); 
            mDigit(); 
            match('-'); 
            mDigit(); 
            mDigit(); 
            match('-'); 
            mDigit(); 
            mDigit(); 
            match('T'); 
            mDigit(); 
            mDigit(); 
            match(':'); 
            mDigit(); 
            mDigit(); 
            match(':'); 
            mDigit(); 
            mDigit(); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:5: ( '+' Digit Digit ':' Digit Digit )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:7: '+' Digit Digit ':' Digit Digit
                    {
                    match('+'); 
                    mDigit(); 
                    mDigit(); 
                    match(':'); 
                    mDigit(); 
                    mDigit(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timestamp"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:152:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:152:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:152:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "Label"
    public final void mLabel() throws RecognitionException {
        try {
            int _type = Label;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:156:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:156:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':'
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:156:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Label"

    // $ANTLR start "Reference"
    public final void mReference() throws RecognitionException {
        try {
            int _type = Reference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:160:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:160:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:160:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reference"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='/') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='/') ) {
                    alt23=1;
                }
                else if ( (LA23_1=='*') ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:10: (~ ( '\\n' | '\\r' ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:10: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:24: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:24: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:165:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:165:10: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='*') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='/') ) {
                                alt22=2;
                            }
                            else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:165:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match("*/"); 

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "Whitespace"
    public final void mWhitespace() throws RecognitionException {
        try {
            int _type = Whitespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:170:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:170:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:170:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' '||LA24_0==',') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)==',' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Whitespace"

    public void mTokens() throws RecognitionException {
        // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | Bool | Integer | Float | String | Timestamp | Identifier | Label | Reference | Comment | Whitespace )
        int alt25=19;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:64: Bool
                {
                mBool(); 

                }
                break;
            case 11 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:69: Integer
                {
                mInteger(); 

                }
                break;
            case 12 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:77: Float
                {
                mFloat(); 

                }
                break;
            case 13 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:83: String
                {
                mString(); 

                }
                break;
            case 14 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:90: Timestamp
                {
                mTimestamp(); 

                }
                break;
            case 15 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:100: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 16 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:111: Label
                {
                mLabel(); 

                }
                break;
            case 17 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:117: Reference
                {
                mReference(); 

                }
                break;
            case 18 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:127: Comment
                {
                mComment(); 

                }
                break;
            case 19 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:135: Whitespace
                {
                mWhitespace(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\1\55\1\uffff\1\56\2\uffff";
    static final String DFA13_maxS =
        "\1\71\1\uffff\1\145\2\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "",
            "\1\1\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "116:1: Float : ( ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent );";
        }
    }
    static final String DFA25_eotS =
        "\2\uffff\1\23\1\27\6\uffff\2\27\1\uffff\1\34\1\uffff\1\27\5\uffff"+
        "\2\27\2\uffff\2\27\1\34\1\uffff\1\34\3\27\1\34\1\27\1\47\1\27\1"+
        "\34\1\27\1\uffff\1\47\1\34\1\uffff\1\54\1\uffff";
    static final String DFA25_eofS =
        "\55\uffff";
    static final String DFA25_minS =
        "\1\11\1\uffff\2\60\6\uffff\3\60\1\56\1\uffff\1\60\5\uffff\2\60\2"+
        "\uffff\2\60\1\56\1\uffff\1\56\3\60\1\56\3\60\1\55\1\60\1\uffff\1"+
        "\60\1\56\1\uffff\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\175\1\uffff\1\71\1\172\6\uffff\2\172\1\71\1\145\1\uffff\1\172"+
        "\5\uffff\2\172\2\uffff\2\172\1\71\1\uffff\1\145\3\172\1\145\3\172"+
        "\1\145\1\172\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\4\uffff\1\15\1\uffff"+
        "\1\21\1\22\1\23\1\2\1\14\2\uffff\1\17\1\20\3\uffff\1\13\12\uffff"+
        "\1\12\2\uffff\1\16\1\uffff\1\3";
    static final String DFA25_specialS =
        "\55\uffff}>";
    static final String[] DFA25_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\1\uffff\1\16\1\1\4\uffff\1"+
            "\4\1\5\2\uffff\1\22\1\14\1\2\1\21\12\15\6\uffff\1\20\32\17\1"+
            "\6\1\uffff\1\7\3\uffff\5\17\1\13\2\17\1\3\12\17\1\12\6\17\1"+
            "\10\1\uffff\1\11",
            "",
            "\12\24",
            "\12\26\1\30\6\uffff\32\26\6\uffff\14\26\1\25\15\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\1\30\6\uffff\32\26\6\uffff\21\26\1\31\10\26",
            "\12\26\1\30\6\uffff\32\26\6\uffff\1\32\31\26",
            "\12\33",
            "\1\24\1\uffff\12\35\13\uffff\1\24\37\uffff\1\24",
            "",
            "\12\26\1\30\6\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "",
            "",
            "\12\26\1\30\6\uffff\32\26\6\uffff\17\26\1\36\12\26",
            "\12\26\1\30\6\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "\12\26\1\30\6\uffff\32\26\6\uffff\24\26\1\37\5\26",
            "\12\26\1\30\6\uffff\32\26\6\uffff\13\26\1\40\16\26",
            "\1\24\1\uffff\12\33",
            "",
            "\1\24\1\uffff\12\41\13\uffff\1\24\37\uffff\1\24",
            "\12\26\1\30\6\uffff\32\26\6\uffff\16\26\1\42\13\26",
            "\12\26\1\30\6\uffff\32\26\6\uffff\4\26\1\43\25\26",
            "\12\26\1\30\6\uffff\32\26\6\uffff\22\26\1\44\7\26",
            "\1\24\1\uffff\12\45\13\uffff\1\24\37\uffff\1\24",
            "\12\26\1\30\6\uffff\32\26\6\uffff\21\26\1\46\10\26",
            "\12\26\1\30\6\uffff\32\26\4\uffff\1\27\1\uffff\32\26",
            "\12\26\1\30\6\uffff\32\26\6\uffff\4\26\1\50\25\26",
            "\1\52\1\24\1\uffff\12\51\13\uffff\1\24\37\uffff\1\24",
            "\12\26\1\30\6\uffff\32\26\6\uffff\23\26\1\53\6\26",
            "",
            "\12\26\1\30\6\uffff\32\26\4\uffff\1\27\1\uffff\32\26",
            "\1\24\1\uffff\12\51\13\uffff\1\24\37\uffff\1\24",
            "",
            "\12\26\1\30\6\uffff\32\26\4\uffff\1\27\1\uffff\32\26",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | Bool | Integer | Float | String | Timestamp | Identifier | Label | Reference | Comment | Whitespace );";
        }
    }
 

}