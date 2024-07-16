package Java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class AshokIt2 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        Collections.sort(al,(o1,o2)->(o1>o2)?1:(o1<o2)?-1:0);
        System.out.println(al);
    }
}
