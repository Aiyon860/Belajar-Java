package ProjectLambda;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Optional;

public class QueueSystem {
    private Queue<String> antrian = new ArrayDeque<String>(10); 
    
    public void addAntrian(String name) {
        Optional.ofNullable(name).map(value -> antrian.offer(value));
    }

    public void peekAntrian() {
        antrian.forEach(value -> System.out.println(value));
        if (antrian.size() != 0) {
            System.out.println("Jumlah Antrian: " + antrian.size());
        }
    }

    public void removeAntrianCash() {
        antrian.removeIf(value -> value.contains("Cash"));
    }

    public void removeAntrianBank() {
        antrian.removeIf(value -> value.contains("Credit Card"));
        antrian.removeIf(value -> value.contains("Debit Card"));
    }

    public void clearAntrian() {
        if (antrian.size() == 0) {
            System.out.println("Antrian Sudah Habis!");
            System.out.println("Sisa Antrian: " + antrian.size());
            System.out.println("-------------------------------------");
            System.out.println("TERIMA KASIH SUDAH BERBELANJA DI AIYON REFLUX MARKET");
        } else {
            System.out.println("Antrian Belum Habis!");
            System.out.println("Sisa Antrian: " + antrian.size());
        }
    }
}
