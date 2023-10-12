package MethodReference;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // static method
        // Predicate<String> names = valueNames -> StringUtil.isItLowerCase(valueNames); 
        Predicate<String> names = StringUtil::isItLowerCase; // this is method reference, the type must same with the method parameter

        System.out.println(names.test("Daniel")); // false
        System.out.println(names.test("tirza")); // true

        // non-static method
    }
}
