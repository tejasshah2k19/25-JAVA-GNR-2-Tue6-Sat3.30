package basic;

public class Amitabh {

	public static void main(String[] args) {
		Abhishek a = new Abhishek();
		a.play();
		a.dance();
		a.jump();
		a.fight();
		// a.walk();// child can not access private property
		a.earn();
		// Amitabh ab = new Amitabh();
		// ab.walk(); //error
	}

	private void walk() {// private -> scope => with in the class --> same class

	}

	void play() {

	}

	protected void dance() {

	}

	public void earn() {

	}
}

class Abhishek extends Amitabh {

	void jump() {

	}

	void fight() {

	}
}
