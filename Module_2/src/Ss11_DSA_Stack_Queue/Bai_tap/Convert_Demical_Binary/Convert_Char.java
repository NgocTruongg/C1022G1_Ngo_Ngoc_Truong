package Ss11_DSA_Stack_Queue.Bai_tap.Convert_Demical_Binary;

import java.util.Scanner;
import java.util.Stack;

public class Convert_Char {
    public static void main(String[] args) {
        Stack<String> wstack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp vào chuỗi muốn đảo ngược: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            wstack.push(s.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược là: ");
        System.out.println(wstack);
        String outp = new String("");
        for (int i = 0; i < s.length(); i++) {
            outp += wstack.pop();
            outp += "";
        }
        System.out.println(outp);
    }
}
