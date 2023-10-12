package IntroductionLambda;

public class SimpleActionApp {
    public static void main(String[] args) {
        //# Without Lambda Expression
        SimpleAction actionImpl = new SimpleAction() {
            @Override
            public String action() {
                return "Tirza Nadya Wibowo";
            }
        };
        System.out.println(actionImpl.action());

        //# With Lambda Expression
        SimpleAction actionImpl2 = () -> {
           return "Daniel Adi Pratama";
        };
        System.out.println(actionImpl2.action());
    }
}
