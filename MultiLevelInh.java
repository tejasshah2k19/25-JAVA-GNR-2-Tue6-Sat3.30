
class MultiLevelInh {

    public static void main(String[] args) {
        // RBI r = new RBI();
        // r.roi();

        // SBI s = new SBI();
        // s.wid();
        // s.roi();
        // SBILife sl = new SBILife();
        // sl.insurance();
        // sl.wid();
        // sl.roi();
        // SBILife s = new SBILife(); 
        // s.insurance();
        SBI s = new SBI();
        s.wid();
    }
}

//multilevel inheritance 
class RBI {

    protected void roi() {
        System.out.println("RBI : ROI 10% ");
    }

    void penalInt() {
        System.out.println("RBI : Panel Interest");
    }
}

class SBI extends RBI {

    //default void wid
    void wid() {
        super.roi();//super keyword is used to access parent's property 
        System.out.println("SBI : WID ");
    }

    //method overriding 
    public void roi() {
        System.out.println("SBI : ROI 12% ");
    }
}

class SBILife extends SBI {

    void insurance() {
        roi();
        penalInt();
        System.out.println("SBILIFE : insurance");
    }
}

//access modifier 
//private default protected public 
