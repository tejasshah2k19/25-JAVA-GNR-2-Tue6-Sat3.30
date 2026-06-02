package enumdemo;

class Student {
	int age;
	String name;

	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class EnumDemo {
	public static void main(String[] args) {

		System.out.println(Drink.LARGE);//
		System.out.println(Drink.LARGE.size);
		System.out.println(Drink.LARGE.dem);

	}
}

enum Drink {
	SMALL(1, "S"), LARGE(2, "L"), XLARGE(4, "XL");

	int size;
	String dem;

	Drink(int size, String dem) {
		this.size = size;
		this.dem = dem;
	}
	
	@Override
	public String toString() {
		return dem;
	}
}

enum Day {
	SUN(0), MON(1), TUE(2), WED(3), THUS(4), FRI(5), SAT(6);

	int v;

	Day(int x) {
		v = x;
	}
}
