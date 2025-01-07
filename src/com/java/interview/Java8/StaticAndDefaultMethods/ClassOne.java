package com.java.interview.Java8.StaticAndDefaultMethods;

public class ClassOne implements InterfaceOne,InterfaceTwo{
    @Override
    public void  methodOne(){
        InterfaceOne.super.methodOne ();
        InterfaceTwo.super.methodOne ();
        System.out.println ("method one from interface one");
    }
//    @Override
//    public void  methodThree(){
//        System.out.println ("method one from interface one-static");
//    }

    public static void main(String[] args) {
        InterfaceOne one=new ClassOne ();
        one.methodOne ();
        ClassOne classOne=new ClassOne ();
//        one.methodThree ();
        InterfaceOne.methodThree ();
    }
}
