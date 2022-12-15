package Ss11_DSA_Stack_Queue.Bai_tap.PalindromeUsingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindeomQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> stringQueue = new LinkedList<>();
        Stack<String> stringStack = new Stack<>();
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        String strLowCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(strLowCase.charAt(i) + "");
            stringQueue.offer(strLowCase.charAt(i) + "");

        }
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            String stackChar = stringStack.pop();
            String queuehar = stringQueue.poll();
            if (!stackChar.equals(queuehar)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Chuỗi nhập là chuỗi palindrome");
        } else {
            System.out.println("chuỗi nhập không là chuỗi palindrome");
        }
    }
}
