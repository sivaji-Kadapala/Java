package Java8.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MatchingOperation {
    public static void main(String[] args) {
        List<People> list=new ArrayList<>();
        list.add(new People("David",23,"India"));
        list.add(new People("Sivaji",27,"India"));
        list.add(new People("Joy",25,"USA"));
        list.add(new People("Ryan",50,"Canada"));
        list.add(new People("Ram",45,"India"));
        list.add(new People("Ching",56,"China"));

        boolean isIndiansAvailable=list.stream().anyMatch(p->p.getCountry().equals("India"));
        System.out.println("Is Indians Available in Collection::"+isIndiansAvailable);

        boolean allMatch=list.stream().allMatch(p->p.getCountry().equals("India"));
        System.out.println("Is Indians Available in Collection::"+allMatch);

        boolean noneMatch=list.stream().noneMatch(p->p.getCountry().equals("India"));
        System.out.println("Is Indians Available in Collection::"+noneMatch);

//        Find Operations
        Optional<People> findFirst=list.stream().filter(p->p.getCountry().equals("India")).findFirst();
        Optional<People> findAny=list.stream().filter(p->p.getCountry().equals("India")).findAny();
        if (findAny.isPresent()) {
            System.out.println(findAny.get());
        }
        if (findFirst.isPresent()) {
            System.out.println(findFirst.get());
        }

    }
}
