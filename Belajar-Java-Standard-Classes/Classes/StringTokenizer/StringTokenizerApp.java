package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Daniel Adi Pratama";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

        String names = "Tirza-Nadya-Wibowo";
        StringTokenizer tokens = new StringTokenizer(names, "-");

        while (tokens.hasMoreTokens()) {
            String results = tokens.nextToken();
            System.out.println(results);
        }

        // not recommended using split because it can comsume big memory from processing all at once
        names.split("-");
    }
}
