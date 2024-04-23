package CoreJava.TypeCasting;
/*
-> Widening means converting the value from lower data type into higher data type.
syntax:
higher datatype = (higher datatype) lower datatype ;
-> Here data type specified in between the pair of parentheses is called type casting.
-> In widening writing the type casting is optional
-> If we don’t write any type casting then compiler will write the type casting automatically
hence it is called as implicit type casting.
 */
public class Widening {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        double data=num;
        System.out.println(data);
    }
}
