package CoreJava.Factorial;

public class Factorial {
    public static void main(String[] args) {
       int number=4,result;
       result=factorial(number);
        System.out.println(number+" factorial="+result);
    }

    private static int factorial(int number) {
        if (number != 0) {
            return number*factorial(number-1);
        }else{
            return 1;
        }
    }
}
