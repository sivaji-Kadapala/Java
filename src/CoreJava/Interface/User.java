package CoreJava.Interface;

public class User {
    public static void main(String[] args) {
        Imouse m=new CpuImpl();
        m.click();
        m.rightClick();
        m.doubleClick();
        System.out.println(Imouse.user);
    }
}
