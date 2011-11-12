// $ANTLR 3.4 /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g 2011-11-11 12:52:56
 
package aron;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class ARONParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Bool", "Comment", "Digit", "Exponent", "Float", "Identifier", "Integer", "Label", "Reference", "String", "Timestamp", "Whitespace", "'# ARON 0.1\\n'", "'('", "')'", "'.'", "'['", "']'", "'import'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int Bool=4;
    public static final int Comment=5;
    public static final int Digit=6;
    public static final int Exponent=7;
    public static final int Float=8;
    public static final int Identifier=9;
    public static final int Integer=10;
    public static final int Label=11;
    public static final int Reference=12;
    public static final int String=13;
    public static final int Timestamp=14;
    public static final int Whitespace=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred12_ARON", "synpred3_ARON", "synpred22_ARON", 
    "assoc", "synpred10_ARON", "list", "synpred6_ARON", "childList", "klass", 
    "property", "synpred25_ARON", "synpred11_ARON", "synpred1_ARON", "synpred9_ARON", 
    "synpred24_ARON", "synpred17_ARON", "synpred13_ARON", "synpred19_ARON", 
    "synpred23_ARON", "synpred14_ARON", "synpred18_ARON", "booleanList", 
    "integerList", "synpred15_ARON", "synpred8_ARON", "floatList", "synpred21_ARON", 
    "stringList", "imports", "synpred4_ARON", "synpred7_ARON", "child", 
    "value", "synpred16_ARON", "root", "synpred2_ARON", "synpred20_ARON", 
    "synpred5_ARON", "synpred26_ARON", "timestampList"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false
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
    public String getGrammarFileName() { return "/Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g"; }





    // $ANTLR start "root"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:38:1: root : '# ARON 0.1\\n' ( imports )* ( child )+ ;
    public final void root() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "root");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:39:3: ( '# ARON 0.1\\n' ( imports )* ( child )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:39:5: '# ARON 0.1\\n' ( imports )* ( child )+
            {
            dbg.location(39,5);
            match(input,16,FOLLOW_16_in_root69); if (state.failed) return ;
            dbg.location(40,3);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:40:3: ( imports )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:40:5: imports
            	    {
            	    dbg.location(40,5);
            	    pushFollow(FOLLOW_imports_in_root76);
            	    imports();

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
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:41:3: ( child )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==Label) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:41:5: child
            	    {
            	    dbg.location(41,5);
            	    pushFollow(FOLLOW_child_in_root85);
            	    child();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(42, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "root");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "root"



    // $ANTLR start "klass"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:44:1: klass : Identifier ( '.' Identifier )* ;
    public final void klass() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "klass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:45:3: ( Identifier ( '.' Identifier )* )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:45:5: Identifier ( '.' Identifier )*
            {
            dbg.location(45,5);
            match(input,Identifier,FOLLOW_Identifier_in_klass101); if (state.failed) return ;
            dbg.location(45,16);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:45:16: ( '.' Identifier )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:45:18: '.' Identifier
            	    {
            	    dbg.location(45,18);
            	    match(input,19,FOLLOW_19_in_klass105); if (state.failed) return ;
            	    dbg.location(45,22);
            	    match(input,Identifier,FOLLOW_Identifier_in_klass107); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(46, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "klass");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "klass"



    // $ANTLR start "imports"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:48:1: imports : 'import' klass ;
    public final void imports() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "imports");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:49:3: ( 'import' klass )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:49:5: 'import' klass
            {
            dbg.location(49,5);
            match(input,22,FOLLOW_22_in_imports125); if (state.failed) return ;
            dbg.location(49,14);
            pushFollow(FOLLOW_klass_in_imports127);
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
        	// do for sure before leaving
        }
        dbg.location(50, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "imports");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "imports"



    // $ANTLR start "child"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:52:1: child : ( Label )? Identifier ( '(' ( property )* ')' )? ;
    public final void child() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "child");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:3: ( ( Label )? Identifier ( '(' ( property )* ')' )? )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:5: ( Label )? Identifier ( '(' ( property )* ')' )?
            {
            dbg.location(53,5);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:5: ( Label )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==Label) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:7: Label
                    {
                    dbg.location(53,7);
                    match(input,Label,FOLLOW_Label_in_child143); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(53,16);
            match(input,Identifier,FOLLOW_Identifier_in_child148); if (state.failed) return ;
            dbg.location(53,27);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:27: ( '(' ( property )* ')' )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:29: '(' ( property )* ')'
                    {
                    dbg.location(53,29);
                    match(input,17,FOLLOW_17_in_child152); if (state.failed) return ;
                    dbg.location(53,33);
                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:33: ( property )*
                    try { dbg.enterSubRule(5);

                    loop5:
                    do {
                        int alt5=2;
                        try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Identifier) ) {
                            alt5=1;
                        }


                        } finally {dbg.exitDecision(5);}

                        switch (alt5) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:53:35: property
                    	    {
                    	    dbg.location(53,35);
                    	    pushFollow(FOLLOW_property_in_child156);
                    	    property();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(53,47);
                    match(input,18,FOLLOW_18_in_child161); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(54, 2);

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
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:56:1: property : Identifier ( value | child | list | assoc ) ;
    public final void property() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "property");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:57:3: ( Identifier ( value | child | list | assoc ) )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:57:5: Identifier ( value | child | list | assoc )
            {
            dbg.location(57,5);
            match(input,Identifier,FOLLOW_Identifier_in_property177); if (state.failed) return ;
            dbg.location(58,4);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:58:4: ( value | child | list | assoc )
            int alt7=4;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
            case Bool:
            case Float:
            case Integer:
            case Reference:
            case String:
            case Timestamp:
                {
                alt7=1;
                }
                break;
            case Identifier:
            case Label:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:58:6: value
                    {
                    dbg.location(58,6);
                    pushFollow(FOLLOW_value_in_property185);
                    value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:59:7: child
                    {
                    dbg.location(59,7);
                    pushFollow(FOLLOW_child_in_property193);
                    child();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:60:7: list
                    {
                    dbg.location(60,7);
                    pushFollow(FOLLOW_list_in_property201);
                    list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:61:7: assoc
                    {
                    dbg.location(61,7);
                    pushFollow(FOLLOW_assoc_in_property209);
                    assoc();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(63, 2);

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
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:65:1: value : ( Bool | Integer | Float | String | Timestamp | Reference );
    public final void value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:66:3: ( Bool | Integer | Float | String | Timestamp | Reference )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:
            {
            dbg.location(66,3);
            if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Integer||(input.LA(1) >= Reference && input.LA(1) <= Timestamp) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
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
        	// do for sure before leaving
        }
        dbg.location(72, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "list"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:75:1: list : '[' ( integerList | floatList | timestampList | booleanList | childList )? ']' ;
    public final void list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:76:3: ( '[' ( integerList | floatList | timestampList | booleanList | childList )? ']' )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:76:5: '[' ( integerList | floatList | timestampList | booleanList | childList )? ']'
            {
            dbg.location(76,5);
            match(input,20,FOLLOW_20_in_list274); if (state.failed) return ;
            dbg.location(77,5);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:77:5: ( integerList | floatList | timestampList | booleanList | childList )?
            int alt8=6;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
                case Integer:
                    {
                    alt8=1;
                    }
                    break;
                case Float:
                    {
                    alt8=2;
                    }
                    break;
                case Timestamp:
                    {
                    alt8=3;
                    }
                    break;
                case Bool:
                    {
                    alt8=4;
                    }
                    break;
                case Identifier:
                case Label:
                    {
                    alt8=5;
                    }
                    break;
            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:77:7: integerList
                    {
                    dbg.location(77,7);
                    pushFollow(FOLLOW_integerList_in_list282);
                    integerList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:78:7: floatList
                    {
                    dbg.location(78,7);
                    pushFollow(FOLLOW_floatList_in_list291);
                    floatList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:79:7: timestampList
                    {
                    dbg.location(79,7);
                    pushFollow(FOLLOW_timestampList_in_list299);
                    timestampList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:80:7: booleanList
                    {
                    dbg.location(80,7);
                    pushFollow(FOLLOW_booleanList_in_list307);
                    booleanList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:81:7: childList
                    {
                    dbg.location(81,7);
                    pushFollow(FOLLOW_childList_in_list315);
                    childList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(83,5);
            match(input,21,FOLLOW_21_in_list328); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(84, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "list"



    // $ANTLR start "stringList"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:86:1: stringList : ( String )+ ;
    public final void stringList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stringList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:86:12: ( ( String )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:86:14: ( String )+
            {
            dbg.location(86,14);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:86:14: ( String )+
            int cnt9=0;
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==String) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:86:16: String
            	    {
            	    dbg.location(86,16);
            	    match(input,String,FOLLOW_String_in_stringList341); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt9++;
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(86, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stringList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stringList"



    // $ANTLR start "integerList"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:87:1: integerList : ( Integer )+ ;
    public final void integerList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "integerList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:87:13: ( ( Integer )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:87:15: ( Integer )+
            {
            dbg.location(87,15);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:87:15: ( Integer )+
            int cnt10=0;
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==Integer) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:87:17: Integer
            	    {
            	    dbg.location(87,17);
            	    match(input,Integer,FOLLOW_Integer_in_integerList354); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt10++;
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(87, 27);

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
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:88:1: floatList : ( Float )+ ;
    public final void floatList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "floatList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:88:11: ( ( Float )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:88:13: ( Float )+
            {
            dbg.location(88,13);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:88:13: ( Float )+
            int cnt11=0;
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==Float) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:88:15: Float
            	    {
            	    dbg.location(88,15);
            	    match(input,Float,FOLLOW_Float_in_floatList367); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt11++;
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(88, 23);

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
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:89:1: timestampList : ( Timestamp )+ ;
    public final void timestampList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "timestampList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:89:15: ( ( Timestamp )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:89:17: ( Timestamp )+
            {
            dbg.location(89,17);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:89:17: ( Timestamp )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==Timestamp) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:89:19: Timestamp
            	    {
            	    dbg.location(89,19);
            	    match(input,Timestamp,FOLLOW_Timestamp_in_timestampList380); if (state.failed) return ;

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
        	// do for sure before leaving
        }
        dbg.location(89, 31);

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
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:90:1: booleanList : ( Bool )+ ;
    public final void booleanList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "booleanList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:90:13: ( ( Bool )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:90:15: ( Bool )+
            {
            dbg.location(90,15);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:90:15: ( Bool )+
            int cnt13=0;
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==Bool) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:90:17: Bool
            	    {
            	    dbg.location(90,17);
            	    match(input,Bool,FOLLOW_Bool_in_booleanList393); if (state.failed) return ;

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
        	// do for sure before leaving
        }
        dbg.location(90, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "booleanList"



    // $ANTLR start "childList"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:91:1: childList : ( child )+ ;
    public final void childList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "childList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:91:11: ( ( child )+ )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:91:13: ( child )+
            {
            dbg.location(91,13);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:91:13: ( child )+
            int cnt14=0;
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==Identifier||LA14_0==Label) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:91:15: child
            	    {
            	    dbg.location(91,15);
            	    pushFollow(FOLLOW_child_in_childList406);
            	    child();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        	// do for sure before leaving
        }
        dbg.location(91, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "childList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "childList"



    // $ANTLR start "assoc"
    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:93:1: assoc : '{' ( property )* '}' ;
    public final void assoc() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assoc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:94:3: ( '{' ( property )* '}' )
            dbg.enterAlt(1);

            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:94:5: '{' ( property )* '}'
            {
            dbg.location(94,5);
            match(input,23,FOLLOW_23_in_assoc422); if (state.failed) return ;
            dbg.location(94,9);
            // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:94:9: ( property )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/jasonosgood/Projects/Camper/aron/src/aron/ARON.g:94:11: property
            	    {
            	    dbg.location(94,11);
            	    pushFollow(FOLLOW_property_in_assoc426);
            	    property();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}

            dbg.location(94,23);
            match(input,24,FOLLOW_24_in_assoc431); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(95, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assoc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assoc"

    // Delegated rules


 

    public static final BitSet FOLLOW_16_in_root69 = new BitSet(new long[]{0x0000000000400A00L});
    public static final BitSet FOLLOW_imports_in_root76 = new BitSet(new long[]{0x0000000000400A00L});
    public static final BitSet FOLLOW_child_in_root85 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_Identifier_in_klass101 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_klass105 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_klass107 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_22_in_imports125 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_klass_in_imports127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_child143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_child148 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_child152 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_property_in_child156 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_18_in_child161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_property177 = new BitSet(new long[]{0x0000000000907F10L});
    public static final BitSet FOLLOW_value_in_property185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_child_in_property193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_property201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_property209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_list274 = new BitSet(new long[]{0x0000000000204F10L});
    public static final BitSet FOLLOW_integerList_in_list282 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_floatList_in_list291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_timestampList_in_list299 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_booleanList_in_list307 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_childList_in_list315 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_list328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_stringList341 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_Integer_in_integerList354 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Float_in_floatList367 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Timestamp_in_timestampList380 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_Bool_in_booleanList393 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_child_in_childList406 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_23_in_assoc422 = new BitSet(new long[]{0x0000000001000200L});
    public static final BitSet FOLLOW_property_in_assoc426 = new BitSet(new long[]{0x0000000001000200L});
    public static final BitSet FOLLOW_24_in_assoc431 = new BitSet(new long[]{0x0000000000000002L});

}