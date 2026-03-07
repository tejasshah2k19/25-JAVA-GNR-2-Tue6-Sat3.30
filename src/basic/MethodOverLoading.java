package basic;

public class MethodOverLoading {

	
	static void add(long x) {
		
	}
	
	static void sub(P x) {
		
	}
	public static void main(String[] args) {
		
		int x = 10; 
		long y = 20; 
		add(x);
		add(y);
	
		
		P p1 = new P();
		H h1= new H();
		
		sub(p1);
		sub(h1);
	}
}


class P{
	
}

class H extends P{
	
}


