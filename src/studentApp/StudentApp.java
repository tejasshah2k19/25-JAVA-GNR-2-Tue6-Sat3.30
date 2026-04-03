package studentApp;

import java.util.Scanner;
import java.util.ArrayList;


public class StudentApp {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Exam> examList = new ArrayList<Exam>();
		ArrayList<Batch> batchList = new ArrayList<Batch>();
		
		
		
		Scanner scr = new Scanner(System.in);
		int choice;

		while (true) {

			System.out.println("0 For EXIT ");
			System.out.println("1 For Add Student");
			System.out.println("2 For Add Batch ");
			System.out.println("3 For Add Exam ");

			System.out.println("4 For List Student");
			System.out.println("5 For List Batch");
			System.out.println("6 For List Exam");

			System.out.println("Enter choice : ");
			choice = scr.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("ADD NEW STUDENT");
				Student s = new Student();
				s.inputData();
				studentList.add(s);
				break;
			case 2:
				System.out.println("ADD NEW BATCH");
				break;
			case 3:
				System.out.println("ADD NEW EXAM");
				break;

			case 4:
				System.out.println("List ALL STUDENTS");
				break;
			case 5:
				System.out.println("LIST ALL BATCHES");
				break;
			case 6:
				System.out.println("LIST ALL EXAMS");
				break;
			default:
				System.out.println("INVALICE CHOICE PTA !! ");
				break;
			}
		}
	}
}
