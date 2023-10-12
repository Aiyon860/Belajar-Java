public class InsertionSort {
    public static void main(String[] args) {
        int A[] = {60, 50, 40, 30, 20};
        
        for (int j = 1; j < A.length; j++) {
            var key = A[j]; 
            var i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}