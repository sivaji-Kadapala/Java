package Java8.Strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
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
//        filter
        Stream<Integer> stream=Stream.of(4,8,12,6,7,11,24);
        stream.filter(i->i>20).forEach(System.out::println);
//        Start with A
        List<String> list1=new ArrayList<>();
        list1.add("Anushka");
        list1.add("Trisha");
        list1.add("Nayanatara");
        list1.add("Deepika padukone");
        list1.add("Amisha patel");
        Stream<String> stream3=list1.stream();
//        stream3.filter(name->name.startsWith("A")).forEach(System.out::println);
//        map
//        stream3.map(name->name.toUpperCase()).forEach(System.out::println);
//        IntStream tfStream=stream3.mapToInt(name->name.length());
//        tfStream.forEach(System.out::println);
        stream3.filter(name->name.startsWith("A"))
                .map(name->name+"::"+name.length())
                .forEach(System.out::println);
    }
}
