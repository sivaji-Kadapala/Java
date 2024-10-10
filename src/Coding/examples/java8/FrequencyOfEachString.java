package InterviewsCoding.examples.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FrequencyOfEachString {
    public static void main(String[] args) {
        String input="Sivaji is a good developer, sivaji js having 2 years experience.";
        //approach-1: Split the string into words, convert to stream, and count occurrences of all words
        Map<String, Long> wordCount = Arrays.stream(input.split("\\s+"))
                .map(String::toLowerCase) // Convert to lowercase for case-insensitive comparison
                .collect(Collectors.groupingBy(word -> word, Collectors.counting())); // Count occurrences

        // Output the word counts
        System.out.println("Word counts: " + wordCount);
//        ---------------approach 2:without split-------------------------------------

        // Create a pattern to match words (alphanumeric sequences)
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input.toLowerCase());

        // Use a List to collect all words found by the matcher
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }

        // Count occurrences of all words using streams and groupingBy
        Map<String, Long> wordCount1 = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Output the word counts
        System.out.println("Word counts: " + wordCount1);
//        approach-3
        String[] str=input.split(" ");
        Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }}
