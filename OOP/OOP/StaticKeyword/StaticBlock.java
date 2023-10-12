package StaticKeyword;

public class StaticBlock {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class StaticBlock");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
