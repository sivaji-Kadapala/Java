package coding;

public class Code_10 {
    public static void main(String[]args){
        String str="Java Programming Language";
        String vowels="aeiouAEIOU";
        long count=str.chars().filter(c->vowels.indexOf(c)!=-1).count();
        System.out.println("Number of vowels in the string: " + count);
    }
}
