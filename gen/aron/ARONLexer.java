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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Boolean=6, Integer=7, Float=8, 
		String=9, Timestamp=10, Identifier=11, Label=12, Reference=13, Url=14, 
		BlockComment=15, Whitespace=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		LBRACK=21, RBRACK=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "Boolean", "Exponent", "Digit", 
		"Letter", "Integer", "Float", "String", "Escape", "Timestamp", "Identifier", 
		"Label", "Reference", "Url", "BlockComment", "Whitespace", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'# ARON 0.1'", "'import'", "'.'", "'include'", "'null'", null, 
		null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "Boolean", "Integer", "Float", "String", 
		"Timestamp", "Identifier", "Label", "Reference", "Url", "BlockComment", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u010f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\b\3"+
		"\b\5\bf\n\b\3\b\6\bi\n\b\r\b\16\bj\3\t\3\t\3\n\3\n\3\13\5\13r\n\13\3\13"+
		"\6\13u\n\13\r\13\16\13v\3\f\5\fz\n\f\3\f\6\f}\n\f\r\f\16\f~\3\f\3\f\7"+
		"\f\u0083\n\f\f\f\16\f\u0086\13\f\3\f\5\f\u0089\n\f\3\f\3\f\6\f\u008d\n"+
		"\f\r\f\16\f\u008e\3\f\5\f\u0092\n\f\3\f\6\f\u0095\n\f\r\f\16\f\u0096\3"+
		"\f\3\f\5\f\u009b\n\f\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00c4\n\17\5\17\u00c6\n\17\5\17\u00c8\n\17\3\20\3\20\3"+
		"\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\21\3\21\3\21\7\21\u00d6"+
		"\n\21\f\21\16\21\u00d9\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00e1"+
		"\n\22\f\22\16\22\u00e4\13\22\3\23\3\23\3\23\3\23\7\23\u00ea\n\23\f\23"+
		"\16\23\u00ed\13\23\3\24\3\24\3\24\3\24\7\24\u00f3\n\24\f\24\16\24\u00f6"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u00fe\n\25\r\25\16\25\u00ff"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\u00f4\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\t\27\n\31\13"+
		"\33\2\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\3\2"+
		"\t\4\2GGgg\4\2--//\3\2\62;\4\2C\\c|\6\2\f\f\17\17$$^^\b\2$$^^ddppttvv"+
		"\6\2\13\f\17\17\"\"..\2\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5B\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13S\3"+
		"\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25q\3\2\2\2\27\u009a"+
		"\3\2\2\2\31\u009c\3\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00c9\3"+
		"\2\2\2!\u00d2\3\2\2\2#\u00dc\3\2\2\2%\u00e5\3\2\2\2\'\u00ee\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u0107\3\2\2\2\61\u0109\3\2\2\2"+
		"\63\u010b\3\2\2\2\65\u010d\3\2\2\2\678\7%\2\289\7\"\2\29:\7C\2\2:;\7T"+
		"\2\2;<\7Q\2\2<=\7P\2\2=>\7\"\2\2>?\7\62\2\2?@\7\60\2\2@A\7\63\2\2A\4\3"+
		"\2\2\2BC\7k\2\2CD\7o\2\2DE\7r\2\2EF\7q\2\2FG\7t\2\2GH\7v\2\2H\6\3\2\2"+
		"\2IJ\7\60\2\2J\b\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7e\2\2NO\7n\2\2OP\7w\2\2"+
		"PQ\7f\2\2QR\7g\2\2R\n\3\2\2\2ST\7p\2\2TU\7w\2\2UV\7n\2\2VW\7n\2\2W\f\3"+
		"\2\2\2XY\7v\2\2YZ\7t\2\2Z[\7w\2\2[b\7g\2\2\\]\7h\2\2]^\7c\2\2^_\7n\2\2"+
		"_`\7u\2\2`b\7g\2\2aX\3\2\2\2a\\\3\2\2\2b\16\3\2\2\2ce\t\2\2\2df\t\3\2"+
		"\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5\21\t\2hg\3\2\2\2ij\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2k\20\3\2\2\2lm\t\4\2\2m\22\3\2\2\2no\t\5\2\2o\24\3\2\2\2"+
		"pr\7/\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\21\t\2ts\3\2\2\2uv\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2w\26\3\2\2\2xz\7/\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2"+
		"\2{}\5\21\t\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0084\7\60\2\2\u0081\u0083\5\21\t\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0089\5\17\b\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u009b\3\2\2\2\u008a\u008c\7\60\2\2\u008b\u008d\5"+
		"\21\t\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0092\5\17\b\2\u0091\u0090\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u009b\3\2\2\2\u0093\u0095\5\21\t\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5\17\b\2\u0099\u009b\3\2\2\2\u009a"+
		"y\3\2\2\2\u009a\u008a\3\2\2\2\u009a\u0094\3\2\2\2\u009b\30\3\2\2\2\u009c"+
		"\u00a1\7$\2\2\u009d\u00a0\n\6\2\2\u009e\u00a0\5\33\16\2\u009f\u009d\3"+
		"\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7$"+
		"\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7^\2\2\u00a7\u00a8\t\7\2\2\u00a8\34"+
		"\3\2\2\2\u00a9\u00aa\5\21\t\2\u00aa\u00ab\5\21\t\2\u00ab\u00ac\5\21\t"+
		"\2\u00ac\u00ad\5\21\t\2\u00ad\u00ae\7/\2\2\u00ae\u00af\5\21\t\2\u00af"+
		"\u00b0\5\21\t\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\5\21\t\2\u00b2\u00c7\5"+
		"\21\t\2\u00b3\u00b4\7V\2\2\u00b4\u00b5\5\21\t\2\u00b5\u00b6\5\21\t\2\u00b6"+
		"\u00b7\7<\2\2\u00b7\u00b8\5\21\t\2\u00b8\u00c5\5\21\t\2\u00b9\u00ba\7"+
		"<\2\2\u00ba\u00bb\5\21\t\2\u00bb\u00c3\5\21\t\2\u00bc\u00bd\7-\2\2\u00bd"+
		"\u00be\5\21\t\2\u00be\u00bf\5\21\t\2\u00bf\u00c0\7<\2\2\u00c0\u00c1\5"+
		"\21\t\2\u00c1\u00c2\5\21\t\2\u00c2\u00c4\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\36\3\2\2\2\u00c9\u00cf\5\23\n\2\u00ca\u00ce\5\23\n\2\u00cb\u00ce\5\21"+
		"\t\2\u00cc\u00ce\7a\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0 \3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d7\5\23\n\2\u00d3\u00d6"+
		"\5\23\n\2\u00d4\u00d6\5\21\t\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7<\2\2\u00db\"\3\2\2\2\u00dc"+
		"\u00dd\7B\2\2\u00dd\u00e2\5\23\n\2\u00de\u00e1\5\23\n\2\u00df\u00e1\5"+
		"\21\t\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3$\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e5\u00eb\7\61\2\2\u00e6\u00ea\5\23\n\2\u00e7\u00ea\5\21\t\2\u00e8"+
		"\u00ea\4\60\61\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"&\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7,\2\2"+
		"\u00f0\u00f4\3\2\2\2\u00f1\u00f3\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\b\24\2\2\u00fb(\3\2\2\2\u00fc\u00fe\t\b\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\b\25\3\2\u0102*\3\2\2\2\u0103\u0104\7*\2\2"+
		"\u0104,\3\2\2\2\u0105\u0106\7+\2\2\u0106.\3\2\2\2\u0107\u0108\7}\2\2\u0108"+
		"\60\3\2\2\2\u0109\u010a\7\177\2\2\u010a\62\3\2\2\2\u010b\u010c\7]\2\2"+
		"\u010c\64\3\2\2\2\u010d\u010e\7_\2\2\u010e\66\3\2\2\2\37\2aejqvy~\u0084"+
		"\u0088\u008e\u0091\u0096\u009a\u009f\u00a1\u00c3\u00c5\u00c7\u00cd\u00cf"+
		"\u00d5\u00d7\u00e0\u00e2\u00e9\u00eb\u00f4\u00ff\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}