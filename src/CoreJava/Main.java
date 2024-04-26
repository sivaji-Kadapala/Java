package CoreJava;

import java.util.Arrays;

final class ImmutableClass {
    private final int[] immutableArray;
    private final String immutableString;

    public ImmutableClass(int[] array, String str) {
        this.immutableArray = Arrays.copyOf(array, array.length);
        this.immutableString = str;
    }

    public int[] getImmutableArray() {
        return Arrays.copyOf(this.immutableArray, this.immutableArray.length);
    }

    public String getImmutableString() {
        return new String(this.immutableString);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String str = "Hello";

        ImmutableClass immutableObj = new ImmutableClass(array, str);

        // Attempt to modify the array directly
        // This will not modify the original array in the ImmutableClass
        array[0] = 5;

        // Attempt to modify the string directly
        // This will not modify the original string in the ImmutableClass
        str += " World";

        // Retrieve a copy of the array and string from the ImmutableClass
        int[] copiedArray = immutableObj.getImmutableArray();
        String copiedString = immutableObj.getImmutableString();

        // Print the copied array and string
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        System.out.println("Copied String: " + copiedString);
    }
}
