package InterviewsCoding.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class MaxProductOfThree {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-10, -10, 5, 2, 6, 8);

        // Sort the list
        Collections.sort(nums);

        // Case 1: Product of the three largest numbers
        int n = nums.size();
        int product1 = nums.get(n - 1) * nums.get(n - 2) * nums.get(n - 3);

        // Case 2: Product of the two smallest (most negative) numbers and the largest number
        int product2 = nums.get(0) * nums.get(1) * nums.get(n - 1);

        // The maximum of these two products
        int maxProduct = Math.max(product1, product2);

        // Output the result
        System.out.println("Maximum product of three integers: " + maxProduct);
    }
}
