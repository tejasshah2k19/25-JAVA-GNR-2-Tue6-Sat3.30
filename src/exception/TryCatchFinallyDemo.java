package exception;

import java.util.InputMismatchException;

//Object
class Shyam{
	
}

public class TryCatchFinallyDemo {
	public static void main(String[] args) {

		Shyam s = new Shyam();
		s.toString();
		s.equals(null);
		s.hashCode(); 
		s.notify();
		
		
		try {

			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("div => " + c);

		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero value in second number");
		} finally {
			System.out.println("I am Always HERE ");
		}
		
		 

		try {

			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("div => " + c);

		} finally {
			System.out.println("I am Always HERE ");
		}

	}
}
