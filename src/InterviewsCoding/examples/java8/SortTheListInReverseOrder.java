package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> anyList= Arrays.asList(1,2,3,4,-1,-3,0,5,2,1);
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
//        Logic-1(Comparator)
        List<Integer> collect = anyList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect2 = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect2);
        List<Integer> collect1 = anyList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
