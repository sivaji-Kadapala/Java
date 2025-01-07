package com.java.interview.Coding.Companies;

import java.util.function.Predicate;

public class Capgemini_3 {
    public static void main(String[] args) {
        Predicate<Integer> isabove18=age->age>18;
        System.out.println (isabove18.test ( 18 ));
    }
}
