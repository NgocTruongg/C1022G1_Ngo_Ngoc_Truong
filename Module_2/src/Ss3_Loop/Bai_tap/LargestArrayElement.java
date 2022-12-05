package Ss3_Loop.Bai_tap;

import java.util.Scanner;

public class LargestArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of the array:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the col of the array:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Input number the index[" + i + "][" + j + "] of the array");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int indexRow = 0;
        int indexCol = 0;
        double max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("The largest element in the two-dimensional array is :" + max);
        System.out.println("Index row is: " + indexRow);
        System.out.println("Index col is: " + indexCol);
    }
}
