package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    static List<Integer> togel = new ArrayList<>(1000);

    static Comparator<Integer> togelReverse = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1); 
        }
    };
    
    public static void main(String[] args) {
        testTogel();
    }

    public static void testTogel() {
        addTogel();
        getTogel(860);
        getTogelReverse(500);
    }

    public static void addTogel() {
        for (Integer nomortogel = 1; nomortogel <= 1000; nomortogel++) {
            togel.add(nomortogel);
        }

       /*  togel.add(100);
        togel.add(50);
        togel.add(25);
        togel.add(5);
        togel.add(1);

        togel.add(1);
        togel.add(5);
        togel.add(25);
        togel.add(50);
        togel.add(100); */
    }

    public static void getTogel(Integer nomor) {
        System.out.println(Collections.binarySearch(togel, nomor));
        // System.out.println(Collections.binarySearch(togel, 50));
    }

    public static void getTogelReverse(Integer nomor) {
        System.out.println(Collections.binarySearch(togel, nomor, togelReverse)); // DK why the result is in negative value
        // System.out.println(Collections.binarySearch(togel, 5, Collections.reverseOrder())); // DK why the result is in negative value
    }
}
