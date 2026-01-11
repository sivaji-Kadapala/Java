package coding;

import java.util.stream.IntStream;

public class Code_5 {
    public static void main(String[]args){
        int n=4;
        long result = IntStream.rangeClosed(2, n).reduce(1, (int a, int b) -> a * b);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
