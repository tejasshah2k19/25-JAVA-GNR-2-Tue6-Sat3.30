package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	void generateException() {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter two numbers");
		int a = scr.nextInt();// int
		int b = scr.nextInt();// int

		int c = a / b; // 20/0 ==> crash

		System.out.println("div => " + c);

	}

	void second() {
		Scanner scr = new Scanner(System.in);

		try {
			System.out.println("Enter two numbers");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b; // 20/0 ==> crash
			System.out.println("div => " + c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter Zero....");
		} catch (InputMismatchException e) {
			System.out.println("Please Enter only Whole Numbers...");
		}
	}

	void third() {
		Scanner scr = new Scanner(System.in);

		try {
			System.out.println("Enter two numbers");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b; // 20/0 ==> crash
			System.out.println("div => " + c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter Zero....");
		} catch (Exception e) {
			System.out.println("Something went wrong please try after sometime");
			// send e to developer
//			System.out.println(e.getMessage());
//			e.printStackTrace();//
		}

	}

	void badPract() {
		Scanner scr = new Scanner(System.in);

		try {
			System.out.println("Enter two numbers");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b; // 20/0 ==> crash
			System.out.println("div => " + c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong please try after sometime");
		}

	}

	public static void main(String[] args) {

		//Exception 
				//ArithmeticException 
				//InputmissmatchException
	
	}
}

/*
 * 
 * 1) compile time error --> .java -> .class X 2) runtime error --> .class ->
 * run --> error
 * 
 * compile time error -> compiler --> undeclare variable , semicolon , = == ,
 * syntax error
 * 
 * runtime error --> Exception 5 array : 6 7 => access => runtime error num / 0
 * : 10 /0 => runtime error input : num :int : 17.25 ==> runtime error
 * 
 * exception --> runtime error --> crash
 * 
 * exception handling :->
 */
