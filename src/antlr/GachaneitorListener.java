// Generated from Gachaneitor.g4 by ANTLR 4.9



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GachaneitorParser}.
 */
public interface GachaneitorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GachaneitorParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GachaneitorParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#receta}.
	 * @param ctx the parse tree
	 */
	void enterReceta(GachaneitorParser.RecetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#receta}.
	 * @param ctx the parse tree
	 */
	void exitReceta(GachaneitorParser.RecetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(GachaneitorParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(GachaneitorParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void enterDescripcion(GachaneitorParser.DescripcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void exitDescripcion(GachaneitorParser.DescripcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#tiempo_receta}.
	 * @param ctx the parse tree
	 */
	void enterTiempo_receta(GachaneitorParser.Tiempo_recetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#tiempo_receta}.
	 * @param ctx the parse tree
	 */
	void exitTiempo_receta(GachaneitorParser.Tiempo_recetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(GachaneitorParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(GachaneitorParser.IngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#ingrediente_lista}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente_lista(GachaneitorParser.Ingrediente_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#ingrediente_lista}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente_lista(GachaneitorParser.Ingrediente_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(GachaneitorParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(GachaneitorParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#pasos}.
	 * @param ctx the parse tree
	 */
	void enterPasos(GachaneitorParser.PasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#pasos}.
	 * @param ctx the parse tree
	 */
	void exitPasos(GachaneitorParser.PasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(GachaneitorParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(GachaneitorParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#paso_mov}.
	 * @param ctx the parse tree
	 */
	void enterPaso_mov(GachaneitorParser.Paso_movContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#paso_mov}.
	 * @param ctx the parse tree
	 */
	void exitPaso_mov(GachaneitorParser.Paso_movContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#paso_coc}.
	 * @param ctx the parse tree
	 */
	void enterPaso_coc(GachaneitorParser.Paso_cocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#paso_coc}.
	 * @param ctx the parse tree
	 */
	void exitPaso_coc(GachaneitorParser.Paso_cocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#paso_per}.
	 * @param ctx the parse tree
	 */
	void enterPaso_per(GachaneitorParser.Paso_perContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#paso_per}.
	 * @param ctx the parse tree
	 */
	void exitPaso_per(GachaneitorParser.Paso_perContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void enterCantidad(GachaneitorParser.CantidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void exitCantidad(GachaneitorParser.CantidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#tiempo}.
	 * @param ctx the parse tree
	 */
	void enterTiempo(GachaneitorParser.TiempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#tiempo}.
	 * @param ctx the parse tree
	 */
	void exitTiempo(GachaneitorParser.TiempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#temperatura}.
	 * @param ctx the parse tree
	 */
	void enterTemperatura(GachaneitorParser.TemperaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#temperatura}.
	 * @param ctx the parse tree
	 */
	void exitTemperatura(GachaneitorParser.TemperaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GachaneitorParser#velocidad}.
	 * @param ctx the parse tree
	 */
	void enterVelocidad(GachaneitorParser.VelocidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GachaneitorParser#velocidad}.
	 * @param ctx the parse tree
	 */
	void exitVelocidad(GachaneitorParser.VelocidadContext ctx);
}