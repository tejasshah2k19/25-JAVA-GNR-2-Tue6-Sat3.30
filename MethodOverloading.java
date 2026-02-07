
public class MethodOverloading {

    void add() {
        System.out.println("add()");
    }

    void add(int a) {
        System.out.println("add(int)");
    }

    int add(float x) {
        System.out.println("add(float)");
        return 0;
    }

    int add(double x) {
        System.out.println("add(double)");
        return 0;
    }

    // void add(short b1, short b2) {
    //     System.out.println("add(short,short)");
    // }
    void add(byte a, byte b) {
        System.out.println("add(byte,byte)");
    }

    void add(int a, int b) {
        System.out.println("add(int,int)");
    }

    void add(long a, long b) {
        System.out.println("add(long,long)");
    }

    void add(float a, float b) {
        System.out.println("add(float,float)");
    }

    void add(double a, double b) {
        System.out.println("add(double,double)");
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();

        // m.add();
        // m.add(12, 23);
        // m.add(2.5f);
        Byte b1 = 1;
        Byte b2 = 2;
        m.add(b1, b2);
    }
}
