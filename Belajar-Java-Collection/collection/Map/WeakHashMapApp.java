package Map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    static Map<Integer, Integer> cache = new WeakHashMap<>();
    public static void main(String[] args) {
        testCache();
    }

    public static void testCache() {
        addDataCache();
        utilGarbageCollection();
        getCache();
        checkDataCache();
    }

    public static void addDataCache() {
        for (int i = 0; i < 1_000_000; i++) {
            cache.put(i, i);
        }
    } 

    // to remove the data that not used / rarely used
    public static void utilGarbageCollection() {
        System.gc();
    }

    public static void getCache() {
        for (int i = 0; i <= 128; i++) {
            System.out.println("Hasil " + cache.get(i));
        }
    }

    public static void checkDataCache() {
        System.out.println(cache.size());
    }
}
