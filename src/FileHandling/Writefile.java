package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("Newfile.java");
        try {
            FileWriter fileWriter = new FileWriter("Newfile.java");
            fileWriter.write("Write a code in a class");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write");
        }


	}

}
