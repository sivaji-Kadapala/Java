package CoreJava.encapsulation;

public class Demo {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPerc() {
        return perc;
    }

    public void setPerc(double perc) {
        this.perc = perc;
    }

    private int age;
    private double perc;
}
class  Test{
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.setAge(27);
        System.out.println(obj.getAge());
        obj.setPerc(78.91);
        System.out.println(obj.getPerc());
    }
}