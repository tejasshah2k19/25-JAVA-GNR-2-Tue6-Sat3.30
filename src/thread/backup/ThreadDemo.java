package thread.backup;

public class ThreadDemo {

	public static void main(String[] args) {
		PrintName p = new PrintName();
		PrintBranchName pn = new PrintBranchName();

		p.start();//parent Thread class 
		pn.start(); 

	}
}

//step 1: class extends  Thread
//step 2: logic - run() 
//step 3: thread object -> start() 

class PrintName extends Thread {
	void print() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("Royal " + i);
		}
	}

	public void run() {
		print();
	}
}

class PrintBranchName extends Thread{
	void print() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("GNR " + i);
		}
	}
	
	public void run() {
		print();
	}
}
