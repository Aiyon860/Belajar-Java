package BigNumberClass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        // Big Integer (numeric)
        BigInteger one = new BigInteger("100000000000000000000");
        BigInteger two = new BigInteger("100000000000000000000");
        BigInteger result = one.add(two);

        System.out.println(result);
       
        // Big Decimal (floating point)
        BigDecimal a = new BigDecimal("1.10000000000000000000000000000000000000000000000000000000000000000000");
        BigDecimal b = new BigDecimal("1.10000000000000000000000000000000000000000000000000000000000000000000");
        BigDecimal resultDecimal = a.subtract(b);

        System.out.println(resultDecimal);
        
    }
}
