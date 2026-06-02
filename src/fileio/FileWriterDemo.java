package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	void createCountry() throws IOException {

		Scanner scr = new Scanner(System.in);

		FileWriter fw = new FileWriter("c:\\tmp\\country.txt");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter country name");
			String cname = scr.next();
			fw.write(cname);
			fw.write("\n");

		}
		fw.close();
	}

	public static void main(String[] args) throws IOException {

//		FileWriter fw = new FileWriter("c:\\tmp\\gnr.txt");
//		
//		fw.write("royal education\n");
//		fw.write("ahmedabad");
//		fw.close();

		// country -> 5 -> country.txt
		// india
		// usa
		// japan
		// france
		// uk
		// australia

		new FileWriterDemo().createCountry();

	}
}
