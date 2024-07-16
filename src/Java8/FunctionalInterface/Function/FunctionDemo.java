package Java8.FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function=(t)->t.length();
        System.out.println(function.apply("Sivaji"));

        Function<Integer,String> function1=(number)->{
            if(number%2==0){
                return "Number "+number+" is even";
            }else {
                return "Number "+number+" is odd";
            }
        };
        System.out.println(function1.apply(11));
        Function<String, Integer> function2=(t)->t.length();
        Function<Integer,Integer> function3=(number)->number*2;
        Integer integer=function2.andThen(function3).apply("Sivaji");
        System.out.println(integer);
    }
}
