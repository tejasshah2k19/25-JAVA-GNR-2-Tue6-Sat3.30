
import java.util.Scanner;


public class TicketBookingApp {

    public static void main(String rargs[]) {
        Tickets tickets = new Tickets(); //constructor => 
        Customer c = new Customer();

        int choice;
        Scanner scr = new Scanner(System.in); 

        while (true) {
            System.out.println("1 For Login\n2 For Exit\nEnter choice");
            choice = scr.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter mobile num");
                    String tmp = scr.next(); //mobile 
                    
                    if(c.mobileNum.equals("-1")){
                        //new 
                        c.mobileNum = tmp;                         
                    }else{ 
                        //existing
                        if(c.mobileNum.equals(tmp)){
                            //login success 
                            //sub menu 
                            
                        }else{
                            System.out.println("Invalid Credentials....");
                        }
                    }                         
                    break;
                case 2:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input PTA");

            }//switch login main menu 
        }//while login main menu 

    }
}

class Tickets {

    int goldQty;
    int silverQty;
    int diamondQty;

    final int GOLD_PRICE;
    final int SILVER_PRICE;
    final int DIAMOND_PRICE;

    Tickets() {
        diamondQty = 20;
        goldQty = 30;
        silverQty = 50;

        SILVER_PRICE = 200;
        DIAMOND_PRICE = 500;
        GOLD_PRICE = 300;
    }

}

class Customer {

    int totalGoldTicket;
    int totalSilverTicket;
    int totalDiamondTicket;

    String mobileNum;//null 

    Customer() {
        totalDiamondTicket = 0;
        totalGoldTicket = 0;
        totalSilverTicket = 0;
        mobileNum = "-1";
    }
}
