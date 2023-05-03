package files.com;

import java.io.File;
import java.io.IOException;

public class FileHiddenAndParent {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\files");
		 if(file.mkdir()) {
	         System.out.println("Directory is created");
	     }
	     else {
	    	 System.out.println("Directory cannot be created");
	     }
		 
		 File f5 = new File("D:\\files\\program5.txt");
		 f5.createNewFile();
		 
		 File f6 = new File("D:\\files\\program6.txt");
		 f6.createNewFile();
		 
		 File f7 = new File("D:\\files\\program7.txt");
		 f7.createNewFile();
		 
		 
		 //f5-hidden and f5-not hidden
		 if (f5.isHidden())
	            System.out.println("File Hidden");
	        else
	            System.out.println("File Not Hidden");
		 
		 
	}
	

}
