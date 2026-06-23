package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class EqualsAndHashCode {

	public static void main1(String[] args) {

		Panda p1 = new Panda("simon", 10, 20);
		Panda p2 = new Panda("dixon", 15, 26);
		Panda p3 = new Panda("erik", 16, 19);

		System.out.println(p1);// object --> toString() -> hash code
//		System.out.println(p1.hashCode());
		System.out.println(p2);// object print => class@hexaString =>toString()
		System.out.println(p3.toString());

		// hashcode => memory address
		// 767859403948576584909586758495867

		// toString() -> hashcode()
		// toString() -> class Name fully qualified name@hexa(hashcode())
		// package.className@Integer.toHexString(hashcode())

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		System.out.println(list);// 10 20 10

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		System.out.println(hs);// 10 20 | 20 10

	}

	public static void main2(String[] args) {

		Panda p1 = new Panda("simon", 10, 20);// 100
		Panda p2 = new Panda("dixon", 15, 26);// 200
		Panda p3 = new Panda("erik", 16, 19);// 300
		Panda p4 = p1;// 100
		Panda p5 = new Panda("erik", 16, 19);// 500

		System.out.println(p1 == p2);// address : false
		System.out.println(p1 == p4);// address : true
		System.out.println(p3 == p5);// address : false

		HashSet<Panda> hs = new HashSet<Panda>();
		hs.add(p1);// true | 10
		hs.add(p2);// true | 15
		hs.add(p3); // true| 16
		hs.add(p1);// false| 10
		hs.add(p4);// false| 10
		hs.add(p5);// true | 16

		// hashcode() -> memory address of an object
		System.out.println(hs);//
		System.out.println("THE END");

		// p1 p2 =? same ? address

	}

	public static void main(String[] args) {
		Panda p1 = new Panda("simon", 10, 20);// 100
		Panda p2 = new Panda("dixon", 15, 26);// 200
		Panda p3 = new Panda("erik", 16, 19);// 300
		Panda p4 = p1;// 100
		Panda p5 = new Panda("erik", 16, 19);// 500

		HashSet<Panda> hs = new HashSet<Panda>();
		System.out.println("add p1 : " + hs.add(p1));
		System.out.println("after adding p1 : " + hs);
		System.out.println("add p2 : " + hs.add(p2));
		System.out.println("after adding p2 : " + hs);
		System.out.println("add p3 : " + hs.add(p3));
		System.out.println("after adding p3 : " + hs);
		System.out.println("add p1 : " + hs.add(p1));
		System.out.println("after adding p1 : " + hs);
		System.out.println("add p4 : " + hs.add(p4));
		System.out.println("after adding p4 : " + hs);
		System.out.println("add p5 : " + hs.add(p5));
		System.out.println("after adding p5 : " + hs);

		// hashcode() -> memory address of an object
		System.out.println(hs);//
		System.out.println("THE END");

	}
}
//Object -> parent of all class 
// toString()
// hashcode()

class Panda implements Comparable<Panda> {
	String name;
	int id;
	int weight;

	Panda(String name, int id, int weight) {
		this.name = name;
		this.id = id;
		this.weight = weight;
	}

	// overriding
	public String toString() {
		return name + " : " + id + " : " + weight;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode() call : " + name + " : " + id);
//		return super.hashCode();
		return 1;// same
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() :" + name + ":" + id);
		return this.id == ((Panda) obj).id;
	}

//	@Override
//	public int compareTo(Panda o) {
//		// TODO Auto-generated method stub
//
//		if(this.id > o.id) {
//			return 1; 
//		}else if(this.id < o.id) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}

	@Override
	public int compareTo(Panda o) {
		// TODO Auto-generated method stub

//		return this.weight - o.weight;
		return o.weight - this.weight;
	}

}