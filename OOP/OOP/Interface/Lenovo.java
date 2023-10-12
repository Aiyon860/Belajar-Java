package Interface;

public class Lenovo implements Laptop {
    public void run() { // from Laptop
        System.out.println("Run Lenovo");
    }

     public int laptopCpu() { // from Laptop
         return 4;
    }

     public String getBrand() { // from LaptopBrand
        return "Thinkpad";
    }

    public boolean isGaming() { // from IsGaming
        return false;
    }

    public boolean isCheap() { // from Laptop
        return true;
    }
}
    



