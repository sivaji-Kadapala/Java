package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
//        logic-1
        String collect = words.stream().collect(Collectors.joining("-", "[", "]"));
        System.out.println(collect);
    }
}
