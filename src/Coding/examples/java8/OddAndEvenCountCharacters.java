package InterviewsCoding.examples.java8;

import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenCountCharacters {
    public static void main(String[] args) {
        String name="Hello World";
        List<Character> collect = name.chars().mapToObj(c -> (char) c).filter(n -> n % 2 == 0).distinct()
                .collect(Collectors.toList());
        System.out.println("even:"+collect);
        List<Character> collect1 = name.chars().mapToObj(c -> (char) c).filter(n -> n % 2 != 0).distinct()
                .collect(Collectors.toList());
        System.out.println("odd:"+collect1);
    }
}
