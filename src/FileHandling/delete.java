package FileHandling;

import java.io.File;

public class delete {
	public static void main(String[] args) {

        File myFile = new File("Newfile.java");
        if(myFile.delete())
        {
        	System.out.println("Delete a "+myFile.getName());
        }
        else
        {
        	System.out.println(myFile.getName()+" is not deleted");
        }
    }

}
