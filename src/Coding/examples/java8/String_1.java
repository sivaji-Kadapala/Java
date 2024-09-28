package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, sort them according to increasing order of their length?
public class String_1 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
//        logic-1
        List<String> list = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(list);
//        logic-2
        Collections.sort(listOfStrings, Comparator.comparingInt(String::length));
        System.out.println(listOfStrings);
//        logic-3
        listOfStrings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(listOfStrings);
//        logic-4
        listOfStrings.sort(Comparator.comparingInt(String::length));
        System.out.println(listOfStrings);
    }
}
