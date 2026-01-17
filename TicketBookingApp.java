
public class TicketBookingApp {

    public static void main(String rargs[]) {
            Tickets tickets = new Tickets(); //constructor => 
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

}
