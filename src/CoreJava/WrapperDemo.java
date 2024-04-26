package CoreJava;

public class WrapperDemo {
    public static void main(String[] args) {
        int a=10;
//        Integer p=new Integer(a);//boxing
        Integer p1=Integer.valueOf(a);
        System.out.println(p1);
        int p2=p1.intValue();
        System.out.println(p2);//unboxing
        String b="120";
//        Integer q=new Integer(b);//boxing
        Integer q1=Integer.valueOf(b);
        System.out.println(q1);
//        System.out.println(q);

    }
}
