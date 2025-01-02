package java.interview.Coding;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
        int rev=Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        System.out.println(rev);
    }
}
