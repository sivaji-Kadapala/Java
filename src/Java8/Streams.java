package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = stream.filter(x -> x % 2 == 0);
        integerStream.forEach(System.out::println);
    }
}
