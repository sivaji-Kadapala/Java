package com.java.interview.Java8.StaticAndDefaultMethods;

public interface InterfaceOne {
    public default void methodOne(){
        System.out.println ("This is Method One from Interface One");
    }
    public static void methodThree(){
        System.out.println ("This is Method One from Interface One-static");
    }

//    void  methodThree();
}
