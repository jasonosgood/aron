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
		T__9=10, T__10=11, T__11=12, Boolean=13, Integer=14, Float=15, String=16, 
		Timestamp=17, Url=18, Word=19, LineComment=20, BlockComment=21, Whitespace=22;
	public static final int
		RULE_document = 0, RULE_include = 1, RULE_importDecl = 2, RULE_override = 3, 
		RULE_alias = 4, RULE_className = 5, RULE_map = 6, RULE_list = 7, RULE_pair = 8, 
		RULE_value = 9, RULE_scalar = 10, RULE_key = 11, RULE_enumName = 12, RULE_reference = 13;
	public static final String[] ruleNames = {
		"document", "include", "importDecl", "override", "alias", "className", 
		"map", "list", "pair", "value", "scalar", "key", "enumName", "reference"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'import'", "'@'", "'.'", "'{'", "'}'", "'['", "','", 
		"']'", "':'", "'null'", "'#'"
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
			while (_la==T__11) {
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
		enterRule(_localctx, 6, RULE_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			reference();
			setState(61);
			key();
			setState(62);
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
			setState(64);
			match(T__2);
			setState(65);
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
			setState(67);
			match(Word);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(68);
				match(T__3);
				setState(69);
				match(Word);
				}
				}
				setState(74);
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
		enterRule(_localctx, 12, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(75);
				alias();
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Word) {
				{
				setState(78);
				className();
				}
			}

			setState(81);
			match(T__4);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String || _la==Word) {
				{
				{
				setState(82);
				pair();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__5);
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
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(90);
				alias();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Word) {
				{
				setState(93);
				className();
				}
			}

			setState(96);
			match(T__6);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				{
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					match(Boolean);
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(98);
						match(T__7);
						}
					}

					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Boolean );
				}
				break;
			case Integer:
				{
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					match(Integer);
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(106);
						match(T__7);
						}
					}

					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Integer );
				}
				break;
			case Float:
				{
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(Float);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(114);
						match(T__7);
						}
					}

					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Float );
				}
				break;
			case String:
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121);
					match(String);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(122);
						match(T__7);
						}
					}

					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==String );
				}
				break;
			case Timestamp:
				{
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(Timestamp);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(130);
						match(T__7);
						}
					}

					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Timestamp );
				}
				break;
			case T__2:
			case T__4:
			case Word:
				{
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					map();
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(138);
						match(T__7);
						}
					}

					}
					}
					setState(143); 
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
			setState(147);
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
		enterRule(_localctx, 16, RULE_pair);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				key();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(150);
					match(T__9);
					}
				}

				setState(153);
				value();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(154);
					match(T__7);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				scalar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
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
		enterRule(_localctx, 20, RULE_scalar);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(Boolean);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(Float);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(String);
				}
				break;
			case Timestamp:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(Timestamp);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				reference();
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				enumName();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				match(T__10);
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
		enterRule(_localctx, 22, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 24, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
			setState(181);
			match(T__11);
			setState(182);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\5\bO\n\b\3\b\5\bR\n"+
		"\b\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\t\5\t^\n\t\3\t\5\ta\n\t\3"+
		"\t\3\t\3\t\5\tf\n\t\6\th\n\t\r\t\16\ti\3\t\3\t\5\tn\n\t\6\tp\n\t\r\t\16"+
		"\tq\3\t\3\t\5\tv\n\t\6\tx\n\t\r\t\16\ty\3\t\3\t\5\t~\n\t\6\t\u0080\n\t"+
		"\r\t\16\t\u0081\3\t\3\t\5\t\u0086\n\t\6\t\u0088\n\t\r\t\16\t\u0089\3\t"+
		"\3\t\5\t\u008e\n\t\6\t\u0090\n\t\r\t\16\t\u0091\5\t\u0094\n\t\3\t\3\t"+
		"\3\n\3\n\5\n\u009a\n\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n\3\n\5\n\u00a3\n\n"+
		"\3\13\3\13\3\13\5\13\u00a8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\3\4\2\22\22\25\25\2\u00d4\2!\3\2\2\2\48\3\2\2\2\6;\3"+
		"\2\2\2\b>\3\2\2\2\nB\3\2\2\2\fE\3\2\2\2\16N\3\2\2\2\20]\3\2\2\2\22\u00a2"+
		"\3\2\2\2\24\u00a7\3\2\2\2\26\u00b1\3\2\2\2\30\u00b3\3\2\2\2\32\u00b5\3"+
		"\2\2\2\34\u00b7\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2"+
		"\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\5\6\4\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\5\16\b\2+*\3\2\2\2,/\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2"+
		"\66\67\7\2\2\3\67\3\3\2\2\289\7\3\2\29:\7\24\2\2:\5\3\2\2\2;<\7\4\2\2"+
		"<=\5\f\7\2=\7\3\2\2\2>?\5\34\17\2?@\5\30\r\2@A\5\24\13\2A\t\3\2\2\2BC"+
		"\7\5\2\2CD\7\25\2\2D\13\3\2\2\2EJ\7\25\2\2FG\7\6\2\2GI\7\25\2\2HF\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LJ\3\2\2\2MO\5\n\6\2NM\3"+
		"\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\f\7\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SW\7"+
		"\7\2\2TV\5\22\n\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW"+
		"\3\2\2\2Z[\7\b\2\2[\17\3\2\2\2\\^\5\n\6\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_a\5\f\7\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2b\u0093\7\t\2\2ce\7\17\2\2d"+
		"f\7\n\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gc\3\2\2\2hi\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2j\u0094\3\2\2\2km\7\20\2\2ln\7\n\2\2ml\3\2\2\2mn\3\2\2\2np\3"+
		"\2\2\2ok\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0094\3\2\2\2su\7\21\2"+
		"\2tv\7\n\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2ws\3\2\2\2xy\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z\u0094\3\2\2\2{}\7\22\2\2|~\7\n\2\2}|\3\2\2\2}~\3\2\2\2~"+
		"\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0094\3\2\2\2\u0083\u0085\7\23\2\2\u0084\u0086\7"+
		"\n\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u0094\3\2\2\2\u008b\u008d\5\16\b\2\u008c\u008e\7\n\2\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093g\3\2\2\2\u0093o\3\2\2\2\u0093w\3\2\2\2\u0093\177"+
		"\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7\13\2\2\u0096\21\3\2\2\2\u0097\u0099\5\30"+
		"\r\2\u0098\u009a\7\f\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\5\24\13\2\u009c\u009e\7\n\2\2\u009d\u009c\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u00a0\5\30\r\2\u00a0"+
		"\u00a1\b\n\1\2\u00a1\u00a3\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\23\3\2\2\2\u00a4\u00a8\5\16\b\2\u00a5\u00a8\5\26\f\2\u00a6"+
		"\u00a8\5\20\t\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\25\3\2\2\2\u00a9\u00b2\7\17\2\2\u00aa\u00b2\7\20\2\2\u00ab"+
		"\u00b2\7\21\2\2\u00ac\u00b2\7\22\2\2\u00ad\u00b2\7\23\2\2\u00ae\u00b2"+
		"\5\34\17\2\u00af\u00b2\5\32\16\2\u00b0\u00b2\7\r\2\2\u00b1\u00a9\3\2\2"+
		"\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00b4\t\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\7\25\2\2"+
		"\u00b6\33\3\2\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\7\25\2\2\u00b9\35\3"+
		"\2\2\2\36!\'-\63JNQW]`eimquy}\u0081\u0085\u0089\u008d\u0091\u0093\u0099"+
		"\u009d\u00a2\u00a7\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}