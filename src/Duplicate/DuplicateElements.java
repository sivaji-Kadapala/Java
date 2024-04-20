package Duplicate;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Master","Madam","Sir","Student","Master","Sir");
//List<String> duplicateElements=new ArrayList<>();
//for(String data:list){
//    if (duplicateElements.contains(data)) {
//        duplicateElements.add(data);
//    }
//}
//duplicateElements.forEach(System.out::println);


//        second way
//        Set<String> set=new HashSet<>(list);
//        set.forEach(System.out::println);


//        3rd way
        List<String> newlist=new ArrayList<>();
        newlist=list.stream().distinct().collect(Collectors.toList());
        System.out.println(newlist);
    }
}
