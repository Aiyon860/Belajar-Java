package EntryMap;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class EntryMapApp {
    static Map<String, String> orderanPadang = new HashMap<>();
    public static void main(String[] args) {
        testOrderanPadang();
    }

    public static void testOrderanPadang() {
        menambahOrderanPadang();
        melihatOrderanPadang();
        mengambilOrderanPadang();
    }

    public static void menambahOrderanPadang() {
        orderanPadang.put("Makanan ", " Nasi Putih + Ayam Goreng + Daun Singkong");
        orderanPadang.put("Minuman ", " Es Teh");
        orderanPadang.put("Lain-Lain ", " Kerupuk");
    }

    public static void melihatOrderanPadang() {
        Set<Map.Entry<String, String>> peekOrderanPadang = orderanPadang.entrySet();

        for (var result : peekOrderanPadang) {
            System.out.println("==========");
            System.out.println("Key: " + result.getKey());
            System.out.println("Value:" + result.getValue());
        }
    }

    public static void mengambilOrderanPadang() {
        orderanPadang.clear();
        System.out.println("==========");
        if (orderanPadang.isEmpty()) {
            System.out.println("SUKSES MEMBELI ORDERAN!");
            System.out.println(orderanPadang.size());
        } else {
            System.out.println("GAGAL MEMBELI ORDERAN");
        }
    }
}
