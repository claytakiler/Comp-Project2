/*

Hello Everyone, this file is a complete ANTLR grammar for Geaux.

Needless to say, you will not need to implement the grammar!

In project 2, you are responsible for generating an Abstract Syntax Tree (AST).
An AST is a tree with nodes that represent language constructs. The nodes for the 
Geaux AST can be found in the Absyn/ folder. 

This document explains what you will be implementing, and what you
need to know. It is split into (very short) sections, headed by ###

### Basics of ANTLER

If you feel you understand how parsers work, you can skip to the next
section.

Before we discuss what we are implementing, let's take a look 
at the grammar you have been provided. Below is the statement
parse rule for Geaux. The real rule can be found further down.


statement
                        :   LCURLY declaration* statement* RCURLY #CompStmt
                        |   IF LPAREN expr RPAREN statement ELSE statement #IfElseStmt
                        |   IF LPAREN expr RPAREN statement #IfStmt
                        |   WHILE LPAREN expr RPAREN statement #WhileStmt
                        |   expr SEMICOLON #ExprStmt
                        |   RETURN initializer SEMICOLON #ReturnStmt
                        |   BREAK SEMICOLON #BreakStmt
                        ;


This is a parse rule. It likely looks vaguely familiar to the lexer rules.
ANTLR uses the same syntax for both, the only difference is that 
lex rules are IN ALL CAPS, and parser rules are lower case.

The parser is supposed to take a list of TOKENS, and chunk them together
into one construct. As an example from statement above:

                        |   BREAK SEMICOLON #BreakStmt

This is saying that if the BREAK token and the SEMICOLON token are found back
to back, then this is a "Break statement"

If the token stream looked like BREAK ID SEMICOLON, then this rule would not apply.
The parser says "If tokens appear in a certain order, then I can chunk those tokens
together."

Most rules in this file reference all caps TOKENS, and also lower-case parse rules.
Let's look at the IfStmt parse rule above:

                        |   IF LPAREN expr RPAREN statement #IfStmt

This rule says that an "If Statement" is a sequence of tokens that starts with 
IF LPAREN. The "expr" in the rule above is another parse rule. Expr checks if
a sequence of Tokens qualifies as an expression. An if statement then follows with
RPAREN and ends with statement, which is a parse rule just like expr (It's the one above!)

This parse rule is describing what sequence of tokens qualifies as an if statement.
A sequence of tokens is an "If Statement" if:

      1. The sequence starts with IF LPAREN
      2. is followed by a list of tokens that ends with RPAREN
      3. which is followed by another list of tokens

      IF LPAREN list1 RPAREN list2

      What the above rule is saying, is that the sequence of tokens are a valid 
      "If Statement" if list1 is a valid expression and list2 is as valid statement

### Context Objects

Each parse rule implicitly returns a Context object. This is a java class generated
by ANTLR. 

As an example, if we had the parse rule:

      constant : DECIMAL_LITERAL | STRING_LITERAL;

      (Again, same rules as before. This reads "A constant can be
      either a DECIMAL_LITERAL or a STRING_LITERAL")

The resulting context object, ConstantContext, would have two member methods:
      
         .DECIMAL_LITERAL()
         .STRING_LITERAL()

If the parser matched a DECIMAL_LITERAL, then the method 
.DECIMAL_LITERAL() would return the Token object made
by the lexer. .STRING_LITERAL() would return null.

By adding # to the end of each option, ANTLR will generate different 
Constant objects for each option:

      constant : 
         DECIMAL_LITERAL #DecLit
      |  STRING_LITERAL #StrLit
      ;

Previously, ANTLR would create a ConstantContext object. With the # added,
ANTLR generates either a DecLitContext or a StrLitContext object. 

The parser returns a tree of these context objects when it runs.

The root of the tree will be the Context object for the start symbol of the grammar.
For this grammar, that is the program rule, found below. I will paste it here
so that you don't have to go scrolling to find it:

            program 
               : declaration* EOF
               ;

This is the start symbol for our parser. Notice that it matches with "declaration*".
This works exactly like the lexer. This means that a program is 0 or more declarations.

The ProgramContext object has a member method .declaration(). This returns a
list of Declaration Context objects. 

Let's look at the declaration rule to see what kind of DeclarationContext objects
might be in this list:

declaration             : VAR type ID initialization SEMICOLON #VarDecl
                        | FUN type ID LPAREN parameters? RPAREN statement #FunDecl
                        | TYPEDEF type ID SEMICOLON #TypedefDecl
                        | (STRUCT | UNION) ID LCURLY (type ID SEMICOLON)+ RCURLY #StructOrUnionDecl
                        ;

A declaration can be one of 4 options (VarDecl, FunDecl, TypedefDecl, StructOrUnionDecl).
VarDeclContext has 5 members methods:
   
      .VAR() // Returns the VAR Token object from the lexer
      .type() // Returns the Context created by the type rule
      .ID() // Returns the ID Token object from the lexer
      .initialization() // Returns the Context created by the type rule
      .SEMICOLON() // Returns the ID Token object from the lexer

Is it clear that this is building a tree?

   ProgramContext
         -- Contains Declarations  
         -- Each Declaration contains sub children:
               .type(), .initialization()

The ProgramContext is the head of the tree. The children are the Declaration 
Contexts. Those Declaration Contexts have children, and those have children,
and those children have children,...

If this point is not clear, now is the time to ask for help!

### Visitor

Remember, the goal is generate an AST out of the classes in the Absyn/
folder. In order to do this, we are going to use the ANTLR built in
"Visitor" pattern. The visitor pattern is an object oriented design 
pattern designed to handle "dispatch". Dispatching is the process
of deciding which function to call when multiple options are valid.
This can happen a class extends another class:

   public class A { ... }
   public class B extends A { ... }

   void public f(A a) { ... }
   void public f(B b) { ... }

If we have the following function:
   
   void example(A a) { f(a) }

and run the following code:
   
   B b = new B();
   example(b);

"A" will be printed to the terminal. Dispatch patterns are meant to 
help java choose f(B b) instead of f(A a). This is what the visitor
does.

Here's what you do need to know to interact with the visitor:

   1. The Context objects all share a common parent class
         -- Therefore the visitor pattern is needed to deal with dispatching
   2. In the visitor object (ASTBuilder.java), we write functions for each
      Parse rule. These are the functions the visitor is "dispatching" to.
         -- These functions return an Absyn node. Whatever one matches the 
            Context object. 
               BreakStmtContext -> Absyn.BreakStmt
               IfStmtContext -> Absyn.IfStmt
               .
               .
               .
   3. Calling visit(ctx) sends ctx to the appropriate visit function in the visitor.

### Project 2

You are almost done reading. There are a couple more things to read in the ASTBuilder.java file.

Also as you read the grammar below, I have included comments that explain the ANLTR syntax.
More details can be found in the ANTLR documentation online. Asking chatgpt also worked 
surprsingly well.

I leave you with a checklist for project 2. This is how you know your done:

      Getting an A checklist:
         1. Write a Visitor function for each rule below
            -- Including the # rules !!!
         2. Construct the right Absyn/ nodes in the visit functions
         3. Print the same output as my solution

If you write the visitor functions for each rule, they return the right AST nodes,
and you see the AST print (and it looks right!) then you are done.

*/

