package SystemClass;

public class SystemApp {
    public static void main(String[] args) {
        // to get environment variables
        System.out.println(System.getenv("PATH"));

        System.out.println(System.console());

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());  

        // get java garbage collection
        System.gc();

        System.out.println("HI");

        System.exit(0);

        // cannot be print out, because it shut down the running JVM
        System.out.println("HI");
    }
}
