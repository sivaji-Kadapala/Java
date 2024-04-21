package Duplicate;

import java.util.HashMap;
import java.util.Map;

public class DuplicateViaMethod {
    public static void main(String[] args) {
        String name="Sivaji_kadapala";
        countDuplicateChars(name);
    }

    private static void countDuplicateChars(String name) {
        char[] charArray=name.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:charArray
             ) {
            if (!map.containsKey(Character.toLowerCase(c))) {
                map.put(Character.toLowerCase(c),1);
            }else{
                map.put(c,map.get(c)+1);
            }

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
