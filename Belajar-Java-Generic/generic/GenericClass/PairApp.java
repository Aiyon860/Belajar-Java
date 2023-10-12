package generic.GenericClass;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, String> stringString = new Pair<String,String>("Daniel", "Adi Pratama");
        Pair<Integer, Boolean> integerBoolean = new Pair<Integer,Boolean>(1000, false);
        Pair<String, Integer> stringInteger = new Pair<String,Integer>("Tirza", 1);

        String stringValue1 = stringString.getFirst();
        String string2Value2 = stringString.getSecond();

        Integer integerValue1 = integerBoolean.getFirst();
        Boolean booleanValue2 = integerBoolean.getSecond();

        String string3Value1 = stringInteger.getFirst();
        Integer integer2Value2 = stringInteger.getSecond();

        System.out.println(stringValue1);
        System.out.println(string2Value2);

        System.out.println(integerValue1);
        System.out.println(booleanValue2);

        System.out.println(string3Value1);
        System.out.println(integer2Value2);
    }
}
