package Java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner myString=new StringJoiner("-","(",")");
        myString.add("ashok");
        myString.add("it");
        myString.add("java");
        System.out.println(myString
        );
    }
}
