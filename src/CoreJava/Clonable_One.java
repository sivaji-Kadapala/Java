package CoreJava;

public class Clonable_One implements Cloneable {
    static int rno;
    static String name;
    Clonable_One(int rno,String name){
        this.rno=rno;
        this.name=name;
    }

    public static void main(String[] args) {
        Clonable_One clonable_one=new Clonable_One(1,"Sachin");
        System.out.println(clonable_one.rno+"\t"+clonable_one.name);
        Clonable_One clonable_one1=clonable_one;
        System.out.println(clonable_one1.rno+"\t"+clonable_one1.name);
        clonable_one1.rno=7;
        clonable_one1.name="dhoni";
        System.out.println(clonable_one.rno+"\t"+clonable_one.name);
        System.out.println(clonable_one1.rno+"\t"+clonable_one1.name);
    }
}
