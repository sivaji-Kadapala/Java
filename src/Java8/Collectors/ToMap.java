package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Rahul");
        list.add("Sachin");
        list.add("Hardik");
        list.add("Dhoni");
        Map<String,Integer> namesMap=list.stream().collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println(namesMap);
    }
}
