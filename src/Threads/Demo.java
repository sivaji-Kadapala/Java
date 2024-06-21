package Threads;

public class Demo{
    public static void main(String[] args) {
//        two ways to create
//        1.Thread way
        Thread t1=new Thread();
        t1.start();
        System.out.println(Thread.currentThread().getName()+" "+Thread.activeCount());
        System.out.println(t1.getState());
//        2.Runnable way
        EmployeeDemo e1=new EmployeeDemo();
        Thread t2=new Thread(e1,"Siva");
        t2.start();
        System.out.println(t2.getState());
        ManagerDemo m1=new ManagerDemo();
        Thread t3=new Thread(m1,"Ram");
        t3.start();
        System.out.println(t3.getState());

    }

}
class EmployeeDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.activeCount()+" "+Thread.currentThread().getId());
    }
}
class ManagerDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.activeCount()+" "+Thread.currentThread().getId());
    }
}