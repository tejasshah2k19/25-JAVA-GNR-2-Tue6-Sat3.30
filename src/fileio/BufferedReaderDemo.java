package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("c:\\tmp\\02June2026.txt");
		BufferedReader br = new BufferedReader(fr);

//		int b = br.read() ;

		while (true) {
			String line = br.readLine();// read entire line \n \r eof 
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		fr.close();
		br.close();
	}
}
