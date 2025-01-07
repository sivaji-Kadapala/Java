package com.java.interview.Java8.Lambda.withParameter;
@FunctionalInterface
public interface CalOperation {
    double operation(int a,int b);
    default void printInfo(){
        System.out.println ("This is default data of method");
    }
    static void typeOfOperations(){
        System.out.println ("Static content : Arithmetic Operations");
    }
}
