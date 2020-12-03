import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        GachaneitorSintacticoLexer lexer = new GachaneitorSintacticoLexer(CharStreams.fromFileName("input/Lenguaje.txt"));
        GachaneitorSintacticoParser parser = new GachaneitorSintacticoParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.inicio();
        System.out.println(tree.toStringTree(parser));
    }
}