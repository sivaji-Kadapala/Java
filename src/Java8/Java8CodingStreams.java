package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8CodingStreams {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        //     Given a list of integers, separate odd and even numbers?
        List<Integer> even = listOfIntegers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3);
        //removing duplicates
        List<Integer> duplicate = numbers.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(duplicate);
        String inputString="java concept of the day";
//        How do you find frequency of each character in a string using Java 8 streams?
        Map<Character, Long> countChar = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countChar);
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//         How do you find frequency of each element in an array or a list?
        Map<String, Long> CountingList = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(CountingList);
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//         How do you sort the given list of decimals in reverse order?
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
//        Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        String joinig = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinig);
        Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
        int[] a = new int[] {4, 2, 5, 1};

        int[] b = new int[] {8, 1, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();

        System.out.println(Arrays.toString(c));
//         How do you get three maximum numbers and three minimum numbers from the given list of integers?
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//        anagram
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (s1.equals(s2))
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");

        }
//        largest
        Integer maxI = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(maxI);
        List<String> listOfStrings2 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings2.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(list2::contains).forEach(System.out::println);

        String reverseString = Arrays.stream(inputString.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseString);

        int sum=IntStream.range(1,11).sum();
        System.out.println(sum);

        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to list
        List<Integer> numberList = Arrays.asList(numbers1);

        // Reverse the list
        Collections.reverse(numberList);

        // Convert list back to array
        numbers1 = numberList.toArray(new Integer[0]);

        System.out.println("Reversed array: " + Arrays.toString(numbers1));


        IntStream.range(1,10).map(n->n*2).forEach(System.out::println);
        String input="radar";
        boolean b1 = Arrays.stream(input.split(" ")).map(str -> new StringBuilder(str).reverse().toString()).anyMatch(rev -> rev.equals(input));
        System.out.println(b1);
        List<String> listOfStrings3 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings3.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);

    }



}
