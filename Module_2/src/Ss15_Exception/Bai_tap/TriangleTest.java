package Ss15_Exception.Bai_tap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number edges A: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the number edges B: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the number edges C: ");
        double c = Double.parseDouble(scanner.nextLine());
        TriangleEdgesCheck triangleEdgesCheck = new TriangleEdgesCheck();
        triangleEdgesCheck.checkTriangleEdgesCheck(a, b, c);
    }
}
