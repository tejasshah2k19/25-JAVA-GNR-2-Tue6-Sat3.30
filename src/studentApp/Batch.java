package studentApp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Batch {

	private Integer batchId;
	private String batchName;
	private String subject;
	private LocalDate startDate;
	private LocalDate endDate;
	
	ArrayList<Student> batchStudentList = new ArrayList<Student>();

	public Batch() {

	}

	public Batch(String batchName, String subject, LocalDate startDate, LocalDate endDate) {

		batchId = (int) (Math.random() * 1000);
		this.batchName = batchName;
		this.subject = subject;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void inputData() {
		Scanner scr = new Scanner(System.in);
		batchId = (int) (Math.random() * 1000);
		System.out.println("Enter BatchName");
		batchName = scr.next();
		System.out.println("Enter Subject");
		subject = scr.next();
		startDate = LocalDate.now();
		endDate = LocalDate.now().plus((long) 2, ChronoUnit.HOURS);
	}

	public void display() {
		System.out.println(batchId + " " + batchName + " " + subject + " " + startDate + " " + endDate);
	}

}
