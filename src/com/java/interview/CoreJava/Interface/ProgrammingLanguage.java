package java.interview.CoreJava.Interface;

public class ProgrammingLanguage implements Language{
    @Override
    public void getName(String name) {
        System.out.println("Programming Language "+name);
    }
}
