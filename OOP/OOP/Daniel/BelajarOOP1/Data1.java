package Daniel.BelajarOOP1;

/**
 * public can be access from anywhere (same or different class, package, subclass, world)
 * protected only in the same package, class, and subclass
 * private can only in the same class
 * default/no modifier can be access in same class and package
 */

public class Data1 {
    public String name;
    public int price;

    public Data1(String name, int price){
        this.name = name;
        this.price = price;
    }

}
