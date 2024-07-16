package Java8.MethodReference;


public class InstanceMethodReference {
    public void m1(){
        for (int i = 1; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
    public static void main(String[] args) {
        InstanceMethodReference instanceMthodReference=new InstanceMethodReference();
        Runnable runnable=instanceMthodReference::m1;
        Thread thread=new Thread(runnable);
        thread.start();
        for (int i = 1; i <5 ; i++) {
            System.out.println("Main thread");
        }
    }
}
