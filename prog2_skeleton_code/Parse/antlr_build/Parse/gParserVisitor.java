// Generated from Parse/gParser.g4 by ANTLR 4.13.2

   package Parse.antlr_build.Parse;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompStmt(gParser.CompStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(gParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(gParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(gParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(gParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(gParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(gParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(gParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(gParser.FunDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedefDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDecl(gParser.TypedefDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructOrUnionDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionDecl(gParser.StructOrUnionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyArrayBrackets}
	 * labeled alternative in {@link gParser#brackets_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrayBrackets(gParser.EmptyArrayBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayBrackets}
	 * labeled alternative in {@link gParser#brackets_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayBrackets(gParser.ExprArrayBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(gParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(gParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(gParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(gParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(gParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(gParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecLit}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecLit(gParser.DecLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(gParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExp(gParser.FunExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(gParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(gParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(gParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExp(gParser.ArrayExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLit(gParser.StrLitContext ctx);
}