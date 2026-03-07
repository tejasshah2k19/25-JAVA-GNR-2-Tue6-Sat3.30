package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		System.out.println("array list");

		int arr[] = new int[5];// array

//		ArrayList<Object> list = new ArrayList(); 
		ArrayList list = new ArrayList();
		list.add(12);// 0
		list.add(13);// 1
		list.add("royal");// 2
		System.out.println(list);

		ArrayList<String> strList = new ArrayList<String>();

//		strList.add(12); //compilation 
		strList.add("12");
		strList.add("royal");

		System.out.println(strList);

	}
}
