package Java8.FunctionalInterface.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier=()->new Random().nextInt(100);
        for (int i = 0; i <5 ; i++) {
            int randomNumber=randomSupplier.get();
            System.out.println("Random Number:"+randomNumber);
        }
    }
}
