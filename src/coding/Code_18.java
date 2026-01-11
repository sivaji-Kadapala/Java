package coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Code_18 {
    static void main() {
    String sentence = "This is a sample sentence for counting words";
        Optional<String> max = Arrays.stream(sentence.trim().split("\\s+")).max(Comparator.comparingInt(String::length));
        if (max.isPresent()) {
            System.out.println("The longest word is: " + max.get());
        }else {
            System.out.println("No words found.");
        }
    }
}
