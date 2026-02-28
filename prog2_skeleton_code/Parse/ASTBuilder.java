
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

   @Override
   public Absyn visit__(gParser.__Context ctx) {
      return IfStmt(
            0,
            visit(ctx.expr()),
            visit(ctx.statement()),
            new EmptyStmt(0)
      );
   }

}

