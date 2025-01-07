package com.java.interview.CoreJava.Exception;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Finalize_1 {
//    public void finalize(){
//        System.out.println ("finalized called");
//    }
    public static void main(String[] args) {
        String str="Capgemini";
        var output=str.chars ()
                .mapToObj ( c->(char)c )
                .collect( Collectors.groupingBy (
                        c->c, LinkedHashMap::new,
                        Collectors.counting ()
                ))
                .entrySet ().stream ()
                .filter ( entry->
                        entry.getValue ()>1)
                .map( Map.Entry::getKey)
                .findFirst ();
        System.out.println (output);
//        Finalize_1 f1=new Finalize_1 ();
//        Finalize_1 f2=new Finalize_1 ();
//        f1=null;
//        f2=null;
//        System.gc ();
    }
}
