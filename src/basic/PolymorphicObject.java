package basic;

public class PolymorphicObject {

	public static void main(String[] args) {

		Apple a = new Apple();
		a.juice();

		PineApple p = new PineApple();
		p.juice();

		Apple ap = new PineApple();
		ap.juice();// javac->.class -> java -> PineApple

//		PineApple pa = new Apple();

		System.out.println("========================");
		a.drink();// para
		p.drink();// child
		ap.drink();// poly

		// polymorphism -- overriding --> is not for static

		System.out.println("=========================");

		Apple abc = new PineApple();
		abc.cut();
//		abc.slice();//
		// compile time error
		// run time error
		// output

	}
}

class Apple {
	static void drink() {
		System.out.println("Good");
	}

	void juice() {
		System.out.println("Good");
	}

	void cut() {
		System.out.println("apple : cut ");
	}
}

class PineApple extends Apple {
	void juice() {
		System.out.println("Better");
	}

	static void drink() {
		System.out.println("Better");
	}

	void slice() {
		System.out.println("PineApple : slice ");
	}

}
