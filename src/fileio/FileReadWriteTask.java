package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteTask {

	
	public static void main(String[] args) throws IOException{
		
		Scanner scr = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("c:\\tmp\\names.txt");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter name");
			String name = scr.next(); 
			fw.write(name);
			fw.write("\n");
		}
		fw.close();

		
		FileReader fr = new FileReader("c:\\tmp\\names.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fwG = new FileWriter("c:\\tmp\\goodNames.txt");
		
		
		while(true) {
			String line = br.readLine(); 
			if(line == null) {
				break;
			}
			
			if(line.length() >= 4) {
				fwG.write(line);
				fwG.write("\n");
			}
			
		}
		
		br.close();
		fwG.close();
		
		
		
		
		
		
	}
}
