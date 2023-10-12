package DefaultMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MapDefaultMethodApp {
    static Map<String, String> pesanan = new HashMap<>();

    public static void printPesanan() {
        System.out.println("Pesanan: \n" + pesanan.toString());
    }

    public static void main(String[] args) {
        testPesanan();
    }

    public static void testPesanan() {
        addPesanan();
        getPesanan8();
    }

    public static void addPesanan() {
        pesanan.put("Chicken", "Ayam Spicy McDonald's with Rice");
        pesanan.put("Beef", "Beef Yakiniku Tamago");
        pesanan.put("Dessert", "McFlurry Matcha with Oreo");
        pesanan.put("Beverage", "Sakura Fizz");
    }

    public static void getPesanan1() {
        printPesanan();
        pesanan.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ": " + value);   
            } 
        });
    }

    public static void getPesanan2() {
        // only applied to the Value
        printPesanan();
        pesanan.replaceAll(new BiFunction<String, String, String>() {
            @Override
            public String apply(String key, String value) {
                return value = "Happy Meal";
            }     
        });
        printPesanan();
    }

    public static void getPesanan3() {
        printPesanan();
        // String test = pesanan.getOrDefault("Dessert", "Sprite X Mango McFloat"); because "Dessert" already mapped, result McFlurry Matcha with Oreo
        String test2 = pesanan.getOrDefault("Dessert 2", "Sprite X Mango McFloat"); // result Sprite X Mango McFloat
        System.out.println("Retrieval Menu: " + test2);
    }

    public static void getPesanan4() {
        printPesanan();
        pesanan.putIfAbsent("Beverage", "Iced Coffee Float"); // not worked, because already mapped
        pesanan.putIfAbsent("McCafe", "Himalayan Tea Frappe"); // works
        System.out.println("Retrieval Manu: " + pesanan);
    }

    public static void getPesanan5() {
        printPesanan();
        pesanan.remove("Beverage");
        pesanan.remove("Beef");
        printPesanan();
    }

    public static void getPesanan6() {
        printPesanan();
        pesanan.replace("Dessert", "McFlurry Matcha with Oreo", "McFlurry with Oreo");
        printPesanan();
    }

    public static void getPesanan7() {
        printPesanan();
        // pesanan.computeIfAbsent("Beverage", v -> "Fanta McFloat"); // doesn't replace the value, because the key is present.
        pesanan.computeIfAbsent("McCafe", v -> "Iced Matcha Latte");
        printPesanan();
    }

    public static void getPesanan8() {
        printPesanan();
        pesanan.computeIfPresent("McCafe", (key, value) -> value = "Choco Frappe"); // doesn't work, because McCafe is not present.
        pesanan.computeIfPresent("Beverage", (key, value) -> value = "Fanta McFloat"); // works, because Beverage is present in the Map
        printPesanan();
    }
}
