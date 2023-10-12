package MakingLambda;

public class GraphicCardApp {
    public static void main(String[] args) {
        testGpu();
    }

    public static void testGpu() {
        lambdaGpu();
    }

    public static void lambdaGpu() {
        // with block
        GraphicCard productImpl = (String name) -> {
            return "Nama GPU: " + name;
        };
        System.out.println(productImpl.product("RTX 2060"));

        GraphicCard productImpl2 = (a) -> {
            return "Nama GPU: " + a;
        };
        System.out.println(productImpl2.product("RTX 2070 Super"));

        GraphicCard productImpl3 = nameProduct -> {
            return "Nama GPU: " + nameProduct;
        };
        System.out.println(productImpl3.product("RTX 2080 TI"));

        // without block for 1 line code
        GraphicCard productImpl4 = (String random) -> "Nama GPU: " + random;
        System.out.println(productImpl4.product("GTX 1050 TI"));

        GraphicCard productImpl5 = (name) -> "Nama GPU: " + name;
        System.out.println(productImpl5.product("GTX 1650"));

        GraphicCard productImpl6 = name -> "Nama GPU: " + name;
        System.out.println(productImpl6.product("GTX 1660 Super"));
    }
}
