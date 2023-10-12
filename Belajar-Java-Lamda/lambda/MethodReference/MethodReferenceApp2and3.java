package MethodReference;

import java.util.function.Predicate;

public class MethodReferenceApp2and3 {
    public static void main(String[] args) {
        // MethodReferenceApp2 test = new MethodReferenceApp2();
        // test.run(); this is works
         
        new MethodReferenceApp2and3().run(); // this is also works
    }

    // public void run() {
    //     Predicate<String> names2 = new Predicate<>() {
    //         @Override
    //         public boolean test(String value2) {
    //             return MethodReferenceApp2.this.isItLowerCase(value2);
    //         }      
    //     };
    // }

    // non-static method
    public void run() {
        //`Predicate<String> names2 = value2 -> MethodReferenceApp2.this.isItLowerCase(value2); // convert into lambda
        Predicate<String> names = this::isItLowerCase; // if you want, you can convert into method reference

        System.out.println(names.test("Daniel"));
        System.out.println(names.test("tirza"));
    }

    public void run2() {
        // Predicate<String> names2 = new MethodReferenceApp2()::isItLowerCase; // method reference object or this below

        MethodReferenceApp2and3 test2 = new MethodReferenceApp2and3();
        Predicate<String> names2 = test2::isItLowerCase; 

        System.out.println(names2.test("Daniel"));
        System.out.println(names2.test("tirza"));
    }
        
    public boolean isItLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
