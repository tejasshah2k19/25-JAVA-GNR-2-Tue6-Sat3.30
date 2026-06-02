package thread;

public class BankAccount {

	public static void main1(String[] args) throws InterruptedException {

		Account t = new Account(50000);// balance
		Account s = new Account(200000);

		System.out.println(t.balance);
		System.out.println(s.balance);

		Thread t1 = new Thread(t, "Royal");
		t1.start();
		t1.join();

		Thread t2 = new Thread(s, "Father");
		Thread t3 = new Thread(s, "Child");
		t2.start();
		t2.join();

		t3.start();
		t3.join();

		System.out.println(t.balance);// 45000
		System.out.println(s.balance);// 190000

	}

	public static void main(String[] args) throws InterruptedException {

		Account s = new Account(10000);
		Account t = new Account(50000);// balance

		Thread t1 = new Thread(s, "santa");
		Thread t2 = new Thread(s, "batna");
		Thread t3 = new Thread(s, "santa-banta");
		Thread t4 = new Thread(t,"abcd");

		t1.start();
		t2.start();
		t3.start();
		t4.start(); 
		
		Thread.sleep(160);

		System.out.println(s.balance);

	}

}

class Account implements Runnable {

	int balance;// object level
	static int bCode; // class level

	public Account(int initBalance) {
		this.balance = initBalance;
	}

	synchronized void wid(int amt) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " start wid.....");
		Thread.sleep(50);
	
//	bCode = bCode + 10;	
		if (balance - amt >= 0) {
			balance = balance - amt;
		} else {
			System.out.println(Thread.currentThread().getName() + " insuficient Balance....");
		}
		System.out.println(Thread.currentThread().getName() + " end wid.....");
	}

//	void wid(int amt) throws InterruptedException {
//		System.out.println(Thread.currentThread().getName() + " start wid.....");
//		Thread.sleep(50);
//		synchronized (this) {
//			if (balance - amt >= 0) {
//				balance = balance - amt;
//			} else {
//				System.out.println(Thread.currentThread().getName() + " insuficient Balance....");
//			}
//		}
//		System.out.println(Thread.currentThread().getName() + " end wid.....");
//	}

	public void run() {
		try {
			wid(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
