package com.java.interview.CoreJava.Exception;

public class TryCatchExample_2 {
    public static void main(String[] args) {
        try{
            int data=50/0;//may throw the exception
        }
        catch (ArithmeticException arithmeticException){
            System.out.println (arithmeticException);
        }
        System.out.println ("rest of the code");
    }
}
