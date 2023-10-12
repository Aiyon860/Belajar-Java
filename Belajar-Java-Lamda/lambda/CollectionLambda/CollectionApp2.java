package CollectionLambda;

import java.util.IdentityHashMap;
import java.util.Map;

public class CollectionApp2 {
    private Map<String, String> nvidia = new IdentityHashMap<>();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        CollectionApp2 app = new CollectionApp2();
        app.add();
        app.forEach();
    }

    public void add() {
        nvidia.put("RTX 2000 Series", "2080 Ti");
        nvidia.put("RTX 3000 Series", "3090 Ti");
        nvidia.put("RTX 4000 Series", "4090");
    }

    public void forEach() {
        // for loop
        for (var result : nvidia.entrySet()) {
            System.out.println(result.getKey() + ": " + result.getValue());
        }

        System.out.println(" ");

        // lambda
        nvidia.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
