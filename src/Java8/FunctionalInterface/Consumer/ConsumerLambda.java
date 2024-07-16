package Java8.FunctionalInterface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        Consumer<String> print=x-> System.out.println(x);
        print.accept("Sivaji");
        Consumer<String> consumer1=input-> System.out.println(input+ "World !");
        Consumer<String> consumer2=input-> System.out.println(input+ "Java !");
        consumer1.andThen(consumer2).accept("Hello");
        List<Integer> integers= Arrays.asList(1,2,3,4,56,7);
        Consumer<Integer> consumer3=(input)-> System.out.println(input);
        integers.forEach(consumer3);
    }

}
