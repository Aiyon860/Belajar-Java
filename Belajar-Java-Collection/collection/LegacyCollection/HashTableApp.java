package LegacyCollection;

import java.util.Map;
import java.util.Hashtable;

public class HashTableApp {
    static Map<String, Integer> namaAbsen = new Hashtable<>();
    public static void main(String[] args) {
        testNamaAbsen();
    }

    public static void testNamaAbsen() {
        addNamaAbsen();
        getNamaAbsen();
    }

    public static void addNamaAbsen() {
        namaAbsen.put("Daniel", 10);
        namaAbsen.put("Tirza", 35);
    }

    public static void getNamaAbsen() {
        System.out.println("LIST NAMA DAN ABSEN");
        for (var result : namaAbsen.entrySet()) {
            System.out.println(result.getKey() + " = " + result.getValue());
        }
    }
}
