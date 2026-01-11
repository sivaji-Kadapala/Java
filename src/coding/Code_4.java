package coding;

import java.util.stream.IntStream;

public class Code_4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int asInt = IntStream.of(a, b, c).max().getAsInt();
        System.out.println("The largest number is: " + asInt);
    }
}
