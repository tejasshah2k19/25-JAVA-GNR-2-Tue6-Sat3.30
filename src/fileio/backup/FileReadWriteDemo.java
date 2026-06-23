package fileio.backup;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {

	public static void main(String[] args) throws IOException{

		File file = new File("c:\\tmp\\gnr2026.txt");
//		file.createNewFile(); 
		FileWriter fw = new FileWriter(file);
		fw.write("A royal education");
		fw.write("\nahmedabad");
		fw.close();
		System.out.println("**");

		
		FileReader fr = new FileReader(file);
//		int b = fr.read();//char 
//		System.out.println(b);
		int b;
		
		while(true) {
			b=fr.read();//EOF -1 
			if(b == -1) {
				break;
			}
			System.out.print((char)b);
		}
		
		fr.close();
		
	}
}

//byte -- network -- socket 


//char --
