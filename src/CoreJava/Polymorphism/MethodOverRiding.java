package CoreJava.Polymorphism;
/*
Why should we go for Method overriding?
Whenever child class don't want to use definition written by the Parent class and want to
use its own logic then we have to use method overriding it means we have to override the
same method with new definition inside the child class.
 */
public class MethodOverRiding extends Animal {
    public void eat(){

        System.out.println("Dog eat meat");
    }
    public static void main(String[] args) {
        MethodOverRiding methodOverRiding=new MethodOverRiding();
        methodOverRiding.eat();
    }
}
