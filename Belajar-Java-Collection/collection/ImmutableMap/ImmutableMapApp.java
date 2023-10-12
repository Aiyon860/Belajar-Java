package ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    // langsung immutable dari awal
    static Map<String, Integer> pesananInitialImmutable = Map.of(
        "Beras", 1, 
        "Mie Goreng", 6,
        "Jajan", 5,
        "Bumbu Masak", 5,
        "Sabun", 2 
    );

    // empty map
    static Map<String, Integer> pesananEmpty = Collections.emptyMap();

    // singleton map
    static Map<String, Integer> pesananLimitedEdition = Collections.singletonMap("Oreo Taylor Swift", 1);

    // mutable to immutable map
    static Map<String, Integer> pesananMutable = new HashMap<>(10);

    static Map<String, Integer> pesananImmutable = Collections.unmodifiableMap(pesananMutable);

    public static void main(String[] args) {
       testPesanan();
    }

    public static void menambahPesananMutable() {
        pesananMutable.put("Beras", 1);
        pesananMutable.put("Mie Goreng", 6);
        pesananMutable.put("Jajan", 5);
        pesananMutable.put("Bumbu Masak", 5);
        pesananMutable.put("Sabun", 2);
    }

    public static void mengambilPesananImmutable() {
        for (var hasilPesanan : pesananImmutable.entrySet()) {
            System.out.println(hasilPesanan);
        }
    }
    
    public static void testPesanan() {
        // pesananInitialImmutable.put("Racun Tikus", 1); ERROR
        // pesananEmpty.put("Makanan Kosong", 0); ERROR
        // pesananLimitedEdition.put("Oreo Dims The Meat Guy", 1); ERROR
        // pesananImmutable.put("Telur", 10); ERROR

        menambahPesananMutable();
        mengambilPesananImmutable();
    }
}
