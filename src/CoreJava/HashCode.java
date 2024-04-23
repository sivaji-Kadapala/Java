package CoreJava;

public class HashCode {
    public static void main(String[] args) {
        HashCode u1=new HashCode();
        System.out.println(u1.hashCode());
        HashCode u2=new HashCode();
        System.out.println(u2.hashCode());
//      No two objects will have same hashcode
    }
}
