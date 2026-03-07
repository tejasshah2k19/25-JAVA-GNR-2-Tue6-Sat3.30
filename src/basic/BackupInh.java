
public class BackupInh {

    public static void main(String[] args) {

        BasicC b = new BasicC();
        b.add();
        b.sub();

        SciC s = new SciC();
        s.sqr();

        s.add();
        s.sub();

    }
}

class BasicC {

    void add() {
        System.out.println("Addition ");
    }

    void sub() {
        System.out.println("Subtraction ");
    }
}

class SciC extends  BasicC{

    void sqr() {
        System.out.println("SQR");
    }
}
