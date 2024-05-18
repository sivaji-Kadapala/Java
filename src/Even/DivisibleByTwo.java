package Even;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByTwo {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(2,4,1,14,26,13);
//       boolean flag= list.stream().allMatch(n->n%2==0);
//        if (flag) {
//            System.out.println("all numbers divisible by 2");
//        }else{
//            System.out.println("all numbers not divisible by 2");
//        }
//        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenList);
//        List<Integer> oddList = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddList);
//     List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        System.out.println(list.stream().allMatch(n->n%2==0)?
//                "divisible by 2":"not divisible by 2");
//        List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
//        List<Integer> odd=list.stream().filter(n->n%2!=0).collect(Collectors.toList());
//        System.out.println(even);
//        System.out.println(odd);
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,10);
        boolean divisibleBy2=true;
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for (int n:list
             )
        {
            if (n%2 ==0) {
                even.add(n);
            }  else {
                odd.add(n);
                divisibleBy2=false;
            }
        }
        System.out.println(divisibleBy2?"divisibleby 2":"not divisible by 2");
        System.out.println(even);
        System.out.println(odd);

    }
}
