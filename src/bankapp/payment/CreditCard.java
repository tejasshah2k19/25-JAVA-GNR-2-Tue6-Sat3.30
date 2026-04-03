package bankapp.payment;

import bankapp.customer.CustomerAccount;

public class CreditCard {

	
	public static void main(String[] args) {
		
		CustomerAccount c = new CustomerAccount();
		c.myAccount();
//		c.add();//default method can only access within the package 
//		c.mul();//protected can access outside package if inheritance - family 
//		c.sub();//private method can only access within the class 
		
		UPI u = new UPI();
		u.myAccount();
		u.payment();
	
	}
}
class UPI extends CustomerAccount{
	void payment() {
		mul();//protected method 
	}
}
//lang
//import java.lang.*;
//io
//applet 
//util 
//net 
//sql 
