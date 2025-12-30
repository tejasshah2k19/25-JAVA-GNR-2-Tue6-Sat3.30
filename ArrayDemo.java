
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        int a[];

        int c[] = {1, 2, 3, 4, 5};

        int b[] = new int[5];

        Scanner scr = new Scanner(System.in);

        //length 
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter value");
            b[i] = scr.nextInt();
        }

        System.out.println("All data from Array => ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // System.out.println(b[11]);

    }
}
