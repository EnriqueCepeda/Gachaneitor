import static org.junit.Assert.*;

import junit.framework.TestCase;
import java_cup.runtime.Symbol;

public class TestSintactica extends TestCase{
	
	parser parser_obj;
	Symbol parse_tree;
	String ruta_carpeta_txt;
	
	@Override
	protected void setUp() {
		System.out.println("Running setUp..");
		parse_tree = null;
		ruta_carpeta_txt = "../../doc/syntax_tests/";
	}
	
	public void test_cantidad_falta_numero() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_cantidad_falta_numero.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("Exception no lanzada");
		} catch (Exception e) {
		}
	}
	
	public void test_dospuntos_omitido() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_dospuntos_ingrediente.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada");
		}
	}
	
	public void test_puntoycoma_omitido() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_puntoycoma_ingredientes.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada");
		}
	}
	
	public void test_falta_guion() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_guion.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada, el programa se debería haber recuperado del error");
		}
	}
	
	public void test_falta_palabra_ingredientes() {
		try {
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_palabra_ingredientes.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada");
		}
	}
	
	public void test_falta_palabra_pasos(){
		try{
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_palabra_pasos.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada");
		}
	}

	public void test_falta_palabra_temperatura(){
		try{
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_palabra_temperatura.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada, el programa se debería haber recuperado del error");
		}
	}

	public void test_falta_palabra_tiempo(){
		try{
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_palabra_tiempo.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada");
		}
	}

	public void test_falta_palabra_velocidad(){
		try{
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_palabra_velocidad.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada, el programa se debería haber recuperado del error");
		}
	}

	public void test_falta_verbo(){
		try{
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_falta_verbo.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
			fail("Exception no lanzada");
		} catch (Exception e) {
		}
	}

	public void test_warnings(){
		try{
			String[] archivo = {ruta_carpeta_txt+"Lenguaje_warnings.txt"};
			parser_obj = new parser(new analex(Main.AbrirLector(archivo)));
			parse_tree = parser_obj.parse();
		} catch (Exception e) {
			fail("Exception lanzada, el programa se debería haber recuperado del error");
		}
	}
	
	@Override
	protected void tearDown() {
		System.out.println("Running tearDown...");
	}

}