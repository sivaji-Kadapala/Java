package coding;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Code_8 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        if(number<=1){
            return;
        }
        boolean flag= IntStream.rangeClosed(2,(int) Math.sqrt(number)).noneMatch(i->number%i==0);
        System.out.println(number + " is prime: " + flag);
    }
}
