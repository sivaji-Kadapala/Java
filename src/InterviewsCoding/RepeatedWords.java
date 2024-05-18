package InterviewsCoding;

import java.util.Arrays;
import java.util.List;

public class RepeatedWords {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","apple","grapes","orange");
        long count=words.stream().filter(word->word.equals("apple")).count();
        System.out.println(count);
    }
}
