package generic.Wildcard;

import generic.Constraint.MultipleConstraintApp;
import generic.GenericClass.*;

public class WildcardApp {
    public static void main(String[] args) {
        // use wildcare if you want to only receive the data parameter, not to change or convert the data to other data type
        // without have to declare the data type
        print(new MyData<String>("Daniel")); // not obligate to put String between < >
        print(new MyData<>(1000));
        print(new MyData<>(true));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        // Object 0 = myData.getData(); --> '?' in Object, don't dare to change it to String or anything else.
        System.out.println(myData.getData());
    }
}
