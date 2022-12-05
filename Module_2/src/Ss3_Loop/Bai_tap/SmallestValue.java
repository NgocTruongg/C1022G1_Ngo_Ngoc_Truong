package Ss3_Loop.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị của mảng: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
