package doubts;

public class PolymorphicDemo {

	public static void main(String[] args) {

		Parent p = new Parent();// p : p
		Parent pc = new Child(); // p : c
		
		Child c  = new Child();// c : c 
		
		Child cp = (Child)new Parent();//force fully - runtime error 

	}
}

class Parent {

	void add() {

	}
}

class Child extends Parent {

	void sub() {

	}
}
