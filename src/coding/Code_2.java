package coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code_2 {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(101,"Alice",60000));
        employees.add(new Employee(102,"Bob",55000));
        employees.add(new Employee(103,"Charlie",70000));
        Map<Integer, Employee> collect = employees.stream().collect(Collectors.toMap(Employee::getEmpno, emp -> emp));
        System.out.println(collect);
    }
}
