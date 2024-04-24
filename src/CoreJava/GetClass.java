package CoreJava;

public class GetClass {
    public static void main(String[] args) {
        StudentDemo s=new StudentDemo(1,"Ashok");
        System.out.println(s.getClass().getName());
        System.out.println(s.getClass().getSuperclass());
    }
}
class Student{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}