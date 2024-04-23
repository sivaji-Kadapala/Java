package CoreJava.AbstractDemo;

public class Car extends Vehicle{
    @Override
    public void engine() {
        System.out.println("Car engine");
    }

    public static void main(String[] args) {
        Vehicle vehicle=new Car();
        vehicle.engine();
    }
}
