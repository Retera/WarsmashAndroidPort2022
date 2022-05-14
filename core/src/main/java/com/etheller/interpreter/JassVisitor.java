// Generated from Jass.g4 by ANTLR 4.4

	package com.etheller.interpreter;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JassVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code IfElseIfStatement}
	 * labeled alternative in {@link JassParser#ifStatementPartial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIfStatement(@NotNull JassParser.IfElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionReferenceExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReferenceExpression(@NotNull JassParser.FunctionReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseAdditionExpression}
	 * labeled alternative in {@link JassParser#simpleArithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseAdditionExpression(@NotNull JassParser.BaseAdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull JassParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull JassParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(@NotNull JassParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull JassParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link JassParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull JassParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull JassParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NothingParameter}
	 * labeled alternative in {@link JassParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothingParameter(@NotNull JassParser.NothingParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#newlines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlines(@NotNull JassParser.NewlinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(@NotNull JassParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull JassParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtrationExpression}
	 * labeled alternative in {@link JassParser#simpleArithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtrationExpression(@NotNull JassParser.SubtrationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanAndExpression}
	 * labeled alternative in {@link JassParser#boolAndsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndExpression(@NotNull JassParser.BooleanAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull JassParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealLiteralExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteralExpression(@NotNull JassParser.RealLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanGreaterOrEqualsExpression}
	 * labeled alternative in {@link JassParser#boolComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreaterOrEqualsExpression(@NotNull JassParser.BooleanGreaterOrEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionBlock(@NotNull JassParser.TypeDefinitionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentheticalExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheticalExpression(@NotNull JassParser.ParentheticalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DollarHexIntegerLiteralExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollarHexIntegerLiteralExpression(@NotNull JassParser.DollarHexIntegerLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(@NotNull JassParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DebugStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugStatement(@NotNull JassParser.DebugStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseBoolExpression}
	 * labeled alternative in {@link JassParser#boolEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseBoolExpression(@NotNull JassParser.BaseBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(@NotNull JassParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull JassParser.NegateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RawcodeLiteralExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawcodeLiteralExpression(@NotNull JassParser.RawcodeLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpression(@NotNull JassParser.TrueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyArgument}
	 * labeled alternative in {@link JassParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArgument(@NotNull JassParser.EmptyArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinitionGlobal}
	 * labeled alternative in {@link JassParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionGlobal(@NotNull JassParser.DefinitionGlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteralExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteralExpression(@NotNull JassParser.IntegerLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicLocal}
	 * labeled alternative in {@link JassParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLocal(@NotNull JassParser.BasicLocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceExpression(@NotNull JassParser.ReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#globalsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalsBlock(@NotNull JassParser.GlobalsBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link JassParser#multDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(@NotNull JassParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListParameter}
	 * labeled alternative in {@link JassParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParameter(@NotNull JassParser.ListParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanOrExpression}
	 * labeled alternative in {@link JassParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrExpression(@NotNull JassParser.BooleanOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinitionLocal}
	 * labeled alternative in {@link JassParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionLocal(@NotNull JassParser.DefinitionLocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListArgument}
	 * labeled alternative in {@link JassParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListArgument(@NotNull JassParser.ListArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLessExpression}
	 * labeled alternative in {@link JassParser#boolComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLessExpression(@NotNull JassParser.BooleanLessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseBoolOrsExpression}
	 * labeled alternative in {@link JassParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseBoolOrsExpression(@NotNull JassParser.BaseBoolOrsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link JassParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(@NotNull JassParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanGreaterExpression}
	 * labeled alternative in {@link JassParser#boolComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreaterExpression(@NotNull JassParser.BooleanGreaterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalStatement(@NotNull JassParser.LocalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull JassParser.StringLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link JassParser#boolEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsExpression(@NotNull JassParser.NotEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(@NotNull JassParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull JassParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleArgument}
	 * labeled alternative in {@link JassParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgument(@NotNull JassParser.SingleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull JassParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(@NotNull JassParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link JassParser#multDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(@NotNull JassParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseBoolComparisonExpression}
	 * labeled alternative in {@link JassParser#boolComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseBoolComparisonExpression(@NotNull JassParser.BaseBoolComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayReferenceExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayReferenceExpression(@NotNull JassParser.ArrayReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpression(@NotNull JassParser.FalseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link JassParser#simpleArithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(@NotNull JassParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayedAssignmentStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayedAssignmentStatement(@NotNull JassParser.ArrayedAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseMultiplicationExpression}
	 * labeled alternative in {@link JassParser#multDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseMultiplicationExpression(@NotNull JassParser.BaseMultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull JassParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleParameter}
	 * labeled alternative in {@link JassParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParameter(@NotNull JassParser.SingleParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#newlines_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlines_opt(@NotNull JassParser.Newlines_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link JassParser#ifStatementPartial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(@NotNull JassParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexIntegerLiteralExpression}
	 * labeled alternative in {@link JassParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexIntegerLiteralExpression(@NotNull JassParser.HexIntegerLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicGlobal}
	 * labeled alternative in {@link JassParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicGlobal(@NotNull JassParser.BasicGlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(@NotNull JassParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnNothingStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNothingStatement(@NotNull JassParser.ReturnNothingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#pnewlines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPnewlines(@NotNull JassParser.PnewlinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#nativeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeBlock(@NotNull JassParser.NativeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseBoolAndsExpression}
	 * labeled alternative in {@link JassParser#boolAndsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseBoolAndsExpression(@NotNull JassParser.BaseBoolAndsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLessOrEqualsExpression}
	 * labeled alternative in {@link JassParser#boolComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLessOrEqualsExpression(@NotNull JassParser.BooleanLessOrEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleIfStatement}
	 * labeled alternative in {@link JassParser#ifStatementPartial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIfStatement(@NotNull JassParser.SimpleIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExitWhenStatement}
	 * labeled alternative in {@link JassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitWhenStatement(@NotNull JassParser.ExitWhenStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NothingType}
	 * labeled alternative in {@link JassParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothingType(@NotNull JassParser.NothingTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#assignTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTail(@NotNull JassParser.AssignTailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link JassParser#boolEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(@NotNull JassParser.EqualsExpressionContext ctx);
}