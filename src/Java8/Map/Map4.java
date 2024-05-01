package Java8.Map;

import java.util.Arrays;
import java.util.List;

public class Map4 {
    public static void main(String[] args) {
        Person p1=new Person("Raju","software",210831);
        Person p2=new Person("Gopi","Chef",210832);
        Person p3=new Person("Mahesh","PhotoGrapher",210833);
        Person p4=new Person("Sunil","Driver",210834);
        Person p5=new Person("Ashok","software",210835);

        List<Person> personList= Arrays.asList(p1,p2,p3,p4,p5);
        personList.stream().filter(person -> person.getJob().equals("software")).map(person -> person.getName()+"::"+person.getPhone()).forEach(System.out::println);
    }
}
