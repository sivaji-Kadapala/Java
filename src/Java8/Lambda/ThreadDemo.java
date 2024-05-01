package Java8.Lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("WithoutLambda");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        Runnable runnable1=()-> System.out.println("WithLambda");
        Thread thread1=new Thread(runnable1);
        thread1.start();
    }
}
