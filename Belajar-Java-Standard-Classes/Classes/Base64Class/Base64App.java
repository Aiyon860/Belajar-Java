package Base64Class;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String nama = "Daniel Adi Pratama";

        String encode = Base64.getEncoder().encodeToString(nama.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);

        // testing-testing
        String nama_temen = "Tirza Nadya Wibowo";

        String encode2 = Base64.getEncoder().encodeToString(nama_temen.getBytes());
        System.out.println(encode2);

        String decode2 = new String(Base64.getDecoder().decode(encode2));
        System.out.println(decode2);
    }
}
