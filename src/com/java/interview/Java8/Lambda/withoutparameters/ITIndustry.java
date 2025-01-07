package com.java.interview.Java8.Lambda.withoutparameters;

public class ITIndustry {
    public static void main(String[] args) {
        //without lamda
        JpMorganChase jpMorganChase=new JpMorganChase ();
        jpMorganChase.JavaDevelopers ();
        //with lamda
        Virtusa citi=()->{
            System.out.println ("Virtusa is vendor of citi");
        };

        //with parameters
        ShowDemo addition=(a,b)->{
            return a+b;
        };
        System.out.println ("addition:"+addition.show ( 10,20 ));;
        citi.JavaDevelopers ();
        Virtusa bt=()->{
            System.out.println ("Virtusa is vendor of BT");
        };
        bt.JavaDevelopers ();
    }
}
