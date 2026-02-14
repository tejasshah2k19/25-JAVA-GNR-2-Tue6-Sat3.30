
public class AbstractDemo {

    public static void main(String[] args) {
        // RBI r  = new RBI(); // we can not create instance of abstract class 

    }
}

abstract class RBI {

    abstract void wid();//abstract -- only declaration 

    abstract void dep();

    abstract void checkBal();

    abstract  void fd();
    void roi() {
        //logic 
    }
}

class HDFC extends RBI {

    void wid() {
    }

    void dep() {
    }

    void checkBal() {
    }

    void fd(){
        
    }

}
