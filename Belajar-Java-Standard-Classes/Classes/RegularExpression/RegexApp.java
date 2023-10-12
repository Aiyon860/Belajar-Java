package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Daniel Adi Pratama Aiyon";

        // // pattern for searching the word
        //# pattern 1
        // Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*"); // "*" can be 0 or more than 1 character
        // Matcher matcher = pattern.matcher(name);

        //# pattern 2 (no abc)
        Pattern pattern2 = Pattern.compile("[a-zA-Z]*[abc][a-zA-Z]*");
        Matcher matcher2 = pattern2.matcher(name);

        while (matcher2.find()) { // matcher.find to check if still finding character/words
            String result = matcher2.group(); // matcher.group to take out the data from the String
            System.out.println(result);
        }
    }
}