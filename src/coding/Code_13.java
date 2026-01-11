package coding;

public class Code_13 {
    public static void main(String[]args){
        String str="Hello World";
        String reversed=str.chars().mapToObj(c->String.valueOf((char) c)).reduce("",(a,b)->b+a);
        System.out.println("Reversed string: " + reversed);
    }
}
