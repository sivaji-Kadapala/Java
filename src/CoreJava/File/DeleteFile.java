package File;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("AshokIt.txt");
        if (file.delete()) {
            System.out.println("I have deleted:"+file.getName());
        }else{
            System.out.println("Some problem occurred");
        }
    }
}
