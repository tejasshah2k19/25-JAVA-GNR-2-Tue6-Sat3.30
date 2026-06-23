package collection;

import java.util.TreeSet;

public class SortingDemo {

	public static void main1(String[] args) {

		// unique , sorted
		TreeSet<Integer> ts = new TreeSet<Integer>();

		//int: Integer , 
		//Float Double Boolean Character Long Byte Short Void 
		
		ts.add(10); // auto-boxing -> new Integer(10) -> Wrapper class : 8 
		ts.add(20);// box new Integer(20);
		ts.add(40);
		ts.add(30);
		ts.add(10);

		// unboxing
		System.out.println(ts);// 10 20 30 40

		Integer i = 1; // new Integer(1);
		System.out.println(i.toString());// 1

	}

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(40);
		ts.add(30);
		ts.add(10);
		System.out.println(ts);//desc 
	}
	
	public static void main2(String[] args) {
		Panda p1 = new Panda("simon", 10, 20);
		Panda p2 = new Panda("dixon", 15, 26);
		Panda p3 = new Panda("erik", 16, 19);
		
		TreeSet<Panda> ts = new TreeSet<Panda>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		System.out.println(ts);//

	
	}
	
	
	
	
	
	
	
}
