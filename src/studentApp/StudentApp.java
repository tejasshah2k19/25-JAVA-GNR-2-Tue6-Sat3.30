package studentApp;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Exam> examList = new ArrayList<Exam>();
		ArrayList<Batch> batchList = new ArrayList<Batch>();
		boolean found = false; 
		
		// temp data
		Student tmpStd1 = new Student();
		tmpStd1.setStudentId(1000);
		tmpStd1.setFirstName("rock");
		tmpStd1.setLastName("patel");
		tmpStd1.setEmail("rock@gmail.com");
		tmpStd1.setContactNum("12345");

		Student tmpStd2 = new Student("jack", "Patel", "jack@gmail.com", "8568");
		Student tmpStd3 = new Student("mack", "Patel", "mack@gmail.com", "22368");

		// tmem Batch
		Batch tmpBatch1 = new Batch("GNR JAVA", "JavA", LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(1));
		Batch tmpBatch2 = new Batch("GNR DS", "DSA", LocalDate.now().minusMonths(3), LocalDate.now().plusMonths(2));
		Batch tmpBatch3 = new Batch("Andorid AHD", "Android", LocalDate.now().minusMonths(2),
				LocalDate.now().plusMonths(2));
		Batch tmpBatch4 = new Batch("Gen AI GNR", "AI", LocalDate.now().minusWeeks(6), LocalDate.now().plusWeeks(2));

		studentList.add(tmpStd1);
		studentList.add(tmpStd2);
		studentList.add(tmpStd3);

		batchList.add(tmpBatch1);
		batchList.add(tmpBatch2);
		batchList.add(tmpBatch3);
		batchList.add(tmpBatch4);

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
			
			System.out.println("7 For Add Student in Batch");
			

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
				Batch b = new Batch();
				b.inputData();
				batchList.add(b);
				break;
			case 3:
				System.out.println("ADD NEW EXAM");
				Exam e = new Exam();
				e.inputData();
				examList.add(e);
				break;

			case 4:
				System.out.println("List ALL STUDENTS");
				for (Student t : studentList) {
					t.display();
				}
				break;
			case 5:
				System.out.println("LIST ALL BATCHES");
				for (Batch bt : batchList) {
					bt.display();
				}
				break;
			case 6:
				System.out.println("LIST ALL EXAMS");
				for (Exam et : examList) {
					et.display();
				}
				break;
			case 7:

					System.out.println("ADD STUDENT TO BATCH");
					System.out.println("Enter Studet Id");
					int studentId = scr.nextInt(); //2
					found = false; 
					
					for(Student sTmp:studentList) {
						if(sTmp.getStudentId() == studentId) {
							found = true;
						}
					}
					
					if(found == true) {
						System.out.println("Stduent Added");
					}else {
						System.out.println("Student Not Found");
					}
					
			
					break;
			
			default:
				System.out.println("INVALICE CHOICE PTA !! ");
				break;
			}
		}
	}
}
