package collection;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListAgain {

	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(12);// true -- insert
		list.add(20);// true
//		list.add("ram"); //error 
		list.add(50);// true
		list.add(12); // true

		// [12,20,50,12]
		System.out.println(list);// ordered , unSorted, duplicate ,

		for (Integer g : list) {
			System.out.println(g);
		}

		// print first element
		Integer ans = list.get(0);// read
		System.out.println("zero index : " + ans);

		System.out.println("Loop => ");// loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // get(0) get(1) ..... get(size-1)
		}
		// Vector
//		
//		 public boolean add(E e) {
//		        modCount++;
//		        add(e, elementData, size);
//		        return true;
//		    }

		
//		    public synchronized boolean add(E e) {
//		        modCount++;
//		        add(e, elementData, elementCount);
//		        return true;
//		    }
		
		
	}
}
