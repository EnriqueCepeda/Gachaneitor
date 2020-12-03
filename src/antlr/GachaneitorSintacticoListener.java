// Generated from GachaneitorSintactico.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GachaneitorSintacticoParser}.
 */
public interface GachaneitorSintacticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GachaneitorSintacticoParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GachaneitorSintacticoParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#receta}.
	 * @param ctx the parse tree
	 */
	void enterReceta(GachaneitorSintacticoParser.RecetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#receta}.
	 * @param ctx the parse tree
	 */
	void exitReceta(GachaneitorSintacticoParser.RecetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(GachaneitorSintacticoParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(GachaneitorSintacticoParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void enterDescripcion(GachaneitorSintacticoParser.DescripcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void exitDescripcion(GachaneitorSintacticoParser.DescripcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#tiempo_receta}.
	 * @param ctx the parse tree
	 */
	void enterTiempo_receta(GachaneitorSintacticoParser.Tiempo_recetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#tiempo_receta}.
	 * @param ctx the parse tree
	 */
	void exitTiempo_receta(GachaneitorSintacticoParser.Tiempo_recetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(GachaneitorSintacticoParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(GachaneitorSintacticoParser.IngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(GachaneitorSintacticoParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(GachaneitorSintacticoParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#pasos}.
	 * @param ctx the parse tree
	 */
	void enterPasos(GachaneitorSintacticoParser.PasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#pasos}.
	 * @param ctx the parse tree
	 */
	void exitPasos(GachaneitorSintacticoParser.PasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(GachaneitorSintacticoParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(GachaneitorSintacticoParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#paso_mov}.
	 * @param ctx the parse tree
	 */
	void enterPaso_mov(GachaneitorSintacticoParser.Paso_movContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#paso_mov}.
	 * @param ctx the parse tree
	 */
	void exitPaso_mov(GachaneitorSintacticoParser.Paso_movContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#paso_coc}.
	 * @param ctx the parse tree
	 */
	void enterPaso_coc(GachaneitorSintacticoParser.Paso_cocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#paso_coc}.
	 * @param ctx the parse tree
	 */
	void exitPaso_coc(GachaneitorSintacticoParser.Paso_cocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#paso_per}.
	 * @param ctx the parse tree
	 */
	void enterPaso_per(GachaneitorSintacticoParser.Paso_perContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#paso_per}.
	 * @param ctx the parse tree
	 */
	void exitPaso_per(GachaneitorSintacticoParser.Paso_perContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void enterCantidad(GachaneitorSintacticoParser.CantidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void exitCantidad(GachaneitorSintacticoParser.CantidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#tiempo}.
	 * @param ctx the parse tree
	 */
	void enterTiempo(GachaneitorSintacticoParser.TiempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#tiempo}.
	 * @param ctx the parse tree
	 */
	void exitTiempo(GachaneitorSintacticoParser.TiempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#temperatura}.
	 * @param ctx the parse tree
	 */
	void enterTemperatura(GachaneitorSintacticoParser.TemperaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#temperatura}.
	 * @param ctx the parse tree
	 */
	void exitTemperatura(GachaneitorSintacticoParser.TemperaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorSintacticoParser#velocidad}.
	 * @param ctx the parse tree
	 */
	void enterVelocidad(GachaneitorSintacticoParser.VelocidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorSintacticoParser#velocidad}.
	 * @param ctx the parse tree
	 */
	void exitVelocidad(GachaneitorSintacticoParser.VelocidadContext ctx);
}