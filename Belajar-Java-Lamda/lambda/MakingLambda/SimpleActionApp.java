package MakingLambda;

public class SimpleActionApp {
    public static void main(String[] args) {
        //# Without Lambda Expression
        // SimpleAction badmintonImpl = new SimpleAction() {
        //     @Override
        //     public void badminton(String pemain, String asal) {
        //         System.out.println("INFO PEMAIN!!!");
        //         System.out.println("Nama: " + pemain + "; Lahir di: " + asal);
        //     }
        // };

        //# With Lambda Expression
        SimpleAction badmintonImpl = (pemain, asal) -> {
            // isi implementasinya
            System.out.println("INFO PEMAIN!!!");
            System.out.println("Nama: " + pemain + "; Lahir di: " + asal);
        };

        badmintonImpl.badminton("Viktor Axelsen", "Denmark");
    }
}
