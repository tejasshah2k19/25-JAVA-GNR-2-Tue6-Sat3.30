
class Calc {

    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("addition = " + c);

    }

    void sub() {
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println("Sub = " + c);
    }

    void mul() {
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("mul = " + c);

    }

    public static void main(String[] args) {
        //object 
        Calc obj = new Calc(); 
        obj.add();
        obj.sub();
        obj.mul();
        
    }
}

 
