package listener.main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import generated.*;

public class Translator {
	enum OPTIONS {
		BYTECODEGEN, ERROR
		 }
	
	public static void main(String[] args) throws Exception {
  		CharStream codeCharStream = CharStreams.fromFileName("test.java");
  		MiniJavaLexer lexer = new MiniJavaLexer(codeCharStream);
  		CommonTokenStream tokens = new CommonTokenStream( lexer );
  		MiniJavaParser parser  = new MiniJavaParser( tokens );
  		ParseTree tree   = parser.translationUnit();
      
  		ParseTreeWalker walker = new ParseTreeWalker();
      
  		switch (getOption(args)) {
  		case BYTECODEGEN :   
  			walker.walk(new BytecodeGenListener(), tree );
  			break;
  		default:
  			break;
      	}
	}
	
	private static OPTIONS getOption(String[] args){
	  	  if (args.length < 1)
	  	   return OPTIONS.BYTECODEGEN;
	  	  
	  	  if (args[0].startsWith("-b")
	  	    || args[0].startsWith("-B"))
	  	   return OPTIONS.BYTECODEGEN;
	  	  
	  	  return OPTIONS.ERROR;
	  }
}
