package thread.backup;

public class ThreadBank {

	public static void main(String[] args) throws InterruptedException {

		Account a = new Account();
		// 3 thread
		Thread t1 = new Thread(a);// t1
		t1.setName("Father");
		Thread t2 = new Thread(a, "Mother"); // t2
		Thread t3 = new Thread(a); // t3
		t3.setName("Child");

		t1.start();
		t2.start();
		t3.start();

		Thread.sleep(5000);
		System.out.println(a.balance);

	}
}

class Account extends Thread {
	int balance = 50000;

	void printBal() {
		System.out.println("balance => " + balance);
	}

	synchronized void wid(int amt) {
		System.out.println("wid start for : " + currentThread().getName());
		if (balance - amt >= 0) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance - amt;
			System.out.println("Wid done :: " + currentThread().getName());
		} else {
			System.out.println("Insuf. balance :: " + currentThread().getName());
		}
	}

	@Override
	public void run() {
		printBal();
		wid(20000);
	}
}
