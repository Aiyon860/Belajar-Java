package PropertiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("Classes/PropertiesClass/application.properties"));

            System.out.println(properties.getProperty("database.location"));
            System.out.println(properties.getProperty("database.port"));

            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            System.out.println(username);
            System.out.println(password);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("File cannot be load");
        }
        
        // space

        try {
            Properties properties2 = new Properties();
            // to add properties data into the file .properties
            properties2.put("author.name", "Daniel Adi Pratama");
            properties2.put("author.alias", "Aiyon");
            properties2.put("author.birthday", "23 February 2005");

            // to make new file .properties and store the data properties into the file .properties
            properties2.store(new FileOutputStream("Classes/PropertiesClass/author.properties"), "Identitas Author");
        }

        catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
