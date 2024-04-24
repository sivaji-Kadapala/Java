package CoreJava;

public class Clonable_Two implements Cloneable {
    int rno;
    String name;
    Clonable_Two(int rno,String name){
        this.rno=rno;
        this.name=name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Clonable_Two clonable_one=new Clonable_Two(1,"Sachin");
        System.out.println(Clonable_One.rno+"\t"+Clonable_One.name);
        Clonable_Two clonable_one1= (Clonable_Two) clonable_one.clone();
        System.out.println(clonable_one1.rno+"\t"+clonable_one1.name);
        clonable_one1.rno=7;
        clonable_one1.name="dhoni";
        System.out.println(clonable_one.rno+"\t"+clonable_one.name);
        System.out.println(clonable_one1.rno+"\t"+clonable_one1.name);
    }
}
