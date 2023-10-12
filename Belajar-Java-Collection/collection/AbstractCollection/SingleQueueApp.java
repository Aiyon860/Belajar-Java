package AbstractCollection;

import java.util.Queue;

public class SingleQueueApp {
    static Queue<String> nama = new SingleQueue<>();
    public static void main(String[] args) {
        testNama();
    }

    public static void testNama() {
        addNama();
        peekNama();
        sizeNama();
        getNama();
        sizeNama();
        getNama();
    }

    public static void addNama() {
        System.out.println(nama.offer("Daniel"));
        System.out.println(nama.offer("Tirza"));
    }

    public static void getNama() {
        System.out.println(nama.poll());
    }
    
    public static void peekNama() {
        System.out.println(nama.peek());
    }

    public static void sizeNama() {
        System.out.println(nama.size());
    }
}
