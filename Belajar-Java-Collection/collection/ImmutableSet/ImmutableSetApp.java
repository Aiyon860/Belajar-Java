package ImmutableSet;

import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        System.out.println(empty);

        Set<String> single = Collections.singleton("Daniel");
        System.out.println(single);

        Set<String> mutable = new LinkedHashSet<>();
        mutable.add("Daniel");
        mutable.add("Adi");
        mutable.add("Pratama");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        System.out.println(immutable);

        Set<String> set = Set.of("Tirza", "Nadya", "Wibowo");
        // set.add("Nadya"); --> ERROR
        System.out.println(set);
    }
}
