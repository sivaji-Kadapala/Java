package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface TriFunction<A,B,C,R>{
    R apply(A a,B b,C c);
}
public class ScenarioBased {
    public static void main(String[] args) {
//       1. Scenario: Custom Functional Interface
        TriFunction<Integer,Integer,Integer,Integer> addThree=(a,b,c)->a+b+c;
        System.out.println(addThree.apply(1,2,3));
//       2.Scenario: Using Built-in Functional Interfaces
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> isEven=n->n%2==0;
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenNumbers);
//        Scenario: Chaining Functional Interfaces
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addExclamation = s -> s + "!";
        Function<String, String> combinedFunction = toUpperCase.andThen(addExclamation);
        System.out.println(combinedFunction.apply("hello")); // Output: HELLO!
    }
}
