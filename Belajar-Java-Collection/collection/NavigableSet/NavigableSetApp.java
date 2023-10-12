package NavigableSet;

import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Collections;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Daniel", "Adi", "Pratama", "Tirza", "Nadya", "Wibowo"));

        // for (var name : names) {
        //     System.out.println(name);
        // }

        // NavigableSet<String> descending = names.descendingSet();

        // for (var name : descending) {
        //      System.out.println(name);
        // }

        // //# inclusive: true = included, false = not included
        // NavigableSet<String> headset = names.headSet("Pratama", true);

        // for (var name : headset) {
        //      System.out.println(name);
        // }

        // NavigableSet<String> lastset = names.tailSet("Pratama", false);

        // for (var name : lastset) {
        //      System.out.println(name);
        // }

        //# empty and immutable
        NavigableSet<Double> doubleData = Collections.emptyNavigableSet();
        System.out.println(doubleData);

        NavigableSet<String> namesImmutable = Collections.unmodifiableNavigableSet(names);
        // namesImmutable.add("Error"); ERROR
        for (var test : namesImmutable) {
            System.out.println(test);
        }
    }
}
