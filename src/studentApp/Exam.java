package studentApp;

import java.util.Scanner;

public class Exam {
	private Integer examId;
	private String title;
	private Integer score;
	private String level;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void inputData() {
		Scanner scr = new Scanner(System.in);
		examId = (int) (Math.random() * 100);
		System.out.println("Enter exam title");
		title = scr.next();
		System.out.println("Enter total marks for exam");
		score = scr.nextInt();
		System.out.println("Enter Difficulty Level of exam ");
		level = scr.next();
	}

	public void display() {
		System.out.println(examId+" "+title+" "+score+" "+level);
	}
}
