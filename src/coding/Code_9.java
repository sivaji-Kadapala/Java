package coding;

import java.util.stream.IntStream;

public class Code_9 {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int n=arr.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum= IntStream.of(arr).sum();
        int missingNumber=expectedSum-actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
