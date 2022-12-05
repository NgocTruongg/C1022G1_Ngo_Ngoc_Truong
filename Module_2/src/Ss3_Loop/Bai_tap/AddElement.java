package Ss3_Loop.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int [] arr ;
        System.out.print("Nhập độ dài mảng:");
        String n = sc.nextLine();
        arr = new int[Integer.parseInt(n)];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ :" + i + " ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập số bạn muốn thêm vào:");
        int find = sc.nextInt();
        System.out.print("Nhập vị trí bạn muốn: ");
        int index = sc.nextInt();
        arr = Arrays.copyOf(arr, arr.length+1);
        for (int i = arr.length -1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = find;
        for (int array : arr) {
            System.out.print(array + ", ");
        }
    }
}