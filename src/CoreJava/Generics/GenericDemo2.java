package Generics;

public class GenericDemo2<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        GenericDemo2<Integer> obj1=new GenericDemo2<>();
        obj1.set(123);
        Integer intValue = obj1.get();
        System.out.println(intValue);
        GenericDemo2<String> obj2=new GenericDemo2<>();
        obj2.set("Sivaji Kadapala");
        String stringValue=obj2.get();
        System.out.println(stringValue);
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};
        GenericDemo2.printArray(intArray); // Prints integers
        GenericDemo2.printArray(strArray); // Prints strings
    }
}
