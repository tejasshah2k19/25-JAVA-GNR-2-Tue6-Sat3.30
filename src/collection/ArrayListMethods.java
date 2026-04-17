package collection;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);//0
		list.add(100);//1
		list.add(1000);//2
		// can we have duplicate ?
		// yes
		list.add(10);

		// can arraylist is index based collection?
		// yes
		// can arraylist is ordered ?
		// yes
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// can we have forEach?
		// yes
		System.out.println("ForEach => ");
		for (int x : list) {
			System.out.println(x);
		}

		// array list is sorted?
		// no

		// how to remove element from array list?
		list.remove(0);//index
		list.remove(new Integer(10));// 10 value
		System.out.println("ForEach After 0th index remove => ");
		for (int x : list) {
			System.out.println(x);
		}

		// how to add any element in arraylist ?
		list.add(200);
		System.out.println("200 added");
		for (int x : list) {
			System.out.println(x);
		}

		// how to add any element on given index in array list ?
		// 0 : 100
		// 1 : 1000
		// 2 : 200

		list.add(0, 10);// add 10 at 0th index
//		list.add(10); // at the end 
		System.out.println("10 added at 0th index");
		for (int x : list) {
			System.out.println(x);
		}

		// how to overwrite any element in array list?
		list.set(0, -10);// overwrite -10 at 0th index if 0th index having data
		System.out.println("-10 set at 0th index");
		for (int x : list) {
			System.out.println(x);
		}

		// search particular element /value / items in list ?

		System.out.println(list.contains(100000));//boolean -> false
		System.out.println(list.contains(-10));//true 
//		
//		-10
//		100
//		1000
//		200
		// search an item and return the index ?
		System.out.println(list.indexOf(100000));// -1
		System.out.println(list.indexOf(-10));// 0

		// can we combine two array list?

		ArrayList<Integer> anotherList = new ArrayList<Integer>();
		anotherList.add(500);
		anotherList.add(501);
		anotherList.add(502);
		anotherList.add(503);

		list.addAll(anotherList);
		System.out.println(list);//4 + 4 => 8 

//		list.addFirst(10);
//		list.addLast(20);
//		list.removeFirst();
//		list.removeLast();
//		list.reversed();
		list.clear(); // remove all the items from linked list
		
//		

	}
}
