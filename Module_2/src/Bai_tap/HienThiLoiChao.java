package Bai_tap;


import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        name = scanner.nextLine();
        System.out.println("Hello" + name);
    }
}
