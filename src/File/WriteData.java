package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        File myFile=new File("AshokIt.txt");
        try{
            FileWriter fileWriter=new FileWriter(myFile);
            fileWriter.write("Ashok IT-Learn Here.. Lead Anywhere...");
            fileWriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done...");
    }
}
