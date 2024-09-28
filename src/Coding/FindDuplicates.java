package InterviewsCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 3, 2, 1};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(array)
                .filter(e -> !seen.add(e))
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    }
}