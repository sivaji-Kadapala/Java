package com.java.interview.CoreJava.Exception;

public class TestFinallyBlock_1 {
    public static void main(String[] args) {
        try
        {
            int data=25/0;
            System.out.println (data);
        }
        catch (NullPointerException nullPointerException)
        {
            System.out.println (nullPointerException);
        }
        finally {
            System.out.println ("Finally Block always executed");
        }
        System.out.println ("rest of the code");
    }
}
