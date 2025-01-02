package java.interview.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        List<String> lists = Arrays.asList("Alice", "2ob", "3harlie");
        System.out.println (lists.stream ().filter ( i->i.matches ("^[0-9].*")).collect( Collectors.toList()));
    }
}
