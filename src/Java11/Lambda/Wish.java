package Java11.Lambda;
@FunctionalInterface
public interface Wish {
    void wishMsg();
}
class Greeting{
    public static void main(String[] args) {
        Wish wish=()-> System.out.println("Hello !");
        wish.wishMsg();
    }
}
