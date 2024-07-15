package Java11.Threads;

class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("t");
}


public class MultiThreading {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo.start();
        threadDemo1.start();
    }

}}
