package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;
// import java.util.Arrays;
import ImmutableList.Person;

public class SortedSetApp {
    public static void main(String[] args) {
        // sorted by ascending (default) and descending (reversed() method)
        System.out.println("SORTED SET FROM COMPARATOR");

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("Daniel"));
        people.add(new Person("Adi"));
        people.add(new Person("Pratama"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // SortedSet<Person> immutableDaniel = Collections.unmodifiableSortedSet(people);
        // for (Person person : immutableDaniel) {
        //     System.out.println(person.getName());
        // }
        
        // var peopleArray = people.toArray();

        // for (int i = 0; i < peopleArray.length; i++) {
        //     System.out.println("Perkenalkan nama saya: " + peopleArray[i]);
        // }

        System.out.println("EMPTY SORTED SET");

        SortedSet<String> empty = Collections.emptySortedSet();
        // empty.add("Error"); // ERROR
        System.out.println(empty);

        System.out.println("MUTABLE TO IMMUTABLE SORTED SET");

        SortedSet<Person> mutable = new TreeSet<>(new PersonComparator().reversed());
        mutable.add(new Person("Tirza"));
        mutable.add(new Person("Nadya"));
        mutable.add(new Person("Wibowo"));

        SortedSet<Person> immutable = Collections.unmodifiableSortedSet(mutable);
        // immutable.add(new Person("Error")); // ERROR
        for (var immutablePrint : immutable) {
            System.out.println(immutablePrint.getName());
        }

        System.out.println("COBA-COBA");

        // System.out.println(immutable.comparator().getClass()); STILL IDK
        System.out.println(immutable.first().getName());
        System.out.println(immutable.last().getName());
        // immutable.subSet(new Person("Tirza"), new Person("Wibowo") ); STILL IDK
        
        var headSet = immutable.headSet(new Person("Tirza"));
        System.out.println(headSet);
    }
}