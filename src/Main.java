import gen.PLexer;
import gen.PParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Main {
    public static void main(String[] args) {
        try {
            PLexer lexer = new PLexer(CharStreams.fromFileName(args[0]));
            PParser parser = new PParser(new CommonTokenStream(lexer));
            System.out.println(parser.program().definitions().relation(0).body());
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
