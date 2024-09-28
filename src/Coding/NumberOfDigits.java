package InterviewsCoding;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num=1234567890;
//        String count=Integer.toString(num);
//        System.out.println(count.length());
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
