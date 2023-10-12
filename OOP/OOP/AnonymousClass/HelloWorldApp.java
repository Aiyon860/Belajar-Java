package AnonymousClass;

public class HelloWorldApp {
    public static void main(String[] args) {
            HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            };

            public void sayHello(String name) {
                System.out.println("Hello" + name);
            };
        };

         english.sayHello();
         english.sayHello("Daniel");

         HelloWorld indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("Halo");
            };

            public void sayHello(String name) {
                System.out.println("Halo" + name);
            };
         };

         indonesia.sayHello();
         indonesia.sayHello("Tirza");
    }
}
