package InterviewsCoding;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","blueberry","carrot");
        String b = String.valueOf(list.stream().filter(n -> n.startsWith("b")).findFirst());
        System.out.println(list.stream().filter(n -> n.startsWith("b")).count());
        System.out.println(b);
        List<Integer> numbers = Arrays.asList(5, 1, 4, 3, 2);
        List<String> words= Arrays.asList("ab","ca","ba");

        // Using List.sort with a method reference
        numbers.sort(Integer::compareTo);
        System.out.println("Sorted numbers: " + numbers);
        // Using List.sort with a method reference
        words.sort(String::compareTo);
        System.out.println("Sorted numbers: " + words);

        Integer highest = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow(NoSuchElementException::new);

        // Finding the lowest value
        Integer lowest = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(NoSuchElementException::new);

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);

    }
}
