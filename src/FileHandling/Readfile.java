package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("Newfile.java");
		try {
			Scanner s = new Scanner(myFile);
			while(s.hasNextLine()) {
				String l = s.nextLine();
				System.out.println(l);
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
