package InterviewsCoding;

import java.util.Arrays;
import java.util.List;

public class AllTheEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,8,9);
        boolean result=list.stream().allMatch(n->n%2==0);
        if (result) {
            System.out.println("Even");
        }else{
            System.out.println("Not Even");
        }
    }
}
