package Ss11_DSA_Stack_Queue.Bai_tap.Convert_Decimal_To_Binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> decimalStack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số thập phân");
        int number = sc.nextInt();
        while (number > 0) {
            decimalStack.push(number % 2);
            number /= 2;
        }
        System.out.println("Kết quả chuyển đổi là: ");
        while (!decimalStack.isEmpty()) {
            System.out.print(decimalStack.pop() + " ");
        }
    }
}
