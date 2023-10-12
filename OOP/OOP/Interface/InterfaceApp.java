package Interface;

public class InterfaceApp {
    public static void main(String[] args) {
        // Asus laptop
        Asus AsusApp = new Asus(); // ----> applied same with abstract class, so we have to apply polymorphism.
        AsusApp.run();
        System.out.println(AsusApp.laptopCpu());  
        
        // Lenovo Laptop
        Lenovo LenovoApp = new Lenovo();
        LenovoApp.run();
        System.out.println(LenovoApp.isCheap());
    }

}