package ObjectsClass;

import java.util.Objects;

public class ObjectsApp2 {
    public static void main(String[] args) {
        String data1 = "Daniel Adi Pratama";
        String data2 = "Tirza Nadya Wibowo";
        String data3 = "Tirza Nadya Wibowo";

        // Not using Objects Class
        if (data1 != null) {
            String stringData1 = data1.toString();
            System.out.println(stringData1);
            System.out.println(data1.toString());
        }

        if (data1 != null) {
            int intData1 = data1.hashCode();
            System.out.println(intData1);
        }

        if (data1 != null) {
            Boolean validdata1 = data1.equals(data2);
            System.out.println(validdata1);
        }

        // Using Objects Class (without doing checking manually)
        var toString = Objects.toString(data2);
        System.out.println(toString);

        var hashCode = Objects.hashCode(data2);
        System.out.println(hashCode);

        var equals = Objects.equals(data2, data3);
        System.out.println(equals);
    }
}
