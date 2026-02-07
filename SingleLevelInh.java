public class SingleLevelInh{
    public static void main(String[] args) {
            SciCAL s = new SciCAL(); 
            s.add();
            s.sub();
            s.sin();
            s.sqrt();
    }
}


class BasicCAL{
    void add(){

    }
    void sub(){

    }
}
class SciCAL extends  BasicCAL{
    void sin(){

    }
    void sqrt(){

    }
}

