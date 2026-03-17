package collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//array -> dynamic 
		//util 
	
		
		//robust 
		
		
		//1.5
		ArrayList list = new ArrayList();

		list.add(10);//0
		list.add(20);//1
		list.add(30);//2
		list.add(30.20);
		list.add("royal");
		
		System.out.println(list.get(0));//10 
		System.out.println(list.size());//3 
		System.out.println(list.get(4));

	
		//type safety parameter 
		//generics 
		
		ArrayList<Integer> list2 = new ArrayList();

		list2.add(10);//0
		list2.add(20);//1
		list2.add(30);//2
//		list2.add(30.20);//error -> double
//		list2.add("royal");//error -> String 

		
		System.out.println(list2.get(0));//10

		System.out.println("List2 => ");
		//loop
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
	
	}
}
