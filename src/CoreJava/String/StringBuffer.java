package String;

public class StringBuffer {


    /*
-> When we want a mutable String without thread-safety then StringBuilder should be used
-> When we want a mutable String with thread-safety then StringBuffer should be used
-> When we want an Immutable object then String should be used.
     */
    public static void main(String[] args) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Ashok");
        System.out.println(stringBuffer);
        //        1.append()
        stringBuffer.append("IT");
        System.out.println(stringBuffer);//AshokIT

//        String
        String str = "Ashok";
        str.concat("IT");
        System.out.println(str);//Ashok-Thats why string is calling immutable,buffer is mutable
//2.insert()
        stringBuffer.insert(2, 123);
        System.out.println(stringBuffer);
//        3.reverse()
        stringBuffer.reverse();
        System.out.println(stringBuffer);
//        replace()
        stringBuffer.replace(6, 11, "java");
        System.out.println(stringBuffer);
//        5.capacity()
        System.out.println(stringBuffer.capacity());
    }
}
