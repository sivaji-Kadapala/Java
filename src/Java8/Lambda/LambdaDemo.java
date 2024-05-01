package Java8.Lambda;
@FunctionalInterface
interface Wish{
//    void wishMsg();
    public void add( int a,int b);
}
public class LambdaDemo {
    public static void main(String[] args) {
//        Wish wish=()-> System.out.println("Hello");
//        wish.wishMsg();
        Wish wish=(i,j)-> System.out.println("Sum::"+(i+j));
        wish.add(10,20);
    }
}
