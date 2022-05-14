// Generated from FDF.g4 by ANTLR 4.4

	package com.etheller.warsmash.fdfparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FDFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_CURLY=1, CLOSE_CURLY=2, STRING_LIST=3, INCLUDE_FILE=4, FRAME=5, STRING=6, 
		TEXTURE=7, LAYER=8, INHERITS=9, WITHCHILDREN=10, SETPOINT=11, ANCHOR=12, 
		MENUITEM=13, JUSTIFYTOP=14, JUSTIFYMIDDLE=15, JUSTIFYBOTTOM=16, JUSTIFYLEFT=17, 
		JUSTIFYCENTER=18, JUSTIFYRIGHT=19, FRAMEPOINT_TOPLEFT=20, FRAMEPOINT_TOP=21, 
		FRAMEPOINT_TOPRIGHT=22, FRAMEPOINT_LEFT=23, FRAMEPOINT_CENTER=24, FRAMEPOINT_RIGHT=25, 
		FRAMEPOINT_BOTTOMLEFT=26, FRAMEPOINT_BOTTOM=27, FRAMEPOINT_BOTTOMRIGHT=28, 
		ID=29, COMMA=30, STRING_LITERAL=31, WS=32, FLOAT=33, MULTI_LINE_COMMENT=34, 
		COMMENT=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'}'", "'StringList'", "'IncludeFile'", "'Frame'", 
		"'String'", "'Texture'", "'Layer'", "'INHERITS'", "'WITHCHILDREN'", "'SetPoint'", 
		"'Anchor'", "'MenuItem'", "'JUSTIFYTOP'", "'JUSTIFYMIDDLE'", "'JUSTIFYBOTTOM'", 
		"'JUSTIFYLEFT'", "'JUSTIFYCENTER'", "'JUSTIFYRIGHT'", "'TOPLEFT'", "'TOP'", 
		"'TOPRIGHT'", "'LEFT'", "'CENTER'", "'RIGHT'", "'BOTTOMLEFT'", "'BOTTOM'", 
		"'BOTTOMRIGHT'", "ID", "','", "STRING_LITERAL", "WS", "FLOAT", "MULTI_LINE_COMMENT", 
		"COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_frame = 2, RULE_frame_element = 3, 
		RULE_text_justify = 4, RULE_frame_point = 5, RULE_color = 6, RULE_frame_type_qualifier = 7;
	public static final String[] ruleNames = {
		"program", "statement", "frame", "frame_element", "text_justify", "frame_point", 
		"color", "frame_type_qualifier"
	};

	@Override
	public String getGrammarFileName() { return "FDF.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FDFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LIST) | (1L << INCLUDE_FILE) | (1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER))) != 0)) {
				{
				{
				setState(16); statement();
				}
				}
				setState(21);
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
	public static class FrameStatementContext extends StatementContext {
		public FrameContext frame() {
			return getRuleContext(FrameContext.class,0);
		}
		public FrameStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrameStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncludeStatementContext extends StatementContext {
		public TerminalNode INCLUDE_FILE() { return getToken(FDFParser.INCLUDE_FILE, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public IncludeStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringListStatementContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(FDFParser.ID); }
		public TerminalNode STRING_LIST() { return getToken(FDFParser.STRING_LIST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode ID(int i) {
			return getToken(FDFParser.ID, i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public StringListStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitStringListStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			setState(37);
			switch (_input.LA(1)) {
			case STRING_LIST:
				_localctx = new StringListStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22); match(STRING_LIST);
				setState(23); match(OPEN_CURLY);
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(24); match(ID);
						setState(25); match(STRING_LITERAL);
						setState(26); match(COMMA);
						}
						} 
					}
					setState(31);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(32); match(CLOSE_CURLY);
				}
				break;
			case INCLUDE_FILE:
				_localctx = new IncludeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33); match(INCLUDE_FILE);
				setState(34); match(STRING_LITERAL);
				setState(35); match(COMMA);
				}
				break;
			case FRAME:
			case STRING:
			case TEXTURE:
			case LAYER:
				_localctx = new FrameStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36); frame();
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

	public static class FrameContext extends ParserRuleContext {
		public FrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame; }
	 
		public FrameContext() { }
		public void copyFrom(FrameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FrameDefinitionContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode FRAME() { return getToken(FDFParser.FRAME, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public FrameDefinitionContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrameDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompSubTypeDefinitionWithChildrenContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public Frame_type_qualifierContext frame_type_qualifier() {
			return getRuleContext(Frame_type_qualifierContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode INHERITS() { return getToken(FDFParser.INHERITS, 0); }
		public TerminalNode WITHCHILDREN() { return getToken(FDFParser.WITHCHILDREN, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public CompSubTypeDefinitionWithChildrenContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitCompSubTypeDefinitionWithChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousCompDefinitionContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public Frame_type_qualifierContext frame_type_qualifier() {
			return getRuleContext(Frame_type_qualifierContext.class,0);
		}
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public AnonymousCompDefinitionContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitAnonymousCompDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameSubTypeDefinitionContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode INHERITS() { return getToken(FDFParser.INHERITS, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode FRAME() { return getToken(FDFParser.FRAME, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public FrameSubTypeDefinitionContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrameSubTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameSubTypeDefinitionWithChildrenContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode INHERITS() { return getToken(FDFParser.INHERITS, 0); }
		public TerminalNode WITHCHILDREN() { return getToken(FDFParser.WITHCHILDREN, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode FRAME() { return getToken(FDFParser.FRAME, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public FrameSubTypeDefinitionWithChildrenContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrameSubTypeDefinitionWithChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousCompSubTypeDefinitionContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public Frame_type_qualifierContext frame_type_qualifier() {
			return getRuleContext(Frame_type_qualifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public TerminalNode INHERITS() { return getToken(FDFParser.INHERITS, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public AnonymousCompSubTypeDefinitionContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitAnonymousCompSubTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompDefinitionContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public Frame_type_qualifierContext frame_type_qualifier() {
			return getRuleContext(Frame_type_qualifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public CompDefinitionContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitCompDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousCompSubTypeDefinitionWithChildrenContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public Frame_type_qualifierContext frame_type_qualifier() {
			return getRuleContext(Frame_type_qualifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public TerminalNode INHERITS() { return getToken(FDFParser.INHERITS, 0); }
		public TerminalNode WITHCHILDREN() { return getToken(FDFParser.WITHCHILDREN, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public AnonymousCompSubTypeDefinitionWithChildrenContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitAnonymousCompSubTypeDefinitionWithChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompSubTypeDefinitionContext extends FrameContext {
		public List<Frame_elementContext> frame_element() {
			return getRuleContexts(Frame_elementContext.class);
		}
		public Frame_type_qualifierContext frame_type_qualifier() {
			return getRuleContext(Frame_type_qualifierContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode INHERITS() { return getToken(FDFParser.INHERITS, 0); }
		public Frame_elementContext frame_element(int i) {
			return getRuleContext(Frame_elementContext.class,i);
		}
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(FDFParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(FDFParser.CLOSE_CURLY, 0); }
		public CompSubTypeDefinitionContext(FrameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitCompSubTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameContext frame() throws RecognitionException {
		FrameContext _localctx = new FrameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_frame);
		int _la;
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AnonymousCompDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39); frame_type_qualifier();
				setState(40); match(OPEN_CURLY);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(41); frame_element();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47); match(CLOSE_CURLY);
				}
				break;
			case 2:
				_localctx = new AnonymousCompSubTypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49); frame_type_qualifier();
				setState(50); match(INHERITS);
				setState(51); match(STRING_LITERAL);
				setState(52); match(OPEN_CURLY);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(53); frame_element();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59); match(CLOSE_CURLY);
				}
				break;
			case 3:
				_localctx = new AnonymousCompSubTypeDefinitionWithChildrenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); frame_type_qualifier();
				setState(62); match(INHERITS);
				setState(63); match(WITHCHILDREN);
				setState(64); match(STRING_LITERAL);
				setState(65); match(OPEN_CURLY);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(66); frame_element();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72); match(CLOSE_CURLY);
				}
				break;
			case 4:
				_localctx = new CompDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74); frame_type_qualifier();
				setState(75); match(STRING_LITERAL);
				setState(76); match(OPEN_CURLY);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(77); frame_element();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83); match(CLOSE_CURLY);
				}
				break;
			case 5:
				_localctx = new CompSubTypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85); frame_type_qualifier();
				setState(86); match(STRING_LITERAL);
				setState(87); match(INHERITS);
				setState(88); match(STRING_LITERAL);
				setState(89); match(OPEN_CURLY);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(90); frame_element();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96); match(CLOSE_CURLY);
				}
				break;
			case 6:
				_localctx = new CompSubTypeDefinitionWithChildrenContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98); frame_type_qualifier();
				setState(99); match(STRING_LITERAL);
				setState(100); match(INHERITS);
				setState(101); match(WITHCHILDREN);
				setState(102); match(STRING_LITERAL);
				setState(103); match(OPEN_CURLY);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(104); frame_element();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110); match(CLOSE_CURLY);
				}
				break;
			case 7:
				_localctx = new FrameDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(112); match(FRAME);
				setState(113); match(STRING_LITERAL);
				setState(114); match(STRING_LITERAL);
				setState(115); match(OPEN_CURLY);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(116); frame_element();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122); match(CLOSE_CURLY);
				}
				break;
			case 8:
				_localctx = new FrameSubTypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(123); match(FRAME);
				setState(124); match(STRING_LITERAL);
				setState(125); match(STRING_LITERAL);
				setState(126); match(INHERITS);
				setState(127); match(STRING_LITERAL);
				setState(128); match(OPEN_CURLY);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(129); frame_element();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135); match(CLOSE_CURLY);
				}
				break;
			case 9:
				_localctx = new FrameSubTypeDefinitionWithChildrenContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(136); match(FRAME);
				setState(137); match(STRING_LITERAL);
				setState(138); match(STRING_LITERAL);
				setState(139); match(INHERITS);
				setState(140); match(WITHCHILDREN);
				setState(141); match(STRING_LITERAL);
				setState(142); match(OPEN_CURLY);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAME) | (1L << STRING) | (1L << TEXTURE) | (1L << LAYER) | (1L << SETPOINT) | (1L << ANCHOR) | (1L << MENUITEM) | (1L << ID))) != 0)) {
					{
					{
					setState(143); frame_element();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149); match(CLOSE_CURLY);
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

	public static class Frame_elementContext extends ParserRuleContext {
		public Frame_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_element; }
	 
		public Frame_elementContext() { }
		public void copyFrom(Frame_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FontElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public TerminalNode FLOAT() { return getToken(FDFParser.FLOAT, 0); }
		public FontElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFontElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vector2ElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public Vector2ElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitVector2Element(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FrameFrameElementContext extends Frame_elementContext {
		public FrameContext frame() {
			return getRuleContext(FrameContext.class,0);
		}
		public FrameFrameElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrameFrameElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public StringElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitStringElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnchorElementContext extends Frame_elementContext {
		public Frame_pointContext frame_point() {
			return getRuleContext(Frame_pointContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public TerminalNode ANCHOR() { return getToken(FDFParser.ANCHOR, 0); }
		public AnchorElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitAnchorElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringPairElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FDFParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FDFParser.STRING_LITERAL, i);
		}
		public StringPairElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitStringPairElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vector4CommaElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public Vector4CommaElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitVector4CommaElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextJustifyElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public Text_justifyContext text_justify() {
			return getRuleContext(Text_justifyContext.class,0);
		}
		public TextJustifyElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitTextJustifyElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPointElementContext extends Frame_elementContext {
		public TerminalNode SETPOINT() { return getToken(FDFParser.SETPOINT, 0); }
		public List<Frame_pointContext> frame_point() {
			return getRuleContexts(Frame_pointContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public Frame_pointContext frame_point(int i) {
			return getRuleContext(Frame_pointContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public SetPointElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitSetPointElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlagElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public FlagElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFlagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public TerminalNode FLOAT() { return getToken(FDFParser.FLOAT, 0); }
		public FloatElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFloatElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vector4ElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public Vector4ElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitVector4Element(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vector3ElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(FDFParser.COMMA, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public Vector3ElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitVector3Element(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenuItemElementContext extends Frame_elementContext {
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public TerminalNode MENUITEM() { return getToken(FDFParser.MENUITEM, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public TerminalNode FLOAT() { return getToken(FDFParser.FLOAT, 0); }
		public MenuItemElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitMenuItemElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleFontElementContext extends Frame_elementContext {
		public TerminalNode ID() { return getToken(FDFParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FDFParser.COMMA); }
		public TerminalNode STRING_LITERAL() { return getToken(FDFParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(FDFParser.COMMA, i);
		}
		public TerminalNode FLOAT() { return getToken(FDFParser.FLOAT, 0); }
		public SimpleFontElementContext(Frame_elementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitSimpleFontElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_elementContext frame_element() throws RecognitionException {
		Frame_elementContext _localctx = new Frame_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_frame_element);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FrameFrameElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152); frame();
				}
				break;
			case 2:
				_localctx = new FloatElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153); match(ID);
				setState(154); match(FLOAT);
				setState(155); match(COMMA);
				}
				break;
			case 3:
				_localctx = new StringElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(ID);
				setState(157); match(STRING_LITERAL);
				setState(158); match(COMMA);
				}
				break;
			case 4:
				_localctx = new StringPairElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(ID);
				setState(160); match(STRING_LITERAL);
				setState(161); match(STRING_LITERAL);
				setState(162); match(COMMA);
				}
				break;
			case 5:
				_localctx = new Vector2ElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163); match(ID);
				setState(164); match(FLOAT);
				setState(165); match(FLOAT);
				setState(166); match(COMMA);
				}
				break;
			case 6:
				_localctx = new FlagElementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167); match(ID);
				setState(168); match(COMMA);
				}
				break;
			case 7:
				_localctx = new Vector4ElementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169); match(ID);
				setState(170); match(FLOAT);
				setState(171); match(FLOAT);
				setState(172); match(FLOAT);
				setState(173); match(FLOAT);
				setState(174); match(COMMA);
				}
				break;
			case 8:
				_localctx = new Vector4CommaElementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(175); match(ID);
				setState(176); match(FLOAT);
				setState(177); match(COMMA);
				setState(178); match(FLOAT);
				setState(179); match(COMMA);
				setState(180); match(FLOAT);
				setState(181); match(COMMA);
				setState(182); match(FLOAT);
				setState(183); match(COMMA);
				}
				break;
			case 9:
				_localctx = new SetPointElementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(184); match(SETPOINT);
				setState(185); frame_point();
				setState(186); match(COMMA);
				setState(187); match(STRING_LITERAL);
				setState(188); match(COMMA);
				setState(189); frame_point();
				setState(190); match(COMMA);
				setState(191); match(FLOAT);
				setState(192); match(COMMA);
				setState(193); match(FLOAT);
				setState(194); match(COMMA);
				}
				break;
			case 10:
				_localctx = new AnchorElementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(196); match(ANCHOR);
				setState(197); frame_point();
				setState(198); match(COMMA);
				setState(199); match(FLOAT);
				setState(200); match(COMMA);
				setState(201); match(FLOAT);
				setState(202); match(COMMA);
				}
				break;
			case 11:
				_localctx = new FontElementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(204); match(ID);
				setState(205); match(STRING_LITERAL);
				setState(206); match(COMMA);
				setState(207); match(FLOAT);
				setState(208); match(COMMA);
				setState(209); match(STRING_LITERAL);
				setState(210); match(COMMA);
				}
				break;
			case 12:
				_localctx = new Vector3ElementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(211); match(ID);
				setState(212); match(FLOAT);
				setState(213); match(FLOAT);
				setState(214); match(FLOAT);
				setState(215); match(COMMA);
				}
				break;
			case 13:
				_localctx = new TextJustifyElementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(216); match(ID);
				setState(217); text_justify();
				setState(218); match(COMMA);
				}
				break;
			case 14:
				_localctx = new SimpleFontElementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(220); match(ID);
				setState(221); match(STRING_LITERAL);
				setState(222); match(COMMA);
				setState(223); match(FLOAT);
				setState(224); match(COMMA);
				}
				break;
			case 15:
				_localctx = new MenuItemElementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(225); match(MENUITEM);
				setState(226); match(STRING_LITERAL);
				setState(227); match(COMMA);
				setState(228); match(FLOAT);
				setState(229); match(COMMA);
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

	public static class Text_justifyContext extends ParserRuleContext {
		public TerminalNode JUSTIFYTOP() { return getToken(FDFParser.JUSTIFYTOP, 0); }
		public TerminalNode JUSTIFYMIDDLE() { return getToken(FDFParser.JUSTIFYMIDDLE, 0); }
		public TerminalNode JUSTIFYLEFT() { return getToken(FDFParser.JUSTIFYLEFT, 0); }
		public TerminalNode JUSTIFYCENTER() { return getToken(FDFParser.JUSTIFYCENTER, 0); }
		public TerminalNode JUSTIFYBOTTOM() { return getToken(FDFParser.JUSTIFYBOTTOM, 0); }
		public TerminalNode JUSTIFYRIGHT() { return getToken(FDFParser.JUSTIFYRIGHT, 0); }
		public Text_justifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_justify; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitText_justify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_justifyContext text_justify() throws RecognitionException {
		Text_justifyContext _localctx = new Text_justifyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text_justify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JUSTIFYTOP) | (1L << JUSTIFYMIDDLE) | (1L << JUSTIFYBOTTOM) | (1L << JUSTIFYLEFT) | (1L << JUSTIFYCENTER) | (1L << JUSTIFYRIGHT))) != 0)) ) {
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

	public static class Frame_pointContext extends ParserRuleContext {
		public TerminalNode FRAMEPOINT_TOPRIGHT() { return getToken(FDFParser.FRAMEPOINT_TOPRIGHT, 0); }
		public TerminalNode FRAMEPOINT_TOP() { return getToken(FDFParser.FRAMEPOINT_TOP, 0); }
		public TerminalNode FRAMEPOINT_TOPLEFT() { return getToken(FDFParser.FRAMEPOINT_TOPLEFT, 0); }
		public TerminalNode FRAMEPOINT_BOTTOM() { return getToken(FDFParser.FRAMEPOINT_BOTTOM, 0); }
		public TerminalNode FRAMEPOINT_BOTTOMLEFT() { return getToken(FDFParser.FRAMEPOINT_BOTTOMLEFT, 0); }
		public TerminalNode FRAMEPOINT_CENTER() { return getToken(FDFParser.FRAMEPOINT_CENTER, 0); }
		public TerminalNode FRAMEPOINT_RIGHT() { return getToken(FDFParser.FRAMEPOINT_RIGHT, 0); }
		public TerminalNode FRAMEPOINT_LEFT() { return getToken(FDFParser.FRAMEPOINT_LEFT, 0); }
		public TerminalNode FRAMEPOINT_BOTTOMRIGHT() { return getToken(FDFParser.FRAMEPOINT_BOTTOMRIGHT, 0); }
		public Frame_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrame_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_pointContext frame_point() throws RecognitionException {
		Frame_pointContext _localctx = new Frame_pointContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_frame_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAMEPOINT_TOPLEFT) | (1L << FRAMEPOINT_TOP) | (1L << FRAMEPOINT_TOPRIGHT) | (1L << FRAMEPOINT_LEFT) | (1L << FRAMEPOINT_CENTER) | (1L << FRAMEPOINT_RIGHT) | (1L << FRAMEPOINT_BOTTOMLEFT) | (1L << FRAMEPOINT_BOTTOM) | (1L << FRAMEPOINT_BOTTOMRIGHT))) != 0)) ) {
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

	public static class ColorContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(FDFParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FDFParser.FLOAT, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_color);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); match(FLOAT);
				setState(237); match(FLOAT);
				setState(238); match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(FLOAT);
				setState(240); match(FLOAT);
				setState(241); match(FLOAT);
				setState(242); match(FLOAT);
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

	public static class Frame_type_qualifierContext extends ParserRuleContext {
		public TerminalNode TEXTURE() { return getToken(FDFParser.TEXTURE, 0); }
		public TerminalNode STRING() { return getToken(FDFParser.STRING, 0); }
		public TerminalNode LAYER() { return getToken(FDFParser.LAYER, 0); }
		public Frame_type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_type_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FDFVisitor ) return ((FDFVisitor<? extends T>)visitor).visitFrame_type_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_type_qualifierContext frame_type_qualifier() throws RecognitionException {
		Frame_type_qualifierContext _localctx = new Frame_type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_frame_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << TEXTURE) | (1L << LAYER))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2"+
		"\f\2\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16"+
		"\4T\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4x\n\4\f\4\16\4{\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u0085\n\4\f\4\16\4\u0088\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u0093\n\4\f\4\16\4\u0096\13\4\3\4\5\4\u0099\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00e9\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00f6\n\b\3\t\3\t\3\t\3\37\2\n\2\4\6\b\n\f\16\20\2\5\3\2\20\25\3"+
		"\2\26\36\3\2\b\n\u0115\2\25\3\2\2\2\4\'\3\2\2\2\6\u0098\3\2\2\2\b\u00e8"+
		"\3\2\2\2\n\u00ea\3\2\2\2\f\u00ec\3\2\2\2\16\u00f5\3\2\2\2\20\u00f7\3\2"+
		"\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\31\7\5\2\2\31\37\7\3\2\2\32\33\7\37"+
		"\2\2\33\34\7!\2\2\34\36\7 \2\2\35\32\3\2\2\2\36!\3\2\2\2\37 \3\2\2\2\37"+
		"\35\3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"(\7\4\2\2#$\7\6\2\2$%\7!\2\2%(\7 "+
		"\2\2&(\5\6\4\2\'\30\3\2\2\2\'#\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\5\20\t"+
		"\2*.\7\3\2\2+-\5\b\5\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3"+
		"\2\2\2\60.\3\2\2\2\61\62\7\4\2\2\62\u0099\3\2\2\2\63\64\5\20\t\2\64\65"+
		"\7\13\2\2\65\66\7!\2\2\66:\7\3\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:"+
		"8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\4\2\2>\u0099\3\2\2\2?@\5\20"+
		"\t\2@A\7\13\2\2AB\7\f\2\2BC\7!\2\2CG\7\3\2\2DF\5\b\5\2ED\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\4\2\2K\u0099\3\2\2\2"+
		"LM\5\20\t\2MN\7!\2\2NR\7\3\2\2OQ\5\b\5\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\4\2\2V\u0099\3\2\2\2WX\5\20\t\2XY\7"+
		"!\2\2YZ\7\13\2\2Z[\7!\2\2[_\7\3\2\2\\^\5\b\5\2]\\\3\2\2\2^a\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\4\2\2c\u0099\3\2\2\2de\5\20"+
		"\t\2ef\7!\2\2fg\7\13\2\2gh\7\f\2\2hi\7!\2\2im\7\3\2\2jl\5\b\5\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\4\2\2q\u0099"+
		"\3\2\2\2rs\7\7\2\2st\7!\2\2tu\7!\2\2uy\7\3\2\2vx\5\b\5\2wv\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0099\7\4\2\2}~\7\7\2"+
		"\2~\177\7!\2\2\177\u0080\7!\2\2\u0080\u0081\7\13\2\2\u0081\u0082\7!\2"+
		"\2\u0082\u0086\7\3\2\2\u0083\u0085\5\b\5\2\u0084\u0083\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u0099\7\4\2\2\u008a\u008b\7\7\2\2\u008b\u008c\7!"+
		"\2\2\u008c\u008d\7!\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\f\2\2\u008f"+
		"\u0090\7!\2\2\u0090\u0094\7\3\2\2\u0091\u0093\5\b\5\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7\4\2\2\u0098)\3\2\2\2"+
		"\u0098\63\3\2\2\2\u0098?\3\2\2\2\u0098L\3\2\2\2\u0098W\3\2\2\2\u0098d"+
		"\3\2\2\2\u0098r\3\2\2\2\u0098}\3\2\2\2\u0098\u008a\3\2\2\2\u0099\7\3\2"+
		"\2\2\u009a\u00e9\5\6\4\2\u009b\u009c\7\37\2\2\u009c\u009d\7#\2\2\u009d"+
		"\u00e9\7 \2\2\u009e\u009f\7\37\2\2\u009f\u00a0\7!\2\2\u00a0\u00e9\7 \2"+
		"\2\u00a1\u00a2\7\37\2\2\u00a2\u00a3\7!\2\2\u00a3\u00a4\7!\2\2\u00a4\u00e9"+
		"\7 \2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7#\2\2\u00a8"+
		"\u00e9\7 \2\2\u00a9\u00aa\7\37\2\2\u00aa\u00e9\7 \2\2\u00ab\u00ac\7\37"+
		"\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7#\2\2\u00af\u00b0"+
		"\7#\2\2\u00b0\u00e9\7 \2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\7#\2\2\u00b3"+
		"\u00b4\7 \2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\7 \2\2\u00b6\u00b7\7#\2\2"+
		"\u00b7\u00b8\7 \2\2\u00b8\u00b9\7#\2\2\u00b9\u00e9\7 \2\2\u00ba\u00bb"+
		"\7\r\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7 \2\2\u00bd\u00be\7!\2\2\u00be"+
		"\u00bf\7 \2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\7 \2\2\u00c1\u00c2\7#\2"+
		"\2\u00c2\u00c3\7 \2\2\u00c3\u00c4\7#\2\2\u00c4\u00c5\7 \2\2\u00c5\u00e9"+
		"\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\5\f\7\2\u00c8\u00c9\7 \2\2\u00c9"+
		"\u00ca\7#\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd\7 \2\2"+
		"\u00cd\u00e9\3\2\2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d0\7!\2\2\u00d0\u00d1"+
		"\7 \2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7 \2\2\u00d3\u00d4\7!\2\2\u00d4"+
		"\u00e9\7 \2\2\u00d5\u00d6\7\37\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8\7#\2"+
		"\2\u00d8\u00d9\7#\2\2\u00d9\u00e9\7 \2\2\u00da\u00db\7\37\2\2\u00db\u00dc"+
		"\5\n\6\2\u00dc\u00dd\7 \2\2\u00dd\u00e9\3\2\2\2\u00de\u00df\7\37\2\2\u00df"+
		"\u00e0\7!\2\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\7#\2\2\u00e2\u00e9\7 \2\2"+
		"\u00e3\u00e4\7\17\2\2\u00e4\u00e5\7!\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7"+
		"\7#\2\2\u00e7\u00e9\7 \2\2\u00e8\u009a\3\2\2\2\u00e8\u009b\3\2\2\2\u00e8"+
		"\u009e\3\2\2\2\u00e8\u00a1\3\2\2\2\u00e8\u00a5\3\2\2\2\u00e8\u00a9\3\2"+
		"\2\2\u00e8\u00ab\3\2\2\2\u00e8\u00b1\3\2\2\2\u00e8\u00ba\3\2\2\2\u00e8"+
		"\u00c6\3\2\2\2\u00e8\u00ce\3\2\2\2\u00e8\u00d5\3\2\2\2\u00e8\u00da\3\2"+
		"\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\t\3\2\2\2\u00ea\u00eb"+
		"\t\2\2\2\u00eb\13\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed\r\3\2\2\2\u00ee\u00ef"+
		"\7#\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f6\7#\2\2\u00f1\u00f2\7#\2\2\u00f2"+
		"\u00f3\7#\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f6\7#\2\2\u00f5\u00ee\3\2\2"+
		"\2\u00f5\u00f1\3\2\2\2\u00f6\17\3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8\21\3"+
		"\2\2\2\21\25\37\'.:GR_my\u0086\u0094\u0098\u00e8\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}