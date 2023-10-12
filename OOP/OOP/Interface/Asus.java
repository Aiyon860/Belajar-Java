package Interface;

import Annotation.Fancy;

@Fancy (name = "AsusLaptop")
public class Asus implements Laptop {
    public void run() { // from Laptop
        System.out.println("Run Asus");
    }

    public int laptopCpu() { // from Laptop
        return 6;
    }

    public String getBrand() { // from Rog
        return "ROG";
    }

    public boolean isGaming() {
        return true;
    }

    // don't have to re-declare/override the method isCheap()
    // because it used default keyword and already matched with the category of ROG laptop (in this case)
}
    

