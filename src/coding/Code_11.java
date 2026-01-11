package coding;

import java.util.Arrays;

public class Code_11 {
    public static void main(String[]args){
        int[] list={5,10,15,20,25};
        int largest= Arrays.stream(list).max().getAsInt();
        System.out.println("The largest number in the array is: " + largest);
    }
}
