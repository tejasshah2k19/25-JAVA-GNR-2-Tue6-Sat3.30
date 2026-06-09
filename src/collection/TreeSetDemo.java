package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(12);// true
		ts.add(60);// true
		ts.add(50);// true
		ts.add(12);// false
		ts.add(-1);// true
		ts.add(200);
		ts.add(150);

		System.out.println(ts);
//		ts.remove(-1);
		System.out.println(ts.size());

//	System.out.println(hs.get(0));

		System.out.println("All Elements...");
		for (int x : ts) {
			System.out.println(x);
		}

		System.out.println("tailSet 50 ");
		System.out.println(ts.tailSet(50));

		System.out.println("headSet 50 ");
		System.out.println(ts.headSet(50));

//		Set<Integer> ss = ts.headSet(50); 

		System.out.println(ts.ceiling(45));

		
		
	}
}
