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
		COMILLA=23, NUMERO=24, DIGITO_VELOCIDAD=25, IDENT_NOMBRE=26, CADENA=27, 
		TILDES=28, CONTENIDO_DESCRIPCION=29, CORCHETE_ABIERTO=30, CORCHETE_CERRADO=31, 
		COMMENT=32, WS=33;
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
			while (_la==RECETA || _la==LLAVE_ABIERTA) {
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
		public TerminalNode RECETA() { return getToken(GachaneitorParser.RECETA, 0); }
		public RecetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receta; }
	}

	public final RecetaContext receta() throws RecognitionException {
		RecetaContext _localctx = new RecetaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_receta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECETA) {
				{
				setState(41);
				match(RECETA);
				}
			}

			setState(44);
			match(LLAVE_ABIERTA);
			setState(45);
			nombre();
			setState(46);
			descripcion();
			setState(47);
			tiempo_receta();
			setState(48);
			ingredientes();
			setState(49);
			pasos();
			setState(50);
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
		public TerminalNode IDENT_NOMBRE() { return getToken(GachaneitorParser.IDENT_NOMBRE, 0); }
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(52);
				match(NOMBRE);
				}
			}

			setState(55);
			match(COMILLA);
			setState(56);
			match(IDENT_NOMBRE);
			setState(57);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPCION) {
				{
				setState(59);
				match(DESCRIPCION);
				}
			}

			setState(62);
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
		public TerminalNode TIEMPO() { return getToken(GachaneitorParser.TIEMPO, 0); }
		public Tiempo_recetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempo_receta; }
	}

	public final Tiempo_recetaContext tiempo_receta() throws RecognitionException {
		Tiempo_recetaContext _localctx = new Tiempo_recetaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tiempo_receta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIEMPO) {
				{
				setState(64);
				match(TIEMPO);
				}
			}

			setState(67);
			match(LLAVE_ABIERTA);
			setState(68);
			match(TOTAL);
			setState(69);
			tiempo();
			setState(70);
			match(PREPARACION);
			setState(71);
			tiempo();
			setState(72);
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
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorParser.LLAVE_ABIERTA, 0); }
		public Ingrediente_listaContext ingrediente_lista() {
			return getRuleContext(Ingrediente_listaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorParser.LLAVE_CERRADA, 0); }
		public TerminalNode INGREDIENTES() { return getToken(GachaneitorParser.INGREDIENTES, 0); }
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INGREDIENTES) {
				{
				setState(74);
				match(INGREDIENTES);
				}
			}

			setState(77);
			match(LLAVE_ABIERTA);
			setState(78);
			ingrediente_lista();
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				ingrediente();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOYCOMA) {
					{
					setState(82);
					match(PUNTOYCOMA);
					}
				}

				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMILLA );
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
		public TerminalNode IDENT_NOMBRE() { return getToken(GachaneitorParser.IDENT_NOMBRE, 0); }
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(GachaneitorParser.DOSPUNTOS, 0); }
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ingrediente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(COMILLA);
			setState(90);
			match(IDENT_NOMBRE);
			setState(91);
			match(COMILLA);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOSPUNTOS) {
				{
				setState(92);
				match(DOSPUNTOS);
				}
			}

			setState(95);
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
		public TerminalNode LLAVE_ABIERTA() { return getToken(GachaneitorParser.LLAVE_ABIERTA, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(GachaneitorParser.LLAVE_CERRADA, 0); }
		public TerminalNode PASOS() { return getToken(GachaneitorParser.PASOS, 0); }
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASOS) {
				{
				setState(97);
				match(PASOS);
				}
			}

			setState(100);
			match(LLAVE_ABIERTA);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				paso();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GUION );
			setState(106);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				paso_mov();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				paso_coc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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
			setState(113);
			match(GUION);
			setState(114);
			match(VERBO_MOV);
			setState(115);
			ingrediente_lista();
			setState(116);
			tiempo();
			setState(117);
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
			setState(119);
			match(GUION);
			setState(120);
			match(VERBO_COC);
			setState(121);
			ingrediente_lista();
			setState(122);
			tiempo();
			setState(123);
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
			setState(125);
			match(GUION);
			setState(126);
			match(VERBO_PER);
			setState(127);
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
			setState(129);
			match(NUMERO);
			setState(130);
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
			setState(132);
			match(NUMERO);
			setState(133);
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
			setState(135);
			match(TEMPERATURA);
			setState(136);
			match(NUMERO);
			setState(137);
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
			setState(139);
			match(VELOCIDAD);
			setState(140);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\5\5\5?\n\5\3\5\3\5\3\6\5\6D\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\3\b\3\b\5"+
		"\bV\n\b\6\bX\n\b\r\b\16\bY\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\n\5\ne\n"+
		"\n\3\n\3\n\6\ni\n\n\r\n\16\nj\3\n\3\n\3\13\3\13\3\13\5\13r\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u008c\2$\3\2\2\2\4,\3"+
		"\2\2\2\6\67\3\2\2\2\b>\3\2\2\2\nC\3\2\2\2\fM\3\2\2\2\16W\3\2\2\2\20[\3"+
		"\2\2\2\22d\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30y\3\2\2\2\32\177\3\2\2\2"+
		"\34\u0083\3\2\2\2\36\u0086\3\2\2\2 \u0089\3\2\2\2\"\u008d\3\2\2\2$(\5"+
		"\4\3\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2"+
		"*(\3\2\2\2+-\7\3\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\27\2\2/\60\5\6"+
		"\4\2\60\61\5\b\5\2\61\62\5\n\6\2\62\63\5\f\7\2\63\64\5\22\n\2\64\65\7"+
		"\30\2\2\65\5\3\2\2\2\668\7\4\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29"+
		":\7\31\2\2:;\7\34\2\2;<\7\31\2\2<\7\3\2\2\2=?\7\5\2\2>=\3\2\2\2>?\3\2"+
		"\2\2?@\3\2\2\2@A\7\37\2\2A\t\3\2\2\2BD\7\6\2\2CB\3\2\2\2CD\3\2\2\2DE\3"+
		"\2\2\2EF\7\27\2\2FG\7\7\2\2GH\5\36\20\2HI\7\b\2\2IJ\5\36\20\2JK\7\30\2"+
		"\2K\13\3\2\2\2LN\7\r\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\27\2\2PQ\5"+
		"\16\b\2QR\7\30\2\2R\r\3\2\2\2SU\5\20\t\2TV\7\n\2\2UT\3\2\2\2UV\3\2\2\2"+
		"VX\3\2\2\2WS\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\17\3\2\2\2[\\\7\31"+
		"\2\2\\]\7\34\2\2]_\7\31\2\2^`\7\t\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab"+
		"\5\34\17\2b\21\3\2\2\2ce\7\f\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7\27"+
		"\2\2gi\5\24\13\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7"+
		"\30\2\2m\23\3\2\2\2nr\5\26\f\2or\5\30\r\2pr\5\32\16\2qn\3\2\2\2qo\3\2"+
		"\2\2qp\3\2\2\2r\25\3\2\2\2st\7\13\2\2tu\7\23\2\2uv\5\16\b\2vw\5\36\20"+
		"\2wx\5\"\22\2x\27\3\2\2\2yz\7\13\2\2z{\7\24\2\2{|\5\16\b\2|}\5\36\20\2"+
		"}~\5 \21\2~\31\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\7\25\2\2\u0081\u0082"+
		"\5\16\b\2\u0082\33\3\2\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7\20\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\7\32\2\2\u0087\u0088\7\22\2\2\u0088\37\3\2\2\2"+
		"\u0089\u008a\7\16\2\2\u008a\u008b\7\32\2\2\u008b\u008c\7\21\2\2\u008c"+
		"!\3\2\2\2\u008d\u008e\7\17\2\2\u008e\u008f\7\33\2\2\u008f#\3\2\2\2\16"+
		"(,\67>CMUY_djq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}