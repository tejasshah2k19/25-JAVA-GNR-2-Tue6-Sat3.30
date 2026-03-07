
import java.util.Scanner;


public class StringDemo {

    public static void main(String[] args) {

        String s1 = "royal";
        String s3 = "royal";
        String s2 = new String("royal");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //String class -> methods / variables
        //total number of characters in a string ? 
        //length()
        System.out.println(s1.length());//5 

        //convert your string data to uppercase 
        System.out.println(s1.toUpperCase());

        System.out.println(s1); // immutable 
        //convert string to lowercase
        System.out.println(s1.toLowerCase());

        String s4 = "Royal"; //s1 s3 s4 

        System.out.println(s1.equals(s3));//s1 -- s3 : boolean 
        System.out.println(s1.equals(s2));//s1 -- s2 : boolean 

        System.out.println(s1.equals(s4));// flase 


        Scanner scr = new Scanner(System.in);
        System.out.println("Enter email and password");
        String email = scr.next(); 
        String password = scr.next();
        
        if(email.toLowerCase().equals("admin@gmail.com") && password.equals("secret")){
            System.out.println("VALID ");
        }else{
            System.out.println("INVALID");
        }

    }
}
/*

                                        string pool constant 
    s1  ----------------------------------> royal 
    s3 
    s2  ----------------------------------> royal

 */
