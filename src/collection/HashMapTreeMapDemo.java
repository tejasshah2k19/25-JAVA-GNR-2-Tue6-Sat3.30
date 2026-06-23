package collection;

import java.util.HashMap;

public class HashMapTreeMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String > hm = new HashMap<Integer, String>();
		
		hm.put(1, "ram"); //add 
		hm.put(2, "sita");	
		hm.put(2, "ravan");//1:ram 2:ravan 
		
		System.out.println(hm);

		System.out.println(hm.size());
		
		System.out.println(hm.get(1));//ram
		System.out.println(hm.get(10));//null
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		hm.remove(1); //1 
		System.out.println(hm);
	
		hm.clear();//remove all the items 


		
		
	}
}
