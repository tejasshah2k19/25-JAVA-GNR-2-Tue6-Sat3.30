package studentApp;

import java.util.Scanner;

public class Student {

	private Integer studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNum;

	public Student() {
	}

	public Student(String firstName, String lastName, String email, String contactNum) {
		this.studentId = (int) (Math.random() * 100000);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNum = contactNum;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public void inputData() {
		Scanner scr = new Scanner(System.in);
		studentId = (int) (Math.random() * 100000);// 0 25874 * 100000
		System.out.println("Enter FirstName and LastName");
		firstName = scr.next();
		lastName = scr.next();
		System.out.println("Enter Email and contact num");
		email = scr.next();
		contactNum = scr.next();
	}

	public void display() {
		System.out.println(studentId + " " + firstName + " " + lastName + " " + email + " " + contactNum);
	}
}
