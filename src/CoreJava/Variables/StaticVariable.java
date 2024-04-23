package CoreJava.Variables;

public class StaticVariable {

/*
-> If we want to store different value based on object then use instance variable
-> If we want to store same value for all objects then use static variable
 */
     static String institute;
     String  name;
     String email;

    public static void main(String[] args) {
        StaticVariable.institute="ashokit";
        StaticVariable staticVariable=new StaticVariable();
        staticVariable.name="Sivaji";
        staticVariable.email="sivaji@gmai.com";
    }
}
