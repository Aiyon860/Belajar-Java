package TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadmeApp {
    public static void main(String[] args) {

        /*
         * manually close the resource
         */

        // BufferedReader reader = null;

        // try {
        //     reader = new BufferedReader(
        //         new FileReader("OOP/TryWithResource/README.md")
        //         );
            
        //     while (true) {
        //         String line = reader.readLine();
        //         if (line == null) {
        //             break;
        //         }
        //         System.out.println(line);
        //     }
        // }

        // catch (Throwable throwable) {
        //     System.out.println("Cannot read the file " + throwable.getMessage());
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //             System.out.println("Success in Closing the Resource");
        //         }

        //         catch (IOException throwable) {
        //             System.out.println("Cannot Closing the file " + throwable.getMessage());
        //         }
        //     }
        // }

        /* 
         * Try with Resource (Automatically closing the resource in "Try-catch")
         */

        try (BufferedReader reader = new BufferedReader(new FileReader("OOP/TryWithResource/README.md"))) {
            
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }    
        }

        catch (Throwable throwable) {
            System.out.println("Cannot read the file " + throwable.getMessage());
        } 
    }
}