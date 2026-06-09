package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<Integer> hs = new HashSet<Integer>(); 
		
		hs.add(12);//true 
		hs.add(60);//true
		hs.add(50);//true 
		hs.add(12);//false 
		hs.add(-1);//true 
		
		System.out.println(hs);
		hs.remove(-1);
		System.out.println(hs.size());
		
//		System.out.println(hs.get(0));

		System.out.println("All Elements...");
		for(int x:hs) {
			System.out.println(x);
		}
		
		
	}
}
