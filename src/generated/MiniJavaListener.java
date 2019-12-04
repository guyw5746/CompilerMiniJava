package generated;
// Generated from MiniJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(MiniJavaParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(MiniJavaParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MiniJavaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MiniJavaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(MiniJavaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(MiniJavaParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(MiniJavaParser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(MiniJavaParser.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalRest(MiniJavaParser.FormalRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalRest(MiniJavaParser.FormalRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(MiniJavaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(MiniJavaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expList}.
	 * @param ctx the parse tree
	 */
	void enterExpList(MiniJavaParser.ExpListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expList}.
	 * @param ctx the parse tree
	 */
	void exitExpList(MiniJavaParser.ExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expRest}.
	 * @param ctx the parse tree
	 */
	void enterExpRest(MiniJavaParser.ExpRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expRest}.
	 * @param ctx the parse tree
	 */
	void exitExpRest(MiniJavaParser.ExpRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MiniJavaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MiniJavaParser.IdContext ctx);
}