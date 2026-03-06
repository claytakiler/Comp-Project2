
package Parse;

import java.util.ArrayList;
import Absyn.*;
import java.util.Optional;
import Parse.antlr_build.Parse.*;

import org.antlr.v4.runtime.ParserRuleContext;


/*
 * Hello, I assume that you have read the material in gParser.g4
 *
 * This file is your "Visitor". 
 *
 * Your job is to write visit functions for each parse rule in the gParser.g4 
 * file. Each visit function needs to return the corresponding Absyn node.
 *
 * The driver file you have been provided will print whatever is returned from
 * this visitor. If you successfully return the Absyn nodes, you will see them 
 * print in the terminal.
 *
 * If you get stuck of lost: Each context object can be found
 * in gParser.java. Just search "Context".
 *
 * 
*/

public class ASTBuilder extends gParserBaseVisitor<Absyn> {

   
   @Override
   public Absyn visitProgram(gParser.ProgramContext ctx) {
      DeclList decls = new DeclList(0);
      for (gParser.DeclarationContext dctx : ctx.declaration()) {
        decls.list.add((Decl)visit(dctx));
      }
      return decls;

   }

    
   // Start of statement functions
   @Override
   public Absyn visitIfStmt(gParser.IfStmtContext ctx) {
      return new IfStmt(
            ctx.getStart().getLine(),
            (Exp) visit(ctx.expr()),
            (Stmt) visit(ctx.statement()),
            // This statement may not be needed. ctx.statement().size() > 1 ? (Stmt) visit(ctx.statement(1)) :
	    new EmptyStmt(ctx.getStart().getLine())
      );
   }
   @Override
   public Absyn visitCompStmt(gParser.CompStmtContext ctx) {
       int pos = ctx.getStart().getLine();

       DeclList decls = new DeclList(pos);
       for (gParser.DeclarationContext d : ctx.declaration()) {
	   decls.list.add((Decl) visit(d));
       }

       StmtList stmts = new StmtList(pos);
       for (gParser.StatementContext s : ctx.statement()) {
	   stmts.list.add((Stmt) visit(s));
       }

       return new CompStmt(pos, decls, stmts);
   }
   @Override
   public Absyn visitExprStmt(gParser.ExprStmtContext ctx) {
       return new ExprStmt(
           ctx.getStart().getLine(),
    	   (Exp) visit(ctx.expr())
       );
   }

   @Override
   public Absyn visitReturnStmt(gParser.ReturnStmtContext ctx) {
       return new ReturnStmt(
           ctx.getStart().getLine(),
     	   (Exp) visit(ctx.initializer())
       );
   }

   @Override
   public Absyn visitBreakStmt(gParser.BreakStmtContext ctx) {
       return new BreakStmt(ctx.getStart().getLine());
   }

   @Override
   public Absyn visitIfElseStmt(gParser.IfElseStmtContext ctx) {
       return new IfStmt(
           ctx.getStart().getLine(),
	   (Exp) visit(ctx.expr()),
	   (Stmt) visit(ctx.statement(0)),
	   (Stmt) visit(ctx.statement(1))
       );
   }

