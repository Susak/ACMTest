import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ruslan on 2/3/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ClassReader cr = new ClassReader("java.util.concurrent.ConcurrentHashMap");
        PrintWriter printWriter = new PrintWriter(System.out);
        TraceClassVisitor tr = new TraceClassVisitor(printWriter);
        ClassVisitor cv = new ClassPrinter(tr);
        cr.accept(cv, ClassReader.SKIP_DEBUG);
    }
}
