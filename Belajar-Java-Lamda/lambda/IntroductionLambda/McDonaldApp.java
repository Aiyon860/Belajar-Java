package IntroductionLambda;

public class McDonaldApp {
    public static void main(String[] args) {
        Button btn = new Button();
        
        btn.setOrderedAction(new McDonald() {
            @Override
            public void onOrder(String nama, Integer jumlah) {
                System.out.println("Berhasil Mengorder Pesanan!");
                System.out.print("Nama Pesanan: " + nama + "; ");
                System.out.println("Jumlah Pesanan: " + jumlah);
            }
        });
        
        btn.doOrder();
    }
}
