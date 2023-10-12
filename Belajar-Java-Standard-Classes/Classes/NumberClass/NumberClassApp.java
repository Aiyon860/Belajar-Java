package NumberClass;

public class NumberClassApp {
    public static void main(String[] args) {
        // ONLY FOR NON-PRIMITIVE TYPE
        /*
         * Integer valueInt = 100;
         * 
         *  Double valueDouble = valueInt.doubleValue();
         *  Long valueLong = valueInt.longValue();
         *  Short valueShort = valueInt.shortValue();
         *
         *  Byte valueByte = valueShort.byteValue();
         *  Float valueFloat = valueByte.floatValue();
         *  Integer valueInteger = valueFloat.intValue();
         */

         // Conversion from String to Number
        String exampleString = "680";
        String exampleString2 = "10ARC"; // cause NumberFormatException because of text/non-number type
        String exampleString3 = "100.10"; // cause NumberFormatException if convert it to Integer type

        // non-primitive or object type
        Integer exampleInt = Integer.valueOf(exampleString);
        System.out.println(exampleInt);

        Float exampleFloat = Float.valueOf(exampleInt);
        System.out.println(exampleFloat);

        Double exampleDouble = Double.valueOf(exampleString);
        System.out.println(exampleDouble);

        // primitive type
        int exInt = Integer.parseInt(exampleString);
        System.out.println(exInt);

        double exDouble = Double.parseDouble(exampleString3);
        System.out.println(exDouble);

        float exFloat = Float.parseFloat(exampleString2);
        System.out.println(exFloat); // error
    }
}
