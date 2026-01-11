package coding;

import java.util.Map;
import java.util.stream.Collectors;

public class Code_20 {
    public static void main(String[]args){
        String str="Hello World";
        Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }
}
