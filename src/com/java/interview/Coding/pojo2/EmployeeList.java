package com.java.interview.Coding.pojo2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {
    public static void main(String[] args) {
        //***1.Stream Initializations*************
        //1.form collection Object
        List<String> values=List.of("one","two","Three");
        Stream<String> stream1 = values.stream();
        //2.Arrays of values
        String[] names={"one","two","Three"};
        Stream<String> stream2 = Arrays.stream(names);
        //3.stream methods
        Stream<String> stream3 = Stream.of("one", "two", "Three");
        //4.generate()
        Stream<String> stream4 = Stream.generate(() -> "one");
        //5.builder
        //Builder Design pattern
        Stream.Builder<Object> stream5 = Stream.builder();
        Stream<Object> input = stream5.add("one").add("Two").add("Three").build();
        //6.empty stream
        //empty
        Stream.empty();
        //********Stream Operations*************
        List<Employee> employees=employeeLists();
        //req:get all employee names as list
        //with stream
        Stream<Employee> employeeStream1 = employees.stream();
        //you can not use stream second onwards,that is why creating every time new stream
        Stream<Employee> employeeStream2 = employees.stream();
        Stream<Employee> employeeStream3 = employees.stream();
        Stream<Employee> employeeStream4 = employees.stream();
        Stream<Employee> employeeStream5 = employees.stream();
        Stream<Employee> employeeStream6 = employees.stream();
        Stream<Employee> employeeStream7= employees.stream();
        Stream<Employee> employeeStream8 = employees.stream();
        Stream<Employee> employeeStream9 = employees.stream();
        Stream<Employee> employeeStream10= employees.stream();
        /*
        I am taking here new list of employees.I will not create every time new stream
         */
        List<Employee> employeeLists = new ArrayList<>();
        employeeLists.add(new Employee(5, "five", 19, "male", "Security", 2001, 45000.00,"Bangalore"));
        employeeLists.add(new Employee(6, "six", 56, "Female", "finance", 1977, 58800.00,"Delhi"));
        employeeLists.add(new Employee(7, "seven", 37, "male", "sales", 20005, 45000.00,"Tirupati"));
        employeeLists.add(new Employee(1, "one", 25, "male", "sales", 2015, 13000.00,"Hyderabad"));
        employeeLists.add(new Employee(2, "two", 32, "Female", "HR", 2011, 25000.00,"Pune"));
        employeeLists.add(new Employee(3, "three", 29, "male", "infrastructure", 2004, 14000.00,"Chennai"));
        employeeLists.add(new Employee(4, "four", 28, "Female", "development", 2016, 22000.00,"Hyderabad"));

        // pipeline is=source.intermediate.terminal
        //map internally takes functional interface Function
        List<String> AllEmployeeNames = employeeStream1.map(emp -> emp.getName()).toList();
        System.out.println(AllEmployeeNames);
        //Employee names,age >20

        //filter internally takes predicate
        //you can not use stream second onwards
        List<String> employeenamesWhosAgeGraterThanTwenty = employeeStream2.filter(emp -> emp.getAge() > 20).map(emp -> emp.getName()).toList();
        System.out.println(employeenamesWhosAgeGraterThanTwenty);
        //print all city names of the employees
        employeeStream3
                .map(emp -> emp.getCity())//intermediate
                .distinct()//intermediate
                .forEach(System.out::println);
        //Get Count of the employees whose salary is >20k
        long count = employeeStream4
                .filter(emp -> emp.getSalary() > 20000)
                .count();//terminal
        System.out.println(count);
        //get first three employee objects as a list
        //limit:Returns a stream consisting of the elements of this stream
        List<Employee> list = employeeStream5
                .limit(3)
                .toList();
        System.out.println(list);
        //here you will get output as object addresses,you initialise tostring in pojo,then you will get proper outputs
        //skip first 3 employees and i want to collect other employees data
        List<Employee> list1 = employeeStream6.skip(3).toList();
        System.out.println(list1);
        //anymatch,it will take internally predicate
        //verify any emp age < 18,you will get true or false
        boolean under18 = employeeStream7.anyMatch(emp -> emp.getAge() < 18);
        System.out.println(under18);
        //allMatch
        //check every employee joined after 2010 or not
        boolean after2010 = employeeStream8.allMatch(emp -> emp.getYearOfJoining() > 2010);
        System.out.println(after2010);
        //none: anyone is matching:false,no one matching:true
        //every employees salary under<10000
        boolean operation1 = employeeStream9.noneMatch(employe -> employe.getSalary() < 100000);
        System.out.println(operation1);
        //findAny
        //get one value from out of all values
        Employee operation2 = employeeStream10//employee objects stream
                .findAny().get();
        System.out.println(operation2);
        //findFirst
        //it always return first value
        Employee operation3 = employeeLists.stream().findFirst().get();
        System.out.println(operation3);
        //sorted
        //i have to get emp ids in sorted order
        List<Integer> operation4 = employeeLists.stream()//stream of employee objects
                .map(emp -> emp.getId())//stream of employee id values
                //5,6,7,1,2,3,4
                .sorted()
                //1,2,3,4,5,6,7
                .toList();
        System.out.println(operation4);
        //sorted:comparator Arg,actually it is used for comparing ,method is compareTo
        //Define sorting based on employee ids
        //sort employee objects
        List<Employee> operation5 = employeeLists.stream().sorted((e1, e2) -> {
            return e1.getId() - e2.getId();
        }).toList();
        System.out.println(operation5);
        //min
        //minimum salary employee details
        Employee operation6 = employeeLists.stream()
                .min((e1, e2) -> (int)(e1.getSalary() - e2.getSalary()))
                .get();
        System.out.println(operation6);
        //max
        //maximum salary employee details
        Employee operation7 = employeeLists.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(operation7);
        //average
        //average salary of employees
        //DoubleStream:Stream contains only double value

        //mapToLong:LongStream
        double operation8 = employeeLists.stream()
                .mapToDouble(emp -> emp.getSalary())
                .average()
                .getAsDouble();
        System.out.println(operation8);
        //mapToInt:IntegerStream
        //average age of employees
        double operation9 = employeeLists.stream()
                .mapToInt(e -> e.getAge())
                .average()
                .getAsDouble();
        System.out.println(operation9);
        //peek
        //out of all employees ,find those whose data of joining >2015
        //track how many employees are processed
        System.out.println("****peek********");
        List<Employee> operation10 = employeeLists.stream()
                .peek(System.out::println)//intermediate operation
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .toList();
        System.out.println(operation10);
        //parlelelStreams
        List<Employee> operation11 = employeeLists.parallelStream()
                .peek(System.out::println)//intermediate operation
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .peek(System.out::println)//intermediate operation
                .toList();
        System.out.println(operation11);
        //collect()
        //collectors:JDK 8
        //collect all the employee names whose age is greater than 25
        //normal way
        List<String> operation12 = employeeLists.stream().filter(emp -> emp.getAge() > 25).map(emp -> emp.getName()).toList();
        System.out.println(operation12);
        //collectors way
        List<String> operation13 = employeeLists.stream().filter(emp -> emp.getAge() > 25).map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(operation13);
        //get Unique department names
        //normal way
        List<String> operation14 = employeeLists.stream().map(emp -> emp.getDepartment()).distinct().toList();
        System.out.println(operation14);
        //collectors way
        Set<String> operations15 = employeeLists.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet());
        System.out.println(operations15);
        //collect employee id and salaries as map
        Map<Integer, Double> operation16 = employeeLists.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        System.out.println(operation16);
        //groupingBy()
        //get average salary  of each department
        Map<String, Double> operation17 = employeeLists.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        ));
        System.out.println(operation17);
        //count
        //get count of employees gender wise
        Map<String, Long> operation18 = employeeLists.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));
        System.out.println(operation18);
        //summing...
        //summarizing...
        //summing of all employee salaries
        System.out.println(employeeLists.stream().collect(Collectors.summingDouble(Employee::getSalary)));
        System.out.println(employeeLists.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
        //maxBy()
        //finding max age of employees
        //normal way
        Employee  operation19 =   employeeLists.stream().max((e1, e2) -> e1.getAge() - e2.getAge()).get();
        System.out.println(operation19);
        //collectors way
        Employee  operation20 =   employeeLists.stream().collect(Collectors.maxBy((e1, e2) -> e1.getAge() - e2.getAge())).get();
        System.out.println(operation20);
        //joining
        //All Department names with delimiter :::
        String operation21 = employeeLists.stream().map(Employee::getDepartment).collect(Collectors.joining(":::"));
        System.out.println(operation21);
    }


    private static List<Employee> employeeLists() {
        List<Employee> employeeLists = new ArrayList<>();
        employeeLists.add(new Employee(1, "one", 25, "male", "sales", 2015, 13000.00,"Hyderabad"));
        employeeLists.add(new Employee(2, "two", 32, "Female", "HR", 2011, 25000.00,"Pune"));
        employeeLists.add(new Employee(3, "three", 29, "male", "infrastructure", 2004, 14000.00,"Chennai"));
        employeeLists.add(new Employee(4, "four", 28, "Female", "development", 2016, 22000.00,"Hyderabad"));
        employeeLists.add(new Employee(5, "five", 19, "male", "Security", 2001, 45000.00,"Bangalore"));
        employeeLists.add(new Employee(6, "six", 56, "Female", "finance", 1977, 58800.00,"Delhi"));
        employeeLists.add(new Employee(7, "seven", 37, "male", "sales", 20005, 45000.00,"Tirupati"));
        return  employeeLists;
    }
}