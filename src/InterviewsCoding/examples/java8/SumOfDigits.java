package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigits {
    public static void main(String[] args) {
//        logic-1
        int num=12345;
        Integer sum1 = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum1);
//        logic-2
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
//        logic-3
        Integer sum3= integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum3);
//        logic-4
        Integer sum4= integers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum4);
//        logic-5
        int sum5 = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum5);
        //     logic-5
        int sum6 = integers.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum6);
//        logic-6
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum7= Arrays.stream(a).sum();
        System.out.println(sum7);
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average = "+average);
    }
}
