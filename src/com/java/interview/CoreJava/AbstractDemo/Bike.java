package java.interview.CoreJava.AbstractDemo;

abstract class Bike {
    Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
