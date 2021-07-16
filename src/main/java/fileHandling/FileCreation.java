package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\karth\\Downloads\\chromedriver\\FileNew.txt");
            file.createNewFile();
        }
        catch (IOException e){
e.printStackTrace();
        }
    }
}
