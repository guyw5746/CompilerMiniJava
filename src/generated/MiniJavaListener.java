// Generated from MiniJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull MiniJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull MiniJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull MiniJavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull MiniJavaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull MiniJavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull MiniJavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(@NotNull MiniJavaParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(@NotNull MiniJavaParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull MiniJavaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull MiniJavaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull MiniJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull MiniJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(@NotNull MiniJavaParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(@NotNull MiniJavaParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull MiniJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull MiniJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull MiniJavaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull MiniJavaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MiniJavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MiniJavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(@NotNull MiniJavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(@NotNull MiniJavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull MiniJavaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull MiniJavaParser.ParametersContext ctx);
}