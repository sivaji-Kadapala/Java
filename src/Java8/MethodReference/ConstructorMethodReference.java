package Java8.MethodReference;

import java.util.function.Supplier;

class Sample{
    public Sample(){
        System.out.println("Sample::Constructor");
    }
}
public class ConstructorMethodReference {
    public static void main(String[] args) {
        Supplier<Sample> i=Sample::new;
        System.out.println(i.get().hashCode());
    }
}
