package thread.backup;

public class ThreadMethods {

	public static void main(String[] args) {

		// Thread State
		// Life cycle

//		Thread.State.NEW
//		Thread.State.RUNNABLE
//		Thread.State.WAITING
//		Thread.State.BLOCKED
//		Thread.State.TIMED_WAITING
//		Thread.State.TERMINATED

		//start()
		//yield()
		//wait()
		//sleep(ms)
		//wait(ms)
		//notify()
		//notifyAll()
		//stop()
		
		
		MyThread th = new MyThread(); //NEW 
		th.setName("paymentThread");
		th.setPriority(Thread.MAX_PRIORITY);//10 
		th.start();
	
	
	}
}


class MyThread extends Thread{
	public void run() {
		System.out.println("run( ) "+currentThread().getName());
		System.out.println(currentThread().getPriority());//NORM : 5 
	}
}




