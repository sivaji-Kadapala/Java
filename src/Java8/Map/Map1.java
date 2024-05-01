package Java8.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Anushka");list.add("Trisha");
        list.add("Nayanathara");list.add("Deepika");
        list.add("pooja");list.add("Anupama");
        Stream<String> stream=list.stream();
        stream.map(name->name.toUpperCase()).forEach(System.out::println);
//        stream.map(name->name.toLowerCase()).forEach(System.out::println);
    }
}
