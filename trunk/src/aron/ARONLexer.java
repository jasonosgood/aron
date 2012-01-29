// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g 2012-01-27 13:58:16
 
package aron;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ARONLexer extends Lexer {
    public static final int Bool=6;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int Exponent=13;
    public static final int Digit=12;
    public static final int EOF=-1;
    public static final int Identifier=4;
    public static final int Float=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int Comment=14;
    public static final int Timestamp=10;
    public static final int String=9;
    public static final int Whitespace=15;
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
    public String getGrammarFileName() { return "/Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:11:7: ( '# ARON 0.1\\n' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:11:9: '# ARON 0.1\\n'
            {
            match("# ARON 0.1\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:12:7: ( '.' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:12:9: '.'
            {
            match('.'); 

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:13:7: ( 'import' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:13:9: 'import'
            {
            match("import"); 


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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:14:7: ( '(' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:14:9: '('
            {
            match('('); 

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:15:7: ( ')' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:15:9: ')'
            {
            match(')'); 

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:16:7: ( '[' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:16:9: '['
            {
            match('['); 

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:17:7: ( ']' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:17:9: ']'
            {
            match(']'); 

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:18:7: ( '{' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:18:9: '{'
            {
            match('{'); 

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:19:7: ( '}' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:98:3: ( 'true' | 'false' )
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
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:98:5: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:99:5: 'false'
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:104:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:104:5: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:104:15: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:
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

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:104:26: ( Digit )+
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
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:104:28: Digit
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:109:3: ( '0' .. '9' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:109:5: '0' .. '9'
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:113:3: ( ( Digit )+ )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:113:5: ( Digit )+
            {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:113:5: ( Digit )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:113:7: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:3: ( ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:5: ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:5: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:7: Digit
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

                    match('.'); 
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:20: ( Digit )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:22: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:31: ( Exponent )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:117:31: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:118:5: '.' ( Digit )+ ( Exponent )?
                    {
                    match('.'); 
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:118:9: ( Digit )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:118:11: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:118:20: ( Exponent )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:118:20: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:119:5: ( Digit )+ Exponent
                    {
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:119:5: ( Digit )+
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
                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:119:7: Digit
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:123:3: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:123:5: '\\\"' ( options {greedy=false; } : . )* '\\\"'
            {
            match('\"'); 
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:123:10: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\"') ) {
                    alt12=2;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:123:38: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Timestamp"
    public final void mTimestamp() throws RecognitionException {
        try {
            int _type = Timestamp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:128:3: ( Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit 'T' Digit Digit ':' Digit Digit ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )? )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:128:5: Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit 'T' Digit Digit ':' Digit Digit ':' Digit Digit ( '+' Digit Digit ':' Digit Digit )?
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:131:5: ( '+' Digit Digit ':' Digit Digit )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='+') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:131:7: '+' Digit Digit ':' Digit Digit
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:135:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:135:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:135:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:
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
            	    break loop14;
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:139:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':' )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:139:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ':'
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:139:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:
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
            	    break loop15;
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:143:3: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:143:5: '@' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:143:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:
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
            	    break loop16;
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:147:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='/') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='/') ) {
                    alt20=1;
                }
                else if ( (LA20_1=='*') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:147:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:147:10: (~ ( '\\n' | '\\r' ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:147:10: ~ ( '\\n' | '\\r' )
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
                    	    break loop17;
                        }
                    } while (true);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:147:24: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:147:24: '\\r'
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
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:148:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:148:10: ( options {greedy=false; } : . )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='*') ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1=='/') ) {
                                alt19=2;
                            }
                            else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:148:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:153:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+ )
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:153:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:153:5: ( '\\t' | ' ' | '\\r' | '\\n' | ',' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' '||LA21_0==',') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
        // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | Bool | Integer | Float | String | Timestamp | Identifier | Label | Reference | Comment | Whitespace )
        int alt22=19;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:64: Bool
                {
                mBool(); 

                }
                break;
            case 11 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:69: Integer
                {
                mInteger(); 

                }
                break;
            case 12 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:77: Float
                {
                mFloat(); 

                }
                break;
            case 13 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:83: String
                {
                mString(); 

                }
                break;
            case 14 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:90: Timestamp
                {
                mTimestamp(); 

                }
                break;
            case 15 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:100: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 16 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:111: Label
                {
                mLabel(); 

                }
                break;
            case 17 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:117: Reference
                {
                mReference(); 

                }
                break;
            case 18 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:127: Comment
                {
                mComment(); 

                }
                break;
            case 19 :
                // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:1:135: Whitespace
                {
                mWhitespace(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "116:1: Float : ( ( Digit )+ '.' ( Digit )* ( Exponent )? | '.' ( Digit )+ ( Exponent )? | ( Digit )+ Exponent );";
        }
    }
    static final String DFA22_eotS =
        "\2\uffff\1\23\1\26\6\uffff\2\26\1\32\1\uffff\1\26\5\uffff\2\26\2"+
        "\uffff\2\26\1\uffff\1\32\3\26\1\32\1\26\1\45\1\26\1\32\1\26\1\uffff"+
        "\1\45\1\32\1\uffff\1\52\1\uffff";
    static final String DFA22_eofS =
        "\53\uffff";
    static final String DFA22_minS =
        "\1\11\1\uffff\2\60\6\uffff\2\60\1\56\1\uffff\1\60\5\uffff\2\60\2"+
        "\uffff\2\60\1\uffff\1\56\3\60\1\56\3\60\1\55\1\60\1\uffff\1\60\1"+
        "\56\1\uffff\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\175\1\uffff\1\71\1\172\6\uffff\2\172\1\145\1\uffff\1\172\5\uffff"+
        "\2\172\2\uffff\2\172\1\uffff\1\145\3\172\1\145\3\172\1\145\1\172"+
        "\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\15\1\uffff"+
        "\1\21\1\22\1\23\1\14\1\2\2\uffff\1\17\1\20\2\uffff\1\13\12\uffff"+
        "\1\12\2\uffff\1\16\1\uffff\1\3";
    static final String DFA22_specialS =
        "\53\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\15\1\1\4\uffff\1"+
            "\4\1\5\2\uffff\1\21\1\uffff\1\2\1\20\12\14\6\uffff\1\17\32\16"+
            "\1\6\1\uffff\1\7\3\uffff\5\16\1\13\2\16\1\3\12\16\1\12\6\16"+
            "\1\10\1\uffff\1\11",
            "",
            "\12\22",
            "\12\25\1\27\6\uffff\32\25\6\uffff\14\25\1\24\15\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\25\1\27\6\uffff\32\25\6\uffff\21\25\1\30\10\25",
            "\12\25\1\27\6\uffff\32\25\6\uffff\1\31\31\25",
            "\1\22\1\uffff\12\33\13\uffff\1\22\37\uffff\1\22",
            "",
            "\12\25\1\27\6\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "",
            "",
            "",
            "\12\25\1\27\6\uffff\32\25\6\uffff\17\25\1\34\12\25",
            "\12\25\1\27\6\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "\12\25\1\27\6\uffff\32\25\6\uffff\24\25\1\35\5\25",
            "\12\25\1\27\6\uffff\32\25\6\uffff\13\25\1\36\16\25",
            "",
            "\1\22\1\uffff\12\37\13\uffff\1\22\37\uffff\1\22",
            "\12\25\1\27\6\uffff\32\25\6\uffff\16\25\1\40\13\25",
            "\12\25\1\27\6\uffff\32\25\6\uffff\4\25\1\41\25\25",
            "\12\25\1\27\6\uffff\32\25\6\uffff\22\25\1\42\7\25",
            "\1\22\1\uffff\12\43\13\uffff\1\22\37\uffff\1\22",
            "\12\25\1\27\6\uffff\32\25\6\uffff\21\25\1\44\10\25",
            "\12\25\1\27\6\uffff\32\25\4\uffff\1\26\1\uffff\32\25",
            "\12\25\1\27\6\uffff\32\25\6\uffff\4\25\1\46\25\25",
            "\1\50\1\22\1\uffff\12\47\13\uffff\1\22\37\uffff\1\22",
            "\12\25\1\27\6\uffff\32\25\6\uffff\23\25\1\51\6\25",
            "",
            "\12\25\1\27\6\uffff\32\25\4\uffff\1\26\1\uffff\32\25",
            "\1\22\1\uffff\12\47\13\uffff\1\22\37\uffff\1\22",
            "",
            "\12\25\1\27\6\uffff\32\25\4\uffff\1\26\1\uffff\32\25",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | Bool | Integer | Float | String | Timestamp | Identifier | Label | Reference | Comment | Whitespace );";
        }
    }
 

}