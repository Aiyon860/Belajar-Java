package CollectionsClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsApp {
    static List<String> names = new ArrayList<>(10);
    static List<String> namesNew = new ArrayList<>(100);

    public static void main(String[] args) {
        testNames();
    }

    public static void testNames() {
        addNames();
        getNames();
    }

    public static void addNames() {
        names.addAll(Arrays.asList("Daniel", "Adi", "Pratama", "Tirza", "Nadya", "Wibowo"));
        namesNew.addAll(Arrays.asList("Immanuel", "Elfron", "Balelang", "Vincentia", "Lamda", "Gati", "Random"));
    }

    public static void getNames() {
        System.out.println(names);
        
        System.out.println("===============");
        Collections.reverse(names);
        System.out.println(names);

        System.out.println("===============");
        Collections.shuffle(names);
        System.out.println(names);

        System.out.println("===============");
        Collections.swap(names, 0, 3);
        System.out.println(names);

        System.out.println("===============");
        System.out.println(Collections.max(names));

        System.out.println("===============");
        System.out.println(Collections.min(names));

        System.out.println("===============");
        Collections.copy(namesNew, names);
        System.out.println(namesNew);
    }
}