parser grammar gParser;

@header {
   package Parse.antlr_build.Parse;
}


options {
   tokenVocab = gLexer;
}

program 
   : declaration* EOF
   ;


statement
                           // * means the rule can apply 0 or more times
                           // ctx.declaration() == null if 0 declarations matched
                           // Additionally, You can also do ctx.declaration(i) to 
                           // get the ith value from the list.
                        :   LCURLY declaration* statement* RCURLY #CompStmt
                        |   IF LPAREN expr RPAREN statement #IfStmt
                        |   IF LPAREN expr RPAREN statement ELSE statement #IfElseStmt
                        |   WHILE LPAREN expr RPAREN statement #WhileStmt
                        |   expr SEMICOLON #ExprStmt
                        |   RETURN initializer SEMICOLON #ReturnStmt
                        |   BREAK SEMICOLON #BreakStmt
                        ;


declaration             : VAR type ID initialization SEMICOLON #VarDecl
                           // ? means that the rule attached is optional
                        | FUN type ID LPAREN parameters? RPAREN statement #FunDecl
                        | TYPEDEF type ID SEMICOLON #TypedefDecl
                           // + means that the rule can apply 1 or more times
                           // ctx.type() returns a list of types. One for each 
                           // (type ID SEMICOLON). Same with ctx.ID().
                           // (STRUCT | UNION) means the first token can be either
                           // STRUCT or UNION
                        | (STRUCT | UNION) ID LCURLY (type ID SEMICOLON)+ RCURLY #StructOrUnionDecl
                        ;

type                    : CONST? type_name STAR* brackets_list?
                        ;

brackets_list           :  (LSQUARE RSQUARE)+ #EmptyArrayBrackets
                        |  (LSQUARE expr RSQUARE)+ #ExprArrayBrackets
                        ;

type_name               :   VOID
                        |   INT
                        |   STRING
                        |   ID
                        ;

initialization          : 
                        | ASSIGN initializer
                        ;

parameters              :  type ID (COMMA type ID)*
                        ;
                        
initializer             : expr 
                        | LCURLY initializer (COMMA initializer)* RCURLY
                        ;

unary_operator          :  BITWISEAND
                        |   STAR
                        |  ADD 
                        |   NOT
                        ;

expr :
      LPAREN expr RPAREN #ParenExp
      // x=rule means that ctx.rule1() is changed to ctx.op
   |  expr op=(ARROW | DOT) expr #BinOp
      // Rules can be nested inside (). 
   |  expr LPAREN (expr (COMMA expr)*)? RPAREN #FunExp
   |  expr (LSQUARE expr RSQUARE)+ #ArrayExp
      // assoc=right changes the associativity of the parse rule
      // It is not relevant for writing the visitor.
   |  <assoc=right> unary_operator expr #UnaryExp
   |  expr op=STAR expr #BinOp
   |  expr op=ADD expr #BinOp
   |  expr op=LT expr #BinOp
   |  expr op=OR expr #BinOp
   |  expr op=AND expr #BinOp
   |  expr op=BITWISEOR expr #BinOp
   |  expr op=BITWISEAND expr #BinOp
   |  <assoc=right> expr ASSIGN initializer #AssignExp
   |  DECIMAL_LITERAL #DecLit
   |  ID #ID
   |  STRING_LITERAL #StrLit
   ;

