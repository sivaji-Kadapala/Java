package File.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("AshokIt.txt");
            ObjectInputStream in=new ObjectInputStream(fin);
            Employee emp1=(Employee) in.readObject();
            in.close();
            System.out.println("DeSerialization successful");
            System.out.println("Name:"+emp1.name);
            System.out.println("id:"+emp1.id);
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
