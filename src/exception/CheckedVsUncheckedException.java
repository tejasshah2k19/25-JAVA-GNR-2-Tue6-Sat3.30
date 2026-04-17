package exception;

import java.io.File;
import java.io.IOException;

public class CheckedVsUncheckedException {

	void unchecked() {
		int a = 10;
		int b = 0;
		int c = a / b;// division - it may throw ArithmeticException
		System.out.println(c);

	}

	void checked() {
		try {
			File f = new File("demo.txt");
			f.createNewFile(); // create new file Demo.txt - also it may throw IOException 
					
		} catch (IOException e) {
			System.out.println("SMW");
		}
	}
	public static void main(String[] args) {

		
	}
}
