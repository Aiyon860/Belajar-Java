package Queue;

import java.util.Queue;
import java.util.StringJoiner;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueApp {
    public static void main(String[] args) {
        System.out.println("ARRAY DEQUE");
        Queue<String> names = new ArrayDeque<>(10);
        // names.offer("Daniel");
        // names.offer("Tirza");
        // names.offer("Nadya");
        // names.offer("Wibowo");

        // var testName = names.contains("Tirza");

        for (int i = 0; i < 15; i++) {
            names.add(String.valueOf(i)); // there is 'grow' operation that extend the Array
        }

        for (String next = names.poll(); next != null; next = names.poll()) {
            // if (next.equals("Tirza")) {
            //     System.out.println(next);
            // } else {
            //     System.out.println("null");
            // }

            System.out.println(next);
        }

        var namesSize = names.size();
        System.out.println(namesSize);

        // ---------------------------------------------------------------- //

        System.out.println("LINKED LIST");
        Queue<Integer> numbers = new LinkedList<>();
        numbers.addAll(Arrays.asList(384734, 3434, 123, 607960, 3439483));

        var nextInteger = numbers.peek();

        if (nextInteger != null) {
            System.out.println(nextInteger);
        }

        for (Integer resultInteger = numbers.poll(); resultInteger != null; resultInteger = numbers.poll()) {
            if (resultInteger.equals(3439483)) {
                System.out.println(resultInteger);
            } else {
                System.out.println("Hasil tidak ditemukan");
            }
        }

        var numbersSize = numbers.size();
        System.out.println(numbersSize);

        // ---------------------------------------------------------------- //

        System.out.println("PRIORITY QUEUE");
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList("Daniel", "Adi", "Pratama", "Tirza", "Nadya", "Wibowo"));

        StringJoiner joiner = new StringJoiner("-", "(", ")");
        for (var namesPriority : priorityQueue) {
            joiner.add(namesPriority);
        }
        System.out.println(joiner.toString());

        for (String stringPriority = priorityQueue.poll(); stringPriority != null; stringPriority = priorityQueue.poll()) {
            System.out.println(stringPriority);
            if (priorityQueue.isEmpty()) {
                System.out.println("Operasi Berhasil!");
            } else {
                System.out.println("Masih ada data di Array");
            }
        }

        var prioritySize = priorityQueue.size();
        System.out.println(prioritySize);
    }
}