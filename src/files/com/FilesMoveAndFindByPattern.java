package files.com;

import java.io.*;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class FilesMoveAndFindByPattern {

	public static void main(String[] args) throws IOException {
		
//		Path source = Paths.get("D:\\files\\program6.txt");
//		 Path dest = Paths.get("D:\\program\\program6.txt");
//        
//        Files.move(source,dest);
//        System.out.println("Moved");
		
		 File f = new File("D:\\files");
		  
         
         FileFilter filter = new FileFilter() {

             public boolean accept(File f)
             {
                 return f.getName().endsWith("txt");
             }
         };

         File[] files = f.listFiles(filter);

         System.out.println("Files are:");

         for (int i = 0; i < files.length; i++) {
             System.out.println(files[i].getName());
         }
		
         
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
