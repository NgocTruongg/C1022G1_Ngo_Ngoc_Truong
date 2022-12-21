package Ss15_Exception.Thuc_hanh.NumberFormatException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value X: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter value Y: ");
        int y = Integer.parseInt(sc.nextLine());

        CalculationExample cal = new CalculationExample();
        cal.calculate(x, y);
    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng = " + a);
            System.out.println("Hiệu = " + b);
            System.out.println("Tích = " + c);
            System.out.println("Thương = " + d);
        } catch (NumberFormatException e) {
            System.out.println("Exception NumberFormatException: ");
        } catch (Exception e) {
            System.out.println("xảy ra ngoại lệ " + e.getMessage());
        } finally {
            System.out.println("---------Kết thúc chương trình----------");
        }


    }

}
