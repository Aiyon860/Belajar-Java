package ProjectLambda;

public class ShowAndServiceQueueSystem {
    private QueueSystem appSystem = new QueueSystem();

    public void showAntrianService() {
        System.out.println("SELAMAT DATANG DI AIYON REFLUX MARKET");
    }

    public void addAntrianService() {
        System.out.println("-------------------------------------");
        appSystem.addAntrian("Bambang, 30, #413, Ngaliyan, Indomie Rendang (3), Rp. 6_000, Cash");
        appSystem.addAntrian("Setiawan, 26, #1750, Mijen, Telur (10), Rp. 20_000, Credit Card BRI");
        appSystem.addAntrian(null);
        appSystem.addAntrian("Tuti, 27, #23, Gunungpati, Beras 5 Kg (1), Rp. 50_000, Debit Card BCA");
        appSystem.addAntrian("Tukiyem, 29, #2453, Semarang Barat, Kopi Hitam Sachet (5), Rp. 5_000, Cash");
        appSystem.addAntrian("Basuki, 28, #8, Tugu, Indomie Soto (4), Rp. 8_000, Cash");
        appSystem.addAntrian(null);
    }

    public void peekAntrianService() {
        System.out.println("IDENTITAS PELANGGAN\n(Nama, Umur, ID Supermarket, Alamat, Nama Produk (jumlah), Harga Produk, Jenis Pembayaran):");
        appSystem.peekAntrian();
    }

    public void removeAntrianCashService() {
        System.out.println("-------------------------------------");
        System.out.println("PEMBAYARAN CASH");
        appSystem.removeAntrianCash();
    }

    public void removeAntrianBankService() {
        System.out.println("-------------------------------------");
        System.out.println("PEMBAYARAN BANK");
        appSystem.removeAntrianBank();
    }

    public void clearAntrianService() {
        System.out.println("-------------------------------------");
        System.out.println("PEMBAYARAN BERLANGSUNG.....");
        appSystem.clearAntrian();
    }
}
