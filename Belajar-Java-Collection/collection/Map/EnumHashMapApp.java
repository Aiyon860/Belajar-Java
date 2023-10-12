package Map;

import java.util.Map;
import java.util.EnumMap;

public class EnumHashMapApp {
    public static enum Pesanan {
        MAKANAN, MINUMAN, JAJAN, LAIN_LAIN
    }

    static Map<Pesanan, String> pesanan = new EnumMap<>(Pesanan.class);

    public static void main(String[] args) {
        testPesanan();
    }

    public static void testPesanan() {
        insertPesanan();
        getPesanan();
        // requsitePesanan(); masih bingung implementasinya kayak gimana
    }
    
    public static void insertPesanan() {
        pesanan.put(Pesanan.MAKANAN, "Ayam Crispy Bumbu Korea");
        pesanan.put(Pesanan.MINUMAN, "Es Teh Manis");
        pesanan.put(Pesanan.JAJAN, "Beef Burger");
        pesanan.put(Pesanan.LAIN_LAIN, "Siomay");
    }

    // coba-coba
    public static void getPesanan() {
        // System.out.println(pesanan.entrySet());
        // System.out.println(pesanan.get(Pesanan.JAJAN));
        // System.out.println(pesanan.values());
        // System.out.println(pesanan.size());
        // System.out.println(pesanan.keySet());

        for (var valuePesanan : pesanan.values()) {
            System.out.println(valuePesanan);
        }
        System.out.println(pesanan.size());
    }

    public static void requsitePesanan(Pesanan jenisPesanan) {
        if (pesanan.containsKey(jenisPesanan)) {
            if (jenisPesanan.equals(Pesanan.MAKANAN)) {
                System.out.println(pesanan.get(Pesanan.MAKANAN));
            } else if (jenisPesanan.equals(Pesanan.MINUMAN)) {
                System.out.println(pesanan.get(Pesanan.MINUMAN));
            } else if (jenisPesanan.equals(Pesanan.JAJAN)) {
                System.out.println(pesanan.get(Pesanan.JAJAN));
            } else if (jenisPesanan.equals(Pesanan.LAIN_LAIN)) {
                System.out.println(pesanan.get(Pesanan.LAIN_LAIN));
            } else {
                System.out.println("Tidak menemukan pesanan yang dimaksud");
            }
        }
    }
}
