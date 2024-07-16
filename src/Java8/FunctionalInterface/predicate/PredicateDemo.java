package Java8.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    public static void main(String[] args) {
        Predicate<Integer> p=i -> (i > 10);
        System.out.println(p.test(100));
        System.out.println(p.test(5));
        String[] names={"kajal","katrina","Anushka","Mallika","Alia"};
        Predicate<String> p1=s->s.charAt(0)=='k';
        for(String name:names){
            if(p1.test(name)){
                System.out.println(name);
            }
        }
        Predicate<Integer> predicate=new PredicateDemo();
        System.out.println(predicate.test(10));
    }

    @Override
    public boolean test(Integer integer) {
        if(integer%2==0){
            return true;
        }else {
            return false;
        }
    }
}
