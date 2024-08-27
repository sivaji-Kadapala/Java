package Threads;
//> If we create any thread by extending Thread class then we have no chance for extending
//from any other class.
//Step-1: creating a class that extends a Thread class
public class MyThread extends Thread{
//    Step-2: overriding the run() method
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("User Thread Value:"+i);
        }
    }

    public static void main(String[] args) {
//Step-3: creating an object for user defined Thread class
        MyThread myThread=new MyThread();
//        Step-4: attaching user defined thread with main ThreadGroup
        Thread t=new Thread(myThread);
//        Step-5: starting the execution of the Thread by calling start()
//        -> When we call start() method the thread will be registered with ThreadScheduler and next
//will invoke the run() method.
        t.start();

    }
}
