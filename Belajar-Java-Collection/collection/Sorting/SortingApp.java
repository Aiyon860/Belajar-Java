package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SortingApp {
    static List<String> names = new ArrayList<>();

    static Comparator<String> namesReverse = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        } 
    };

    public static void main(String[] args) {
        testNames();
    }

    public static void testNames() {
        addNames();
        getNames();
        System.out.println("==========");
        getNamesReverse();
    }

    public static void addNames() {
        names.addAll(Arrays.asList("Daniel", "Adi", "Pratama", "Tirza", "Nadya", "Wibowo"));
    }

    public static void getNames() {
        Collections.sort(names);
        for (var result : names) {
            System.out.println(result);
        }
    }

    public static void getNamesReverse() {
        Collections.sort(names, namesReverse);
        for (var resultReverse : names) {
            System.out.println(resultReverse);
        }
    }
}
