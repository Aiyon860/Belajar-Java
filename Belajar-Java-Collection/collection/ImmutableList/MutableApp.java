package ImmutableList;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Daniel");
        person.addHobby("Coding");
        person.addHobby("Baca Dokumentasi");

        // interfere(person.getHobbies()); ERROR because it's already immutable list

        System.out.println("Pemisah"); // idk lol

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    //# cause UnsupportedOperationException -> try to input data into immutable list
    public static void interfere(List<String> hobbies) {
        hobbies.add("Bukan Hobi");
    }
}
