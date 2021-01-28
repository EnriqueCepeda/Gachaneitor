import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("../../doc/Lenguaje.txt");
        CharStream charStream = new ANTLRInputStream(fis);
        GachaneitorLexer lexer = new GachaneitorLexer(charStream);
        GachaneitorParser parser = new GachaneitorParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.inicio();
        System.out.println(tree.toStringTree(parser));
    }
}