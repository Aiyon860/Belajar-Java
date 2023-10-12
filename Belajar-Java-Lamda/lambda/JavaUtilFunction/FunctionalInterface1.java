package JavaUtilFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Consumer<String> pelangganConsumer = name -> System.out.println("Nama Pelanggan: " + name);
        pelangganConsumer.accept("Daniel");

        // input = String, output/return = Integer
        Function<String, Integer> namaPelanggan = nameValue -> nameValue.length();
        System.out.println("Jumlah Huruf: " + namaPelanggan.apply("Tirza"));

        // input = Double, output/return = boolean
        Predicate<Double> angkaTogel = numberDouble -> {
            if (numberDouble.isNaN()) {
                return false;
            }
            return true;
        };
        System.out.println(angkaTogel.test(0.0000));

        Predicate<String> makanan = namaMakanan -> {
            if (namaMakanan.isEmpty()) {
                return true;
            } else if (namaMakanan.isBlank()) {
                return true;
            }
            return false;
        };
        System.out.println(makanan.test(""));
        System.out.println(makanan.test(" "));          
        System.out.println(makanan.test("Daniel and Tirza"));

        // input = output (in this case is S)
        Supplier<String> purwoyosoSiCepat = new Supplier<String>() {
            @Override
            public String get() {
                return "Daniel";
            }          
        };
        System.out.println(purwoyosoSiCepat.get());
    }
}
