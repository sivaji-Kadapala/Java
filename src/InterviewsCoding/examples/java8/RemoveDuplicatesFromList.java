package InterviewsCoding.examples.java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//        1.use distrinct
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
//        2.use set
        Set<Integer> collect1 = numbers.stream().collect(Collectors.toSet());
        System.out.println(collect1);
//        3.use linkedHashset
        Set<Integer> collect3=new LinkedHashSet<>(numbers);
        System.out.println(collect3);
//        4.TreeSet
        Set<Integer> collect4=new TreeSet<>(numbers);
        System.out.println(collect4);
    }
}
