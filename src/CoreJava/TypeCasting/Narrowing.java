package CoreJava.TypeCasting;
/*
-> narrowing means converting the higher data type value into smaller data type.
syntax:
lowerdatatype = (lowerdatatype) higherdatatype;
-> In narrowing writing the type casting is mandatory
-> In narrowing if we don’t write any type casting then compiler wont write any typecasting
because there is a chance of loss of some data so that user has to write the typecasting
explicitly hence it is called as explicit type casting
 */
public class Narrowing {
    public static void main(String[] args) {
        double num=10.99;
        System.out.println(num);
        int data= (int) num;
        System.out.println(data);
    }
}
