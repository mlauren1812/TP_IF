// Generated from /home/maxence/Documents/S8/TP_IF/TP2/CircuitLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CircuitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQCIRCUIT=1, SEMICOLUMN=2, TRUE=3, FALSE=4, DESCR=5, EVAL=6, RETURNS=7, 
		LPAR=8, RPAR=9, EQUAL=10, AND=11, OR=12, NOT=13, VIRGULE=14, END=15, WS=16, 
		IDENTIFIANT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQCIRCUIT", "SEMICOLUMN", "TRUE", "FALSE", "DESCR", "EVAL", "RETURNS", 
			"LPAR", "RPAR", "EQUAL", "AND", "OR", "NOT", "VIRGULE", "END", "WS", 
			"IDENTIFIANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'eq_circuit'", "';'", "'true'", "'false'", "'descr'", "'eval'", 
			"'returns'", "'('", "')'", "'='", "'&'", "'|'", "'!'", "','", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQCIRCUIT", "SEMICOLUMN", "TRUE", "FALSE", "DESCR", "EVAL", "RETURNS", 
			"LPAR", "RPAR", "EQUAL", "AND", "OR", "NOT", "VIRGULE", "END", "WS", 
			"IDENTIFIANT"
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


	public CircuitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CircuitLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\6\21d\n\21\r\21\16\21"+
		"e\3\21\3\21\3\22\3\22\7\22l\n\22\f\22\16\22o\13\22\2\2\23\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\4\2\62;c|\2q\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\60\3"+
		"\2\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13=\3\2\2\2\rC\3\2\2\2\17H\3\2\2\2\21"+
		"P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2"+
		"\35\\\3\2\2\2\37^\3\2\2\2!c\3\2\2\2#i\3\2\2\2%&\7g\2\2&\'\7s\2\2\'(\7"+
		"a\2\2()\7e\2\2)*\7k\2\2*+\7t\2\2+,\7e\2\2,-\7w\2\2-.\7k\2\2./\7v\2\2/"+
		"\4\3\2\2\2\60\61\7=\2\2\61\6\3\2\2\2\62\63\7v\2\2\63\64\7t\2\2\64\65\7"+
		"w\2\2\65\66\7g\2\2\66\b\3\2\2\2\678\7h\2\289\7c\2\29:\7n\2\2:;\7u\2\2"+
		";<\7g\2\2<\n\3\2\2\2=>\7f\2\2>?\7g\2\2?@\7u\2\2@A\7e\2\2AB\7t\2\2B\f\3"+
		"\2\2\2CD\7g\2\2DE\7x\2\2EF\7c\2\2FG\7n\2\2G\16\3\2\2\2HI\7t\2\2IJ\7g\2"+
		"\2JK\7v\2\2KL\7w\2\2LM\7t\2\2MN\7p\2\2NO\7u\2\2O\20\3\2\2\2PQ\7*\2\2Q"+
		"\22\3\2\2\2RS\7+\2\2S\24\3\2\2\2TU\7?\2\2U\26\3\2\2\2VW\7(\2\2W\30\3\2"+
		"\2\2XY\7~\2\2Y\32\3\2\2\2Z[\7#\2\2[\34\3\2\2\2\\]\7.\2\2]\36\3\2\2\2^"+
		"_\7g\2\2_`\7p\2\2`a\7f\2\2a \3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\21\2\2h\"\3\2\2\2im\t\3\2\2jl\t\4\2\2k"+
		"j\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n$\3\2\2\2om\3\2\2\2\5\2em\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}