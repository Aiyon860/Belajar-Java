package ScannerClass;

// import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class ExampleScanApp {
    public static void main(String[] args) throws Exception {
        // from a string
        try {
            // Get the string
            String name = "Daniel Adi Pratama";
  
            // create a new scanner
            // with the specified String Object
            Scanner scanner = new Scanner(name);
  
            // print the next line of the string
            System.out.println("Scanner: " + scanner.nextLine());
  
            // close the scanner
            scanner.close();
  
            System.out.println("\nScanner Closed.\n");
  
            System.out.println("Trying to use scanner" + " after closing.");
  
            // print the next line of the string
            System.out.println(scanner.nextLine());
        }
  
        catch (Exception e) {
            System.out.println("Exception thrown:\n" + e);
        } 

        //# Scanning character from a file
        try {
            File file = new File("Classes/ScannerClass/note.md");
            Scanner s = new Scanner(file);

            while (s.hasNextLine()) {
                String sResult = s.nextLine();
                System.out.println(sResult);
            }
            s.close();
            System.out.println("Content Scanner is closed");
        }

        catch (Throwable ex) {
            System.out.println("Exception: ");
            ex.printStackTrace();
        } 
    }
}
