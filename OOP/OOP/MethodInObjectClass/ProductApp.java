package MethodInObjectClass;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Victus", 10_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);
        // System.out.println(product.toString()); ---> work the same when we not put the toString(), because that's the default

        Product product2 = new Product("Victus", 10_000_000);

        System.out.println(product.equals(product2)); // will result false when equals method didn't got override, vice versa
        System.out.println(product.hashCode() == product2.hashCode()); // results true
    }
}
