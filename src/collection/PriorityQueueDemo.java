package collection;

import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		//duplicate , non index , 
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		
		list.add(12);// true -- insert
		list.add(20);// true
		list.add(50);// true
		list.add(12); // true
		list.add(-1);
		list.add(110);
		list.offer(21);
		
		// [12,20,50,12]
		System.out.println(list);// ordered , unSorted, duplicate ,

		//forEach 
		for (Integer g : list) {
			System.out.println(g);
		}

		// print first element
		// Integer ans = list.get(0);// read -- we can not 

		System.out.println(list.size());
		System.out.println("PEEK -> ");
		System.out.println(list.peek());//top  -1 
		System.out.println(list.peek());//top  -1 
		System.out.println(list.peek());//top  -1 
		System.out.println(list.peek());//top  -1 
		System.out.println(list.peek());//top  -1 
		System.out.println(list.peek());//top  -1 
		System.out.println(list.peek());//top  -1 
		System.out.println("size => " + list.size());
		
		System.out.println("Poll => ");
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println("size => " + list.size());
		
	}
}
