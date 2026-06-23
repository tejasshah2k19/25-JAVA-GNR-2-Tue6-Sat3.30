package innerclass;

public class InnerClassTH {

	public static void main(String[] args) {
		//anno 
		AThread a = new AThread();
		Thread t1 = new Thread(a);
		t1.start();
		
		
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("run::anno()");
			}
		};
	
		Thread t2 = new Thread(r);
		t2.start();

		
		//
		//
		
	}
	
}


//thread 
class AThread implements Runnable{
	@Override
	public void run() {
		//logic 
		System.out.println("run()");
	}
}



//
class A{
	//variable
	//methods 
	//i can not access 
	class B{ // inner class 
		//non static 
		//static 
		//i can see outer class 
	}
	
	void makeInner() {
		class C{ // method local inner class 
			
		}
		//
	}


	//nested class 
	static class D{
		//static 
	}

}