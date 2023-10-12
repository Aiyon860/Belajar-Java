
public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Daniel";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt(); // ---> still using child method, because we did not access the parent class by uisng Parent() in line above
        System.out.println(parent.name);
    }
     
}
