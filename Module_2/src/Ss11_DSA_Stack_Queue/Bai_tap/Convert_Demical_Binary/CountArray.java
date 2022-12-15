package Ss11_DSA_Stack_Queue.Bai_tap.Convert_Demical_Binary;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CountArray {
    public static void main(String[] args) {

        Stack<Integer> stackArray = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử của mảng: " + i);
            int elment = sc.nextInt();
            stackArray.push(elment);
        }
        System.out.println("Mảng nhập vào là: " + stackArray);
        int arr[] = new int[stackArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackArray.pop();
        }
        System.out.println("Mảng đảo ngược là: "+ Arrays.toString(arr));
    }
}
