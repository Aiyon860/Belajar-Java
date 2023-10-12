package ScannerClass;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Umur: ");
        int umur = scanner.nextInt();

        // use \n ... \n to make new line
        System.out.println("Hello " + nama + ", my age is " + umur);
        scanner.close();
    }
}

