package fileio.backup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("c:\\tmp\\country.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();//EOF => null
			if(line == null) {
				break;
			}
			System.out.println(line);
		}

		br.close();

	}
}
