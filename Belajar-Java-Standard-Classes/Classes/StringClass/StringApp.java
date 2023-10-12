package StringClass;

public class StringApp {
    public static void main(String[] args) {
        String name = "Daniel Adi Pratama";
        String lowerName = name.toLowerCase();
        String upperName = name.toUpperCase();
        int lengthName = name.length();

        System.out.println(lowerName);
        System.out.println(upperName);

        System.out.println(lengthName); // same as below
        System.out.println(name.length());

        // starts with
        System.out.println(name.startsWith("Daniel"));

        // ends with
        System.out.println(name.endsWith("pratama"));

        // split the string
        String[] splitName = name.split(" ");
        for (String value : splitName) {
            System.out.println(value);
        }

        // isBlank()
        System.out.println(" ".isBlank());

        // isEmpty()
        System.out.println("".isEmpty());

        // charAt()
        System.out.println(name.charAt(0)); 
    }
}
