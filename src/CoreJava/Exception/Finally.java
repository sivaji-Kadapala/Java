package Exeption;

public class Finally {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
            try {
                System.out.println(10/0);
            }catch (Exception e){
                e.printStackTrace();
            }
//            System.exit(0);//If you write this line ,no need for finally block,it means after this finally block will not execute
        }catch (Exception e){
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("Finally executed");
        }
    }
}
