package com.java.interview.Java8.FunctionalInterface.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDem {
    public static void main(String[] args) {
        List<String> names=List.of ("abc","xyz");
        Consumer<String> printUppercase=str-> System.out.println (str.toUpperCase ());
        printUppercase.accept ( "Sivaji" );
        names.forEach ( printUppercase );


        List<String> newValues=new ArrayList<String> ();
        Consumer<String> addToList=str->newValues.add ( str.toUpperCase ());
        names.forEach ( addToList );
        System.out.println (newValues);
    }
}
