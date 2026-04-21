package exception;

import java.util.Scanner;

public class GmailDemo {

	// custom exception

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		String email, password;
		GmailApi gmail = new GmailApi();

		// email -> admin@gmail.com
		// password -> admin
		System.out.println("Enter email and password");
		email = scr.next();
		password = scr.next();

		try {
			if (gmail.checkCredentials(email, password)) {
				System.out.println("Welcome...........");
			} else {
				System.out.println("Invalid Credentials..........");
			}

		} catch (ArithmeticException e) {
			System.out.println("Invalid Email Format please use only gmail account");
		}
	}
}

class GmailApi {

	boolean checkCredentials(String email, String password) {

		if (email.endsWith("@gmail.com")) {

			if (email.equals("admin@gmail.com") && password.equals("admin"))
				return true;
			else
				return false;
		} else {
//			ArithmeticException e = new ArithmeticException("Invalid Email");
//			throw e;//

//			throw new RuntimeException("E0075 : Invalid Email");
			throw new InvalidGmailException();
		}
	}
}

//how to create your exception class--- custom exception 
//1) class extends Exception or RuntimeException 
//2) create constructor for error message 

class InvalidGmailException extends RuntimeException {
	public InvalidGmailException() {
		super("Invalid Gamil");
	}

	public InvalidGmailException(String errorMessage) {
		super(errorMessage);
	}
}
