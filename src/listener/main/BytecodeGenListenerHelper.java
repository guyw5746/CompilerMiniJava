package listener.main;

import generated.MiniJavaParser;
import generated.MiniJavaParser.*;

public class BytecodeGenListenerHelper {

	// MainMethodContext인지 판별.
	static boolean isMain(MiniJavaParser.ClassDeclarationContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniJavaParser.MainMethodContext;
	}
	
	// MethodContext인지 판별.
	static boolean isMethod(MiniJavaParser.ClassDeclarationContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniJavaParser.MethodContext;
	}
	
	// BlockStatementContext인지 판별. 인수가 MainMethodContext형태로 들어왔을 때 식별한다.
	static boolean isblockstatement(MiniJavaParser.MainMethodContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.BlockStatementContext;
	}
	
	// BlockStatementContext인지 판별. 인수가 MethodContext형태로 들어왔을 때 식별한다.
	static boolean isblockstatement(MiniJavaParser.MethodContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.BlockStatementContext;
	}
	
	// BlockStatementContext인지 판별. 인수가 BlockContext형태로 들어왔을 때 식별한다.
	static boolean isblockstatement(MiniJavaParser.BlockContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.BlockStatementContext;
	}
	
	// ExpressionContext인지 판별. 인수가 ExpressionStatementContext형태로 들어왔을 때 식별한다.
	static boolean isExpressionstatement(MiniJavaParser.ExpressionStatementContext ctx, int i) {
		return ctx.getChild(0).getChild(i) instanceof MiniJavaParser.ExpressionContext;
	}
	
	// ExpressionContext인지 판별. 인수가 ExpressionListContext형태로 들어왔을 때 식별한다.
	static boolean isExpressionstatement(MiniJavaParser.ExpressionListContext ctx, int i) {
		return ctx.getChild(i) instanceof MiniJavaParser.ExpressionContext;
	}
	
	// else여부 판별.
	static boolean noElse(IfStatementContext ctx) {
		return ctx.getChildCount() < 6;
	}

	// 함수의 이름을 반환하는 메소드. 인수가 MethodContext형태로 들어왔을 경우.
	static String getFunName(MethodContext ctx) {
		return ctx.getChild(2).getText();
	}
	// 함수의 이름을 반환하는 메소드. 인수가 MainMethodContext형태로 들어왔을 경우.
	static String getFunName(MainMethodContext ctx) {
		return ctx.getChild(3).getText();
	}

	// 함수의 이름을 반환하는 메소드. 인수가 ExpressionContext형태로 들어왔을 경우.
	static String getFunName(ExpressionContext ctx) {
		return ctx.getChild(0).getText();
	}
	
	// 함수의 이름을 반환하는 메소드. 인수가 PrimaryExpressionContext형태로 들어왔을 경우.
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

	// 지역변수와 선언과 초기화가 동시에 이루어 졌을 때 지역변수의 이름을 반환.
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
	
	// jvm 시작 부분.
	static String getFunProlog() {
		String Text = "";
		
		Text += "\n.super java/lang/Object" + "\n; strandard initializer" + "\n.method public <init>()V" + "\naload_0"
				+ "\ninvokenonvirtual java/lang/Object/<init>()V" + "\nreturn" + "\n.end method\n";

		return Text;
	}
}

