// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g 2013-11-10 15:26:05
 
package aron;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ARONLexer extends Lexer {
    public static final int Bool=7;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int Exponent=14;
    public static final int Url=5;
    public static final int Digit=13;
    public static final int EOF=-1;
    public static final int Escape=15;
    public static final int Identifier=4;
    public static final int Float=9;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int Comment=16;
    public static final int Timestamp=11;
    public static final int String=10;
    public static final int Whitespace=17;
    public static final int Label=6;
    public static final int Reference=12;
    public static final int Integer=8;

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

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:12:7: ( 'import' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:12:9: 'import'
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:13:7: ( '.' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:13:9: '.'
            {
            match('.'); 

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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:14:7: ( 'include' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:14:9: 'include'
            {
            match("include"); 


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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:15:7: ( '(' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:15:9: '('
            {
            match('('); 

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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:16:7: ( ')' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:16:9: ')'
            {
            match(')'); 

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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:17:7: ( '[' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:17:9: '['
            {
            match('['); 

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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:18:7: ( ']' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:19:7: ( '{' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:19:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:20:7: ( '}' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:122:3: ( 'true' | 'false' )
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:122:5: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:123:5: 'false'
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:128:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:128:5: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:128:15: ( '+' | '-' )?
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

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:128:26: ( Digit )+
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
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:128:28: Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:133:3: ( '0' .. '9' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:133:5: '0' .. '9'
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:3: ( ( '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:5: ( '-' )? ( Digit )+
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:5: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:6: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:12: ( Digit )+
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
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:137:14: Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:3: ( ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:5: ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:5: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:6: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:12: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:14: Digit
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:27: ( Digit )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:29: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:38: ( Exponent )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:141:38: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:142:5: '.' ( Digit )+ ( Exponent )?
                    {
                    match('.'); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:142:9: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:142:11: Digit
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

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:142:20: ( Exponent )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:142:20: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:143:5: ( Digit )+ Exponent
                    {
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:143:5: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:143:7: Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:3: ( '\"' ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:149:3: '\"' ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:150:3: ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )*
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
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:151:5: Escape[buf]
            	    {
            	    mEscape(buf); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:152:7: i=~ ( '\\\\' | '\"' )
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:159:3: ( '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' ) )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:160:3: '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' )
            {
            match('\\'); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:161:3: ( 't' | 'n' | 'r' | '\"' | '\\\\' )
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:162:5: 't'
                    {
                    match('t'); 
                     buf.append('\t'); 

                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:163:7: 'n'
                    {
                    match('n'); 
                     buf.append('\n'); 

                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:164:7: 'r'
                    {
                    match('r'); 
                     buf.append('\r'); 

                    }
                    break;
                case 4 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:165:7: '\"'
                    {
                    match('\"'); 
                     buf.append('\"'); 

                    }
                    break;
                case 5 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:166:7: '\\\\'
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:172:3: ( Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )? )? )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:172:5: Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )? )?
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:173:5: ( 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='T') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:174:6: 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )?
                    {
                    match('T'); 
                    mDigit(); 
                    mDigit(); 
                    match(':'); 
                    mDigit(); 
                    mDigit(); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:176:6: ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==':') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:177:7: ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )?
                            {
                            match(':'); 
                            mDigit(); 
                            mDigit(); 
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:178:7: ( '+' Digit Digit ':' Digit Digit )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='+') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:178:9: '+' Digit Digit ':' Digit Digit
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
                            break;

                    }


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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:184:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:184:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:184:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
    // $ANTLR end "Identifier"

    // $ANTLR start "Label"
    public final void mLabel() throws RecognitionException {
        try {
            int _type = Label;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:188:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:188:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':'
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:188:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    break loop20;
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:192:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:192:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:192:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    break loop21;
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

    // $ANTLR start "Url"
    public final void mUrl() throws RecognitionException {
        try {
            int _type = Url;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:196:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:196:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )*
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:196:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='.' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:
            	    {
            	    if ( (input.LA(1)>='.' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:3: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='#') ) {
                alt26=1;
            }
            else if ( (LA26_0=='/') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:5: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('#'); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:9: (~ ( '\\n' | '\\r' ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:9: ~ ( '\\n' | '\\r' )
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
                    	    break loop23;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:23: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:23: '\\r'
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:201:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:201:10: ( options {greedy=false; } : . )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='*') ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1=='/') ) {
                                alt25=2;
                            }
                            else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                                alt25=1;
                            }


                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:201:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:206:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:206:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:206:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' '||LA27_0==',') ) {
                    alt27=1;
                }


                switch (alt27) {
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
        // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | Bool | Integer | Float | String | Timestamp | Identifier | Label | Reference | Url | Comment | Whitespace )
        int alt28=21;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:70: Bool
                {
                mBool(); 

                }
                break;
            case 12 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:75: Integer
                {
                mInteger(); 

                }
                break;
            case 13 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:83: Float
                {
                mFloat(); 

                }
                break;
            case 14 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:89: String
                {
                mString(); 

                }
                break;
            case 15 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:96: Timestamp
                {
                mTimestamp(); 

                }
                break;
            case 16 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:106: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 17 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:117: Label
                {
                mLabel(); 

                }
                break;
            case 18 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:123: Reference
                {
                mReference(); 

                }
                break;
            case 19 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:133: Url
                {
                mUrl(); 

                }
                break;
            case 20 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:137: Comment
                {
                mComment(); 

                }
                break;
            case 21 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:145: Whitespace
                {
                mWhitespace(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA28 dfa28 = new DFA28(this);
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
            return "140:1: Float : ( ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent );";
        }
    }
    static final String DFA28_eotS =
        "\1\22\1\uffff\1\30\1\33\6\uffff\2\30\1\uffff\1\40\1\uffff\1\30\1"+
        "\uffff\1\22\4\uffff\2\30\1\uffff\1\30\2\uffff\1\47\2\30\1\40\1\uffff"+
        "\1\40\1\22\1\47\1\uffff\2\30\1\uffff\1\22\2\30\1\40\2\47\1\22\1"+
        "\uffff\2\30\1\47\1\72\1\30\1\40\1\47\1\uffff\2\30\1\uffff\1\72\1"+
        "\40\2\uffff\1\102\1\30\2\uffff\1\105\6\uffff";
    static final String DFA28_eofS =
        "\112\uffff";
    static final String DFA28_minS =
        "\1\11\1\0\2\56\6\uffff\2\56\1\60\1\56\1\uffff\1\56\1\uffff\1\52"+
        "\2\uffff\1\0\1\uffff\2\56\1\uffff\1\56\2\uffff\4\56\1\uffff\1\56"+
        "\1\53\1\56\1\0\2\56\1\uffff\1\53\5\56\1\53\1\0\5\56\1\55\1\56\1"+
        "\0\2\56\1\uffff\2\56\1\uffff\1\0\2\56\1\0\1\uffff\1\56\1\0\1\uffff"+
        "\2\0\2\uffff";
    static final String DFA28_maxS =
        "\1\175\1\uffff\2\172\6\uffff\2\172\1\71\1\172\1\uffff\1\172\1\uffff"+
        "\1\52\2\uffff\1\uffff\1\uffff\2\172\1\uffff\1\172\2\uffff\3\172"+
        "\1\71\1\uffff\1\172\1\71\1\172\1\uffff\2\172\1\uffff\1\71\5\172"+
        "\1\71\1\uffff\7\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\uffff"+
        "\2\172\1\uffff\1\uffff\1\172\1\uffff\1\uffff\2\uffff\2\uffff";
    static final String DFA28_acceptS =
        "\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff\1\16\1\uffff\1\22\1"+
        "\uffff\1\23\1\25\1\uffff\1\24\2\uffff\1\20\1\uffff\1\21\1\3\4\uffff"+
        "\1\14\6\uffff\1\15\22\uffff\1\13\2\uffff\1\17\4\uffff\1\2\2\uffff"+
        "\1\4\2\uffff\2\1";
    static final String DFA28_specialS =
        "\1\uffff\1\3\22\uffff\1\10\17\uffff\1\11\12\uffff\1\5\7\uffff\1"+
        "\4\6\uffff\1\7\2\uffff\1\6\2\uffff\1\1\1\uffff\1\0\1\2\2\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\uffff\1\16\1\1\4\uffff\1"+
            "\4\1\5\2\uffff\1\23\1\14\1\3\1\21\12\15\6\uffff\1\20\32\17\1"+
            "\6\1\uffff\1\7\3\uffff\5\17\1\13\2\17\1\2\12\17\1\12\6\17\1"+
            "\10\1\uffff\1\11",
            "\40\25\1\24\uffdf\25",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\14\31\1\26\1\27\14\31",
            "\2\22\12\34\7\uffff\32\22\6\uffff\32\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\21\31\1\35\10\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\1\36\31\31",
            "\12\37",
            "\1\43\1\22\12\41\7\uffff\4\22\1\42\25\22\6\uffff\4\22\1\42"+
            "\25\22",
            "",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\32\31",
            "",
            "\1\25",
            "",
            "",
            "\101\25\1\44\uffbe\25",
            "",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\17\31\1\45\12\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\2\31\1\46\27\31",
            "",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\32\31",
            "",
            "",
            "\2\22\12\34\7\uffff\4\22\1\50\25\22\6\uffff\4\22\1\50\25\22",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\24\31\1\51\5\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\13\31\1\52\16\31",
            "\1\47\1\uffff\12\37",
            "",
            "\1\43\1\22\12\53\7\uffff\4\22\1\42\25\22\6\uffff\4\22\1\42"+
            "\25\22",
            "\1\47\1\uffff\1\47\2\uffff\12\54",
            "\2\22\12\55\7\uffff\4\22\1\56\25\22\6\uffff\4\22\1\56\25\22",
            "\122\25\1\57\uffad\25",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\16\31\1\60\13\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\13\31\1\61\16\31",
            "",
            "\1\47\1\uffff\1\47\2\uffff\12\62",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\4\31\1\63\25\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\22\31\1\64\7\31",
            "\1\43\1\22\12\65\7\uffff\4\22\1\42\25\22\6\uffff\4\22\1\42"+
            "\25\22",
            "\2\22\12\54\7\uffff\32\22\6\uffff\32\22",
            "\2\22\12\55\7\uffff\4\22\1\56\25\22\6\uffff\4\22\1\56\25\22",
            "\1\47\1\uffff\1\47\2\uffff\12\66",
            "\117\25\1\67\uffb0\25",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\21\31\1\70\10\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\24\31\1\71\5\31",
            "\2\22\12\62\7\uffff\32\22\6\uffff\32\22",
            "\2\22\12\31\1\32\6\uffff\32\31\4\uffff\1\30\1\uffff\32\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\4\31\1\73\25\31",
            "\1\75\1\43\1\22\12\74\7\uffff\4\22\1\42\25\22\6\uffff\4\22"+
            "\1\42\25\22",
            "\2\22\12\66\7\uffff\32\22\6\uffff\32\22",
            "\116\25\1\76\uffb1\25",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\23\31\1\77\6\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\3\31\1\100\26\31",
            "",
            "\2\22\12\31\1\32\6\uffff\32\31\4\uffff\1\30\1\uffff\32\31",
            "\1\43\1\22\12\74\7\uffff\4\22\1\42\25\22\6\uffff\4\22\1\42"+
            "\25\22",
            "",
            "\40\25\1\101\uffdf\25",
            "\2\22\12\31\1\32\6\uffff\32\31\4\uffff\1\30\1\uffff\32\31",
            "\2\22\12\31\1\32\6\uffff\32\31\6\uffff\4\31\1\103\25\31",
            "\60\25\1\104\uffcf\25",
            "",
            "\2\22\12\31\1\32\6\uffff\32\31\4\uffff\1\30\1\uffff\32\31",
            "\56\25\1\106\uffd1\25",
            "",
            "\61\25\1\107\uffce\25",
            "\12\25\1\110\ufff5\25",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | Bool | Integer | Float | String | Timestamp | Identifier | Label | Reference | Url | Comment | Whitespace );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_70 = input.LA(1);

                        s = -1;
                        if ( (LA28_70=='1') ) {s = 71;}

                        else if ( ((LA28_70>='\u0000' && LA28_70<='0')||(LA28_70>='2' && LA28_70<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_68 = input.LA(1);

                        s = -1;
                        if ( (LA28_68=='.') ) {s = 70;}

                        else if ( ((LA28_68>='\u0000' && LA28_68<='-')||(LA28_68>='/' && LA28_68<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_71 = input.LA(1);

                        s = -1;
                        if ( (LA28_71=='\n') ) {s = 72;}

                        else if ( ((LA28_71>='\u0000' && LA28_71<='\t')||(LA28_71>='\u000B' && LA28_71<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_1 = input.LA(1);

                        s = -1;
                        if ( (LA28_1==' ') ) {s = 20;}

                        else if ( ((LA28_1>='\u0000' && LA28_1<='\u001F')||(LA28_1>='!' && LA28_1<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_55 = input.LA(1);

                        s = -1;
                        if ( (LA28_55=='N') ) {s = 62;}

                        else if ( ((LA28_55>='\u0000' && LA28_55<='M')||(LA28_55>='O' && LA28_55<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_47 = input.LA(1);

                        s = -1;
                        if ( (LA28_47=='O') ) {s = 55;}

                        else if ( ((LA28_47>='\u0000' && LA28_47<='N')||(LA28_47>='P' && LA28_47<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_65 = input.LA(1);

                        s = -1;
                        if ( (LA28_65=='0') ) {s = 68;}

                        else if ( ((LA28_65>='\u0000' && LA28_65<='/')||(LA28_65>='1' && LA28_65<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_62 = input.LA(1);

                        s = -1;
                        if ( (LA28_62==' ') ) {s = 65;}

                        else if ( ((LA28_62>='\u0000' && LA28_62<='\u001F')||(LA28_62>='!' && LA28_62<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_20 = input.LA(1);

                        s = -1;
                        if ( (LA28_20=='A') ) {s = 36;}

                        else if ( ((LA28_20>='\u0000' && LA28_20<='@')||(LA28_20>='B' && LA28_20<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( (LA28_36=='R') ) {s = 47;}

                        else if ( ((LA28_36>='\u0000' && LA28_36<='Q')||(LA28_36>='S' && LA28_36<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}