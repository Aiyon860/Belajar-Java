package DefaultMethod;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.ArrayList;

public class DefaultMethodApp {
    static List<Integer> togel = new ArrayList<>();
    public static void main(String[] args) {
        testNumbers();
    }

    public static void testNumbers() {
        addNumbers();
        getNumber();
    }

    public static void addNumbers() {
        for (Integer nomor = 0; nomor <= 100; nomor++) {
            togel.add(nomor);
        }
    }

    public static void getNumber() {
        // System.out.println(togel);

        togel.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 1;
            }
        });
        System.out.println(togel);

        // for (var result : togel) {
        //     System.out.println(result);
        // }

        togel.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });

        togel.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                // return t % 2 == 1; // remove odd
                return t % 2 == 0; // remove even
            }
        });
        System.out.println(togel);
    }
}
 