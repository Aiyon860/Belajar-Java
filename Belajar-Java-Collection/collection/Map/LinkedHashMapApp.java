package Map;

import java.util.Set;
import java.util.Map;
// import java.util.HashMap; // the order is random
import java.util.LinkedHashMap; // the order is according to the time when we insert the key and values

public class LinkedHashMapApp {
    static Map<String, Integer> pesanan = new LinkedHashMap<>();
    public static void main(String[] args) {
        testPesanan();
    }

    public static void testPesanan() {
        insertPesanan();
        getPesanan();
    }

    public static void insertPesanan() {
        pesanan.put("Telur", 10);
        pesanan.put("Jajan", 8);
        pesanan.put("Indomie", 6);
    }

    public static void getPesanan() {
        Set<String> pesananKey = pesanan.keySet();
        for (var resultKey : pesananKey) {
            System.out.println(resultKey);
        }

        System.out.println("NAMA DAN JUMLAH BARANG");

        Set<Map.Entry<String, Integer>> pesananKeyAndValue = pesanan.entrySet(); 
        for (var resultKeyAndValue : pesananKeyAndValue) {
            System.out.println(resultKeyAndValue);
        }
    }
}
