package fileio.backup;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException{
		
		System.out.println("");
		
		PrintWriter pw = new PrintWriter("c:\\tmp\\javac.txt");
				
		pw.print("royal");
		pw.println("edu");
		pw.write("ahmedabad");

		pw.close();

	
	}
}
