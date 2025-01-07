package com.java.interview.Coding.Companies;

import java.util.stream.Stream;

public class Capgemini_4 {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        StringBuilder sb1=new StringBuilder ();
        sb1.append ("ja").append ( "va" );
        System.out.println (s1==s2);
        System.out.println (s1.equals ( sb1 ));
        System.out.println (s1==sb1.toString ());
        System.out.println (s1.equals ( s2 ));
    }
}
