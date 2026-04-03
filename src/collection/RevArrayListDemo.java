package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class RevArrayListDemo {

	void first() {

		ArrayList<Integer> list = new ArrayList<Integer>();//

		list.add(20);// list -> 0 => 20
		list.add(30);// 1
		list.add(50); // 2

		System.out.println(list.get(0));// 0 index ->
		System.out.println(list.get(1));// 0 index ->
		System.out.println(list.get(2));// 0 index ->

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		System.out.println("How many elements you want to store? ");
		int n = scr.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter value");
			int v = scr.nextInt(); 
			list.add(v);
		}
		//1 2 3 4 5 
		int sum = 0; 
		int max=list.get(0);
		for(int x:list) {
			System.out.println(x);
			sum = sum + x; 
			
			if(max < x) {
				max = x;//22   
			}
		
		}
		System.out.println("sum => "+sum);
		System.out.println("Max => "+max);
		
		
		
	}
}



















