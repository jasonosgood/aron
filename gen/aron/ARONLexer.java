// Generated from /Users/jasonosgood/Desktop/Projects/aron/src/aron/ARON.g4 by ANTLR 4.7
package aron;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ARONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Boolean=13, Integer=14, Float=15, String=16, 
		Timestamp=17, Url=18, Word=19, LineComment=20, BlockComment=21, Whitespace=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "Boolean", "Exponent", "Digit", "Letter", "Integer", 
		"Float", "String", "Escape", "Timestamp", "Url", "Word", "LineComment", 
		"BlockComment", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'import'", "'{'", "'}'", "'@'", "'.'", "':'", "','", 
		"'null'", "'['", "']'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Boolean", "Integer", "Float", "String", "Timestamp", "Url", "Word", 
		"LineComment", "BlockComment", "Whitespace"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ARONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ARON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u010b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16g\n\16\3\17\3\17\5\17k\n\17\3\17\6\17n\n\17\r\17\16"+
		"\17o\3\20\3\20\3\21\3\21\3\22\5\22w\n\22\3\22\6\22z\n\22\r\22\16\22{\3"+
		"\23\5\23\177\n\23\3\23\6\23\u0082\n\23\r\23\16\23\u0083\3\23\3\23\7\23"+
		"\u0088\n\23\f\23\16\23\u008b\13\23\3\23\5\23\u008e\n\23\3\23\3\23\6\23"+
		"\u0092\n\23\r\23\16\23\u0093\3\23\5\23\u0097\n\23\3\23\6\23\u009a\n\23"+
		"\r\23\16\23\u009b\3\23\3\23\5\23\u00a0\n\23\3\24\3\24\3\24\7\24\u00a5"+
		"\n\24\f\24\16\24\u00a8\13\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c7\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00d1\n\26\5\26\u00d3\n\26\5\26\u00d5\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u00dc\n\27\f\27\16\27\u00df\13\27\7\27\u00e1"+
		"\n\27\f\27\16\27\u00e4\13\27\3\30\3\30\6\30\u00e8\n\30\r\30\16\30\u00e9"+
		"\3\31\3\31\3\31\3\31\7\31\u00f0\n\31\f\31\16\31\u00f3\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00fb\n\32\f\32\16\32\u00fe\13\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\6\33\u0106\n\33\r\33\16\33\u0107\3\33\3\33\3\u00fc"+
		"\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\2\37\2!\2#\20%\21\'\22)\2+\23-\24/\25\61\26\63\27\65\30\3\2\n\4\2GGg"+
		"g\4\2--//\3\2\62;\4\2C\\c|\6\2\f\f\17\17$$^^\b\2$$^^ddppttvv\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u0124\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5?\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13"+
		"J\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27"+
		"Y\3\2\2\2\31[\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#v"+
		"\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2)\u00ab\3\2\2\2+\u00ae\3\2\2\2"+
		"-\u00d6\3\2\2\2/\u00e7\3\2\2\2\61\u00eb\3\2\2\2\63\u00f6\3\2\2\2\65\u0105"+
		"\3\2\2\2\678\7k\2\289\7p\2\29:\7e\2\2:;\7n\2\2;<\7w\2\2<=\7f\2\2=>\7g"+
		"\2\2>\4\3\2\2\2?@\7k\2\2@A\7o\2\2AB\7r\2\2BC\7q\2\2CD\7t\2\2DE\7v\2\2"+
		"E\6\3\2\2\2FG\7}\2\2G\b\3\2\2\2HI\7\177\2\2I\n\3\2\2\2JK\7B\2\2K\f\3\2"+
		"\2\2LM\7\60\2\2M\16\3\2\2\2NO\7<\2\2O\20\3\2\2\2PQ\7.\2\2Q\22\3\2\2\2"+
		"RS\7p\2\2ST\7w\2\2TU\7n\2\2UV\7n\2\2V\24\3\2\2\2WX\7]\2\2X\26\3\2\2\2"+
		"YZ\7_\2\2Z\30\3\2\2\2[\\\7%\2\2\\\32\3\2\2\2]^\7v\2\2^_\7t\2\2_`\7w\2"+
		"\2`g\7g\2\2ab\7h\2\2bc\7c\2\2cd\7n\2\2de\7u\2\2eg\7g\2\2f]\3\2\2\2fa\3"+
		"\2\2\2g\34\3\2\2\2hj\t\2\2\2ik\t\3\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2l"+
		"n\5\37\20\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\36\3\2\2\2qr\t\4"+
		"\2\2r \3\2\2\2st\t\5\2\2t\"\3\2\2\2uw\7/\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2"+
		"\2\2xz\5\37\20\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|$\3\2\2\2}\177"+
		"\7/\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082\5\37\20\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\7\60\2\2\u0086\u0088\5\37\20"+
		"\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\35\17\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00a0\3\2\2\2\u008f\u0091"+
		"\7\60\2\2\u0090\u0092\5\37\20\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097"+
		"\5\35\17\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a0\3\2\2\2"+
		"\u0098\u009a\5\37\20\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\5\35\17\2"+
		"\u009e\u00a0\3\2\2\2\u009f~\3\2\2\2\u009f\u008f\3\2\2\2\u009f\u0099\3"+
		"\2\2\2\u00a0&\3\2\2\2\u00a1\u00a6\7$\2\2\u00a2\u00a5\n\6\2\2\u00a3\u00a5"+
		"\5)\25\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\7$\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7^\2\2\u00ac\u00ad"+
		"\t\7\2\2\u00ad*\3\2\2\2\u00ae\u00af\5\37\20\2\u00af\u00b0\5\37\20\2\u00b0"+
		"\u00b1\5\37\20\2\u00b1\u00b2\5\37\20\2\u00b2\u00b3\7/\2\2\u00b3\u00b4"+
		"\5\37\20\2\u00b4\u00b5\5\37\20\2\u00b5\u00b6\7/\2\2\u00b6\u00b7\5\37\20"+
		"\2\u00b7\u00d4\5\37\20\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\5\37\20\2\u00ba"+
		"\u00bb\5\37\20\2\u00bb\u00bc\7<\2\2\u00bc\u00bd\5\37\20\2\u00bd\u00d2"+
		"\5\37\20\2\u00be\u00bf\7<\2\2\u00bf\u00c0\5\37\20\2\u00c0\u00c6\5\37\20"+
		"\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\5\37\20\2\u00c3\u00c4\5\37\20\2\u00c4"+
		"\u00c5\5\37\20\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00d0\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9\u00ca\5\37\20\2\u00ca"+
		"\u00cb\5\37\20\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\5\37\20\2\u00cd\u00ce"+
		"\5\37\20\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\7\\\2\2\u00d0\u00c8\3\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00be"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5,\3\2\2\2\u00d6\u00e2\4\60\61\2\u00d7\u00dd\7\61\2"+
		"\2\u00d8\u00dc\5!\21\2\u00d9\u00dc\5\37\20\2\u00da\u00dc\7\60\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3.\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8"+
		"\5!\21\2\u00e6\u00e8\5\37\20\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\60"+
		"\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00f1\3\2\2\2"+
		"\u00ee\u00f0\n\b\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\b\31\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\7,\2"+
		"\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7,\2\2\u0100\u0101\7\61\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\b\32\2\2\u0103\64\3\2\2\2\u0104\u0106\t\t\2"+
		"\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\33\3\2\u010a\66\3\2\2\2\36"+
		"\2fjov{~\u0083\u0089\u008d\u0093\u0096\u009b\u009f\u00a4\u00a6\u00c6\u00d0"+
		"\u00d2\u00d4\u00db\u00dd\u00e2\u00e7\u00e9\u00f1\u00fc\u0107\4\2\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}