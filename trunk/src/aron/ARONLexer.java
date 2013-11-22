// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g 2013-11-19 05:11:28
 
package aron;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ARONLexer extends Lexer {
    public static final int T__28=28;
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
    public static final int Boolean=7;
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:17:7: ( 'null' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:17:9: 'null'
            {
            match("null"); 


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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:18:7: ( '[' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:18:9: '['
            {
            match('['); 

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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:19:7: ( ']' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:19:9: ']'
            {
            match(']'); 

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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:20:7: ( '{' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:21:7: ( '}' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:129:3: ( 'true' | 'false' )
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:129:5: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:130:5: 'false'
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
    // $ANTLR end "Boolean"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:135:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:135:5: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:135:15: ( '+' | '-' )?
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

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:135:26: ( Digit )+
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
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:135:28: Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:140:3: ( '0' .. '9' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:140:5: '0' .. '9'
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:144:3: ( ( '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:144:5: ( '-' )? ( Digit )+
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:144:5: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:144:6: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:144:12: ( Digit )+
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
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:144:14: Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:3: ( ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:5: ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:5: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:6: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:12: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:14: Digit
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:27: ( Digit )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:29: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:38: ( Exponent )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:148:38: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:149:5: '.' ( Digit )+ ( Exponent )?
                    {
                    match('.'); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:149:9: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:149:11: Digit
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

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:149:20: ( Exponent )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:149:20: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:150:5: ( Digit )+ Exponent
                    {
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:150:5: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:150:7: Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:155:3: ( '\"' ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:156:3: '\"' ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:157:3: ( Escape[buf] | i=~ ( '\\\\' | '\"' ) )*
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
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:158:5: Escape[buf]
            	    {
            	    mEscape(buf); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:159:7: i=~ ( '\\\\' | '\"' )
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:166:3: ( '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' ) )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:167:3: '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' )
            {
            match('\\'); 
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:168:3: ( 't' | 'n' | 'r' | '\"' | '\\\\' )
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
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:169:5: 't'
                    {
                    match('t'); 
                     buf.append('\t'); 

                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:170:7: 'n'
                    {
                    match('n'); 
                     buf.append('\n'); 

                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:171:7: 'r'
                    {
                    match('r'); 
                     buf.append('\r'); 

                    }
                    break;
                case 4 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:172:7: '\"'
                    {
                    match('\"'); 
                     buf.append('\"'); 

                    }
                    break;
                case 5 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:173:7: '\\\\'
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:180:3: ( Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )? )? )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:180:5: Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )? )?
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:181:5: ( 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='T') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:182:6: 'T' Digit Digit ':' Digit Digit ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )?
                    {
                    match('T'); 
                    mDigit(); 
                    mDigit(); 
                    match(':'); 
                    mDigit(); 
                    mDigit(); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:184:6: ( ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==':') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:185:7: ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )?
                            {
                            match(':'); 
                            mDigit(); 
                            mDigit(); 
                            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:186:7: ( '+' Digit Digit ':' Digit Digit )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='+') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:186:9: '+' Digit Digit ':' Digit Digit
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:192:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:192:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:192:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:196:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':' )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:196:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':'
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:196:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:200:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:204:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )* )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:204:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )*
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:204:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )*
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:208:3: ( '#' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='#') ) {
                alt25=1;
            }
            else if ( (LA25_0=='/') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:208:5: '#' (~ ( '\\n' | '\\r' ) )*
                    {
                    match('#'); 
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:208:9: (~ ( '\\n' | '\\r' ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:208:9: ~ ( '\\n' | '\\r' )
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

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:209:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:209:10: ( options {greedy=false; } : . )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='*') ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1=='/') ) {
                                alt24=2;
                            }
                            else if ( ((LA24_1>='\u0000' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='\uFFFF')) ) {
                                alt24=1;
                            }


                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<=')')||(LA24_0>='+' && LA24_0<='\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:209:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
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
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:214:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+ )
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:214:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            {
            // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:214:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' '||LA26_0==',') ) {
                    alt26=1;
                }


                switch (alt26) {
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
        // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | Boolean | Integer | Float | String | Timestamp | Identifier | Label | Reference | Url | Comment | Whitespace )
        int alt27=22;
        alt27 = dfa27.predict(input);
        switch (alt27) {
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
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:76: Boolean
                {
                mBoolean(); 

                }
                break;
            case 13 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:84: Integer
                {
                mInteger(); 

                }
                break;
            case 14 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:92: Float
                {
                mFloat(); 

                }
                break;
            case 15 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:98: String
                {
                mString(); 

                }
                break;
            case 16 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:105: Timestamp
                {
                mTimestamp(); 

                }
                break;
            case 17 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:115: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 18 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:126: Label
                {
                mLabel(); 

                }
                break;
            case 19 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:132: Reference
                {
                mReference(); 

                }
                break;
            case 20 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:142: Url
                {
                mUrl(); 

                }
                break;
            case 21 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:146: Comment
                {
                mComment(); 

                }
                break;
            case 22 :
                // /Users/jasonosgood/Projects/workspace/aron/src/aron/ARON.g:1:154: Whitespace
                {
                mWhitespace(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA27 dfa27 = new DFA27(this);
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
            return "147:1: Float : ( ( '-' )? ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent );";
        }
    }
    static final String DFA27_eotS =
        "\1\23\1\26\1\33\1\34\2\uffff\1\33\4\uffff\2\33\1\uffff\1\42\1\uffff"+
        "\1\33\1\uffff\1\23\2\uffff\1\26\1\uffff\3\33\3\uffff\1\51\3\33\1"+
        "\42\1\uffff\1\51\1\42\1\23\1\26\2\33\1\uffff\1\23\3\33\1\51\1\23"+
        "\1\42\1\51\1\26\2\33\1\51\1\76\1\77\1\33\1\51\1\42\1\26\2\33\2\uffff"+
        "\1\77\1\42\1\uffff\1\26\1\107\1\33\1\26\1\uffff\1\112\1\26\1\uffff"+
        "\2\26\1\uffff";
    static final String DFA27_eofS =
        "\116\uffff";
    static final String DFA27_minS =
        "\1\11\1\40\2\56\2\uffff\1\56\4\uffff\2\56\1\60\1\56\1\uffff\1\56"+
        "\1\uffff\1\52\2\uffff\1\101\1\uffff\3\56\3\uffff\5\56\1\uffff\2"+
        "\56\1\53\1\122\2\56\1\uffff\1\53\4\56\1\53\2\56\1\117\7\56\1\55"+
        "\1\116\2\56\2\uffff\2\56\1\uffff\1\40\2\56\1\60\1\uffff\2\56\1\uffff"+
        "\1\61\1\12\1\uffff";
    static final String DFA27_maxS =
        "\1\175\1\40\2\172\2\uffff\1\172\4\uffff\2\172\1\71\1\172\1\uffff"+
        "\1\172\1\uffff\1\52\2\uffff\1\101\1\uffff\3\172\3\uffff\4\172\1"+
        "\71\1\uffff\2\172\1\71\1\122\2\172\1\uffff\1\71\4\172\1\71\2\172"+
        "\1\117\10\172\1\116\2\172\2\uffff\2\172\1\uffff\1\40\2\172\1\60"+
        "\1\uffff\1\172\1\56\1\uffff\1\61\1\12\1\uffff";
    static final String DFA27_acceptS =
        "\4\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\4\uffff\1\17\1\uffff"+
        "\1\23\1\uffff\1\24\1\26\1\uffff\1\25\3\uffff\1\22\1\21\1\3\5\uffff"+
        "\1\15\6\uffff\1\16\24\uffff\1\7\1\14\2\uffff\1\20\4\uffff\1\2\2"+
        "\uffff\1\4\2\uffff\1\1";
    static final String DFA27_specialS =
        "\116\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\1\uffff\1\17\1\1\4\uffff\1"+
            "\4\1\5\2\uffff\1\24\1\15\1\3\1\22\12\16\6\uffff\1\21\32\20\1"+
            "\7\1\uffff\1\10\3\uffff\5\20\1\14\2\20\1\2\4\20\1\6\5\20\1\13"+
            "\6\20\1\11\1\uffff\1\12",
            "\1\25",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\14\31\1\27\1\30\14\31",
            "\2\23\12\35\7\uffff\32\23\6\uffff\32\23",
            "",
            "",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\24\31\1\36\5\31",
            "",
            "",
            "",
            "",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\21\31\1\37\10\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\1\40\31\31",
            "\12\41",
            "\1\43\1\23\12\44\7\uffff\4\23\1\45\25\23\6\uffff\4\23\1\45"+
            "\25\23",
            "",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\32\31",
            "",
            "\1\26",
            "",
            "",
            "\1\46",
            "",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\17\31\1\47\12\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\2\31\1\50\27\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\32\31",
            "",
            "",
            "",
            "\2\23\12\35\7\uffff\4\23\1\52\25\23\6\uffff\4\23\1\52\25\23",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\13\31\1\53\16\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\24\31\1\54\5\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\13\31\1\55\16\31",
            "\1\51\1\uffff\12\41",
            "",
            "\2\23\12\56\7\uffff\4\23\1\57\25\23\6\uffff\4\23\1\57\25\23",
            "\1\43\1\23\12\60\7\uffff\4\23\1\45\25\23\6\uffff\4\23\1\45"+
            "\25\23",
            "\1\51\1\uffff\1\51\2\uffff\12\61",
            "\1\62",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\16\31\1\63\13\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\13\31\1\64\16\31",
            "",
            "\1\51\1\uffff\1\51\2\uffff\12\65",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\13\31\1\66\16\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\4\31\1\67\25\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\22\31\1\70\7\31",
            "\2\23\12\56\7\uffff\4\23\1\57\25\23\6\uffff\4\23\1\57\25\23",
            "\1\51\1\uffff\1\51\2\uffff\12\71",
            "\1\43\1\23\12\72\7\uffff\4\23\1\45\25\23\6\uffff\4\23\1\45"+
            "\25\23",
            "\2\23\12\61\7\uffff\32\23\6\uffff\32\23",
            "\1\73",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\21\31\1\74\10\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\24\31\1\75\5\31",
            "\2\23\12\65\7\uffff\32\23\6\uffff\32\23",
            "\2\23\12\31\1\32\6\uffff\32\31\4\uffff\1\33\1\uffff\32\31",
            "\2\23\12\31\1\32\6\uffff\32\31\4\uffff\1\33\1\uffff\32\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\4\31\1\100\25\31",
            "\2\23\12\71\7\uffff\32\23\6\uffff\32\23",
            "\1\102\1\43\1\23\12\101\7\uffff\4\23\1\45\25\23\6\uffff\4\23"+
            "\1\45\25\23",
            "\1\103",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\23\31\1\104\6\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\3\31\1\105\26\31",
            "",
            "",
            "\2\23\12\31\1\32\6\uffff\32\31\4\uffff\1\33\1\uffff\32\31",
            "\1\43\1\23\12\101\7\uffff\4\23\1\45\25\23\6\uffff\4\23\1\45"+
            "\25\23",
            "",
            "\1\106",
            "\2\23\12\31\1\32\6\uffff\32\31\4\uffff\1\33\1\uffff\32\31",
            "\2\23\12\31\1\32\6\uffff\32\31\6\uffff\4\31\1\110\25\31",
            "\1\111",
            "",
            "\2\23\12\31\1\32\6\uffff\32\31\4\uffff\1\33\1\uffff\32\31",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | Boolean | Integer | Float | String | Timestamp | Identifier | Label | Reference | Url | Comment | Whitespace );";
        }
    }
 

}