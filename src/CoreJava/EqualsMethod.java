package CoreJava;
/*
this method compares the 2 references whether they contain same object or not bydefault.
but if we want to compare the equality of the content of 2 objects then we have to override
equals() method with in the particular class.

StringBuffer class is not overriding equals()


 */
public class EqualsMethod {
    public static void main(String[] args) {
        String string1=new String("ashok");
        String string2=new String("ashok");
        System.out.println(string1.equals(string2));//true
        EqualsMethod equalsMethod=new EqualsMethod();
        EqualsMethod equalsMethod1=new EqualsMethod();
        System.out.println(equalsMethod.equals(equalsMethod1));//false
    }
}
