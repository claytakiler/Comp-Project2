// Generated from Parse/gParser.g4 by ANTLR 4.13.2

   package Parse.antlr_build.Parse;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_SPACE=1, ADD=2, FUN=3, VAR=4, LT=5, ARROW=6, DOT=7, RCURLY=8, LCURLY=9, 
		COMMA=10, RPAREN=11, LPAREN=12, AND=13, OR=14, BITWISEAND=15, BITWISEOR=16, 
		NOT=17, STAR=18, WHILE=19, STRUCT=20, UNION=21, CONST=22, ASSIGN=23, STRING=24, 
		VOID=25, RETURN=26, IF=27, ELSE=28, BREAK=29, INT=30, SEMICOLON=31, TYPEDEF=32, 
		COLON=33, LSQUARE=34, RSQUARE=35, ID=36, DECIMAL_LITERAL=37, COMMENT=38, 
		START_OF_STRING=39, STRING_LITERAL=40, STRING_ESC=41, STRING_OCTAL=42, 
		STRING_HEX=43, STRING_CHAR=44, STRING_NEWLINE=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_brackets_list = 4, RULE_type_name = 5, RULE_initialization = 6, RULE_parameters = 7, 
		RULE_initializer = 8, RULE_unary_operator = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "type", "brackets_list", "type_name", 
			"initialization", "parameters", "initializer", "unary_operator", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'fun'", "'var'", "'<'", "'->'", "'.'", "'}'", "'{'", 
			"','", "')'", "'('", "'&&'", "'||'", "'&'", "'|'", "'!'", "'*'", "'while'", 
			"'struct'", "'union'", "'const'", "'='", "'string'", "'void'", "'return'", 
			"'if'", "'else'", "'break'", "'int'", "';'", "'typedef'", "':'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITE_SPACE", "ADD", "FUN", "VAR", "LT", "ARROW", "DOT", "RCURLY", 
			"LCURLY", "COMMA", "RPAREN", "LPAREN", "AND", "OR", "BITWISEAND", "BITWISEOR", 
			"NOT", "STAR", "WHILE", "STRUCT", "UNION", "CONST", "ASSIGN", "STRING", 
			"VOID", "RETURN", "IF", "ELSE", "BREAK", "INT", "SEMICOLON", "TYPEDEF", 
			"COLON", "LSQUARE", "RSQUARE", "ID", "DECIMAL_LITERAL", "COMMENT", "START_OF_STRING", 
			"STRING_LITERAL", "STRING_ESC", "STRING_OCTAL", "STRING_HEX", "STRING_CHAR", 
			"STRING_NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4298113048L) != 0)) {
				{
				{
				setState(22);
				declaration();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompStmtContext extends StatementContext {
		public TerminalNode LCURLY() { return getToken(gParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(gParser.RCURLY, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterCompStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitCompStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitCompStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(gParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(gParser.RETURN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CompStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(LCURLY);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4298113048L) != 0)) {
					{
					{
					setState(31);
					declaration();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1306409210372L) != 0)) {
					{
					{
					setState(37);
					statement();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(RCURLY);
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(IF);
				setState(45);
				match(LPAREN);
				setState(46);
				expr(0);
				setState(47);
				match(RPAREN);
				setState(48);
				statement();
				}
				break;
			case 3:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(IF);
				setState(51);
				match(LPAREN);
				setState(52);
				expr(0);
				setState(53);
				match(RPAREN);
				setState(54);
				statement();
				setState(55);
				match(ELSE);
				setState(56);
				statement();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(WHILE);
				setState(59);
				match(LPAREN);
				setState(60);
				expr(0);
				setState(61);
				match(RPAREN);
				setState(62);
				statement();
				}
				break;
			case 5:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				expr(0);
				setState(65);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				match(RETURN);
				setState(68);
				initializer();
				setState(69);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				match(BREAK);
				setState(72);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclContext extends DeclarationContext {
		public TerminalNode FUN() { return getToken(gParser.FUN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitFunDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructOrUnionDeclContext extends DeclarationContext {
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode LCURLY() { return getToken(gParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(gParser.RCURLY, 0); }
		public TerminalNode STRUCT() { return getToken(gParser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(gParser.UNION, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(gParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gParser.SEMICOLON, i);
		}
		public StructOrUnionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterStructOrUnionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitStructOrUnionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitStructOrUnionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends DeclarationContext {
		public TerminalNode VAR() { return getToken(gParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public VarDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedefDeclContext extends DeclarationContext {
		public TerminalNode TYPEDEF() { return getToken(gParser.TYPEDEF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public TypedefDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterTypedefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitTypedefDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitTypedefDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(VAR);
				setState(76);
				type();
				setState(77);
				match(ID);
				setState(78);
				initialization();
				setState(79);
				match(SEMICOLON);
				}
				break;
			case FUN:
				_localctx = new FunDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(FUN);
				setState(82);
				type();
				setState(83);
				match(ID);
				setState(84);
				match(LPAREN);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69847744512L) != 0)) {
					{
					setState(85);
					parameters();
					}
				}

				setState(88);
				match(RPAREN);
				setState(89);
				statement();
				}
				break;
			case TYPEDEF:
				_localctx = new TypedefDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(TYPEDEF);
				setState(92);
				type();
				setState(93);
				match(ID);
				setState(94);
				match(SEMICOLON);
				}
				break;
			case STRUCT:
			case UNION:
				_localctx = new StructOrUnionDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==STRUCT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				match(ID);
				setState(98);
				match(LCURLY);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					type();
					setState(100);
					match(ID);
					setState(101);
					match(SEMICOLON);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 69847744512L) != 0) );
				setState(107);
				match(RCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode CONST() { return getToken(gParser.CONST, 0); }
		public List<TerminalNode> STAR() { return getTokens(gParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(gParser.STAR, i);
		}
		public Brackets_listContext brackets_list() {
			return getRuleContext(Brackets_listContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(111);
				match(CONST);
				}
			}

			setState(114);
			type_name();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR) {
				{
				{
				setState(115);
				match(STAR);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(121);
				brackets_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Brackets_listContext extends ParserRuleContext {
		public Brackets_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets_list; }
	 
		public Brackets_listContext() { }
		public void copyFrom(Brackets_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayBracketsContext extends Brackets_listContext {
		public List<TerminalNode> LSQUARE() { return getTokens(gParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(gParser.LSQUARE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(gParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(gParser.RSQUARE, i);
		}
		public ExprArrayBracketsContext(Brackets_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterExprArrayBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitExprArrayBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitExprArrayBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyArrayBracketsContext extends Brackets_listContext {
		public List<TerminalNode> LSQUARE() { return getTokens(gParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(gParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(gParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(gParser.RSQUARE, i);
		}
		public EmptyArrayBracketsContext(Brackets_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterEmptyArrayBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitEmptyArrayBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitEmptyArrayBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Brackets_listContext brackets_list() throws RecognitionException {
		Brackets_listContext _localctx = new Brackets_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brackets_list);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new EmptyArrayBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(LSQUARE);
					setState(125);
					match(RSQUARE);
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LSQUARE );
				}
				break;
			case 2:
				_localctx = new ExprArrayBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					match(LSQUARE);
					setState(131);
					expr(0);
					setState(132);
					match(RSQUARE);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LSQUARE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(gParser.VOID, 0); }
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69843550208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initialization);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ASSIGN);
				setState(144);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			type();
			setState(148);
			match(ID);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				type();
				setState(151);
				match(ID);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(gParser.LCURLY, 0); }
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(gParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initializer);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case LPAREN:
			case BITWISEAND:
			case NOT:
			case STAR:
			case ID:
			case DECIMAL_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				expr(0);
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(LCURLY);
				setState(160);
				initializer();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(161);
					match(COMMA);
					setState(162);
					initializer();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(RCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode BITWISEAND() { return getToken(gParser.BITWISEAND, 0); }
		public TerminalNode STAR() { return getToken(gParser.STAR, 0); }
		public TerminalNode ADD() { return getToken(gParser.ADD, 0); }
		public TerminalNode NOT() { return getToken(gParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 425988L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public AssignExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecLitContext extends ExprContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(gParser.DECIMAL_LITERAL, 0); }
		public DecLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterDecLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitDecLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitDecLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public ParenExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public FunExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterFunExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitFunExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitFunExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExprContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(gParser.ARROW, 0); }
		public TerminalNode DOT() { return getToken(gParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(gParser.STAR, 0); }
		public TerminalNode ADD() { return getToken(gParser.ADD, 0); }
		public TerminalNode LT() { return getToken(gParser.LT, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public TerminalNode BITWISEOR() { return getToken(gParser.BITWISEOR, 0); }
		public TerminalNode BITWISEAND() { return getToken(gParser.BITWISEAND, 0); }
		public BinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(gParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(gParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(gParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(gParser.RSQUARE, i);
		}
		public ArrayExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterArrayExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitArrayExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitArrayExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrLitContext extends ExprContext {
		public TerminalNode STRING_LITERAL() { return getToken(gParser.STRING_LITERAL, 0); }
		public StrLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).enterStrLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gParserListener ) ((gParserListener)listener).exitStrLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gParserVisitor ) return ((gParserVisitor<? extends T>)visitor).visitStrLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(LPAREN);
				setState(176);
				expr(0);
				setState(177);
				match(RPAREN);
				}
				break;
			case ADD:
			case BITWISEAND:
			case NOT:
			case STAR:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				unary_operator();
				setState(180);
				expr(12);
				}
				break;
			case DECIMAL_LITERAL:
				{
				_localctx = new DecLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(DECIMAL_LITERAL);
				}
				break;
			case ID:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(ID);
				}
				break;
			case STRING_LITERAL:
				{
				_localctx = new StrLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(188);
						((BinOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ARROW || _la==DOT) ) {
							((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(191);
						((BinOpContext)_localctx).op = match(STAR);
						setState(192);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(194);
						((BinOpContext)_localctx).op = match(ADD);
						setState(195);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						((BinOpContext)_localctx).op = match(LT);
						setState(198);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						((BinOpContext)_localctx).op = match(OR);
						setState(201);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((BinOpContext)_localctx).op = match(AND);
						setState(204);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						((BinOpContext)_localctx).op = match(BITWISEOR);
						setState(207);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						((BinOpContext)_localctx).op = match(BITWISEAND);
						setState(210);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new FunExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(212);
						match(LPAREN);
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1305670488068L) != 0)) {
							{
							setState(213);
							expr(0);
							setState(218);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(214);
								match(COMMA);
								setState(215);
								expr(0);
								}
								}
								setState(220);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(223);
						match(RPAREN);
						}
						break;
					case 10:
						{
						_localctx = new ArrayExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(229); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(225);
								match(LSQUARE);
								setState(226);
								expr(0);
								setState(227);
								match(RSQUARE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(231); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 11:
						{
						_localctx = new AssignExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(234);
						match(ASSIGN);
						setState(235);
						initializer();
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0001"+
		"\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"W\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002h\b\u0002"+
		"\u000b\u0002\f\u0002i\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001"+
		"\u0003\u0003\u0003q\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003u\b\u0003"+
		"\n\u0003\f\u0003x\t\u0003\u0001\u0003\u0003\u0003{\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u007f\b\u0004\u000b\u0004\f\u0004\u0080\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0087\b\u0004\u000b"+
		"\u0004\f\u0004\u0088\u0003\u0004\u008b\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0092\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u009a\b\u0007\n\u0007\f\u0007\u009d\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00a4\b\b\n\b\f\b\u00a7\t\b\u0001\b\u0001\b\u0003\b"+
		"\u00ab\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ba\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00d9\b\n\n\n\f\n\u00dc\t\n\u0003\n\u00de\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00e6\b\n\u000b\n\f\n\u00e7"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n\u00f0\t\n\u0001\n\u0000"+
		"\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0004\u0001\u0000\u0014\u0015\u0003\u0000\u0018\u0019\u001e\u001e"+
		"$$\u0003\u0000\u0002\u0002\u000f\u000f\u0011\u0012\u0001\u0000\u0006\u0007"+
		"\u0110\u0000\u0019\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000"+
		"\u0004m\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\b\u008a"+
		"\u0001\u0000\u0000\u0000\n\u008c\u0001\u0000\u0000\u0000\f\u0091\u0001"+
		"\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u00aa\u0001"+
		"\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00b9\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e\"\u0005\t"+
		"\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#(\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0003\u0002"+
		"\u0001\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+J\u0005\b\u0000\u0000,-\u0005\u001b\u0000\u0000"+
		"-.\u0005\f\u0000\u0000./\u0003\u0014\n\u0000/0\u0005\u000b\u0000\u0000"+
		"01\u0003\u0002\u0001\u00001J\u0001\u0000\u0000\u000023\u0005\u001b\u0000"+
		"\u000034\u0005\f\u0000\u000045\u0003\u0014\n\u000056\u0005\u000b\u0000"+
		"\u000067\u0003\u0002\u0001\u000078\u0005\u001c\u0000\u000089\u0003\u0002"+
		"\u0001\u00009J\u0001\u0000\u0000\u0000:;\u0005\u0013\u0000\u0000;<\u0005"+
		"\f\u0000\u0000<=\u0003\u0014\n\u0000=>\u0005\u000b\u0000\u0000>?\u0003"+
		"\u0002\u0001\u0000?J\u0001\u0000\u0000\u0000@A\u0003\u0014\n\u0000AB\u0005"+
		"\u001f\u0000\u0000BJ\u0001\u0000\u0000\u0000CD\u0005\u001a\u0000\u0000"+
		"DE\u0003\u0010\b\u0000EF\u0005\u001f\u0000\u0000FJ\u0001\u0000\u0000\u0000"+
		"GH\u0005\u001d\u0000\u0000HJ\u0005\u001f\u0000\u0000I\u001e\u0001\u0000"+
		"\u0000\u0000I,\u0001\u0000\u0000\u0000I2\u0001\u0000\u0000\u0000I:\u0001"+
		"\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005\u0004"+
		"\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005$\u0000\u0000NO\u0003\f"+
		"\u0006\u0000OP\u0005\u001f\u0000\u0000Pn\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0003\u0000\u0000RS\u0003\u0006\u0003\u0000ST\u0005$\u0000\u0000TV\u0005"+
		"\f\u0000\u0000UW\u0003\u000e\u0007\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005\u000b\u0000\u0000"+
		"YZ\u0003\u0002\u0001\u0000Zn\u0001\u0000\u0000\u0000[\\\u0005 \u0000\u0000"+
		"\\]\u0003\u0006\u0003\u0000]^\u0005$\u0000\u0000^_\u0005\u001f\u0000\u0000"+
		"_n\u0001\u0000\u0000\u0000`a\u0007\u0000\u0000\u0000ab\u0005$\u0000\u0000"+
		"bg\u0005\t\u0000\u0000cd\u0003\u0006\u0003\u0000de\u0005$\u0000\u0000"+
		"ef\u0005\u001f\u0000\u0000fh\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\b\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mK\u0001\u0000\u0000\u0000mQ\u0001\u0000\u0000\u0000m[\u0001"+
		"\u0000\u0000\u0000m`\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000"+
		"\u0000oq\u0005\u0016\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0003\n\u0005\u0000su\u0005\u0012"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000y{\u0003\b\u0004\u0000zy\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{\u0007\u0001\u0000\u0000\u0000|}\u0005\"\u0000"+
		"\u0000}\u007f\u0005#\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u008b\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\"\u0000\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u0085\u0005#\u0000"+
		"\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000"+
		"\u008b\t\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0001\u0000\u0000\u008d"+
		"\u000b\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0017\u0000\u0000\u0090\u0092\u0003\u0010\b\u0000\u0091\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\r\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0003\u0006\u0003\u0000\u0094\u009b\u0005"+
		"$\u0000\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0003\u0006"+
		"\u0003\u0000\u0097\u0098\u0005$\u0000\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u00ab\u0003\u0014\n\u0000\u009f\u00a0\u0005\t\u0000\u0000"+
		"\u00a0\u00a5\u0003\u0010\b\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2"+
		"\u00a4\u0003\u0010\b\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\b\u0000\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00aa\u009f\u0001"+
		"\u0000\u0000\u0000\u00ab\u0011\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007"+
		"\u0002\u0000\u0000\u00ad\u0013\u0001\u0000\u0000\u0000\u00ae\u00af\u0006"+
		"\n\uffff\uffff\u0000\u00af\u00b0\u0005\f\u0000\u0000\u00b0\u00b1\u0003"+
		"\u0014\n\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0003\u0012\t\u0000\u00b4\u00b5\u0003\u0014\n"+
		"\f\u00b5\u00ba\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005%\u0000\u0000"+
		"\u00b7\u00ba\u0005$\u0000\u0000\u00b8\u00ba\u0005(\u0000\u0000\u00b9\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00b9\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00ee\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\n\u000f\u0000\u0000\u00bc\u00bd\u0007\u0003\u0000\u0000\u00bd\u00ed\u0003"+
		"\u0014\n\u0010\u00be\u00bf\n\u000b\u0000\u0000\u00bf\u00c0\u0005\u0012"+
		"\u0000\u0000\u00c0\u00ed\u0003\u0014\n\f\u00c1\u00c2\n\n\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0002\u0000\u0000\u00c3\u00ed\u0003\u0014\n\u000b\u00c4\u00c5"+
		"\n\t\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00ed\u0003"+
		"\u0014\n\n\u00c7\u00c8\n\b\u0000\u0000\u00c8\u00c9\u0005\u000e\u0000\u0000"+
		"\u00c9\u00ed\u0003\u0014\n\t\u00ca\u00cb\n\u0007\u0000\u0000\u00cb\u00cc"+
		"\u0005\r\u0000\u0000\u00cc\u00ed\u0003\u0014\n\b\u00cd\u00ce\n\u0006\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0010\u0000\u0000\u00cf\u00ed\u0003\u0014\n\u0007"+
		"\u00d0\u00d1\n\u0005\u0000\u0000\u00d1\u00d2\u0005\u000f\u0000\u0000\u00d2"+
		"\u00ed\u0003\u0014\n\u0006\u00d3\u00d4\n\u000e\u0000\u0000\u00d4\u00dd"+
		"\u0005\f\u0000\u0000\u00d5\u00da\u0003\u0014\n\u0000\u00d6\u00d7\u0005"+
		"\n\u0000\u0000\u00d7\u00d9\u0003\u0014\n\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00d5\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00ed\u0005\u000b\u0000\u0000\u00e0\u00e5\n\r\u0000"+
		"\u0000\u00e1\u00e2\u0005\"\u0000\u0000\u00e2\u00e3\u0003\u0014\n\u0000"+
		"\u00e3\u00e4\u0005#\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ed\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u0004\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0017\u0000\u0000\u00eb\u00ed\u0003\u0010\b\u0000\u00ec\u00bb\u0001"+
		"\u0000\u0000\u0000\u00ec\u00be\u0001\u0000\u0000\u0000\u00ec\u00c1\u0001"+
		"\u0000\u0000\u0000\u00ec\u00c4\u0001\u0000\u0000\u0000\u00ec\u00c7\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ca\u0001\u0000\u0000\u0000\u00ec\u00cd\u0001"+
		"\u0000\u0000\u0000\u00ec\u00d0\u0001\u0000\u0000\u0000\u00ec\u00d3\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e0\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u0015\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u0017\u0019\"("+
		"IVimpvz\u0080\u0088\u008a\u0091\u009b\u00a5\u00aa\u00b9\u00da\u00dd\u00e7"+
		"\u00ec\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}