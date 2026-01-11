package coding;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Code_21 {
    public static void main(String[]args){
        List<Integer> list=List.of(10,20,30,40,40,50);
        Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        first.ifPresent(System.out::println);
    }
}
