package Java11.StringMethods;

public class StripLeadingDemo {
    public static void main(String[] args) {
        String msg=" Hellow World!   ";
        String stripLeading = msg.stripLeading();
        String stripTrailing = msg.stripTrailing();
        System.out.println("Original String " +msg);
        System.out.println(" Modified String "+stripLeading);
        System.out.println(" Modified stripTrailing String "+stripTrailing);
    }
}
