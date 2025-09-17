// Generated from com\miorganizacion\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.miorganizacion.simple.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, DIST=19, 
		BERN=20, ASSIGN=21, BRACKET_OPEN=22, BRACKET_CLOSE=23, PAR_OPEN=24, PAR_CLOSE=25, 
		SEMICOLON=26, BOOLEAN=27, ID=28, NUMBER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "DIST", "BERN", 
			"ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"BOOLEAN", "ID", "NUMBER", "WS"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u009a\n\34\3\35"+
		"\3\35\7\35\u009e\n\35\f\35\16\35\u00a1\13\35\3\36\6\36\u00a4\n\36\r\36"+
		"\16\36\u00a5\3\36\3\36\6\36\u00aa\n\36\r\36\16\36\u00ab\5\36\u00ae\n\36"+
		"\3\37\6\37\u00b1\n\37\r\37\16\37\u00b2\3\37\3\37\2\2 \3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00bb\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\3?\3\2\2\2\5G\3\2\2\2\7K\3\2\2\2\tS\3\2\2\2\13V\3\2\2\2\r[\3\2\2\2\17"+
		"]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27f\3\2\2\2\31i\3\2\2\2"+
		"\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!r\3\2\2\2#u\3\2\2\2%x\3\2\2\2\'{"+
		"\3\2\2\2)\u0080\3\2\2\2+\u0084\3\2\2\2-\u0086\3\2\2\2/\u0088\3\2\2\2\61"+
		"\u008a\3\2\2\2\63\u008c\3\2\2\2\65\u008e\3\2\2\2\67\u0099\3\2\2\29\u009b"+
		"\3\2\2\2;\u00a3\3\2\2\2=\u00b0\3\2\2\2?@\7r\2\2@A\7t\2\2AB\7q\2\2BC\7"+
		"i\2\2CD\7t\2\2DE\7c\2\2EF\7o\2\2F\4\3\2\2\2GH\7x\2\2HI\7c\2\2IJ\7t\2\2"+
		"J\6\3\2\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7n\2\2QR\7"+
		"p\2\2R\b\3\2\2\2ST\7k\2\2TU\7h\2\2U\n\3\2\2\2VW\7g\2\2WX\7n\2\2XY\7u\2"+
		"\2YZ\7g\2\2Z\f\3\2\2\2[\\\7-\2\2\\\16\3\2\2\2]^\7/\2\2^\20\3\2\2\2_`\7"+
		",\2\2`\22\3\2\2\2ab\7\61\2\2b\24\3\2\2\2cd\7(\2\2de\7(\2\2e\26\3\2\2\2"+
		"fg\7~\2\2gh\7~\2\2h\30\3\2\2\2ij\7#\2\2j\32\3\2\2\2kl\7@\2\2l\34\3\2\2"+
		"\2mn\7>\2\2n\36\3\2\2\2op\7@\2\2pq\7?\2\2q \3\2\2\2rs\7>\2\2st\7?\2\2"+
		"t\"\3\2\2\2uv\7?\2\2vw\7?\2\2w$\3\2\2\2xy\7#\2\2yz\7?\2\2z&\3\2\2\2{|"+
		"\7>\2\2|}\7/\2\2}~\7/\2\2~\177\7@\2\2\177(\3\2\2\2\u0080\u0081\7/\2\2"+
		"\u0081\u0082\7d\2\2\u0082\u0083\7/\2\2\u0083*\3\2\2\2\u0084\u0085\7?\2"+
		"\2\u0085,\3\2\2\2\u0086\u0087\7}\2\2\u0087.\3\2\2\2\u0088\u0089\7\177"+
		"\2\2\u0089\60\3\2\2\2\u008a\u008b\7*\2\2\u008b\62\3\2\2\2\u008c\u008d"+
		"\7+\2\2\u008d\64\3\2\2\2\u008e\u008f\7=\2\2\u008f\66\3\2\2\2\u0090\u0091"+
		"\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7w\2\2\u0093\u009a\7g\2\2\u0094"+
		"\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2"+
		"\u0098\u009a\7g\2\2\u0099\u0090\3\2\2\2\u0099\u0094\3\2\2\2\u009a8\3\2"+
		"\2\2\u009b\u009f\t\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0:\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a2\u00a4\t\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad\3\2\2\2\u00a7"+
		"\u00a9\7\60\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae<\3\2\2\2\u00af\u00b1\t\5\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\37\2\2\u00b5>\3\2\2\2\t\2\u0099"+
		"\u009f\u00a5\u00ab\u00ad\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}