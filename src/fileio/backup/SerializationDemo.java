package fileio.backup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main1(String[] args) throws IOException {

		// serialization ->
		// object -> storage
		// write(s1)

		Student s1 = new Student("shyam", "patel", "shyam@gmail.com", "secret123");
		Student s2 = new Student("ram", "patel", "ram@gmail.com", "myPassword");
		Student s3 = new Student("Ganshyam", "patel", "ganshyam@gmail.com", "secret456");

		File f = new File("studentData.txt");

		FileWriter fw = new FileWriter(f);

		fw.write(s1.firstName + " ");
		fw.write(s1.lastName + " ");
		fw.write(s1.email + " ");
		fw.write(s1.password + " ");
		fw.write("\n");
		fw.write(s2.firstName + " ");
		fw.write(s2.lastName + " ");
		fw.write(s2.email + " ");
		fw.write(s2.password + " ");
		fw.write("\n");
		fw.write(s3.firstName + " ");
		fw.write(s3.lastName + " ");
		fw.write(s3.email + " ");
		fw.write(s3.password + " ");

		fw.close();

	}

	public static void main(String[] args) throws Exception {

		Student s1 = new Student("shyam", "patel", "shyam@gmail.com", "secret123");
		Student s2 = new Student("ram", "patel", "ram@gmail.com", "myPassword");
		Student s3 = new Student("Ganshyam", "patel", "ganshyam@gmail.com", "secret456");

		File f = new File("student.txt");
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fout);

		oos.writeObject(s1);// s1 -> file {instance variable}
		oos.writeObject(s2);
		oos.writeObject(s3);

		oos.close();

		// de-serialize

		File f2 = new File("student.txt");

		FileInputStream fis = new FileInputStream(f2);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student s4 = (Student) ois.readObject();
		Student s5 = (Student) ois.readObject();
		Student s6 = (Student) ois.readObject();

		ois.close();

		s4.display();
		s5.display();
		s6.display();

	}

	public static void main2(String[] args) throws IOException, ClassNotFoundException {

		File f2 = new File("student.txt");

		FileInputStream fis = new FileInputStream(f2);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student s4 = (Student) ois.readObject();
		Student s5 = (Student) ois.readObject();
		Student s6 = (Student) ois.readObject();

		ois.close();

		s4.display();
		s5.display();
		s6.display();

	}
}
//marker -> empty -> 

class Student implements Serializable {

	String firstName;
	String lastName;
	String email;
	transient String password;

	public Student(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	void display() {
		System.out.println(firstName + " " + lastName + " " + email + " " + password);
	}
}
