package Encapsulation;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        /* to get the data by using the method
        System.out.println(category.getId());
        System.out.println(category.isExpensive()); */

        category.setId("ID");
        category.setId(null);
        // category.id = null; ---? will result null when we print out setId

        System.out.println(category.getId()); // ---> will result ID, not null

        /*
         * but if we change the access modifier to "public" to the field
         * then, the result will be null (and that is dangerous).
         * So, that is the function of getter and setter.
         */
    }
    
}
