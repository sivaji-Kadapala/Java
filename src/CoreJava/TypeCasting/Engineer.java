package CoreJava.TypeCasting;

class Engineer {
void work(){
System.out.println("Engineer works");
}
}
class SoftwareEngineer extends Engineer {
void work(){
System.out.println("Software Engineer works");
}
}
class ElectricalEngineer extends Engineer {
void work(){
System.out.println("Electrical Engineer works");
}
}
class CivilEngineer extends Engineer {
void work(){
System.out.println("Civil Engineer works");
}
}
class Test{
public static void main(String[] args){
Engineer e=new SoftwareEngineer();
Engineer e1=new ElectricalEngineer();
    Engineer e2=new CivilEngineer();
e.work();
e1.work();
e2.work();
}
}