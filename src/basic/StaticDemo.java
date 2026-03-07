
public class StaticDemo {
    public static void main(String[] args) {
      
                //branchCode : 840--> 

        //create two object call both method and at last print balance and branchCode 
                
        RoyalBank.branchCode = 420;
        RoyalBank.myStaticMethod(); 
    }
}

//StaticDemo.main(null); 

class RoyalBank{

    int balance; //instance variable 
    static int branchCode; //static - class - single 


    //non static 
    void deposit(int amt){
        balance = balance + amt; //balance -> non static 
    }

    //non static 
    void moidfyBranchCode(int bCode){
        branchCode = bCode;//branchCode -> static  
    }

    //class 
    static void myStaticMethod(){
        System.out.println("hi");
        System.out.println(branchCode);//static property 
        // System.out.println(balance);//i will not allow non static property 
    }

}

//Bank          : balance , branchCode 
//SchoolClass   : rollNum , division 
//GJ 09         : GJ/8756698221 
//022 
//079 
//079123 
//022123 
//+912123
//+91-9638527412
