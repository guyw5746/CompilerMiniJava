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

	public void exitTranslationUnit(MiniJavaParser.TranslationUnitContext ctx) {
		String classdeclaration = "";

		for (int i = 0; i < ctx.getChildCount(); i++) {
			classdeclaration += newTexts.get(ctx.classDeclaration(i));
		}

		newTexts.put(ctx, classdeclaration);

		System.out.println(newTexts.get(ctx));
	}
	
	public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) { }
	
	public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		String classProlog = getFunProlog();
		String decl = "";
		String s = "";

		if (ctx.getChildCount() >= 4) {

			decl += ".class public " + ctx.getChild(1).getText();
			s += classProlog;
			for (int j = 3; j < ctx.getChildCount() - 1; j++) {
				s += newTexts.get(ctx.classMember(j));
			}

		}
		newTexts.put(ctx, decl + s);
	}
	
	public void enterClassMember(MiniJavaParser.ClassMemberContext ctx) { }
	
	public void exitClassMember(MiniJavaParser.ClassMemberContext ctx) {
		String classmember = "";

		if (ctx.getChildCount() > 0) {
			// expr_stmt에서 처리한 것을 newTexts에 추가.
			if (ctx.field() != null) // expr_stmt
				classmember += newTexts.get(ctx.field());
			// compound_stmt에서 처리한 것을 newTexts에 추가.
			else if (ctx.mainMethod() != null) // compound_stmt
				classmember += newTexts.get(ctx.mainMethod());
			// while_stmt에서 처리한 것을 newTexts에 추가.
			else if (ctx.method() != null) // while_stmt
				classmember += newTexts.get(ctx.method());
		}
		newTexts.put(ctx, classmember);

	}
	
	public void enterField(MiniJavaParser.FieldContext ctx) { }
	
	public void exitField(MiniJavaParser.FieldContext ctx) {
		String field = "";

		if (ctx.getChildCount() == 4) {
			field += "public" + newTexts.get(ctx.type()) + ctx.getChild(2).getText() + ";";
		}

		newTexts.put(ctx, field);
	}
	
	public void enterMainMethod(MiniJavaParser.MainMethodContext ctx) {
		symbolTable.initFunDecl();

		symbolTable.putLocalVar("args", Type.INTARRAY);
	}
	
	public void exitMainMethod(MiniJavaParser.MainMethodContext ctx) {
		String main = "";
		String fname = getFunName(ctx);

		if (ctx.getChildCount() >= 12) {
			main += funcHeader(ctx, fname);
		}

		newTexts.put(ctx, main);
	}
	
	public void enterMethod(MiniJavaParser.MethodContext ctx) {
		symbolTable.initFunDecl();

		ParametersContext params;

		symbolTable.putFunSpecStr(ctx);
		params = (MiniJavaParser.ParametersContext) ctx.getChild(4);
		symbolTable.putParams(params);

	}
	
	public void exitMethod(MiniJavaParser.MethodContext ctx) {
		String fname = ctx.getChild(2).getText();
		String s = "";

		s += funcHeader(ctx, fname);

		s += newTexts.get(ctx.blockStatement(0));

		newTexts.put(ctx, s);

	}
	
	private String funcHeader(MiniJavaParser.MainMethodContext ctx, String fname) {
		return ".method public static " + symbolTable.getFunSpecStr(fname) + "\n" + "\t" + ".limit stack "
				+ getStackSize(ctx) + "\n" + "\t" + ".limit locals " + getLocalVarSize(ctx) + "\n";

	}

	private String funcHeader(MiniJavaParser.MethodContext ctx, String fname) {
		return ".method public static " + symbolTable.getFunSpecStr(fname) + "\n" + "\t" + ".limit stack "
				+ getStackSize(ctx) + "\n" + "\t" + ".limit locals " + getLocalVarSize(ctx) + "\n";

	}
	
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
