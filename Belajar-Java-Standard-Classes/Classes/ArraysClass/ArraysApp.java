package ArraysClass;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
            1,4,7,3,5,9,1,0,4,2,13,56,34,89,27,134,676,343
        };

        // Arrays.sort
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //Arrays.toString

        // Arrays.binarySearch
        // // if there is multiple value of said number, the binarySearch will retrieve the last one 
        int array = Arrays.binarySearch(numbers, 4);
        System.out.println(array);

        System.out.println(Arrays.binarySearch(numbers, 676));
        System.out.println(Arrays.binarySearch(numbers, 27));

        // Arrays.copyOf and Arrays.copyOfRange
        int[] array2 = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(array2));

        int[] array3 = Arrays.copyOfRange(numbers, 1, 5);
        System.out.println(Arrays.toString(array3));

        // // fastest way (hehe)
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, 6, 10)));

        // Arrays.equals and Arrays.deepEquals
        int[][] arrayMultiple1 = { {1,0}, {0,1} };
        int[][] arrayMultiple2 = { {1,0}, {0,1} };

        var array4 = Arrays.equals(arrayMultiple1, arrayMultiple2);
        System.out.println(array4); // false

        System.out.println(Arrays.deepEquals(arrayMultiple1, arrayMultiple2)); // true
    }
}
