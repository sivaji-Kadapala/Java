package CoreJava.superDEmo;
class SuperTest{
    String Color="green";
    void eat(){
        System.out.println("eating...");
    }
}
public class SuperDemo extends SuperTest{
    String Color="blue";
    void printDemo(){
        System.out.println(Color);
        System.out.println(super.Color);
    }
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");}

    void work(){
        super.eat();
        bark();
    }
}
class SuperMain{
    public static void main(String[] args) {
        SuperDemo obj=new SuperDemo();
        obj.printDemo();
        obj.work();
    }
}
