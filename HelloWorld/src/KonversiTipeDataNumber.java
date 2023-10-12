public class KonversiTipeDataNumber {

    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        byte iniByte2 = (byte) iniInt;
        int iniInt2 = (int) iniLong;
        int iniInt3 = 1000;
        byte inibyte3 = (byte) iniInt3;
    }
}
