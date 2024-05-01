package Java8.Strm;

import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        Stream<Integer> stream1=Stream.of(4,8,12,6,7,11,24);

//        stream1.filter(i->i>=20).forEach(System.out::println);
        stream1.filter(i->i<=20).forEach(System.out::println);
    }
}
