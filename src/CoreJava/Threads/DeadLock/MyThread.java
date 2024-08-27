package Threads.DeadLock;
/*
-> Dead lock may occur if one thread holding resource1 and waiting for resource2 release by
the Thread2, at the same time Thread2 is holding on resource2 and waiting for the
resource1 released by the Thread1 in this case 2 Threads are continuously waiting and no
thread will execute this situation is called as deadlock.
-> To resolve this deadlock situation there is no any concept in java, programmer only
responsible for writing the proper logic to resolve the problem of deadlock.

 */
public class MyThread {
    public static void main(String[] args) {
        final String resource1 = "Ashok IT";
        final String resource2 = "Java Training";
// t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };
// t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }

}

