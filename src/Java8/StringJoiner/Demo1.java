package Java8.StringJoiner;

import java.util.StringJoiner;
// Using this class we can join more than one strings with the specified delimiter, we can
//also provide prefix and suffix to the final string while joining multiple strings
public class Demo1 {
    public static void main(String[] args) {
        StringJoiner myString=new StringJoiner("_");
        myString.add("ashok");
        myString.add("it");
        myString.add("java");
        System.out.println(myString);
        StringJoiner myString1=new StringJoiner("_","(",")");
        myString1.add("ashok");
        myString1.add("it");
        myString1.add("java");
        System.out.println(myString1);
    }
}
