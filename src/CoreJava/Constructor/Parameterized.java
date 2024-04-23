package CoreJava.Constructor;

public class Parameterized {
    int age;
    String name;
    public Parameterized(int i, String ashok) {
        age=i;
        name=ashok;
    }

    public static void main(String[] args) {
        Parameterized parameterized=new Parameterized(20,"Ashok");
        System.out.println(parameterized.age);
        System.out.println(parameterized.name);
    }
}
