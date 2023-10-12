package generic.ComparatorInterface;

import java.util.*;
import generic.ComparableInterface.*;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Daniel", "Indonesia"),
            new Person("Tirza", "Canada"),
            new Person("Budi", "Thailand")
        };

        // make Anonymous Class
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }  
}
