package Java8.Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable {
    void print(String msg);
}
public class JLEExampleSingleParameter {

    public static int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Printable printable=new Printable() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printable.print("Print the console...");
        //With Lambda
        Printable withLambda=(msg)-> System.out.println(msg);
        withLambda.print("Print the console...");
        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->JLEExampleSingleParameter.addition(a,b);
        System.out.println(biFunction.apply(1,2));
        BiFunction<Integer,Integer,Integer> biFunction1= JLEExampleSingleParameter::addition;
        System.out.println(biFunction1.apply(1,2));
        Function<Integer,Double> function=(Integer input)->Math.sqrt(input);
        System.out.println(function.apply(9));
        Function<Integer,Double> function1= Math::sqrt;
        System.out.println(function1.apply(9));
    }
}
