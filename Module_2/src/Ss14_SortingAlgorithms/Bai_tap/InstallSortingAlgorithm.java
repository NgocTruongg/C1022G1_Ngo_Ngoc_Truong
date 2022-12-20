package Ss14_SortingAlgorithms.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InstallSortingAlgorithm {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];

            }
            array[k + 1] = currentElement;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập các phần tử trong mảng: " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
