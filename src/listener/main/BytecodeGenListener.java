package listener.main;

import static listener.main.BytecodeGenListenerHelper.*;
import static listener.main.SymbolTable.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import generated.MiniJavaBaseListener;
import generated.MiniJavaParser;
import generated.MiniJavaParser.ParametersContext;
import listener.main.SymbolTable.Type;
import generated.*;

public class BytecodeGenListener extends MiniJavaBaseListener implements ParseTreeListener {
	
	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
	SymbolTable symbolTable = new SymbolTable();
	

	public void enterTranslationUnit(MiniJavaParser.TranslationUnitContext ctx) { }

	public void exitTranslationUnit(MiniJavaParser.TranslationUnitContext ctx) { }
	
	public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) { }
	
	public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) { }
	
	public void enterClassMember(MiniJavaParser.ClassMemberContext ctx) { }
	
	public void exitClassMember(MiniJavaParser.ClassMemberContext ctx) { }
	
	public void enterField(MiniJavaParser.FieldContext ctx) { }
	
	public void exitField(MiniJavaParser.FieldContext ctx) { }
	
	public void enterMainMethod(MiniJavaParser.MainMethodContext ctx) {
		symbolTable.initFunDecl();

		symbolTable.putLocalVar("args", Type.INTARRAY);
	}
	
	public void exitMainMethod(MiniJavaParser.MainMethodContext ctx) { }
	
	public void enterMethod(MiniJavaParser.MethodContext ctx) {
		symbolTable.initFunDecl();

		ParametersContext params;

		symbolTable.putFunSpecStr(ctx);
		params = (MiniJavaParser.ParametersContext) ctx.getChild(4);
		symbolTable.putParams(params);

	}
	
	public void exitMethod(MiniJavaParser.MethodContext ctx) { }
	
	public void enterParameters(MiniJavaParser.ParametersContext ctx) { }
	
	public void exitParameters(MiniJavaParser.ParametersContext ctx) { }
	
	public void enterParameter(MiniJavaParser.ParameterContext ctx) { }
	
	public void exitParameter(MiniJavaParser.ParameterContext ctx) { }
	
	public void enterType(MiniJavaParser.TypeContext ctx) { }
	
	public void exitType(MiniJavaParser.TypeContext ctx) { }
	
	public void enterStatement(MiniJavaParser.StatementContext ctx) { }
	
	public void exitStatement(MiniJavaParser.StatementContext ctx) { }
	
	public void enterBlock(MiniJavaParser.BlockContext ctx) { }
	
	public void exitBlock(MiniJavaParser.BlockContext ctx) { }
	
	public void enterIfStatement(MiniJavaParser.IfStatementContext ctx) { }
	
	public void exitIfStatement(MiniJavaParser.IfStatementContext ctx) { }
	
	public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) { }
	
	public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) { }
	
	public void enterEmptyStatement(MiniJavaParser.EmptyStatementContext ctx) { }
	
	public void exitEmptyStatement(MiniJavaParser.EmptyStatementContext ctx) { }
	
	public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) { }
	
	public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) { }
	
	public void enterExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) { }
	
	public void exitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) { }
	
	public void enterReturnStatement(MiniJavaParser.ReturnStatementContext ctx) { }
	
	public void exitReturnStatement(MiniJavaParser.ReturnStatementContext ctx) { }
	
	public void enterBlockStatement(MiniJavaParser.BlockStatementContext ctx) { }

	public void exitBlockStatement(MiniJavaParser.BlockStatementContext ctx) { }

	public void enterLocalVariableDeclarationStatement(MiniJavaParser.LocalVariableDeclarationStatementContext ctx) { }

	public void exitLocalVariableDeclarationStatement(MiniJavaParser.LocalVariableDeclarationStatementContext ctx) { }

	public void enterExpression(MiniJavaParser.ExpressionContext ctx) { }

	public void exitExpression(MiniJavaParser.ExpressionContext ctx) { }

	public void enterPrimaryExpression(MiniJavaParser.PrimaryExpressionContext ctx) { }

	public void exitPrimaryExpression(MiniJavaParser.PrimaryExpressionContext ctx) { }

	public void enterExpressionList(MiniJavaParser.ExpressionListContext ctx) { }

	public void exitExpressionList(MiniJavaParser.ExpressionListContext ctx) { }

	public void enterEveryRule(ParserRuleContext ctx) { }

	public void exitEveryRule(ParserRuleContext ctx) { }

	public void visitTerminal(TerminalNode node) { }

	public void visitErrorNode(ErrorNode node) { }
}
