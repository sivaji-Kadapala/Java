package Threads;
//t if we create any thread by implementing Runnable interface then we have a chance
//for extending from any one class.
//-> It is always recommended to create the user defined threads by implementing Runnable
//interface only.
//Step1: creating a class that implements Runnable interface
public class RunnableDemo implements Runnable  {
//    Step2: overriding the run() method
    @Override
    public void run() {
        Thread t=Thread.currentThread();
        for (int i = 1; i <=10; i++) {
            System.out.println(t.getName()+" Thread Value:"+i);
        }
    }
    public static void main(String[] args) {
//        Step3: creating an object for user defined Thread class
        RunnableDemo mt=new RunnableDemo();
        RunnableDemo mt2=new RunnableDemo();
        RunnableDemo mt3=new RunnableDemo();
//        Step4: attaching user defined Thread with main ThreadGroup
        Thread t=new Thread(mt);
        Thread t2=new Thread(mt2);
        Thread t3=new Thread(mt3);
//        Step5: starting user defined Thread by calling start() method
/* Note: When we call start ( ) method it is creating thread and printing output
        t.start();
When we execute multiple threads at the same time simultaneously then we never get
same output for every execution because Thread Scheduler will decide which thread should
execute in next step.
-> When we execute multiple Threads which are acting on same object at the same time
simultaneously then there is chance of occurring data inconsistency problem in the
application
-> To resolve this data inconsistency problem, we have to synchronize the object on which
multiple Threads are acting.
Note: Thread synchronization concept is recommended to use only when we run multiple
threads which are acting on same object otherwise this concept is not required.

*/
        t2.start();
        t3.start();
// When we call run ( ) method it is not creating thread and printing with main thread

//        t.run();
    }
}
