package string;

public class StringPract1 {

	String arr[] ; //array String 
	//constructor
	StringPract1(String str[]){
			arr = str; 
	}
	
	void printTotalCharacter() {
		int total =0; 
		
		for(int i=0;i<arr.length;i++) {
			total = total + arr[i].length(); //0:4
		}
		System.out.println("Total char => "+total);
	}
	
	public static void main(String[] args) {
		
//		String str[ ] = {"java","spring","boot"};//14 
//		StringPract1 obj = new StringPract1(str);	
//		obj.printTotalCharacter(); 

		
		String str[ ] = {"java","spring","boot","rest","api"};//21 
		StringPract1 obj = new StringPract1(str);	
		obj.printTotalCharacter(); 
		
		
	}
}
