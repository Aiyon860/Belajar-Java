package EnumClass;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Daniel");
        customer.setHierarchy(Hierarchy.REGULER);

        System.out.println(customer.getName());
        System.out.println(customer.getHierarchy());
        System.out.println(customer.getHierarchy().getDescription());

        // enum to string
        String stringHierarchy = Hierarchy.GOLD.name();
        System.out.println(stringHierarchy);

        // string to enum
        Hierarchy hierarchy = Hierarchy.valueOf(stringHierarchy);
        /* or
        Hierarchy hierarchy = Hierarchy.valueOf("GOLD");
        */ 
        System.out.println(hierarchy);

        // check all options in enum class
        System.out.println("PRINT HIERARCHY");
        /* Hierarchy[] options = Hierarchy.values();
        System.out.println(options); --> not using this, use "for each" instead */
        for (var value : Hierarchy.values()) {
            System.out.println(value);
        }
    }
}