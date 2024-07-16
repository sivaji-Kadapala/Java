package Java8.FunctionalInterface;

public interface Vehicle {
   void cleanVehicle();
   default void startVehicle(){
       System.out.println("Start the vehicle !");
   }
   static void colorVehicle(){
       System.out.println("Green Color vehicle !");
   }
}
interface  Engine{
    void petrolEngine();
    default void dieselEngine(){
        System.out.println("Fill with diesel !");
    }
    static void colorEngine(){
        System.out.println("Red Color Engine !");
    }
}
class  Car implements Vehicle,Engine{

    @Override
    public void cleanVehicle() {
        System.out.println("Clean the car !");
    }
    @Override
    public void petrolEngine() {
        System.out.println("Fill with petrol !");
    }
    //        lambda
    void m1(){
        System.out.println("m1");
    }
    public static void main(String[] args) {
        Car car=new Car();
        car.startVehicle();
        car.cleanVehicle();
        car.petrolEngine();
        car.dieselEngine();
        Vehicle.colorVehicle();
        Engine.colorEngine();
        car.m1();
    }
}
