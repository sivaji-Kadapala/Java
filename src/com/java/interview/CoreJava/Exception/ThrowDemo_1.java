package com.java.interview.CoreJava.Exception;

public class ThrowDemo_1 {
    public static void main(String[] args) {
        validate(19);
        System.out.println ("rest of the code");
    }

    private static void validate(int age) {
        if (age <18) {
            throw new ArithmeticException ("not valid");
        }
        else
        {
            System.out.println ("Welcome to vote");
        }
    }
}
