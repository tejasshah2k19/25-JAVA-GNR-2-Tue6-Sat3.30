package thread;

public class ThreadDemoImpl {

	public static void main(String[] args) {

		Download d = new Download();
//		d.start();
		Thread t = new Thread(d);
		t.start();
	}
}

//1) implements Runnable 
//2) public void run 
//3) call run() using start()

class Download implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Downloading " + i);
		}
	}
}
