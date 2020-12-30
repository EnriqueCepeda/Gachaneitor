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
		COMILLA=23, NUMERO=24, DIGITO_VELOCIDAD=25, IDENT_NOMBRE=26, CADENA=27, 
		TILDES=28, CONTENIDO_DESCRIPCION=29, CORCHETE_ABIERTO=30, CORCHETE_CERRADO=31, 
		COMMENT=32, WS=33;
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
			"COMILLA", "NUMERO", "DIGITO_VELOCIDAD", "IDENT_NOMBRE", "CADENA", "TILDES", 
			"CONTENIDO_DESCRIPCION", "CORCHETE_ABIERTO", "CORCHETE_CERRADO", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'receta'", "'nombre'", "'descripcion'", "'tiempo'", "'total'", 
			"'preparacion'", "':'", "';'", "'-'", "'pasos'", "'ingredientes'", "'temperatura'", 
			"'velocidad'", null, null, null, null, null, null, null, "'{'", "'}'", 
			"'\"'", null, null, null, null, null, null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECETA", "NOMBRE", "DESCRIPCION", "TIEMPO", "TOTAL", "PREPARACION", 
			"DOSPUNTOS", "PUNTOYCOMA", "GUION", "PASOS", "INGREDIENTES", "TEMPERATURA", 
			"VELOCIDAD", "UNIDAD_CANTIDAD", "UNIDAD_TEMP", "UNIDAD_TIEMPO", "VERBO_MOV", 
			"VERBO_COC", "VERBO_PER", "OTROS_CARACTERES", "LLAVE_ABIERTA", "LLAVE_CERRADA", 
			"COMILLA", "NUMERO", "DIGITO_VELOCIDAD", "IDENT_NOMBRE", "CADENA", "TILDES", 
			"CONTENIDO_DESCRIPCION", "CORCHETE_ABIERTO", "CORCHETE_CERRADO", "COMMENT", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0193\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f2\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0132\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\7\31\u013e\n\31\f\31\16\31\u0141\13\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u014d\n\33\f\33\16\33\u0150\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u0159\n\34\r\34\16\34\u015a\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u016f\n\35\3\36\3\36\3\36\7\36\u0174\n\36\f\36"+
		"\16\36\u0177\13\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\7!\u0183\n!\f"+
		"!\16!\u0186\13!\3!\3!\3!\3!\3!\3\"\6\"\u018e\n\"\r\"\16\"\u018f\3\"\3"+
		"\"\3\u0184\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#\3\2\t\6\2*+..\60\60aa\3\2\63;\3\2\62;\3\2C\\\4"+
		"\2\"\"c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u01bb\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5L\3\2\2\2\7S\3\2\2\2\t_\3\2\2"+
		"\2\13f\3\2\2\2\rl\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25~\3\2"+
		"\2\2\27\u0084\3\2\2\2\31\u0091\3\2\2\2\33\u009d\3\2\2\2\35\u00b1\3\2\2"+
		"\2\37\u00b9\3\2\2\2!\u00c2\3\2\2\2#\u00f1\3\2\2\2%\u011e\3\2\2\2\'\u0131"+
		"\3\2\2\2)\u0133\3\2\2\2+\u0135\3\2\2\2-\u0137\3\2\2\2/\u0139\3\2\2\2\61"+
		"\u013b\3\2\2\2\63\u0142\3\2\2\2\65\u0145\3\2\2\2\67\u0158\3\2\2\29\u016e"+
		"\3\2\2\2;\u0170\3\2\2\2=\u017a\3\2\2\2?\u017c\3\2\2\2A\u017e\3\2\2\2C"+
		"\u018d\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7e\2\2HI\7g\2\2IJ\7v\2\2JK\7c\2\2K"+
		"\4\3\2\2\2LM\7p\2\2MN\7q\2\2NO\7o\2\2OP\7d\2\2PQ\7t\2\2QR\7g\2\2R\6\3"+
		"\2\2\2ST\7f\2\2TU\7g\2\2UV\7u\2\2VW\7e\2\2WX\7t\2\2XY\7k\2\2YZ\7r\2\2"+
		"Z[\7e\2\2[\\\7k\2\2\\]\7q\2\2]^\7p\2\2^\b\3\2\2\2_`\7v\2\2`a\7k\2\2ab"+
		"\7g\2\2bc\7o\2\2cd\7r\2\2de\7q\2\2e\n\3\2\2\2fg\7v\2\2gh\7q\2\2hi\7v\2"+
		"\2ij\7c\2\2jk\7n\2\2k\f\3\2\2\2lm\7r\2\2mn\7t\2\2no\7g\2\2op\7r\2\2pq"+
		"\7c\2\2qr\7t\2\2rs\7c\2\2st\7e\2\2tu\7k\2\2uv\7q\2\2vw\7p\2\2w\16\3\2"+
		"\2\2xy\7<\2\2y\20\3\2\2\2z{\7=\2\2{\22\3\2\2\2|}\7/\2\2}\24\3\2\2\2~\177"+
		"\7r\2\2\177\u0080\7c\2\2\u0080\u0081\7u\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7u\2\2\u0083\26\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7f\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2"+
		"\u008e\u008f\7g\2\2\u008f\u0090\7u\2\2\u0090\30\3\2\2\2\u0091\u0092\7"+
		"v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7o\2\2\u0094\u0095\7r\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7t\2\2\u0097\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c\2\2\u009c\32\3\2\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\u00a2\7e\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7f\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00b2"+
		"\7i\2\2\u00a9\u00b2\7i\2\2\u00aa\u00ab\7m\2\2\u00ab\u00b2\7i\2\2\u00ac"+
		"\u00ad\7o\2\2\u00ad\u00b2\7n\2\2\u00ae\u00b2\7n\2\2\u00af\u00b0\7w\2\2"+
		"\u00b0\u00b2\7f\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa"+
		"\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\7\u00c4\2\2\u00b4\u00b5\7\u00bc\2\2\u00b5\u00ba"+
		"\7E\2\2\u00b6\u00b7\7\u00c4\2\2\u00b7\u00b8\7\u00bc\2\2\u00b8\u00ba\7"+
		"H\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba \3\2\2\2\u00bb\u00c3"+
		"\7j\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7k\2\2\u00be\u00c3\7p\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c3\7i\2\2\u00c2\u00bb\3\2\2"+
		"\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\"\3\2\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00f2\7t\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00f2\7t\2\2\u00d2\u00d3\7d\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00f2\7t\2\2"+
		"\u00d7\u00d8\7f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7l\2\2\u00da\u00db"+
		"\7c\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7u\2\2"+
		"\u00e2\u00e3\7c\2\2\u00e3\u00f2\7t\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7o\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00f2\7t\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7|\2\2"+
		"\u00ed\u00ee\7e\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f2"+
		"\7t\2\2\u00f1\u00c4\3\2\2\2\u00f1\u00ca\3\2\2\2\u00f1\u00d2\3\2\2\2\u00f1"+
		"\u00d7\3\2\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f2$\3\2\2\2"+
		"\u00f3\u00f4\7e\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7"+
		"\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7t\2\2\u00fa"+
		"\u00fb\7\"\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7\"\2"+
		"\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7r\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u011f\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105\7u\2\2\u0105"+
		"\u0106\7e\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u0108\u0109\7h\2\2"+
		"\u0109\u010a\7c\2\2\u010a\u011f\7t\2\2\u010b\u010c\7j\2\2\u010c\u010d"+
		"\7g\2\2\u010d\u010e\7t\2\2\u010e\u010f\7x\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u011f\7t\2\2\u0111\u0112\7i\2\2\u0112\u0113\7w\2\2\u0113\u0114\7k\2\2"+
		"\u0114\u0115\7u\2\2\u0115\u0116\7c\2\2\u0116\u011f\7t\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7q\2\2\u0119\u011a\7h\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7g\2\2\u011c\u011d\7k\2\2\u011d\u011f\7t\2\2\u011e\u00f3\3\2\2"+
		"\2\u011e\u0103\3\2\2\2\u011e\u010b\3\2\2\2\u011e\u0111\3\2\2\2\u011e\u0117"+
		"\3\2\2\2\u011f&\3\2\2\2\u0120\u0121\7r\2\2\u0121\u0122\7g\2\2\u0122\u0123"+
		"\7n\2\2\u0123\u0124\7c\2\2\u0124\u0132\7t\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7t\2\2\u0127\u0128\7q\2\2\u0128\u0129\7e\2\2\u0129\u012a\7g\2\2"+
		"\u012a\u012b\7c\2\2\u012b\u0132\7t\2\2\u012c\u012d\7o\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7n\2\2\u012f\u0130\7g\2\2\u0130\u0132\7t\2\2\u0131"+
		"\u0120\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u012c\3\2\2\2\u0132(\3\2\2\2"+
		"\u0133\u0134\t\2\2\2\u0134*\3\2\2\2\u0135\u0136\7}\2\2\u0136,\3\2\2\2"+
		"\u0137\u0138\7\177\2\2\u0138.\3\2\2\2\u0139\u013a\7$\2\2\u013a\60\3\2"+
		"\2\2\u013b\u013f\t\3\2\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\62\3\2\2"+
		"\2\u0141\u013f\3\2\2\2\u0142\u0143\7\62\2\2\u0143\u0144\t\3\2\2\u0144"+
		"\64\3\2\2\2\u0145\u014e\t\5\2\2\u0146\u014d\t\6\2\2\u0147\u014d\59\35"+
		"\2\u0148\u0149\7\u00c5\2\2\u0149\u014d\7\u00b3\2\2\u014a\u014b\7\u00c5"+
		"\2\2\u014b\u014d\7\uffff\2\2\u014c\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c"+
		"\u0148\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\66\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0159"+
		"\t\7\2\2\u0152\u0159\5)\25\2\u0153\u0159\59\35\2\u0154\u0155\7\u00c5\2"+
		"\2\u0155\u0159\7\u00b3\2\2\u0156\u0157\7\u00c5\2\2\u0157\u0159\7\uffff"+
		"\2\2\u0158\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b8\3\2\2\2\u015c\u015d\7\u00c5\2\2\u015d"+
		"\u016f\7\u00a3\2\2\u015e\u015f\7\u00c5\2\2\u015f\u016f\7\u00ab\2\2\u0160"+
		"\u0161\7\u00c5\2\2\u0161\u016f\7\u00af\2\2\u0162\u0163\7\u00c5\2\2\u0163"+
		"\u016f\7\u00b5\2\2\u0164\u0165\7\u00c5\2\2\u0165\u016f\7\u00bc\2\2\u0166"+
		"\u0167\7\u00c5\2\2\u0167\u016f\7\u2032\2\2\u0168\u0169\7\u00c5\2\2\u0169"+
		"\u016f\7\uffff\2\2\u016a\u016b\7\u00c5\2\2\u016b\u016f\7\u201e\2\2\u016c"+
		"\u016d\7\u00c5\2\2\u016d\u016f\7\u0163\2\2\u016e\u015c\3\2\2\2\u016e\u015e"+
		"\3\2\2\2\u016e\u0160\3\2\2\2\u016e\u0162\3\2\2\2\u016e\u0164\3\2\2\2\u016e"+
		"\u0166\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f:\3\2\2\2\u0170\u0175\5=\37\2\u0171\u0174\5\67\34\2\u0172\u0174"+
		"\7\"\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\5? \2\u0179<\3\2\2\2\u017a\u017b\7]\2\2\u017b>\3\2\2"+
		"\2\u017c\u017d\7_\2\2\u017d@\3\2\2\2\u017e\u017f\7\61\2\2\u017f\u0180"+
		"\7,\2\2\u0180\u0184\3\2\2\2\u0181\u0183\13\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7,\2\2\u0188\u0189\7\61\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\b!\2\2\u018bB\3\2\2\2\u018c\u018e\t\b\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\"\2\2\u0192D\3\2\2\2\23\2\u00b1"+
		"\u00b9\u00c2\u00f1\u011e\u0131\u013f\u014c\u014e\u0158\u015a\u016e\u0173"+
		"\u0175\u0184\u018f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}