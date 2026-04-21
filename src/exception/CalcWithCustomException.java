package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcWithCustomException {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int choice = -1;
		int a = 0, b = 0;
		Calc calc = new Calc();
		while (true) {

			try {
				System.out.println("0 For Exit");
				System.out.println("1 For Addition\n2 For Sub\n3 For Div\nEnter choice");

				choice = scr.nextInt();
				System.out.println("Enter two numbers");
				a = scr.nextInt();
				b = scr.nextInt();
				switch (choice) {
				case 1:
					calc.add(a, b);
					break;
				case 2:
					calc.sub(a, b);
					break;
				case 3:
					calc.div(a, b);
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Invalid choice PTA!!!");
					break;
				}// switch
			} catch (InputMismatchException e) {
				System.out.println("Please Enter only whole numbers (integers) ");
				scr.next();
			} catch (NegativeNumberException e) {

			}

			// catch
		} // while
	}// main
}// class

class Calc {

	void add(int a, int b) throws NegativeNumberException {
		checkNegNumber(a, b);
		int c = a + b;
		System.out.println("addition => " + c);
	}

	void sub(int a, int b) throws NegativeNumberException {
		checkNegNumber(a, b);
		int c = a - b;
		if (c < 0) {
			c = c * -1; // -15 * -1
		}
		System.out.println("sub => " + c);
	}

	void div(int a, int b) throws NegativeNumberException {
		checkNegNumber(a, b);
		int c = a / b;
		System.out.println("div => " + c);
	}

	private void checkNegNumber(int a, int b) throws NegativeNumberException {
		if (a < 0) {
			throw new NegativeNumberException(a);
		}
		if (b < 0) {
			throw new NegativeNumberException(b);
		}
	}

}

class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("Enter Only Positive Numbers");
	}

	public NegativeNumberException(int val) {
		super("Enter Only Positive Numbers : " + val);
	}

}
