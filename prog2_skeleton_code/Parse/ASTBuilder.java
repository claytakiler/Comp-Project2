
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

    Type type = (Type) visit(ctx.type());
    String name = ctx.ID().getText();

    Exp init;
    if (ctx.initialization() == null) {
        init = new EmptyExp(pos);   // ← CRITICAL FIX
    } else {
        init = (Exp) visit(ctx.initialization());
        if (init == null) {         // ← defensive shield
            init = new EmptyExp(pos);
        }
    }

    return new VarDecl(pos, type, name, init);
}


//| FUN type ID LPAREN parameters? RPAREN statement #FunDecl
@Override
public Absyn visitFunDecl(gParser.FunDeclContext ctx) {
    int pos = ctx.getStart().getLine();

    Type returnType = (Type) visit(ctx.type());
    String name = ctx.ID().getText();

    DeclList params;
    if (ctx.parameters() == null) {
        params = new DeclList(pos);
    } else {
        params = (DeclList) visit(ctx.parameters());
        if (params == null) {          
            params = new DeclList(pos);
        }
    }

    Stmt body = (Stmt) visit(ctx.statement());

    return new FunDecl(pos, returnType, name, params, body);
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
        body.list.add(new VarDecl(pos, fieldType, fieldName, new EmptyExp(pos)));
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
    int pos = ctx.getStart().getLine();

    boolean isConst = ctx.CONST() != null; //is constant?

    String base = ctx.type_name().getText(); //get actual base type

    int stars = ctx.STAR().size();// for pointers amount

    DeclList arrays = ctx.brackets_list() == null //check if brackets? if not then add them and then go through and visit each arr element
        ? new DeclList(pos)
        : (DeclList) visit(ctx.brackets_list());

    return new Type(pos, isConst, base, stars, arrays);//build
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
public Absyn visitInitialization(gParser.InitializationContext ctx) 
{
    
    if (ctx.initializer() == null) // if no init then give empty_exp
    {
        return new EmptyExp(ctx.getStart().getLine());
    }

    return visit(ctx.initializer()); //else just ret

}

@Override
public Absyn visitInitializer(gParser.InitializerContext ctx) 
{
    int pos = ctx.getStart().getLine();
    
    if (ctx.expr() != null) //if init is single expr
    {
        return visit(ctx.expr());
    }

    return new EmptyExp(pos); //else just return empty
}

// Expressions 
@Override
public Absyn visitParenExp(gParser.ParenExpContext ctx) 
{
    return visit(ctx.expr()); //return the inner expression
}


@Override
public Absyn visitBinOp(gParser.BinOpContext ctx) 
{
    int pos = ctx.getStart().getLine();

    Exp left  = (Exp) visit(ctx.expr(0)); //left op
    Exp right = (Exp) visit(ctx.expr(1)); //right op

    String oper = ctx.op.getText(); //get text of operator token

    return new BinOp(pos, left, oper, right); //build it
}

@Override
public Absyn visitFunExp(gParser.FunExpContext ctx) 
{
    int pos = ctx.getStart().getLine();

    Exp func = (Exp) visit(ctx.expr(0));//call fn

    ExpList args = new ExpList(pos);//list of args

    for (int i = 1; i < ctx.expr().size(); i++) 
    {
        args.list.add((Exp) visit(ctx.expr(i)));//add and visit
    }

    return new FunExp(pos, func, args);
}


@Override
public Absyn visitArrayExp(gParser.ArrayExpContext ctx) 
{
    int pos = ctx.getStart().getLine();

    Exp name = (Exp) visit(ctx.expr(0));//index arr

    ExpList indices = new ExpList(pos);//list of index expr

    for (int i = 1; i < ctx.expr().size(); i++) {
        indices.list.add((Exp) visit(ctx.expr(i)));
    }

    return new ArrayExp(pos, name, indices);
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
    int pos = ctx.getStart().getLine();
    Exp expr = (Exp) visit(ctx.expr());
    Exp init =(Exp) visit(ctx.initializer());
    return new AssignExp(pos, expr, init);
}

//End of My assignments

@Override
public Absyn visitDecLit(gParser.DecLitContext ctx) {
    int pos = ctx.getStart().getLine();
    String valueText = ctx.getChild(0).getText();
    int value = Integer.parseInt(valueText);
    return new DecLit(pos, value);
}

@Override
public Absyn visitID(gParser.IDContext ctx) {
    int pos = ctx.getStart().getLine();
    String value = ctx.getChild(0).getText();
    return new ID(pos, value);
}

@Override
public Absyn visitStrLit(gParser.StrLitContext ctx) {
    int pos = ctx.getStart().getLine();
    String value = ctx.getChild(0).getText();
    return new StrLit(pos, value);
}

}

