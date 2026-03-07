
import java.util.Scanner;

public class TwoDimArray {

    public static void main(String[] args) {


        

        int x[][];

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Rows ? ");
        int rows = scr.nextInt();

        System.out.println("Enter Cols?");
        int cols = scr.nextInt();

        x = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value : ");
                x[i][j] = scr.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(x[i][j] + " ");//00 01 02
                //                              10 11 12 
                //                              20 21 22 
            }
            System.out.println("");
        }


        int arr[][] = { {11,22,33} , {23,44,55} , {4,5,6}};

        System.out.println("Enter Value Search ? ");

        int search = scr.nextInt(); 

        boolean found = false; 

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if( arr[i][j] == search){
                    found = true; 
                }
            }
        }

        if(found == true){
            System.out.println("Element Present");
        }else{
            System.out.println("Element Not Found");
        }


        // find max 
        // find min 
        // find sum 
        

    }
}
