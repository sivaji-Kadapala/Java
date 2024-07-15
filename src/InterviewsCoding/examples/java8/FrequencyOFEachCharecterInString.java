package InterviewsCoding.examples.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOFEachCharecterInString {
    public static void main(String[] args) {
       String str="Hello World !";
//       use groupingBy
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
