package OptionalClass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        OptionalApp test = new OptionalApp();
        test.sayHello("Daniel");
        // test.sayHelloOp(null); // NullPointerException, if we using sayHello() below
        // test.sayHelloOptionalTwo(null); // print out "DATA TIDAK ADA"
        // test.sayHelloOptionalThree(null); // print out "BUKAN SAYA"
        // test.sayHelloOptionalFour(null); // print out 0L
        test.sayHelloOptionalFive(null); // print out NoSuchElementException error, if we put 'null'
    }

    public void sayHello(String name) {
       System.out.println("HALO " + name.toUpperCase());
    }

    // using Optional
    // using ifPresent() if there is value that present on the Optional
    //
    public void sayHelloOptionalOne(String name) {
        // one line code
        Optional.ofNullable(name).map(value -> value.toUpperCase()).ifPresent(value -> System.out.println("HALO " + value));
        // using method reference
        // Optional.ofNullable(name).map(String::toUpperCase).ifPresent(System.out::println);
        Optional.ofNullable(name).map(String::toUpperCase).ifPresent(value -> System.out.println("HALO " + value));

        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> upperName = optionalName.map(value -> value.toUpperCase());
        // upperName.ifPresent(value -> System.out.println("HALO " + value));
    }

    // but if you want to also print the absence value (null), you can do this
    public void sayHelloOptionalTwo(String name) {
        Optional.ofNullable(name)
            .map(String::toUpperCase)
            // 1st parameter is when the value is present, 2nd parameter is otherwise
            .ifPresentOrElse(
                value -> System.out.println("HALO " + value), 
                () -> System.out.println("DATA TIDAK DIMENGERTI"));
    }

    // but if you want the situation where there is absence of value (null) and then change its value
    // into something, you can do this
    //
    public void sayHelloOptionalThree(String name) {
        String test3 = Optional.ofNullable(name)
            .map(String::toUpperCase)
            .orElse("BUKAN SAYA");

        System.out.println(test3);
    }

    public void sayHelloOptionalFour(Long togel) {
        Long test4 = Optional.ofNullable(togel)
            .map(angka -> angka * 2)
            .orElseGet(() -> 0L);
        
        System.out.println(test4);
    }

    public void sayHelloOptionalFive(Double dollar) {
        Double usa = Optional.ofNullable(dollar).map(value -> value += (2*2)).orElseThrow(() -> new NoSuchElementException("Input tidak dimengerti " + dollar));
        System.out.println("Anda punya uang sebanyak: " + usa);
    }
}
