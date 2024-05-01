package Java11.Threads;

class ThreadDemo extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(i + " Thread " + Thread.currentThread().getId());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo.start();
        threadDemo1.start();
    }

}
