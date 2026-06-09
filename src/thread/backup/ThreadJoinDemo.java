package thread.backup;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		PrintName2 pn = new PrintName2();
		PrintBranchName2  pb  = new PrintBranchName2(); 
		
		pn.start();
		pn.join();//
		pb.start(); 
		
		
	}
}



class PrintName2 extends Thread {
	void print() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("Royal " + i);
			//stop() 
		}
	}

	public void run() {
		print();
	}
}

class PrintBranchName2 extends Thread{
	void print() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("GNR " + i);
		}
	}
	
	public void run() {
		print();
	}
}
