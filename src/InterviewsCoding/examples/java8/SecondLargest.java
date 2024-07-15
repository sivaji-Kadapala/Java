package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> anyList= Arrays.asList(1,2,2,3,3,4,5,6,5);
//        logic-1
        Integer SecondLargest = anyList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(SecondLargest);
//        logic-2
        Integer  secondLargest2 =   anyList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest2);
    }
}
