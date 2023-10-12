package AbstractClass;

public class AbstractClassApp {
    public static void main(String[] args) {
        // var location = new Location(); // ----> Error because of the abstract class
        var city = new City();
        city.name = "Semarang";
        System.out.println(city.name);
        
    }
    
}
