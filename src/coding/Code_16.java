package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code_16 {
    public static void main(String[]args){
        List<String> list1= Arrays.asList("java","python","c++","javascript","ruby");
        List<String> list2= Arrays.asList("html","css","java","sql","python");
        List<String> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(list3);
    }
}
