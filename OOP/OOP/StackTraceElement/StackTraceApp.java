package StackTraceElement;

public class StackTraceApp {
    public static void main(String[] args) {
       /* Archive 
        * try {
        *    String[] names = {
        *        "Daniel", "Adi", "Pratama" 
        *    };
        *    System.out.println(names[50]);
        * } catch (Throwable throwable) {
        *    // long way in a Array form
        *    StackTraceElement[] stackTrace = throwable.getStackTrace();
        *
        *    // simple and fastest way
        *    throwable.printStackTrace();
        * } 
        */

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }


    public static void sampleError() {
        try {
            String[] names = {
                "Tirza", "Nadya", "Wibowo"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }   
        
}

