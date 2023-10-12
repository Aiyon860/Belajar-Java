package SortedSet;

import java.util.Comparator;

import ImmutableList.Person;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
        // return o2.getName().compareTo(o1.getName()); can be like this also
    }

}