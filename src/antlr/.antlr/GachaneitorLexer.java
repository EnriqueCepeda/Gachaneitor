// Generated from c:\Users\elena\OneDrive - Universidad de Castilla-La Mancha\Universidad\4_primerCuatri\ProcesadoresLenguajes\Gachaneitor\src\antlr\Gachaneitor.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GachaneitorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECETA=1, NOMBRE=2, DESCRIPCION=3, TIEMPO=4, TOTAL=5, PREPARACION=6, DOSPUNTOS=7, 
		PUNTOYCOMA=8, GUION=9, PASOS=10, INGREDIENTES=11, TEMPERATURA=12, VELOCIDAD=13, 
		UNIDAD_CANTIDAD=14, UNIDAD_TEMP=15, UNIDAD_TIEMPO=16, VERBO_MOV=17, VERBO_COC=18, 
		VERBO_PER=19, OTROS_CARACTERES=20, LLAVE_ABIERTA=21, LLAVE_CERRADA=22, 
		COMILLA=23, NUMERO=24, DIGITO_VELOCIDAD=25, IDENT_NOMBRES=26, CADENA=27, 
		TILDES=28, CONTENIDO_DESCRIPCION=29, COMMENT=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RECETA", "NOMBRE", "DESCRIPCION", "TIEMPO", "TOTAL", "PREPARACION", 
			"DOSPUNTOS", "PUNTOYCOMA", "GUION", "PASOS", "INGREDIENTES", "TEMPERATURA", 
			"VELOCIDAD", "UNIDAD_CANTIDAD", "UNIDAD_TEMP", "UNIDAD_TIEMPO", "VERBO_MOV", 
			"VERBO_COC", "VERBO_PER", "OTROS_CARACTERES", "LLAVE_ABIERTA", "LLAVE_CERRADA", 
			"COMILLA", "NUMERO", "DIGITO_VELOCIDAD", "IDENT_NOMBRES", "CADENA", "TILDES", 
			"CONTENIDO_DESCRIPCION", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'receta'", "'nombre'", "'descripcion'", "'tiempo'", "'total'", 
			"'preparacion'", "':'", "';'", "'-'", "'pasos'", "'ingredientes'", "'temperatura'", 
			"'velocidad'", null, null, null, null, null, null, null, "'{'", "'}'", 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECETA", "NOMBRE", "DESCRIPCION", "TIEMPO", "TOTAL", "PREPARACION", 
			"DOSPUNTOS", "PUNTOYCOMA", "GUION", "PASOS", "INGREDIENTES", "TEMPERATURA", 
			"VELOCIDAD", "UNIDAD_CANTIDAD", "UNIDAD_TEMP", "UNIDAD_TIEMPO", "VERBO_MOV", 
			"VERBO_COC", "VERBO_PER", "OTROS_CARACTERES", "LLAVE_ABIERTA", "LLAVE_CERRADA", 
			"COMILLA", "NUMERO", "DIGITO_VELOCIDAD", "IDENT_NOMBRES", "CADENA", "TILDES", 
			"CONTENIDO_DESCRIPCION", "COMMENT", "WS"
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


	public GachaneitorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gachaneitor.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u018b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00b6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bf"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00ee\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011b\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u012e\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31"+
		"\u013a\n\31\f\31\16\31\u013d\13\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0149\n\33\f\33\16\33\u014c\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\6\34\u0155\n\34\r\34\16\34\u0156\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u016b\n\35\3\36\3\36\3\36\7\36\u0170\n\36\f\36\16\36\u0173\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u017b\n\37\f\37\16\37\u017e\13"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u0186\n \r \16 \u0187\3 \3 \3\u017c"+
		"\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!\3\2\t\6\2*+..\60\60aa\3\2\63;\3\2\62;\3\2C\\\4\2\"\"c|\5\2\62"+
		";C\\c|\5\2\13\f\17\17\"\"\2\u01b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2"+
		"\2\5H\3\2\2\2\7O\3\2\2\2\t[\3\2\2\2\13b\3\2\2\2\rh\3\2\2\2\17t\3\2\2\2"+
		"\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27\u0080\3\2\2\2\31\u008d\3\2\2\2"+
		"\33\u0099\3\2\2\2\35\u00ad\3\2\2\2\37\u00b5\3\2\2\2!\u00be\3\2\2\2#\u00ed"+
		"\3\2\2\2%\u011a\3\2\2\2\'\u012d\3\2\2\2)\u012f\3\2\2\2+\u0131\3\2\2\2"+
		"-\u0133\3\2\2\2/\u0135\3\2\2\2\61\u0137\3\2\2\2\63\u013e\3\2\2\2\65\u0141"+
		"\3\2\2\2\67\u0154\3\2\2\29\u016a\3\2\2\2;\u016c\3\2\2\2=\u0176\3\2\2\2"+
		"?\u0185\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7e\2\2DE\7g\2\2EF\7v\2\2FG\7c\2\2"+
		"G\4\3\2\2\2HI\7p\2\2IJ\7q\2\2JK\7o\2\2KL\7d\2\2LM\7t\2\2MN\7g\2\2N\6\3"+
		"\2\2\2OP\7f\2\2PQ\7g\2\2QR\7u\2\2RS\7e\2\2ST\7t\2\2TU\7k\2\2UV\7r\2\2"+
		"VW\7e\2\2WX\7k\2\2XY\7q\2\2YZ\7p\2\2Z\b\3\2\2\2[\\\7v\2\2\\]\7k\2\2]^"+
		"\7g\2\2^_\7o\2\2_`\7r\2\2`a\7q\2\2a\n\3\2\2\2bc\7v\2\2cd\7q\2\2de\7v\2"+
		"\2ef\7c\2\2fg\7n\2\2g\f\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7g\2\2kl\7r\2\2lm"+
		"\7c\2\2mn\7t\2\2no\7c\2\2op\7e\2\2pq\7k\2\2qr\7q\2\2rs\7p\2\2s\16\3\2"+
		"\2\2tu\7<\2\2u\20\3\2\2\2vw\7=\2\2w\22\3\2\2\2xy\7/\2\2y\24\3\2\2\2z{"+
		"\7r\2\2{|\7c\2\2|}\7u\2\2}~\7q\2\2~\177\7u\2\2\177\26\3\2\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7i\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7f\2\2\u0086\u0087\7k\2\2\u0087\u0088\7g\2\2"+
		"\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7u\2\2\u008c\30\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7o\2\2\u0090\u0091\7r\2\2\u0091\u0092\7g\2\2\u0092\u0093\7t\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7v\2\2\u0095\u0096\7w\2\2\u0096\u0097\7t\2\2"+
		"\u0097\u0098\7c\2\2\u0098\32\3\2\2\2\u0099\u009a\7x\2\2\u009a\u009b\7"+
		"g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7e\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\34\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00ae\7i\2\2\u00a5\u00ae\7i\2\2\u00a6"+
		"\u00a7\7m\2\2\u00a7\u00ae\7i\2\2\u00a8\u00a9\7o\2\2\u00a9\u00ae\7n\2\2"+
		"\u00aa\u00ae\7n\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ae\7f\2\2\u00ad\u00a3"+
		"\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7\u00c4"+
		"\2\2\u00b0\u00b1\7\u00bc\2\2\u00b1\u00b6\7E\2\2\u00b2\u00b3\7\u00c4\2"+
		"\2\u00b3\u00b4\7\u00bc\2\2\u00b4\u00b6\7H\2\2\u00b5\u00af\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b6 \3\2\2\2\u00b7\u00bf\7j\2\2\u00b8\u00b9\7o\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bf\7p\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\u00bf\7i\2\2\u00be\u00b7\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb"+
		"\3\2\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7e\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7c\2\2\u00c5\u00ee\7t\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7w\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ee"+
		"\7t\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00ee\7t\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7l\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7\"\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7r\2\2\u00dc"+
		"\u00dd\7q\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7c\2\2\u00df\u00ee\7t\2\2"+
		"\u00e0\u00e1\7c\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4"+
		"\7u\2\2\u00e4\u00e5\7c\2\2\u00e5\u00ee\7t\2\2\u00e6\u00e7\7o\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7|\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7n\2\2"+
		"\u00eb\u00ec\7c\2\2\u00ec\u00ee\7t\2\2\u00ed\u00c0\3\2\2\2\u00ed\u00c6"+
		"\3\2\2\2\u00ed\u00ce\3\2\2\2\u00ed\u00d3\3\2\2\2\u00ed\u00e0\3\2\2\2\u00ed"+
		"\u00e6\3\2\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\u00f2\7e\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7c\2\2"+
		"\u00f5\u00f6\7t\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9"+
		"\7n\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7x\2\2\u00fb\u00fc\7c\2\2\u00fc"+
		"\u00fd\7r\2\2\u00fd\u00fe\7q\2\2\u00fe\u011b\7t\2\2\u00ff\u0100\7g\2\2"+
		"\u0100\u0101\7u\2\2\u0101\u0102\7e\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7n\2\2\u0104\u0105\7h\2\2\u0105\u0106\7c\2\2\u0106\u011b\7t\2\2\u0107"+
		"\u0108\7j\2\2\u0108\u0109\7g\2\2\u0109\u010a\7t\2\2\u010a\u010b\7x\2\2"+
		"\u010b\u010c\7k\2\2\u010c\u011b\7t\2\2\u010d\u010e\7i\2\2\u010e\u010f"+
		"\7w\2\2\u010f\u0110\7k\2\2\u0110\u0111\7u\2\2\u0111\u0112\7c\2\2\u0112"+
		"\u011b\7t\2\2\u0113\u0114\7u\2\2\u0114\u0115\7q\2\2\u0115\u0116\7h\2\2"+
		"\u0116\u0117\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7k\2\2\u0119\u011b"+
		"\7t\2\2\u011a\u00ef\3\2\2\2\u011a\u00ff\3\2\2\2\u011a\u0107\3\2\2\2\u011a"+
		"\u010d\3\2\2\2\u011a\u0113\3\2\2\2\u011b&\3\2\2\2\u011c\u011d\7r\2\2\u011d"+
		"\u011e\7g\2\2\u011e\u011f\7n\2\2\u011f\u0120\7c\2\2\u0120\u012e\7t\2\2"+
		"\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7e\2\2\u0125\u0126\7g\2\2\u0126\u0127\7c\2\2\u0127\u012e\7t\2\2\u0128"+
		"\u0129\7o\2\2\u0129\u012a\7q\2\2\u012a\u012b\7n\2\2\u012b\u012c\7g\2\2"+
		"\u012c\u012e\7t\2\2\u012d\u011c\3\2\2\2\u012d\u0121\3\2\2\2\u012d\u0128"+
		"\3\2\2\2\u012e(\3\2\2\2\u012f\u0130\t\2\2\2\u0130*\3\2\2\2\u0131\u0132"+
		"\7}\2\2\u0132,\3\2\2\2\u0133\u0134\7\177\2\2\u0134.\3\2\2\2\u0135\u0136"+
		"\7$\2\2\u0136\60\3\2\2\2\u0137\u013b\t\3\2\2\u0138\u013a\t\4\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\62\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\62\2\2\u013f\u0140"+
		"\t\3\2\2\u0140\64\3\2\2\2\u0141\u014a\t\5\2\2\u0142\u0149\t\6\2\2\u0143"+
		"\u0149\59\35\2\u0144\u0145\7\u00c5\2\2\u0145\u0149\7\u00b3\2\2\u0146\u0147"+
		"\7\u00c5\2\2\u0147\u0149\7\uffff\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3"+
		"\2\2\2\u0148\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\66\3\2\2\2\u014c\u014a\3\2\2"+
		"\2\u014d\u0155\t\7\2\2\u014e\u0155\5)\25\2\u014f\u0155\59\35\2\u0150\u0151"+
		"\7\u00c5\2\2\u0151\u0155\7\u00b3\2\2\u0152\u0153\7\u00c5\2\2\u0153\u0155"+
		"\7\uffff\2\2\u0154\u014d\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2\2"+
		"\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u01578\3\2\2\2\u0158\u0159\7\u00c5\2\2\u0159"+
		"\u016b\7\u00a3\2\2\u015a\u015b\7\u00c5\2\2\u015b\u016b\7\u00ab\2\2\u015c"+
		"\u015d\7\u00c5\2\2\u015d\u016b\7\u00af\2\2\u015e\u015f\7\u00c5\2\2\u015f"+
		"\u016b\7\u00b5\2\2\u0160\u0161\7\u00c5\2\2\u0161\u016b\7\u00bc\2\2\u0162"+
		"\u0163\7\u00c5\2\2\u0163\u016b\7\u2032\2\2\u0164\u0165\7\u00c5\2\2\u0165"+
		"\u016b\7\uffff\2\2\u0166\u0167\7\u00c5\2\2\u0167\u016b\7\u201e\2\2\u0168"+
		"\u0169\7\u00c5\2\2\u0169\u016b\7\u0163\2\2\u016a\u0158\3\2\2\2\u016a\u015a"+
		"\3\2\2\2\u016a\u015c\3\2\2\2\u016a\u015e\3\2\2\2\u016a\u0160\3\2\2\2\u016a"+
		"\u0162\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b:\3\2\2\2\u016c\u0171\7]\2\2\u016d\u0170\5\67\34\2\u016e\u0170"+
		"\7\"\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0174\u0175\7_\2\2\u0175<\3\2\2\2\u0176\u0177\7\61\2\2\u0177\u0178"+
		"\7,\2\2\u0178\u017c\3\2\2\2\u0179\u017b\13\2\2\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7,\2\2\u0180\u0181\7\61\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\b\37\2\2\u0183>\3\2\2\2\u0184\u0186\t\b\2\2"+
		"\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b \2\2\u018a@\3\2\2\2\23\2\u00ad"+
		"\u00b5\u00be\u00ed\u011a\u012d\u013b\u0148\u014a\u0154\u0156\u016a\u016f"+
		"\u0171\u017c\u0187\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}