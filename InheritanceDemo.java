
class InheritanceDemo {

    public static void main(String[] args) {
        // BasicCalc b = new BasicCalc(); 
        // b.add();;
        // b.sub();
        // b.mul();
        // b.div();

        SciCalc s = new SciCalc();
        s.sin();
        s.sqrt();
        s.cube();

        s.add();
        s.sub();
        s.mul();
        s.div();

    }
}

class BasicCalc {

    void add() {
        System.out.println("BasicCalc::add()");
    }

    void sub() {
        System.out.println("BasicCalc::sub()");
    }

    void mul() {
        System.out.println("BasicCalc::mul()");
    }

    void div() {
        System.out.println("BasicCalc::div()");
    }
}

class SciCalc extends BasicCalc {

    void sin() {

        System.out.println("SciCalc::sin()");
    }

    void sqrt() {
        System.out.println("SciCalc::sqrt()");
    }

    void cube() {
        System.out.println("SciCalc::cube()");
    }

}
