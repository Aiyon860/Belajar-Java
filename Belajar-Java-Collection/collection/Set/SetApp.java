package Set;

import java.util.Set;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetApp {
    public static void main(String[] args) {
        // HashSet (in unordered way)
        Set<String> names = new HashSet<>();
        names.add("Daniel");
        names.add("Adi");
        names.add("Pratama");
        names.add("Daniel");
        names.add("Adi");
        names.add("Pratama");

        for (int i = 0; i < names.size(); i++) {
            for (var name : names) {
                System.out.println(i + ". " + name);
            }    
        }

        // LinkedHashSet (in ordered way)
        Set<String> gf = new LinkedHashSet<>();
        gf.add("Tirza");
        gf.add("Nadya");
        gf.add("Wibowo");

        for (int i = 0; i < gf.size(); i++) {
            for (var gfName : gf) {
                System.out.println(i + ". " + gfName);       
            }
        }

        // Enum set
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        // Set<Gender> genders = EnumSet.of(Gender.Male, Gender.Female, Gender.Female);
        for (var gender : genders) {
            System.out.println(gender);
        }

        // or
        Gender[] values = Gender.values();
        System.out.println(values.toString());
    }

    public static enum Gender {
        Male, Female, Not_Identified
    }
}
