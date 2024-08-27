package Exeption;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){//level1
            e.printStackTrace();
        }catch (Exception e){//level2
            e.printStackTrace();
        }
    }
}
