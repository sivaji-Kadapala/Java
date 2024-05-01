package Java11.Collecton;

import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String > list= Arrays.asList("Sivaji","Srinu");
        //old way
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(strings.length);
        //new way
        String[] strings1 = list.toArray(String[]::new);
        System.out.println(strings1.length);
    }
}
