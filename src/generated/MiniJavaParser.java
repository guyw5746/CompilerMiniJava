package generated;
// Generated from MiniJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, IntegerLiteral=32, 
		Identifier=33, Digit=34, Operator=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'='", "'extends'", "'}'", "'if'", 
		"'[]'", "'int'", "'('", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'String'", "']'", "'public'", "'!'", "'static'", 
		"'else'", "')'", "IntegerLiteral", "Identifier", "Digit", "Operator"
	};
	public static final int
		RULE_compileUnit = 0, RULE_mainClass = 1, RULE_classDecl = 2, RULE_varDecl = 3, 
		RULE_methodDecl = 4, RULE_formalList = 5, RULE_formalRest = 6, RULE_type = 7, 
		RULE_statement = 8, RULE_exp = 9, RULE_expList = 10, RULE_expRest = 11, 
		RULE_id = 12;
	public static final String[] ruleNames = {
		"compileUnit", "mainClass", "classDecl", "varDecl", "methodDecl", "formalList", 
		"formalRest", "type", "statement", "exp", "expList", "expRest", "id"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompileUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCompileUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCompileUnit(this);
		}
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); mainClass();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(27); classDecl();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(T__25);
			setState(36); id();
			setState(37); match(T__21);
			setState(38); match(T__4);
			setState(39); match(T__2);
			setState(40); match(T__22);
			setState(41); match(T__30);
			setState(42); match(T__14);
			setState(43); match(T__6);
			setState(44); match(T__16);
			setState(45); match(Identifier);
			setState(46); match(T__0);
			setState(47); match(T__21);
			setState(48); statement();
			setState(49); match(T__18);
			setState(50); match(T__18);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(T__25);
				setState(53); match(Identifier);
				setState(54); match(T__21);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << Identifier))) != 0)) {
					{
					{
					setState(55); varDecl();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(61); methodDecl();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67); match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); match(T__25);
				setState(69); match(Identifier);
				setState(70); match(T__19);
				setState(71); match(Identifier);
				setState(72); match(T__21);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << Identifier))) != 0)) {
					{
					{
					setState(73); varDecl();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(79); methodDecl();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85); match(T__18);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); type();
			setState(89); match(Identifier);
			setState(90); match(T__23);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(T__4);
			setState(93); type();
			setState(94); match(Identifier);
			setState(95); match(T__14);
			setState(96); formalList();
			setState(97); match(T__0);
			setState(98); match(T__21);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99); varDecl();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__17) | (1L << T__8) | (1L << Identifier))) != 0)) {
				{
				{
				setState(105); statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); match(T__26);
			setState(112); exp(0);
			setState(113); match(T__23);
			setState(114); match(T__18);
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

	public static class FormalListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalRestContext formalRest(int i) {
			return getRuleContext(FormalRestContext.class,i);
		}
		public List<FormalRestContext> formalRest() {
			return getRuleContexts(FormalRestContext.class);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << Identifier))) != 0)) {
				{
				setState(116); type();
				setState(117); match(Identifier);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(118); formalRest();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FormalRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalRest(this);
		}
	}

	public final FormalRestContext formalRest() throws RecognitionException {
		FormalRestContext _localctx = new FormalRestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(T__12);
			setState(127); type();
			setState(128); match(Identifier);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(T__15);
				setState(131); match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(T__21);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__17) | (1L << T__8) | (1L << Identifier))) != 0)) {
					{
					{
					setState(138); statement();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144); match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(T__17);
				setState(146); match(T__14);
				setState(147); exp(0);
				setState(148); match(T__0);
				setState(149); statement();
				setState(150); match(T__1);
				setState(151); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153); match(T__24);
				setState(154); match(T__14);
				setState(155); exp(0);
				setState(156); match(T__0);
				setState(157); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(T__8);
				setState(160); match(T__14);
				setState(161); exp(0);
				setState(162); match(T__0);
				setState(163); match(T__23);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165); match(Identifier);
				setState(166); match(T__20);
				setState(167); exp(0);
				setState(168); match(T__23);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170); match(Identifier);
				setState(171); match(T__7);
				setState(172); exp(0);
				setState(173); match(T__5);
				setState(174); match(T__20);
				setState(175); exp(0);
				setState(176); match(T__23);
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

	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(MiniJavaParser.IntegerLiteral, 0); }
		public TerminalNode Operator() { return getToken(MiniJavaParser.Operator, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(181); match(T__3);
				setState(182); exp(2);
				}
				break;
			case 2:
				{
				setState(183); match(IntegerLiteral);
				}
				break;
			case 3:
				{
				setState(184); match(T__27);
				}
				break;
			case 4:
				{
				setState(185); match(T__11);
				}
				break;
			case 5:
				{
				setState(186); match(Identifier);
				}
				break;
			case 6:
				{
				setState(187); match(T__13);
				}
				break;
			case 7:
				{
				setState(188); match(T__28);
				setState(189); match(T__15);
				setState(190); match(T__7);
				setState(191); exp(0);
				setState(192); match(T__5);
				}
				break;
			case 8:
				{
				setState(194); match(T__28);
				setState(195); match(Identifier);
				setState(196); match(T__14);
				setState(197); match(T__0);
				}
				break;
			case 9:
				{
				setState(198); match(T__14);
				setState(199); exp(0);
				setState(200); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(204);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(205); match(Operator);
						setState(206); exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(207);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(208); match(T__7);
						setState(209); exp(0);
						setState(210); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(212);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(213); match(T__10);
						setState(214); match(T__29);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216); match(T__10);
						setState(217); match(Identifier);
						setState(218); match(T__14);
						setState(219); expList();
						setState(220); match(T__0);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpListContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ExpRestContext> expRest() {
			return getRuleContexts(ExpRestContext.class);
		}
		public ExpRestContext expRest(int i) {
			return getRuleContext(ExpRestContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpList(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__27) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__3) | (1L << IntegerLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(227); exp(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(228); expRest();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ExpRestContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpRest(this);
		}
	}

	public final ExpRestContext expRest() throws RecognitionException {
		ExpRestContext _localctx = new ExpRestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(T__12);
			setState(237); exp(0);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(Identifier);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\7\4A\n\4\f\4\16\4D\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\7\4S\n\4\f\4\16"+
		"\4V\13\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6g\n\6\f\6\16\6j\13\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00b5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cd\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00e1\n\13\f\13\16\13\u00e4\13\13\3\f\3\f\7"+
		"\f\u00e8\n\f\f\f\16\f\u00eb\13\f\5\f\u00ed\n\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\2\3\24\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\u0107\2\34\3\2\2\2"+
		"\4%\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n^\3\2\2\2\f~\3\2\2\2\16\u0080\3\2\2"+
		"\2\20\u0089\3\2\2\2\22\u00b4\3\2\2\2\24\u00cc\3\2\2\2\26\u00ec\3\2\2\2"+
		"\30\u00ee\3\2\2\2\32\u00f1\3\2\2\2\34 \5\4\3\2\35\37\5\6\4\2\36\35\3\2"+
		"\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3"+
		"$\3\3\2\2\2%&\7\b\2\2&\'\5\32\16\2\'(\7\f\2\2()\7\35\2\2)*\7\37\2\2*+"+
		"\7\13\2\2+,\7\3\2\2,-\7\23\2\2-.\7\33\2\2./\7\21\2\2/\60\7#\2\2\60\61"+
		"\7!\2\2\61\62\7\f\2\2\62\63\5\22\n\2\63\64\7\17\2\2\64\65\7\17\2\2\65"+
		"\5\3\2\2\2\66\67\7\b\2\2\678\7#\2\28<\7\f\2\29;\5\b\5\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\n\6\2@?\3\2\2\2AD\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EY\7\17\2\2FG\7\b\2\2GH"+
		"\7#\2\2HI\7\16\2\2IJ\7#\2\2JN\7\f\2\2KM\5\b\5\2LK\3\2\2\2MP\3\2\2\2NL"+
		"\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\5\n\6\2RQ\3\2\2\2SV\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WY\7\17\2\2X\66\3\2\2\2XF\3\2\2"+
		"\2Y\7\3\2\2\2Z[\5\20\t\2[\\\7#\2\2\\]\7\n\2\2]\t\3\2\2\2^_\7\35\2\2_`"+
		"\5\20\t\2`a\7#\2\2ab\7\23\2\2bc\5\f\7\2cd\7!\2\2dh\7\f\2\2eg\5\b\5\2f"+
		"e\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2in\3\2\2\2jh\3\2\2\2km\5\22\n\2"+
		"lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\7\2\2"+
		"rs\5\24\13\2st\7\n\2\2tu\7\17\2\2u\13\3\2\2\2vw\5\20\t\2w{\7#\2\2xz\5"+
		"\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"~v\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0082"+
		"\5\20\t\2\u0082\u0083\7#\2\2\u0083\17\3\2\2\2\u0084\u0085\7\22\2\2\u0085"+
		"\u008a\7\21\2\2\u0086\u008a\7\30\2\2\u0087\u008a\7\22\2\2\u0088\u008a"+
		"\7#\2\2\u0089\u0084\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\21\3\2\2\2\u008b\u008f\7\f\2\2\u008c\u008e\5\22\n"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u00b5\7\17\2\2"+
		"\u0093\u0094\7\20\2\2\u0094\u0095\7\23\2\2\u0095\u0096\5\24\13\2\u0096"+
		"\u0097\7!\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7 \2\2\u0099\u009a\5\22"+
		"\n\2\u009a\u00b5\3\2\2\2\u009b\u009c\7\t\2\2\u009c\u009d\7\23\2\2\u009d"+
		"\u009e\5\24\13\2\u009e\u009f\7!\2\2\u009f\u00a0\5\22\n\2\u00a0\u00b5\3"+
		"\2\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\5\24\13\2"+
		"\u00a4\u00a5\7!\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00b5\3\2\2\2\u00a7\u00a8"+
		"\7#\2\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7\n\2\2"+
		"\u00ab\u00b5\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7\32\2\2\u00ae\u00af"+
		"\5\24\13\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\5\24\13"+
		"\2\u00b2\u00b3\7\n\2\2\u00b3\u00b5\3\2\2\2\u00b4\u008b\3\2\2\2\u00b4\u0093"+
		"\3\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u00a1\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\b\13\1\2\u00b7\u00b8\7\36"+
		"\2\2\u00b8\u00cd\5\24\13\4\u00b9\u00cd\7\"\2\2\u00ba\u00cd\7\6\2\2\u00bb"+
		"\u00cd\7\26\2\2\u00bc\u00cd\7#\2\2\u00bd\u00cd\7\24\2\2\u00be\u00bf\7"+
		"\5\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00c2\5\24\13\2"+
		"\u00c2\u00c3\7\34\2\2\u00c3\u00cd\3\2\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\u00c7\7\23\2\2\u00c7\u00cd\7!\2\2\u00c8\u00c9\7\23\2\2\u00c9"+
		"\u00ca\5\24\13\2\u00ca\u00cb\7!\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00b6\3"+
		"\2\2\2\u00cc\u00b9\3\2\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc"+
		"\u00bc\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00c4\3\2"+
		"\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00e2\3\2\2\2\u00ce\u00cf\f\17\2\2\u00cf"+
		"\u00d0\7%\2\2\u00d0\u00e1\5\24\13\20\u00d1\u00d2\f\16\2\2\u00d2\u00d3"+
		"\7\32\2\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\7\34\2\2\u00d5\u00e1\3\2\2"+
		"\2\u00d6\u00d7\f\r\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00e1\7\4\2\2\u00d9"+
		"\u00da\f\f\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd\7\23"+
		"\2\2\u00dd\u00de\5\26\f\2\u00de\u00df\7!\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00ce\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d9\3\2"+
		"\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\25\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\5\24\13\2\u00e6\u00e8\5\30"+
		"\r\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e5\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0"+
		"\5\24\13\2\u00f0\31\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\33\3\2\2\2\24 <B"+
		"NTXhn{~\u0089\u008f\u00b4\u00cc\u00e0\u00e2\u00e9\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}