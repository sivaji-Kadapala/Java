package CoreJava.Inheritance;

public class Child extends Parent {
    String name;

    public Child(String n1, String n2) {
        /*


Q. Can we use both this () and super () in a Constructor?
NO, because both super () and this () must be first statement inside a constructor. Hence,
we cannot use them together



When calling the parent class constructor from the child class using super keyword,
super keyword should always be the first line in the method/constructor of the child class
         */
        super(n1);
        this.name = n2;
    }

    public void c1() {
        System.out.println("Child method");
            /*
super keyword is used to refer to immediate parent class of a child class. In other
words super keyword is used by a subclass whenever it need to refer to its immediate super
class
             */
        super.name = "parent";
        name = "child";
        System.out.println(super.name + " " + name);
        super.p1();
    }

    public static void main(String[] args) {
        Child child = new Child("Parent", "Child");
        child.c1();
    }
}
