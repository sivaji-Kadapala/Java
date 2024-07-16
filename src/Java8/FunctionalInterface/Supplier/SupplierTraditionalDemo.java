package Java8.FunctionalInterface.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTraditionalDemo implements Supplier<LocalDateTime> {
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier=new SupplierTraditionalDemo();
        System.out.println(supplier.get());;
    }
}
