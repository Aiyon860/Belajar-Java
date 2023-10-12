
class Manager extends Employee {

    String company;

    Manager(String name) {
       super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.name = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }

    // void sayHello(String name, String company) {
    //     System.out.println("Hi " + name + ", My Name is Manager " + this.name + " i am from " + this.company);
    // } ----> can't be used because the Employee (parent) doesn't have the company field and 
    // instead override the name parameter by the company parameter

}
