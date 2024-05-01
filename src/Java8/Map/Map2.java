package Java8.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Anushka");
        list.add("Trisha");
        list.add("Deepika");
        list.add("Anupama");
        list.add("amisha");
        Stream<String> stream=list.stream();
        IntStream tfStream=stream.mapToInt(name->name.length());
        tfStream.forEach(System.out::println);
        stream.filter(name->name.startsWith("A")).map(name->name+"::"+name.length()).forEach(System.out::println);
    }
}
