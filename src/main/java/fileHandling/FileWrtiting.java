package fileHandling;

import java.io.*;

public class FileWrtiting {

    public static void main(String[] args) {
try{
    FileWriter mywriter = new FileWriter("C:\\Users\\karth\\Downloads\\chromedriver\\FileNew.txt");

    mywriter.write("welcome to india");

    mywriter.close();
} catch (IOException e){
    System.out.println("unable to write");
}

    }
}
