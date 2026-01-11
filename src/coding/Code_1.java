package coding;

import java.util.stream.IntStream;

public class Code_1 {
    static void main() {
        IntStream.rangeClosed(1,100).forEach(System.out::println);
    }
}
