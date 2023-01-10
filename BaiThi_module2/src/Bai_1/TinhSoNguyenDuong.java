package Bai_1;

import java.util.Scanner;

public class TinhSoNguyenDuong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        if (number < 5000) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
            }

        } else {
            System.out.println("Nhập số nhỏ hơn 5000!");
        }
        return sum;
    }
}
