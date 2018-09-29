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
		T__9=10, Boolean=11, Integer=12, Float=13, String=14, Timestamp=15, Url=16, 
		Word=17, LineComment=18, BlockComment=19, Whitespace=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "Boolean", "Exponent", "Digit", "Letter", "Integer", "Float", 
		"String", "Escape", "Timestamp", "Url", "Word", "LineComment", "BlockComment", 
		"Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'import'", "'{'", "'}'", "'@'", "'.'", "'null'", "'['", 
		"']'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Boolean", 
		"Integer", "Float", "String", "Timestamp", "Url", "Word", "LineComment", 
		"BlockComment", "Whitespace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0103\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f_\n\f\3\r\3\r\5\rc\n\r\3"+
		"\r\6\rf\n\r\r\r\16\rg\3\16\3\16\3\17\3\17\3\20\5\20o\n\20\3\20\6\20r\n"+
		"\20\r\20\16\20s\3\21\5\21w\n\21\3\21\6\21z\n\21\r\21\16\21{\3\21\3\21"+
		"\7\21\u0080\n\21\f\21\16\21\u0083\13\21\3\21\5\21\u0086\n\21\3\21\3\21"+
		"\6\21\u008a\n\21\r\21\16\21\u008b\3\21\5\21\u008f\n\21\3\21\6\21\u0092"+
		"\n\21\r\21\16\21\u0093\3\21\3\21\5\21\u0098\n\21\3\22\3\22\3\22\7\22\u009d"+
		"\n\22\f\22\16\22\u00a0\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bf\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00c9\n\24\5\24\u00cb\n\24\5\24\u00cd\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00d4\n\25\f\25\16\25\u00d7\13\25\7\25\u00d9"+
		"\n\25\f\25\16\25\u00dc\13\25\3\26\3\26\6\26\u00e0\n\26\r\26\16\26\u00e1"+
		"\3\27\3\27\3\27\3\27\7\27\u00e8\n\27\f\27\16\27\u00eb\13\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\7\30\u00f3\n\30\f\30\16\30\u00f6\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\6\31\u00fe\n\31\r\31\16\31\u00ff\3\31\3\31\3\u00f4"+
		"\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35"+
		"\2\37\16!\17#\20%\2\'\21)\22+\23-\24/\25\61\26\3\2\n\4\2GGgg\4\2--//\3"+
		"\2\62;\4\2C\\c|\6\2\f\f\17\17$$^^\b\2$$^^ddppttvv\4\2\f\f\17\17\7\2\13"+
		"\f\17\17\"\"..<<\2\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2"+
		")\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5"+
		";\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21"+
		"O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33i\3\2\2\2"+
		"\35k\3\2\2\2\37n\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u00a3\3\2\2\2"+
		"\'\u00a6\3\2\2\2)\u00ce\3\2\2\2+\u00df\3\2\2\2-\u00e3\3\2\2\2/\u00ee\3"+
		"\2\2\2\61\u00fd\3\2\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7e\2\2\66\67\7"+
		"n\2\2\678\7w\2\289\7f\2\29:\7g\2\2:\4\3\2\2\2;<\7k\2\2<=\7o\2\2=>\7r\2"+
		"\2>?\7q\2\2?@\7t\2\2@A\7v\2\2A\6\3\2\2\2BC\7}\2\2C\b\3\2\2\2DE\7\177\2"+
		"\2E\n\3\2\2\2FG\7B\2\2G\f\3\2\2\2HI\7\60\2\2I\16\3\2\2\2JK\7p\2\2KL\7"+
		"w\2\2LM\7n\2\2MN\7n\2\2N\20\3\2\2\2OP\7]\2\2P\22\3\2\2\2QR\7_\2\2R\24"+
		"\3\2\2\2ST\7%\2\2T\26\3\2\2\2UV\7v\2\2VW\7t\2\2WX\7w\2\2X_\7g\2\2YZ\7"+
		"h\2\2Z[\7c\2\2[\\\7n\2\2\\]\7u\2\2]_\7g\2\2^U\3\2\2\2^Y\3\2\2\2_\30\3"+
		"\2\2\2`b\t\2\2\2ac\t\3\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\33\16\2e"+
		"d\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\32\3\2\2\2ij\t\4\2\2j\34\3\2"+
		"\2\2kl\t\5\2\2l\36\3\2\2\2mo\7/\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5"+
		"\33\16\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t \3\2\2\2uw\7/\2\2vu"+
		"\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\5\33\16\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|}\3\2\2\2}\u0081\7\60\2\2~\u0080\5\33\16\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0086\5\31\r\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0098\3\2\2\2\u0087\u0089\7\60\2\2\u0088\u008a\5"+
		"\33\16\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\31\r\2\u008e\u008d\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0098\3\2\2\2\u0090\u0092\5\33\16\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\31\r\2\u0096\u0098\3\2\2\2\u0097"+
		"v\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u0091\3\2\2\2\u0098\"\3\2\2\2\u0099"+
		"\u009e\7$\2\2\u009a\u009d\n\6\2\2\u009b\u009d\5%\23\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7$"+
		"\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7^\2\2\u00a4\u00a5\t\7\2\2\u00a5&\3\2"+
		"\2\2\u00a6\u00a7\5\33\16\2\u00a7\u00a8\5\33\16\2\u00a8\u00a9\5\33\16\2"+
		"\u00a9\u00aa\5\33\16\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\5\33\16\2\u00ac"+
		"\u00ad\5\33\16\2\u00ad\u00ae\7/\2\2\u00ae\u00af\5\33\16\2\u00af\u00cc"+
		"\5\33\16\2\u00b0\u00b1\7V\2\2\u00b1\u00b2\5\33\16\2\u00b2\u00b3\5\33\16"+
		"\2\u00b3\u00b4\7<\2\2\u00b4\u00b5\5\33\16\2\u00b5\u00ca\5\33\16\2\u00b6"+
		"\u00b7\7<\2\2\u00b7\u00b8\5\33\16\2\u00b8\u00be\5\33\16\2\u00b9\u00ba"+
		"\7\60\2\2\u00ba\u00bb\5\33\16\2\u00bb\u00bc\5\33\16\2\u00bc\u00bd\5\33"+
		"\16\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c8\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c2\5\33\16\2\u00c2\u00c3\5"+
		"\33\16\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\5\33\16\2\u00c5\u00c6\5\33\16"+
		"\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\7\\\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00b6\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00b0\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd(\3\2\2\2\u00ce\u00da\4\60\61\2\u00cf\u00d5\7\61\2\2\u00d0\u00d4"+
		"\5\35\17\2\u00d1\u00d4\5\33\16\2\u00d2\u00d4\7\60\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00cf\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db*\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\5\35\17"+
		"\2\u00de\u00e0\5\33\16\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2,\3\2\2\2"+
		"\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e8"+
		"\n\b\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\27"+
		"\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f4"+
		"\3\2\2\2\u00f1\u00f3\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\b\30\2\2\u00fb\60\3\2\2\2\u00fc\u00fe\t\t\2\2\u00fd\u00fc\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\b\31\3\2\u0102\62\3\2\2\2\36\2^bgnsv{\u0081\u0085"+
		"\u008b\u008e\u0093\u0097\u009c\u009e\u00be\u00c8\u00ca\u00cc\u00d3\u00d5"+
		"\u00da\u00df\u00e1\u00e9\u00f4\u00ff\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}