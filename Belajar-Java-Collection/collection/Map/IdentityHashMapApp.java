package Map;

import java.util.Map;
// import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapApp {
    static Map<String, String> pesanan = new IdentityHashMap<>();

    static String key1 = "pesanan1.first";

    static String namaPesanan1 = "pesanan1";
    static String dot = ".";
    static String pesananFirst1 = "first";

    static String key2 = namaPesanan1 + dot + pesananFirst1;

    public static void main(String[] args) {
        testKey();
    }

    public static void testKey() {
        putKey();
        comparingKey();
        sizeKey();
    }

    public static void putKey() {
        pesanan.put(key1, "Daniel");
        pesanan.put(key2, "Daniel");
    }

    public static void comparingKey() {
        var result1 = key1.equals(key2);
        System.out.println(result1); // true

        var result2 = key1 == key2;
        System.out.println(result2); // false
    }

    public static void sizeKey() {
        System.out.println(pesanan.size());
    }



}
