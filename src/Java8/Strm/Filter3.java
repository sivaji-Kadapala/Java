package Java8.Strm;

import java.util.Arrays;
import java.util.List;

public class Filter3 {
    public static void main(String[] args) {
        Person p1=new Person("Raju",28,"software");
        Person p2=new Person("Mahesh",29,"Driver");
        Person p3=new Person("Ashok",3,"Teacher");
        List<Person> personList= Arrays.asList(p1,p2,p3);
        personList.stream().filter(p->p.getAge()>21&&p.getAge()<30&&p.getJob().equals("software")).forEach(System.out::println);
    }
}
