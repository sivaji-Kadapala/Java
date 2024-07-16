package Java8.FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerTraditionalDemo implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
       Consumer<String> consumer=new ConsumerTraditionalDemo();
       consumer.accept("Sivaji");
    }
}
