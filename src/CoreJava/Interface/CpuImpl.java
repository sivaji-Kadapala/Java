package CoreJava.Interface;

public class CpuImpl implements Imouse{
    @Override
    public void click() {
        System.out.println("resources get selected");
    }

    @Override
    public void rightClick() {
        System.out.println("Display/show options");
    }

    @Override
    public void doubleClick() {
        System.out.println("double click");
    }
}
