package src.com.java.interview.Coding.SCB;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping of two numbers:"+a+","+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping of two numbers:"+a+","+b);
    }
}
