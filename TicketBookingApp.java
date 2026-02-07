
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
                    boolean isValid = false;
                    if (c.mobileNum.equals("-1")) {
                        //new 
                        c.mobileNum = tmp;
                        isValid = true;

                    } else if (c.mobileNum.equals(tmp)) {
                        //login success 
                        isValid = true;
                    }

                    if (isValid == false) {
                        System.out.println("Invalid Credentials.....");
                    } else {
                        //after login menu - sub menu 

                        System.out.println("\nWelcome.....");
                        subMenu:
                        while (true) {
                            System.out.println("1. Buy Tickets\n2. My Tickets\n3. Logout ");
                            int subChoice = scr.nextInt();

                            switch (subChoice) {
                                case 1:
                                    System.out.println("How many Gold Tickets You Want to Buy ? ");
                                    int gold = scr.nextInt();
                                    c.totalGoldTicket = c.totalGoldTicket + gold;

                                    System.out.println("How many Silver Tickets You Want to Buy ? ");
                                    int silver = scr.nextInt();
                                    c.totalSilverTicket += silver;

                                    System.out.println("How many Diamond Tickets You Want to Buy ? ");
                                    int diamond = scr.nextInt();
                                    c.totalDiamondTicket += diamond;

                                    break;
                                case 2:
                                    System.out.println("Diamond : " + c.totalDiamondTicket);
                                    System.out.println("Gold : " + c.totalGoldTicket);
                                    System.out.println("Silver : " + c.totalSilverTicket);
                                    break;
                                case 3:
                                    System.out.println("Thank you for using our service :) ");
                                    break subMenu;

                                default:
                                    throw new AssertionError();
                            }//sub menu - after login 
                        }//while - after login menu 
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
