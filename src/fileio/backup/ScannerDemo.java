package fileio.backup;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\tmp\\mixData.txt");
		Scanner scr = new Scanner(f);

		while (scr.hasNext()) {

			if (scr.hasNextInt()) {
				int num = scr.nextInt();
				System.out.println(num);
			} else if (scr.hasNextDouble()) {
				double d = scr.nextDouble();
				System.out.println(d);
			} else {
				String str = scr.next();
				System.out.println(str);
			}
		}

		scr.close();

	}

	public static void main1(String[] args) throws IOException {

		File f = new File("c:\\tmp\\mixData.txt");
		Scanner scr = new Scanner(f);

		String name = scr.next();
		System.out.println(name);
		int num = scr.nextInt();
		System.out.println(num);
		double d = scr.nextDouble();
		System.out.println(d);
		name = scr.next();
		System.out.println(name);
//		royal
//		123
//		12.25
//		edu
		scr.close();

	}
}
