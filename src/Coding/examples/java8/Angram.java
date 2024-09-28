package InterviewsCoding.examples.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Angram {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1= Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        s2= Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        if (s2.equals(s1)) {
            System.out.println("Program is anagram");
        }else {
            System.out.println("Program is not a anagram");
        }
    }
}
