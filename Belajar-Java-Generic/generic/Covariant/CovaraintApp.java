package generic.Covariant;

public class CovaraintApp {
    public static void main(String[] args) {
        //# in Covariant we can substitute subtype (child) with supertype (parent) unlike Invariant (default)
        //# but in Covariant, it can solely do "read-only" or take the Generic data. Not mean to change the Generic data.

        Covariant<String> covariantString = new Covariant<String>("Daniel");
        example(covariantString);

        Covariant<? extends Object> covariantObject = covariantString;
        System.out.println(covariantObject.getData()); // works, not error 
    }

    public static void example(Covariant<? extends Object> objectCovariant) {
        System.out.println(objectCovariant.getData()); // masih bisa, karena cuma ambil data, result: "Daniel"

        // objectCovariant.setData(1); --> tidak boleh, bisa berbahaya karena bisa mengubah tipe data yang awalnya String jadi Integer (misalnya)
    }
}

//! the 'set' is can be dangerous, but the 'get' is fine in Covariant

