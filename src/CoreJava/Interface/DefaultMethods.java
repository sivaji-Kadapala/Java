package CoreJava.Interface;

public interface DefaultMethods {
    void cleanVehilcle();
    static void cleanVehicle2(){
        System.out.println("Static method-I am cleaning vehicle");
    }
    default void startVehicle(){
        System.out.println("vehilcle is starting...");
    }
}
