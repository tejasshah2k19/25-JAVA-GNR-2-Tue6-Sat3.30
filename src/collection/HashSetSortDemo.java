package collection;

import java.util.TreeSet;

public class HashSetSortDemo {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ram");
		ts.add("ravan");
		ts.add("zerodha");
		ts.add("laxman");
		ts.add("ram");//
		System.out.println(ts);

		StudentTS s1 = new StudentTS("ram", 1);
		StudentTS s2 = new StudentTS("laxman", 2);
		StudentTS s3 = new StudentTS("aone", 3);
		
		TreeSet<StudentTS> studentTs = new TreeSet<>();
		
		
		System.out.println(studentTs.add(s1));
		System.out.println(studentTs.add(s2));
		System.out.println(studentTs.add(s3));
		 
		 
		System.out.println(studentTs);
		
		
		
	}
}

class StudentTS implements Comparable<StudentTS> {
	
	String name;
	int rollNum;//

	StudentTS(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}


//	public int compareTo(StudentTS o) {
//		if(this.rollNum == o.rollNum) {
//			return 0;
//		}else if(this.rollNum < o.rollNum) {
//			return 1;
//		}else {
//			return -1;
//		}
//	}
	public int compareTo(StudentTS o) {
//		return this.name.compareTo(o.name);
		return o.name.compareTo(this.name);
	}
	
	@Override
	public String toString() {
		return name+":"+rollNum;
	}

	
}
