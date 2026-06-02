package thread;

public class JoinDemo {

	public static void main(String[] args)throws InterruptedException {

		Maggie m = new Maggie();

		Thread t1  = new Thread(m,"santa");
		Thread t2 = new Thread(m,"banta");
		
		t1.start();
		t1.join();//checked 
		t2.start(); 
	}
}

class Maggie implements Runnable {

	public void run() {
		eat();
	}

	void eat() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+ " eat " + i);
		}
	}
}
