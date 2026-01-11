package coding;

import java.util.*;
import java.util.stream.Collectors;

public class Code_23 {
    public static void main(String[]args){
        String sentence="This is a sample sentence with sample words and with some duplicate words";
       String[] uniqueWords = sentence.split("\\s+");
        Set<String> distinctWords = Arrays.stream(uniqueWords).collect(Collectors.toSet());
        System.out.println("The unique words in the sentence are: " + distinctWords);
    }
}
