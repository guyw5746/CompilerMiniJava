package listener.main;

import generated.MiniJavaParser;
import generated.MiniJavaParser.*;

public class BytecodeGenListenerHelper {

	static boolean isMain(MiniJavaParser.ClassDeclarationContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniJavaParser.MainMethodContext;
	}

	static boolean isMethod(MiniJavaParser.ClassDeclarationContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniJavaParser.MethodContext;
	}

	static boolean isblockstatement(MiniJavaParser.MainMethodContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.BlockStatementContext;
	}

	static boolean isblockstatement(MiniJavaParser.MethodContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.BlockStatementContext;
	}
	
	static boolean isExpressionstatement(MiniJavaParser.ExpressionStatementContext ctx, int i) {
		return ctx.getChild(0).getChild(i) instanceof MiniJavaParser.ExpressionContext;
	}
	
	static boolean isExpressionstatement(MiniJavaParser.ExpressionListContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.ExpressionContext;
	}

	// 함수의 이름을 반환하는 메소드.
	// type_spec + IDENT + '(' + params + ')' + compound_stmt 형식일 때 수행.
	// 즉, 함수 선언 부분이 들어왔을 때 함수 이름을 반환..
	static String getFunName(MethodContext ctx) {
		return ctx.getChild(2).getText();
	}

	static String getFunName(MainMethodContext ctx) {
		return ctx.getChild(3).getText();
	}

	// 함수의 이름을 반환하는 메소드.
	// IDENT + '(' + params + ')'형식일 때 수행.
	// 즉, 함수가 쓰일 때 함수 이름을 반환.
	static String getFunName(ExpressionContext ctx) {
		return ctx.getChild(0).getText();
	}

	static String getFunName(PrimaryExpressionContext ctx) {
		return ctx.getChild(0).getText();
	}

	static String getStackSize(MainMethodContext ctx) {
		return "32";
	}

	static String getLocalVarSize(MainMethodContext ctx) {
		return "32";
	}

	static String getStackSize(MethodContext ctx) {
		return "32";
	}

	static String getLocalVarSize(MethodContext ctx) {
		return "32";
	}

	static boolean isDeclWithInit(LocalVariableDeclarationStatementContext ctx) {
		return ctx.getChildCount() == 5;
	}

	// 지역변수의 이름을 반환.
	static String getLocalVarName(LocalVariableDeclarationStatementContext local_decl) {
		return local_decl.getChild(1).getText();
	}

	static int initVal(LocalVariableDeclarationStatementContext ctx) {
		return Integer.parseInt(ctx.getChild(3).getText());
	}

	static boolean initbool(LocalVariableDeclarationStatementContext ctx) {
		return Boolean.parseBoolean(ctx.getChild(3).getText());
	}

	static String getFunProlog() {
		String Text = "";

		Text += "\n.super java/lang/Object" + "\n; strandard initializer" + "\n.method public <init>()V" + "\naload_0"
				+ "\ninvokenonvirtual java/lang/Object/<init>()V" + "\nreturn" + "\n.end method\n";

		return Text;
	}

	static String getCurrentClassName(ExpressionContext ctx) {
		return "Test";
	}

	static String getCurrentClassName(PrimaryExpressionContext ctx) {
		return "Test";
	}
	
	static boolean noElse(IfStatementContext ctx) {
		return ctx.getChildCount() < 5;
	}

}
