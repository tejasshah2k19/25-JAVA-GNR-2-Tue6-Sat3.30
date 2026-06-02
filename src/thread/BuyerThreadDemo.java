package thread;

public class BuyerThreadDemo {

	public static void main(String[] args) {
		Buyer b = new Buyer(4500);

		Thread santa = new Thread(b, "santa");
		Thread banta = new Thread(b, "banta");

		santa.start();
		banta.start();

	}
}

class Buyer extends Thread {

	int amt;

	Buyer(int amt) {
		this.amt = amt;
	}

	public void run() {
		wid(1000);
	}

	private void wid(int widAmt) {

		for (int i = 1; i <= 5; i++) {
			if (this.amt - widAmt >= 0) {
				this.amt -= widAmt;
				System.out.println(widAmt + " successfully deducted for " + Thread.currentThread().getName());
			} else {
				System.out.println(
						widAmt + " deduction fail due to insufficient amount for " + Thread.currentThread().getName());
			}
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("final balance for => " + Thread.currentThread().getName() + " => " + this.amt);
	}

}
