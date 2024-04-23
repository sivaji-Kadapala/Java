package CoreJava;
/*
Final keyword
-> final is a keyword or modifier which can be used at variables, methods & classes.
-> If we declare a variable as final then we can’t modify value of the variable. The variable
acts like a constant. Final field must be initialized when it is declared.
-> If we declare a method as final then we can't override that method
-> If we declare a class as final then we can't extend from that class. We cannot inherit final
class in Java
 */
public final class FinalDemo {
    final int a=10;//valid
//    a=20;//invalid
//    final int c;//invalid
    final void m1(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        FinalDemo finalDemo=new FinalDemo();
        finalDemo.m1();
    }
//    class Test extends FinalDemo{//invalid

//    }
}
