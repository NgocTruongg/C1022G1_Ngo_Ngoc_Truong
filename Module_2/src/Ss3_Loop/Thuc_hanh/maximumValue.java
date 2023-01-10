package Ss3_Loop.Thuc_hanh;

import java.util.Scanner;

public class maximumValue {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size should not exceed 20: ");
            }
        }
        while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element: " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Propety list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.print(max);

    }
}