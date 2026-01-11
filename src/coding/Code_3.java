package coding;

import java.util.List;

public class Code_3 {
    public static void main(String[]args){
        List<String> words=List.of("apple","banana","cherry","date");
        int asInt = words.stream().mapToInt(String::length).max().getAsInt();
        System.out.println("The length of the largest word is: " + asInt);
    }
}
