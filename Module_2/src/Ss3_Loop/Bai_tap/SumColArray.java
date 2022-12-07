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
        int column;
        do {
            System.out.println("Enter the column position you want : ");
            column = Integer.parseInt(sc.nextLine());
        } while (column < 0 || column > col - 1);
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
             sum += arr[i][column];
        }
        System.out.println("sum of the elements of " + column + "column is: " + sum );
    }
}
