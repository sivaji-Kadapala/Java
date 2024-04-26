package Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread ct=Thread.currentThread();
        System.out.println(ct);
        System.out.println(ct.getName());
        System.out.println(ct.getPriority());
        System.out.println(ct.getThreadGroup());
//

        int n=8;
        for (int i = 0; i <n ; i++) {
            MultiThreadingDemo obj=new MultiThreadingDemo();
            Thread runnableDemo= new Thread( new RunnableDemo());
            obj.start();
            runnableDemo.start();
        }
    }
}
