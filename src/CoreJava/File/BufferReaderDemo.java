package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderDemo {
    public static void main(String[] args) {
        File file = new File("AshokIt.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
