package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Comparator;

public class SortedMapApp {
    // static SortedMap<String, String> warung = new TreeMap<>();

    static SortedMap<String, String> warung = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1); // descending order
        }
    });

    static SortedMap<String, Integer> pesananEmpty = Collections.emptySortedMap();

    static SortedMap<String, String> warungImmutable = Collections.unmodifiableSortedMap(warung);

    public static void main(String[] args) {
        testWarung();
    }

    public static void testWarung() {
        tambahWarung();
        mengambilWarung();
        // pesananEmpty.put("Nama Empty", 0); ERROR
        // warungImmutable.put("Jenis Error", "Nama Error"); ERROR
    }

    public static void tambahWarung() {
        warung.put("Makanan 1", "Ayam Bakar");
        warung.put("Makanan 2", "Nasi Putih");
        warung.put("Makanan 3", "Daun Singkong");
        warung.put("Minuman 1", "Es Teh");
        warung.put("Minuman 2", "Es Jeruk");
        warung.put("Lain-Lain", "Kerupuk");
    }

    public static void mengambilWarung() {
        System.out.println("ORDERAN");
        for (var orderan : warung.entrySet()) {
            System.out.println(orderan);
        }

        System.out.println("ORDERAN URUTAN PERTAMA: ");
        System.out.println(warung.firstKey());

        System.out.println("ORDERAN URUTAN TERAKHIR: ");
        System.out.println(warung.lastKey());

        // System.out.println("ORDERAN MAKANAN: ");
        // System.out.println(warung.subMap("Makanan 1", "Makanan 2"));

        // System.out.println("ORDERAN MINUMAN: ");
        // System.out.println(warung.subMap("Minuman 1", "Minuman 2"));
    }
}
