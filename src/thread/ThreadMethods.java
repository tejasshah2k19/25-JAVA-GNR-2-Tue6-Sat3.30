package thread;

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {

		Customer c = new Customer();
		System.out.println("balance => " + c.balance);// 50000
		c.start();//
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("balance => " + c.balance);// 45000
 
		
	}
}

class Customer extends Thread {

	int balance = 50000;

	public void run() {
		wid(5000);
	}

	public void wid(int amt) {
		System.out.println("Wid Started....");
		balance = balance - amt;
		System.out.println("Wid End.....");
	}

}
