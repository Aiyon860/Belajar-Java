package StaticKeyword.StaticApp;

import StaticKeyword.*;
// * access all of the class (also inside of the class)
import static StaticKeyword.Constant.*;
import static StaticKeyword.StaticBlock.*;

public class Application {
    public static void main(String[] args) {
        // without having to declare the object of the class first
        // using static import so you don't have to put in the class name in front of field class
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // (intended) not using static import so you have to put in the class name in front of the method class
        System.out.println(MathUtil.sum(1,2,3,4,5,6,7,8,9,10));

        // (intended) not using static import so you have to put in the class name in front of the method 
        Country.City city = new Country.City(); // in static, you don't have to make the object of its outer class first
        city.setName("Semarang");
        System.out.println(city.getName());

        // using static import so you don't have to put in the class name in front of the variable 
        System.out.println(PROCESSORS);
    }
}
