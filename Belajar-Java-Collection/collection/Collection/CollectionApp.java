package Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //# add
        collection.add("Daniel");
        collection.add("Adi");
        collection.add("Pratama");
        collection.addAll(Arrays.asList("Tirza", "Nadya", "Wibowo"));
        
        //# check
        var check = collection.contains("Daniel");
        System.out.println(check);

        var checkAll = collection.containsAll(Arrays.asList("Pratama", "Wibowo"));
        System.out.println(checkAll);

        //# remove
        collection.remove("Adi");
        collection.removeAll(Arrays.asList("Pratama", "Wibowo", "Nadya"));

        //# check
        var checkAfterRemove = collection.contains("Daniel");
        System.out.println(checkAfterRemove);

        var checkAllAfterRemove = collection.containsAll(List.of("Pratama", "Wibowo")); // can use 'List.of' too
        System.out.println(checkAllAfterRemove);

        // for (var names : collection) {
        //     System.out.println(names);
        // }
        
        //# size
        var sizeCollection = collection.size();
        System.out.println(sizeCollection);
    }
}
