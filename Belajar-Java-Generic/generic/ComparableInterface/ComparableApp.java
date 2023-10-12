package generic.ComparableInterface;

import java.util.*;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Daniel", "Indonesia"),
            new Person("Tirza", "Indonesia"),
            new Person("Budi", "Indonesia")
        };

        Arrays.sort(people); // sorting according to Alphabet

        System.out.println(Arrays.toString(people));
    }
}
