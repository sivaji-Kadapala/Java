package Java8.Strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Anushka");
        list.add("Trisha");
        list.add("Nayanathra");
        list.add("Dheepika");
        list.add("pooja");
        list.add("anupuma");
        list.add("amisha");
        Stream<String> str=list.stream();
        str.filter(name->name.startsWith("A")).forEach(System.out::println);
    }
}
