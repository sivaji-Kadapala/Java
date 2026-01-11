package coding;

import java.util.Arrays;

public class Code_19 {
    public static void main(String[]args){
        String sentence="This is a sample sentence for counting words";
        long count = Arrays.stream(sentence.trim().split("\\s+")).count();
        System.out.println("The number of words in the sentence is: " + count);
    }
}
