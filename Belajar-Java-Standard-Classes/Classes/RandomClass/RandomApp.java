package RandomClass;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }

        for (int i = 0; i < 10; i++) {
            Float value = random.nextFloat(1000);
            System.out.println(value);
        }

        // next.... (in format what you want to avchieve)
        // bound => boundary/limit of number you want to generate: aka 1000 -> can't be the number from more than 1000
    }
}
