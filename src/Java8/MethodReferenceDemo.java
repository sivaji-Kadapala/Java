package Java8;

import java.util.function.Supplier;

interface MyInterface{
    void m1();

}
class  Sample{
    public Sample(){
        System.out.println("sample::constructor");
    }
}
public class MethodReferenceDemo {
    static void m2(){
        System.out.println("m2 method");
    }
    void m3(){
        for (int i = 1; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
    public static void main(String[] args) {
        MyInterface i1=MethodReferenceDemo::m2;
        i1.m1();
        MethodReferenceDemo methodReferenceDemo=new MethodReferenceDemo();
        Runnable r=methodReferenceDemo::m3;
        Thread t1=new Thread(r);
        t1.start();

        for (int i = 0; i <5 ; i++) {
            System.out.println("Main thread");
        }
//        constructor reference
        Supplier<Sample> i=Sample::new;
        System.out.println(i.get().hashCode());
    }
}
