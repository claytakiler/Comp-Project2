// Generated from Parse/gParser.g4 by ANTLR 4.13.2

   package Parse.antlr_build.Parse;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompStmt(gParser.CompStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompStmt(gParser.CompStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(gParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(gParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(gParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(gParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(gParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(gParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(gParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(gParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(gParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(gParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(gParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(gParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(gParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(gParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(gParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(gParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedefDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDecl(gParser.TypedefDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedefDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDecl(gParser.TypedefDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructOrUnionDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionDecl(gParser.StructOrUnionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructOrUnionDecl}
	 * labeled alternative in {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionDecl(gParser.StructOrUnionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArrayBrackets}
	 * labeled alternative in {@link gParser#brackets_list}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrayBrackets(gParser.EmptyArrayBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArrayBrackets}
	 * labeled alternative in {@link gParser#brackets_list}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrayBrackets(gParser.EmptyArrayBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayBrackets}
	 * labeled alternative in {@link gParser#brackets_list}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayBrackets(gParser.ExprArrayBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayBrackets}
	 * labeled alternative in {@link gParser#brackets_list}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayBrackets(gParser.ExprArrayBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(gParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(gParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(gParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(gParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(gParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(gParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(gParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(gParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(gParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(gParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(gParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(gParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecLit}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecLit(gParser.DecLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecLit}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecLit(gParser.DecLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(gParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(gParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(gParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(gParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(gParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(gParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(gParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(gParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(gParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(gParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExp(gParser.ArrayExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExp}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExp(gParser.ArrayExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(gParser.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(gParser.StrLitContext ctx);
}