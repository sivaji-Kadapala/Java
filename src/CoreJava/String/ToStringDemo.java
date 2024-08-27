package String;

public class ToStringDemo {
    public static void main(String[] args) {
        Student student=new Student(1,"Sivaji");
        System.out.println(student);
        System.out.println(student.toString());
        String name="Sivaji";
        String anotherName="Sivaji";
        System.out.println(name==anotherName);
    }
}
