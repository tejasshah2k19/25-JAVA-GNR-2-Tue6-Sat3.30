package fileio.backup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamInputStream {

	public static void main(String[] args) throws Exception {
		// InputStream
		// FileInputStream -> read data from file

		File file = new File("c:\\tmp\\number2026.txt");
		FileInputStream fis = new FileInputStream(file);

		while (true) {
			int b = fis.read();// EOF -1
			if (b == -1) {
				break;
			}
			System.out.print((char) b);
		}
		fis.close();
	}

	public static void main1(String[] args) throws Exception {

		// OutputStream
		// FileOutputStream -> write data in file

		File file = new File("c:\\tmp\\number2026.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String data = "royal education ahmedabad";
		for (int i = 0; i < data.length(); i++) {
			fos.write(data.charAt(i));
		}
		fos.close();

	}
}
