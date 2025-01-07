package com.java.interview.Coding.Companies;
//you will get compiletime issue
public class Capgemini_2 {
    public static void main(String[] args) {
        try{
            int result=10/0;
        }
        catch (ArithmeticException arithmeticException){
            System.out.println ("arithmeticException");
        }
        catch (Exception e){
            System.out.println ("Exception");
        }
//        catch ( NumberFormatException numberFormatException){
//            System.out.println ("numberFormatException");
//        }


    }
}
