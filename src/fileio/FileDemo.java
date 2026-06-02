package fileio;

import java.io.File;
import java.io.IOException;

//file ->  java.io 
//file ->  java.nio 

//File class 
//file operation -> create , delete , rename , size , 
//folder operation -> create , delete , rename ,size , list content 
//read only , write ? , attribute 

//read 

//write 


//character 
//byte 


//find out the highest size of the file in given directory 



public class FileDemo {

	void fileFolderCreate() throws IOException{

		File file = new File("data2.txt");// this will not create any file
		// checked
		file.createNewFile();// this will create file if file does not exists and return false.

		File fileGnr = new File("C:\\tmp\\gnr.txt");
		fileGnr.createNewFile(); // if file created then return true

		File fileGnr2 = new File("c:\\tmp\\", "gnr2.txt");
		fileGnr2.createNewFile();

		File gnr = new File("c:\\gnr");
		gnr.mkdir();// create folder if folder does not exists - return boolean

		File gnrJava = new File(gnr, "java.txt");
		gnrJava.createNewFile();

	}

	public static void main(String[] args) throws IOException {

		File file = new File("c:\\tmp\\Dhurandhar.mkv");
		
		//file already present ? 
		System.out.println(file.exists());//boolean -> true | not present -> false 
		
		//file size? 
		System.out.println(file.length());//byte 
		
		//read write execute hidden ? 
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		
		
		System.out.println(file.getPath());
		
//		file.delete();
		File newFileName = new File("d11.mkv");
		newFileName.renameTo(file);
 
		
		File f = new File("C:\\tmp");
		String allContent[] = f.list(); 
		System.out.println("content of the "+f.getPath());
		for(String name  : allContent) {
			System.out.println(name);
		}
		
		System.out.println("THE END");
	}
}
