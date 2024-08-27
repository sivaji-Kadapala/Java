package Generics;

public class OuterClass
{
    class Inner{
        void innerMethod(){
            System.out.println("Inner class innerMethod");
        }
    }
    void outerMethod(){
        Inner i=new Inner();
        i.innerMethod();
        System.out.println("Outer class outerMethod");
    }

    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.outerMethod();

    }
}
