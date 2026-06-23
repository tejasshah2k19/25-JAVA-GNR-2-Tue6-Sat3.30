package fileio.backup;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException{

		//File -> io 
		//import java.io.File; 
		
		//how to create file ? 
		//in c drive c:\tmp 
		File f = new File("c:\\tmp\\gnr2026.txt");// this will not create file 
		f.createNewFile();//create file

		//how to create folder?
		File dir = new File("c:\\tmp\\gnr2026");
		dir.mkdir();//create folder 
	
		//how to create folder and then create file inside that folder?
		//create file inside folder
		File f2 = new File(dir,"data123.txt");
		f2.createNewFile(); 


		//how to delete file ?
		File f3 = new File("c:\\tmp\\demo.txt"); 
		f3.delete(); 
		

		//how to delete folder? -- folder must be empty 
		File dir2 = new File("c:\\tmp\\em");
		dir2.delete(); //boolean 

		
		//how many bytes are occupied by your file or folder? 
		File f4 = new File("c:\\tmp\\s mam.docx");
		System.out.println(f4.length());
		
		File f5 = new File("c:\\tmp\\Dhurandhar.mkv");
		System.out.println(f5.length());

		//list all the contents of the folder
		File dir3 = new File("c:\\tmp\\");
		String list[] = dir3.list();  
		
		for(String x:list) {
			System.out.println(x);
		}
		
		
		System.out.println("THE END");
	
	}
}

//File class 
