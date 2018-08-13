// Generated from /Users/jasonosgood/Desktop/Projects/aron/src/aron/ARON.g4 by ANTLR 4.7
package aron;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ARONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Boolean=8, Integer=9, 
		Float=10, String=11, Timestamp=12, Url=13, Word=14, LineComment=15, BlockComment=16, 
		Whitespace=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, LBRACK=22, 
		RBRACK=23;
	public static final int
		RULE_root = 0, RULE_includes = 1, RULE_imports = 2, RULE_child = 3, RULE_combo = 4, 
		RULE_label = 5, RULE_property = 6, RULE_value = 7, RULE_scalar = 8, RULE_list = 9, 
		RULE_integerList = 10, RULE_floatList = 11, RULE_timestampList = 12, RULE_booleanList = 13, 
		RULE_stringList = 14, RULE_childList = 15, RULE_map = 16, RULE_pair = 17, 
		RULE_key = 18, RULE_override = 19, RULE_reference = 20, RULE_method = 21;
	public static final String[] ruleNames = {
		"root", "includes", "imports", "child", "combo", "label", "property", 
		"value", "scalar", "list", "integerList", "floatList", "timestampList", 
		"booleanList", "stringList", "childList", "map", "pair", "key", "override", 
		"reference", "method"
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

	@Override
	public String getGrammarFileName() { return "ARON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ARONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ARONParser.EOF, 0); }
		public List<IncludesContext> includes() {
			return getRuleContexts(IncludesContext.class);
		}
		public IncludesContext includes(int i) {
			return getRuleContext(IncludesContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<ChildContext> child() {
			return getRuleContexts(ChildContext.class);
		}
		public ChildContext child(int i) {
			return getRuleContext(ChildContext.class,i);
		}
		public List<OverrideContext> override() {
			return getRuleContexts(OverrideContext.class);
		}
		public OverrideContext override(int i) {
			return getRuleContext(OverrideContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(45);
				includes();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(51);
				imports();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Word) {
				{
				{
				setState(57);
				child();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(63);
				override();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludesContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(ARONParser.Url, 0); }
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitIncludes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__1);
			setState(72);
			match(Url);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public ComboContext combo() {
			return getRuleContext(ComboContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			combo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildContext extends ParserRuleContext {
		public ComboContext combo() {
			return getRuleContext(ComboContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ARONParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ARONParser.RPAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_child);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				label();
				}
				break;
			}
			setState(80);
			combo();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(81);
				match(LPAREN);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Word) {
					{
					{
					setState(82);
					property();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComboContext extends ParserRuleContext {
		public List<TerminalNode> Word() { return getTokens(ARONParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(ARONParser.Word, i);
		}
		public ComboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterCombo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitCombo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitCombo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComboContext combo() throws RecognitionException {
		ComboContext _localctx = new ComboContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_combo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(Word);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(92);
				match(T__3);
				setState(93);
				match(Word);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ARONParser.Word, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Word);
			setState(100);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public ComboContext combo() {
			return getRuleContext(ComboContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			combo();
			setState(103);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case Boolean:
			case Integer:
			case Float:
			case String:
			case Timestamp:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				scalar();
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				child();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				list();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				map();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(ARONParser.Boolean, 0); }
		public TerminalNode Integer() { return getToken(ARONParser.Integer, 0); }
		public TerminalNode Float() { return getToken(ARONParser.Float, 0); }
		public TerminalNode String() { return getToken(ARONParser.String, 0); }
		public TerminalNode Timestamp() { return getToken(ARONParser.Timestamp, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scalar);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(Boolean);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(Float);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(String);
				}
				break;
			case Timestamp:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(Timestamp);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				reference();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ARONParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ARONParser.RBRACK, 0); }
		public IntegerListContext integerList() {
			return getRuleContext(IntegerListContext.class,0);
		}
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public TimestampListContext timestampList() {
			return getRuleContext(TimestampListContext.class,0);
		}
		public BooleanListContext booleanList() {
			return getRuleContext(BooleanListContext.class,0);
		}
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public ChildListContext childList() {
			return getRuleContext(ChildListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LBRACK);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				setState(121);
				integerList();
				}
				break;
			case Float:
				{
				setState(122);
				floatList();
				}
				break;
			case Timestamp:
				{
				setState(123);
				timestampList();
				}
				break;
			case Boolean:
				{
				setState(124);
				booleanList();
				}
				break;
			case String:
				{
				setState(125);
				stringList();
				}
				break;
			case Word:
				{
				setState(126);
				childList();
				}
				break;
			case RBRACK:
				break;
			default:
				break;
			}
			setState(129);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerListContext extends ParserRuleContext {
		public List<TerminalNode> Integer() { return getTokens(ARONParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(ARONParser.Integer, i);
		}
		public IntegerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterIntegerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitIntegerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitIntegerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerListContext integerList() throws RecognitionException {
		IntegerListContext _localctx = new IntegerListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(Integer);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Integer );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatListContext extends ParserRuleContext {
		public List<TerminalNode> Float() { return getTokens(ARONParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(ARONParser.Float, i);
		}
		public FloatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterFloatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitFloatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitFloatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatListContext floatList() throws RecognitionException {
		FloatListContext _localctx = new FloatListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_floatList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(Float);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Float );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampListContext extends ParserRuleContext {
		public List<TerminalNode> Timestamp() { return getTokens(ARONParser.Timestamp); }
		public TerminalNode Timestamp(int i) {
			return getToken(ARONParser.Timestamp, i);
		}
		public TimestampListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestampList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterTimestampList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitTimestampList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitTimestampList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampListContext timestampList() throws RecognitionException {
		TimestampListContext _localctx = new TimestampListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timestampList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(Timestamp);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Timestamp );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanListContext extends ParserRuleContext {
		public List<TerminalNode> Boolean() { return getTokens(ARONParser.Boolean); }
		public TerminalNode Boolean(int i) {
			return getToken(ARONParser.Boolean, i);
		}
		public BooleanListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterBooleanList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitBooleanList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitBooleanList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanListContext booleanList() throws RecognitionException {
		BooleanListContext _localctx = new BooleanListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(Boolean);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Boolean );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(ARONParser.String); }
		public TerminalNode String(int i) {
			return getToken(ARONParser.String, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(String);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==String );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildListContext extends ParserRuleContext {
		public List<ChildContext> child() {
			return getRuleContexts(ChildContext.class);
		}
		public ChildContext child(int i) {
			return getRuleContext(ChildContext.class,i);
		}
		public ChildListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterChildList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitChildList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitChildList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildListContext childList() throws RecognitionException {
		ChildListContext _localctx = new ChildListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_childList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				child();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Word );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ARONParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ARONParser.RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LBRACE);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String || _la==Word) {
				{
				{
				setState(162);
				pair();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			key();
			setState(171);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ARONParser.Word, 0); }
		public TerminalNode String() { return getToken(ARONParser.String, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Word) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverrideContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OverrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_override; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterOverride(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitOverride(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitOverride(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideContext override() throws RecognitionException {
		OverrideContext _localctx = new OverrideContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			reference();
			setState(176);
			method();
			setState(177);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ARONParser.Word, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__6);
			setState(180);
			match(Word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ARONParser.Word, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__3);
			setState(183);
			match(Word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2"+
		"@\13\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\5\5Q\n\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\5\5\\\n\5\3\6\3\6\3"+
		"\6\7\6a\n\6\f\6\16\6d\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t"+
		"p\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0082\n\13\3\13\3\13\3\f\6\f\u0087\n\f\r\f\16\f\u0088\3"+
		"\r\6\r\u008c\n\r\r\r\16\r\u008d\3\16\6\16\u0091\n\16\r\16\16\16\u0092"+
		"\3\17\6\17\u0096\n\17\r\17\16\17\u0097\3\20\6\20\u009b\n\20\r\20\16\20"+
		"\u009c\3\21\6\21\u00a0\n\21\r\21\16\21\u00a1\3\22\3\22\7\22\u00a6\n\22"+
		"\f\22\16\22\u00a9\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,\2\3\4\2\r\r\20\20\2\u00c3\2.\3\2\2\2\4I\3\2"+
		"\2\2\6L\3\2\2\2\bP\3\2\2\2\n]\3\2\2\2\fe\3\2\2\2\16h\3\2\2\2\20o\3\2\2"+
		"\2\22x\3\2\2\2\24z\3\2\2\2\26\u0086\3\2\2\2\30\u008b\3\2\2\2\32\u0090"+
		"\3\2\2\2\34\u0095\3\2\2\2\36\u009a\3\2\2\2 \u009f\3\2\2\2\"\u00a3\3\2"+
		"\2\2$\u00ac\3\2\2\2&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00b5\3\2\2\2,\u00b8"+
		"\3\2\2\2.\62\7\3\2\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2"+
		"\2\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\b\5\2<;\3\2"+
		"\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\5(\25\2BA\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\2\2\3H\3\3"+
		"\2\2\2IJ\7\4\2\2JK\7\17\2\2K\5\3\2\2\2LM\7\5\2\2MN\5\n\6\2N\7\3\2\2\2"+
		"OQ\5\f\7\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2R[\5\n\6\2SW\7\24\2\2TV\5\16\b"+
		"\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z\\\7\25"+
		"\2\2[S\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]b\7\20\2\2^_\7\6\2\2_a\7\20\2\2"+
		"`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\13\3\2\2\2db\3\2\2\2ef\7\20"+
		"\2\2fg\7\7\2\2g\r\3\2\2\2hi\5\n\6\2ij\5\20\t\2j\17\3\2\2\2kp\5\22\n\2"+
		"lp\5\b\5\2mp\5\24\13\2np\5\"\22\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2"+
		"\2\2p\21\3\2\2\2qy\7\n\2\2ry\7\13\2\2sy\7\f\2\2ty\7\r\2\2uy\7\16\2\2v"+
		"y\5*\26\2wy\7\b\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2"+
		"xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z\u0081\7\30\2\2{\u0082\5\26\f\2|\u0082"+
		"\5\30\r\2}\u0082\5\32\16\2~\u0082\5\34\17\2\177\u0082\5\36\20\2\u0080"+
		"\u0082\5 \21\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\7\31\2\2\u0084\25\3\2\2\2\u0085\u0087\7\13\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\27\3\2\2\2\u008a\u008c\7\f\2\2\u008b\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\31\3\2\2\2\u008f"+
		"\u0091\7\16\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\33\3\2\2\2\u0094\u0096\7\n\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\35\3\2\2\2\u0099\u009b\7\r\2\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\37\3\2\2\2\u009e"+
		"\u00a0\5\b\5\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2!\3\2\2\2\u00a3\u00a7\7\26\2\2\u00a4\u00a6"+
		"\5$\23\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\27"+
		"\2\2\u00ab#\3\2\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\5\20\t\2\u00ae%\3"+
		"\2\2\2\u00af\u00b0\t\2\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\5*\26\2\u00b2\u00b3"+
		"\5,\27\2\u00b3\u00b4\5\20\t\2\u00b4)\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6"+
		"\u00b7\7\20\2\2\u00b7+\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\7\20\2"+
		"\2\u00ba-\3\2\2\2\24\628>DPW[box\u0081\u0088\u008d\u0092\u0097\u009c\u00a1"+
		"\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}