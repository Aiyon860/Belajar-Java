package JavaUtilFunction;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        Cashier kasir = new Cashier();
        kasir.priceInsert.accept(10); // overwritten to 10.0 (because 'double' format)
        System.out.println(kasir.priceCheck.test(10));
    }
}
