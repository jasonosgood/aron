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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Boolean=11, Integer=12, Float=13, String=14, Timestamp=15, Url=16, 
		Word=17, LineComment=18, BlockComment=19, Whitespace=20;
	public static final int
		RULE_document = 0, RULE_include = 1, RULE_importDecl = 2, RULE_map = 3, 
		RULE_alias = 4, RULE_className = 5, RULE_pair = 6, RULE_value = 7, RULE_scalar = 8, 
		RULE_list = 9, RULE_key = 10, RULE_enumName = 11, RULE_override = 12, 
		RULE_reference = 13;
	public static final String[] ruleNames = {
		"document", "include", "importDecl", "map", "alias", "className", "pair", 
		"value", "scalar", "list", "key", "enumName", "override", "reference"
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
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ARONParser.EOF, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public List<OverrideContext> override() {
			return getRuleContexts(OverrideContext.class);
		}
		public OverrideContext override(int i) {
			return getRuleContext(OverrideContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				include();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(34);
				importDecl();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << Word))) != 0)) {
				{
				{
				setState(40);
				map();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(46);
				override();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(ARONParser.Url, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			className();
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
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(60);
				alias();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Word) {
				{
				setState(63);
				className();
				}
			}

			setState(66);
			match(T__2);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String || _la==Word) {
				{
				{
				setState(67);
				pair();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__3);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ARONParser.Word, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(76);
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

	public static class ClassNameContext extends ParserRuleContext {
		public List<TerminalNode> Word() { return getTokens(ARONParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(ARONParser.Word, i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(Word);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(79);
				match(T__5);
				setState(80);
				match(Word);
				}
				}
				setState(85);
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

	public static class PairContext extends ParserRuleContext {
		public KeyContext key;
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
		enterRule(_localctx, 12, RULE_pair);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				key();
				setState(87);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((PairContext)_localctx).key = key();
				 this.notifyErrorListeners( _localctx.start, "key " + (((PairContext)_localctx).key!=null?_input.getText(((PairContext)_localctx).key.start,((PairContext)_localctx).key.stop):null) + " is missing a value", null ); 
				}
				break;
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
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				scalar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				list();
				}
				break;
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
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(Boolean);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(Float);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(String);
				}
				break;
			case Timestamp:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(Timestamp);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				reference();
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				enumName();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				match(T__6);
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
		public List<TerminalNode> Boolean() { return getTokens(ARONParser.Boolean); }
		public TerminalNode Boolean(int i) {
			return getToken(ARONParser.Boolean, i);
		}
		public List<TerminalNode> Integer() { return getTokens(ARONParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(ARONParser.Integer, i);
		}
		public List<TerminalNode> Float() { return getTokens(ARONParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(ARONParser.Float, i);
		}
		public List<TerminalNode> String() { return getTokens(ARONParser.String); }
		public TerminalNode String(int i) {
			return getToken(ARONParser.String, i);
		}
		public List<TerminalNode> Timestamp() { return getTokens(ARONParser.Timestamp); }
		public TerminalNode Timestamp(int i) {
			return getToken(ARONParser.Timestamp, i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__7);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				{
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					match(Boolean);
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Boolean );
				}
				break;
			case Integer:
				{
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					match(Integer);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Integer );
				}
				break;
			case Float:
				{
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(Float);
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Float );
				}
				break;
			case String:
				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					match(String);
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==String );
				}
				break;
			case Timestamp:
				{
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					match(Timestamp);
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Timestamp );
				}
				break;
			case T__2:
			case T__4:
			case Word:
				{
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					map();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << Word))) != 0) );
				}
				break;
			case T__8:
				break;
			default:
				break;
			}
			setState(142);
			match(T__8);
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
		enterRule(_localctx, 20, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ARONParser.Word, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ARONListener ) ((ARONListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ARONVisitor ) return ((ARONVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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

	public static class OverrideContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
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
		enterRule(_localctx, 24, RULE_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			reference();
			setState(149);
			key();
			setState(150);
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
		enterRule(_localctx, 26, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__9);
			setState(153);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u009e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\5\5@\n\5\3\5\5"+
		"\5C\n\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7T\n\7\f\7\16\7W\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3"+
		"\t\5\td\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\6\13r\n"+
		"\13\r\13\16\13s\3\13\6\13w\n\13\r\13\16\13x\3\13\6\13|\n\13\r\13\16\13"+
		"}\3\13\6\13\u0081\n\13\r\13\16\13\u0082\3\13\6\13\u0086\n\13\r\13\16\13"+
		"\u0087\3\13\6\13\u008b\n\13\r\13\16\13\u008c\5\13\u008f\n\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2\20\20\23\23\2\u00ad\2!\3\2\2\2"+
		"\48\3\2\2\2\6;\3\2\2\2\b?\3\2\2\2\nM\3\2\2\2\fP\3\2\2\2\16^\3\2\2\2\20"+
		"c\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32"+
		"\u0096\3\2\2\2\34\u009a\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37"+
		"\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\5\6\4\2%$\3\2\2\2&)\3\2\2"+
		"\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\5\b\5\2+*\3\2\2\2,/\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2\60\62\5\32\16\2\61\60"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63"+
		"\3\2\2\2\66\67\7\2\2\3\67\3\3\2\2\289\7\3\2\29:\7\22\2\2:\5\3\2\2\2;<"+
		"\7\4\2\2<=\5\f\7\2=\7\3\2\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2"+
		"AC\5\f\7\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DH\7\5\2\2EG\5\16\b\2FE\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\6\2\2L\t\3\2"+
		"\2\2MN\7\7\2\2NO\7\23\2\2O\13\3\2\2\2PU\7\23\2\2QR\7\b\2\2RT\7\23\2\2"+
		"SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2XY\5\26\f"+
		"\2YZ\5\20\t\2Z_\3\2\2\2[\\\5\26\f\2\\]\b\b\1\2]_\3\2\2\2^X\3\2\2\2^[\3"+
		"\2\2\2_\17\3\2\2\2`d\5\b\5\2ad\5\22\n\2bd\5\24\13\2c`\3\2\2\2ca\3\2\2"+
		"\2cb\3\2\2\2d\21\3\2\2\2en\7\r\2\2fn\7\16\2\2gn\7\17\2\2hn\7\20\2\2in"+
		"\7\21\2\2jn\5\34\17\2kn\5\30\r\2ln\7\t\2\2me\3\2\2\2mf\3\2\2\2mg\3\2\2"+
		"\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\23\3\2\2\2o\u008e"+
		"\7\n\2\2pr\7\r\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u008f\3\2"+
		"\2\2uw\7\16\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u008f\3\2\2\2"+
		"z|\7\17\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u008f\3\2\2\2\177"+
		"\u0081\7\20\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u008f\3\2\2\2\u0084\u0086\7\21\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008f\3\2\2\2\u0089\u008b\5\b\5\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008eq\3\2\2\2\u008ev\3\2\2\2\u008e{\3\2\2\2\u008e\u0080\3\2\2\2"+
		"\u008e\u0085\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\7\13\2\2\u0091\25\3\2\2\2\u0092\u0093\t\2\2\2\u0093"+
		"\27\3\2\2\2\u0094\u0095\7\23\2\2\u0095\31\3\2\2\2\u0096\u0097\5\34\17"+
		"\2\u0097\u0098\5\26\f\2\u0098\u0099\5\20\t\2\u0099\33\3\2\2\2\u009a\u009b"+
		"\7\f\2\2\u009b\u009c\7\23\2\2\u009c\35\3\2\2\2\24!\'-\63?BHU^cmsx}\u0082"+
		"\u0087\u008c\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}