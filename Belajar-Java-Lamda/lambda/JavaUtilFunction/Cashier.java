package JavaUtilFunction;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

public class Cashier {
    DoubleConsumer priceInsert = value -> System.out.println("Total Jumlah Harga: " + value);

    DoublePredicate priceCheck = value -> value != 0 ? true : false;
}
