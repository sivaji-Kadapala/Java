package coding;

import java.util.stream.IntStream;

public class Code_12 {
    public static void main(String[]args){
        String str="mada";
        int len=str.length();
        boolean flag= IntStream.rangeClosed(0,len/2).noneMatch(i->str.charAt(i)!=str.charAt(len-i-1));
        System.out.println(str + " is palindrome: " + flag);
    }
}
