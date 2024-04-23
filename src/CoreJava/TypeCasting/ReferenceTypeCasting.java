package CoreJava.TypeCasting;
/*
Up casting
-> Up casting means storing the child class object into the parent class reference.
syntax:
parentreferencetype = (parentreferencetype) childreferencetype
Note: In up casting writing typecasting is optional
Down casting
-> Down casting means storing the Parent class object into the child class reference.
syntax: childreferencetype = (childreferencetype) parentreferencetype
Note: In down casting writing typecasting is mandatory
 */
public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.show();
        parent=(Parent) new Child();//typecasting optional(upcasting)
        parent.show();
        Child child= (Child) parent;//typecasting mandatory(downcasting)
        child.show();
    }
}
