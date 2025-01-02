package com.java.interview.CoreJava.Interface;

public class FunctionalInterfaceImpl implements java.interview.CoreJava.Interface.FunctionalInterface {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceImpl ex=new FunctionalInterfaceImpl();
        ex.say("Hi hello...");
    }
}
