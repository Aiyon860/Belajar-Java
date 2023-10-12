package CollectionLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CollectionApp {
    List<String> nvidia = new ArrayList<>();
    // List<String> nvidia = List.of("RTX 3060", "RTX 3060 Ti"); could be like this too -> automatically immutable

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        CollectionApp test = new CollectionApp();
        test.add();
        // test.iterate();
        //test.remove();
        test.replace();
        test.sortDesc();
    }

    public void add() {
        nvidia.addAll(Arrays.asList("RTX 3060", "RTX 3060 Ti", "RTX 3070 Ti"));
        Collections.unmodifiableList(nvidia);
    }

    public void iterate() {
        // for each loop
        for (String result : nvidia) {
            System.out.println("1. Nama GPU: " + result);
        }

        // forEach in Collection -> using Anonymous Class
        nvidia.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("2. Nama GPU: " + value);
            }         
        });

        // lambda
        nvidia.forEach(value -> System.out.println("3. Nama GPU: " + value));

            // not recommended using variable for a lambda
            // Consumer<String> accept = value -> System.out.println("Nama GPU" + value);
            // nvidia.forEach(accept);

        // with method reference, a shorthand to print all elements in the list
        nvidia.forEach(System.out::println);  

        // with method reference 2
        Consumer<String> methodReference = new Consumer<String>() {
            @Override
            public void accept(String value2) {
                System.out.println("4. Nama GPU: " + value2);
            }
        };
        nvidia.forEach(methodReference);
        nvidia.forEach(methodReference::accept); // can be like this also
    }

    public void remove() {
        nvidia.removeIf(value -> value.endsWith("Ti"));
        System.out.println(nvidia);

        // for loop (fail) - > because in the middle of the process, it will only omit the second value
        // then the third value shifted into second value position
        // and when it arrive at the third value position, the value is already gone (shifted to second position)
        //
        // for (var result : nvidia) {
        //     if (result.endsWith("Ti")) {
        //         nvidia.remove(result);
        //     }
        // }
        // System.out.println(nvidia);
    }

    public void replace() {
        nvidia.replaceAll(value -> "Nvidia " + value); // if only there is a single statement
        System.out.println(nvidia);
    }

    public void sortDesc() {
        nvidia.sort((value1, value2) -> value2.compareTo(value1));
        System.out.println(nvidia);
    }
}
