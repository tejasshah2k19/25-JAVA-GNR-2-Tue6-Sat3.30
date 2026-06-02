package fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo2 {

	public static void main(String[] args) throws IOException {

		// file -> File -> create , delete , exists , size

		// file-> write -> FileWriter

		// file -> read -> FileReader

		// java.io

		FileWriter fw = new FileWriter("c:\\tmp\\02June2026.txt");
		fw.write("ROYAL EDUCATION");
		fw.write("\nAhmedabad");
		fw.close();

		FileReader fr = new FileReader("c:\\tmp\\02June2026.txt");

		while (true) {
			int c = fr.read();// single data / byte / character
			if(c == -1) {
				break;
			}
//			System.out.println(c);
			System.out.print((char) c);
		}

		fr.close();

	}
}
