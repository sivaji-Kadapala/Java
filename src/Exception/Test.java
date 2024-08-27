package Exeption;

public class Test {
    public static void main(String[] args) throws MyException {
        hello1();
    }

    private static void hello1() throws MyException {
        System.out.println("hello1");
        hello2();
    }

    private static void hello2() throws MyException {
        System.out.println("hello2");
        hello3();
    }

    private static void hello3() throws MyException {
        try{
            System.out.println(10/0);
            System.out.println("h");
        }catch (Exception e){
            throw new MyException("Got devided by zero exception");
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
        }
        System.out.println("hello3");
    }
}
