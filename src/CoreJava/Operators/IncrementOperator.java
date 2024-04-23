package CoreJava.Operators;

public class IncrementOperator {
    public static void main(String[] args) {
       int a=5,b=7;
       int c=a+++b;//6,7
       int d=++a+b;//7,7
       int e=a--+b;//6,7
       int f=--a+b;//5,7
        System.out.println("Post-Increment\n c="+c);
        System.out.println("Pre-Increment\n d="+d);
        System.out.println("Post-Decrement\n e="+e);
        System.out.println("Pre-Decrement\n f="+f);
    }
}
