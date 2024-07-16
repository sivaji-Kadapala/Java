package Java8.MethodReference;

public class StaticMthodReference {
    public static void m2(){
        System.out.println("m2 method");
    }
    public static void main(String[] args) {
        MyInterface i1=StaticMthodReference::m2;
        i1.m1();
    }
}
