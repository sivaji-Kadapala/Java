package Length;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGT5 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sivaji","ravi","sivakrishna","anudeep","nagendra","jeevan");
        long count = list.stream().filter(str -> str.length() > 5).count();
        System.out.println(count);
        List<String> newList=list.stream().filter((s)->s.length()>5).collect(Collectors.toList());
        System.out.println(newList);
    }
}
