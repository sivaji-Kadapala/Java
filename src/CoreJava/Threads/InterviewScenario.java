package Threads;

public class InterviewScenario {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
//        Can we change the name of the main thread? If yes, How?
//        ans: Yes, we can change the name of the main thread.
        t.setName("Sivaji_thread");
        System.out.println(t.getName());
    }
}
