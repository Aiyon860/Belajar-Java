package ConvertToArray;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayApp {
    static List<String> names = List.of("Daniel", "Adi", "Pratama");
    static List<Integer> togel = List.of(100, 200, 300, 400, 500);
    public static void main(String[] args) {
        testCode();
    }

    public static void testCode() {
        ConvertToArray();
    }

    public static void ConvertToArray() {
        Object[] objectNames = names.toArray();
        Integer[] integerTogel = togel.toArray(new Integer[]{});

        System.out.println(Arrays.toString(objectNames));
        System.out.println(Arrays.toString(integerTogel));
    }
}
