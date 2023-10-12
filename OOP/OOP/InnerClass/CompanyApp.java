package InnerClass;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Aiyon Company");

        // Company company2 = new Company();
        // company2.setName("Fake Company");

        // object inner class
        Company.Employee employee = company.new Employee();
        employee.setName("Daniel");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        // --------------------------------------------------------- //
        Company company2 = new Company();
        company2.setName("Sweet Company");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Tirza");
        employee2.setWorldBank("WORLD BANK");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
        System.out.println(employee2.getWorldBank()); // just to test if the super keyword is works or not from inner class
    }                                    
}
