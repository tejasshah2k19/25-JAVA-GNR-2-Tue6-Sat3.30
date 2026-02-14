
public class MultipleInhDemo {

    public static void main(String[] args) {

    }

}

// -------------------------------------------------------
// create interface Employee with calculateSalary() 
// Employee having Child PartTimeEmpl and FullTimeEmpl 
// PartTimeEmpl having method for calculateTDS() 
// FullTimeEmpl having method for calculateTax() 
// both PartTimeEmpl and FullTimeEmpl are interface. 
// now create JrEmpl Class who's parent is FullTimeEmpl 
// now create MgmtEmpl class who's parent are FullTimeEmpl and PartTimeEmpl. 
// -------------------------------------------------------
interface Employee {

    void calculateSalary();
}

interface PartTimeEmpl extends Employee {

    void calculateTDS();
}

interface FullTimeEmpl extends Employee {

    void calculateTax();

}

class JrEmpl implements FullTimeEmpl {

    public void calculateTax() {

    }

    public void calculateSalary() {

    }
}
class MgmtEmpl  implements  FullTimeEmpl , PartTimeEmpl{
    public void calculateTax(){

    }
    public void calculateTDS(){

    }

    public void calculateSalary(){

    }
}