   @Override
   public Absyn visitWhileStmt(gParser.WhileStmtContext ctx) {
       return new WhileStmt(
           ctx.getStart().getLine(),
	   (Exp) visit(ctx.expr()),
	   (Stmt) visit(ctx.statement())
       );
   }
    // End of statement functions

/*Start of decl visitor funcs */
//VAR type ID initialization SEMICOLON #VarDecl
@Override
public Absyn visitVarDecl(gParser.VarDeclContext ctx) {
    int pos = ctx.getStart().getLine();
    Type type =  (Type) visit(ctx.type());
    String name = ctx.ID().getText();                     
    Exp init;
    gParser.InitializationContext initContext =  ctx.initialization();     
    if (initContext==null){
      init= new EmptyExp(pos);
    }
    else{
      init = (Exp) visit(initContext);
    }
    return new VarDecl(pos, type, name, init);
}

//| FUN type ID LPAREN parameters? RPAREN statement #FunDecl
@Override
public Absyn visitFunDecl(gParser.FunDeclContext ctx) {
    int pos      = ctx.getStart().getLine();
    Type type =  (Type)visit(ctx.type());
    String name  = ctx.ID().getText();
    DeclList params;
    gParser.ParametersContext paramsContext = ctx.parameters(); 
    if (paramsContext == null){
         params = new DeclList(pos);
    }
    else{
         params = (DeclList) visit(ctx.parameters());
    }
    Stmt body    = (Stmt) visit(ctx.statement());
    return new FunDecl(pos, type, name, params, body);
}

//VAR type ID initialization SEMICOLON #VarDecl
@Override
public Absyn visitTypedefDecl(gParser.TypedefDeclContext ctx) {
    int pos    = ctx.getStart().getLine();
    Type type  = (Type) visit(ctx.type());
    String name = ctx.ID().getText();
    return new Typedef(pos, type, name);
}

//(STRUCT | UNION) ID LCURLY (type ID SEMICOLON)+ RCURLY #StructOrUnionDecl
@Override
public Absyn visitStructOrUnionDecl(gParser.StructOrUnionDeclContext ctx) {
    int pos     = ctx.getStart().getLine();
    String name = ctx.ID(0).getText();  // 1st id will be for the struct/union
    
    DeclList body = new DeclList(pos);
    for (int i = 0; i < ctx.type().size(); i++) {
        Type fieldType = (Type) visit(ctx.type(i));
        String fieldName = ctx.ID(i + 1).getText(); 
        body.list.add(new VarDecl(pos, fieldType, fieldName, null));
    }

    if (ctx.STRUCT() == null) {
        return new UnionDecl(pos, name, body);
    } else {
        return new StructDecl(pos, name, body);
    }
}
/*End of decl visitor funcs */


//Types
@Override
public Absyn visitType(gParser.TypeContext ctx) {
    return new Type(0, false, "", 0, new DeclList(0));
}

@Override
public Absyn visitEmptyArrayBrackets(gParser.EmptyArrayBracketsContext ctx) {
    return new DeclList(0);
}
 
@Override
public Absyn visitExprArrayBrackets(gParser.ExprArrayBracketsContext ctx) {
    return new DeclList(0);
}

// Initialization
@Override
public Absyn visitInitialization(gParser.InitializationContext ctx) {
    return new EmptyExp(0);
}

@Override
public Absyn visitInitializer(gParser.InitializerContext ctx) {
    return new EmptyExp(0);
}

// Expression
@Override
public Absyn visitParenExp(gParser.ParenExpContext ctx) {
    return new EmptyExp(0);
}

@Override
public Absyn visitBinOp(gParser.BinOpContext ctx) {
    return new EmptyExp(0);
}

@Override
public Absyn visitFunExp(gParser.FunExpContext ctx) {
    return new EmptyExp(0);
}

@Override
public Absyn visitArrayExp(gParser.ArrayExpContext ctx) {
    return new EmptyExp(0);
}

//Start Clayton
@Override
public Absyn visitUnaryExp(gParser.UnaryExpContext ctx) {
    //Unary expression has one piece of data attached to it. Example: -x, !isTrue
    int pos = ctx.getStart().getLine();
    String prefix = ctx.getChild(0).getText();
    //Visit expression thats left
    Exp expr = (Exp) visit(ctx.expr());
    return new UnaryExp(pos, prefix, expr);
}

@Override
public Absyn visitAssignExp(gParser.AssignExpContext ctx) {
    return new EmptyExp(0);
}

//End of My assignments

@Override
public Absyn visitDecLit(gParser.DecLitContext ctx) {
    return new EmptyExp(0);
}

@Override
public Absyn visitID(gParser.IDContext ctx) {
    return new EmptyExp(0);
}

@Override
public Absyn visitStrLit(gParser.StrLitContext ctx) {
    return new EmptyExp(0);
}

}

