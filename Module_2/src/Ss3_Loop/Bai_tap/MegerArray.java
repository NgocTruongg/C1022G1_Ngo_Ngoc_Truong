package Ss3_Loop.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1 [];
        int arr2 [];
        System.out.print("Nhập độ dài mảng thứ nhất: ");
        int length1 = sc.nextInt();
        arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Nhập độ dài mảng thứ hai:");
        int length2 = sc.nextInt();
        arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.print("Nhập phần tử thứ " + i + " :");
            arr2[i] = sc.nextInt();
        }
        arr1 = Arrays.copyOf(arr1,arr1.length+arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr1[i + length1] = arr2[i];
        }
        for (int i : arr1) {
            System.out.print(i + ", ");
        }
    }
}
