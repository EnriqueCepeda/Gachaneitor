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
		CORCHETE_ABIERTO=23, CORCHETE_CERRADO=24, COMILLA=25, NUMERO=26, DIGITO_VELOCIDAD=27, 
		IDENT_NOMBRES=28, CADENA=29, CONTENIDO_DESCRIPCION=30, COMMENT=31, WS=32;
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
			"CORCHETE_ABIERTO", "CORCHETE_CERRADO", "COMILLA", "NUMERO", "DIGITO_VELOCIDAD", 
			"IDENT_NOMBRES", "CADENA", "CONTENIDO_DESCRIPCION", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'receta'", "'nombre'", "'descripcion'", "'tiempo'", "'total'", 
			"'preparacion'", "':'", "';'", "'-'", "'pasos'", "'ingredientes'", "'temperatura'", 
			"'velocidad'", null, null, null, null, null, null, null, "'{'", "'}'", 
			"'['", "']'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECETA", "NOMBRE", "DESCRIPCION", "TIEMPO", "TOTAL", "PREPARACION", 
			"DOSPUNTOS", "PUNTOYCOMA", "GUION", "PASOS", "INGREDIENTES", "TEMPERATURA", 
			"VELOCIDAD", "UNIDAD_CANTIDAD", "UNIDAD_TEMP", "UNIDAD_TIEMPO", "VERBO_MOV", 
			"VERBO_COC", "VERBO_PER", "OTROS_CARACTERES", "LLAVE_ABIERTA", "LLAVE_CERRADA", 
			"CORCHETE_ABIERTO", "CORCHETE_CERRADO", "COMILLA", "NUMERO", "DIGITO_VELOCIDAD", 
			"IDENT_NOMBRES", "CADENA", "CONTENIDO_DESCRIPCION", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0175\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00b8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011d\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0130\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\7\33\u0140\n\33\f\33\16\33\u0143\13\33\3\34"+
		"\3\34\3\34\5\34\u0148\n\34\3\35\3\35\7\35\u014c\n\35\f\35\16\35\u014f"+
		"\13\35\3\36\3\36\6\36\u0153\n\36\r\36\16\36\u0154\3\37\3\37\3\37\7\37"+
		"\u015a\n\37\f\37\16\37\u015d\13\37\3\37\3\37\3 \3 \3 \3 \7 \u0165\n \f"+
		" \16 \u0168\13 \3 \3 \3 \3 \3 \3!\6!\u0170\n!\r!\16!\u0171\3!\3!\3\u0166"+
		"\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"\3\2\t\6\2*+..\60\60aa\3\2\63;\3\2\62;\3\2C\\\4\2\"\"c|\5\2"+
		"\62;C\\c|\5\2\13\f\17\17\"\"\2\u0190\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3C\3\2\2\2\5J\3\2\2\2\7Q\3\2\2\2\t]\3\2\2\2\13d\3\2\2\2\rj\3\2\2"+
		"\2\17v\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25|\3\2\2\2\27\u0082\3\2\2\2\31"+
		"\u008f\3\2\2\2\33\u009b\3\2\2\2\35\u00af\3\2\2\2\37\u00b7\3\2\2\2!\u00c0"+
		"\3\2\2\2#\u00ef\3\2\2\2%\u011c\3\2\2\2\'\u012f\3\2\2\2)\u0131\3\2\2\2"+
		"+\u0133\3\2\2\2-\u0135\3\2\2\2/\u0137\3\2\2\2\61\u0139\3\2\2\2\63\u013b"+
		"\3\2\2\2\65\u013d\3\2\2\2\67\u0147\3\2\2\29\u0149\3\2\2\2;\u0152\3\2\2"+
		"\2=\u0156\3\2\2\2?\u0160\3\2\2\2A\u016f\3\2\2\2CD\7t\2\2DE\7g\2\2EF\7"+
		"e\2\2FG\7g\2\2GH\7v\2\2HI\7c\2\2I\4\3\2\2\2JK\7p\2\2KL\7q\2\2LM\7o\2\2"+
		"MN\7d\2\2NO\7t\2\2OP\7g\2\2P\6\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7u\2\2TU\7"+
		"e\2\2UV\7t\2\2VW\7k\2\2WX\7r\2\2XY\7e\2\2YZ\7k\2\2Z[\7q\2\2[\\\7p\2\2"+
		"\\\b\3\2\2\2]^\7v\2\2^_\7k\2\2_`\7g\2\2`a\7o\2\2ab\7r\2\2bc\7q\2\2c\n"+
		"\3\2\2\2de\7v\2\2ef\7q\2\2fg\7v\2\2gh\7c\2\2hi\7n\2\2i\f\3\2\2\2jk\7r"+
		"\2\2kl\7t\2\2lm\7g\2\2mn\7r\2\2no\7c\2\2op\7t\2\2pq\7c\2\2qr\7e\2\2rs"+
		"\7k\2\2st\7q\2\2tu\7p\2\2u\16\3\2\2\2vw\7<\2\2w\20\3\2\2\2xy\7=\2\2y\22"+
		"\3\2\2\2z{\7/\2\2{\24\3\2\2\2|}\7r\2\2}~\7c\2\2~\177\7u\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7u\2\2\u0081\26\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7i\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7f\2\2\u0088\u0089\7k\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2"+
		"\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d\u008e\7u\2\2\u008e\30\3\2"+
		"\2\2\u008f\u0090\7v\2\2\u0090\u0091\7g\2\2\u0091\u0092\7o\2\2\u0092\u0093"+
		"\7r\2\2\u0093\u0094\7g\2\2\u0094\u0095\7t\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7c\2\2"+
		"\u009a\32\3\2\2\2\u009b\u009c\7x\2\2\u009c\u009d\7g\2\2\u009d\u009e\7"+
		"n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7f\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7f\2\2\u00a4\34\3\2\2\2\u00a5\u00a6"+
		"\7o\2\2\u00a6\u00b0\7i\2\2\u00a7\u00b0\7i\2\2\u00a8\u00a9\7m\2\2\u00a9"+
		"\u00b0\7i\2\2\u00aa\u00ab\7o\2\2\u00ab\u00b0\7n\2\2\u00ac\u00b0\7n\2\2"+
		"\u00ad\u00ae\7w\2\2\u00ae\u00b0\7f\2\2\u00af\u00a5\3\2\2\2\u00af\u00a7"+
		"\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ac\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7\u00c4\2\2\u00b2\u00b3\7"+
		"\u00bc\2\2\u00b3\u00b8\7E\2\2\u00b4\u00b5\7\u00c4\2\2\u00b5\u00b6\7\u00bc"+
		"\2\2\u00b6\u00b8\7H\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		" \3\2\2\2\u00b9\u00c1\7j\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00c1\7p\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c1\7i\2\2"+
		"\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\"\3"+
		"\2\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7e\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00c7\7c\2\2\u00c7\u00f0\7t\2\2\u00c8\u00c9\7v\2\2"+
		"\u00c9\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7w\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7c\2\2\u00cf\u00f0\7t\2\2\u00d0"+
		"\u00d1\7d\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2"+
		"\u00d4\u00f0\7t\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7l\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7\"\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7q\2\2"+
		"\u00df\u00e0\7u\2\2\u00e0\u00e1\7c\2\2\u00e1\u00f0\7t\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7u\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00f0\7t\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7|\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00f0\7t\2\2\u00ef\u00c2\3\2\2\2\u00ef\u00c8\3\2\2\2\u00ef"+
		"\u00d0\3\2\2\2\u00ef\u00d5\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e8\3\2"+
		"\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7e\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7c\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2"+
		"\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7r\2\2\u00ff\u0100\7q\2\2\u0100\u011d\7t\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7u\2\2\u0103\u0104\7e\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2"+
		"\u0106\u0107\7h\2\2\u0107\u0108\7c\2\2\u0108\u011d\7t\2\2\u0109\u010a"+
		"\7j\2\2\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c\u010d\7x\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u011d\7t\2\2\u010f\u0110\7i\2\2\u0110\u0111\7w\2\2"+
		"\u0111\u0112\7k\2\2\u0112\u0113\7u\2\2\u0113\u0114\7c\2\2\u0114\u011d"+
		"\7t\2\2\u0115\u0116\7u\2\2\u0116\u0117\7q\2\2\u0117\u0118\7h\2\2\u0118"+
		"\u0119\7t\2\2\u0119\u011a\7g\2\2\u011a\u011b\7k\2\2\u011b\u011d\7t\2\2"+
		"\u011c\u00f1\3\2\2\2\u011c\u0101\3\2\2\2\u011c\u0109\3\2\2\2\u011c\u010f"+
		"\3\2\2\2\u011c\u0115\3\2\2\2\u011d&\3\2\2\2\u011e\u011f\7r\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7n\2\2\u0121\u0122\7c\2\2\u0122\u0130\7t\2\2\u0123"+
		"\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126\7q\2\2\u0126\u0127\7e\2\2"+
		"\u0127\u0128\7g\2\2\u0128\u0129\7c\2\2\u0129\u0130\7t\2\2\u012a\u012b"+
		"\7o\2\2\u012b\u012c\7q\2\2\u012c\u012d\7n\2\2\u012d\u012e\7g\2\2\u012e"+
		"\u0130\7t\2\2\u012f\u011e\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u012a\3\2"+
		"\2\2\u0130(\3\2\2\2\u0131\u0132\t\2\2\2\u0132*\3\2\2\2\u0133\u0134\7}"+
		"\2\2\u0134,\3\2\2\2\u0135\u0136\7\177\2\2\u0136.\3\2\2\2\u0137\u0138\7"+
		"]\2\2\u0138\60\3\2\2\2\u0139\u013a\7_\2\2\u013a\62\3\2\2\2\u013b\u013c"+
		"\7$\2\2\u013c\64\3\2\2\2\u013d\u0141\t\3\2\2\u013e\u0140\t\4\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\66\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0148\t\3\2\2\u0145\u0146"+
		"\7\63\2\2\u0146\u0148\7\62\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u01488\3\2\2\2\u0149\u014d\t\5\2\2\u014a\u014c\t\6\2\2\u014b\u014a\3"+
		"\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		":\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\t\7\2\2\u0151\u0153\5)\25\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155<\3\2\2\2\u0156\u015b\7]\2\2\u0157\u015a"+
		"\5;\36\2\u0158\u015a\7\"\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7_\2\2\u015f>\3\2\2\2\u0160\u0161"+
		"\7\61\2\2\u0161\u0162\7,\2\2\u0162\u0166\3\2\2\2\u0163\u0165\13\2\2\2"+
		"\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7,\2\2\u016a"+
		"\u016b\7\61\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b \2\2\u016d@\3\2\2\2"+
		"\u016e\u0170\t\b\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b!\2\2\u0174"+
		"B\3\2\2\2\23\2\u00af\u00b7\u00c0\u00ef\u011c\u012f\u0141\u0147\u014b\u014d"+
		"\u0152\u0154\u0159\u015b\u0166\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}