
public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Daniel");
        manager.sayHello("All");

        var vicepresident = new VicePresident("Eko");
        vicepresident.sayHello("All");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicepresident);
        System.out.println(vicepresident.toString());
    }
    
}
