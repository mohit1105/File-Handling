package FileHandling;
import java.io.File;
import java.io.IOException;

public class createNewFile {
    public static void main(String[] args) {

        File myFile = new File("Newfile.java");
        try {
            myFile.createNewFile();
            System.out.println("Successfully create a file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to create file");
        }
    }

}
