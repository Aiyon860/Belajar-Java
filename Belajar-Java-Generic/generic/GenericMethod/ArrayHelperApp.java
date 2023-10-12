package generic.GenericMethod;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Daniel", "Adi Pratama", "Tirza", "Nadya Wibowo"};
        Integer[] numbers = {1, 10, 100, 1000, 10000};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers)); // don't have to put the generic parameter type (e.g. <Integer>)
    }
}
