package Java8.FunctionalInterface.predicate;

import java.util.function.BiPredicate;

public class ByPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String,Integer> filter=(x,y)->{
            return x.length()==y;
        };
        boolean result1=filter.test("Sivaji",6);
        System.out.println(result1);
        boolean result2=filter.test("Kadapala",10);
        System.out.println(result2);
    }
}
