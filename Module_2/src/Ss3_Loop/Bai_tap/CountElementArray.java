package Ss3_Loop.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CountElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the char: ");
        char character = sc.nextLine().charAt(0);
        char [] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == character) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("number of occurrences of a character in a string: " + count);
    }
}
