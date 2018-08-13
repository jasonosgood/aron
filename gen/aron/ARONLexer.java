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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Boolean=8, Integer=9, 
		Float=10, String=11, Timestamp=12, Url=13, Word=14, LineComment=15, BlockComment=16, 
		Whitespace=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, LBRACK=22, 
		RBRACK=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Boolean", "Exponent", 
		"Digit", "Letter", "Integer", "Float", "String", "Escape", "Timestamp", 
		"Url", "Word", "LineComment", "BlockComment", "Whitespace", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'# ARON 0.2'", "'include'", "'import'", "'.'", "':'", "'null'", 
		"'@'", null, null, null, null, null, null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Boolean", "Integer", 
		"Float", "String", "Timestamp", "Url", "Word", "LineComment", "BlockComment", 
		"Whitespace", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0110\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\th\n\t\3\n\3\n\5\nl\n\n\3\n\6\no\n\n\r\n\16\np\3\13\3\13"+
		"\3\f\3\f\3\r\5\rx\n\r\3\r\6\r{\n\r\r\r\16\r|\3\16\5\16\u0080\n\16\3\16"+
		"\6\16\u0083\n\16\r\16\16\16\u0084\3\16\3\16\7\16\u0089\n\16\f\16\16\16"+
		"\u008c\13\16\3\16\5\16\u008f\n\16\3\16\3\16\6\16\u0093\n\16\r\16\16\16"+
		"\u0094\3\16\5\16\u0098\n\16\3\16\6\16\u009b\n\16\r\16\16\16\u009c\3\16"+
		"\3\16\5\16\u00a1\n\16\3\17\3\17\3\17\7\17\u00a6\n\17\f\17\16\17\u00a9"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\5\21\u00cc\n\21\5\21\u00ce\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00d5\n\22\f\22\16\22\u00d8\13\22\7\22\u00da"+
		"\n\22\f\22\16\22\u00dd\13\22\3\23\3\23\3\23\7\23\u00e2\n\23\f\23\16\23"+
		"\u00e5\13\23\3\24\3\24\7\24\u00e9\n\24\f\24\16\24\u00ec\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u00f4\n\25\f\25\16\25\u00f7\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\6\26\u00ff\n\26\r\26\16\26\u0100\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\u00f5\2\35\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\13\33\f\35\r\37\2!\16"+
		"#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\31\3\2\n\4\2GGgg\4"+
		"\2--//\3\2\62;\4\2C\\c|\6\2\f\f\17\17$$^^\b\2$$^^ddppttvv\4\2\f\f\17\17"+
		"\6\2\13\f\17\17\"\"..\2\u0127\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5D\3\2\2\2\7L\3\2\2\2\tS\3\2"+
		"\2\2\13U\3\2\2\2\rW\3\2\2\2\17\\\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25r\3"+
		"\2\2\2\27t\3\2\2\2\31w\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3\2\2\2\37\u00ac"+
		"\3\2\2\2!\u00af\3\2\2\2#\u00cf\3\2\2\2%\u00de\3\2\2\2\'\u00e6\3\2\2\2"+
		")\u00ef\3\2\2\2+\u00fe\3\2\2\2-\u0104\3\2\2\2/\u0106\3\2\2\2\61\u0108"+
		"\3\2\2\2\63\u010a\3\2\2\2\65\u010c\3\2\2\2\67\u010e\3\2\2\29:\7%\2\2:"+
		";\7\"\2\2;<\7C\2\2<=\7T\2\2=>\7Q\2\2>?\7P\2\2?@\7\"\2\2@A\7\62\2\2AB\7"+
		"\60\2\2BC\7\64\2\2C\4\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7e\2\2GH\7n\2\2HI\7"+
		"w\2\2IJ\7f\2\2JK\7g\2\2K\6\3\2\2\2LM\7k\2\2MN\7o\2\2NO\7r\2\2OP\7q\2\2"+
		"PQ\7t\2\2QR\7v\2\2R\b\3\2\2\2ST\7\60\2\2T\n\3\2\2\2UV\7<\2\2V\f\3\2\2"+
		"\2WX\7p\2\2XY\7w\2\2YZ\7n\2\2Z[\7n\2\2[\16\3\2\2\2\\]\7B\2\2]\20\3\2\2"+
		"\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ah\7g\2\2bc\7h\2\2cd\7c\2\2de\7n\2\2ef\7"+
		"u\2\2fh\7g\2\2g^\3\2\2\2gb\3\2\2\2h\22\3\2\2\2ik\t\2\2\2jl\t\3\2\2kj\3"+
		"\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5\25\13\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2p"+
		"q\3\2\2\2q\24\3\2\2\2rs\t\4\2\2s\26\3\2\2\2tu\t\5\2\2u\30\3\2\2\2vx\7"+
		"/\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\5\25\13\2zy\3\2\2\2{|\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\32\3\2\2\2~\u0080\7/\2\2\177~\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\25\13\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u008a\7\60\2\2\u0087\u0089\5\25\13\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5\23\n\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u00a1\3\2\2\2\u0090\u0092\7\60\2\2\u0091\u0093\5"+
		"\25\13\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\23\n\2\u0097\u0096\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a1\3\2\2\2\u0099\u009b\5\25\13\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\5\23\n\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\177\3\2\2\2\u00a0\u0090\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1\34\3\2\2\2"+
		"\u00a2\u00a7\7$\2\2\u00a3\u00a6\n\6\2\2\u00a4\u00a6\5\37\20\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7$"+
		"\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7^\2\2\u00ad\u00ae\t\7\2\2\u00ae \3"+
		"\2\2\2\u00af\u00b0\5\25\13\2\u00b0\u00b1\5\25\13\2\u00b1\u00b2\5\25\13"+
		"\2\u00b2\u00b3\5\25\13\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\5\25\13\2\u00b5"+
		"\u00b6\5\25\13\2\u00b6\u00b7\7/\2\2\u00b7\u00b8\5\25\13\2\u00b8\u00cd"+
		"\5\25\13\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\5\25\13\2\u00bb\u00bc\5\25\13"+
		"\2\u00bc\u00bd\7<\2\2\u00bd\u00be\5\25\13\2\u00be\u00cb\5\25\13\2\u00bf"+
		"\u00c0\7<\2\2\u00c0\u00c1\5\25\13\2\u00c1\u00c9\5\25\13\2\u00c2\u00c3"+
		"\7-\2\2\u00c3\u00c4\5\25\13\2\u00c4\u00c5\5\25\13\2\u00c5\u00c6\7<\2\2"+
		"\u00c6\u00c7\5\25\13\2\u00c7\u00c8\5\25\13\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c2\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00bf\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\"\3\2\2\2\u00cf\u00db\4\60\61\2\u00d0\u00d6\7\61"+
		"\2\2\u00d1\u00d5\5\27\f\2\u00d2\u00d5\5\25\13\2\u00d3\u00d5\7\60\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00d0\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc$\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e3"+
		"\5\27\f\2\u00df\u00e2\5\27\f\2\u00e0\u00e2\5\25\13\2\u00e1\u00df\3\2\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4&\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\7%\2\2\u00e7\u00e9"+
		"\n\b\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b\24"+
		"\2\2\u00ee(\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5"+
		"\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b\25\2\2\u00fc*\3\2\2\2\u00fd\u00ff\t\t\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\b\26\3\2\u0103,\3\2\2\2\u0104\u0105\7*\2\2\u0105"+
		".\3\2\2\2\u0106\u0107\7+\2\2\u0107\60\3\2\2\2\u0108\u0109\7}\2\2\u0109"+
		"\62\3\2\2\2\u010a\u010b\7\177\2\2\u010b\64\3\2\2\2\u010c\u010d\7]\2\2"+
		"\u010d\66\3\2\2\2\u010e\u010f\7_\2\2\u010f8\3\2\2\2\35\2gkpw|\177\u0084"+
		"\u008a\u008e\u0094\u0097\u009c\u00a0\u00a5\u00a7\u00c9\u00cb\u00cd\u00d4"+
		"\u00d6\u00db\u00e1\u00e3\u00ea\u00f5\u0100\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}