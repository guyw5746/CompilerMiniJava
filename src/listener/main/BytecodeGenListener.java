package listener.main;

import static listener.main.BytecodeGenListenerHelper.*;
import static listener.main.SymbolTable.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import generated.MiniJavaBaseListener;
import generated.MiniJavaParser;
import generated.MiniJavaParser.ParametersContext;
import listener.main.SymbolTable.Type;

public class BytecodeGenListener extends MiniJavaBaseListener implements ParseTreeListener {

	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
	SymbolTable symbolTable = new SymbolTable();

	public void enterTranslationUnit(MiniJavaParser.TranslationUnitContext ctx) {
	}

	/* translationUnit : classDeclaration **/
	public void exitTranslationUnit(MiniJavaParser.TranslationUnitContext ctx) {
		String classdeclaration = "";

		for (int i = 0; i < ctx.getChildCount(); i++) {
			classdeclaration += newTexts.get(ctx.classDeclaration(i));
		}

		newTexts.put(ctx, classdeclaration);

		System.out.println(newTexts.get(ctx));
	}

	public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
	}

	/*
	 * classDeclaration : 'class' IDENTIFIER '{' classMember* '}' ;
	 */
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

	public void enterClassMember(MiniJavaParser.ClassMemberContext ctx) {
	}

	/*
	 * classMember : field | mainMethod | method ;
	 */
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

	public void enterField(MiniJavaParser.FieldContext ctx) {
	}

	/*
	 * field : 'public' type IDENTIFIER ';' ;
	 */
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
	
	/*
	 * mainMethod : 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER
	 * ')' '{' blockStatement* '}' ;
	 */
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

	/*
	 * method : 'public' type IDENTIFIER '(' ')' '{' blockStatement* '}' | 'public'
	 * type IDENTIFIER '(' parameters ')' '{' blockStatement* '}' ;
	 */
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

	public void enterParameters(MiniJavaParser.ParametersContext ctx) {
		
	}

	public void exitParameters(MiniJavaParser.ParametersContext ctx) {
	}

	public void enterParameter(MiniJavaParser.ParameterContext ctx) {
		
	}

	public void exitParameter(MiniJavaParser.ParameterContext ctx) {
	}

	public void enterType(MiniJavaParser.TypeContext ctx) {
	}

	public void exitType(MiniJavaParser.TypeContext ctx) {
	}

	public void enterStatement(MiniJavaParser.StatementContext ctx) {
	}

	public void exitStatement(MiniJavaParser.StatementContext ctx) {
	}

	public void enterBlock(MiniJavaParser.BlockContext ctx) {
	}

	public void exitBlock(MiniJavaParser.BlockContext ctx) {
	}

	public void enterIfStatement(MiniJavaParser.IfStatementContext ctx) {
	}

	public void exitIfStatement(MiniJavaParser.IfStatementContext ctx) {
	}

	public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
	}

	public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
	}

	////////////////////////////////////////////////////
	public void enterEmptyStatement(MiniJavaParser.EmptyStatementContext ctx) {
	}

	/////////////////////////////////////////////////////
	public void exitEmptyStatement(MiniJavaParser.EmptyStatementContext ctx) {
	}

	public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
	}

	public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
	}

	public void enterExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) {
	}

	public void exitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) {
	}
	
	private String handleUnaryExpr(MiniJavaParser.ExpressionContext ctx, String expr) {
		String l1 = symbolTable.newLabel();
		String l2 = symbolTable.newLabel();
		String lend = symbolTable.newLabel();
		
		expr += newTexts.get(ctx.expression(0));
		switch(ctx.getChild(0).getText()) {
		case "-":
			expr += "           ineg \n"; break;
		case "--":
			expr += "ldc 1" + "\n"
					+ "isub" + "\n";
			break;
		case "++":
			expr += "ldc 1" + "\n"
					+ "iadd" + "\n";
			break;
		case "!":
			expr += "ifeq " + l2 + "\n"
					+ l1 + ": " + "ldc 0" + "\n"
					+ "goto " + lend + "\n"
					+ l2 + ": " + "ldc 1" + "\n"
					+ lend + ": " + "\n";
			break;
		}
		return expr;
	}


	private String handleBinExpr(MiniJavaParser.ExpressionContext ctx, String expr) {
		String l2 = symbolTable.newLabel();
		String lend = symbolTable.newLabel();
		
		expr += newTexts.get(ctx.expression(0));
		expr += newTexts.get(ctx.expression(1));
		
		switch (ctx.getChild(1).getText()) {
			case "*":
				expr += "imul \n"; break;
			case "/":
				expr += "idiv \n"; break;
			case "%":
				expr += "irem \n"; break;
			case "+":		// expr(0) expr(1) iadd
				expr += "iadd \n"; break;
			case "-":
				expr += "isub \n"; break;
				
			case "==":
				expr += "isub " + "\n"
						+ "ifeq " + l2 + "\n"
						+ "ldc 0" + "\n"
						+ "goto " + lend + "\n"
						+ l2 + ": " + "ldc 1" + "\n"
						+ lend + ": " + "\n";
				break;
			case "!=":
				expr += "isub " + "\n"
						+ "ifne "+ l2 + "\n"
						+ "ldc 0" + "\n"
						+ "goto " + lend + "\n"
						+ l2 + ": " + "ldc 1" + "\n"
						+ lend + ": " + "\n";
				break;
			// 작거나 같을 때 수행. 작거나 같을 때를 판별하는 ifle를 사용.
			// ifle를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
			case "<=":
				expr += "isub " + "\n"
						+ "ifle " + l2 + "\n"
						+ "ldc 0" + "\n"
						+ "goto " + lend + "\n"
						+ l2 + ": " + "ldc 1" + "\n"
						+ lend + ": " + "\n";
				// <(5) Fill here>
				break;
			// 보다 작을 때 수행. 보다 작을 때를 판별하는 iflt를 사용.
			// iflt를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
			case "<":
				expr += "isub " + "\n"
						+ "iflt "+ l2 + "\n"
						+ "ldc 0" + "\n"
						+ "goto " + lend + "\n"
						+ l2 + ": " + "ldc 1" + "\n"
						+ lend + ": " + "\n";
				// <(6) Fill here>
				break;
				// 크거나 같을 때 수행. 크거나 같을 때를 판별하는 ifge를 사용.
				// ifge를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
			case ">=":
				expr += "isub " + "\n"
						+ "ifge "+ l2 + "\n"
						+ "ldc 0" + "\n"
						+ "goto " + lend + "\n"
						+ l2 + ": " + "ldc 1" + "\n"
						+ lend + ": " + "\n";
				// <(7) Fill here>
				break;
			// 보다 클 때 수행. 보다 클 때를 판별하는 ifgt를 사용.
			// ifgt를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
			case ">":
				expr += "isub " + "\n"
						+ "ifgt "+ l2 + "\n"
						+ "ldc 0" + "\n"
						+ "goto " + lend + "\n"
						+ l2 + ": " + "ldc 1" + "\n"
						+ lend + ": " + "\n";
				// <(8) Fill here>
				break;

			case "and":
				expr +=  "ifne "+ lend + "\n"
						+ "pop" + "\n" + "ldc 0" + "\n"
						+ lend + ": " + "\n"; break;
			// 하나라도 참이면 참을 반환하는 or을 수행.
			case "or":
				expr += "ifeq" + lend + "\n"
						+ "pop" + "\n" + "ldc 0" + "\n" 
						+ lend + ": " + "\n";
				// <(9) Fill here>
				break;

		}
		return expr;
	}
	

	public void enterReturnStatement(MiniJavaParser.ReturnStatementContext ctx) {
	}

	public void exitReturnStatement(MiniJavaParser.ReturnStatementContext ctx) {
		String stmt = "";

		String fname = ctx.getChild(1).getText();
		
		if(symbolTable.getVarType(fname) == Type.BOOLEAN) {
			stmt += "areturn" + "\n.end method\n";
		} else if (symbolTable.getVarType(fname) == Type.INT) {
			stmt += "ireturn" + "\n.end method\n";
		} else {
			stmt += "return" + "\n.end method\n";
		}

		newTexts.put(ctx, stmt);

	}

	public void enterBlockStatement(MiniJavaParser.BlockStatementContext ctx) {
	}

	/*
	 * block : '{' blockStatement* '}' ;
	 */
	public void exitBlockStatement(MiniJavaParser.BlockStatementContext ctx) {
		String block = "";

		if (ctx.getChildCount() > 0) {
			// expr_stmt에서 처리한 것을 newTexts에 추가.
			if (ctx.statement() != null) // expr_stmt
				block += newTexts.get(ctx.statement());
			// compound_stmt에서 처리한 것을 newTexts에 추가.
			else if (ctx.localVariableDeclarationStatement() != null) // compound_stmt
				block += newTexts.get(ctx.localVariableDeclarationStatement());
		}
		newTexts.put(ctx, block);
		
		
	}


	public void enterLocalVariableDeclarationStatement(MiniJavaParser.LocalVariableDeclarationStatementContext ctx) {
		if (isDeclWithInit(ctx)) {
			if (ctx.getChild(0).getText().equals("int")) {
				symbolTable.putLocalVarWithInitVal(getLocalVarName(ctx), Type.INT, initVal(ctx));
			}
			if (ctx.getChild(0).getText().equals("boolean")) {
				symbolTable.putLocalVarWithInitVal(getLocalVarName(ctx), Type.BOOLEAN, initbool(ctx));
			}
		} else {
			if (ctx.getChild(0).getText().equals("int")) {
				symbolTable.putLocalVar(getLocalVarName(ctx), Type.INT);
			}
			if (ctx.getChild(0).getText().equals("boolean")) {
				symbolTable.putLocalVar(getLocalVarName(ctx), Type.BOOLEAN);
			}
		}
	}

	/*
	 * localVariableDeclarationStatement : type IDENTIFIER ';' | type IDENTIFIER
	 * ('=' expression) ';' ;
	 */
	public void exitLocalVariableDeclarationStatement(MiniJavaParser.LocalVariableDeclarationStatementContext ctx) {

		String varDecl = "";
		
		if (isDeclWithInit(ctx)) {
			//symbolTable.putLocalVarWithInitVal(getLocalVarName(ctx), Type.INT, initVal(ctx));
			String vId = symbolTable.getVarId(ctx);
			if (ctx.getChild(0).getText().equals("int")) {
				varDecl += "ldc " + ctx.getChild(3).getText() + "\n"
						+ "istore_" + vId + "\n"; 
			}
			if (ctx.getChild(0).getText().equals("boolean")) {
				if(ctx.getChild(3).getText().equals("true")) {
					varDecl += "iconst_1\n istore_" + vId + "\n";
				} else {
					varDecl += "iconst_0\n istore_" + vId + "\n";
				}
			}
						
		}
		
		newTexts.put(ctx, varDecl);
		
	}

	public void enterExpression(MiniJavaParser.ExpressionContext ctx) {
	}

	public void exitExpression(MiniJavaParser.ExpressionContext ctx) {
	}

	public void enterPrimaryExpression(MiniJavaParser.PrimaryExpressionContext ctx) {
	}

	/*:   '(' expression ')'
    |   'this'
    |   'null'
    |   'false'
    |   'true'
    |   INTEGER
    |   IDENTIFIER '(' ')'
    |   IDENTIFIER '(' expressionList ')'
    |   IDENTIFIER
    ;*/
	public void exitPrimaryExpression(MiniJavaParser.PrimaryExpressionContext ctx) {
		String s = "";
		
		if(ctx.getChildCount() == 1) {
			if(ctx.getChild(0).getText().equals("true")) {
				s += "true";
			} else if(ctx.getChild(0).getText().equals("false")) {
				s += "false";
			} else if(ctx.getChild(0).getText().equals("null")) {
				s += "null";
			} else if(ctx.getChild(0).getText().equals("this")) {
				s += "this";
			} else if(ctx.INTEGER() != null) {
				s += ctx.INTEGER();
			} else {
				s += ctx.IDENTIFIER();
			}
		} else if(ctx.getChildCount() == 3) {
			if(ctx.getChild(0).getText().equals("(")) {
				s += "(" + ctx.expression() + ")";
			} else {
				s += ctx.IDENTIFIER() + "( )";
			}
		} else {
			s += ctx.IDENTIFIER() + "(" + ctx.expressionList() + ")";
		}
		
		newTexts.put(ctx, s);
	}

	public void enterExpressionList(MiniJavaParser.ExpressionListContext ctx) {
	}

	/*expressionList
    :   expression (',' expression)*
    ;*/
	public void exitExpressionList(MiniJavaParser.ExpressionListContext ctx) {
		String s = "";
		
		if(ctx.getChildCount() >= 1) {
			for(int i = 0; i < ctx.getChildCount(); i++) {
				if(ctx.getChild(i).getText().equals(",")) {
					continue;
				}
				
				s += ctx.getChild(i).getText();
			}
		}
		newTexts.put(ctx, s);
	}

	public void enterEveryRule(ParserRuleContext ctx) {
	}

	public void exitEveryRule(ParserRuleContext ctx) {
	}

	public void visitTerminal(TerminalNode node) {
	}

	public void visitErrorNode(ErrorNode node) {
	}
}
