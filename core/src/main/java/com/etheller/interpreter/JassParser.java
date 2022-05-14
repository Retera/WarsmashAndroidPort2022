// Generated from Jass.g4 by ANTLR 4.4

	package com.etheller.interpreter;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, EQUALS=16, GLOBALS=17, 
		ENDGLOBALS=18, NATIVE=19, FUNCTION=20, TAKES=21, RETURNS=22, ENDFUNCTION=23, 
		NOTHING=24, CALL=25, SET=26, RETURN=27, ARRAY=28, TYPE=29, EXTENDS=30, 
		IF=31, THEN=32, ELSE=33, ENDIF=34, ELSEIF=35, CONSTANT=36, LOCAL=37, LOOP=38, 
		ENDLOOP=39, EXITWHEN=40, DEBUG=41, STRING_LITERAL=42, INTEGER=43, HEX_CONSTANT=44, 
		DOLLAR_HEX_CONSTANT=45, RAWCODE=46, REAL=47, NULL=48, TRUE=49, FALSE=50, 
		NOT=51, OR=52, AND=53, ID=54, WS=55, NEWLINE=56;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'['", "'>='", "'=='", "'<'", "']'", "'>'", 
		"'<='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'='", "'globals'", 
		"'endglobals'", "'native'", "'function'", "'takes'", "'returns'", "'endfunction'", 
		"'nothing'", "'call'", "'set'", "'return'", "'array'", "'type'", "'extends'", 
		"'if'", "'then'", "'else'", "'endif'", "'elseif'", "'constant'", "'local'", 
		"'loop'", "'endloop'", "'exitwhen'", "'debug'", "STRING_LITERAL", "INTEGER", 
		"HEX_CONSTANT", "DOLLAR_HEX_CONSTANT", "RAWCODE", "REAL", "'null'", "'true'", 
		"'false'", "'not'", "'or'", "'and'", "ID", "WS", "NEWLINE"
	};
	public static final int
		RULE_program = 0, RULE_typeDefinition = 1, RULE_type = 2, RULE_global = 3, 
		RULE_local = 4, RULE_assignTail = 5, RULE_multDivExpression = 6, RULE_simpleArithmeticExpression = 7, 
		RULE_boolComparisonExpression = 8, RULE_boolEqualityExpression = 9, RULE_boolAndsExpression = 10, 
		RULE_boolExpression = 11, RULE_baseExpression = 12, RULE_expression = 13, 
		RULE_functionExpression = 14, RULE_argsList = 15, RULE_statement = 16, 
		RULE_ifStatementPartial = 17, RULE_param = 18, RULE_paramList = 19, RULE_globalsBlock = 20, 
		RULE_typeDefinitionBlock = 21, RULE_nativeBlock = 22, RULE_block = 23, 
		RULE_functionBlock = 24, RULE_statements = 25, RULE_newlines = 26, RULE_newlines_opt = 27, 
		RULE_pnewlines = 28;
	public static final String[] ruleNames = {
		"program", "typeDefinition", "type", "global", "local", "assignTail", 
		"multDivExpression", "simpleArithmeticExpression", "boolComparisonExpression", 
		"boolEqualityExpression", "boolAndsExpression", "boolExpression", "baseExpression", 
		"expression", "functionExpression", "argsList", "statement", "ifStatementPartial", 
		"param", "paramList", "globalsBlock", "typeDefinitionBlock", "nativeBlock", 
		"block", "functionBlock", "statements", "newlines", "newlines_opt", "pnewlines"
	};

	@Override
	public String getGrammarFileName() { return "Jass.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionBlockContext functionBlock(int i) {
			return getRuleContext(FunctionBlockContext.class,i);
		}
		public Newlines_optContext newlines_opt() {
			return getRuleContext(Newlines_optContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public List<FunctionBlockContext> functionBlock() {
			return getRuleContexts(FunctionBlockContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TypeDefinitionBlockContext typeDefinitionBlock() {
			return getRuleContext(TypeDefinitionBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); newlines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); newlines_opt();
				setState(60); typeDefinitionBlock();
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61); block();
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==CONSTANT) {
					{
					{
					setState(67); functionBlock();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JassParser.ID); }
		public TerminalNode TYPE() { return getToken(JassParser.TYPE, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(JassParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(JassParser.EXTENDS, 0); }
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(TYPE);
			setState(76); match(ID);
			setState(77); match(EXTENDS);
			setState(78); match(ID);
			setState(79); newlines();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(JassParser.ARRAY, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NothingTypeContext extends TypeContext {
		public TerminalNode NOTHING() { return getToken(JassParser.NOTHING, 0); }
		public NothingTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNothingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BasicTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(ID);
				setState(83); match(ARRAY);
				}
				break;
			case 3:
				_localctx = new NothingTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84); match(NOTHING);
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

	public static class GlobalContext extends ParserRuleContext {
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	 
		public GlobalContext() { }
		public void copyFrom(GlobalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinitionGlobalContext extends GlobalContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public AssignTailContext assignTail() {
			return getRuleContext(AssignTailContext.class,0);
		}
		public DefinitionGlobalContext(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitDefinitionGlobal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicGlobalContext extends GlobalContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public BasicGlobalContext(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBasicGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global);
		int _la;
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new BasicGlobalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(87); match(CONSTANT);
					}
				}

				setState(90); type();
				setState(91); match(ID);
				setState(92); newlines();
				}
				break;
			case 2:
				_localctx = new DefinitionGlobalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(94); match(CONSTANT);
					}
				}

				setState(97); type();
				setState(98); match(ID);
				setState(99); assignTail();
				setState(100); newlines();
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

	public static class LocalContext extends ParserRuleContext {
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
	 
		public LocalContext() { }
		public void copyFrom(LocalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicLocalContext extends LocalContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(JassParser.LOCAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BasicLocalContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBasicLocal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionLocalContext extends LocalContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(JassParser.LOCAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignTailContext assignTail() {
			return getRuleContext(AssignTailContext.class,0);
		}
		public DefinitionLocalContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitDefinitionLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_local);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BasicLocalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(LOCAL);
				setState(105); type();
				setState(106); match(ID);
				setState(107); newlines();
				}
				break;
			case 2:
				_localctx = new DefinitionLocalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(LOCAL);
				setState(110); type();
				setState(111); match(ID);
				setState(112); assignTail();
				setState(113); newlines();
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

	public static class AssignTailContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(JassParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignTail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitAssignTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignTailContext assignTail() throws RecognitionException {
		AssignTailContext _localctx = new AssignTailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(EQUALS);
			setState(118); expression();
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

	public static class MultDivExpressionContext extends ParserRuleContext {
		public MultDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivExpression; }
	 
		public MultDivExpressionContext() { }
		public void copyFrom(MultDivExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseMultiplicationExpressionContext extends MultDivExpressionContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public BaseMultiplicationExpressionContext(MultDivExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBaseMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionExpressionContext extends MultDivExpressionContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public MultDivExpressionContext multDivExpression() {
			return getRuleContext(MultDivExpressionContext.class,0);
		}
		public DivisionExpressionContext(MultDivExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExpressionContext extends MultDivExpressionContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public MultDivExpressionContext multDivExpression() {
			return getRuleContext(MultDivExpressionContext.class,0);
		}
		public MultiplicationExpressionContext(MultDivExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivExpressionContext multDivExpression() throws RecognitionException {
		return multDivExpression(0);
	}

	private MultDivExpressionContext multDivExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultDivExpressionContext _localctx = new MultDivExpressionContext(_ctx, _parentState);
		MultDivExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multDivExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseMultiplicationExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(121); baseExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new MultDivExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multDivExpression);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124); match(T__3);
						setState(125); baseExpression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionExpressionContext(new MultDivExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multDivExpression);
						setState(126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(127); match(T__14);
						setState(128); baseExpression();
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class SimpleArithmeticExpressionContext extends ParserRuleContext {
		public SimpleArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArithmeticExpression; }
	 
		public SimpleArithmeticExpressionContext() { }
		public void copyFrom(SimpleArithmeticExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpressionContext extends SimpleArithmeticExpressionContext {
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public MultDivExpressionContext multDivExpression() {
			return getRuleContext(MultDivExpressionContext.class,0);
		}
		public AdditionExpressionContext(SimpleArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtrationExpressionContext extends SimpleArithmeticExpressionContext {
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public MultDivExpressionContext multDivExpression() {
			return getRuleContext(MultDivExpressionContext.class,0);
		}
		public SubtrationExpressionContext(SimpleArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitSubtrationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseAdditionExpressionContext extends SimpleArithmeticExpressionContext {
		public MultDivExpressionContext multDivExpression() {
			return getRuleContext(MultDivExpressionContext.class,0);
		}
		public BaseAdditionExpressionContext(SimpleArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBaseAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleArithmeticExpressionContext simpleArithmeticExpression() throws RecognitionException {
		return simpleArithmeticExpression(0);
	}

	private SimpleArithmeticExpressionContext simpleArithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleArithmeticExpressionContext _localctx = new SimpleArithmeticExpressionContext(_ctx, _parentState);
		SimpleArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_simpleArithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseAdditionExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(135); multDivExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExpressionContext(new SimpleArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleArithmeticExpression);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138); match(T__2);
						setState(139); multDivExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtrationExpressionContext(new SimpleArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleArithmeticExpression);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141); match(T__0);
						setState(142); multDivExpression(0);
						}
						break;
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BoolComparisonExpressionContext extends ParserRuleContext {
		public BoolComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolComparisonExpression; }
	 
		public BoolComparisonExpressionContext() { }
		public void copyFrom(BoolComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanLessExpressionContext extends BoolComparisonExpressionContext {
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public BooleanLessExpressionContext(BoolComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBooleanLessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGreaterExpressionContext extends BoolComparisonExpressionContext {
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public BooleanGreaterExpressionContext(BoolComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBooleanGreaterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseBoolComparisonExpressionContext extends BoolComparisonExpressionContext {
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public BaseBoolComparisonExpressionContext(BoolComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBaseBoolComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLessOrEqualsExpressionContext extends BoolComparisonExpressionContext {
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public BooleanLessOrEqualsExpressionContext(BoolComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBooleanLessOrEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGreaterOrEqualsExpressionContext extends BoolComparisonExpressionContext {
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public SimpleArithmeticExpressionContext simpleArithmeticExpression() {
			return getRuleContext(SimpleArithmeticExpressionContext.class,0);
		}
		public BooleanGreaterOrEqualsExpressionContext(BoolComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBooleanGreaterOrEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolComparisonExpressionContext boolComparisonExpression() throws RecognitionException {
		return boolComparisonExpression(0);
	}

	private BoolComparisonExpressionContext boolComparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolComparisonExpressionContext _localctx = new BoolComparisonExpressionContext(_ctx, _parentState);
		BoolComparisonExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolComparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseBoolComparisonExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(149); simpleArithmeticExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanLessExpressionContext(new BoolComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolComparisonExpression);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152); match(T__9);
						setState(153); simpleArithmeticExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new BooleanGreaterExpressionContext(new BoolComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolComparisonExpression);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155); match(T__7);
						setState(156); simpleArithmeticExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new BooleanLessOrEqualsExpressionContext(new BoolComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolComparisonExpression);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158); match(T__6);
						setState(159); simpleArithmeticExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new BooleanGreaterOrEqualsExpressionContext(new BoolComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolComparisonExpression);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161); match(T__11);
						setState(162); simpleArithmeticExpression(0);
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class BoolEqualityExpressionContext extends ParserRuleContext {
		public BoolEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolEqualityExpression; }
	 
		public BoolEqualityExpressionContext() { }
		public void copyFrom(BoolEqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualsExpressionContext extends BoolEqualityExpressionContext {
		public BoolEqualityExpressionContext boolEqualityExpression() {
			return getRuleContext(BoolEqualityExpressionContext.class,0);
		}
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public NotEqualsExpressionContext(BoolEqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNotEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseBoolExpressionContext extends BoolEqualityExpressionContext {
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public BaseBoolExpressionContext(BoolEqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBaseBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsExpressionContext extends BoolEqualityExpressionContext {
		public BoolEqualityExpressionContext boolEqualityExpression() {
			return getRuleContext(BoolEqualityExpressionContext.class,0);
		}
		public BoolComparisonExpressionContext boolComparisonExpression() {
			return getRuleContext(BoolComparisonExpressionContext.class,0);
		}
		public EqualsExpressionContext(BoolEqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolEqualityExpressionContext boolEqualityExpression() throws RecognitionException {
		return boolEqualityExpression(0);
	}

	private BoolEqualityExpressionContext boolEqualityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolEqualityExpressionContext _localctx = new BoolEqualityExpressionContext(_ctx, _parentState);
		BoolEqualityExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolEqualityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseBoolExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(169); boolComparisonExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new EqualsExpressionContext(new BoolEqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolEqualityExpression);
						setState(171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(172); match(T__10);
						setState(173); boolComparisonExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualsExpressionContext(new BoolEqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolEqualityExpression);
						setState(174);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(175); match(T__13);
						setState(176); boolComparisonExpression(0);
						}
						break;
					}
					} 
				}
				setState(181);
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

	public static class BoolAndsExpressionContext extends ParserRuleContext {
		public BoolAndsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAndsExpression; }
	 
		public BoolAndsExpressionContext() { }
		public void copyFrom(BoolAndsExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseBoolAndsExpressionContext extends BoolAndsExpressionContext {
		public BoolEqualityExpressionContext boolEqualityExpression() {
			return getRuleContext(BoolEqualityExpressionContext.class,0);
		}
		public BaseBoolAndsExpressionContext(BoolAndsExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBaseBoolAndsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAndExpressionContext extends BoolAndsExpressionContext {
		public BoolAndsExpressionContext boolAndsExpression() {
			return getRuleContext(BoolAndsExpressionContext.class,0);
		}
		public BoolEqualityExpressionContext boolEqualityExpression() {
			return getRuleContext(BoolEqualityExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(JassParser.AND, 0); }
		public BooleanAndExpressionContext(BoolAndsExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBooleanAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolAndsExpressionContext boolAndsExpression() throws RecognitionException {
		return boolAndsExpression(0);
	}

	private BoolAndsExpressionContext boolAndsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolAndsExpressionContext _localctx = new BoolAndsExpressionContext(_ctx, _parentState);
		BoolAndsExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolAndsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseBoolAndsExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(183); boolEqualityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanAndExpressionContext(new BoolAndsExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolAndsExpression);
					setState(185);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(186); match(AND);
					setState(187); boolEqualityExpression(0);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	 
		public BoolExpressionContext() { }
		public void copyFrom(BoolExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseBoolOrsExpressionContext extends BoolExpressionContext {
		public BoolAndsExpressionContext boolAndsExpression() {
			return getRuleContext(BoolAndsExpressionContext.class,0);
		}
		public BaseBoolOrsExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBaseBoolOrsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanOrExpressionContext extends BoolExpressionContext {
		public BoolAndsExpressionContext boolAndsExpression() {
			return getRuleContext(BoolAndsExpressionContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(JassParser.OR, 0); }
		public BooleanOrExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBooleanOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		return boolExpression(0);
	}

	private BoolExpressionContext boolExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, _parentState);
		BoolExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_boolExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseBoolOrsExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(194); boolAndsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanOrExpressionContext(new BoolExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197); match(OR);
					setState(198); boolAndsExpression(0);
					}
					} 
				}
				setState(203);
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

	public static class BaseExpressionContext extends ParserRuleContext {
		public BaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpression; }
	 
		public BaseExpressionContext() { }
		public void copyFrom(BaseExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentheticalExpressionContext extends BaseExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParentheticalExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitParentheticalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralExpressionContext extends BaseExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(JassParser.STRING_LITERAL, 0); }
		public StringLiteralExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DollarHexIntegerLiteralExpressionContext extends BaseExpressionContext {
		public TerminalNode DOLLAR_HEX_CONSTANT() { return getToken(JassParser.DOLLAR_HEX_CONSTANT, 0); }
		public DollarHexIntegerLiteralExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitDollarHexIntegerLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionReferenceExpressionContext extends BaseExpressionContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(JassParser.FUNCTION, 0); }
		public FunctionReferenceExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunctionReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexIntegerLiteralExpressionContext extends BaseExpressionContext {
		public TerminalNode HEX_CONSTANT() { return getToken(JassParser.HEX_CONSTANT, 0); }
		public HexIntegerLiteralExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitHexIntegerLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends BaseExpressionContext {
		public TerminalNode NOT() { return getToken(JassParser.NOT, 0); }
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public NotExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends BaseExpressionContext {
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public FunctionCallExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends BaseExpressionContext {
		public TerminalNode NULL() { return getToken(JassParser.NULL, 0); }
		public NullExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExpressionContext extends BaseExpressionContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public NegateExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RawcodeLiteralExpressionContext extends BaseExpressionContext {
		public TerminalNode RAWCODE() { return getToken(JassParser.RAWCODE, 0); }
		public RawcodeLiteralExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitRawcodeLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExpressionContext extends BaseExpressionContext {
		public TerminalNode TRUE() { return getToken(JassParser.TRUE, 0); }
		public TrueExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitTrueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralExpressionContext extends BaseExpressionContext {
		public TerminalNode INTEGER() { return getToken(JassParser.INTEGER, 0); }
		public IntegerLiteralExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitIntegerLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceExpressionContext extends BaseExpressionContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public ReferenceExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealLiteralExpressionContext extends BaseExpressionContext {
		public TerminalNode REAL() { return getToken(JassParser.REAL, 0); }
		public RealLiteralExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitRealLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayReferenceExpressionContext extends BaseExpressionContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayReferenceExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitArrayReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExpressionContext extends BaseExpressionContext {
		public TerminalNode FALSE() { return getToken(JassParser.FALSE, 0); }
		public FalseExpressionContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFalseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExpressionContext baseExpression() throws RecognitionException {
		BaseExpressionContext _localctx = new BaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_baseExpression);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204); match(ID);
				}
				break;
			case 2:
				_localctx = new StringLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(STRING_LITERAL);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206); match(INTEGER);
				}
				break;
			case 4:
				_localctx = new HexIntegerLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(207); match(HEX_CONSTANT);
				}
				break;
			case 5:
				_localctx = new DollarHexIntegerLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(208); match(DOLLAR_HEX_CONSTANT);
				}
				break;
			case 6:
				_localctx = new RawcodeLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(209); match(RAWCODE);
				}
				break;
			case 7:
				_localctx = new RealLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(210); match(REAL);
				}
				break;
			case 8:
				_localctx = new FunctionReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(211); match(FUNCTION);
				setState(212); match(ID);
				}
				break;
			case 9:
				_localctx = new NullExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(213); match(NULL);
				}
				break;
			case 10:
				_localctx = new TrueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(214); match(TRUE);
				}
				break;
			case 11:
				_localctx = new FalseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(215); match(FALSE);
				}
				break;
			case 12:
				_localctx = new ArrayReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(216); match(ID);
				setState(217); match(T__12);
				setState(218); expression();
				setState(219); match(T__8);
				}
				break;
			case 13:
				_localctx = new FunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(221); functionExpression();
				}
				break;
			case 14:
				_localctx = new ParentheticalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(222); match(T__5);
				setState(223); expression();
				setState(224); match(T__4);
				}
				break;
			case 15:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(226); match(NOT);
				setState(227); baseExpression();
				}
				break;
			case 16:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(228); match(T__0);
				setState(229); baseExpression();
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
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); boolExpression(0);
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

	public static class FunctionExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionExpression);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); match(ID);
				setState(235); match(T__5);
				setState(236); argsList();
				setState(237); match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(ID);
				setState(240); match(T__5);
				setState(241); match(T__4);
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

	public static class ArgsListContext extends ParserRuleContext {
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
	 
		public ArgsListContext() { }
		public void copyFrom(ArgsListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleArgumentContext extends ArgsListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleArgumentContext(ArgsListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitSingleArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyArgumentContext extends ArgsListContext {
		public EmptyArgumentContext(ArgsListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitEmptyArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListArgumentContext extends ArgsListContext {
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListArgumentContext(ArgsListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitListArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argsList);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SingleArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244); expression();
				}
				break;
			case 2:
				_localctx = new ListArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245); expression();
				setState(246); match(T__1);
				setState(247); argsList();
				}
				break;
			case 3:
				_localctx = new EmptyArgumentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayedAssignmentStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(JassParser.EQUALS, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SET() { return getToken(JassParser.SET, 0); }
		public ArrayedAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitArrayedAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(JassParser.IF, 0); }
		public IfStatementPartialContext ifStatementPartial() {
			return getRuleContext(IfStatementPartialContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalStatementContext extends StatementContext {
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public LocalStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitLocalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JassParser.RETURN, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStatementContext extends StatementContext {
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public TerminalNode CALL() { return getToken(JassParser.CALL, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public CallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopStatementContext extends StatementContext {
		public NewlinesContext newlines(int i) {
			return getRuleContext(NewlinesContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(JassParser.LOOP, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<NewlinesContext> newlines() {
			return getRuleContexts(NewlinesContext.class);
		}
		public TerminalNode ENDLOOP() { return getToken(JassParser.ENDLOOP, 0); }
		public LoopStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DebugStatementContext extends StatementContext {
		public TerminalNode DEBUG() { return getToken(JassParser.DEBUG, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DebugStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitDebugStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExitWhenStatementContext extends StatementContext {
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXITWHEN() { return getToken(JassParser.EXITWHEN, 0); }
		public ExitWhenStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitExitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(JassParser.EQUALS, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SET() { return getToken(JassParser.SET, 0); }
		public SetStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnNothingStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JassParser.RETURN, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public ReturnNothingStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitReturnNothingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new CallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252); match(CALL);
				setState(253); functionExpression();
				setState(254); newlines();
				}
				break;
			case 2:
				_localctx = new SetStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(SET);
				setState(257); match(ID);
				setState(258); match(EQUALS);
				setState(259); expression();
				setState(260); newlines();
				}
				break;
			case 3:
				_localctx = new ArrayedAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262); match(SET);
				setState(263); match(ID);
				setState(264); match(T__12);
				setState(265); expression();
				setState(266); match(T__8);
				setState(267); match(EQUALS);
				setState(268); expression();
				setState(269); newlines();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271); match(RETURN);
				setState(272); expression();
				setState(273); newlines();
				}
				break;
			case 5:
				_localctx = new ReturnNothingStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275); match(RETURN);
				setState(276); newlines();
				}
				break;
			case 6:
				_localctx = new ExitWhenStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(277); match(EXITWHEN);
				setState(278); expression();
				setState(279); newlines();
				}
				break;
			case 7:
				_localctx = new LocalStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(281); local();
				}
				break;
			case 8:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(282); match(LOOP);
				setState(283); newlines();
				setState(284); statements();
				setState(285); match(ENDLOOP);
				setState(286); newlines();
				}
				break;
			case 9:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(288); match(IF);
				setState(289); ifStatementPartial();
				}
				break;
			case 10:
				_localctx = new DebugStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(290); match(DEBUG);
				setState(291); statement();
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

	public static class IfStatementPartialContext extends ParserRuleContext {
		public IfStatementPartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementPartial; }
	 
		public IfStatementPartialContext() { }
		public void copyFrom(IfStatementPartialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseIfStatementContext extends IfStatementPartialContext {
		public TerminalNode ELSEIF() { return getToken(JassParser.ELSEIF, 0); }
		public TerminalNode THEN() { return getToken(JassParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public IfStatementPartialContext ifStatementPartial() {
			return getRuleContext(IfStatementPartialContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfElseIfStatementContext(IfStatementPartialContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitIfElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends IfStatementPartialContext {
		public NewlinesContext newlines(int i) {
			return getRuleContext(NewlinesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JassParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(JassParser.THEN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public List<NewlinesContext> newlines() {
			return getRuleContexts(NewlinesContext.class);
		}
		public TerminalNode ENDIF() { return getToken(JassParser.ENDIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfElseStatementContext(IfStatementPartialContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleIfStatementContext extends IfStatementPartialContext {
		public NewlinesContext newlines(int i) {
			return getRuleContext(NewlinesContext.class,i);
		}
		public TerminalNode THEN() { return getToken(JassParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<NewlinesContext> newlines() {
			return getRuleContexts(NewlinesContext.class);
		}
		public TerminalNode ENDIF() { return getToken(JassParser.ENDIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleIfStatementContext(IfStatementPartialContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitSimpleIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementPartialContext ifStatementPartial() throws RecognitionException {
		IfStatementPartialContext _localctx = new IfStatementPartialContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatementPartial);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new SimpleIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294); expression();
				setState(295); match(THEN);
				setState(296); newlines();
				setState(297); statements();
				setState(298); match(ENDIF);
				setState(299); newlines();
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301); expression();
				setState(302); match(THEN);
				setState(303); newlines();
				setState(304); statements();
				setState(305); match(ELSE);
				setState(306); newlines();
				setState(307); statements();
				setState(308); match(ENDIF);
				setState(309); newlines();
				}
				break;
			case 3:
				_localctx = new IfElseIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311); expression();
				setState(312); match(THEN);
				setState(313); newlines();
				setState(314); statements();
				setState(315); match(ELSEIF);
				setState(316); ifStatementPartial();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); type();
			setState(321); match(ID);
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

	public static class ParamListContext extends ParserRuleContext {
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	 
		public ParamListContext() { }
		public void copyFrom(ParamListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NothingParameterContext extends ParamListContext {
		public TerminalNode NOTHING() { return getToken(JassParser.NOTHING, 0); }
		public NothingParameterContext(ParamListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNothingParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleParameterContext extends ParamListContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public SingleParameterContext(ParamListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitSingleParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListParameterContext extends ParamListContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ListParameterContext(ParamListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitListParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paramList);
		try {
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new SingleParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(323); param();
				}
				break;
			case 2:
				_localctx = new ListParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324); param();
				setState(325); match(T__1);
				setState(326); paramList();
				}
				break;
			case 3:
				_localctx = new NothingParameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328); match(NOTHING);
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

	public static class GlobalsBlockContext extends ParserRuleContext {
		public TerminalNode GLOBALS() { return getToken(JassParser.GLOBALS, 0); }
		public NewlinesContext newlines(int i) {
			return getRuleContext(NewlinesContext.class,i);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public List<NewlinesContext> newlines() {
			return getRuleContexts(NewlinesContext.class);
		}
		public TerminalNode ENDGLOBALS() { return getToken(JassParser.ENDGLOBALS, 0); }
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitGlobalsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsBlockContext globalsBlock() throws RecognitionException {
		GlobalsBlockContext _localctx = new GlobalsBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_globalsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(GLOBALS);
			setState(332); newlines();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTHING) | (1L << CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(333); global();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339); match(ENDGLOBALS);
			setState(340); newlines();
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

	public static class TypeDefinitionBlockContext extends ParserRuleContext {
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public TypeDefinitionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitTypeDefinitionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionBlockContext typeDefinitionBlock() throws RecognitionException {
		TypeDefinitionBlockContext _localctx = new TypeDefinitionBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeDefinitionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(342); typeDefinition();
				}
				}
				setState(347);
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

	public static class NativeBlockContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(JassParser.NATIVE, 0); }
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public TerminalNode TAKES() { return getToken(JassParser.TAKES, 0); }
		public TerminalNode RETURNS() { return getToken(JassParser.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public NativeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNativeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeBlockContext nativeBlock() throws RecognitionException {
		NativeBlockContext _localctx = new NativeBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nativeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(348); match(CONSTANT);
				}
			}

			setState(351); match(NATIVE);
			setState(352); match(ID);
			setState(353); match(TAKES);
			setState(354); paramList();
			setState(355); match(RETURNS);
			setState(356); type();
			setState(357); newlines();
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
		public NativeBlockContext nativeBlock() {
			return getRuleContext(NativeBlockContext.class,0);
		}
		public GlobalsBlockContext globalsBlock() {
			return getRuleContext(GlobalsBlockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		try {
			setState(361);
			switch (_input.LA(1)) {
			case GLOBALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(359); globalsBlock();
				}
				break;
			case NATIVE:
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); nativeBlock();
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public NewlinesContext newlines(int i) {
			return getRuleContext(NewlinesContext.class,i);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(JassParser.FUNCTION, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<NewlinesContext> newlines() {
			return getRuleContexts(NewlinesContext.class);
		}
		public TerminalNode TAKES() { return getToken(JassParser.TAKES, 0); }
		public TerminalNode RETURNS() { return getToken(JassParser.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(JassParser.ENDFUNCTION, 0); }
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(363); match(CONSTANT);
				}
			}

			setState(366); match(FUNCTION);
			setState(367); match(ID);
			setState(368); match(TAKES);
			setState(369); paramList();
			setState(370); match(RETURNS);
			setState(371); type();
			setState(372); newlines();
			setState(373); statements();
			setState(374); match(ENDFUNCTION);
			setState(375); newlines();
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << SET) | (1L << RETURN) | (1L << IF) | (1L << LOCAL) | (1L << LOOP) | (1L << EXITWHEN) | (1L << DEBUG))) != 0)) {
				{
				{
				setState(377); statement();
				}
				}
				setState(382);
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

	public static class NewlinesContext extends ParserRuleContext {
		public PnewlinesContext pnewlines() {
			return getRuleContext(PnewlinesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JassParser.EOF, 0); }
		public NewlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newlines; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNewlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlinesContext newlines() throws RecognitionException {
		NewlinesContext _localctx = new NewlinesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newlines);
		try {
			setState(385);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); pnewlines();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(384); match(EOF);
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

	public static class Newlines_optContext extends ParserRuleContext {
		public PnewlinesContext pnewlines() {
			return getRuleContext(PnewlinesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JassParser.EOF, 0); }
		public Newlines_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newlines_opt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNewlines_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Newlines_optContext newlines_opt() throws RecognitionException {
		Newlines_optContext _localctx = new Newlines_optContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newlines_opt);
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387); pnewlines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class PnewlinesContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(JassParser.NEWLINE, 0); }
		public NewlinesContext newlines() {
			return getRuleContext(NewlinesContext.class,0);
		}
		public PnewlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pnewlines; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitPnewlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PnewlinesContext pnewlines() throws RecognitionException {
		PnewlinesContext _localctx = new PnewlinesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pnewlines);
		try {
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); match(NEWLINE);
				setState(394); newlines();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return multDivExpression_sempred((MultDivExpressionContext)_localctx, predIndex);
		case 7: return simpleArithmeticExpression_sempred((SimpleArithmeticExpressionContext)_localctx, predIndex);
		case 8: return boolComparisonExpression_sempred((BoolComparisonExpressionContext)_localctx, predIndex);
		case 9: return boolEqualityExpression_sempred((BoolEqualityExpressionContext)_localctx, predIndex);
		case 10: return boolAndsExpression_sempred((BoolAndsExpressionContext)_localctx, predIndex);
		case 11: return boolExpression_sempred((BoolExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolEqualityExpression_sempred(BoolEqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 3);
		case 9: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolExpression_sempred(BoolExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolComparisonExpression_sempred(BoolComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolAndsExpression_sempred(BoolAndsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multDivExpression_sempred(MultDivExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleArithmeticExpression_sempred(SimpleArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\5\2L\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5b\n\5\3\5\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6v\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00fd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0127\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0141\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u014c\n\25\3\26\3\26\3\26\7\26\u0151\n\26\f\26\16\26\u0154\13\26"+
		"\3\26\3\26\3\26\3\27\7\27\u015a\n\27\f\27\16\27\u015d\13\27\3\30\5\30"+
		"\u0160\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u016c"+
		"\n\31\3\32\5\32\u016f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\7\33\u017d\n\33\f\33\16\33\u0180\13\33\3\34\3\34\5\34"+
		"\u0184\n\34\3\35\3\35\3\35\5\35\u0189\n\35\3\36\3\36\3\36\5\36\u018e\n"+
		"\36\3\36\2\b\16\20\22\24\26\30\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:\2\2\u01b0\2K\3\2\2\2\4M\3\2\2\2\6W\3\2\2\2"+
		"\bh\3\2\2\2\nu\3\2\2\2\fw\3\2\2\2\16z\3\2\2\2\20\u0088\3\2\2\2\22\u0096"+
		"\3\2\2\2\24\u00aa\3\2\2\2\26\u00b8\3\2\2\2\30\u00c3\3\2\2\2\32\u00e8\3"+
		"\2\2\2\34\u00ea\3\2\2\2\36\u00f4\3\2\2\2 \u00fc\3\2\2\2\"\u0126\3\2\2"+
		"\2$\u0140\3\2\2\2&\u0142\3\2\2\2(\u014b\3\2\2\2*\u014d\3\2\2\2,\u015b"+
		"\3\2\2\2.\u015f\3\2\2\2\60\u016b\3\2\2\2\62\u016e\3\2\2\2\64\u017e\3\2"+
		"\2\2\66\u0183\3\2\2\28\u0188\3\2\2\2:\u018d\3\2\2\2<L\5\66\34\2=>\58\35"+
		"\2>B\5,\27\2?A\5\60\31\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2"+
		"\2\2DB\3\2\2\2EG\5\62\32\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3"+
		"\2\2\2JH\3\2\2\2K<\3\2\2\2K=\3\2\2\2L\3\3\2\2\2MN\7\37\2\2NO\78\2\2OP"+
		"\7 \2\2PQ\78\2\2QR\5\66\34\2R\5\3\2\2\2SX\78\2\2TU\78\2\2UX\7\36\2\2V"+
		"X\7\32\2\2WS\3\2\2\2WT\3\2\2\2WV\3\2\2\2X\7\3\2\2\2Y[\7&\2\2ZY\3\2\2\2"+
		"Z[\3\2\2\2[\\\3\2\2\2\\]\5\6\4\2]^\78\2\2^_\5\66\34\2_i\3\2\2\2`b\7&\2"+
		"\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\6\4\2de\78\2\2ef\5\f\7\2fg\5\66\34"+
		"\2gi\3\2\2\2hZ\3\2\2\2ha\3\2\2\2i\t\3\2\2\2jk\7\'\2\2kl\5\6\4\2lm\78\2"+
		"\2mn\5\66\34\2nv\3\2\2\2op\7\'\2\2pq\5\6\4\2qr\78\2\2rs\5\f\7\2st\5\66"+
		"\34\2tv\3\2\2\2uj\3\2\2\2uo\3\2\2\2v\13\3\2\2\2wx\7\22\2\2xy\5\34\17\2"+
		"y\r\3\2\2\2z{\b\b\1\2{|\5\32\16\2|\u0085\3\2\2\2}~\f\5\2\2~\177\7\16\2"+
		"\2\177\u0084\5\32\16\2\u0080\u0081\f\4\2\2\u0081\u0082\7\3\2\2\u0082\u0084"+
		"\5\32\16\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u0089\b\t\1\2\u0089\u008a\5\16\b\2\u008a\u0093\3\2\2\2\u008b"+
		"\u008c\f\5\2\2\u008c\u008d\7\17\2\2\u008d\u0092\5\16\b\2\u008e\u008f\f"+
		"\4\2\2\u008f\u0090\7\21\2\2\u0090\u0092\5\16\b\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\21\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\b\n\1\2\u0097\u0098"+
		"\5\20\t\2\u0098\u00a7\3\2\2\2\u0099\u009a\f\7\2\2\u009a\u009b\7\b\2\2"+
		"\u009b\u00a6\5\20\t\2\u009c\u009d\f\6\2\2\u009d\u009e\7\n\2\2\u009e\u00a6"+
		"\5\20\t\2\u009f\u00a0\f\5\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a6\5\20\t"+
		"\2\u00a2\u00a3\f\4\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a6\5\20\t\2\u00a5"+
		"\u0099\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\23\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\b\13\1\2\u00ab\u00ac\5\22"+
		"\n\2\u00ac\u00b5\3\2\2\2\u00ad\u00ae\f\5\2\2\u00ae\u00af\7\7\2\2\u00af"+
		"\u00b4\5\22\n\2\u00b0\u00b1\f\4\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b4\5"+
		"\22\n\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b8\u00b9\b\f\1\2\u00b9\u00ba\5\24\13\2\u00ba\u00c0\3\2\2\2\u00bb"+
		"\u00bc\f\4\2\2\u00bc\u00bd\7\67\2\2\u00bd\u00bf\5\24\13\2\u00be\u00bb"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\27\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\r\1\2\u00c4\u00c5\5\26\f"+
		"\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8\7\66\2\2\u00c8"+
		"\u00ca\5\26\f\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00e9\78\2\2\u00cf\u00e9\7,\2\2\u00d0\u00e9\7-\2\2\u00d1\u00e9\7.\2\2"+
		"\u00d2\u00e9\7/\2\2\u00d3\u00e9\7\60\2\2\u00d4\u00e9\7\61\2\2\u00d5\u00d6"+
		"\7\26\2\2\u00d6\u00e9\78\2\2\u00d7\u00e9\7\62\2\2\u00d8\u00e9\7\63\2\2"+
		"\u00d9\u00e9\7\64\2\2\u00da\u00db\78\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd"+
		"\5\34\17\2\u00dd\u00de\7\t\2\2\u00de\u00e9\3\2\2\2\u00df\u00e9\5\36\20"+
		"\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7\r\2\2\u00e3"+
		"\u00e9\3\2\2\2\u00e4\u00e5\7\65\2\2\u00e5\u00e9\5\32\16\2\u00e6\u00e7"+
		"\7\21\2\2\u00e7\u00e9\5\32\16\2\u00e8\u00ce\3\2\2\2\u00e8\u00cf\3\2\2"+
		"\2\u00e8\u00d0\3\2\2\2\u00e8\u00d1\3\2\2\2\u00e8\u00d2\3\2\2\2\u00e8\u00d3"+
		"\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00d5\3\2\2\2\u00e8\u00d7\3\2\2\2\u00e8"+
		"\u00d8\3\2\2\2\u00e8\u00d9\3\2\2\2\u00e8\u00da\3\2\2\2\u00e8\u00df\3\2"+
		"\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\33\3\2\2\2\u00ea\u00eb\5\30\r\2\u00eb\35\3\2\2\2\u00ec\u00ed\78\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\5 \21\2\u00ef\u00f0\7\r\2\2\u00f0\u00f5\3\2"+
		"\2\2\u00f1\u00f2\78\2\2\u00f2\u00f3\7\f\2\2\u00f3\u00f5\7\r\2\2\u00f4"+
		"\u00ec\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00fd\5\34\17"+
		"\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\5 \21\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00ff\7\33\2\2\u00ff\u0100"+
		"\5\36\20\2\u0100\u0101\5\66\34\2\u0101\u0127\3\2\2\2\u0102\u0103\7\34"+
		"\2\2\u0103\u0104\78\2\2\u0104\u0105\7\22\2\2\u0105\u0106\5\34\17\2\u0106"+
		"\u0107\5\66\34\2\u0107\u0127\3\2\2\2\u0108\u0109\7\34\2\2\u0109\u010a"+
		"\78\2\2\u010a\u010b\7\5\2\2\u010b\u010c\5\34\17\2\u010c\u010d\7\t\2\2"+
		"\u010d\u010e\7\22\2\2\u010e\u010f\5\34\17\2\u010f\u0110\5\66\34\2\u0110"+
		"\u0127\3\2\2\2\u0111\u0112\7\35\2\2\u0112\u0113\5\34\17\2\u0113\u0114"+
		"\5\66\34\2\u0114\u0127\3\2\2\2\u0115\u0116\7\35\2\2\u0116\u0127\5\66\34"+
		"\2\u0117\u0118\7*\2\2\u0118\u0119\5\34\17\2\u0119\u011a\5\66\34\2\u011a"+
		"\u0127\3\2\2\2\u011b\u0127\5\n\6\2\u011c\u011d\7(\2\2\u011d\u011e\5\66"+
		"\34\2\u011e\u011f\5\64\33\2\u011f\u0120\7)\2\2\u0120\u0121\5\66\34\2\u0121"+
		"\u0127\3\2\2\2\u0122\u0123\7!\2\2\u0123\u0127\5$\23\2\u0124\u0125\7+\2"+
		"\2\u0125\u0127\5\"\22\2\u0126\u00fe\3\2\2\2\u0126\u0102\3\2\2\2\u0126"+
		"\u0108\3\2\2\2\u0126\u0111\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0117\3\2"+
		"\2\2\u0126\u011b\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127#\3\2\2\2\u0128\u0129\5\34\17\2\u0129\u012a\7\"\2"+
		"\2\u012a\u012b\5\66\34\2\u012b\u012c\5\64\33\2\u012c\u012d\7$\2\2\u012d"+
		"\u012e\5\66\34\2\u012e\u0141\3\2\2\2\u012f\u0130\5\34\17\2\u0130\u0131"+
		"\7\"\2\2\u0131\u0132\5\66\34\2\u0132\u0133\5\64\33\2\u0133\u0134\7#\2"+
		"\2\u0134\u0135\5\66\34\2\u0135\u0136\5\64\33\2\u0136\u0137\7$\2\2\u0137"+
		"\u0138\5\66\34\2\u0138\u0141\3\2\2\2\u0139\u013a\5\34\17\2\u013a\u013b"+
		"\7\"\2\2\u013b\u013c\5\66\34\2\u013c\u013d\5\64\33\2\u013d\u013e\7%\2"+
		"\2\u013e\u013f\5$\23\2\u013f\u0141\3\2\2\2\u0140\u0128\3\2\2\2\u0140\u012f"+
		"\3\2\2\2\u0140\u0139\3\2\2\2\u0141%\3\2\2\2\u0142\u0143\5\6\4\2\u0143"+
		"\u0144\78\2\2\u0144\'\3\2\2\2\u0145\u014c\5&\24\2\u0146\u0147\5&\24\2"+
		"\u0147\u0148\7\20\2\2\u0148\u0149\5(\25\2\u0149\u014c\3\2\2\2\u014a\u014c"+
		"\7\32\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u014a\3\2\2\2"+
		"\u014c)\3\2\2\2\u014d\u014e\7\23\2\2\u014e\u0152\5\66\34\2\u014f\u0151"+
		"\5\b\5\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\24"+
		"\2\2\u0156\u0157\5\66\34\2\u0157+\3\2\2\2\u0158\u015a\5\4\3\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"-\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\7&\2\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\25\2\2\u0162\u0163\7"+
		"8\2\2\u0163\u0164\7\27\2\2\u0164\u0165\5(\25\2\u0165\u0166\7\30\2\2\u0166"+
		"\u0167\5\6\4\2\u0167\u0168\5\66\34\2\u0168/\3\2\2\2\u0169\u016c\5*\26"+
		"\2\u016a\u016c\5.\30\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\61"+
		"\3\2\2\2\u016d\u016f\7&\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\7\26\2\2\u0171\u0172\78\2\2\u0172\u0173\7\27"+
		"\2\2\u0173\u0174\5(\25\2\u0174\u0175\7\30\2\2\u0175\u0176\5\6\4\2\u0176"+
		"\u0177\5\66\34\2\u0177\u0178\5\64\33\2\u0178\u0179\7\31\2\2\u0179\u017a"+
		"\5\66\34\2\u017a\63\3\2\2\2\u017b\u017d\5\"\22\2\u017c\u017b\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\65\3\2\2"+
		"\2\u0180\u017e\3\2\2\2\u0181\u0184\5:\36\2\u0182\u0184\7\2\2\3\u0183\u0181"+
		"\3\2\2\2\u0183\u0182\3\2\2\2\u0184\67\3\2\2\2\u0185\u0189\5:\36\2\u0186"+
		"\u0189\7\2\2\3\u0187\u0189\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0188\u0187\3\2\2\2\u01899\3\2\2\2\u018a\u018e\7:\2\2\u018b\u018c"+
		"\7:\2\2\u018c\u018e\5\66\34\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018e;\3\2\2\2#BHKWZahu\u0083\u0085\u0091\u0093\u00a5\u00a7\u00b3\u00b5"+
		"\u00c0\u00cb\u00e8\u00f4\u00fc\u0126\u0140\u014b\u0152\u015b\u015f\u016b"+
		"\u016e\u017e\u0183\u0188\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}