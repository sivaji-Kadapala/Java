package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
//        Stream<?> s = Stream.of(1, 2, 3, 4, 5);
//        List<?> list = s.collect(Collectors.toList());
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Collections.reverse(list);
        System.out.println(list);
    }
}
