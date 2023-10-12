

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Daniel");
        employee.sayHello("All");

        employee = new Manager("Eko");
        employee.sayHello("All");

        employee = new VicePresident("Aldi");
        employee.sayHello("All");

        /**
         * or you can make like this: "Employee employee = new Manager/VicePresident()"
         * it will still make the object changes from Employee to Manager or VicePresident
         */

        // method polymorphism
        sayHello(new Employee("Daniel"));
        sayHello(new Manager("Eko"));
        sayHello(new VicePresident("Aldi"));
    }

    // static void sayHello(Employee employee) {
    //     System.out.println("Hello " + employee.name);
    // }

    //  type check and casts, by using instanceof
        static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VicePresident " + vicePresident.name);
        }  

            else if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Hello Manager " + manager.name);
            }

            else {
                System.out.println("Hello Employee " + employee.name);
            }
    }
    
}
