package constructor;

public class Hirer {

	public static void main(String[] args) {

		Test2 t2 = new Test2(10);
	}
}

class Test1 {
	Test1(int x) {
		System.out.println("Test1 " + x);
	}
}

class Test2 {

	int j;//0
	int k;//10
	Test1 t1 = new Test1(20);//Test1 20
	
	Test2(int x) {//10
		k = x; //10
		System.out.println("Test2 " + x);//Test2 10
	}
}