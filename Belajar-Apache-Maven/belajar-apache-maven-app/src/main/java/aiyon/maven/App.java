package aiyon.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        Gson gson = new Gson();
        Food makanan = new Food("Kebab");
        Food makanan2 = new Food("Burger");

        // change to json format by using Gson
        String makananJson = gson.toJson(makanan);
        System.out.println(makananJson);
        String makananJson2 = gson.toJson(makanan2);
        System.out.println(makananJson2);
    }
}
