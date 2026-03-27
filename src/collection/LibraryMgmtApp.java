package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMgmtApp {

	public static void main(String[] args) {

		int choice;
		Scanner scr = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();

		Book c = new Book("ANSI_C", "Programming", 100);
		Book cpp = new Book("ANSI_CPP", "Programming", 200);
		Book java = new Book("CORE_JAVA", "Programming", 250);
		Book java_2 = new Book("JAVA_COMPELTE_REF", "Programming", 300);
		Book c_2 = new Book("COMPLETE_C", "Programming", 300);

		list.add(c);
		list.add(cpp);
		list.add(java);
		list.add(java_2);
		list.add(c_2);
		
		while (true) {
			System.out.println("0 For Exit");
			System.out.println("1 For Add Book");
			System.out.println("2 For Search Book");
			System.out.println("3 For View All Books");
			System.out.println("4 For Search By Category");
			System.out.println("Enter choice");

			choice = scr.nextInt();

			switch (choice) {
			case 1:
				Book b = new Book();// 200 300
				b.inputData();// input input
				list.add(b);// list->add add
				break;
			case 2:
				System.out.println("Enter Book Title");
				String searchTitle = scr.next();
				// list[ b1,b2,b3,b4]
				boolean found = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).title.toLowerCase().contains(searchTitle.toLowerCase())) {
						System.out.println(list.get(i).bookId + " " + list.get(i).title);
						found = true;
					}
				}

				if (found == false) {
					System.out.println("Book Not Found PTA !! ");
				}

				break;

			case 3:
				System.out.println("All Books");
				for(Book tmp:list) {
//					System.out.println(tmp.bookId+" "+tmp.title+" "+tmp.category+" "+tmp.damageValue);
					System.out.printf("\n%-5d %-20s %-20s",tmp.bookId,tmp.title,tmp.category);
				}
				System.out.println("");

				break;
			case 4:
				System.out.println("Enter Category Name For Search : ");
				String searchCategory = scr.next();
				found = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).category.toLowerCase().contains(searchCategory.toLowerCase())) {
						found = true;
						System.out.println(list.get(i).bookId + "  " + list.get(i).title + " " + list.get(i).category);
					}
				}
				if (found == false) {
					System.out.println("No Book Founds for Category " + searchCategory);
				}
			case 0:
				System.exit(0);
			default:
				break;
			}
		}
	}
}

/*
 * 
 * Book -> title , category , bookId , damageValue , createdAt
 * 
 * 
 * 
 */

class Book {
	int bookId;
	String title;
	String category;
	int damageValue;
	LocalDate createdAt;

	Book(){
		
	}
	
	Book(String title, String category, int damageValue) {
		this.bookId = (int) (Math.random() * 100000);
		int singleDigit = (int) (Math.random() * 10);
		this.createdAt = LocalDate.now().minusDays(singleDigit);
		this.title = title;
		this.category = category;
		this.damageValue = damageValue;
	}

	public void inputData() {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Book name and Category");
		title = scr.next();
		category = scr.next();
		System.out.println("Enter Damage Value ");
		damageValue = scr.nextInt();
		// bookId
		bookId = (int) (Math.random() * 100000);// 0 to 1 => 0.25875.2145851*100000
		// createdAt
		createdAt = LocalDate.now();

	}

	public void display() {
		System.out.println("BookId : " + bookId);
		System.out.println("Title : " + title);
		System.out.println("Category : " + category);
		System.out.println("DamageValue : " + damageValue);
		System.out.println("CreatedAt : " + createdAt);
	}

}

class Student {
	String name;
	String rollNum;
	ArrayList<Book> issuedBookList = new ArrayList<Book>();
}
