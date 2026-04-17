package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoAgain {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b;// ArithmeticException
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero value");
		} catch (InputMismatchException e) {
			System.out.println("Please Enter only whole numbers ");
		} catch (Exception e) {
			System.out.println("Something Went Wrong PTA");
			e.printStackTrace();
			// sendMailDev(e)
		}finally {
			System.out.println("I am Always Execute....`");
		}

	}
}
