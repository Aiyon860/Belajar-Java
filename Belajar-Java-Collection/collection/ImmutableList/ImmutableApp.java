package ImmutableList;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> empty = Collections.emptyList();
        if (empty.isEmpty()) {
            System.out.println("Array kosong");
        } else {
            System.out.println("Array tidak bisa diisi");
        }

        List<String> one = Collections.singletonList("One");
        if (one.isEmpty()) {
            System.out.println("Array kosong");
        } else {
            System.out.println(one);
        }

        List<String> mutable = new ArrayList<>();
        mutable.addAll(Arrays.asList("Daniel", "Adi", "Pratama"));
        List<String> immutable = Collections.unmodifiableList(mutable);
        // immutable.add("Test"); ERROR
        System.out.println(immutable);

        List<Integer> intElements = List.of(100, 200, 300);
        // intElements.remove(100); ERROR
        System.out.println(intElements);
        System.out.println(intElements.indexOf(300));
    }
}

