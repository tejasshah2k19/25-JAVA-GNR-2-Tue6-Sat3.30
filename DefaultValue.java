
class DefaultValue {

    public static void main(String[] args) {
        Mobile m = new Mobile();//object 
        m.display();//call display 

        Mobile v = new Mobile();
        v.display();

        Mobile x = new Mobile();
        x.display();

        Mobile s = new Mobile('S',1000,26000);
        s.display();

    }
}

class Mobile {

    short uniqueId; //0 
    char brandName='A';//null char 
    float price; //0.0
    int discount; //0
    double actualPrice;//0.0
    boolean isDual;  // false

    //no argument constructor 
    //default constructor 
    Mobile() {
        discount = 500;//
    }

    Mobile(char bName, int disc, float price) {
        brandName = bName;
        discount = disc;
        this.price = price;
    }

    void getData() {
        //input 
    }

    void display() {
        System.out.println("**************************");
        System.out.println("uniqueId : " + uniqueId);//0
        System.out.println("brandName : " + brandName);//null char
        System.out.println("Price : " + price);//0.0 
        System.out.println("discount : " + discount);
        System.out.println("actualPrice : " + actualPrice);
        System.out.println("isDual : " + isDual);
    }

}
