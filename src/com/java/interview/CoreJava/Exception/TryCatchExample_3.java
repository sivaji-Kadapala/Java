package com.java.interview.CoreJava.Exception;

public class TryCatchExample_3 {
    public static void main(String[] args) {
        try{
            int i=Integer.parseInt ( "Hello" );

        }
        catch (NumberFormatException e)
        {
            System.out.println (e);
        }
    }
}
