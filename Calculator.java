
// import java.util.Date;
// import java.util.Scanner; 

import java.util.*;
 
//no
public class Calculator {

    int a;//instance variable
    int b;
    int ans;

    Scanner scr = new Scanner(System.in);//keyboard 

    void add() {

        //int abc; //local variable 
        System.out.println("Enter Two Numbers");
        a = scr.nextInt();
        b = scr.nextInt();

        ans = a + b;
        System.out.println("addition = " + ans);
    }

    void sub() {

        System.out.println("Enter Two Numbers");
        a = scr.nextInt();
        b = scr.nextInt();

        ans = a - b;
        System.out.println("subtraction = " + ans);
    }

    void mul() {

        System.out.println("Enter Two Numbers");
        a = scr.nextInt();
        b = scr.nextInt();

        ans = a * b;
        System.out.println("multiplication = " + ans);
    }

    void div() {

        System.out.println("Enter Two Numbers");
        a = scr.nextInt();
        b = scr.nextInt();
        ans = a / b;
        System.out.println("division = " + ans);
    }

    public static void main(String args[]) {

        Date date = new Date();

        Calculator calc = new Calculator();
        int choice; //local 
        Scanner scr = new Scanner(System.in);

        System.out.println("Current Date Time => "+date);

        while (true) {
            System.out.println("Press \n0 For Exit\n1 For Addition\n2 For Sub\n3 For Mul\n4 For div\nEnter your choice");
            choice = scr.nextInt();

            switch (choice) {
                case 2 - 2:
                    System.exit(0);
                case 1:
                    calc.add();
                    break;
                case 1 + 1:
                    calc.sub();
                    break;
                case 3 * 1:
                    calc.mul();
                    break;
                case 8 / 2:
                    calc.div();
                    break;

                default:
                    System.out.println("Invalid Choice PTA");
            }

        }
    }
}
