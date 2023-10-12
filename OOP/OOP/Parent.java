
class Parent {
    String name;

    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
    String name; // ----> variable hiding, should not duplicate this line of code

    void doIt() {
        System.out.println("Do it in child"); // ----> method overriding
        System.out.println("Parent name is " + super.name);
    }
}
