package Ss14_SortingAlgorithms.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationInsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử trong mảng: " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
