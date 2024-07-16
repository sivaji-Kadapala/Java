package Java8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class SimplePrinter {
    public static void print(String str) {
        System.out.println(str);
    }

}
class IntegerUtils{

    public static String join(Integer a, Integer b) {
        return String.valueOf(a + b);
    }

}
public class Demo {
    private static <R> R playTwoArgument(Integer i1, Integer i2,
                                         BiFunction<Integer, Integer, R> func) {
        return func.apply(i1, i2);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "java", "python", "ruby");
//        Anonymous class to print a list.
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
//        Anonymous class -> Lambda expressions.
        list.forEach(str-> System.out.println(str));
//        Lambda expressions -> Method references.
        list.forEach(System.out::println);
//        static method SimplePrinter::print.
        list.forEach(SimplePrinter::print);
//        strings to integers
        List<String> list2 = Arrays.asList("1", "2", "3");
        List<Integer> collect3 = list2.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collect3);
//        joins two Integer and returns a String.
        // method reference
        String result2 = playTwoArgument(1, 2, IntegerUtils::join);

        System.out.println(result2);


    }
}
