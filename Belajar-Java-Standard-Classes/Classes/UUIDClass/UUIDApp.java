package UUIDClass;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        int i;
        for(i=0; i<10; i++) {
            UUID uuid = UUID.randomUUID(); // randomUUID is Byte[]
            String uuidString = uuid.toString();
            System.out.println(uuidString);
        }
    }
}
