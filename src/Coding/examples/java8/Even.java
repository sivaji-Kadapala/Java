package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Even {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//Logic-1
        Map<Boolean, List<Integer>> evenOrOdd = list.stream().collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println(evenOrOdd);
//Logic-2
        List<Integer> coll = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(coll);
// logic-3
        int num=4;
        boolean even= IntStream.of(num).allMatch(n->n%2==0);
        System.out.println(even);
//logic-4
        Map<String, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "odd"));
        System.out.println(collect);
    }
}