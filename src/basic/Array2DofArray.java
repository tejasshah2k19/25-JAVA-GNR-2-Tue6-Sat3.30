
import java.util.Scanner;

public class Array2DofArray {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int x[][] = new int[3][3];

        int y[][] = new int[3][];

        y[0] = new int[3]; //0th row 3 cols
        y[1] = new int[4]; //1st row 4 cols 
        y[2] = new int[2]; //2nd row 2 cols 

        System.out.println(y[0].length);//3 
        System.out.println(y[1].length);//4 
        System.out.println(y[2].length);//2 

        System.out.println(y.length);//total rows 

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < y[i].length; j++) {
                //00 01 02 
                //10 11 12 13 
                //20 21   
                System.out.println("Enter value");
                y[i][j] = scr.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < y[i].length; j++) {

                System.out.print(y[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
