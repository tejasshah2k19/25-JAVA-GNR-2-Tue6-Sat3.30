package thread;

public class ThreadDemoAgain {

	public static void main(String[] args) {

		Song s = new Song();
		s.start();//Thread class 
		Movie m = new Movie();
		m.start(); //Thread class 
		
		
	}
}

//1) extends Thread 
//2) override run()
//3) invoke run using start( ) 

class Song extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("song " + i);
		}
	}
}

class Movie extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Movie : " + i);
		}
	}
}
