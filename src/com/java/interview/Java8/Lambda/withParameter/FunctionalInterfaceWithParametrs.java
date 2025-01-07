package com.java.interview.Java8.Lambda.withParameter;

public class FunctionalInterfaceWithParametrs {
    public static void main(String[] args) {
        CalOperation addition=(int x,int y)->{
            System.out.println ("values are:"+x+","+y);
            return x+y;
        };
        double result1=addition.operation ( 20,30 );
        System.out.println (result1);
        CalOperation subtraction=( x, y)->{
            System.out.println ("values are:"+x+","+y);
            return x-y;
        };
        double result2=subtraction.operation ( 30,20 );
        System.out.println (result2);
        System.out.println (addition);
        System.out.println (subtraction);
        CalOperation multiplication=( x, y)->x*y;
        double result3=multiplication.operation ( 30,20 );
        System.out.println (result3);
    }
}
