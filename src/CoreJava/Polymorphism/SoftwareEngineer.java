package CoreJava.Polymorphism;

public class SoftwareEngineer extends  Engineer{

    void work() {
        super.work();
        System.out.println("Software Engineer Works");
    }

    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer=new SoftwareEngineer();
        softwareEngineer.work();
    }
}
