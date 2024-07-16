package Java11.Threads;

public class ThreadRunnableDemo {
    public static void main(String[] args) {
       Runnable myThread=()->{
           Thread.currentThread().setName("myThread");
           System.out.println(Thread.currentThread().getName()+" is running");
       };
       Thread run=new Thread(myThread);
       run.start();
    }
}
