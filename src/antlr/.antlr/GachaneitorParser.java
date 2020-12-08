// Generated from c:\Users\elena\OneDrive - Universidad de Castilla-La Mancha\Universidad\4_primerCuatri\ProcesadoresLenguajes\Gachaneitor\src\antlr\Gachaneitor.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GachaneitorParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_receta = 1, RULE_nombre = 2, RULE_descripcion = 3, 
		RULE_tiempo_receta = 4, RULE_ingredientes = 5, RULE_ingrediente_lista = 6, 
		RULE_ingrediente = 7, RULE_pasos = 8, RULE_paso = 9, RULE_paso_mov = 10, 
		RULE_paso_coc = 11, RULE_paso_per = 12, RULE_cantidad = 13, RULE_tiempo = 14, 
		RULE_temperatura = 15, RULE_velocidad = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "receta", "nombre", "descripcion", "tiempo_receta", "ingredientes", 
			"ingrediente_lista", "ingrediente", "pasos", "paso", "paso_mov", "paso_coc", 
			"paso_per", "cantidad", "tiempo", "temperatura", "velocidad"
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

	@Override
	public String getGrammarFileName() { return "Gachaneitor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GachaneitorParser(TokenStream input) {
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
			setState(34);
			receta();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECETA) {
				{
				{
				setState(35);
				receta();
				}
				}
				setState(40);
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
		public TerminalNode RECETA() { return getToken(GachaneitorParser.RECETA, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorParser.LLAVE_ABIERTA, 0); }
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
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorParser.LLAVE_CERRADA, 0); }
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
			setState(41);
			match(RECETA);
			setState(42);
			match(LLAVE_ABIERTA);
			setState(43);
			nombre();
			setState(44);
			descripcion();
			setState(45);
			tiempo_receta();
			setState(46);
			ingredientes();
			setState(47);
			pasos();
			setState(48);
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
		public List<TerminalNode> COMILLA() { return getTokens(GachaneitorParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(GachaneitorParser.COMILLA, i);
		}
		public TerminalNode IDENT_NOMBRES() { return getToken(GachaneitorParser.IDENT_NOMBRES, 0); }
		public TerminalNode NOMBRE() { return getToken(GachaneitorParser.NOMBRE, 0); }
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(50);
				match(NOMBRE);
				}
			}

			setState(53);
			match(COMILLA);
			setState(54);
			match(IDENT_NOMBRES);
			setState(55);
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
		public TerminalNode CONTENIDO_DESCRIPCION() { return getToken(GachaneitorParser.CONTENIDO_DESCRIPCION, 0); }
		public TerminalNode DESCRIPCION() { return getToken(GachaneitorParser.DESCRIPCION, 0); }
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPCION) {
				{
				setState(57);
				match(DESCRIPCION);
				}
			}

			setState(60);
			match(CONTENIDO_DESCRIPCION);
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
		public TerminalNode TIEMPO() { return getToken(GachaneitorParser.TIEMPO, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorParser.LLAVE_ABIERTA, 0); }
		public TerminalNode TOTAL() { return getToken(GachaneitorParser.TOTAL, 0); }
		public List<TiempoContext> tiempo() {
			return getRuleContexts(TiempoContext.class);
		}
		public TiempoContext tiempo(int i) {
			return getRuleContext(TiempoContext.class,i);
		}
		public TerminalNode PREPARACION() { return getToken(GachaneitorParser.PREPARACION, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorParser.LLAVE_CERRADA, 0); }
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
		public TerminalNode INGREDIENTES() { return getToken(GachaneitorParser.INGREDIENTES, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorParser.LLAVE_ABIERTA, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorParser.LLAVE_CERRADA, 0); }
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(GachaneitorParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(GachaneitorParser.PUNTOYCOMA, i);
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				ingrediente();
				setState(73);
				match(PUNTOYCOMA);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMILLA );
			setState(79);
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

	public static class Ingrediente_listaContext extends ParserRuleContext {
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(GachaneitorParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(GachaneitorParser.PUNTOYCOMA, i);
		}
		public Ingrediente_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente_lista; }
	}

	public final Ingrediente_listaContext ingrediente_lista() throws RecognitionException {
		Ingrediente_listaContext _localctx = new Ingrediente_listaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ingrediente_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			ingrediente();
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				match(PUNTOYCOMA);
				setState(83);
				ingrediente();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PUNTOYCOMA );
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
		public List<TerminalNode> COMILLA() { return getTokens(GachaneitorParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(GachaneitorParser.COMILLA, i);
		}
		public TerminalNode IDENT_NOMBRES() { return getToken(GachaneitorParser.IDENT_NOMBRES, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(GachaneitorParser.DOSPUNTOS, 0); }
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
		enterRule(_localctx, 14, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(COMILLA);
			setState(89);
			match(IDENT_NOMBRES);
			setState(90);
			match(COMILLA);
			setState(91);
			match(DOSPUNTOS);
			setState(92);
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
		public TerminalNode PASOS() { return getToken(GachaneitorParser.PASOS, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorParser.LLAVE_ABIERTA, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorParser.LLAVE_CERRADA, 0); }
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
		enterRule(_localctx, 16, RULE_pasos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PASOS);
			setState(95);
			match(LLAVE_ABIERTA);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				paso();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GUION );
			setState(101);
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
		enterRule(_localctx, 18, RULE_paso);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				paso_mov();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				paso_coc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				paso_per();
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

	public static class Paso_movContext extends ParserRuleContext {
		public TerminalNode GUION() { return getToken(GachaneitorParser.GUION, 0); }
		public TerminalNode VERBO_MOV() { return getToken(GachaneitorParser.VERBO_MOV, 0); }
		public Ingrediente_listaContext ingrediente_lista() {
			return getRuleContext(Ingrediente_listaContext.class,0);
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
		enterRule(_localctx, 20, RULE_paso_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(GUION);
			setState(109);
			match(VERBO_MOV);
			setState(110);
			ingrediente_lista();
			setState(111);
			tiempo();
			setState(112);
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
		public TerminalNode GUION() { return getToken(GachaneitorParser.GUION, 0); }
		public TerminalNode VERBO_COC() { return getToken(GachaneitorParser.VERBO_COC, 0); }
		public Ingrediente_listaContext ingrediente_lista() {
			return getRuleContext(Ingrediente_listaContext.class,0);
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
		enterRule(_localctx, 22, RULE_paso_coc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(GUION);
			setState(115);
			match(VERBO_COC);
			setState(116);
			ingrediente_lista();
			setState(117);
			tiempo();
			setState(118);
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
		public TerminalNode GUION() { return getToken(GachaneitorParser.GUION, 0); }
		public TerminalNode VERBO_PER() { return getToken(GachaneitorParser.VERBO_PER, 0); }
		public Ingrediente_listaContext ingrediente_lista() {
			return getRuleContext(Ingrediente_listaContext.class,0);
		}
		public Paso_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_per; }
	}

	public final Paso_perContext paso_per() throws RecognitionException {
		Paso_perContext _localctx = new Paso_perContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paso_per);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(GUION);
			setState(121);
			match(VERBO_PER);
			setState(122);
			ingrediente_lista();
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
		public TerminalNode NUMERO() { return getToken(GachaneitorParser.NUMERO, 0); }
		public TerminalNode UNIDAD_CANTIDAD() { return getToken(GachaneitorParser.UNIDAD_CANTIDAD, 0); }
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cantidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NUMERO);
			setState(125);
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
		public TerminalNode NUMERO() { return getToken(GachaneitorParser.NUMERO, 0); }
		public TerminalNode UNIDAD_TIEMPO() { return getToken(GachaneitorParser.UNIDAD_TIEMPO, 0); }
		public TiempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempo; }
	}

	public final TiempoContext tiempo() throws RecognitionException {
		TiempoContext _localctx = new TiempoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tiempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NUMERO);
			setState(128);
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
		public TerminalNode TEMPERATURA() { return getToken(GachaneitorParser.TEMPERATURA, 0); }
		public TerminalNode NUMERO() { return getToken(GachaneitorParser.NUMERO, 0); }
		public TerminalNode UNIDAD_TEMP() { return getToken(GachaneitorParser.UNIDAD_TEMP, 0); }
		public TemperaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temperatura; }
	}

	public final TemperaturaContext temperatura() throws RecognitionException {
		TemperaturaContext _localctx = new TemperaturaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_temperatura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TEMPERATURA);
			setState(131);
			match(NUMERO);
			setState(132);
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
		public TerminalNode VELOCIDAD() { return getToken(GachaneitorParser.VELOCIDAD, 0); }
		public TerminalNode DIGITO_VELOCIDAD() { return getToken(GachaneitorParser.DIGITO_VELOCIDAD, 0); }
		public VelocidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_velocidad; }
	}

	public final VelocidadContext velocidad() throws RecognitionException {
		VelocidadContext _localctx = new VelocidadContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_velocidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(VELOCIDAD);
			setState(135);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u008c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\5\4\66\n\4\3\4\3\4\3\4\3\4\3\5\5\5=\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7N\n\7\r\7\16\7O\3\7\3\7\3\b\3\b"+
		"\3\b\6\bW\n\b\r\b\16\bX\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\6\nd\n\n\r"+
		"\n\16\ne\3\n\3\n\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\2\2\u0082\2$\3\2\2\2\4+\3\2\2\2\6\65\3\2\2\2\b<\3"+
		"\2\2\2\n@\3\2\2\2\fH\3\2\2\2\16S\3\2\2\2\20Z\3\2\2\2\22`\3\2\2\2\24l\3"+
		"\2\2\2\26n\3\2\2\2\30t\3\2\2\2\32z\3\2\2\2\34~\3\2\2\2\36\u0081\3\2\2"+
		"\2 \u0084\3\2\2\2\"\u0088\3\2\2\2$(\5\4\3\2%\'\5\4\3\2&%\3\2\2\2\'*\3"+
		"\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\7\3\2\2,-\7\27\2\2-"+
		".\5\6\4\2./\5\b\5\2/\60\5\n\6\2\60\61\5\f\7\2\61\62\5\22\n\2\62\63\7\30"+
		"\2\2\63\5\3\2\2\2\64\66\7\4\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
		"\2\2\678\7\33\2\289\7\36\2\29:\7\33\2\2:\7\3\2\2\2;=\7\5\2\2<;\3\2\2\2"+
		"<=\3\2\2\2=>\3\2\2\2>?\7 \2\2?\t\3\2\2\2@A\7\6\2\2AB\7\27\2\2BC\7\7\2"+
		"\2CD\5\36\20\2DE\7\b\2\2EF\5\36\20\2FG\7\30\2\2G\13\3\2\2\2HI\7\r\2\2"+
		"IM\7\27\2\2JK\5\20\t\2KL\7\n\2\2LN\3\2\2\2MJ\3\2\2\2NO\3\2\2\2OM\3\2\2"+
		"\2OP\3\2\2\2PQ\3\2\2\2QR\7\30\2\2R\r\3\2\2\2SV\5\20\t\2TU\7\n\2\2UW\5"+
		"\20\t\2VT\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2Z[\7\33\2\2"+
		"[\\\7\36\2\2\\]\7\33\2\2]^\7\t\2\2^_\5\34\17\2_\21\3\2\2\2`a\7\f\2\2a"+
		"c\7\27\2\2bd\5\24\13\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2"+
		"\2gh\7\30\2\2h\23\3\2\2\2im\5\26\f\2jm\5\30\r\2km\5\32\16\2li\3\2\2\2"+
		"lj\3\2\2\2lk\3\2\2\2m\25\3\2\2\2no\7\13\2\2op\7\23\2\2pq\5\16\b\2qr\5"+
		"\36\20\2rs\5\"\22\2s\27\3\2\2\2tu\7\13\2\2uv\7\24\2\2vw\5\16\b\2wx\5\36"+
		"\20\2xy\5 \21\2y\31\3\2\2\2z{\7\13\2\2{|\7\25\2\2|}\5\16\b\2}\33\3\2\2"+
		"\2~\177\7\34\2\2\177\u0080\7\20\2\2\u0080\35\3\2\2\2\u0081\u0082\7\34"+
		"\2\2\u0082\u0083\7\22\2\2\u0083\37\3\2\2\2\u0084\u0085\7\16\2\2\u0085"+
		"\u0086\7\34\2\2\u0086\u0087\7\21\2\2\u0087!\3\2\2\2\u0088\u0089\7\17\2"+
		"\2\u0089\u008a\7\35\2\2\u008a#\3\2\2\2\t(\65<OXel";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}