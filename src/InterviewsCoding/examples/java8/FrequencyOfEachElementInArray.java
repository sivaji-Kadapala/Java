package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {
        List<Integer> anyList= Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
//        logic-1
        Map<Integer, Long> collect = anyList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
//        Logic-2
        Integer[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Integer, Long> collect1 = Arrays.stream(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect1);
    }
}
