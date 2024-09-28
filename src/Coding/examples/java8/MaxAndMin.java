package InterviewsCoding.examples.java8;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }}
public class MaxAndMin {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Jane", 30),
                new Person("Tom", 20),
                new Person("Lucy", 35)
        );
        List<Integer> anyList= Arrays.asList(1,2,3,4,5,6);
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
//        Logic-1
        Optional<Person> minAge = people.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(minAge);
        Optional<Person> maxAge = people.stream().max(Comparator.comparing(Person::getAge));
        System.out.println(maxAge);
        Person MaxAge2 = people.stream().min(Comparator.comparing(Person::getAge)).get();
        System.out.println(MaxAge2);
//        logic-2
        Integer max = anyList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        Integer min = anyList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
        String min3 = words.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min3);
        String max3 = words.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max3);
        //        logic-3
        int min2= Collections.min(anyList);
        System.out.println(min2);
        int max2=Collections.max(anyList);
        System.out.println(max2);
        //max and min of three numbers
        List<Integer> collect = anyList.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> collect1 = anyList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
