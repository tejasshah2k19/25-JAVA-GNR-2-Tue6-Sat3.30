
import java.util.Scanner;

class ScannerPract {

    //findSqr() 
    //findMax()
    //findGrade()
    
    public static void main(String[] args) {

        //input -> square 
        int num;
        int ans;
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a Number");
        num = scr.nextInt();

        ans = num * num;

        System.out.println("Square => " + ans);

        //take two numbers from user and find out max from it 
        //take marks of three subjects , find percentage and print grade based on percentage 
        //90+ A grade 
        //70+ B Grade 
        //35+ C Grade 
        //<35 F Grade 
    }
}
