package Java8.StaticAndDefaultMethods;
interface Vehicle{
    static void cleanVehicle(){
        System.out.println("I am cleaning the vehicle");
    }
    default void startVehicle(){
        System.out.println("vehicle is starting");
    }
    void washVehicle();
}
public class Car implements Vehicle{
    @Override
    public void washVehicle() {
        System.out.println("wash the vehicle");
    }

    public static void main(String[] args) {
        Car car=new Car();
        //calling abstractmethod
        car.washVehicle();
        //calling default method
        car.startVehicle();
        //calling static method by using Interface name
        Vehicle.cleanVehicle();
    }
}
