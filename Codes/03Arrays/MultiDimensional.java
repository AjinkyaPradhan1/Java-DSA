import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        /*
         [1,2,3
          4,5,6
          7,8,9]
         */

//    int[][] arr = new int[3][];
    int[][] arr={
               {1,2,3},    //0th index
               {4,5},      //1st index
               {6,7,8,9}   //2nd index -> arr[2] = [6,7,8,9]
               };

    for (int row=0; row <arr.length; row++){
        for (int col=0 ; col < arr[row].length; col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    }

    // int[][] arr = new int[3][3];
    // System.out.println(arr.length);    //no of rows will be displayed

    // //input
    // for (int row=0; row < arr.length; row++){
    //     //for each row of every column
    //     for (int col=0; col < arr[row].length; col++){
    //         arr[row][col] = in.nextInt();
    //     }
    // }

    //output
    // for (int row=0; row < arr.length; row++){
    //     //for each row of every column
    //     for (int col=0; col < arr[row].length; col++){
    //         System.out.print(arr[row][col]+" ");
    //     }
    //     System.out.println();
    // }

    // //output
    // for (int row=0; row<arr.length; row++){
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    //output
    // for(int[] a: arr){
    //     System.out.println(Arrays.toString(a));
    // }

     }
     }
