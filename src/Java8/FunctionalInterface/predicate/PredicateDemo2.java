package Java8.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    static boolean isPersonEligibleForMembership(Person person,Predicate<Person> predicate){
        return predicate.test(person);
    }
    public static void main(String[] args) {
       Person person=new Person("Sivaji",27);
       Predicate<Person> greaterThanEighteen=(p)->p.age>18;
       Predicate<Person> lessThanSixty=(p)->p.age<60;
       Predicate<Person> predicate=greaterThanEighteen.or(lessThanSixty);
       boolean eligible=isPersonEligibleForMembership(person,predicate);
        System.out.println("Person is eligible for membership: "+eligible);
    }
}
