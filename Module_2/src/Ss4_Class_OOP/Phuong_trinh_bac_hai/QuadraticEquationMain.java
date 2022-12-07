package Ss4_Class_OOP.Phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b: ");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập c: ");
        double c = Integer.parseInt(sc.nextLine());
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation2.getDiscriminant();
        System.out.println("Delta : x = " + delta);
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm: ");
        } else if (delta == 0) {
            System.out.print("Phương trình có nghiệm kép x1 = x2 = " + quadraticEquation2.getRoot1());
        } else {
            System.out.print("Nghiệm x1 = " + quadraticEquation2.getRoot1());
            System.out.print("Nghiệm x2 = " + quadraticEquation2.getRoot2());
        }
    }
}