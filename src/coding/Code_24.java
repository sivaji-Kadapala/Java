package coding;

import java.util.List;

public class Code_24 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all numbers in the list: " + sum);
    }
}
