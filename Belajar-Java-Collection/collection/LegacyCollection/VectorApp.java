package LegacyCollection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    static List<String> names = new Vector<>();
    public static void main(String[] args) {
        testNames();
    }

    public static void testNames() {
        addNames();
        getNames();
    }

    public static void addNames() {
        names.add("Tirza");
        names.add("Nadya");
        names.add("Wibowo");
    }

    public static void getNames() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " +  names.get(i));
        }
    }
}
