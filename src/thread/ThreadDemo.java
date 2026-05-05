package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Print p = new Print();
		p.start();
		Copy c = new Copy();
		c.start();
	}
}

//step 1 : class extends Thread
//step 2 : override run( )
//step 3 : create instance and call start( ) method 
class Print extends Thread {
	void printImage() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print Image " + i);
		}
	}

	public void run() {
		printImage();
	}

}

class Copy extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Copy Image " + i);
		}
	}
}