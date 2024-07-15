package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {
        String str="Hello World !";
        String reverse = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);

//        logic-2

        String reverse1= new StringBuilder(str).reverse().toString();
        System.out.println(reverse1);
    }
}
