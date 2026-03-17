package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemoScan {

	public static void main(String[] args) {

		int n;
		int value;
		Scanner scr = new Scanner(System.in);

		System.out.println("how many elements you want to store? ");
		n = scr.nextInt();// 5

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the value ");
			value = scr.nextInt(); // 10 20 30

			list.add(value); // 10 20 30

		}

		System.out.println("List => ");
		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}

		// sum of all elements
		// find max
		// find min
		int sum = 0;
		int max = list.get(0);
		int min = list.get(0);
		for (int i = 0; i < n; i++) {

			sum = sum + list.get(i);

			if (max < list.get(i)) {
				max = list.get(i);
			}

			if (min > list.get(i)) {
				min = list.get(i);
			}
		}

		System.out.println("sum => " + sum);
		System.out.println("min => " + min);
		System.out.println("max => " + max);
	}
}
