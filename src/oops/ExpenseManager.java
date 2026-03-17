package oops;

import java.util.Scanner;

public class ExpenseManager {

	public static void main(String[] args) {
		User u = new User("rohan", 50000); // balance name
		User u1 = new User("soham", 150000); // balance name
		User u2 = new User("gopal", 3000); // balance name

		//collection 
		
		
		Scanner scr = new Scanner(System.in);
		int choice;
		int amt;
		// 0 exit
		// 1 add expense
		// 2 add income
		// 3 check balance

		while (true) {
			System.out.println("0 For exit");
			System.out.println("1 For Add Expense");
			System.out.println("2 For Add Income");
			System.out.println("3 For Check Balance");
			System.out.println("Enter choice");
			choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("How much amount you have spend : ");
				amt = scr.nextInt();
				u.balance = u.balance - amt;
				break;
			case 2:
				System.out.println("How much amount you have earned : ");
				amt = scr.nextInt();
				u.balance = u.balance + amt;
				break;
			case 3:
				System.out.println("Balance = " + u.balance);
				break;
			case 0:
				System.exit(0);//

			default:
				System.out.println("Invalid Choice PTA !! ");
				break;
			}
		}
	}

}

class User {

	int balance;//instance variable 
	String name;//instance 

	// constructor
	// no args - default constructor
	User() {
		balance = 5000;
		name = "XXX";
	}

	User(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	void checkBalance() {
		System.out.println("Your Balance = " + balance);
	}

}
