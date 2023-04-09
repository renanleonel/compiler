// Generated from C:/Users/JRafael/IdeaProjects/CompiladoresTeste/src/antlr\FCp.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FCp extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESERVED_WORDS=1, NUMERIC_TYPES=2, BOOLEAN_TYPES=3, STRING_TYPES=4, INT_VALUES=5, 
		FLOAT_VALUES=6, BOOLEAN_VALUES=7, STRING_VALUES=8, ASSIGNMENT_OP=9, ADD_OP=10, 
		MULT_OP=11, SEMICOLON=12, OP_PAR=13, CL_PAR=14, OP_BRA=15, CL_BRA=16, 
		WS=17, LINE_COMMENT=18, BLOCK_COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RESERVED_WORDS", "NUMERIC_TYPES", "BOOLEAN_TYPES", "STRING_TYPES", "INT_VALUES", 
			"FLOAT_VALUES", "BOOLEAN_VALUES", "STRING_VALUES", "ESC", "ASSIGNMENT_OP", 
			"ADD_OP", "MULT_OP", "SEMICOLON", "OP_PAR", "CL_PAR", "OP_BRA", "CL_BRA", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'BOOL'", "'STRING'", null, null, null, null, null, 
			null, null, "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESERVED_WORDS", "NUMERIC_TYPES", "BOOLEAN_TYPES", "STRING_TYPES", 
			"INT_VALUES", "FLOAT_VALUES", "BOOLEAN_VALUES", "STRING_VALUES", "ASSIGNMENT_OP", 
			"ADD_OP", "MULT_OP", "SEMICOLON", "OP_PAR", "CL_PAR", "OP_BRA", "CL_BRA", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT"
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


	public FCp(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FCp.g4"; }

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
		"\u0004\u0000\u0013\u00c7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000H\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001R\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004"+
		"a\b\u0004\u0001\u0004\u0004\u0004d\b\u0004\u000b\u0004\f\u0004e\u0001"+
		"\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0004\u0005l\b\u0005\u000b\u0005"+
		"\f\u0005m\u0001\u0005\u0001\u0005\u0004\u0005r\b\u0005\u000b\u0005\f\u0005"+
		"s\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007f\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0084\b\u0007\n\u0007\f\u0007\u0087"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0099\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00a1\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00b3\b\u0012\n\u0012\f\u0012\u00b6\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00be"+
		"\b\u0013\n\u0013\f\u0013\u00c1\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u00bf\u0000\u0014\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\u0000"+
		"\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f!"+
		"\u0010#\u0011%\u0012\'\u0013\u0001\u0000\u0005\u0002\u0000++--\u0002\u0000"+
		"\'\'\\\\\u0002\u0000%%//\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00dd"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0001G\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000\u0005"+
		"S\u0001\u0000\u0000\u0000\u0007X\u0001\u0000\u0000\u0000\t`\u0001\u0000"+
		"\u0000\u0000\u000bh\u0001\u0000\u0000\u0000\r~\u0001\u0000\u0000\u0000"+
		"\u000f\u0080\u0001\u0000\u0000\u0000\u0011\u008a\u0001\u0000\u0000\u0000"+
		"\u0013\u0098\u0001\u0000\u0000\u0000\u0015\u009a\u0001\u0000\u0000\u0000"+
		"\u0017\u00a0\u0001\u0000\u0000\u0000\u0019\u00a2\u0001\u0000\u0000\u0000"+
		"\u001b\u00a4\u0001\u0000\u0000\u0000\u001d\u00a6\u0001\u0000\u0000\u0000"+
		"\u001f\u00a8\u0001\u0000\u0000\u0000!\u00aa\u0001\u0000\u0000\u0000#\u00ac"+
		"\u0001\u0000\u0000\u0000%\u00b0\u0001\u0000\u0000\u0000\'\u00b9\u0001"+
		"\u0000\u0000\u0000)*\u0005S\u0000\u0000*+\u0005T\u0000\u0000+,\u0005A"+
		"\u0000\u0000,-\u0005R\u0000\u0000-H\u0005T\u0000\u0000./\u0005E\u0000"+
		"\u0000/0\u0005N\u0000\u00000H\u0005D\u0000\u000012\u0005I\u0000\u0000"+
		"2H\u0005F\u0000\u000034\u0005E\u0000\u000045\u0005L\u0000\u000056\u0005"+
		"S\u0000\u00006H\u0005E\u0000\u000078\u0005W\u0000\u000089\u0005H\u0000"+
		"\u00009:\u0005I\u0000\u0000:;\u0005L\u0000\u0000;H\u0005E\u0000\u0000"+
		"<=\u0005I\u0000\u0000=>\u0005N\u0000\u0000>?\u0005P\u0000\u0000?@\u0005"+
		"U\u0000\u0000@H\u0005T\u0000\u0000AB\u0005O\u0000\u0000BC\u0005U\u0000"+
		"\u0000CD\u0005T\u0000\u0000DE\u0005P\u0000\u0000EF\u0005U\u0000\u0000"+
		"FH\u0005T\u0000\u0000G)\u0001\u0000\u0000\u0000G.\u0001\u0000\u0000\u0000"+
		"G1\u0001\u0000\u0000\u0000G3\u0001\u0000\u0000\u0000G7\u0001\u0000\u0000"+
		"\u0000G<\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000H\u0002\u0001"+
		"\u0000\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005N\u0000\u0000KR\u0005T"+
		"\u0000\u0000LM\u0005F\u0000\u0000MN\u0005L\u0000\u0000NO\u0005O\u0000"+
		"\u0000OP\u0005A\u0000\u0000PR\u0005T\u0000\u0000QI\u0001\u0000\u0000\u0000"+
		"QL\u0001\u0000\u0000\u0000R\u0004\u0001\u0000\u0000\u0000ST\u0005B\u0000"+
		"\u0000TU\u0005O\u0000\u0000UV\u0005O\u0000\u0000VW\u0005L\u0000\u0000"+
		"W\u0006\u0001\u0000\u0000\u0000XY\u0005S\u0000\u0000YZ\u0005T\u0000\u0000"+
		"Z[\u0005R\u0000\u0000[\\\u0005I\u0000\u0000\\]\u0005N\u0000\u0000]^\u0005"+
		"G\u0000\u0000^\b\u0001\u0000\u0000\u0000_a\u0007\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"bd\u000209\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e"+
		"c\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\n\u0001\u0000\u0000"+
		"\u0000gi\u0007\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0001\u0000\u0000\u0000jl\u000209\u0000kj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0005.\u0000\u0000pr\u000209"+
		"\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\f\u0001\u0000\u0000\u0000uv\u0005"+
		"T\u0000\u0000vw\u0005R\u0000\u0000wx\u0005U\u0000\u0000x\u007f\u0005E"+
		"\u0000\u0000yz\u0005F\u0000\u0000z{\u0005A\u0000\u0000{|\u0005L\u0000"+
		"\u0000|}\u0005S\u0000\u0000}\u007f\u0005E\u0000\u0000~u\u0001\u0000\u0000"+
		"\u0000~y\u0001\u0000\u0000\u0000\u007f\u000e\u0001\u0000\u0000\u0000\u0080"+
		"\u0085\u0005\'\u0000\u0000\u0081\u0084\u0003\u0011\b\u0000\u0082\u0084"+
		"\b\u0001\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\'\u0000\u0000\u0089\u0010\u0001\u0000\u0000\u0000\u008a\u008b\u0005\\"+
		"\u0000\u0000\u008b\u008c\u0005\'\u0000\u0000\u008c\u0012\u0001\u0000\u0000"+
		"\u0000\u008d\u0099\u0005=\u0000\u0000\u008e\u008f\u0005*\u0000\u0000\u008f"+
		"\u0099\u0005=\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091\u0099\u0005"+
		"=\u0000\u0000\u0092\u0093\u0005%\u0000\u0000\u0093\u0099\u0005=\u0000"+
		"\u0000\u0094\u0095\u0005+\u0000\u0000\u0095\u0099\u0005=\u0000\u0000\u0096"+
		"\u0097\u0005-\u0000\u0000\u0097\u0099\u0005=\u0000\u0000\u0098\u008d\u0001"+
		"\u0000\u0000\u0000\u0098\u008e\u0001\u0000\u0000\u0000\u0098\u0090\u0001"+
		"\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000\u0098\u0094\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u0014\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0007\u0000\u0000\u0000\u009b\u0016\u0001"+
		"\u0000\u0000\u0000\u009c\u00a1\u0005*\u0000\u0000\u009d\u009e\u0005*\u0000"+
		"\u0000\u009e\u00a1\u0005*\u0000\u0000\u009f\u00a1\u0007\u0002\u0000\u0000"+
		"\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u0018\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005;\u0000\u0000\u00a3\u001a\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005(\u0000\u0000\u00a5\u001c\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005)\u0000\u0000\u00a7\u001e\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"{\u0000\u0000\u00a9 \u0001\u0000\u0000\u0000\u00aa\u00ab\u0005}\u0000"+
		"\u0000\u00ab\"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0003\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0006\u0011\u0000\u0000"+
		"\u00af$\u0001\u0000\u0000\u0000\u00b0\u00b4\u0005#\u0000\u0000\u00b1\u00b3"+
		"\b\u0004\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0006\u0012\u0000\u0000\u00b8&\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005/\u0000\u0000\u00ba\u00bb\u0005*\u0000\u0000"+
		"\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc\u00be\t\u0000\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005*\u0000\u0000\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0006\u0013\u0000\u0000\u00c6(\u0001\u0000"+
		"\u0000\u0000\u000f\u0000GQ`ehms~\u0083\u0085\u0098\u00a0\u00b4\u00bf\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}