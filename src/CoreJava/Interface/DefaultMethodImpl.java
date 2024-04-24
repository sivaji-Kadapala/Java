package CoreJava.Interface;

public class DefaultMethodImpl  implements DefaultMethods{
    @Override
    public void cleanVehilcle() {
        System.out.println("Cleaning the Vehicle");
    }

    public static void main(String[] args) {
        DefaultMethodImpl defaultMethod=new DefaultMethodImpl();
        defaultMethod.cleanVehilcle();
        defaultMethod.startVehicle();
//Static method calling
        DefaultMethods.cleanVehicle2();
    }
}
