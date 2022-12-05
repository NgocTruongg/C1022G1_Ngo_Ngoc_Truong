package Ss3_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x;
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử bạn muốn xóa:");
        x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        for (int k = index; k < arr.length-1; k++) {
            arr[k] = arr[k+1];
        }
        arr[arr.length-1] = 0;
        for (int array : arr) {
            System.out.print(array + " ");
        }
    }
}
