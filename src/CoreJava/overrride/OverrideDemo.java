package CoreJava.overrride;
class TestDemo{
    void printDemo()
    {
        System.out.println("sivaji");
    }
}
public class OverrideDemo extends TestDemo{
    void printDemo()
    {
        System.out.println("sivaji kadapala");
    }
    public static void main(String[] args) {
        OverrideDemo obj=new OverrideDemo();
        obj.printDemo();
    }
}
