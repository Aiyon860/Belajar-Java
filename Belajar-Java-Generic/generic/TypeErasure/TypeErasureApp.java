package generic.TypeErasure;

// import generic.GenericClass.*;

public class TypeErasureApp {
    public static void main(String[] args) {
        // MyData myData = new MyData("Daniel"); // in String format

        //# didn't get error because we remove the generic paramter type
        //! can be dangerous, because it doesn't error when it compile, but error on the runtime instead.
        // MyData<Integer> integerMyData = (MyData<Integer>) myData; 
        // Integer integer  = integerMyData.getData();
        // System.out.println(integer); // error on runtime: ClassCastException = cannot convert String to Integer
    }
}
