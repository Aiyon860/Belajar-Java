package generic.Contravariant;

public class ContravariantApp {
    public static void main(String[] args) {
        //# in Contravariant we can substitute supertype (parent) with subtype (child), opposite to Covariant
        //# Contravariant can write and read, but we must be careful in 'read'. Especially if the parent has many childs.

        Contravariant<Object> contravariantObject = new Contravariant<Object>("Tirza");
        contravariantObject.setData(1000); // --> can be dangerous to getData() because *look at line 20*
        
        example(contravariantObject); // "Process Parameter 1000" --> "Tirza" got override by 1000
        
        System.out.println(contravariantObject.getData()); // 1000 got override by "Daniel"
    }

    public static void example(Contravariant<? super String> stringContravariant) {
        // String value = (String) stringContravariant.getData(); --> Error, because can convert from Integer to String which is prohibited in here
        // do this insted
        Object value = stringContravariant.getData(); // because its in Object format
        System.out.println("Process Parameter " + value);

        stringContravariant.setData("Daniel"); // in String format
    }
}

//! the 'set' is fine, but the 'get' is can be dangerous in Contravariant

/*
 * Archieve code
 * Contravariant<? super String> contravariantString = contravariantObject; // works, not error
 * // System.out.println(contravariantString); // still in object format, hashcode format
 */

/*
 * (1)
 * example(contravariantObject); 
 * System.out.println(contravariantObject.getData()); --> 1000 got override by "Daniel"
 */

 /*
 * (2)
 * System.out.println(contravariantObject.getData()); --> 1000 didn't get override by "Daniel"
 * example(contravariantObject); 
 */