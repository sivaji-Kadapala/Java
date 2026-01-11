package coding;

import java.util.List;
import java.util.stream.Stream;

public class Code_15 {
    public static void main(String[]args){
        var list= List.of("1234","xy123"," ","abcd5678","!@#$$%6789");
        Stream<String> digits = list.stream().filter(i -> i.matches("\\d+"));
        digits.forEach(System.out::println);
    }
}
