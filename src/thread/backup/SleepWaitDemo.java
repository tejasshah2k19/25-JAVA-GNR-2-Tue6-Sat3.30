package thread.backup;

public class SleepWaitDemo {

	public  static void main(String[] args) throws Exception {

		ThreadSum t = new ThreadSum();
		t.start(); //
//		t.join();//t -> main 
//		Thread.sleep(1000);//main thread sleep 1000 ms 
		//lock 
		synchronized(t) {
			t.wait();//main thread will wait
		}
		System.out.println("main sum => " + t.sum);
		//jvm -> main 
	}
}

//main -> print sum  
//t -> finish 
class ThreadSum extends Thread {

	int sum = 0;

	public void run() {
		findSum();
	}

	void findSum() {
		for (int i = 1; i <= 50; i++) {
			sum = sum + i;
		}
		System.out.println("find sum => " + sum);
		//
	}
}
