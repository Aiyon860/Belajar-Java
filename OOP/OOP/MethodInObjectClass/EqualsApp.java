package MethodInObjectClass;

public class EqualsApp {
    public static void main(String[] args) {
        
        String first = "Daniel";
        first = first + " " + "Pratama";
        System.out.println(first);

        String second = "Daniel Pratama";
        System.out.println(second);

        System.out.println(first == second); // false, because it's checking the object is different or not
        // not the content of the String

        String third = "Daniel Pratama";
        System.out.println(second == third); // true, although the object is different, but the content of the string is same
        // because in memory, java doesn't make again the String data when the content of the String is same (Optimization memory).
        // so that it refer to the object that has been exist before.
    }
    
}
