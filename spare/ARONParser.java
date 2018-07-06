// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jasonosgood/Projects/aron/src/aron/ARON.g 2014-07-20 13:05:15
 
package aron;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;
public class ARONParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Identifier", "Url", "Label", "Boolean", "Integer", "Float", "String", "Timestamp", "Reference", "Digit", "Exponent", "Escape", "Comment", "Whitespace", "'# ARON 0.1\\n'", "'import'", "'.'", "'include'", "'('", "')'", "'null'", "'['", "']'", "'{'", "'}'"
    };
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
    public static final int Reference=12;
    public static final int Label=6;
    public static final int Integer=8;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "map", "synpred21_ARON", "synpred31_ARON", "synpred22_ARON", 
        "synpred27_ARON", "synpred17_ARON", "synpred2_ARON", "path", "childList", 
        "stringList", "url", "synpred15_ARON", "value", "method", "synpred14_ARON", 
        "synpred16_ARON", "synpred23_ARON", "synpred5_ARON", "klass", "child", 
        "floatList", "synpred34_ARON", "synpred25_ARON", "key", "synpred24_ARON", 
        "synpred29_ARON", "scalar", "synpred30_ARON", "pair", "synpred19_ARON", 
        "timestampList", "emptyList", "synpred1_ARON", "synpred9_ARON", 
        "imports", "synpred13_ARON", "includes", "synpred33_ARON", "synpred18_ARON", 
        "synpred26_ARON", "synpred3_ARON", "synpred10_ARON", "booleanList", 
        "synpred8_ARON", "synpred20_ARON", "root", "synpred11_ARON", "synpred28_ARON", 
        "override", "synpred6_ARON", "property", "synpred12_ARON", "list", 
        "synpred32_ARON", "integerList", "synpred4_ARON", "synpred7_ARON"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public ARONParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public ARONParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public ARONParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return ARONParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jasonosgood/Projects/aron/src/aron/ARON.g"; }





    // $ANTLR start "root"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:38:1: root : '# ARON 0.1\\n' ( includes )* ( imports )* ( child )* ( override )* ;
    public final void root() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "root");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:39:3: ( '# ARON 0.1\\n' ( includes )* ( imports )* ( child )* ( override )* )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:39:5: '# ARON 0.1\\n' ( includes )* ( imports )* ( child )* ( override )*
            {
            dbg.location(39,5);
            match(input,18,FOLLOW_18_in_root69); if (state.failed) return ;
            dbg.location(40,3);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:40:3: ( includes )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:40:5: includes
            	    {
            	    dbg.location(40,5);
            	    pushFollow(FOLLOW_includes_in_root76);
            	    includes();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(41,3);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:41:3: ( imports )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:41:5: imports
            	    {
            	    dbg.location(41,5);
            	    pushFollow(FOLLOW_imports_in_root85);
            	    imports();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(42,3);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:42:3: ( child )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==Identifier||LA3_0==Label) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:42:5: child
            	    {
            	    dbg.location(42,5);
            	    pushFollow(FOLLOW_child_in_root94);
            	    child();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(43,3);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:43:3: ( override )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==Reference) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:43:5: override
            	    {
            	    dbg.location(43,5);
            	    pushFollow(FOLLOW_override_in_root103);
            	    override();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(44, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "root");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "root"


    // $ANTLR start "imports"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:46:1: imports : 'import' klass ;
    public final void imports() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "imports");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:47:3: ( 'import' klass )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:47:5: 'import' klass
            {
            dbg.location(47,5);
            match(input,19,FOLLOW_19_in_imports119); if (state.failed) return ;
            dbg.location(47,14);
            pushFollow(FOLLOW_klass_in_imports121);
            klass();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(48, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "imports");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "imports"


    // $ANTLR start "klass"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:51:1: klass : Identifier ( '.' Identifier )* ;
    public final void klass() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "klass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:52:3: ( Identifier ( '.' Identifier )* )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:52:5: Identifier ( '.' Identifier )*
            {
            dbg.location(52,5);
            match(input,Identifier,FOLLOW_Identifier_in_klass136); if (state.failed) return ;
            dbg.location(52,16);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:52:16: ( '.' Identifier )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:52:18: '.' Identifier
            	    {
            	    dbg.location(52,18);
            	    match(input,20,FOLLOW_20_in_klass140); if (state.failed) return ;
            	    dbg.location(52,22);
            	    match(input,Identifier,FOLLOW_Identifier_in_klass142); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(53, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "klass");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "klass"


    // $ANTLR start "includes"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:55:1: includes : 'include' url ;
    public final void includes() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "includes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:56:3: ( 'include' url )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:56:5: 'include' url
            {
            dbg.location(56,5);
            match(input,21,FOLLOW_21_in_includes160); if (state.failed) return ;
            dbg.location(56,15);
            pushFollow(FOLLOW_url_in_includes162);
            url();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(57, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "includes");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "includes"


    // $ANTLR start "url"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:60:1: url : Url ;
    public final void url() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "url");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:61:3: ( Url )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:61:5: Url
            {
            dbg.location(61,5);
            match(input,Url,FOLLOW_Url_in_url177); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(62, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "url");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "url"


    // $ANTLR start "child"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:64:1: child : ( Label )? Identifier ( '(' ( property )* ')' )? ;
    public final void child() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "child");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:3: ( ( Label )? Identifier ( '(' ( property )* ')' )? )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:5: ( Label )? Identifier ( '(' ( property )* ')' )?
            {
            dbg.location(65,5);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:5: ( Label )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==Label) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:7: Label
                    {
                    dbg.location(65,7);
                    match(input,Label,FOLLOW_Label_in_child194); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(65,16);
            match(input,Identifier,FOLLOW_Identifier_in_child199); if (state.failed) return ;
            dbg.location(65,27);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:27: ( '(' ( property )* ')' )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:29: '(' ( property )* ')'
                    {
                    dbg.location(65,29);
                    match(input,22,FOLLOW_22_in_child203); if (state.failed) return ;
                    dbg.location(65,33);
                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:33: ( property )*
                    try { dbg.enterSubRule(7);

                    loop7:
                    do {
                        int alt7=2;
                        try { dbg.enterDecision(7);

                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:65:35: property
                    	    {
                    	    dbg.location(65,35);
                    	    pushFollow(FOLLOW_property_in_child207);
                    	    property();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(65,47);
                    match(input,23,FOLLOW_23_in_child212); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(66, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "child");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "child"


    // $ANTLR start "property"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:68:1: property : Identifier value ;
    public final void property() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "property");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:69:3: ( Identifier value )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:69:5: Identifier value
            {
            dbg.location(69,5);
            match(input,Identifier,FOLLOW_Identifier_in_property228); if (state.failed) return ;
            dbg.location(69,16);
            pushFollow(FOLLOW_value_in_property230);
            value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(70, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "property");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "value"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:72:1: value : ( scalar | child | list | map );
    public final void value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:73:3: ( scalar | child | list | map )
            int alt9=4;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case Boolean:
            case Integer:
            case Float:
            case String:
            case Timestamp:
            case Reference:
            case 24:
                {
                alt9=1;
                }
                break;
            case Identifier:
            case Label:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:73:5: scalar
                    {
                    dbg.location(73,5);
                    pushFollow(FOLLOW_scalar_in_value245);
                    scalar();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:74:5: child
                    {
                    dbg.location(74,5);
                    pushFollow(FOLLOW_child_in_value251);
                    child();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:75:5: list
                    {
                    dbg.location(75,5);
                    pushFollow(FOLLOW_list_in_value257);
                    list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:76:5: map
                    {
                    dbg.location(76,5);
                    pushFollow(FOLLOW_map_in_value263);
                    map();

                    state._fsp--;
                    if (state.failed) return ;

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
        dbg.location(77, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value"


    // $ANTLR start "scalar"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:79:1: scalar : ( Boolean | Integer | Float | String | Timestamp | Reference | 'null' );
    public final void scalar() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "scalar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:80:3: ( Boolean | Integer | Float | String | Timestamp | Reference | 'null' )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:
            {
            dbg.location(80,3);
            if ( (input.LA(1)>=Boolean && input.LA(1)<=Reference)||input.LA(1)==24 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(87, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "scalar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "scalar"


    // $ANTLR start "list"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:90:1: list : ( emptyList | '[' ( integerList | floatList | timestampList | booleanList | stringList | childList )? ']' );
    public final void list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:91:3: ( emptyList | '[' ( integerList | floatList | timestampList | booleanList | stringList | childList )? ']' )
            int alt11=2;
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    int LA11_2 = input.LA(3);

                    if ( (synpred18_ARON()) ) {
                        alt11=1;
                    }
                    else if ( (true) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA11_1==Identifier||(LA11_1>=Label && LA11_1<=Timestamp)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:91:5: emptyList
                    {
                    dbg.location(91,5);
                    pushFollow(FOLLOW_emptyList_in_list328);
                    emptyList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:92:5: '[' ( integerList | floatList | timestampList | booleanList | stringList | childList )? ']'
                    {
                    dbg.location(92,5);
                    match(input,25,FOLLOW_25_in_list334); if (state.failed) return ;
                    dbg.location(93,5);
                    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:93:5: ( integerList | floatList | timestampList | booleanList | stringList | childList )?
                    int alt10=7;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    switch ( input.LA(1) ) {
                        case Integer:
                            {
                            alt10=1;
                            }
                            break;
                        case Float:
                            {
                            alt10=2;
                            }
                            break;
                        case Timestamp:
                            {
                            alt10=3;
                            }
                            break;
                        case Boolean:
                            {
                            alt10=4;
                            }
                            break;
                        case String:
                            {
                            alt10=5;
                            }
                            break;
                        case Identifier:
                        case Label:
                            {
                            alt10=6;
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:93:7: integerList
                            {
                            dbg.location(93,7);
                            pushFollow(FOLLOW_integerList_in_list342);
                            integerList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:94:7: floatList
                            {
                            dbg.location(94,7);
                            pushFollow(FOLLOW_floatList_in_list351);
                            floatList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:95:7: timestampList
                            {
                            dbg.location(95,7);
                            pushFollow(FOLLOW_timestampList_in_list359);
                            timestampList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:96:7: booleanList
                            {
                            dbg.location(96,7);
                            pushFollow(FOLLOW_booleanList_in_list367);
                            booleanList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:97:7: stringList
                            {
                            dbg.location(97,7);
                            pushFollow(FOLLOW_stringList_in_list375);
                            stringList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 6 :
                            dbg.enterAlt(6);

                            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:98:7: childList
                            {
                            dbg.location(98,7);
                            pushFollow(FOLLOW_childList_in_list383);
                            childList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(100,5);
                    match(input,26,FOLLOW_26_in_list396); if (state.failed) return ;

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
        dbg.location(101, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "list"


    // $ANTLR start "emptyList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:103:1: emptyList : '[' ']' ;
    public final void emptyList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "emptyList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:104:3: ( '[' ']' )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:104:5: '[' ']'
            {
            dbg.location(104,5);
            match(input,25,FOLLOW_25_in_emptyList411); if (state.failed) return ;
            dbg.location(104,9);
            match(input,26,FOLLOW_26_in_emptyList413); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(105, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "emptyList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "emptyList"


    // $ANTLR start "integerList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:107:1: integerList : ( Integer )+ ;
    public final void integerList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "integerList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:107:13: ( ( Integer )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:107:15: ( Integer )+
            {
            dbg.location(107,15);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:107:15: ( Integer )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==Integer) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:107:17: Integer
            	    {
            	    dbg.location(107,17);
            	    match(input,Integer,FOLLOW_Integer_in_integerList426); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt12++;
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(107, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "integerList"


    // $ANTLR start "floatList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:108:1: floatList : ( Float )+ ;
    public final void floatList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "floatList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:108:11: ( ( Float )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:108:13: ( Float )+
            {
            dbg.location(108,13);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:108:13: ( Float )+
            int cnt13=0;
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==Float) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:108:15: Float
            	    {
            	    dbg.location(108,15);
            	    match(input,Float,FOLLOW_Float_in_floatList439); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt13++;
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(108, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "floatList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "floatList"


    // $ANTLR start "timestampList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:109:1: timestampList : ( Timestamp )+ ;
    public final void timestampList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "timestampList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:109:15: ( ( Timestamp )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:109:17: ( Timestamp )+
            {
            dbg.location(109,17);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:109:17: ( Timestamp )+
            int cnt14=0;
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==Timestamp) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:109:19: Timestamp
            	    {
            	    dbg.location(109,19);
            	    match(input,Timestamp,FOLLOW_Timestamp_in_timestampList452); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt14++;
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(109, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timestampList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "timestampList"


    // $ANTLR start "booleanList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:110:1: booleanList : ( Boolean )+ ;
    public final void booleanList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "booleanList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:110:13: ( ( Boolean )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:110:15: ( Boolean )+
            {
            dbg.location(110,15);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:110:15: ( Boolean )+
            int cnt15=0;
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==Boolean) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:110:17: Boolean
            	    {
            	    dbg.location(110,17);
            	    match(input,Boolean,FOLLOW_Boolean_in_booleanList465); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt15++;
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(110, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "booleanList"


    // $ANTLR start "stringList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:111:1: stringList : ( String )+ ;
    public final void stringList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stringList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:111:12: ( ( String )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:111:14: ( String )+
            {
            dbg.location(111,14);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:111:14: ( String )+
            int cnt16=0;
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==String) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:111:16: String
            	    {
            	    dbg.location(111,16);
            	    match(input,String,FOLLOW_String_in_stringList478); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt16++;
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(111, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stringList"


    // $ANTLR start "childList"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:112:1: childList : ( child )+ ;
    public final void childList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "childList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:112:11: ( ( child )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:112:13: ( child )+
            {
            dbg.location(112,13);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:112:13: ( child )+
            int cnt17=0;
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==Identifier||LA17_0==Label) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:112:15: child
            	    {
            	    dbg.location(112,15);
            	    pushFollow(FOLLOW_child_in_childList491);
            	    child();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt17++;
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(112, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "childList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "childList"


    // $ANTLR start "map"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:114:1: map : '{' ( pair )* '}' ;
    public final void map() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "map");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:115:3: ( '{' ( pair )* '}' )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:115:5: '{' ( pair )* '}'
            {
            dbg.location(115,5);
            match(input,27,FOLLOW_27_in_map507); if (state.failed) return ;
            dbg.location(115,9);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:115:9: ( pair )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==Identifier||LA18_0==String) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:115:11: pair
            	    {
            	    dbg.location(115,11);
            	    pushFollow(FOLLOW_pair_in_map511);
            	    pair();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}

            dbg.location(115,19);
            match(input,28,FOLLOW_28_in_map516); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(116, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "map");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "map"


    // $ANTLR start "pair"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:118:1: pair : key value ;
    public final void pair() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "pair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:119:3: ( key value )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:119:5: key value
            {
            dbg.location(119,5);
            pushFollow(FOLLOW_key_in_pair531);
            key();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(119,9);
            pushFollow(FOLLOW_value_in_pair533);
            value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(120, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pair");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pair"


    // $ANTLR start "key"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:122:1: key : ( Identifier | String );
    public final void key() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "key");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:123:3: ( Identifier | String )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:
            {
            dbg.location(123,3);
            if ( input.LA(1)==Identifier||input.LA(1)==String ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(125, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "key");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "key"


    // $ANTLR start "override"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:127:1: override : path method value ;
    public final void override() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "override");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:128:3: ( path method value )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:128:5: path method value
            {
            dbg.location(128,5);
            pushFollow(FOLLOW_path_in_override569);
            path();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(128,10);
            pushFollow(FOLLOW_method_in_override571);
            method();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(128,17);
            pushFollow(FOLLOW_value_in_override573);
            value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(129, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "override");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "override"


    // $ANTLR start "path"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:131:1: path : ( Reference )+ ;
    public final void path() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "path");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:132:3: ( ( Reference )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:132:5: ( Reference )+
            {
            dbg.location(132,5);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:132:5: ( Reference )+
            int cnt19=0;
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==Reference) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:132:7: Reference
            	    {
            	    dbg.location(132,7);
            	    match(input,Reference,FOLLOW_Reference_in_path588); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt19++;
            } while (true);
            } finally {dbg.exitSubRule(19);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(133, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "path");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "path"


    // $ANTLR start "method"
    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:135:1: method : ( '.' Identifier )+ ;
    public final void method() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:136:3: ( ( '.' Identifier )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:136:5: ( '.' Identifier )+
            {
            dbg.location(136,5);
            // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:136:5: ( '.' Identifier )+
            int cnt20=0;
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:136:7: '.' Identifier
            	    {
            	    dbg.location(136,7);
            	    match(input,20,FOLLOW_20_in_method606); if (state.failed) return ;
            	    dbg.location(136,11);
            	    match(input,Identifier,FOLLOW_Identifier_in_method608); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt20++;
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(137, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "method"

    // $ANTLR start synpred18_ARON
    public final void synpred18_ARON_fragment() throws RecognitionException {   
        // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:91:5: ( emptyList )
        dbg.enterAlt(1);

        // /Users/jasonosgood/Projects/aron/src/aron/ARON.g:91:5: emptyList
        {
        dbg.location(91,5);
        pushFollow(FOLLOW_emptyList_in_synpred18_ARON328);
        emptyList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_ARON

    // Delegated rules

    public final boolean synpred18_ARON() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred18_ARON_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_18_in_root69 = new BitSet(new long[]{0x0000000000281052L});
    public static final BitSet FOLLOW_includes_in_root76 = new BitSet(new long[]{0x0000000000281052L});
    public static final BitSet FOLLOW_imports_in_root85 = new BitSet(new long[]{0x0000000000081052L});
    public static final BitSet FOLLOW_child_in_root94 = new BitSet(new long[]{0x0000000000001052L});
    public static final BitSet FOLLOW_override_in_root103 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_19_in_imports119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_klass_in_imports121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_klass136 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_klass140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_klass142 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_includes160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_url_in_includes162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Url_in_url177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_child194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_child199 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_child203 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_property_in_child207 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_child212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_property228 = new BitSet(new long[]{0x000000000B001FD0L});
    public static final BitSet FOLLOW_value_in_property230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalar_in_value245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_child_in_value251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_value257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_value263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_scalar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyList_in_list328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_list334 = new BitSet(new long[]{0x0000000004000FD0L});
    public static final BitSet FOLLOW_integerList_in_list342 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_floatList_in_list351 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_timestampList_in_list359 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_booleanList_in_list367 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_stringList_in_list375 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_childList_in_list383 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_list396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_emptyList411 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_emptyList413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_integerList426 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Float_in_floatList439 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_Timestamp_in_timestampList452 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Boolean_in_booleanList465 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_String_in_stringList478 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_child_in_childList491 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_27_in_map507 = new BitSet(new long[]{0x0000000010000410L});
    public static final BitSet FOLLOW_pair_in_map511 = new BitSet(new long[]{0x0000000010000410L});
    public static final BitSet FOLLOW_28_in_map516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair531 = new BitSet(new long[]{0x000000000B001FD0L});
    public static final BitSet FOLLOW_value_in_pair533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_key0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_override569 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_method_in_override571 = new BitSet(new long[]{0x000000000B001FD0L});
    public static final BitSet FOLLOW_value_in_override573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Reference_in_path588 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_20_in_method606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_method608 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_emptyList_in_synpred18_ARON328 = new BitSet(new long[]{0x0000000000000002L});

}