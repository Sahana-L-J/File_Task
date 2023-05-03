package files.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class FilesCopyAndList {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\programfiles");
		 if(file.mkdir()) {
	         System.out.println("Directory is created");
	     }
	     else {
	    	 System.out.println("Directory cannot be created");
	     }
		 
		 File f1 = new File("D:\\programfiles\\program1.txt");
		 f1.createNewFile();
		 
		 File f2 = new File("D:\\programfiles\\program2.txt");
		 f2.createNewFile();
		 
		 String[] files = file.list();
		  
         System.out.println("Files are:");

         for (int i = 0; i < files.length; i++) {
             System.out.println(files[i]);
         }
         
         
//		 Path source = Paths.get("D:\\programfiles\\program2.txt");
//		 Path dest = Paths.get("D:\\program\\program2.txt");
//         
//         Files.copy(source,dest);
         
         FileInputStream fis = null;
         FileOutputStream fos = null;
  
             fis = new FileInputStream("D:\\programfiles\\program1.txt");
  
             fos = new FileOutputStream("D:\\files\\program6.txt");
  
             int c;
  
             while ((c = fis.read()) != -1) {
                 fos.write(c);
             }
  
             System.out.println("copied the file successfully");
         
  
                 fis.close();
                 fos.close();
        
	}
}
