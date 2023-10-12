package SpliteratorInterface;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorInterfaceApp {
    // unmodifiable list
    static List<Integer> togel = List.of(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);

    public static void main(String[] args) {
        testTogel();
    }

    public static void testTogel() {
        splitTogel();
    }

    public static void splitTogel() {
        Spliterator<Integer> splitTogel1 = togel.spliterator();
        System.out.println(splitTogel1.estimateSize());

        Spliterator<Integer> splitTogel2 = splitTogel1.trySplit();
        System.out.println(splitTogel2.estimateSize());
        
        Spliterator<Integer> splitTogel3 = splitTogel2.trySplit();
        System.out.println(splitTogel3.estimateSize());

        Spliterator<Integer> splitTogel4 = splitTogel3.trySplit();
        System.out.println(splitTogel4.estimateSize());

        // Spliterator<Integer> splitTogel5 = splitTogel4.trySplit();
        // System.out.println(splitTogel5.estimateSize()); ERROR, because the data cannot split again

        //# 600, 700, 800, 900, 1000
        splitTogel1.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer nomor) {
                System.out.println(nomor);
            }
        });

        //# 300, 400, 500
        splitTogel2.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer nomor) {
                System.out.println(nomor);
            }
        });

        //# 200
        splitTogel3.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer nomor) {
                System.out.println(nomor);
            }
        });

        //# 100
        splitTogel4.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer nomor) {
                System.out.println(nomor);
            }
        });    
    }
}
