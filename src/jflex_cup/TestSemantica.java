import static org.junit.Assert.*;

import junit.framework.TestCase;
import java_cup.runtime.Symbol;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

import org.json.*;

import java.io.IOException;


class Utils {

	static String readFile(String path, Charset encoding) throws IOException{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

}

public class TestSemantica extends TestCase{

	parser parser_obj;
	Symbol parse_tree;
	String ruta_carpeta_txt;
	
	@Override
	protected void setUp() {
		System.out.println("Running setUp..");
		parse_tree = null;
		ruta_carpeta_txt = "../../doc/semantic_tests/";
	}
	
	public void test_tiempo_total_distinto() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_tiempo_total_distinto_parcial.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("TiempoRecetaDistintoException no lanzada");
		} catch (TiempoRecetaDistintoException e) {
		} catch (Exception e) {
			fail("TiempoRecetaDistintoException no lanzada");
		}
	}
	
	public void test_cantidades_superadas(){
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_cantidades_mayores_a_las_declaradas.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("CantidadIngredienteExcedidaException no lanzada");
		} catch (CantidadIngredienteExcedidaException e) {
		} catch (Exception e) {
			fail("CantidadIngredienteExcedidaException no lanzada");
		}
	}
	
	public void test_ingredientes_no_usados() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_ingredientes_no_usados.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("IngredienteNoUsadoException no lanzada");
		} catch (IngredienteNoUsadoException e) {
		} catch (Exception e) {
			fail("IngredienteNoUsadoException no lanzada");
		}
	}
	
	public void test_magnitudes_distintas() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_magnitudes_distintas.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("IngredientesDistintaMagnitudException no lanzada");
		} catch (IngredientesDistintaMagnitudException e) {
		} catch (Exception e) {
			fail("IngredientesDistintaMagnitudException no lanzada");
		}
	}
	
	public void test_uso_magnitudes_distintas() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_unidades_uso_distintas.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("UsoUnidadesDistintasException no lanzada");
		} catch (UsoUnidadesDistintasException e) {
		} catch (Exception e) {
			fail("UsoUnidadesDistintasException no lanzada");
		}
	}
	
	public void test_suma_unidades_masa() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_suma_unidades_masa.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();

			String content = Utils.readFile("./salida.json", StandardCharsets.UTF_8);
			System.out.println(content);
			JSONArray jsonArray = new JSONArray(content);
			JSONObject jsonReceta = jsonArray.getJSONObject(0);
			JSONObject jsonCalabacin = jsonReceta.getJSONObject("ingredientes").getJSONObject("Calabacín");
			int cantidad = jsonCalabacin.getInt("cantidad");
			String unidad = jsonCalabacin.getString("unidad");

			assertEquals(cantidad, 1500);
			assertEquals(unidad, "g");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail("Exception lanzada");
		}
	}
	
	public void test_suma_unidades_tiempo() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_suma_unidades_tiempo.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();

			String content = Utils.readFile("./salida.json", StandardCharsets.UTF_8);
			JSONArray jsonArray = new JSONArray(content);
			JSONObject jsonReceta = jsonArray.getJSONObject(0);
			JSONObject jsonTiempoTotal = jsonReceta.getJSONObject("tiempo").getJSONObject("total");
			int cantidad = jsonTiempoTotal.getInt("cantidad");
			String unidad = jsonTiempoTotal.getString("unidad");

			assertEquals(cantidad, 120);
			assertEquals(unidad, "min");
			
		} catch (Exception e) {
			fail("Exception lanzada");
		}
	}

	@Override
	protected void tearDown() {
		System.out.println("Running tearDown...");
	}

}