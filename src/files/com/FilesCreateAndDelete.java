package files.com;

import java.io.*;

public class FilesCreateAndDelete {

	public static void main(String[] args) throws IOException {
		 File file = new File("D:\\program");
		 if(file.mkdir()) {
	         System.out.println("Directory is created");
	     }
	     else {
	    	 System.out.println("Directory cannot be created");
	     }
		 
		 File f = new File("D:\\program\\program.txt");
		if (f.createNewFile())
			 System.out.println("File created");
		else
			 System.out.println("File already exists");
		 
         
         File f1 = new File("D:\\program\\program1.txt");
         if (f1.createNewFile())
		     System.out.println("File created");
		 else
		     System.out.println("File already exists");
         
         
		
	     if (f.delete()) {
	         System.out.println("File deleted successfully");
	     }
	     else {
	         System.out.println("Failed to delete the file");
	     }

	}

}
