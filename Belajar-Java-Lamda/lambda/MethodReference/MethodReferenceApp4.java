package MethodReference;

import java.util.function.Function;

// method reference parameter
public class MethodReferenceApp4 {
    public static void main(String[] args) {
        // left = parameter type, right = return value
        // when we use method from parameter of the lambda, we cannot put parameter on the method. 
        // ex: toUpperCase(), no parameter inside right?

        // Function<String, String> orderMcd = (String value) -> value.toUpperCase(); // lambda expression
        Function<String, String> orderMcd = String::toUpperCase; // method reference parameter, because using parameter

        System.out.println(orderMcd.apply("daniel"));
        System.out.println(orderMcd.apply("tirza"));
    }
}
