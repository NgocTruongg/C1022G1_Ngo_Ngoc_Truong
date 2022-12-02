package introduction_thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm: ");
        year = scanner.nextInt();

        boolean LeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    LeapYear = true;
                }
            } else {
                LeapYear = true;
            }
        }
        if (LeapYear) {
            System.out.printf("%d năm nhuận", year);
        } else {
            System.out.printf("%d năm không nhuận", year);
        }
    }
}