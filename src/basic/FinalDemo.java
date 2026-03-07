package basic;

public class FinalDemo {

    public static void main(String[] args) {
        System.out.println(Santa.taxRate);
    }
}

final class OmShanti {

}

//below will gives error , final class can not inherit 
// class Shanti extends  OmShanti{
// }
//String class 
class Santa {

   final static int taxRate = 10; //constant variable -- value fix -- no modification allow -- and you must have to assign value 
    final int taxRebage; 

    Santa(){
        taxRebage = 12; 
    }
    final void business() {
         
    }

    void taxCalc() {

    }
}

class Banta extends Santa {

    //final method can not override 
    // void business() {
    //     //overriding    
    // }

    void  taxCalc(){
        // taxRate = 20;
    }

}
