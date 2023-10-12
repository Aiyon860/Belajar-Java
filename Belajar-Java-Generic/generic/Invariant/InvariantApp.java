package generic.Invariant;

public class InvariantApp {
    public static void main(String[] args) {
        //# cannot substitute subtype (child) to supertype (parent) or vice versa in Invariant (default in generic parameter type by Java)
        Invariant<String> invariantString = new Invariant<String>("Daniel");
        // Invariant<Object> invariantObject = invariantString; --> error
        // example(invariantString); --> Error
        // Invariant<Object> objecInvariant = invariantString; --> Error

        Invariant<Object> invariantObject = new Invariant<Object>(100);
        // Invariant<Integer> invariantInteger = invariantObject; --> error
        // exampleInteger(invariantObject); --> Error

        System.out.println(invariantString.getData());
        System.out.println(invariantObject.getData());

    }

    public static void example(Invariant<Object> objecInvariant) {
        // do nothing
    }

    public static void exampleInteger(Invariant<Integer> integeInvariant) {
        // do nothing 
    }

    //! Polymorphism and Inheritance is not same with Generic
}
