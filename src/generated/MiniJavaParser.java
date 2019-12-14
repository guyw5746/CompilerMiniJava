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
		T__43=1, T__42=2, T__41=3, T__40=4, T__39=5, T__38=6, T__37=7, T__36=8, 
		T__35=9, T__34=10, T__33=11, T__32=12, T__31=13, T__30=14, T__29=15, T__28=16, 
		T__27=17, T__26=18, T__25=19, T__24=20, T__23=21, T__22=22, T__21=23, 
		T__20=24, T__19=25, T__18=26, T__17=27, T__16=28, T__15=29, T__14=30, 
		T__13=31, T__12=32, T__11=33, T__10=34, T__9=35, T__8=36, T__7=37, T__6=38, 
		T__5=39, T__4=40, T__3=41, T__2=42, T__1=43, T__0=44, INTEGER=45, IDENTIFIER=46, 
		WS=47;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'main'", "'true'", "'new'", "'return'", "'!='", "'class'", 
		"'||'", "'while'", "'void'", "';'", "'{'", "'&&'", "'='", "'}'", "'if'", 
		"'<='", "'int'", "'null'", "'('", "'*'", "'this'", "','", "'false'", "'.'", 
		"'out'", "'boolean'", "'println'", "'>='", "'['", "'=='", "'<'", "'String'", 
		"']'", "'public'", "'>'", "'!'", "'static'", "'%'", "'System'", "'else'", 
		"')'", "'+'", "'-'", "INTEGER", "IDENTIFIER", "WS"
	};
	public static final int
		RULE_translationUnit = 0, RULE_classDeclaration = 1, RULE_classMember = 2, 
		RULE_field = 3, RULE_mainMethod = 4, RULE_method = 5, RULE_parameters = 6, 
		RULE_parameter = 7, RULE_type = 8, RULE_statement = 9, RULE_block = 10, 
		RULE_ifStatement = 11, RULE_whileStatement = 12, RULE_emptyStatement = 13, 
		RULE_printStatement = 14, RULE_expressionStatement = 15, RULE_returnStatement = 16, 
		RULE_blockStatement = 17, RULE_localVariableDeclarationStatement = 18, 
		RULE_expression = 19, RULE_primaryExpression = 20, RULE_expressionList = 21;
	public static final String[] ruleNames = {
		"translationUnit", "classDeclaration", "classMember", "field", "mainMethod", 
		"method", "parameters", "parameter", "type", "statement", "block", "ifStatement", 
		"whileStatement", "emptyStatement", "printStatement", "expressionStatement", 
		"returnStatement", "blockStatement", "localVariableDeclarationStatement", 
		"expression", "primaryExpression", "expressionList"
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
	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(44); classDeclaration();
				}
				}
				setState(49);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(T__37);
			setState(51); match(IDENTIFIER);
			setState(52); match(T__32);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(53); classMember();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); match(T__29);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classMember);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); mainMethod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); method();
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

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(T__9);
			setState(67); type();
			setState(68); match(IDENTIFIER);
			setState(69); match(T__33);
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

	public static class MainMethodContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethod(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T__9);
			setState(72); match(T__6);
			setState(73); match(T__34);
			setState(74); match(T__42);
			setState(75); match(T__24);
			setState(76); match(T__11);
			setState(77); match(T__14);
			setState(78); match(T__10);
			setState(79); match(IDENTIFIER);
			setState(80); match(T__2);
			setState(81); match(T__32);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__28) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__20) | (1L << T__17) | (1L << T__7) | (1L << T__4) | (1L << T__0) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(82); blockStatement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(T__29);
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(T__9);
				setState(91); type();
				setState(92); match(IDENTIFIER);
				setState(93); match(T__24);
				setState(94); match(T__2);
				setState(95); match(T__32);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__28) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__20) | (1L << T__17) | (1L << T__7) | (1L << T__4) | (1L << T__0) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(96); blockStatement();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102); match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(T__9);
				setState(105); type();
				setState(106); match(IDENTIFIER);
				setState(107); match(T__24);
				setState(108); parameters();
				setState(109); match(T__2);
				setState(110); match(T__32);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__28) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__20) | (1L << T__17) | (1L << T__7) | (1L << T__4) | (1L << T__0) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(111); blockStatement();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117); match(T__29);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			setState(130);
			switch (_input.LA(1)) {
			case T__34:
			case T__26:
			case T__17:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); parameter();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(122); match(T__21);
					setState(123); parameter();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); type();
			setState(133); match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__26) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); block();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); printStatement();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); ifStatement();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); whileStatement();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(141); emptyStatement();
				}
				break;
			case T__41:
			case T__40:
			case T__25:
			case T__24:
			case T__22:
			case T__20:
			case T__7:
			case T__0:
			case INTEGER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(142); expressionStatement();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 7);
				{
				setState(143); returnStatement();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(T__32);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__28) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__20) | (1L << T__17) | (1L << T__7) | (1L << T__4) | (1L << T__0) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(147); blockStatement();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153); match(T__29);
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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(T__28);
				setState(156); match(T__24);
				setState(157); expression(0);
				setState(158); match(T__2);
				setState(159); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(T__28);
				setState(162); match(T__24);
				setState(163); expression(0);
				setState(164); match(T__2);
				setState(165); statement();
				{
				setState(166); match(T__3);
				setState(167); statement();
				}
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(T__35);
			setState(172); match(T__24);
			setState(173); expression(0);
			setState(174); match(T__2);
			setState(175); statement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(T__33);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(T__4);
			setState(180); match(T__19);
			setState(181); match(T__18);
			setState(182); match(T__19);
			setState(183); match(T__16);
			setState(184); match(T__24);
			setState(185); expression(0);
			setState(186); match(T__2);
			setState(187); match(T__33);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); expression(0);
			setState(190); match(T__33);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(T__39);
				setState(193); match(T__33);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(T__39);
				setState(195); expression(0);
				setState(196); match(T__33);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockStatement);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); localVariableDeclarationStatement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_localVariableDeclarationStatement);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); type();
				setState(205); match(IDENTIFIER);
				setState(206); match(T__33);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); type();
				setState(209); match(IDENTIFIER);
				{
				setState(210); match(T__30);
				setState(211); expression(0);
				}
				setState(213); match(T__33);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			switch (_input.LA(1)) {
			case T__7:
			case T__0:
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(219); expression(8);
				}
				break;
			case T__41:
			case T__25:
			case T__24:
			case T__22:
			case T__20:
			case INTEGER:
			case IDENTIFIER:
				{
				setState(220); primaryExpression();
				}
				break;
			case T__40:
				{
				setState(221); match(T__40);
				setState(222); match(IDENTIFIER);
				setState(223); match(T__24);
				setState(224); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__23) | (1L << T__5))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(229); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(232); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__15) | (1L << T__12) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(235); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(238); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240); match(T__31);
						setState(241); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243); match(T__36);
						setState(244); expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(246); match(T__30);
						setState(247); expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(249); match(T__19);
						setState(250); match(IDENTIFIER);
						setState(251); match(T__24);
						setState(252); match(T__2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(254); match(T__19);
						setState(255); match(IDENTIFIER);
						setState(256); match(T__24);
						setState(257); expressionList();
						setState(258); match(T__2);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primaryExpression);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); match(T__24);
				setState(266); expression(0);
				setState(267); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270); match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271); match(T__20);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272); match(T__41);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273); match(INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274); match(IDENTIFIER);
				setState(275); match(T__24);
				setState(276); match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277); match(IDENTIFIER);
				setState(278); match(T__24);
				setState(279); expressionList();
				setState(280); match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282); match(IDENTIFIER);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); expression(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(286); match(T__21);
				setState(287); expression(0);
				}
				}
				setState(292);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		case 6: return precpred(_ctx, 1);
		case 7: return precpred(_ctx, 11);
		case 8: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4"+
		"\3\4\5\4C\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"s\n\7\f\7\16\7v\13\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b"+
		"\u0082\13\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00ac\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c9\n\22\3\23\3\23\5\23\u00cd\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00da\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00e4\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0107"+
		"\n\25\f\25\16\25\u010a\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011e\n\26\3\27"+
		"\3\27\3\27\7\27\u0123\n\27\f\27\16\27\u0126\13\27\3\27\2\3(\30\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\b\6\2\f\f\24\24\35\35\60\60"+
		"\4\2\'\'..\5\2\3\3\27\27))\3\2-.\6\2\23\23\37\37\"\"&&\4\2\b\b!!\u013a"+
		"\2\61\3\2\2\2\4\64\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nI\3\2\2\2\fy\3\2\2\2"+
		"\16\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u0089\3\2\2\2\24\u0092\3\2\2\2\26"+
		"\u0094\3\2\2\2\30\u00ab\3\2\2\2\32\u00ad\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5"+
		"\3\2\2\2 \u00bf\3\2\2\2\"\u00c8\3\2\2\2$\u00cc\3\2\2\2&\u00d9\3\2\2\2"+
		"(\u00e3\3\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65"+
		"\7\t\2\2\65\66\7\60\2\2\66:\7\16\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\21\2\2>\5\3\2\2\2?C\5\b\5"+
		"\2@C\5\n\6\2AC\5\f\7\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DE\7%\2"+
		"\2EF\5\22\n\2FG\7\60\2\2GH\7\r\2\2H\t\3\2\2\2IJ\7%\2\2JK\7(\2\2KL\7\f"+
		"\2\2LM\7\4\2\2MN\7\26\2\2NO\7#\2\2OP\7 \2\2PQ\7$\2\2QR\7\60\2\2RS\7,\2"+
		"\2SW\7\16\2\2TV\5$\23\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2"+
		"\2\2YW\3\2\2\2Z[\7\21\2\2[\13\3\2\2\2\\]\7%\2\2]^\5\22\n\2^_\7\60\2\2"+
		"_`\7\26\2\2`a\7,\2\2ae\7\16\2\2bd\5$\23\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\21\2\2iz\3\2\2\2jk\7%\2\2kl\5\22"+
		"\n\2lm\7\60\2\2mn\7\26\2\2no\5\16\b\2op\7,\2\2pt\7\16\2\2qs\5$\23\2rq"+
		"\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\21\2\2"+
		"xz\3\2\2\2y\\\3\2\2\2yj\3\2\2\2z\r\3\2\2\2{\u0080\5\20\t\2|}\7\31\2\2"+
		"}\177\5\20\t\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0085\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"{\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\5\22\n\2\u0087"+
		"\u0088\7\60\2\2\u0088\21\3\2\2\2\u0089\u008a\t\2\2\2\u008a\23\3\2\2\2"+
		"\u008b\u0093\5\26\f\2\u008c\u0093\5\36\20\2\u008d\u0093\5\30\r\2\u008e"+
		"\u0093\5\32\16\2\u008f\u0093\5\34\17\2\u0090\u0093\5 \21\2\u0091\u0093"+
		"\5\"\22\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\25\3\2\2\2\u0094\u0098\7\16\2\2\u0095\u0097\5$\23\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\21\2\2\u009c"+
		"\27\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\5(\25"+
		"\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00ac\3\2\2\2\u00a3"+
		"\u00a4\7\22\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\7"+
		",\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7+\2\2\u00a9\u00aa\5\24\13\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac\31\3\2\2"+
		"\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0\5(\25\2\u00b0"+
		"\u00b1\7,\2\2\u00b1\u00b2\5\24\13\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\r\2"+
		"\2\u00b4\35\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8"+
		"\7\34\2\2\u00b8\u00b9\7\33\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\7\26\2"+
		"\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7,\2\2\u00bd\u00be\7\r\2\2\u00be\37"+
		"\3\2\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\7\r\2\2\u00c1!\3\2\2\2\u00c2"+
		"\u00c3\7\7\2\2\u00c3\u00c9\7\r\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5("+
		"\25\2\u00c6\u00c7\7\r\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00cd\5\24\13\2\u00cb\u00cd\5&\24"+
		"\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf"+
		"\5\22\n\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00da\3\2\2\2"+
		"\u00d2\u00d3\5\22\n\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\20\2\2\u00d5"+
		"\u00d6\5(\25\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da\'\3\2\2\2\u00db\u00dc"+
		"\b\25\1\2\u00dc\u00dd\t\3\2\2\u00dd\u00e4\5(\25\n\u00de\u00e4\5*\26\2"+
		"\u00df\u00e0\7\6\2\2\u00e0\u00e1\7\60\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e4"+
		"\7,\2\2\u00e3\u00db\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"\u0108\3\2\2\2\u00e5\u00e6\f\t\2\2\u00e6\u00e7\t\4\2\2\u00e7\u0107\5("+
		"\25\n\u00e8\u00e9\f\b\2\2\u00e9\u00ea\t\5\2\2\u00ea\u0107\5(\25\t\u00eb"+
		"\u00ec\f\7\2\2\u00ec\u00ed\t\6\2\2\u00ed\u0107\5(\25\b\u00ee\u00ef\f\6"+
		"\2\2\u00ef\u00f0\t\7\2\2\u00f0\u0107\5(\25\7\u00f1\u00f2\f\5\2\2\u00f2"+
		"\u00f3\7\17\2\2\u00f3\u0107\5(\25\6\u00f4\u00f5\f\4\2\2\u00f5\u00f6\7"+
		"\n\2\2\u00f6\u0107\5(\25\5\u00f7\u00f8\f\3\2\2\u00f8\u00f9\7\20\2\2\u00f9"+
		"\u0107\5(\25\4\u00fa\u00fb\f\r\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7"+
		"\60\2\2\u00fd\u00fe\7\26\2\2\u00fe\u0107\7,\2\2\u00ff\u0100\f\f\2\2\u0100"+
		"\u0101\7\33\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7\26\2\2\u0103\u0104"+
		"\5,\27\2\u0104\u0105\7,\2\2\u0105\u0107\3\2\2\2\u0106\u00e5\3\2\2\2\u0106"+
		"\u00e8\3\2\2\2\u0106\u00eb\3\2\2\2\u0106\u00ee\3\2\2\2\u0106\u00f1\3\2"+
		"\2\2\u0106\u00f4\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u00fa\3\2\2\2\u0106"+
		"\u00ff\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109)\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\26\2\2\u010c\u010d"+
		"\5(\25\2\u010d\u010e\7,\2\2\u010e\u011e\3\2\2\2\u010f\u011e\7\30\2\2\u0110"+
		"\u011e\7\25\2\2\u0111\u011e\7\32\2\2\u0112\u011e\7\5\2\2\u0113\u011e\7"+
		"/\2\2\u0114\u0115\7\60\2\2\u0115\u0116\7\26\2\2\u0116\u011e\7,\2\2\u0117"+
		"\u0118\7\60\2\2\u0118\u0119\7\26\2\2\u0119\u011a\5,\27\2\u011a\u011b\7"+
		",\2\2\u011b\u011e\3\2\2\2\u011c\u011e\7\60\2\2\u011d\u010b\3\2\2\2\u011d"+
		"\u010f\3\2\2\2\u011d\u0110\3\2\2\2\u011d\u0111\3\2\2\2\u011d\u0112\3\2"+
		"\2\2\u011d\u0113\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0117\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e+\3\2\2\2\u011f\u0124\5(\25\2\u0120\u0121\7\31\2\2"+
		"\u0121\u0123\5(\25\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125-\3\2\2\2\u0126\u0124\3\2\2\2\26\61"+
		":BWety\u0080\u0084\u0092\u0098\u00ab\u00c8\u00cc\u00d9\u00e3\u0106\u0108"+
		"\u011d\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}