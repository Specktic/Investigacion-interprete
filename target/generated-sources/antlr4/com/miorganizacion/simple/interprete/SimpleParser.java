// Generated from com\miorganizacion\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.miorganizacion.simple.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.miorganizacion.simple.interprete.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, DIST=19, 
		BERN=20, ASSIGN=21, BRACKET_OPEN=22, BRACKET_CLOSE=23, PAR_OPEN=24, PAR_CLOSE=25, 
		SEMICOLON=26, BOOLEAN=27, ID=28, NUMBER=29, WS=30;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_println = 2, RULE_printable_expr = 3, 
		RULE_conditional = 4, RULE_var_decl = 5, RULE_var_assign = 6, RULE_logic_expr = 7, 
		RULE_expression = 8, RULE_factor = 9, RULE_term = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "println", "printable_expr", "conditional", "var_decl", 
			"var_assign", "logic_expr", "expression", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'<-->'", "'-b-'", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "DIST", 
			"BERN", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
			"SEMICOLON", "BOOLEAN", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(SimpleParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(22);
			match(PROGRAM);
			setState(23);
			match(ID);
			setState(24);
			match(BRACKET_OPEN);

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String, Object>();
				
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(26);
				((ProgramContext)_localctx).sentence = sentence();
				 body.add(((ProgramContext)_localctx).sentence.node); 
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(BRACKET_CLOSE);

					for(ASTNode n : body) {
						n.execute(symbolTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((SentenceContext)_localctx).println = println();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				((SentenceContext)_localctx).conditional = conditional();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((SentenceContext)_localctx).var_decl = var_decl();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				((SentenceContext)_localctx).var_assign = var_assign();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node; 
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public Printable_exprContext printable_expr;
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public Printable_exprContext printable_expr() {
			return getRuleContext(Printable_exprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PRINTLN);
			setState(52);
			((PrintlnContext)_localctx).printable_expr = printable_expr();
			setState(53);
			match(SEMICOLON);
			 ((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).printable_expr.node); 
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

	public static class Printable_exprContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public Logic_exprContext logic_expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Printable_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintable_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintable_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPrintable_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printable_exprContext printable_expr() throws RecognitionException {
		Printable_exprContext _localctx = new Printable_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printable_expr);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((Printable_exprContext)_localctx).expression = expression();
				 ((Printable_exprContext)_localctx).node =  ((Printable_exprContext)_localctx).expression.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((Printable_exprContext)_localctx).logic_expr = logic_expr();
				 ((Printable_exprContext)_localctx).node =  ((Printable_exprContext)_localctx).logic_expr.node; 
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(SimpleParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(SimpleParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(SimpleParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(SimpleParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			match(PAR_OPEN);
			setState(66);
			((ConditionalContext)_localctx).expression = expression();
			setState(67);
			match(PAR_CLOSE);

						 	List<ASTNode> body = new ArrayList<ASTNode>();
						 
			setState(69);
			match(BRACKET_OPEN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(70);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node); 
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(BRACKET_CLOSE);
			setState(79);
			match(ELSE);

						 	List<ASTNode> elseBody = new ArrayList<ASTNode>();
						 
			setState(81);
			match(BRACKET_OPEN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				((ConditionalContext)_localctx).s2 = sentence();
				 elseBody.add(((ConditionalContext)_localctx).s2.node); 
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(BRACKET_CLOSE);

						 	((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, elseBody);
						 
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(VAR);
			setState(94);
			((Var_declContext)_localctx).ID = match(ID);
			setState(95);
			match(SEMICOLON);
			 ((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)); 
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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(99);
			match(ASSIGN);
			setState(100);
			((Var_assignContext)_localctx).expression = expression();
			setState(101);
			match(SEMICOLON);
			 ((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node); 
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

	public static class Logic_exprContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpleParser.AND, i);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((Logic_exprContext)_localctx).left = expression();
			 ((Logic_exprContext)_localctx).node =  ((Logic_exprContext)_localctx).left.node; 
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(106);
				match(AND);
				setState(107);
				((Logic_exprContext)_localctx).right = expression();
				 ((Logic_exprContext)_localctx).node =  new And(_localctx.node, ((Logic_exprContext)_localctx).right.node); 
				}
				}
				setState(114);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public FactorContext t3;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleParser.PLUS, i);
		}
		public List<TerminalNode> DIST() { return getTokens(SimpleParser.DIST); }
		public TerminalNode DIST(int i) {
			return getToken(SimpleParser.DIST, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((ExpressionContext)_localctx).t1 = factor();
			 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node; 
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==DIST) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(117);
					match(PLUS);
					setState(118);
					((ExpressionContext)_localctx).t2 = factor();
					 ((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node); 
					}
					break;
				case DIST:
					{
					setState(121);
					match(DIST);
					setState(122);
					((ExpressionContext)_localctx).t3 = factor();
					 ((ExpressionContext)_localctx).node =  new Distance(_localctx.node, ((ExpressionContext)_localctx).t3.node); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((FactorContext)_localctx).t1 = term();
			 ((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node; 
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(132);
				match(MULT);
				setState(133);
				((FactorContext)_localctx).t2 = term();
				 ((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node); 
				}
				}
				setState(140);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode BERN() { return getToken(SimpleParser.BERN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				 ((TermContext)_localctx).node =  new Constant(Double.parseDouble((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null))); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				((TermContext)_localctx).ID = match(ID);
				 ((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)); 
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(PAR_OPEN);
				setState(148);
				((TermContext)_localctx).expression = expression();
				 ((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node; 
				setState(150);
				match(PAR_CLOSE);
				}
				break;
			case BERN:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(BERN);
				setState(153);
				match(PAR_OPEN);
				setState(154);
				((TermContext)_localctx).expression = expression();
				setState(155);
				match(PAR_CLOSE);
				 ((TermContext)_localctx).node =  new Bernoulli(((TermContext)_localctx).expression.node); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n"+
		"\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00a6\2\30\3\2\2\2\4\63"+
		"\3\2\2\2\6\65\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\f_\3\2\2\2\16d\3\2\2\2\20"+
		"j\3\2\2\2\22u\3\2\2\2\24\u0084\3\2\2\2\26\u00a0\3\2\2\2\30\31\7\3\2\2"+
		"\31\32\7\36\2\2\32\33\7\30\2\2\33!\b\2\1\2\34\35\5\4\3\2\35\36\b\2\1\2"+
		"\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2"+
		"#!\3\2\2\2$%\7\31\2\2%&\b\2\1\2&\3\3\2\2\2\'(\5\6\4\2()\b\3\1\2)\64\3"+
		"\2\2\2*+\5\n\6\2+,\b\3\1\2,\64\3\2\2\2-.\5\f\7\2./\b\3\1\2/\64\3\2\2\2"+
		"\60\61\5\16\b\2\61\62\b\3\1\2\62\64\3\2\2\2\63\'\3\2\2\2\63*\3\2\2\2\63"+
		"-\3\2\2\2\63\60\3\2\2\2\64\5\3\2\2\2\65\66\7\5\2\2\66\67\5\b\5\2\678\7"+
		"\34\2\289\b\4\1\29\7\3\2\2\2:;\5\22\n\2;<\b\5\1\2<A\3\2\2\2=>\5\20\t\2"+
		">?\b\5\1\2?A\3\2\2\2@:\3\2\2\2@=\3\2\2\2A\t\3\2\2\2BC\7\6\2\2CD\7\32\2"+
		"\2DE\5\22\n\2EF\7\33\2\2FG\b\6\1\2GM\7\30\2\2HI\5\4\3\2IJ\b\6\1\2JL\3"+
		"\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7"+
		"\31\2\2QR\7\7\2\2RS\b\6\1\2SY\7\30\2\2TU\5\4\3\2UV\b\6\1\2VX\3\2\2\2W"+
		"T\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\31\2"+
		"\2]^\b\6\1\2^\13\3\2\2\2_`\7\4\2\2`a\7\36\2\2ab\7\34\2\2bc\b\7\1\2c\r"+
		"\3\2\2\2de\7\36\2\2ef\7\27\2\2fg\5\22\n\2gh\7\34\2\2hi\b\b\1\2i\17\3\2"+
		"\2\2jk\5\22\n\2kr\b\t\1\2lm\7\f\2\2mn\5\22\n\2no\b\t\1\2oq\3\2\2\2pl\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\5\24\13\2"+
		"v\u0081\b\n\1\2wx\7\b\2\2xy\5\24\13\2yz\b\n\1\2z\u0080\3\2\2\2{|\7\25"+
		"\2\2|}\5\24\13\2}~\b\n\1\2~\u0080\3\2\2\2\177w\3\2\2\2\177{\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0085\5\26\f\2\u0085\u008c\b\13\1\2\u0086\u0087"+
		"\7\n\2\2\u0087\u0088\5\26\f\2\u0088\u0089\b\13\1\2\u0089\u008b\3\2\2\2"+
		"\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\25\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\37\2\2\u0090"+
		"\u00a1\b\f\1\2\u0091\u0092\7\35\2\2\u0092\u00a1\b\f\1\2\u0093\u0094\7"+
		"\36\2\2\u0094\u00a1\b\f\1\2\u0095\u0096\7\32\2\2\u0096\u0097\5\22\n\2"+
		"\u0097\u0098\b\f\1\2\u0098\u0099\7\33\2\2\u0099\u00a1\3\2\2\2\u009a\u009b"+
		"\7\26\2\2\u009b\u009c\7\32\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\33\2"+
		"\2\u009e\u009f\b\f\1\2\u009f\u00a1\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0091"+
		"\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1"+
		"\27\3\2\2\2\f!\63@MYr\177\u0081\u008c\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}