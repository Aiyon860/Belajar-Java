package BasicJava;

public class ForEach {
    public static void main(String[] args) {
        String[] arrayRandom = {
            "Daniel", "Adi", "Pratama", 
            "Tirza", "Nadya", "Wibowo"
        };

        // disesuaikan dengan tipe data array nya (bisa juga diganti "var")
        for (String value : arrayRandom) {
            System.out.println(value);
        }
    }
}
