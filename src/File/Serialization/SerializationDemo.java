package File.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try{
            Employee employee=new Employee("Sivaji",19);
            FileOutputStream fout=new FileOutputStream("AshokIt.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(employee);
            out.flush();
            out.close();
            System.out.println("Serialization successful");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
