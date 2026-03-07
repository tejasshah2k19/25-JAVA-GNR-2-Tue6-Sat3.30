package basic;

import java.util.Scanner;

public class InhBasic {

    public static void main(String[] args) {

        TempEmp t = new TempEmp();
        t.getData();
        t.printData();
        t.tax(); //child -> TempEmp 
    }
}

class Emp {

    String name;
    int salary;
    void tax(){
        System.out.println("Emp::tax()");
    }
}

class TempEmp extends Emp {

    int salary;

    void getData() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter name ");
        name = scr.next();
        System.out.println("Enter Salary : Child-TempEmp ");
        salary = scr.nextInt(); //child -> TempEmp  
        System.out.println("Enter Salary : Parent-Emp ");
        super.salary = scr.nextInt();//parent's salary  

    }

    void printData() {
        System.out.println(name);
        System.out.println(this.salary + super.salary);
        //this -> current object 
        //super => parent       
    }

    void tax(){
        //call parent's tax 
        super.tax(); 
        System.out.println("TmempEmp::tax()");
    }
}

//super keyword is used to access parent's property ( variable , method )

