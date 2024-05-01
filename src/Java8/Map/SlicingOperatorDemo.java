package Java8.Map;

import java.util.ArrayList;
import java.util.List;

public class SlicingOperatorDemo {
    public static void main(String[] args) {
        List<String> countries=new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("China");
        countries.add("India");
        countries.add("USA");
//        Getting unique values from collection using distrinct
//        countries.stream().distinct().forEach(System.out::println);
//        Getting specific no.of records from collection using limit()
//        countries.stream().limit(4).forEach(System.out::println);
//        removing first N no.of recording
        countries.stream().skip(3).forEach(System.out::println);
    }
}
