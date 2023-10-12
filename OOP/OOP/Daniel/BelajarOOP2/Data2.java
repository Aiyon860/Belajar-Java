package Daniel.BelajarOOP2;

import Daniel.BelajarOOP1.Data1;
// importing all class by using * ---> ex: import Daniel.BelajarOOP1.*:
// import java.lang.*; ---> not necessary because this is auto import

public class Data2 {

    // ex: String name = "Daniel"; ---> this is already auto import from java.lang
    
    public static void main(String[] args) {
        Data1 crispy = new Data1("Pisang Goreng", 1_000);
        System.out.println(crispy.name);
        System.out.println(crispy.price);
    }
    
}
