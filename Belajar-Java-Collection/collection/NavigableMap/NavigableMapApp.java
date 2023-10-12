package NavigableMap;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    static NavigableMap<String, String> orderanMekdi = new TreeMap<>();

    static NavigableMap<String, String> orderanMekdiEmpty = Collections.emptyNavigableMap();

    static NavigableMap<String, String> orderanMekdiImmutable = Collections.unmodifiableNavigableMap(orderanMekdi);

    public static void main(String[] args) {
        testOrderan();
    }

    public static void testOrderan() {
        menambahOrderan();
        mengambilOrderan();

        System.out.println("MEMBAYAR ORDERAN");
        membayarOrderan();

        // orderanMekdiEmpty.put("Test", "Test"); ERROR 
        // orderanMekdiImmutable.put("Test", "Test"); ERROR
    }

    public static void menambahOrderan() {
        orderanMekdi.put("1. Appetizer ", " Chicken Muffin");
        orderanMekdi.put("2. Main Course ", " Ayam Spicy");
        orderanMekdi.put("3. Dessert ", " McFlurry Oreo");
        orderanMekdi.put("4. Beverage ", " Coca-Cola x Strawberry McFloat");
    }

    public static void mengambilOrderan() {
        System.out.println("LIST ORDERAN MCDONALD");
        for (var result : orderanMekdi.entrySet()) {
            System.out.println(result);
        }

        System.out.println("ORDERAN PERTAMA");
        System.out.println(orderanMekdi.firstKey());

        System.out.println("ORDERAN TERAKHIR");
        System.out.println(orderanMekdi.lastKey());

        System.out.println("---------");
        System.out.println(orderanMekdi.lowerKey("3. Dessert "));

        System.out.println("---------");
        System.out.println(orderanMekdi.higherKey("3. Dessert "));

        System.out.println("---------");
        System.out.println(orderanMekdi.floorKey("5. Happy Meal "));

        System.out.println("---------");
        System.out.println(orderanMekdi.ceilingKey("0. Snack "));
    }

    public static void membayarOrderan() {
        for (var buy = orderanMekdi.pollFirstEntry(); buy != null; buy = orderanMekdi.pollFirstEntry()) {
            System.out.println(buy);
        }
        System.out.println("Pembayaran Sukses\n" + "Sisa Orderan: " + orderanMekdi.size());
    }
}
