package generated;
// Generated from MiniJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull MiniJavaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull MiniJavaParser.MethodDeclContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#expList}.
	 * @param ctx the parse tree
	 */
	void enterExpList(@NotNull MiniJavaParser.ExpListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expList}.
	 * @param ctx the parse tree
	 */
	void exitExpList(@NotNull MiniJavaParser.ExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(@NotNull MiniJavaParser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(@NotNull MiniJavaParser.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(@NotNull MiniJavaParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(@NotNull MiniJavaParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalRest(@NotNull MiniJavaParser.FormalRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalRest(@NotNull MiniJavaParser.FormalRestContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull MiniJavaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull MiniJavaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull MiniJavaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull MiniJavaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull MiniJavaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull MiniJavaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expRest}.
	 * @param ctx the parse tree
	 */
	void enterExpRest(@NotNull MiniJavaParser.ExpRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expRest}.
	 * @param ctx the parse tree
	 */
	void exitExpRest(@NotNull MiniJavaParser.ExpRestContext ctx);
}