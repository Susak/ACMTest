import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by ruslan on 2/3/15.
 */
class TraceMethodVisitor extends MethodVisitor {
    public TraceMethodVisitor(MethodVisitor mv) {
        super(Opcodes.ASM4, mv);
    }

    @Override
    public void visitMaxs(int maxStack, int maxLocals) {
    }

    @Override
    public void visitFieldInsn(int opc, String owner, String name, String desc) {
        System.out.println(opc + " " + owner + " " + name + " " + desc);
    }

    @Override
    public void visitInsn(int i) {
        System.out.println(i + " visitInst");
    }

}
