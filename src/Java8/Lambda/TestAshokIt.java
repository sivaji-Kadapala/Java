package Java8.Lambda;
@FunctionalInterface
interface Calculator{
    public void add(int i,int j);
}
public class TestAshokIt {
    public static void main(String[] args) {
        Calculator c=(i,j)-> System.out.println("Sum::"+(i+j));
        c.add(10,20);
        c.add(30,50);
    }
}
