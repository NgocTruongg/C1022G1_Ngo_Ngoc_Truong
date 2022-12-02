package Bai_tap;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD:");
        usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.println(usd + " USD");
        System.out.println("SỐ tiền chuyển từ usd sang vnđ là: " + vnd + "VNĐ");
    }
}
