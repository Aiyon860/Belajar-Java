package Map;

import java.util.Map;
import java.util.HashMap;

public class HashMapApp {
    static Map<String, String> identity = new HashMap<>(); 
    public static void main(String[] args) {
        testIdentity();
    }

    public static void testIdentity() {
        addIdentity();
        getIdentity();
    }

    public static void addIdentity() {
        // put is insert and update. i.e if the key is same, then it's update. If the key is different, then it's insert.
        identity.put("personName", "Daniel Adi Pratama");
        // identity.put("personName", "Tirza Nadya Wibowo");
        identity.put("personAddress", "Semarang, Indonesia");
        identity.put("personFavouriteFood", "Cheese Pizza");
    }

    public static void getIdentity() {
        System.out.println(identity.get("personName"));
        System.out.println(identity.get("personAddress"));
        System.out.println(identity.get("personFavouriteFood"));
    }   
}
