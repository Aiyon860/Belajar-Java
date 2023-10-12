package LazyParameter;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        new LazyParameterApp().testScoreNonLazy(60.0, new LazyParameterApp().getName());
        System.out.println(" ");
        new LazyParameterApp().testScoreLazy(60.0, () -> new LazyParameterApp().getName());
    }

    // originally, parameter in java is eager (always get called first in the beginning)
    public void testScoreNonLazy(Double value, String name) {
        if (value >= 80.0) {
            System.out.println("Selamat " + name + ", Anda lulus!");
        } else {
            System.out.println("Maaf anda tidak lulus, coba lagi tahun depan");
        }
    }

    // by using lambda, we can transform the eager behavior into 'lazy'
    // by make it only get executed when it get accessed.
    public void testScoreLazy(Double value, Supplier<String> name) {
        if (value >= 80) {
            System.out.println("Selamat " + name.get() + ", Anda lulus!");
        } else {
            System.out.println("Maaf anda tidak lulus, coba lagi tahun depan");
        }
    }

    public String getName() {
        System.out.println("getName() dipanggil");
        return "Daniel";
    }
}
