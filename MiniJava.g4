grammar MiniJava;

translationUnit
    :   classDeclaration*
    ;

classDeclaration
    :   'class' IDENTIFIER '{' classMember* '}'
    ;

classMember
    :   field
    |   mainMethod
    |   method
    ;

field
    :   'public' type IDENTIFIER ';'
    ;

mainMethod
    :   'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' blockStatement* '}'
    ;

method
    :   'public' type IDENTIFIER '(' ')' '{' blockStatement* '}'
    |   'public' type IDENTIFIER '(' parameters ')' '{' blockStatement* '}'
    ;

// 업데이트
parameters
    :   parameter (',' parameter)*
    |
    ;

parameter
    :   type IDENTIFIER
    ;

type
    :   'boolean'
    |   'int'
    |   'void'
    |   IDENTIFIER
    ;

statement
    :   block
    |   printStatement
    |   ifStatement
    |   whileStatement
    |   emptyStatement
    |   expressionStatement
    |   returnStatement
    ;

block
    :   '{' blockStatement* '}'
    ;

ifStatement
    :   'if' '(' expression ')' statement
    |   'if' '(' expression ')' statement ('else' statement)
    ;

whileStatement
    :   'while' '(' expression ')' statement
    ;

emptyStatement
    :   ';'
    ;

printStatement
    :   'System' '.' 'out' '.' 'println' '(' expression ')' ';'
    ;

expressionStatement
    :   expression ';'
    ;

returnStatement
    :   'return' ';'
    |   'return' expression ';'
    ;

blockStatement
    :   statement
    |   localVariableDeclarationStatement
    ;

localVariableDeclarationStatement
    :   type IDENTIFIER ';'
    |   type IDENTIFIER ('=' expression) ';'
    ;

expression
    :   primaryExpression
    |   expression '.' IDENTIFIER '(' ')'
    |   expression '.' IDENTIFIER '(' expressionList ')'
    |   'new' IDENTIFIER '(' ')'
    |   ('-'|'!') expression
    |   expression ('*' | '/' | '%') expression
    |   expression ('+' | '-') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '='<assoc=right> expression
    ;

primaryExpression
    :   '(' expression ')'
    |   'this'
    |   'null'
    |   'false'
    |   'true'
    |   INTEGER
    |   IDENTIFIER '(' ')'
    |   IDENTIFIER '(' expressionList ')'
    |   IDENTIFIER
    ;

expressionList
    :   expression (',' expression)*
    ;

INTEGER
    :   [1-9] DIGIT*
    ;

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

fragment
LETTER
	: 'a' .. 'z'
	| 'A' .. 'Z'
    ;

fragment
DIGIT
    :   [0-9]
    ;
WS
    :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
	-> channel(HIDDEN)	 
    ;