package StringBuffer_Builder;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Daniel");
        builder.append(" ");
        builder.append("Adi");
        builder.append(" ");
        builder.append("Pratama");

        // the parameter here already in String type
        System.out.println(builder);

        // if you want to convert to the String type if you initially make "append" in another type (Ex: int)
        String fullName = builder.toString();
        System.out.println(fullName);

        
    }
}
