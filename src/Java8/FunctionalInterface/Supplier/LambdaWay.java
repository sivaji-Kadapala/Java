package Java8.FunctionalInterface.Supplier;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class LambdaWay {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());


        System.out.println(productSupplier().get());
    }
    private static  Supplier<List<Product>> productSupplier(){
        Supplier<List<Product>> productSupllier = () -> {
            List<Product> productList = new ArrayList<Product>();
            productList.add(new Product(1, "HP", 25000f));
            productList.add(new Product(2, "Dell", 35000f));
            return productList;
        };
        return productSupllier;
    }
}
