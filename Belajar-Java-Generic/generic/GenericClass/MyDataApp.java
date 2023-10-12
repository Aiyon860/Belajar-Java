package generic.GenericClass;

public class MyDataApp {
    public static void main(String[] args) {
        // must in object type (non-primitive) not primitive type.
        MyData<String> myDataString = new MyData<String>("Daniel");
        MyData<Integer> myDataInteger = new MyData<Integer>(680);
        var myDataBoolean = new MyData<Boolean>(true);

        // don't have to convert to string type
        String stringValue = myDataString.getData(); 
        Integer integerValue = myDataInteger.getData();
        var booleanType = myDataBoolean.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
        System.out.println(booleanType);
    }
}
