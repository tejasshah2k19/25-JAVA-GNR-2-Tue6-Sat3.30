
public class InterfaceDemo {

    public static void main(String[] args) {
        System.out.println(Book.TOTAL_PAGES);
    }
}

interface Book {

    public static final int BOOK_PRICE = 250;
    final int TOTAL_PAGES = 100; 
    void print();

    public abstract void authorList();
}


class ANSIC implements  Book{

    //override 
    public void print(){
     }

    //overloading 
    public void print(int a){

    }

   public void authorList(){

    }
}