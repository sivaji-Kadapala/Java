package CoreJava;

public class HashCode {
    public static void main(String[] args) {
        HashCode u1=new HashCode();
        System.out.println(u1.hashCode());
        HashCode u2=new HashCode();
        System.out.println(u2.hashCode());
//      No two objects will have same hashcode

        StudentDemo student=new StudentDemo(1,"Ashok");
        StudentDemo student1=new StudentDemo(2,"Sivaji");
        System.out.println(student1.hashCode());
        System.out.println(student.hashCode());
    }
}
class StudentDemo {
    static int count=1;
    int rno;
    String name;
    StudentDemo(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public int hashCode(){
        return count++;
    }
}
