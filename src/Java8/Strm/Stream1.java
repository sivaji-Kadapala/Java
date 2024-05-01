package Java8.Strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
//        Approach - 1
        Stream<Integer> stream1=Stream.of(1,2,3,4,5,6);
        List<String> list=new ArrayList<>();
        list.add("Sachin");
        list.add("dhoni");
//        Approach - 2
        Stream<String> stream2=list.stream();
    }
}
