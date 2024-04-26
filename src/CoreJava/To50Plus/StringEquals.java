package CoreJava.To50Plus;

public class StringEquals {
/*
When you use “==” (i.e. shallow comparison), you are actually comparing the two object references to see if they point to the same object.
When you use “equals(…)”, which is a “deep comparison” that compares the actual string values.
 */
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2=new String(s1);
        String s3=new String("Hello");
        String s4="A";
        String s5="A";
        System.out.println(s1+" equals "+s2+" -->"+s1.equals(s2));
        System.out.println(s1+" == "+s2+" -->"+(s1==s2));
        System.out.println(s1+" == "+s2+" -->"+(s1==s3));
    }
}


