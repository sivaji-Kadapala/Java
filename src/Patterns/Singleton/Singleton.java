package Singleton;

public class Singleton {
    private static  Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance()
    {
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void displayMessage(){
        System.out.println("I have called using singleton object..");
    }
}
