package thread.backup;

public class RunnableDemo {

	public static void main(String[] args) {
		PrintCity p = new PrintCity();
		PrintArea pa = new PrintArea(); 
		
		Thread t = new Thread(p);
		Thread t2 = new Thread(pa);
		
		t.start();
		t2.start();
		
		
	}
}

//step 1: implements Runnable interface
//step 2: public void run() -> logic 
//step 3: Thread(printCity) -> start 
class PrintCity implements Runnable {
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("GNR " + i);
		}
	}

	public void run() {
		print();
	}
}

class PrintArea implements Runnable {
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sargasan " + i);
		}
	}

	public void run() {
		print();
	}

}