package Interface;
interface Interface1{
    void method1();
    default void print(){
        System.out.println ("method1");
    }
}
interface Interface2{
    void method1();
    default void print(){
        System.out.println ("method2");
    }
}
public class DiamondProblemResolution implements Interface1,Interface2 {
    @Override
    public void method1() {
        System.out.println ("Method1");
    }

    @Override
    public void print() {
        Interface1.super.print ();
        Interface2.super.print ();
    }

    public static void main(String[] args) {
        DiamondProblemResolution obj=new DiamondProblemResolution ();
        obj.method1 ();
        obj.print ();
    }
}
