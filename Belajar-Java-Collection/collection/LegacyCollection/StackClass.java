package LegacyCollection;

import java.util.Stack;

public class StackClass {
    static Stack<String> uno = new Stack<>();
    public static void main(String[] args) {
        testUno();
    }

    public static void testUno() {
        addUno();
        getUno();
    }

    public static void addUno() {
        uno.push("Red");
        uno.push("Blue");
        uno.push("Green");
        uno.push("Yellow");
        uno.push("Orange");
    }

    public static void getUno() {
        try {
            for (var result = uno.pop(); result != null; result = uno.pop()) {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
