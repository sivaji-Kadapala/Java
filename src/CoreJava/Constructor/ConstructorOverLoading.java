package CoreJava.Constructor;

public class ConstructorOverLoading {
    int age;
    String name;
    String  name2;
    public ConstructorOverLoading(int i, String sivaji) {
        age=i;
        name=sivaji;
    }

    public ConstructorOverLoading(String ashok) {
        name2=ashok;
    }

    /*
        defining two or more constructors with the same name but with different
        signatures is called constructor overloading in java. It is used to perform different tasks.
         */
    public static void main(String[] args) {
        ConstructorOverLoading constructorOverLoading=new ConstructorOverLoading(20,"Sivaji");
        System.out.println(constructorOverLoading.age+" "+constructorOverLoading.name);
        ConstructorOverLoading constructorOverLoading1=new ConstructorOverLoading("Ashok");
        System.out.println(constructorOverLoading1.name2);
    }
}
