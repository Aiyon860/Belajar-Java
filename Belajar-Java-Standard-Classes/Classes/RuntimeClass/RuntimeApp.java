package RuntimeClass;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());

        // memory in JVM
        System.out.println(runtime.totalMemory());

        System.out.println("Jumlah Free Memory di JVM:" + Runtime.getRuntime().freeMemory());

        System.out.println(Runtime.getRuntime().maxMemory());

        runtime.exit(1);

        //!Deprecated
        // exec()
        // coba-coba ngeexcute file dari code
        // try {
        //     Runtime rt = Runtime.getRuntime();
        //     Process process = rt.exec("E:/GPU-Z/GPU-Z.exe");
        //     int eV = process.exitValue();
        //     System.out.println("Opened the Application." + eV);
        // }

        // catch(Exception e) {
        //     e.printStackTrace();
        // }



    }
}
