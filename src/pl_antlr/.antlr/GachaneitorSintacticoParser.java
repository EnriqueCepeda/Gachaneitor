// Generated from c:\Users\elena\OneDrive - Universidad de Castilla-La Mancha\Universidad\4_primerCuatri\ProcesadoresLenguajes\Gachaneitor\src\antlr\GachaneitorSintactico.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GachaneitorSintacticoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECETA=1, NOMBRE=2, DESCRIPCION=3, TIEMPO=4, TOTAL=5, PREPARACION=6, DOSPUNTOS=7, 
		PUNTOYCOMA=8, GUION=9, PASOS=10, INGREDIENTES=11, TEMPERATURA=12, VELOCIDAD=13, 
		UNIDAD_CANTIDAD=14, UNIDAD_TEMP=15, UNIDAD_TIEMPO=16, VERBO_MOV=17, VERBO_COC=18, 
		VERBO_PER=19, OTROS_CARACTERES=20, LLAVE_ABIERTA=21, LLAVE_CERRADA=22, 
		CORCHETE_ABIERTO=23, CORCHETE_CERRADO=24, COMILLA=25, CADENA=26, TAB=27, 
		CONTENIDO_DESCRIPCION=28, NUMERO=29, DIGITO_VELOCIDAD=30, IDENT_NOMBRES=31, 
		COMMENT=32, WS=33;
	public static final int
		RULE_inicio = 0, RULE_receta = 1, RULE_nombre = 2, RULE_descripcion = 3, 
		RULE_tiempo_receta = 4, RULE_ingredientes = 5, RULE_ingrediente = 6, RULE_pasos = 7, 
		RULE_paso = 8, RULE_paso_mov = 9, RULE_paso_coc = 10, RULE_paso_per = 11, 
		RULE_cantidad = 12, RULE_tiempo = 13, RULE_temperatura = 14, RULE_velocidad = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "receta", "nombre", "descripcion", "tiempo_receta", "ingredientes", 
			"ingrediente", "pasos", "paso", "paso_mov", "paso_coc", "paso_per", "cantidad", 
			"tiempo", "temperatura", "velocidad"
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
			"CORCHETE_ABIERTO", "CORCHETE_CERRADO", "COMILLA", "CADENA", "TAB", "CONTENIDO_DESCRIPCION", 
			"NUMERO", "DIGITO_VELOCIDAD", "IDENT_NOMBRES", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "GachaneitorSintactico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GachaneitorSintacticoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public List<RecetaContext> receta() {
			return getRuleContexts(RecetaContext.class);
		}
		public RecetaContext receta(int i) {
			return getRuleContext(RecetaContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			receta();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECETA) {
				{
				{
				setState(33);
				receta();
				}
				}
				setState(38);
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

	public static class RecetaContext extends ParserRuleContext {
		public TerminalNode RECETA() { return getToken(GachaneitorSintacticoParser.RECETA, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorSintacticoParser.LLAVE_ABIERTA, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public DescripcionContext descripcion() {
			return getRuleContext(DescripcionContext.class,0);
		}
		public Tiempo_recetaContext tiempo_receta() {
			return getRuleContext(Tiempo_recetaContext.class,0);
		}
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public PasosContext pasos() {
			return getRuleContext(PasosContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorSintacticoParser.LLAVE_CERRADA, 0); }
		public RecetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receta; }
	}

	public final RecetaContext receta() throws RecognitionException {
		RecetaContext _localctx = new RecetaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_receta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(RECETA);
			setState(40);
			match(LLAVE_ABIERTA);
			setState(41);
			nombre();
			setState(42);
			descripcion();
			setState(43);
			tiempo_receta();
			setState(44);
			ingredientes();
			setState(45);
			pasos();
			setState(46);
			match(LLAVE_CERRADA);
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

	public static class NombreContext extends ParserRuleContext {
		public List<TerminalNode> COMILLA() { return getTokens(GachaneitorSintacticoParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(GachaneitorSintacticoParser.COMILLA, i);
		}
		public TerminalNode CADENA() { return getToken(GachaneitorSintacticoParser.CADENA, 0); }
		public TerminalNode NOMBRE() { return getToken(GachaneitorSintacticoParser.NOMBRE, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(48);
				match(NOMBRE);
				}
			}

			setState(51);
			match(COMILLA);
			setState(52);
			match(CADENA);
			setState(53);
			match(COMILLA);
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

	public static class DescripcionContext extends ParserRuleContext {
		public TerminalNode CORCHETE_ABIERTO() { return getToken(GachaneitorSintacticoParser.CORCHETE_ABIERTO, 0); }
		public TerminalNode CADENA() { return getToken(GachaneitorSintacticoParser.CADENA, 0); }
		public TerminalNode CORCHETE_CERRADO() { return getToken(GachaneitorSintacticoParser.CORCHETE_CERRADO, 0); }
		public TerminalNode DESCRIPCION() { return getToken(GachaneitorSintacticoParser.DESCRIPCION, 0); }
		public DescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion; }
	}

	public final DescripcionContext descripcion() throws RecognitionException {
		DescripcionContext _localctx = new DescripcionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descripcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPCION) {
				{
				setState(55);
				match(DESCRIPCION);
				}
			}

			setState(58);
			match(CORCHETE_ABIERTO);
			setState(59);
			match(CADENA);
			setState(60);
			match(CORCHETE_CERRADO);
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

	public static class Tiempo_recetaContext extends ParserRuleContext {
		public TerminalNode TIEMPO() { return getToken(GachaneitorSintacticoParser.TIEMPO, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorSintacticoParser.LLAVE_ABIERTA, 0); }
		public TerminalNode TOTAL() { return getToken(GachaneitorSintacticoParser.TOTAL, 0); }
		public List<TiempoContext> tiempo() {
			return getRuleContexts(TiempoContext.class);
		}
		public TiempoContext tiempo(int i) {
			return getRuleContext(TiempoContext.class,i);
		}
		public TerminalNode PREPARACION() { return getToken(GachaneitorSintacticoParser.PREPARACION, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorSintacticoParser.LLAVE_CERRADA, 0); }
		public Tiempo_recetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempo_receta; }
	}

	public final Tiempo_recetaContext tiempo_receta() throws RecognitionException {
		Tiempo_recetaContext _localctx = new Tiempo_recetaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tiempo_receta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TIEMPO);
			setState(63);
			match(LLAVE_ABIERTA);
			setState(64);
			match(TOTAL);
			setState(65);
			tiempo();
			setState(66);
			match(PREPARACION);
			setState(67);
			tiempo();
			setState(68);
			match(LLAVE_CERRADA);
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

	public static class IngredientesContext extends ParserRuleContext {
		public TerminalNode INGREDIENTES() { return getToken(GachaneitorSintacticoParser.INGREDIENTES, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorSintacticoParser.LLAVE_ABIERTA, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorSintacticoParser.LLAVE_CERRADA, 0); }
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public IngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientes; }
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ingredientes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(INGREDIENTES);
			setState(71);
			match(LLAVE_ABIERTA);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				ingrediente();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT_NOMBRES );
			setState(77);
			match(LLAVE_CERRADA);
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

	public static class IngredienteContext extends ParserRuleContext {
		public TerminalNode IDENT_NOMBRES() { return getToken(GachaneitorSintacticoParser.IDENT_NOMBRES, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(GachaneitorSintacticoParser.DOSPUNTOS, 0); }
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IDENT_NOMBRES);
			setState(80);
			match(DOSPUNTOS);
			setState(81);
			cantidad();
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

	public static class PasosContext extends ParserRuleContext {
		public TerminalNode PASOS() { return getToken(GachaneitorSintacticoParser.PASOS, 0); }
		public TerminalNode CORCHETE_ABIERTO() { return getToken(GachaneitorSintacticoParser.CORCHETE_ABIERTO, 0); }
		public TerminalNode CORCHETE_CERRADO() { return getToken(GachaneitorSintacticoParser.CORCHETE_CERRADO, 0); }
		public List<PasoContext> paso() {
			return getRuleContexts(PasoContext.class);
		}
		public PasoContext paso(int i) {
			return getRuleContext(PasoContext.class,i);
		}
		public PasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasos; }
	}

	public final PasosContext pasos() throws RecognitionException {
		PasosContext _localctx = new PasosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pasos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PASOS);
			setState(84);
			match(CORCHETE_ABIERTO);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				paso();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERBO_MOV) | (1L << VERBO_COC) | (1L << VERBO_PER))) != 0) );
			setState(90);
			match(CORCHETE_CERRADO);
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

	public static class PasoContext extends ParserRuleContext {
		public Paso_movContext paso_mov() {
			return getRuleContext(Paso_movContext.class,0);
		}
		public Paso_cocContext paso_coc() {
			return getRuleContext(Paso_cocContext.class,0);
		}
		public Paso_perContext paso_per() {
			return getRuleContext(Paso_perContext.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paso);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERBO_MOV:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				paso_mov();
				}
				break;
			case VERBO_COC:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				paso_coc();
				}
				break;
			case VERBO_PER:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				paso_per();
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

	public static class Paso_movContext extends ParserRuleContext {
		public TerminalNode VERBO_MOV() { return getToken(GachaneitorSintacticoParser.VERBO_MOV, 0); }
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public TiempoContext tiempo() {
			return getRuleContext(TiempoContext.class,0);
		}
		public VelocidadContext velocidad() {
			return getRuleContext(VelocidadContext.class,0);
		}
		public Paso_movContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_mov; }
	}

	public final Paso_movContext paso_mov() throws RecognitionException {
		Paso_movContext _localctx = new Paso_movContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paso_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(VERBO_MOV);
			setState(98);
			ingredientes();
			setState(99);
			tiempo();
			setState(100);
			velocidad();
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

	public static class Paso_cocContext extends ParserRuleContext {
		public TerminalNode VERBO_COC() { return getToken(GachaneitorSintacticoParser.VERBO_COC, 0); }
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public TiempoContext tiempo() {
			return getRuleContext(TiempoContext.class,0);
		}
		public TemperaturaContext temperatura() {
			return getRuleContext(TemperaturaContext.class,0);
		}
		public Paso_cocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_coc; }
	}

	public final Paso_cocContext paso_coc() throws RecognitionException {
		Paso_cocContext _localctx = new Paso_cocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paso_coc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(VERBO_COC);
			setState(103);
			ingredientes();
			setState(104);
			tiempo();
			setState(105);
			temperatura();
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

	public static class Paso_perContext extends ParserRuleContext {
		public TerminalNode VERBO_PER() { return getToken(GachaneitorSintacticoParser.VERBO_PER, 0); }
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public Paso_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_per; }
	}

	public final Paso_perContext paso_per() throws RecognitionException {
		Paso_perContext _localctx = new Paso_perContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paso_per);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(VERBO_PER);
			setState(108);
			ingredientes();
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

	public static class CantidadContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(GachaneitorSintacticoParser.NUMERO, 0); }
		public TerminalNode UNIDAD_CANTIDAD() { return getToken(GachaneitorSintacticoParser.UNIDAD_CANTIDAD, 0); }
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cantidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(NUMERO);
			setState(111);
			match(UNIDAD_CANTIDAD);
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

	public static class TiempoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(GachaneitorSintacticoParser.NUMERO, 0); }
		public TerminalNode UNIDAD_TIEMPO() { return getToken(GachaneitorSintacticoParser.UNIDAD_TIEMPO, 0); }
		public TiempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempo; }
	}

	public final TiempoContext tiempo() throws RecognitionException {
		TiempoContext _localctx = new TiempoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tiempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(NUMERO);
			setState(114);
			match(UNIDAD_TIEMPO);
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

	public static class TemperaturaContext extends ParserRuleContext {
		public TerminalNode TEMPERATURA() { return getToken(GachaneitorSintacticoParser.TEMPERATURA, 0); }
		public TerminalNode UNIDAD_TEMP() { return getToken(GachaneitorSintacticoParser.UNIDAD_TEMP, 0); }
		public TemperaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temperatura; }
	}

	public final TemperaturaContext temperatura() throws RecognitionException {
		TemperaturaContext _localctx = new TemperaturaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_temperatura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(TEMPERATURA);
			setState(117);
			match(UNIDAD_TEMP);
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

	public static class VelocidadContext extends ParserRuleContext {
		public TerminalNode VELOCIDAD() { return getToken(GachaneitorSintacticoParser.VELOCIDAD, 0); }
		public TerminalNode DIGITO_VELOCIDAD() { return getToken(GachaneitorSintacticoParser.DIGITO_VELOCIDAD, 0); }
		public VelocidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_velocidad; }
	}

	public final VelocidadContext velocidad() throws RecognitionException {
		VelocidadContext _localctx = new VelocidadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_velocidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VELOCIDAD);
			setState(120);
			match(DIGITO_VELOCIDAD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#}\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7\2%\n\2"+
		"\f\2\16\2(\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4\64\n\4\3\4"+
		"\3\4\3\4\3\4\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\6\tY\n\t\r\t\16\tZ\3\t\3\t\3\n\3\n\3\n\5\nb\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\2\2s\2\"\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\b:\3\2\2\2\n@\3"+
		"\2\2\2\fH\3\2\2\2\16Q\3\2\2\2\20U\3\2\2\2\22a\3\2\2\2\24c\3\2\2\2\26h"+
		"\3\2\2\2\30m\3\2\2\2\32p\3\2\2\2\34s\3\2\2\2\36v\3\2\2\2 y\3\2\2\2\"&"+
		"\5\4\3\2#%\5\4\3\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2"+
		"\2(&\3\2\2\2)*\7\3\2\2*+\7\27\2\2+,\5\6\4\2,-\5\b\5\2-.\5\n\6\2./\5\f"+
		"\7\2/\60\5\20\t\2\60\61\7\30\2\2\61\5\3\2\2\2\62\64\7\4\2\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\33\2\2\66\67\7\34\2\2\678\7\33"+
		"\2\28\7\3\2\2\29;\7\5\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\31\2\2=>\7"+
		"\34\2\2>?\7\32\2\2?\t\3\2\2\2@A\7\6\2\2AB\7\27\2\2BC\7\7\2\2CD\5\34\17"+
		"\2DE\7\b\2\2EF\5\34\17\2FG\7\30\2\2G\13\3\2\2\2HI\7\r\2\2IK\7\27\2\2J"+
		"L\5\16\b\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\30\2"+
		"\2P\r\3\2\2\2QR\7!\2\2RS\7\t\2\2ST\5\32\16\2T\17\3\2\2\2UV\7\f\2\2VX\7"+
		"\31\2\2WY\5\22\n\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2"+
		"\\]\7\32\2\2]\21\3\2\2\2^b\5\24\13\2_b\5\26\f\2`b\5\30\r\2a^\3\2\2\2a"+
		"_\3\2\2\2a`\3\2\2\2b\23\3\2\2\2cd\7\23\2\2de\5\f\7\2ef\5\34\17\2fg\5 "+
		"\21\2g\25\3\2\2\2hi\7\24\2\2ij\5\f\7\2jk\5\34\17\2kl\5\36\20\2l\27\3\2"+
		"\2\2mn\7\25\2\2no\5\f\7\2o\31\3\2\2\2pq\7\37\2\2qr\7\20\2\2r\33\3\2\2"+
		"\2st\7\37\2\2tu\7\22\2\2u\35\3\2\2\2vw\7\16\2\2wx\7\21\2\2x\37\3\2\2\2"+
		"yz\7\17\2\2z{\7 \2\2{!\3\2\2\2\b&\63:MZa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}