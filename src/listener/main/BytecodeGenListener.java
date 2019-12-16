package listener.main;

import static listener.main.BytecodeGenListenerHelper.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
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

	// classDeclaration+
	public void exitTranslationUnit(MiniJavaParser.TranslationUnitContext ctx) {
		String classdeclaration = "";

		for (int i = 0; i < ctx.getChildCount(); i++) {
			classdeclaration += newTexts.get(ctx.classDeclaration(i));
		}

		newTexts.put(ctx, classdeclaration);
		System.out.println(newTexts.get(ctx));
	}

	// class 이름을 가져와서 map에 넣어줌.
	public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		symbolTable.putclassname(ctx.getChild(1).getText());
	}

	// 'class' IDENTIFIER '{' classMember* '}'
	public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		String classProlog = getFunProlog();
		String decl = "";
		String s = "";
		String main = "", method = "";

		if (ctx.getChildCount() >= 4) {

			decl += ".class public " + ctx.getChild(1).getText();
			s += classProlog;
			int count = 0;
			for (int i = 0; i < ctx.getChildCount(); i++) {
				if (isMain(ctx, i)) {
					main += newTexts.get(ctx.classMember(count));
					count++;
				} else if (isMethod(ctx, i)) {
					method += newTexts.get(ctx.classMember(count));
					count++;
				}
			}

		}
		newTexts.put(ctx, decl + s + method + main);
	}

	public void enterClassMember(MiniJavaParser.ClassMemberContext ctx) {
	}

	// field | mainMethod | method ;
	public void exitClassMember(MiniJavaParser.ClassMemberContext ctx) {
		String classmember = "";

		if (ctx.getChildCount() > 0) {
			// field에서 처리한 것을 newTexts에 추가.
			if (ctx.field() != null) // field
				classmember += newTexts.get(ctx.field());
			// mainMethod에서 처리한 것을 newTexts에 추가.
			else if (ctx.mainMethod() != null) // mainMethod
				classmember += newTexts.get(ctx.mainMethod());
			// method에서 처리한 것을 newTexts에 추가.
			else if (ctx.method() != null) // method
				classmember += newTexts.get(ctx.method());
		}
		newTexts.put(ctx, classmember);

	}

	public void enterField(MiniJavaParser.FieldContext ctx) {
	}

	// 'public' type IDENTIFIER ';'
	public void exitField(MiniJavaParser.FieldContext ctx) {
		String field = "";

		if (ctx.getChildCount() == 4) {
			field += "public" + newTexts.get(ctx.type()) + ctx.getChild(2).getText() + ";";
		}

		newTexts.put(ctx, field);
	}

	// main의 이름과 형식에 맞는 jvm형태로로 저장한다. function map에 넣어줌.
	public void enterMainMethod(MiniJavaParser.MainMethodContext ctx) {
		symbolTable.initFunDecl();

		symbolTable.putLocalVar("args", Type.INTARRAY);
	}

	// 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{'
	// blockStatement* '}'
	public void exitMainMethod(MiniJavaParser.MainMethodContext ctx) {
		String main = "";
		String fname = getFunName(ctx);

		main += funcHeader(ctx, fname);

		int count = 0;
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (isblockstatement(ctx, i)) {
				main += newTexts.get(ctx.blockStatement(count));
				count++;
			}
		}
		main += "return \n.end method";
		newTexts.put(ctx, main);
	}

	// method의 이름과 형식에 맞는 jvm형태로로 저장한다. function map에 넣어줌.
	public void enterMethod(MiniJavaParser.MethodContext ctx) {
		symbolTable.initFunDecl();

		ParametersContext params;

		symbolTable.putFunSpecStr(ctx);
		params = (MiniJavaParser.ParametersContext) ctx.getChild(4);
		symbolTable.putParams(params);
	}

	/*
	 * 'public' type IDENTIFIER '(' ')' '{' blockStatement* '}' | 'public' type
	 * IDENTIFIER '(' parameters ')' '{' blockStatement* '}'
	 */
	public void exitMethod(MiniJavaParser.MethodContext ctx) {
		String fname = ctx.getChild(2).getText();
		String s = "";

		s += funcHeader(ctx, fname);

		int count = 0;
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (isblockstatement(ctx, i)) {
				s += newTexts.get(ctx.blockStatement(count));
				count++;
			}
		}

		newTexts.put(ctx, s);

	}

	// main이 들어왔을때 시작 부분 정의
	private String funcHeader(MiniJavaParser.MainMethodContext ctx, String fname) {
		return ".method public static " + symbolTable.getFunSpecStr(fname) + "\n" + ".limit stack " + getStackSize(ctx)
				+ "\n" + ".limit locals " + getLocalVarSize(ctx) + "\n";

	}

	// method가 들어왔을때 시작 부분 정의
	private String funcHeader(MiniJavaParser.MethodContext ctx, String fname) {
		return ".method public static " + symbolTable.getFunSpecStr(fname) + "\n" + ".limit stack " + getStackSize(ctx)
				+ "\n" + ".limit locals " + getLocalVarSize(ctx) + "\n";

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

	/*
	 * block | printStatement | ifStatement | whileStatement | emptyStatement |
	 * expressionStatement | returnStatement ;
	 */
	public void exitStatement(MiniJavaParser.StatementContext ctx) {

		String stmt = "";
		if (ctx.getChildCount() > 0) {
			// block에서 처리한 것을 newTexts에 추가.
			if (ctx.block() != null) // block
				stmt += newTexts.get(ctx.block());
			// printStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.printStatement() != null) // printStatement
				stmt += newTexts.get(ctx.printStatement());
			// ifStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.ifStatement() != null) // ifStatement
				stmt += newTexts.get(ctx.ifStatement());
			// whileStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.whileStatement() != null) // whileStatement
				stmt += newTexts.get(ctx.whileStatement());
			// emptyStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.emptyStatement() != null) // emptyStatement
				stmt += newTexts.get(ctx.emptyStatement());
			// expressionStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.expressionStatement() != null) // expressionStatement
				stmt += newTexts.get(ctx.expressionStatement());
			// returnStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.returnStatement() != null) // returnStatement
				stmt += newTexts.get(ctx.returnStatement());
		}
		newTexts.put(ctx, stmt);
	}

	public void enterBlock(MiniJavaParser.BlockContext ctx) {
	}

	// '{' blockStatement* '}'
	public void exitBlock(MiniJavaParser.BlockContext ctx) {
		String block = "";

		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (isblockstatement(ctx, i)) {
				block += newTexts.get(ctx.blockStatement(i - 1));
			}
		}
		newTexts.put(ctx, block);

	}

	public void enterIfStatement(MiniJavaParser.IfStatementContext ctx) {
	}

	/*
	 * 'if' '(' expression ')' statement | 'if' '(' expression ')' statement ('else'
	 * statement) ;
	 */
	public void exitIfStatement(MiniJavaParser.IfStatementContext ctx) {
		String stmt = "";
		String condExpr = newTexts.get(ctx.expression());
		String thenStmt = newTexts.get(ctx.statement(0));

		String lend = symbolTable.newLabel();
		String lelse = symbolTable.newLabel();

		if (noElse(ctx)) {
			stmt += condExpr + "ifeq " + lend + "\n" + thenStmt + lend + ":";
		} else {
			String elseStmt = newTexts.get(ctx.statement(1));
			stmt += condExpr + "ifeq " + lelse + "\n" + thenStmt + "goto " + lend + "\n" + lelse + ": " + elseStmt
					+ "\n" + lend + ":";
		}

		newTexts.put(ctx, stmt);
	}

	public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
	}

	// 'while' '(' expression ')' statement
	public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
		String loop = symbolTable.newLabel();
		String stmt = "";

		if (ctx.getChildCount() == 5) {
			stmt += loop + ":\n" + newTexts.get(ctx.expression()) + "ifne " + loop;
			// Loop:
			// expr
			// ifne Loop
		}
		newTexts.put(ctx, stmt);
	}

	public void enterEmptyStatement(MiniJavaParser.EmptyStatementContext ctx) {
	}

	public void exitEmptyStatement(MiniJavaParser.EmptyStatementContext ctx) {
	}

	public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
	}

	// 'System' '.' 'out' '.' 'println' '(' expression ')' ';'
	public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
		String print = "";

		print += "getstatic java/lang/System/out Ljava/io/PrintStream; " + "\n"
				+ newTexts.get(ctx.expression().primaryExpression().expressionList())
				+ newTexts.get(ctx.expression().primaryExpression());

		if (ctx.getChildCount() >= 8) {
			print += "invokevirtual " + symbolTable.getFunSpecStr("_print") + "\n";
		}

		newTexts.put(ctx, print);
	}

	public void enterExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) {
	}

	// expression ';'
	public void exitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx) {
		String stmt = "";
		for (int i = 1; i < ctx.getChild(0).getChildCount(); i++) {
			if (isExpressionstatement(ctx, i)) {
				stmt += newTexts.get(ctx.expression().getChild(i));
			}
		}
		if (ctx.expression() != null)
			stmt += newTexts.get(ctx.expression());
		newTexts.put(ctx, stmt);
	}

	// 단항 연산자 처리 부분.
	private String handleUnaryExpr(MiniJavaParser.ExpressionContext ctx, String expr) {
		String l1 = symbolTable.newLabel();
		String l2 = symbolTable.newLabel();
		String lend = symbolTable.newLabel();

		expr += newTexts.get(ctx.expression(0));
		switch (ctx.getChild(0).getText()) {
		case "-":
			expr += "ineg \n";
			break;
		case "--":
			expr += "ldc 1" + "\n" + "isub" + "\n";
			break;
		case "++":
			expr += "ldc 1" + "\n" + "iadd" + "\n";
			break;
		case "!":
			expr += "ifeq " + l2 + "\n" + l1 + ": " + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ": " + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		}
		return expr;
	}

	// 이항 연산자 처리 부분.
	private String handleBinExpr(MiniJavaParser.ExpressionContext ctx, String expr) {
		String l2 = symbolTable.newLabel();
		String lend = symbolTable.newLabel();

		expr += newTexts.get(ctx.expression(0));
		expr += newTexts.get(ctx.expression(1));

		switch (ctx.getChild(1).getText()) {
		// 사칙연산 처리.
		case "*":
			expr += "imul \n";
			break;
		case "/":
			expr += "idiv \n";
			break;
		case "%":
			expr += "irem \n";
			break;
		case "+":
			expr += "iadd \n";
			break;
		case "-":
			expr += "isub \n";
			break;

		// 둘 이 같을 때 수행. 같을 때를 판별하는 ifeq를 사용.
		case "==":
			expr += "isub " + "\n" + "ifeq " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n" + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		// 둘 이 다를 때 수행. 다를 때를 판별하는 ifeq를 사용.
		case "!=":
			expr += "isub " + "\n" + "ifne " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n" + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		// 작거나 같을 때 수행. 작거나 같을 때를 판별하는 ifle를 사용.
		// ifle를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
		case "<=":
			expr += "isub " + "\n" + "ifle " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n" + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		// 보다 작을 때 수행. 보다 작을 때를 판별하는 iflt를 사용.
		// iflt를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
		case "<":
			expr += "isub " + "\n" + "iflt " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n" + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		// 크거나 같을 때 수행. 크거나 같을 때를 판별하는 ifge를 사용.
		// ifge를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
		case ">=":
			expr += "isub " + "\n" + "ifge " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n" + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		// 보다 클 때 수행. 보다 클 때를 판별하는 ifgt를 사용.
		// ifgt를 사용해서 맞으면 l2로 보낸다. 아니면 그대로 진행.
		case ">":
			expr += "isub " + "\n" + "ifgt " + l2 + "\n" + "ldc 0" + "\n" + "goto " + lend + "\n" + l2 + ":\n" + "ldc 1"
					+ "\n" + lend + ": " + "\n";
			break;
		// 둘 모두 참이면 참을 반환하는 and를 수행.
		case "and":
			expr += "ifne " + lend + "\n" + "pop" + "\n" + "ldc 0" + "\n" + lend + ": " + "\n";
			break;
		// 하나라도 참이면 참을 반환하는 or을 수행.
		case "or":
			expr += "ifeq" + lend + "\n" + "pop" + "\n" + "ldc 0" + "\n" + lend + ": " + "\n";
			break;

		}
		return expr;
	}

	public void enterReturnStatement(MiniJavaParser.ReturnStatementContext ctx) {
	}

	/*
	 * 'return' ';' | 'return' expression ';' ;
	 */
	public void exitReturnStatement(MiniJavaParser.ReturnStatementContext ctx) {
		String stmt = "";

		String fname = ctx.getChild(1).getText();

		if (symbolTable.getVarType(fname) == Type.INT) {
			stmt += "\nireturn" + "\n.end method\n";
		} else if (fname instanceof String) {
			stmt += "ldc " + fname + "\nireturn" + "\n.end method\n";
		} else {
			stmt += "\nreturn" + "\n.end method\n";
		}

		newTexts.put(ctx, stmt);

	}

	public void enterBlockStatement(MiniJavaParser.BlockStatementContext ctx) {
	}

	/*
	 * statement | localVariableDeclarationStatement ;
	 */
	public void exitBlockStatement(MiniJavaParser.BlockStatementContext ctx) {
		String block = "";

		if (ctx.getChildCount() > 0) {
			// statement에서 처리한 것을 newTexts에 추가.
			if (ctx.statement() != null) // statement
				block += newTexts.get(ctx.statement());
			// localVariableDeclarationStatement에서 처리한 것을 newTexts에 추가.
			else if (ctx.localVariableDeclarationStatement() != null) // localVariableDeclarationStatement
				block += newTexts.get(ctx.localVariableDeclarationStatement());
		}
		newTexts.put(ctx, block);

	}

	// 지역변수의 이름과 형식에 맞는 jvm형태로로 저장한다. local map에 넣어줌.
	public void enterLocalVariableDeclarationStatement(MiniJavaParser.LocalVariableDeclarationStatementContext ctx) {
		if (isDeclWithInit(ctx)) {
			symbolTable.putLocalVarWithInitVal(getLocalVarName(ctx), Type.INT, initVal(ctx));
		} else {
			symbolTable.putLocalVar(getLocalVarName(ctx), Type.INT);
		}
	}

	/*
	 * type IDENTIFIER ';' | type IDENTIFIER ('=' expression) ';' ;
	 */
	public void exitLocalVariableDeclarationStatement(MiniJavaParser.LocalVariableDeclarationStatementContext ctx) {

		String varDecl = "";

		if (isDeclWithInit(ctx)) {
			// symbolTable.putLocalVarWithInitVal(getLocalVarName(ctx), Type.INT,
			// initVal(ctx));
			String vId = symbolTable.getVarId(ctx);
			if (ctx.getChild(0).getText().equals("int")) {
				varDecl += "ldc " + ctx.getChild(3).getText() + "\n" + "istore_" + vId + "\n";
			}
		}

		newTexts.put(ctx, varDecl);

	}

	public void enterExpression(MiniJavaParser.ExpressionContext ctx) {
	}

	/*
	 * primaryExpression | expression '.' IDENTIFIER '(' ')' | expression '.'
	 * IDENTIFIER '(' expressionList ')' | 'new' IDENTIFIER '(' ')' | ('-'|'!')
	 * expression | expression ('*' | '/' | '%') expression | expression ('+' | '-')
	 * expression | expression ('<=' | '>=' | '>' | '<') expression | expression
	 * ('==' | '!=') expression | expression '&&' expression | expression '||'
	 * expression | expression '='<assoc=right> expression ;
	 */
	public void exitExpression(MiniJavaParser.ExpressionContext ctx) {
		String expr = "";
		if (ctx.primaryExpression() != null)
			expr = newTexts.get(ctx.primaryExpression());
		else if (ctx.getChild(1).getText().equals(".")) {
			handleFunCall(ctx, expr);
		} else if (ctx.getChildCount() == 2) {
			expr = handleUnaryExpr(ctx, newTexts.get(ctx) + expr);
		} else if (ctx.getChildCount() == 3) {
			if (ctx.getChild(1).getText().equals("=")) {
				expr = "istore_" + symbolTable.getVarId(ctx.getChild(0).getText()) + " \n"
						+ newTexts.get(ctx.expression(0));
			} else {
				expr = handleBinExpr(ctx, expr);
			}
		}

		newTexts.put(ctx, expr);

	}

	// PrimaryExpressionContext를 인수로 받을 때 사용. invokestatic + method 형태.
	private String handleFunCall(MiniJavaParser.PrimaryExpressionContext ctx, String expr) {
		String fname = getFunName(ctx);

		expr += newTexts.get(ctx.expressionList());
		expr = "invokestatic " + symbolTable.getclassname() + "/" + symbolTable.getFunSpecStr(fname) + "\n";

		return expr;

	}

	// ExpressionContext를 인수로 받을 때 사용. invokestatic + method 형태.
	private String handleFunCall(MiniJavaParser.ExpressionContext ctx, String expr) {
		String fname = getFunName(ctx);

		if (ctx.getChildCount() >= 5) {
			expr = "invokestatic " + symbolTable.getclassname() + "/" + symbolTable.getFunSpecStr(fname) + "\n";
		}
		return expr;

	}

	public void enterPrimaryExpression(MiniJavaParser.PrimaryExpressionContext ctx) {
	}

	/*
	 * : '(' expression ')' | 'this' | 'null' | 'false' | 'true' | INTEGER |
	 * IDENTIFIER '(' ')' | IDENTIFIER '(' expressionList ')' | IDENTIFIER ;
	 */
	public void exitPrimaryExpression(MiniJavaParser.PrimaryExpressionContext ctx) {
		String s = "";

		if (ctx.getChildCount() == 1) {
			if (ctx.getChild(0).getText().equals("true")) {
				s += "true";
			} else if (ctx.getChild(0).getText().equals("false")) {
				s += "false";
			} else if (ctx.getChild(0).getText().equals("null")) {
				s += "null";
			} else if (ctx.getChild(0).getText().equals("this")) {
				s += "this";
			} else if (ctx.INTEGER() != null) {
				String literalStr = ctx.INTEGER().getText();
				s += "ldc " + literalStr + " \n";
			} else {
				s += "iload_" + symbolTable.getVarId(ctx.IDENTIFIER().getText()) + " \n";
			}
		} else if (ctx.getChildCount() == 3) {
			if (ctx.getChild(0).getText().equals("(")) {
				s += handleFunCall(ctx, s);
			} else {
				s += ctx.IDENTIFIER() + "( )";
			}
		} else {
			s += handleFunCall(ctx, s);
		}

		newTexts.put(ctx, s);
	}

	public void enterExpressionList(MiniJavaParser.ExpressionListContext ctx) {
	}

	/*
	 * expressionList : expression (',' expression)* ;
	 */
	public void exitExpressionList(MiniJavaParser.ExpressionListContext ctx) {
		String s = "";

		int count = 0;
		if (ctx.getChildCount() >= 1) {
			for (int i = 0; i < ctx.getChildCount(); i++) {
				if (isExpressionstatement(ctx, i)) {
					s += newTexts.get(ctx.expression(count));
					count++;
				}
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
