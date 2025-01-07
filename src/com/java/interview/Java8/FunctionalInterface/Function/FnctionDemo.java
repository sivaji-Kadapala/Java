package com.java.interview.Java8.FunctionalInterface.Function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FnctionDemo {
    public static void main(String[] args) {
        Function<Integer,Double> halfValue=i->i/2.0;
        Double reuslt = halfValue.apply ( 5 );
        System.out.println (reuslt);


        Function<String ,String> func1ToUpperCase=String::toUpperCase;
        System.out.println (func1ToUpperCase.apply ( "sivaji" ));


        Function<String,String> funct2nullCheck=str->str==null?"Enter valid":str;
        String result1 = funct2nullCheck.andThen ( func1ToUpperCase ).apply ( "This is sivaji" );
        System.out.println (result1);
        String result2 = funct2nullCheck.andThen ( func1ToUpperCase ).apply ( null);
        System.out.println (result2);
        String result3 = funct2nullCheck.compose ( func1ToUpperCase ).apply ( "sivaji kadapala" );
        System.out.println (result3);
        Function<Integer,Integer> identicalValue=Function.identity ();
        System.out.println (identicalValue.apply ( 100 ));
        Stream<String> names=Stream.of ( "one","two","three" );
        List<String> values=names.map ( Function.identity () ).collect( Collectors.toList());
        System.out.println (values);
        String result4 = funct2nullCheck.compose ( func1ToUpperCase ).apply ( null );
        System.out.println (result3);
    }
}
