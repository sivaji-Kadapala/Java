package Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        singleton1.displayMessage();
        EagerSingleton eger=EagerSingleton.getInstance();
        eger.showMessage();
        ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance();
        threadSafeSingleton.showMessage();
        BillPughSingleton billPughSingleton=BillPughSingleton.getInstance();
        billPughSingleton.displayMessage();
    }
}
