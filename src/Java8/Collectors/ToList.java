package Java8.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void printNames(List<String> empNames){
        System.out.println(empNames);
    }
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Ram",23,20000));
        list.add(new Employee("Ashok",25,30000));
        list.add(new Employee("Suresh",33,25000));
        list.add(new Employee("Charan",26,40000));
        List<String> empNames=list.stream().map(e->e.getName()).collect(Collectors.toList());
        printNames(empNames);
    }
}
