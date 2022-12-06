package Ss3_Loop.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the col: ");
        int col = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.println("Enter the number index [" + i + "] [" + k + "]" + "in the array");
                arr[i][k] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Enter array just entered í: ");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("sum the elements of which column?");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
             sum += arr[i][num];
        }
        System.out.println("sum of the elements of " + num + "column is: " + sum );
    }
}
