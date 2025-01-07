package com.java.interview.CoreJava.Exception;
class SpiderException extends Throwable{
    SpiderException(){
        super();
    }
    SpiderException(String msg){
        super(msg);
    }
}
public class CustomException_1 {
    public static void main(String[] args) {
        int i=10,j=0;
        if(j==0)
        {
            try{
                throw new SpiderException ("/by Zero");
            }catch (SpiderException spiderException){
                spiderException.printStackTrace ();
            }
        }
        else
        {
            int result=i/j;
            System.out.println (result);
        }
    }
}
