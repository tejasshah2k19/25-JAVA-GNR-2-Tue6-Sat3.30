package thread;

public class ThreadCombine {

	public static void main(String[] args)throws InterruptedException {
		Play p1 = new Play();
		p1.start();

//		try {
//			p1.join();// checked exception
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		
		p1.join();
		
		// second approach
		Pause p2 = new Pause();
		Thread t = new Thread(p2);
		t.start();
	}
}

class Play extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Play " + i);
		}
	}
}

class Pause implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pause " + i);
		}
	}
}