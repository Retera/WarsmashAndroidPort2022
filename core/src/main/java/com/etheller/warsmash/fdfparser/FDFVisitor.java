// Generated from FDF.g4 by ANTLR 4.4

	package com.etheller.warsmash.fdfparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FDFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FDFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FDFParser#text_justify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_justify(@NotNull FDFParser.Text_justifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FrameFrameElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameFrameElement(@NotNull FDFParser.FrameFrameElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringListStatement}
	 * labeled alternative in {@link FDFParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringListStatement(@NotNull FDFParser.StringListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FDFParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(@NotNull FDFParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringElement(@NotNull FDFParser.StringElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FrameSubTypeDefinitionWithChildren}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameSubTypeDefinitionWithChildren(@NotNull FDFParser.FrameSubTypeDefinitionWithChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnchorElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorElement(@NotNull FDFParser.AnchorElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompDefinition}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompDefinition(@NotNull FDFParser.CompDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FDFParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull FDFParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousCompSubTypeDefinitionWithChildren}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousCompSubTypeDefinitionWithChildren(@NotNull FDFParser.AnonymousCompSubTypeDefinitionWithChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPairElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPairElement(@NotNull FDFParser.StringPairElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompSubTypeDefinition}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompSubTypeDefinition(@NotNull FDFParser.CompSubTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FDFParser#frame_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_point(@NotNull FDFParser.Frame_pointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncludeStatement}
	 * labeled alternative in {@link FDFParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(@NotNull FDFParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FrameSubTypeDefinition}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameSubTypeDefinition(@NotNull FDFParser.FrameSubTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatElement(@NotNull FDFParser.FloatElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousCompSubTypeDefinition}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousCompSubTypeDefinition(@NotNull FDFParser.AnonymousCompSubTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FDFParser#frame_type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_type_qualifier(@NotNull FDFParser.Frame_type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenuItemElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuItemElement(@NotNull FDFParser.MenuItemElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleFontElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFontElement(@NotNull FDFParser.SimpleFontElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FrameDefinition}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameDefinition(@NotNull FDFParser.FrameDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontElement(@NotNull FDFParser.FontElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector2Element}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector2Element(@NotNull FDFParser.Vector2ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector4CommaElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector4CommaElement(@NotNull FDFParser.Vector4CommaElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextJustifyElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextJustifyElement(@NotNull FDFParser.TextJustifyElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FrameStatement}
	 * labeled alternative in {@link FDFParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStatement(@NotNull FDFParser.FrameStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompSubTypeDefinitionWithChildren}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompSubTypeDefinitionWithChildren(@NotNull FDFParser.CompSubTypeDefinitionWithChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousCompDefinition}
	 * labeled alternative in {@link FDFParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousCompDefinition(@NotNull FDFParser.AnonymousCompDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetPointElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPointElement(@NotNull FDFParser.SetPointElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlagElement}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagElement(@NotNull FDFParser.FlagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector4Element}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector4Element(@NotNull FDFParser.Vector4ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector3Element}
	 * labeled alternative in {@link FDFParser#frame_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector3Element(@NotNull FDFParser.Vector3ElementContext ctx);
}