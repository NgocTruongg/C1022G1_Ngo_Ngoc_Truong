package Ss3_Loop.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = Integer.parseInt(sc.nextLine());
        int [][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                System.out.println("Enter the number the index [" + i + "] [" + k + "] of the array");
                array[i][k] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("The array just entered is: ");
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int sum = 0;
        for (int i = 0; i <length; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum the array diagonals is : " + sum);
    }
}
