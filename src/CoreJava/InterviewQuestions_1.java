package CoreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions_1 {
    public static void main(String[] args) {
//        1.Occurance of charecters count
        String name = "sivaji_kadapala";
        String[] arr = name.split("");
        Map<String, List<String>> map = Arrays.stream(arr).collect(Collectors.groupingBy(s -> s));
        System.out.println(map);

        Map<String, Long> map1 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);
//        2.Find all duplicate elements from a given string
        List<String> list = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("all duplicate elements from a given string:"+list);
//        3.Find first non-repeat element from given string
        String value = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(s -> s.getValue() == 1).findFirst().get().getKey();
        System.out.println("first non-repeat element from given string:"+value);
//        4.skip & limit
        List<String> list2 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).skip(1).limit(3).collect(Collectors.toList());
        System.out.println("skip and limit:"+list2);
//        5.second-highest number
        int[] numbers={5,9,12,3,9,21,1,49};
        List<Integer> list3 = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list3);
        Integer list4 = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second-highest:"+list4);
//        6.Longest string from given array
        String[] arr2={"java",".net","spring","spring boot","angular"};
        String longest=Arrays.stream(arr2).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(".Longest string from given array:"+longest);
//         7.Find all elements from array which is  start with 9
    int[] numbersArt={5,55,45,98,87,34,91,9};
        List<String> list5 = Arrays.stream(numbersArt)
                .boxed()
                .map(m -> m + "")
                .filter(x -> x.startsWith("9"))
                .collect(Collectors.toList());
        System.out.println("all elements from array which is  start with 9:"+list5);

    }
}
