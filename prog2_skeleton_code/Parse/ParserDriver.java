
package Parse;
import Parse.antlr_build.Parse.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import Absyn.*;

public class ParserDriver {

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName(args[0]);


         gLexer lexer = new gLexer(input);
         //gLexer lexer = new gLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);      


         System.out.println("Starting Parser");
        gParser parser = new gParser(tokens);
        ParseTree tree = parser.program();
        ASTBuilder astBuilder = new ASTBuilder();
        DeclList asttree = (DeclList)astBuilder.visit(tree);

        System.out.println(asttree.print(0));

    }
}
