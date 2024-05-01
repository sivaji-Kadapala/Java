package Java8.Lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p1=i->1>10;
        System.out.println(p1.test(100));
        System.out.println(p1.test(5));
        String[]  names={"kajal","katrina","anushka"};
        Predicate<String> p2=s->s.charAt(0)=='k';
        for (String name:names
             ) {
            if (p2.test(name) ) {
                System.out.println(name);
            }
        }
    }
}
