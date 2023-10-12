package Deque;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeApp {
    static Deque<String> pesanan = new ArrayDeque<>(10);

    static Deque<String> unoStack = new LinkedList<>();

    public static void main(String[] args) {
        testPesanan();
    }

    public static void testPesanan() {
        System.out.println("ORDER PESANAN");
        menambahPesanan();
        // urutanTidakKebalik();
        mengambilPesananSatu();
    }

    public static void menambahPesanan() {
        pesanan.offerLast("Beras");
        pesanan.offerLast("Nescafe Bubuk");
        pesanan.offerLast("Telur");
        pesanan.offerLast("Sabun");
        pesanan.offerLast("Indomie");
    }

    public static void mengambilPesananSatu() {
        for (var ambilPesanan = pesanan.pollFirst(); ambilPesanan != null; ambilPesanan = pesanan.pollFirst()) {
            System.out.println(ambilPesanan);
            System.out.println("Sisa Pesanan: " + pesanan.size());
        }
        
        if (pesanan.isEmpty()) {
            System.out.println("Mengambil Semua Pesanan Berhasil :)");
        } else {
            System.out.println("Mengambil Semua Pesanan Gagal");
        }
    }

    // masih bingung implementasinya gimana di 'peek'
    public static void urutanTidakKebalik() {
        menambahPesanan();
        for (var mengecekPesanan = pesanan.peek(); mengecekPesanan != null; mengecekPesanan = pesanan.peek()) {
            System.out.println(mengecekPesanan);
        }
    }

    /* public static void mengambilPesananDua() {
        if (pesanan.contains("Beras") == false) {
            System.out.println(ambilPesanan);
        } else {
            System.out.println("Beras tidak dikembalikan");
        }
    } */

    /* ------------------------------------------------------------------- */
    public static void testUnoStack() {
        menambahTumpukan();
        mengecekTumpukan();

        System.out.println("MENGAMBIL TUMPUKAN");

        mengambilTumpukan();
    }

    public static void menambahTumpukan() {
        for (int i = 0; i < 5; i++) {
            unoStack.offerFirst("Tumpukan " + (i + 1));
        }
    }

    public static void mengecekTumpukan() {
        for (var result : unoStack) {
            System.out.println(result);
        }
    }

    public static void mengambilTumpukan() {
        for (String takeStack = unoStack.pollLast(); takeStack != null; takeStack = unoStack.pollLast()) {
            System.out.println(takeStack);
        }
    }
}