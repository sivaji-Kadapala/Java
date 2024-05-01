package Java11.StringMethods;

import java.util.stream.Collectors;

public class LinesDemo {
    public static void main(String[] args) {
        {
            String str = "Geeks\nFor\nGeeks";
            System.out.println(
                    str.lines().collect(Collectors.toList()));
        }
    }
}
