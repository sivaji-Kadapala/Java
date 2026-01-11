package coding;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class code_17 {
    public static void main(String[]args){
        String sentence="The quick brown fox jumps over the lazy dog";
        String collect = Arrays.stream(sentence.trim().split("\\s+")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
