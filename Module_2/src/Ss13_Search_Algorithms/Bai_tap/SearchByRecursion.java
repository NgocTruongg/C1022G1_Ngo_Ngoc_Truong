package Ss13_Search_Algorithms.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SearchByRecursion {
    public static int biranySearch (int [] arr, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (value == arr[middle]) {
                return middle;
            } else if (arr[middle] > value) {
                return biranySearch(arr, left, middle - 1, value);
            } else {
                return biranySearch(arr, middle + 1, right, value);
            }
        }
        return -1;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int array[] = new int[length];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Nhập phần tử trong mảng: " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Nhập giá trị cần tìm: ");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("Số cần tìm ở vị trí: " + biranySearch(array, 0, length-1, value));
    }
}
